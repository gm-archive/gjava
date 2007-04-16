package ij.plugin;
import ij.*;
import ij.gui.*;
import ij.process.*;
import ij.measure.*;
import ij.plugin.frame.Recorder;
import ij.plugin.filter.PlugInFilter;
import java.awt.*;

/** This plugin implements the Proxess/Binary/Threshold 
	and Convert to Mask commands. */
public class Thresholder implements PlugIn, Measurements {
	
	private double minThreshold;
	private double maxThreshold;
	boolean autoThreshold;
	boolean skipDialog;
	static boolean fill1 = true;
	static boolean fill2 = true;
	static boolean useBW = true;
	static boolean useLocal = true;
	boolean convertToMask;

	public void run(String arg) {
		convertToMask = arg.equals("mask");
		skipDialog = arg.equals("skip") || convertToMask;
		ImagePlus imp = WindowManager.getCurrentImage();
		if (imp==null)
			{IJ.noImage(); return;}
		if (imp.getStackSize()==1) {
			Undo.setup(Undo.COMPOUND_FILTER, imp);
			applyThreshold(imp);
			Undo.setup(Undo.COMPOUND_FILTER_DONE, imp);
		} else
			convertStack(imp);
	}
	
	void convertStack(ImagePlus imp) {
		if (!(imp.getProcessor().getMinThreshold()==ImageProcessor.NO_THRESHOLD))
			useLocal = false;		
		GenericDialog gd = new GenericDialog("Convert to Mask");
		gd.addMessage("Convert all images in stack to binary?");
		gd.addCheckbox("Calculate Threshold for Each Image", useLocal);
		gd.addCheckbox("Black Background", Prefs.blackBackground);
		gd.showDialog();
		if (gd.wasCanceled()) return;
		useLocal = gd.getNextBoolean();
		Prefs.blackBackground = gd.getNextBoolean();
		Undo.reset();
		if (useLocal)
			//IJ.runMacroFile("ij.jar:ConvertStackToBinary");
			convertStackToBinary(imp);
		else
			applyThreshold(imp);
	}

	void applyThreshold(ImagePlus imp) {
		if (!imp.lock())
			return;
		imp.killRoi();
		ImageProcessor ip = imp.getProcessor();
		ip.resetBinaryThreshold();
		double saveMinThreshold = ip.getMinThreshold();
		double saveMaxThreshold = ip.getMaxThreshold();
		double saveMin = ip.getMin();
		double saveMax = ip.getMax();
		if (ip instanceof ByteProcessor)
			{saveMin =0; saveMax = 255;}
		autoThreshold = saveMinThreshold==ImageProcessor.NO_THRESHOLD;
					
		boolean useBlackAndWhite = true;
		if (skipDialog)
			fill1 = fill2 = useBlackAndWhite = true;
		else if (!autoThreshold) {
			GenericDialog gd = new GenericDialog("Make Binary");
			gd.addCheckbox("Thresholded pixels to foreground color", fill1);
			gd.addCheckbox("Remaining pixels to background color", fill2);
			gd.addMessage("");
			gd.addCheckbox("Black foreground, white background", useBW);
			gd.showDialog();
			if (gd.wasCanceled())
				{imp.unlock(); return;}
			fill1 = gd.getNextBoolean();
			fill2 = gd.getNextBoolean();
			useBW = useBlackAndWhite = gd.getNextBoolean();
		} else
			fill1 = fill2 = true;

		if (!(imp.getType()==ImagePlus.GRAY8))
			convertToByte(imp);
		ip = imp.getProcessor();
		
		if (autoThreshold)
			autoThreshold(ip);
		else {
			if (Recorder.record && (!IJ.macroRunning()||Recorder.recordInMacros))
				Recorder.record("setThreshold", (int)saveMinThreshold, (int)saveMaxThreshold);
 			minThreshold = ((saveMinThreshold-saveMin)/(saveMax-saveMin))*255.0;
 			maxThreshold = ((saveMaxThreshold-saveMin)/(saveMax-saveMin))*255.0;
		}

		if (convertToMask && ip.isColorLut())
			ip.setColorModel(ip.getDefaultColorModel());
		int fcolor, bcolor;
		ip.resetThreshold();
		int savePixel = ip.getPixel(0,0);
		if (useBlackAndWhite)
 			ip.setColor(Color.black);
 		else
 			ip.setColor(Toolbar.getForegroundColor());
		ip.drawPixel(0,0);
		fcolor = ip.getPixel(0,0);
		if (useBlackAndWhite)
 			ip.setColor(Color.white);
 		else
 			ip.setColor(Toolbar.getBackgroundColor());
		ip.drawPixel(0,0);
		bcolor = ip.getPixel(0,0);
		ip.setColor(Toolbar.getForegroundColor());
		ip.putPixel(0,0,savePixel);

		int[] lut = new int[256];
		for (int i=0; i<256; i++) {
			if (i>=minThreshold && i<=maxThreshold)
				lut[i] = fill1?fcolor:(byte)i;
			else {
				lut[i] = fill2?bcolor:(byte)i;
			}
		}
		if (imp.getStackSize()>1)
			new StackProcessor(imp.getStack(), ip).applyTable(lut);
		else
			ip.applyTable(lut);
		if (convertToMask) {
			if (!imp.isInvertedLut()) {
				setInvertedLut(imp);
				fcolor = 255 - fcolor;
				bcolor = 255 - bcolor;
			}
			if (Prefs.blackBackground)
			ip.invertLut();
		}
		if (fill1=true && fill2==true && ((fcolor==0&&bcolor==255)||(fcolor==255&&bcolor==0)))
			imp.getProcessor().setThreshold(fcolor, fcolor, ImageProcessor.NO_LUT_UPDATE);
		imp.updateAndRepaintWindow();
		imp.unlock();
	}

	void convertStackToBinary(ImagePlus imp) {
		int nSlices = imp.getStackSize();
		if ((imp.getBitDepth()!=8)) {
			IJ.showStatus("Converting to byte");
			ImageStack stack1 = imp.getStack();
			ImageStack stack2 = new ImageStack(imp.getWidth(), imp.getHeight());
			for(int i=1; i<=nSlices; i++) {
				IJ.showProgress(i, nSlices);
				String label = stack1.getSliceLabel(i);
				ImageProcessor ip = stack1.getProcessor(i);
				ip.resetMinAndMax();
				stack2.addSlice(label, ip.convertToByte(true));
			}
			imp.setStack(null, stack2);
		}
		ImageStack stack = imp.getStack();
		IJ.showStatus("Auto-thresholding");
		for(int i=1; i<=nSlices; i++) {
			IJ.showProgress(i, nSlices);
			ImageProcessor ip = stack.getProcessor(i);
			autoThreshold(ip);
			int[] lut = new int[256];
			for (int j=0; j<256; j++) {
				if (j>=minThreshold && j<=maxThreshold)
					lut[j] = (byte)255;
				else
					lut[j] = 0;
			}
			ip.applyTable(lut);
		}
		stack.setColorModel(LookUpTable.createGrayscaleColorModel(!Prefs.blackBackground));
		imp.setStack(null, stack);
		imp.getProcessor().setThreshold(255, 255, ImageProcessor.NO_LUT_UPDATE);
		IJ.showStatus("");
	}

	void convertToByte(ImagePlus imp) {
		ImageProcessor ip = imp.getProcessor();
		double min = ip.getMin();
		double max = ip.getMax();
		int currentSlice =  imp.getCurrentSlice();
		ImageStack stack1 = imp.getStack();
		ImageStack stack2 = imp.createEmptyStack();
		int nSlices = imp.getStackSize();
		String label;
		for(int i=1; i<=nSlices; i++) {
			label = stack1.getSliceLabel(i);
			ip = stack1.getProcessor(i);
			ip.setMinAndMax(min, max);
			stack2.addSlice(label, ip.convertToByte(true));
		}
		imp.setStack(null, stack2);
		imp.setSlice(currentSlice);
		imp.setCalibration(imp.getCalibration()); //update calibration
	}
	
	void setInvertedLut(ImagePlus imp) {
		ImageProcessor ip = imp.getProcessor();
		ip.invertLut();
		int nImages = imp.getStackSize();
		if (nImages==1)
			ip.invert();
		else {
			ImageStack stack = imp.getStack();
			for (int slice=1; slice<=nImages; slice++)
				stack.getProcessor(slice).invert();
			stack.setColorModel(ip.getColorModel());
		}
	}

	void autoThreshold(ImageProcessor ip) {
		ImageStatistics stats = ImageStatistics.getStatistics(ip, MIN_MAX+MODE, null);
		int threshold = ((ByteProcessor)ip).getAutoThreshold();
		if ((stats.max-stats.mode)<(stats.mode-stats.min)) {
			minThreshold = stats.min;
			maxThreshold = threshold;
		} else {
			minThreshold = threshold;
			maxThreshold = stats.max;
		}
 	}

}
