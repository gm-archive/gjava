package ij.plugin.filter;
import ij.*;
import ij.gui.*;
import ij.measure.*;
import ij.process.*;
import java.awt.*;
import java.util.*;

/** This ImageJ plug-in filter creates a mask where the local maxima of the
 * current image are marked (255; unmarked pixels 0).
 * The plug-in can also create watershed-segmented particles (assume a
 * landscape of inverted heights: maxima of the images are now water sinks.
 * For each point in the image, the sink that the water goes to determines which
 * particle it belongs to.
 * Pixels with a level below the lower threshold can be left unprocessed.
 *
 * This plugin works with ROIs, including non-rectangular ROIs.
 * Since this plug-in creates a separate output image it processes
 *    only single images or slices, no stacks.
 *
 * version 09-Nov-2006 Michael Schmid
 * version 21-Nov-2006 Wayne Rasband. Adds "Display Point Selection" option and "Count" output type.
 */


public class MaximumFinder implements PlugInFilter {
    //filter params
    /** maximum height difference between points that are not counted as separate maxima */
    private static double tolerance;
    /** what type of output to create (see constants below)*/
    private static int outputType;
    /** Output type single points */
    public final static int SINGLE_POINTS=0;
    /** Output type all points at exactly the level of the maximum */
    public final static int MAXIMA_EXACT=1;
    /** Output type all points around the maximum within the tolerance */
    public final static int IN_TOLERANCE=2;
    /** Output type watershed-segmented image */
    public final static int SEGMENTED=3;
    /** Do not create an image, just count maxima and add count to Results table*/
    public final static int COUNT=4;
    /** Do not create image and do not write to Results table*/
    public final static int NONE=5;
    /** output type names */
    final static String[] outputTypeNames = new String[] {"Single Points", "Maxima (Exact)", "Maxima Within Tolerance", "Segmented Particles", "Count", "None"};
    /** whether to exclude mxima at the edge of the image*/
    private static boolean excludeOnEdges;
    /** whether to accept maxima only in the thresholded height range*/
    private static boolean useMinThreshold;
    /** Display point selection? */
    private static boolean displayPoints;
    /** Does image have a light background? */
    private static boolean lightBackground;
    /** the ImagePlus of the setup call */
    private ImagePlus imp;
    /** the following constants are used to set bits corresponding to pixel types */
    final static byte MAXIMUM = (byte)1;               //marks local maxima (irrespective of noise tolerance)
    final static byte LISTED = (byte)2;                //marks points currently in the list
    final static byte PROCESSED = (byte)4;             //marks points processed previously
    final static byte MAX_AREA = (byte)8;              //marks areas near a maximum, within the tolerance
    final static byte EQUAL = (byte)16;                //marks points contigous maximum points of equal level
    final static byte MAX_POINT = (byte)32;            //marks a single point standing for a maximum
    final static byte ELIMINATED = (byte)64;           //marks maxima that have been eliminated before watershed
    /** a point on a line (as a return type of isLineOrDot)*/
    final static int IS_LINE=1;
    /** an isolated point (as a return type of isLineOrDot)*/
    final static int IS_DOT=2;
    /** type masks corresponding to the output types */
    final static byte[] outputTypeMasks = new byte[] {MAX_POINT, EQUAL, MAX_AREA, MAX_AREA, MAX_POINT};
    /**offsets of neighbor pixels for addressing*/
    int [] dirOffset, dirXoffset, dirYoffset;
    
    
    /** Method to return types supported and about dialog
     * @param arg if "about", displays 'about...' dialog
     * if "again", does filtering with the same parameters again (without asking)
     * @param imp unused
     * @return Code describing supported formats etc. (see ij.plugin.filter)
     */
    public int setup(String arg, ImagePlus imp) {
        IJ.register(this.getClass());               //protect static class variables (settings) from garbage collection
        this.imp = imp;
       return DOES_8G + DOES_16 + DOES_32 + DOES_RGB + NO_CHANGES + NO_UNDO;
    }

    /** The plugin is inferred from ImageJ by this method
     * @param ip the image to be filtered)
     */
    public void run(ImageProcessor ip) {
        if (!showDialog(ip))
        	return;
        Roi roi = imp.getRoi();
        if (roi!=null && (!roi.isArea() || outputType==SEGMENTED)) {
        	imp.killRoi();
        	roi = null;
        }
		boolean invertedLut = imp.isInvertedLut();
        double threshold = useMinThreshold?ip.getMinThreshold():ImageProcessor.NO_THRESHOLD;
		if ((invertedLut&&!lightBackground) || (!invertedLut&&lightBackground)) {
			if (threshold!=ImageProcessor.NO_THRESHOLD) {
				useMinThreshold = false;
				if (!IJ.showMessageWithCancel(
					"Find Maxima",
					"\"Above Lower Threshold\" option cannot be used\n"+
					"when finding minima (image with light background\n"+
					"or image with dark background and inverting LUT)."))
					return;
			}
			ip = ip.duplicate();
			ip.invert();
			ip.setRoi(roi);
		}
        ByteProcessor outIp = findMaxima(ip, tolerance, threshold, outputType, excludeOnEdges, false); //process the image
        if (outIp == null) return;              //cancelled by user or only counting
         if (!Prefs.blackBackground)           //normally, we use an inverted LUT, "active" pixels black (255) - like a mask
            outIp.invertLut();
        String resultName;
        if (outputType == SEGMENTED)            //Segmentation required
            resultName = " Segmented";
        else
            resultName = " Maxima";
        //IJ.write ("lowest/highest value"+maxPoints[0].value+","+maxPoints[nMax-1].value);
        String outname = imp.getTitle();
        if (imp.getNSlices()>1)
            outname += "("+imp.getCurrentSlice()+")";
        outname += resultName;
        if (WindowManager.getImage(outname)!=null)
            outname = WindowManager.getUniqueName(outname);
        ImagePlus maxImp = new ImagePlus(outname, outIp);
        Calibration cal = imp.getCalibration().copy();
        cal.disableDensityCalibration();
        maxImp.setCalibration(cal);             //keep the spatial calibration
        maxImp.show();
    } //public void run
        
	boolean showDialog(ImageProcessor ip) {
		ip.resetBinaryThreshold(); // remove invisible threshold set by MakeBinary and Convert to Mask
        boolean thresholded = ip.getMinThreshold()!=ImageProcessor.NO_THRESHOLD;
		GenericDialog myDialog=new GenericDialog("Find Maxima Options");
		int digits = (ip instanceof FloatProcessor)?2:0;
		String unit = (imp.getCalibration()!=null)?imp.getCalibration().getValueUnit():null;
		unit = (unit==null||unit.equals("Gray Value"))?":":" ("+unit+"):";
		myDialog.addNumericField("Noise Tolerance"+unit,tolerance, digits);
		myDialog.addChoice("Output type:", outputTypeNames, outputTypeNames[outputType]);
		myDialog.addCheckbox("Exclude Edge Maxima", excludeOnEdges);
		if (thresholded)
			myDialog.addCheckbox("Above Lower Threshold", useMinThreshold);
		myDialog.addCheckbox("Display Point Selection", displayPoints);
		myDialog.addCheckbox("Light Background", lightBackground);
		myDialog.showDialog();    //input by the user (or macro) happens here
		if (myDialog.wasCanceled())
			return false;
		tolerance = myDialog.getNextNumber();
		if (tolerance<0) tolerance = 0;
		outputType = myDialog.getNextChoiceIndex();
		excludeOnEdges = myDialog.getNextBoolean();
		if (thresholded)
			useMinThreshold = myDialog.getNextBoolean();
		else
			useMinThreshold = false;
		displayPoints = myDialog.getNextBoolean();
		lightBackground = myDialog.getNextBoolean();
		return true;
	}

    /** Here the processing is done: Find the maxima of an image (8, 16, 32 bit)
     * @param ip             The image subject to filtering
     * @param tolerance      Height tolerance: maxima are accepted only if protruding more than this value from the ridge to a higher maximum
     * @param threshold      minimum height of a maximum (uncalibrated); for no minimum height set it to ImageProcessor.NO_THRESHOLD
     * @param outputType     What to mark in output image: SINGLE_POINTS, MAXIMA_EXACT, IN_TOLERANCE or SEGMENTED
     * @param excludeOnEdges Whether to exclude edge maxima
     * @param isEDM          Whether the image is a 16-bit Euclidian Distance Map
     * @return               A new byteProcessor with a normal (uninverted) LUT where the marked points
     *                       are set to 255 (Background 0). Pixels outside of the roi of the input ip are not set.
     *                       Returns null if cancelled.
     */
    public ByteProcessor findMaxima(ImageProcessor ip, double tolerance, double threshold, int outputType, boolean excludeOnEdges, boolean isEDM) {
        //new ImagePlus("find maxima input", ip.duplicate()).show();
        int width = ip.getWidth();
        int height = ip.getHeight();
        Rectangle roi = ip.getRoi();
        byte[] mask = ip.getMaskArray();
        if (threshold!=ImageProcessor.NO_THRESHOLD && ip.getCalibrationTable()!=null && threshold>0 && threshold<ip.getCalibrationTable().length)
            threshold = ip.getCalibrationTable()[(int)threshold];   //convert threshold to calibrated
        ByteProcessor typeP = new ByteProcessor(width, height);     //will be a notepad for pixel types
        byte[] types = (byte[])typeP.getPixels();
        makeDirectionOffsets(ip);
        float globalMin = Float.MAX_VALUE;
        float globalMax = -Float.MAX_VALUE;
        for (int y=roi.y; y<roi.y+roi.height; y++) {         //find local minimum/maximum now
            for (int x=roi.x; x<roi.x+roi.width; x++) {      //ImageStatistics won't work if we have no ImagePlus
                float v = ip.getPixelValue(x, y);
                if (globalMin>v) globalMin = v;
                if (globalMax<v) globalMax = v;
            }
        }
        if (threshold !=ImageProcessor.NO_THRESHOLD)
            threshold -= (globalMax-globalMin)*1e-6;//avoid rounding errors
        boolean excludeEdgesNow = excludeOnEdges && outputType!=SEGMENTED; //for segmentation, exclusion of edge maxima cannot be done now but has to be done after segmentation

        IJ.showStatus("Getting sorted maxima...");
        MaxPoint[] maxPoints = getSortedMaxPoints(ip, typeP, excludeEdgesNow, isEDM, globalMin, threshold); 
         IJ.showStatus("Analyzing  maxima...");
        analyzeAndMarkMaxima(ip, typeP, maxPoints, excludeEdgesNow, isEDM, globalMin, tolerance);
        //new ImagePlus("Pixel types",typeP.duplicate()).show();
        if (outputType==COUNT || outputType==NONE)
            return null;
        
        ByteProcessor outIp;
        byte[] pixels;
        if (outputType == SEGMENTED) {                  //Segmentation required, convert to 8bit (also for 8-bit images, since the calibration may have a negative slope)
            //create 8-bit image from ip with background 0 and maximum areas 255
            outIp = make8bit(ip, typeP, isEDM, globalMin, globalMax, threshold);
            cleanupMaxima(outIp, typeP, maxPoints);     //eliminate all the small maxima (i.e. those outside MAX_AREA)
            //new ImagePlus("pixel types", typeP).show();
            //if (IJ.debugMode) 
            //new ImagePlus("pre-watershed", outIp.duplicate()).show();
            if (!watershedSegment(outIp))               //do watershed segmentation
                return null;                            //if user-cancelled, return
            if (!isEDM) cleanupExtraLines(outIp);       //eliminate lines due to local minima (none in EDM)
            watershedPostProcess(outIp);                //levels to binary image
            if (excludeOnEdges) deleteEdgeParticles(outIp, typeP);
        } else {                                        //outputType other than SEGMENTED
            for (int i=0; i<width*height; i++)
                types[i] = (byte)(((types[i]&outputTypeMasks[outputType])!=0)?255:0);
            outIp = typeP;
        }
        byte[] outPixels = (byte[])outIp.getPixels();
        //IJ.write("roi: "+roi.toString());
        if (roi!=null) {
            for (int y=0, i=0; y<outIp.getHeight(); y++) { //delete everything outside roi
                for (int x=0; x<outIp.getWidth(); x++, i++) {
                    if (x<roi.x || x>=roi.x+roi.width || y<roi.y || y>=roi.y+roi.height) outPixels[i] = (byte)0;
                    else if (mask !=null && (mask[x-roi.x + roi.width*(y-roi.y)]==0)) outPixels[i] = (byte)0;
                }
            }
        }

        return outIp;
    } // public ByteProcessor MaximumFinder

    /** find all local maxima (irrespective whether they finally qualify as maxima or not)
     * @param ip the image to be analyzed
     * @param typeP A byte image, same size as ip, where the maximum points are mrked as MAXIMUM
     * @param excludeEdgesNow whether to exclude edge pixels
     * @param isEDM whether ip is a 16-bit Euclidian distance map
     * @param globalMin the minimum value of the image or roi
     * @param threshold the threshold (calibrated) below which no pixels are processed. Ignored if ImageProcessor.NO_THRESHOLD
     * @return an array of x, y coordinates and heights, sorted by height. Do not use the positions of these points in typeP (marked as MAXIMUM there)
     */    
   MaxPoint[] getSortedMaxPoints(ImageProcessor ip, ByteProcessor typeP, boolean excludeEdgesNow, boolean isEDM, float globalMin, double threshold) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        Rectangle roi = ip.getRoi();
        byte[] types =  (byte[])typeP.getPixels();
        int nMax = 0;  //counts local maxima
        boolean checkThreshold = threshold!=ImageProcessor.NO_THRESHOLD;
        for (int y=roi.y, i=0; y<roi.y+roi.height; y++) {         // find local maxima now
            for (int x=roi.x; x<roi.x+roi.width; x++, i++) {      //  (don't care for roi now; output will be restricted to the roi at the very end)
                float v = ip.getPixelValue(x, y);
                if (v==globalMin) continue;
                if (excludeEdgesNow && (x==0 || x==width-1 || y==0 || y==height-1)) continue;
                if (checkThreshold && v<threshold) continue;
                boolean isMax = true;
                for (int d=0; d<8; d++) {
                    if (isWithin(ip, x, y, d)) {
                        if (ip.getPixelValue(x+dirXoffset[d], y+dirYoffset[d]) > v)
                            isMax = false;
                    }
                }
                if (isMax) {
                    types[i] = MAXIMUM;
                    nMax++;
                }
            } // for x
        } // for y
        
        MaxPoint [] maxPoints = new MaxPoint[nMax];
        int iMax = 0;
        for (int y=roi.y, i=0; y<roi.y+roi.height; y++)           //enter all maxima into an array
            for (int x=roi.x; x<roi.x+roi.width; x++, i++)
                if (types[i]==MAXIMUM) {
                    maxPoints[iMax] = new MaxPoint((short)x, (short)y, isEDM?trueEdmHeight(x,y,ip):ip.getPixelValue(x,y));
                    //if(ip.getPixelValue(x,y)>=250) IJ.write("x,y,value="+maxPoints[iMax].x+","+maxPoints[iMax].y+","+maxPoints[iMax].value);
                    iMax++;
                }
        sort(maxPoints);                            //sort the maxima by height
        return maxPoints;
    } //getSortedMaxPoints

   /** Check all maxima in list maxPoints, mark type of the points in typeP
    * @param ip             the image to be analyzed
    * @param typeP          here the point types are marked.
    * @param maxPoints      input: a list of all local maxima, sorted by height
    * @param excludeEdgesNow whether to avoid edge maxima
    * @param isEDM          whether ip is a 16-bit Euclidian distance map
    * @param globalMin      minimum pixel value in ip
    * @param tolerance      minimum pixel value difference for two separate maxima
    */   
   void analyzeAndMarkMaxima(ImageProcessor ip, ByteProcessor typeP, MaxPoint[] maxPoints, boolean excludeEdgesNow, boolean isEDM, float globalMin, double tolerance) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        byte[] types =  (byte[])typeP.getPixels();
        int nMax = maxPoints.length;
        short[] xList = new short[width*height];    //here we enter points starting from a maximum
        short[] yList = new short[width*height];
        Vector xyVector = null;
        Roi roi = null;
        boolean displayOrCount = imp!=null && (displayPoints||outputType==COUNT);
         for (int iMax=nMax-1; iMax>=0; iMax--) {    //process all maxima now, starting from the highest
            float v = maxPoints[iMax].value;
            if (v==globalMin) break;
            int offset = maxPoints[iMax].x + width*maxPoints[iMax].y;
            if ((types[offset]&PROCESSED)!=0)       //this maximum has been reached from another one, skip it
                continue;
            xList[0] = maxPoints[iMax].x;           //we create a list of connected points and start the list
            yList[0] = maxPoints[iMax].y;           //  at the current maximum
            types[offset] |= (EQUAL|LISTED);        //mark first point as equal height (to itself) and listed
            int listLen = 1;                        //number of elements in the list
            int listI = 0;                          //index of current element in the list
            boolean isEdgeMaximum = (xList[0]==0 || xList[0]==width-1 || yList[0]==0 || yList[0]==height-1);
            boolean maxPossible = true;             //it may be a true maxmum
            double xEqual = xList[0];               //for creating a single point: determine average over the
            double yEqual = yList[0];               //  coordinates of contiguous equal-height points
            int nEqual = 1;                         //counts xEqual/yEqual points that we use for averaging
            do {
                offset = xList[listI] + width*yList[listI];
                for (int d=0; d<8; d++) {           //analyze all neighbors (in 8 directions) at the same level
                    int offset2 = offset+dirOffset[d];
                    if (isWithin(ip, xList[listI], yList[listI], d) && (types[offset2]&LISTED)==0) {
                        if ((types[offset2]&PROCESSED)!=0) {
                            maxPossible = false;    //we have reached a point processed previously, thus it is no maximum now
                            //if(xList[0]>510&&xList[0]<77)IJ.write("stop at processed neighbor from x,y="+xList[listI]+","+yList[listI]+", dir="+d);
                            break;
                        }
                        int x2 = xList[listI]+dirXoffset[d];
                        int y2 = yList[listI]+dirYoffset[d];
                        float v2 = ip.getPixelValue(x2, y2);
                        if (isEDM && (v2 <=v-(float)tolerance)) v2 = trueEdmHeight(x2, y2, ip); //correcting for EDM peaks may move the point up
                        if (v2 > v) {
                            maxPossible = false;    //we have reached a higher point, thus it is no maximum
                            //if(xList[0]>510&&xList[0]<77)IJ.write("stop at higher neighbor from x,y="+xList[listI]+","+yList[listI]+", dir,value,value2,v2-v="+d+","+v+","+v2+","+(v2-v));
                            break;
                        } else if (v2 >= v-(float)tolerance) {
                            xList[listLen] = (short)(x2);
                            yList[listLen] = (short)(y2);
                            listLen++;              //we have found a new point within the tolerance
                            types[offset2] |= LISTED;
                            //if(x2==0)IJ.write("reached edge at x,y,type="+x2+","+y2+";"+types[offset2]+" with start at "+xList[0]+","+yList[0]);
//                            if ((types[offset]&EQUAL)!=0 && v2==v) {
                            if (x2==0 || x2==width-1 || y2==0 || y2==height-1) {
								isEdgeMaximum = true;
								if (excludeEdgesNow) {
                                	maxPossible = false;
                               		break;          //we have an edge maximum;
                                }
                            }
                            if (v2==v) {            //prepare finding center of equal points (in case single point needed)
                                types[offset2] |= EQUAL;
                                xEqual += x2;
                                yEqual += y2;
                                nEqual ++;
                                //if(xList[0]>74&&xList[0]<77)IJ.write("max#,value"+iMax+","+maxPoints[iMax].value+": x,y,val="+xList[listI]+","+yList[listI]+","+v+"; dir="+d);
                            }
                        }
                    } // if isWithin & not LISTED
                } // for directions d
                listI++;
            } while (listI < listLen);
            byte resetMask = (byte)~(maxPossible?LISTED:(LISTED|EQUAL));
            xEqual /= nEqual;
            yEqual /= nEqual;
            double minDist2 = 1e20;
            int nearestI = 0;
            for (listI=0; listI<listLen; listI++) {
                offset = xList[listI] + width*yList[listI];
                types[offset] &= resetMask;     //reset attributes no longer needed
                types[offset] |= PROCESSED;     //mark as processed
                if (maxPossible) {
                    types[offset] |= MAX_AREA;
                    if ((types[offset]&EQUAL)!=0) {
                        double dist2 = (xEqual-xList[listI])*(xEqual-xList[listI]) + (yEqual-yList[listI])*(yEqual-yList[listI]);
                        if (dist2 < minDist2) {
                            minDist2 = dist2;   //this could be the best "single maximum" point
                            nearestI = listI;
                        }
                    }
                }
            } // for listI
            if (maxPossible) {
                types[xList[nearestI] + width*yList[nearestI]] |= MAX_POINT;
                if (displayOrCount && !(this.excludeOnEdges && isEdgeMaximum)) {
                    if (xyVector==null) {
                        xyVector = new Vector();
                        roi = imp.getRoi();
                    }
                    short mpx = xList[nearestI];
                    short mpy = yList[nearestI];
                    if (roi==null || roi.contains(mpx, mpy))
                    	xyVector.addElement(new MaxPoint(mpx, mpy, 0f));
                }
            }
            //if(maxPossible&&xList[0]>74&&xList[0]<77)IJ.write("x,y,index of single point="+xList[nearestI]+","+yList[nearestI]+","+nearestI);
        } // for all maxima iMax
        if (displayOrCount && xyVector!=null) {
            int npoints = xyVector.size();
            if (displayPoints) {
                int[] xpoints = new int[npoints];
                int[] ypoints = new int[npoints];
                MaxPoint mp;
                for (int i=0; i<npoints; i++) {
                    mp = (MaxPoint)xyVector.elementAt(i);
                    xpoints[i] = mp.x;
                    ypoints[i] = mp.y;
                }
                imp.saveRoi(); // save previous selection so user can restore it
                imp.setRoi(new PointRoi(xpoints, ypoints, npoints));
            }
            if (outputType==COUNT) {
                ResultsTable rt = ResultsTable.getResultsTable();
                rt.incrementCounter();
                rt.setValue("Count", rt.getCounter()-1, npoints);
                rt.show("Results");
            }
        }
    } //void analyzeAndMarkMaxima

   /** Create an 8-bit image by scaling the pixel values of ip (background 0) and mark maximum areas as 255.
    * For use as input for watershed segmentation
    * @param ip         The original image that should be segmented
    * @param typeP      Pixel types in ip
    * @param isEDM      Whether ip is an Euclidian distance map
    * @param globalMin  The minimum pixel value of ip
    * @param globalMax  The maximum pixel value of ip
    * @param threshold  Pixels of ip below this value (calibrated) are considered background. Ignored if ImageProcessor.NO_THRESHOLD
    * @return           The 8-bit output image.
    */   
    ByteProcessor make8bit(ImageProcessor ip, ByteProcessor typeP, boolean isEDM, float globalMin, float globalMax, double threshold) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        byte[] types = (byte[])typeP.getPixels();
        double minValue = (threshold == ImageProcessor.NO_THRESHOLD)?globalMin:threshold;
        double offset = minValue - (globalMax-minValue)*(1./253/2-1e-6); //everything above minValue should become >(byte)0
        double factor = 253/(globalMax-minValue);
        //IJ.write("min,max="+minValue+","+globalMax+"; offset, 1/factor="+offset+", "+(1./factor));
        if (isEDM && factor >1./EDM.ONE) 
            factor = 1./EDM.ONE;   // in EDM, no better resolution is needed
        ByteProcessor outIp = new ByteProcessor(width, height);
        byte[] pixels = (byte[])outIp.getPixels();  //convert possibly calibrated image to byte without damaging threshold (setMinAndMax would kill threshold)
        long v;
        for (int y=0, i=0; y<height; y++) {
            for (int x=0; x<width; x++, i++) {
                v = Math.round((ip.getPixelValue(x, y)-offset)*factor);
                if (v<0) pixels[i] = (byte)0;
                else if (v<=255) pixels[i] = (byte)(v&255);
                else pixels[i] = (byte) 255;
            }
        }

        pixels = (byte[])outIp.getPixels();
        //new ImagePlus("pre-threshold", outIp.duplicate()).show();
        if (threshold != ImageProcessor.NO_THRESHOLD) {
            for (int y=0; y<height; y++) {          //Set out-of-threshold to background (inactive)
                for (int x=0; x<width; x++) {
                    if (ip.getPixelValue(x,y) < threshold)
                        pixels[x+y*width] = (byte)0;
                }
            }
        }
        for (int i=0; i<width*height; i++) {
            if ((pixels[i]&255) == 255)             //pixel value 255 is reserved
                pixels[i]--;
            if((types[i]&MAX_AREA)!=0)
                pixels[i] = (byte)255;              //prepare watershed by setting "true" maxima+surroundings to 255
        }
        return outIp;
    } // byteProcessor make8bit

   /** Get estimated "true" height of a maximum or saddle point of a Euclidian Distance Map.
     * This is needed since the point sampled is not necessarily at the highest position.
     * Note: for simplicity, in contrast to EDM we don't care about the Sqrt(5) distance here.
     * @param x     x-position of the point
     * @param y     y-position of the point
     * @param ip    the EDM (16-bit, scaling as defined in EDM class)
     * @return      estimated height
     */
    int trueEdmHeight(int x, int y, ImageProcessor ip) {
        int xmax = ip.getWidth()-1;
        int ymax = ip.getHeight()-1;
        int v =  ip.getPixel(x, y);
        if (x==0 || y==0 || x==xmax || y==ymax || v==0) {
            return v;                               //don't recalculate for edge pixels or background
        } else {
            int one = EDM.ONE;
            int sqrt2 = EDM.SQRT2;
            int trueH = v+sqrt2/2;                  //true height can never by higher than this
            boolean ridgeOrMax = false;
            for (int d=0; d<4; d++) {               //for all directions halfway around:
                int d2 = (d+4)%8;                   //get the opposite direction and neighbors
                int v1 = ip.getPixel(x+dirXoffset[d], y+dirYoffset[d]);
                int v2 = ip.getPixel(x+dirXoffset[d2], y+dirYoffset[d2]);
                int h;
                if (v>=v1 && v>=v2) {
                    ridgeOrMax = true;
                    h = (v1 + v2)/2;
                } else {
                    h = Math.min(v1, v2);
                }
                h += (d%2==0) ? one : sqrt2;        //in diagonal directions, distance is sqrt2
                if (trueH > h) trueH = h;
            }
            if (!ridgeOrMax) trueH = v;
            return trueH;
        }
    }
    
    /** eliminate unmarked maxima for use by watershed. Starting from each previous maximum,
     * explore the surrounding down to successively lower levels until a marked maximum is
     * touched (or the plateau of a previously eliminated maximum leads to a marked maximum).
     * Then set all the points above this value to this value
     * @param outIp     the image containing the pixel values
     * @param typeP     the types of the pixels are mekred here
     * @param maxPoints array containing the coordinates of all maxima that might be relevant
     */    
    void cleanupMaxima(ByteProcessor outIp, ByteProcessor typeP, MaxPoint[] maxPoints) {
        byte[] pixels = (byte[])outIp.getPixels();
        byte[] types = (byte[])typeP.getPixels();
        int width = outIp.getWidth();
        int height = outIp.getHeight();
        int nMax = maxPoints.length;
        short[] xList = new short[width*height];
        short[] yList = new short[width*height];
        for (int iMax = nMax-1; iMax>=0; iMax--) {
            int offset = maxPoints[iMax].x + width*maxPoints[iMax].y;
            //if (maxPoints[iMax].x==122) IJ.write("max#"+iMax+" at x,y="+maxPoints[iMax].x+","+maxPoints[iMax].y+": type="+types[offset]);
            if ((types[offset]&(MAX_AREA|ELIMINATED))!=0) continue;
            int level = pixels[offset]&255;
            int loLevel = level+1;
            xList[0] = maxPoints[iMax].x;           //we start the list at the current maximum
            yList[0] = maxPoints[iMax].y;
            //if (xList[0]==122) IJ.write("max#"+iMax+" at x,y="+xList[0]+","+yList[0]+"; level="+level);
            types[offset] |= LISTED;                //mark first point as listed
            int listLen = 1;                        //number of elements in the list
            int lastLen = 1;
            int listI = 0;                          //index of current element in the list
            boolean saddleFound = false;
            while (!saddleFound && loLevel >0) {
                loLevel--;
                lastLen = listLen;                  //remember end of list for previous level
                listI = 0;                          //in each level, start analyzing the neighbors of all pixels
                do {                                //for all pixels listed so far
                    offset = xList[listI] + width*yList[listI];
                    for (int d=0; d<8; d++) {       //analyze all neighbors (in 8 directions) at the same level
                        int offset2 = offset+dirOffset[d];
                        if (isWithin(typeP, xList[listI], yList[listI], d) && (types[offset2]&LISTED)==0) {
                            if ((types[offset2]&MAX_AREA)!=0 || (((types[offset2]&ELIMINATED)!=0) && (pixels[offset2]&255)>=loLevel)) {
                                saddleFound = true; //we have reached a point touching a "true" maximum...
                                //if (xList[0]==122) IJ.write("saddle found at level="+loLevel+"; x,y="+xList[listI]+","+yList[listI]+", dir="+d);
                                break;              //...or a level not lower, but touching a "true" maximum
                            } else if ((pixels[offset2]&255)>=loLevel && (types[offset2]&ELIMINATED)==0) {
                                xList[listLen] = (short)(xList[listI]+dirXoffset[d]);
                                yList[listLen] = (short)(yList[listI]+dirYoffset[d]);
                                listLen++;          //we have found a new point to be processed
                                types[offset2] |= LISTED;
                            }
                        } // if isWithin & not LISTED
                    } // for directions d
                    if (saddleFound) break;         //no reason to search any further
                    listI++;
                } while (listI < listLen);
            } // while !levelFound && loLevel>=0
            for (listI=0; listI<listLen; listI++)   //reset attribute since we may come to this place again
                types[xList[listI] + width*yList[listI]] &= ~LISTED;
            for (listI=0; listI<lastLen; listI++) { //for all points higher than the level of the saddle point
                offset = xList[listI] + width*yList[listI];
                pixels[offset] = (byte)loLevel;     //set pixel value to the level of the saddle point
                types[offset] |= ELIMINATED;        //mark as processed: there can't be a local maximum in this area
            }
        } // for all maxima iMax
    }

    /** Delete  single dots and lines ending somewhere within a segmented particle
     * Needed for post-processing watershed-segmented images that can have local minima
     * @param ip 8-bit image with background = 0, lines between 1 and 254 and segmented particles = 255
     */    
    void cleanupExtraLines(ImageProcessor ip) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        byte[] pixels =  (byte[])ip.getPixels();
        for (int y=0, i=0; y<height; y++) {
            for (int x=0; x<width; x++,i++) {
                int v = pixels[i]&255;
                if (v<255 && v>0) {
                    int type = isLineOrDot(ip, x, y);
                    if (type==IS_DOT) {
                        pixels[i] = (byte)255;                  //delete the point;
                    } else if (type==IS_LINE) {
                        int xEnd = x;
                        int yEnd = y;
                        boolean endFound = true;
                        while (endFound) {
                            pixels[xEnd + width*yEnd] = (byte)255;  //delete the point
                            //if(movie.getSize()<100)movie.addSlice("part-cleaned", ip.duplicate());
                            endFound = false;
                            for (int d=0; d<8; d++) {               //analyze neighbors of the point
                                if (isWithin(ip, xEnd, yEnd, d)) {
                                    v = pixels[xEnd + width*yEnd + dirOffset[d]]&255;
                                    //if(x>210&&x<215&&y==13)IJ.write("x,y start="+x+","+y+": look at="+xEnd+","+yEnd+"+dir "+d+": v="+v);
                                    if (v<255 && v>0 && isLineOrDot(ip, xEnd+dirXoffset[d], yEnd+dirYoffset[d])==IS_LINE) {
                                        xEnd += dirXoffset[d];
                                        yEnd += dirYoffset[d];
                                        endFound = true;
                                        break;
                                    }
                                }
                            } // for directions d
                        } // while (endFound)
                    } // if IS_LINE
                } // if v<255 && v>0
            } // for x
        } // for y
    } //cleanupExtraLines

    /** analyze the neighbors of a pixel (x, y) in a byte image; pixels <255 are
     * considered part of lines.
     * @param ip
     * @param x
     * @param y
     * @return  IS_LINE if pixel is part of a line, IS_DOT if a single dot
     */    
    int isLineOrDot(ImageProcessor ip, int x, int y) {
        int result = 0;
        int width = ip.getWidth();
        int height = ip.getHeight();
        byte[] pixels = (byte[])ip.getPixels();
        int offset = x + y*width;
        int whiteNeighbors = 0;             //counts neighbors that are not part of a line
        int countTransitions = 0;
        boolean pixelSet;
        boolean prevPixelSet = true;
        boolean firstPixelSet = true;       //initialize to make the compiler happy
        for (int d=0; d<8; d++) {           //walk around the point and note every no-line->line transition
            if (isWithin(ip, x, y, d)) {
                pixelSet = (pixels[offset+dirOffset[d]]!=(byte)255);
                if (!pixelSet) whiteNeighbors++;
            } else {
                pixelSet = true;
            }
            if (pixelSet && !prevPixelSet)
                countTransitions ++;
            prevPixelSet = pixelSet;
            if (d==0)
                firstPixelSet = pixelSet;
        }
        if (firstPixelSet && !prevPixelSet)
            countTransitions ++;
            //if (x>=210&&x<=215 && y>=10 && y<=17)IJ.write("x,y="+x+","+y+": transitions="+countTransitions);
        if (countTransitions==1 && whiteNeighbors>=5)
            result = IS_LINE;
        else if (whiteNeighbors==8)
            result = IS_DOT;
        return result;
    } //isLineEnd

    /** after watershed, set all pixels in the background and segmentation lines to 0
     */
    private void watershedPostProcess(ImageProcessor ip) {
        //new ImagePlus("before postprocess",ip.duplicate()).show();
        byte[] pixels = (byte[])ip.getPixels();
        int size = ip.getWidth()*ip.getHeight();
        for (int i=0; i<size; i++) {
           if ((pixels[i]&255)<255)
                pixels[i] = (byte)0;
        }
        //new ImagePlus("after postprocess",ip.duplicate()).show();
    }

    /** delete particles corresponding to edge maxima
     * @param typeP Here the pixel types of the original image are noted,
     * pixels with bit MAX_AREA at the edge are considered indicators of an edge maximum.
     * @param ip the image resulting from watershed segmentaiton
     * (foreground pixels, i.e. particles, are 255, background 0)
     */
    void deleteEdgeParticles(ByteProcessor ip, ByteProcessor typeP) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        byte[] pixels = (byte[])ip.getPixels();
        byte[] types = (byte[])typeP.getPixels();
        width = ip.getWidth();
        height = ip.getHeight();
        ip.setValue(0);
        Wand wand = new Wand(ip);
        for (int x=0; x<width; x++) {
            int y = 0;
            if ((types[x+y*width]&MAX_AREA) != 0 && pixels[x+y*width] != 0)
                deleteParticle(x,y,ip,wand);
            y = height - 1;
            if ((types[x+y*width]&MAX_AREA) != 0 && pixels[x+y*width] != 0)
                deleteParticle(x,y,ip,wand);            
        }
        for (int y=1; y<height-1; y++) {
            int x = 0;
            if ((types[x+y*width]&MAX_AREA) != 0 && pixels[x+y*width] != 0)
                deleteParticle(x,y,ip,wand);
            x = width - 1;
            if ((types[x+y*width]&MAX_AREA) != 0 && pixels[x+y*width] != 0)
                deleteParticle(x,y,ip,wand);            
        }
    }
    /** delete a particle (set from value 255 to current fill value).
     * Position x,y must be within the particle
     */
    void deleteParticle(int x, int y, ByteProcessor ip, Wand wand) {
        wand.autoOutline(x, y, 255, 255);
        if (wand.npoints==0) {
            IJ.log("wand error selecting edge particle at x, y = "+x+", "+y);
            return;
        }
        Roi roi = new PolygonRoi(wand.xpoints, wand.ypoints, wand.npoints, Roi.TRACED_ROI);
        ip.snapshot();                  //prepare for reset outside of mask
        ip.setRoi(roi);
        ip.fill();
        ip.reset(ip.getMask());
    }

        /** Do watershed segmentation on a byte image, with the start points (maxima)
     * set to 255 and the background set to 0. The image should not have any local maxima
     * other than the marked ones. Local minima will lead to artifacts that can be removed
     * later. On output, all particles will be set to 255, segmentation lines remain at their
     * old value.
     * @param ip  The byteProcessor containing the image, with size given by the class variables width and height
     * @return    false if canceled by the user (note: can be cancelled only if called by "run" with a known ImagePlus)
     */    
    private boolean watershedSegment(ByteProcessor ip) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        boolean debug = IJ.debugMode;
        ImageStack movie=null;
        if (debug) {
            movie = new ImageStack(ip.getWidth(), ip.getHeight());
            movie.addSlice("pre-watershed EDM", ip.duplicate());
        }
        byte[] pixels = (byte[])ip.getPixels();
        // create arrays with the coordinates of all points between value 1 and 254
        //This method, suggested by Stein Roervik (stein_at_kjemi-dot-unit-dot-no),
        //greatly speeds up the watershed segmentation routine.
        int[] histogram = ip.getHistogram();
        int arraySize = width*height - histogram[0] -histogram[255];
        short[] xCoordinate = new short[arraySize];
        short[] yCoordinate = new short[arraySize];
        int highestValue = 0;
        int offset = 0;
        int[] levelStart = new int[256];
        for (int v=1; v<255; v++) {
            levelStart[v] = offset;
            offset += histogram[v];
            if (histogram[v]>0) highestValue = v;
        }
        int[] levelOffset = new int[highestValue + 1];
        for (int y=0, i=0; y<height; y++) {
            for (int x=0; x<width; x++, i++) {
                int v = pixels[i]&255;
                if (v>0 && v<255) {
                    offset = levelStart[v] + levelOffset[v];
                    xCoordinate[offset] = (short) x;
                    yCoordinate[offset] = (short) y;
                    levelOffset[v] ++;
                }
           } //for x
        } //for y
        // now do the segmentation, starting at the highest level and working down.
        // At each level, dilate the particle, constrained to pixels whose values are
        // at that level and also constrained to prevent features from merging.
        int[] table = makeFateTable();
        IJ.showStatus("Segmenting (Esc to cancel)");
        ImageProcessor ip2 = ip.duplicate();
        for (int level=highestValue; level>=1; level--) {
            IJ.showProgress(highestValue-level, highestValue);
            int idle = 1;
            while(true) {                   // break the loop at any point after 8 idle processLevel calls
                if (processLevel(level, 7, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 3, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 1, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 5, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                //IJ.write("diagonal only; level="+level+"; countW="+countW);
                if (processLevel(level, 0, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 4, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 2, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                if (processLevel(level, 6, ip, ip2, table, histogram, levelStart, xCoordinate, yCoordinate))
                    idle = 0;
                if (idle++ >=8) break;
                //IJ.write("All directions; level="+level+"; countW="+countW);
            }
            if (IJ.escapePressed()) {  // cancelled by the user
                IJ.beep();
                IJ.showProgress(1.0);
                return false;
            }
            if (debug && (level>245 || level<30))
                movie.addSlice("level "+level, ip.duplicate());
        }
        if (debug)
            new ImagePlus("Segmentation Movie", movie).show();
        IJ.showProgress(1.0);
        return true;
    }
    /** Creates the lookup table used by the watershed function for dilating the particles.
     * The algorithm allows dilation in both straight and diagonal directions.
     * There is an entry in the table for each possible 3x3 neighborhood:
     *          x-1          x          x+1
     *  y-1    128            1          2
     *  y       64     pxl_unset_yet     4
     *  y+1     32           16          8
     * (to find throws entry, sum up the numbers of the neighboring pixels set; e.g.
     * entry 6=2+4 if only the pixels (x,y-1) and (x+1, y-1) are set.
     * A pixel is added on the 1st pass if bit 0 (2^0 = 1) is set,
     * on the 2nd pass if bit 1 (2^1 = 2) is set, etc.
     * pass gives the direction of rotation, with 0 = to top left (x--,y--), 1 to top,
     * and clockwise up to 7 = to the left (x--).
     * E.g. 4 = add on 3rd pass, 3 = add on either 1st or 2nd pass.
     */
    private int[] makeFateTable() {
        int[] table = new int[256];
        boolean[] isSet = new boolean[8];
        for (int item=0; item<256; item++) {        //dissect into pixels
            for (int i=0, mask=1; i<8; i++) {
                isSet[i] = (item&mask)==mask;
                mask*=2;
            }
            for (int i=0, mask=1; i<8; i++) {       //we dilate in the direction opposite to the direction of the existing neighbors
                if (isSet[(i+4)%8]) table[item] |= mask;
                mask*=2;
            }
            for (int i=0; i<8; i+=2)                //if side pixels are set, for counting transitions it is as good as if the adjacent edges were also set
                if (isSet[i]) {
                    isSet[(i+1)%8] = true;
                    isSet[(i+7)%8] = true;
                }
            int transitions=0;
            for (int i=0, mask=1; i<8; i++) {
                if (isSet[i] != isSet[(i+1)%8])
                    transitions++;
            }
            if (transitions>=4) {                   //if neighbors contain more than one region, dilation ito this pixel is forbidden
                table[item] = 0;
            } else {
            }
        }
        return table;
    } // makeFateTable

    /** dilate the UEP on one level by one pixel in the direction specified by step, i.e., set pixels to 255
     * @param level the level of the EDM that should be processed (all other pixels are untouched)
     * @param pass gives direction of dilation, see makeFateTable
     * @param ip1 the EDM with the segmeted blobs successively getting set to 255
     * @param ip2 a processor used as scratch storage, must hold the same data as ip1 upon entry.
     *            This method ensures that ip2 equals ip1 upon return
     * @param table the fateTable
     * class variables used:
     *  xCoordinate[], yCoordinate[]    list of pixel coordinates sorted by level (in sequence of y, x within each level)
     *  levelStart[]                    offsets of the level in xCoordinate[], yCoordinate[]
     * @return                          true if pixels have been changed
     */
    private boolean processLevel(int level, int pass, ImageProcessor ip1, ImageProcessor ip2, int[] table,
    int[] histogram, int[] levelStart, short[] xCoordinate, short[] yCoordinate) {
        int rowSize = ip1.getWidth();
        int height = ip1.getHeight();
        int xmax = rowSize-1;
        int ymax = ip1.getHeight()-1;
        byte[] pixels1 = (byte[])ip1.getPixels();
        byte[] pixels2 = (byte[])ip2.getPixels();
        boolean changed = false;
        for (int i=0; i<histogram[level]; i++) {
            int coordOffset = levelStart[level] + i;
            int x = xCoordinate[coordOffset];
            int y = yCoordinate[coordOffset];
            int offset = x + y*rowSize;
            int index;
            if ((pixels2[offset]&255)!=255) {
                index = 0;
                if (y>0 && (pixels2[offset-rowSize]&255)==255)
                    index ^= 1;
                if (x<xmax && y>0 && (pixels2[offset-rowSize+1]&255)==255)
                    index ^= 2;
                if (x<xmax && (pixels2[offset+1]&255)==255)
                    index ^= 4;
                if (x<xmax && y<ymax && (pixels2[offset+rowSize+1]&255)==255)
                    index ^= 8;
                if (y<ymax && (pixels2[offset+rowSize]&255)==255)
                    index ^= 16;
                if (x>0 && y<ymax && (pixels2[offset+rowSize-1]&255)==255)
                    index ^= 32;
                if (x>0 && (pixels2[offset-1]&255)==255)
                    index ^= 64;
                if (x>0 && y>0 && (pixels2[offset-rowSize-1]&255)==255)
                    index ^= 128;
                switch (pass) {
                    case 0: if ((table[index]&1)==1) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 1: if ((table[index]&2)==2) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 2: if ((table[index]&4)==4) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 3: if ((table[index]&8)==8) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 4: if ((table[index]&16)==16) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 5: if ((table[index]&32)==32) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 6: if ((table[index]&64)==64) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                    case 7: if ((table[index]&128)==128) {
                        pixels1[offset] = (byte)255;
                        changed = true;
                    }
                    break;
                } // switch
            } // if .. !=255
        } // for pixel i
        //IJ.write("level="+level+", pass="+pass+", changed="+changed);
        if (changed)                    //make sure that ip2 is updated for the next time
            System.arraycopy(pixels1, 0, pixels2, 0, rowSize*height);

        return changed;
    } //processLevel

    /** create an array of offsets within a pixel array for directions in clockwise order: 0=(x,y-1), 1=(x+1,y-1), ... 7=(x-1,y)
     * uses class variable width: width of the image where the pixels should be addressed
     * returns as class variables: the arrays of the offsets to the 8 neighboring pixels
     */
    private void makeDirectionOffsets(ImageProcessor ip) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        dirOffset = new int[] { -width, -width+1, +1, +width+1, +width, +width-1,   -1, -width-1 };
        dirXoffset = new int[] {    0,       1,     1,     1,       0,      -1,      -1,    -1    };
        dirYoffset = new int[] {   -1,      -1,     0,     1,       1,       1,       0,    -1,   };
    }
    
    /** returns whether the neighbor in a given direction is within the image
     * NOTE: it is assumed that the pixel x,y itself is within the image!
     * Uses class variables width, height: dimensions of the image
     * @param x         x-coordinate of the pixel that has a neighbor in the given direction
     * @param y         y-coordinate of the pixel that has a neighbor in the given direction
     * @param direction the direction from the pixel towards the neighbor (see makeDirectionOffsets)
     * @return          true if the neighbor is within the image (provided that x, y is within)
     */
    boolean isWithin(ImageProcessor ip, int x, int y, int direction) {
        int width = ip.getWidth();
        int height = ip.getHeight();
        int xmax = width - 1;
        int ymax = height -1;
        switch(direction) {
            case 0:
                return (y>0);
            case 1:
                return (x<xmax && y>0);
            case 2:
                return (x<xmax);
            case 3:
                return (x<xmax && y<ymax);
            case 4:
                return (y<ymax);
            case 5:
                return (x>0 && y<ymax);
            case 6:
                return (x>0);
            case 7:
                return (x>0 && y>0);
        }
        return false;   //to make the compiler happy :-)
    } // isWithin
    
    /** Sorts the array. Code based on ij.util.StringSorter.java
    /* Note that we cannot always use java.util.Arrays.sort(a) since it
     * is not available for Java 1.1.8, the highest version on Mac OS 9.
     **/
    void sort(MaxPoint[] a) {
        if (!alreadySorted(a))
            sort(a, 0, a.length - 1);
    }
    
    void sort(MaxPoint[] a, int from, int to) {
        int i = from, j = to;
        MaxPoint center = a[ (from + to) / 2 ];
        do {
            while ( i < to && center.compareTo(a[i]) > 0 ) i++;
            while ( j > from && center.compareTo(a[j]) < 0 ) j--;
            if (i < j) {MaxPoint temp = a[i]; a[i] = a[j]; a[j] = temp; }
            if (i <= j) { i++; j--; }
        } while(i <= j);
        if (from < j) sort(a, from, j);
        if (i < to) sort(a,  i, to);
    }
    
    boolean alreadySorted(MaxPoint[] a) {
        for ( int i=1; i<a.length; i++ ) {
            if (a[i].compareTo(a[i-1]) < 0 )
                return false;
        }
        return true;
    }
    
    /** Coordinates and the value of a local maximum.
     *  Implemented as a class for easy sorting of an array of maxima by pixel value
     **/
    class MaxPoint implements Comparable {
        float value;
        short x;
        short y;
        
        /** a constructor filling in the data */
        MaxPoint(short x, short y, float value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
        /** a comparator required for sorting (interface Comparable) */
        public int compareTo(Object o) {
            //return Float.compare(value,((MaxPoint)o).value); //not possible since this requires Java 1.4
            float diff = value-((MaxPoint)o).value;
            if (diff > 0f) return 1;
            else if (diff == 0f) return 0;
            else return -1;
        }
    }
    
} // end of class MaximumFinder

