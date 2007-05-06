package ij.process;
Best-fitting ellipse routines by:

  Bob Rodieck
  Department of Ophthalmology, RJ-10
  University of Washington, 
  Seattle, WA, 98195

Notes on best-fitting ellipse:

  Consider some arbitrarily shaped closed profile, which we wish to
  characterize in a quantitative manner by a series of terms, each 
  term providing a better approximation to the shape of the profile.  
  Assume also that we wish to include the orientation of the profile 
  (i.e. which way is up) in our characterization. 

  One approach is to view the profile as formed by a series harmonic 
  components, much in the same way that one can decompose a waveform
  over a fixed interval into a series of Fourier harmonics over that 
  interval. From this perspective the first term is the mean radius,
  or some related value (i.e. the area).  The second term is the 
  magnitude and phase of the first harmonic, which is equivalent to the
  best-fitting ellipse.  

  What constitutes the best-fitting ellipse?  First, it should have the
  same area.  In statistics, the measure that attempts to characterize some
  two-dimensional distribution of data points is the 'ellipse of 
  concentration' (see Cramer, Mathematical Methods of Statistics, 
  Princeton Univ. Press, 945, page 283).  This measure equates the second
  order central moments of the ellipse to those of the distribution, 
  and thereby effectively defines both the shape and size of the ellipse. 

  This technique can be applied to a profile by assuming that it constitutes
  a uniform distribution of points bounded by the perimeter of the profile.
  For most 'blob-like' shapes the area of the ellipse is close to that
  of the profile, differing by no more than about 4%. We can then make
  a small adjustment to the size of the ellipse, so as to give it the 
  same area as that of the profile.  This is what is done here, and 
  therefore this is what we mean by 'best-fitting'. 

  For a real pathologic case, consider a dumbell shape formed by two small
  circles separated by a thin line. Changing the distance between the
  circles alters the second order moments, and thus the size of the ellipse 
  of concentration, without altering the area of the profile. 

public class Ellipse_Fitter implements PlugInFilter {
	public int setup(String arg, ImagePlus imp) {
		return DOES_ALL;
	}
	public void run(ImageProcessor ip) {
		EllipseFitter ef = new EllipseFitter();
		ef.fit(ip);
		IJ.write(IJ.d2s(ef.major)+" "+IJ.d2s(ef.minor)+" "+IJ.d2s(ef.angle)+" "+IJ.d2s(ef.xCenter)+" "+IJ.d2s(ef.yCenter));
		ef.drawEllipse(ip);
	}
}
*/

