/**
 * Functions.java Provides GML like functions for java!
 * @author G-Java development team (http://www.g-java.com)
 * @version 1.0
 */
package org.gjava.runner;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import javax.swing.*;

import java.util.*;
import org.openide.util.Exceptions;



/**
 * Functions provides GML like functions for java!
 * @author G-Java development team
 * @version 1.0
 */
public class Functions
{
    
    private static Clipboard systemClipboard;
    
    private static INIFile ini;
    
    private static Image backImage;
    
    private static Highscore highscore = new Highscore();
    
    private static Calendar then;
    
    private static final int dateConvert = 86400000;
    
    /**
     * This is run at the start of the game.
     */
    static
    {
        Setup_Functions();
        // load_image();
    }
    
    /**
     * <h2>Math Functions</h2>
     * The following functions exist that deal with real numbers. All of these functions require the G-Java api functions. These functions mainly deal with doubles, for more math functions for other data types such as float look into java.lang.Math. Although the G-java API provides more functions for math than java.lang.Math!<br>
     * <br>
     * To use:<br>
     * Functions.math.functionname(args);<br>
     * <br>
     * The code completion in the java editor will bring up a list of functions as soon as you type the "." in math, if not you can manually call code completion using Ctrl+Space.<br>
     * <br>
     * Example:<br>
     * <code>int randomnumber = Functions.math.random(10); //Random number between 0 and 10</code>
     */
    public static class math
    {
        
        /**
         * The mathematical constant PI to 17 decimal places
         *  @since 2.0
         */
        public static double PI = 3.14159265516355584;
        
        /**
         * The mathematical constant E, the base of the natural logarithms
         */
        public static double E = Math.E;
        
        /**
         * Returns the cube root of a double value. For positive finite x, cbrt(-x) == -cbrt(x); that is, the cube root of a negative value is the negative of the cube root of that value's magnitude.
         *
         * @param x
         * @return
         */
        public static double cbrt(double x)
        {
            return Math.cbrt(x);
        }
        
        /**
         * Returns a random real number between 0 and x. The number is always smaller than x.
         * @param x
         * @return
         */
        public static double random(double x)
        {return Math.random()*x;}
        /**
         * Returns the absolute value of x.
         * @param x
         * @return
         */
        public static double abs(double x)
        {return Math.abs(x);}
        /**
         * Returns the sign of x (-1, 0 or 1).
         * @param x
         * @return
         */
        public static double sign(double x)
        {return (x<0?-1:(x>0?1:0));}
        /**
         * Returns x rounded to the nearest integer.
         * @param x
         * @return
         */
        public static double round(double x)
        {return Math.round(x);}
        
        /**
         * Returns the floor of x, that is, x rounded down to an integer.
         * @param x
         * @return
         */
        public static double floor(double x)
        {return Math.floor(x);}
        /**
         * Returns the ceiling of x, that is, x rounded up to an integer.
         * @param x
         * @return
         */
        public static double ceil(double x)
        {return Math.ceil(x);}
        /**
         * Returns the fractional part of x, that is, the part behind the decimal dot.
         * @param x
         * @return the fractional part of x, that is, the part behind the decimal dot.
         */
        public static double frac(double x)
        {return x-Math.floor(x);}
        /**
         * Returns the square root of x. x must be non-negative.
         * @param x
         * @return the square root of x. x must be non-negative.
         */
        public static double sqrt(double x)
        {return Math.sqrt(x);}
        /**
         * Returns x*x.
         * @param x
         * @return x*x.
         */
        public static double sqr(double x)
        {return x*x;}
        
        /**
         * Returns x to the power n.
         * @param x
         * @param n
         * @return
         */
        public static double power(double x,double n)
        {return Math.pow(x,n);}
        /**
         * Returns e to the power x.
         * @param x
         * @return
         */
        public static double exp(double x)
        {return Math.log(x)/Math.log(Math.E);}
        /**
         * Returns the natural logarithm of x.
         * @param x
         * @return
         */
        public static double ln(double x)
        {return 0;}
        /**
         * Returns the log base 2 of x.
         * @param x
         * @return
         */
        public static double log2(double x)
        {return Math.log(x)/Math.log(2);}
        /**
         * Returns the log base 10 of x.
         * @param x
         * @return
         */
        public static double log10(double x)
        {return Math.log(x);}
        /**
         * Returns the log base n of x.
         * @param n
         * @param x
         * @return
         */
        public static double logn(double n,double x)
        {return Math.log(x)/Math.log(n);}
        /**
         * Returns the sine of x (x in radians).
         * @param x
         * @return
         */
        public static double sin(double x)
        {return Math.sin(x);}
        
        /**
         * Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
         * @param x
         * @return
         */
        public static double signum(double x)
        {
            return Math.signum(x);
        }
        /**
         * Returns the hyperbolic sine of x
         * @param x
         * @return
         */
        public static double sinh(double x)
        {
            return Math.sinh(x);
        }
        /**
         * Returns the cosine of x (x in radians).
         * @param x
         * @return
         */
        public static double cos(double x)
        {return Math.cos(x);}
        /**
         * Returns the hyperbolic cosine of x.
         * @param x
         * @return
         */
        public static double cosh(double x)
        {
            return Math.cosh(x);
        }
        
        /**
         * Returns ex -1.
         * @param x
         * @return
         */
        public static double expm1(double x)
        {
            return Math.expm1(x);
        }
        
        /**
         * Returns sqrt(x*x +y*y) without intermediate overflow or underflow.
         * @param x
         * @param y
         * @return
         */
        public static double hypot(double x,double y)
        {
            return Math.hypot(x, x);
        }
        /**
         * Returns the size of an ulp of the argument.
         * @param x
         * @return
         */
        public static double ulp(double x)
        {
            return Math.ulp(x);
        }
        
        /**
         * Returns the hyperbolic tangent of x
         * @param x
         * @return
         */
        public static double tanh(double x)
        {
            return Math.tanh(x);
        }
        
        /**
         * Returns the tangent of x (x in radians).
         * @param x
         * @return
         */
        public static double tan(double x)
        {return Math.tan(x);}
        /**
         * Returns the inverse sine of x.
         * @param x
         * @return
         */
        public static double arcsin(double x)
        {return Math.asin(x);}
        /**
         * Returns the inverse cosine of x.
         * @param x
         * @return
         */
        public static double arccos(double x)
        {return Math.acos(x);}
        /**
         * Returns the inverse tangent of x.
         * @param x
         * @return
         */
        public static double arctan(double x)
        {return Math.atan(x);}
        /**
         * Calculates arctan(Y/X), and returns an angle in the correct quadrant.
         * @param y
         * @param x
         * @return
         */
        public static double arctan2(double y,double x)
        {return Math.atan2(y,x);}
        /**
         * Converts degrees to radians.
         * @param x degrees to convert
         * @return radians double value
         */
        public static double degtorad(double x)
        {return Math.toRadians(x);}
        /**
         * Converts radians to degrees.
         * @param x radians to convert
         * @return degrees double value
         */
        public static double radtodeg(double x)
        {return Math.toDegrees(x);}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double min(double v1,double v2)
        {return Math.min(v1,v2);}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @return
         */
        public static double min(double v1,double v2,double v3)
        {
            return min(v3,min(v1,v2));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4)
        {
            return min(v4,min(v3,min(v1,v2)));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5)
        {
            return min(v5,min(v4,min(v3,min(v1,v2))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6)
        {
            return min(v6,min(v5,min(v4,min(v3,min(v1,v2)))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
        {
            return min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @param v8
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
        {
            return min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @param v8
         * @param v9
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
        {
            return min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va)
        {
            return min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb)
        {
            return min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc)
        {
            return min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd)
        {
            return min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve)
        {
            return min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf)
        {
            return min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
        {
            return min(vg,min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))))))));}
        /**
         * Returns the maximum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double max(double v1,double v2)
        {return Math.max(v1,v2);}
        public static double max(double v1,double v2,double v3)
        {
            return max(v3,max(v1,v2));}
        public static double max(double v1,double v2,double v3,double v4)
        {
            return max(v4,max(v3,max(v1,v2)));}
        public static double max(double v1,double v2,double v3,double v4,double v5)
        {
            return max(v5,max(v4,max(v3,max(v1,v2))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6)
        {
            return max(v6,max(v5,max(v4,max(v3,max(v1,v2)))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
        {
            return max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
        {
            return max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
        {
            return max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va)
        {
            return max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb)
        {
            return max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc)
        {
            return max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd)
        {
            return max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve)
        {
            return max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf)
        {
            return max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
        {
            return max(vg,max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))))))));}
        /**
         * Returns the average of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double mean(double v1,double v2)
        {return (v1+v2)/2;}
        public static double mean(double v1,double v2,double v3)
        {
            return (v1+v2+v3)/3;}
        public static double mean(double v1,double v2,double v3,double v4)
        {
            return (v1+v2+v3+v4)/4;}
        public static double mean(double v1,double v2,double v3,double v4,double v5)
        {
            return (v1+v2+v3+v4+v5)/5;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6)
        {
            return (v1+v2+v3+v4+v5+v6)/6;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7)
        {
            return (v1+v2+v3+v4+v5+v6+v7)/7;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8)/8;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9)/9;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va)/10;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb)/11;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc)/12;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd)/13;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve)/14;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve+vf)/15;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg)
        {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve+vf+vg)/16;}
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a)
        {
            return a;
        }
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b)
        {
            if(a<b)
            {
                return a;
            }
            else
            {
                return b;
            }
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c)
        {
            double[] x = new double[] {a, b, c};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d)
        {
            double[] x = new double[] {a, b, c, d};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e)
        {
            double[] x = new double[] {a, b, c, d, e};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f)
        {
            double[] x = new double[] {a, b, c, d, e, f};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g)
        {
            double[] x = new double[] {a, b, c, d, e, f, g};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h)
        {
            double[] x = new double[] {a, b, c, d, e, f, g , h};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
            Arrays.sort(x);
            return x[7];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
            Arrays.sort(x);
            return x[7];
        }
        
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a)
        {
            return a;
        }
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b)
        {
            return (a+b)/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c)
        {
            double[] x = new double[] {a, b, c};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d)
        {
            double[] x = new double[] {a, b, c, d};
            Arrays.sort(x);
            return (x[1]+x[2])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e)
        {
            double[] x = new double[] {a, b, c, d, e};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f)
        {
            double[] x = new double[] {a, b, c, d, e, f};
            Arrays.sort(x);
            return (x[2]+x[3])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g)
        {
            double[] x = new double[] {a, b, c, d, e, f, g};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h)
        {
            double[] x = new double[] {a, b, c, d, e, f, g , h};
            Arrays.sort(x);
            return (x[3]+x[4])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j};
            Arrays.sort(x);
            return (x[4]+x[5])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l};
            Arrays.sort(x);
            return (x[5]+x[6])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n};
            Arrays.sort(x);
            return (x[6]+x[7])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @param b
         * @param c
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
            Arrays.sort(x);
            return x[7];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @param b
         * @param c
         * @param d
         * @param e
         * @param f
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p)
        {
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
            Arrays.sort(x);
            return (x[7]+x[8])/2;
        }
        
        
        /**
         * Returns the distance between point (x1,y1) and point (x2,y2).
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_distance(double x1,double y1,double x2,double y2)
        {return Math.sqrt(sqr(x2-x1)+sqr(y2-y1));}
        /**
         * Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_direction(double x1,double y1,double x2,double y2)
        {
            if (y1<y2&&x1==x2)
                return 90;
            else if (y1>y2&&x1==x2)
                return 270;
            double basic = Math.atan((y1-y2)/(x1-x2));
            if (x1<x2&&y1>y2)
                return basic;
            else if (x1>x2&&y1>y2)
                return 90+basic;
            else if (x1>x2&&y1<y2)
                return basic-180;
            else
                return 360+basic;
        }
        
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(String a)
        { return true; }
        
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(double a)
        { return false; }
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(boolean a)
        { return false; }
        
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(String a)
        { return false; }
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(double a)
        { return true; }
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(boolean a)
        { return false; }
        
        
        /**
         * Returns the horizontal x-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return length
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_x(double len, double dir)
        {
            return len * cos(dir);
        }
        /**
         * Returns the vertical y-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_y(double len,double dir)
        {
            return len * sin(dir);
        }
    }
    
    /**
     * <h2>String Functions</h2>
     * <p>The following functions deal with characters and string. </p>
     * <p>To use:<br>
     * Functions.string.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after string, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ascivalue = Functions.string.chr(40);</p>
     */
    public static class string
    {
        // String functions
        /**
         * Returns a string containing the character with asci code val.
         * @param v
         * @return
         */
        public static String chr(double v)
        {
            return "" + (char) (int) v;
        }
        
        /**
         *  Returns the asci code of the first character in str.
         * @param s
         * @return
         */
        public static double ord(String s)
        {
            return (int) s.charAt(0);
        }
        
        /**
         * Turns str into a real number. str can contain a minus sign, a decimal dot and even an exponential part.
         * @param s
         * @return
         */
        public static double real(String s)
        {
            return Double.parseDouble(s);
        }
        
        /**
         * Turns the real value into a string using a standard format (no decimal places when it is an integer, and two decimal places otherwise).
         * @param v
         * @return
         */
        public static String string(double v)
        {
            return "" + v;
        }
        
        /**
         * Turns val into a string using your own format: tot indicates the total number of places and dec indicated the number of decimal places.
         * @param v
         * @param t
         * @param d
         * @return
         */
        public static String string_format(double v,double t,double d)
        {
            String form = "";
            for (int i = 0; i < (int) t; i++)
                form += "0";
            if (d > 0)
            {
                form += ".";
                for (int i = 0; i < (int) d; i++)
                    form += "0";
            }
            DecimalFormat df = new DecimalFormat(form);
            return df.format(v,new StringBuffer(),null).toString();
        }
        
        /**
         * Returns the number of characters in the string.
         * @param s
         * @return
         */
        public static double string_length(String s)
        {
            return s.length();
        }
        
        /**
         * Returns the position of substr in str (0=no occurrence).
         * @param sub
         * @param s
         * @return
         */
        public static double string_pos(String sub,String s)
        {
            return (s.indexOf(sub) != -1 ? s.indexOf(sub) : 0);
        }
        
        /**
         * Returns a substring of str, starting at position index, and of length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_copy(String s,double i,double c)
        {
            return s.substring((int) i,(int) (i + c));
        }
        
        /**
         * Returns the character in str at position index.
         * @param s
         * @param i
         * @return
         */
        public static String string_char_at(String s,double i)
        {
            return "" + s.charAt((int) i);
        }
        
        /**
         * Returns a copy of str with the part removed that starts at position index and has length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_delete(String s,double i,double c)
        {
            return s.substring(0,(int) i) + s.substring((int) (i + c));
        }
        
        /**
         * Returns a copy of str with substr added at position index.
         * @param sub
         * @param s
         * @param i
         * @return
         */
        public static String string_insert(String sub,String s,double i)
        {
            return s.substring(0,(int) i) + sub + s.substring((int) i + 1);
        }
        
        /**
         * Returns a copy of str with the first occurrence of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace(String s,String sub,String n)
        {
            return s.replaceFirst(sub,n);
        }
        
        /**
         * Returns a copy of str with all occurrences of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace_all(String s,String sub,String n)
        {
            return s.replaceAll(sub,n);
        }
        
        /**
         * Returns the number of occurrences of substr in str.
         * @param sub
         * @param s
         * @return
         */
        public static double string_count(String sub,String s)
        {
            int c = 0;
            for (c = 0; s.indexOf(sub) != -1; c++)
                s.replaceFirst(sub,"");
            return c;
        }
        
        /**
         * Returns a lowercase copy of str.
         * @param s
         * @return
         */
        public static String string_lower(String s)
        {
            return s.toLowerCase();
        }
        
        /**
         * Returns an uppercase copy of str.
         * @param s
         * @return
         */
        public static String string_upper(String s)
        {
            return s.toUpperCase();
        }
        
        /**
         * Returns a string consisting of count copies of str.
         * @param s
         * @param c
         * @return
         */
        public static String string_repeat(String s,double c)
        {
            for (int i = 0; i < c - 1; i++)
                s += s;
            return s;
        }
        
        /**
         * Returns a string that only contains the letters in str.
         * @param s
         * @return
         */
        public static String string_letters(String s)
        {
            for (int i = 0; i < s.length(); i++)
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
                || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122))
                {
                }
                else
                {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            return s;
        }
        
        /**
         * Returns a string that only contains the digits in str.
         * @param s
         * @return
         */
        public static String string_digits(String s)
        {
            for (int i = 0; i < s.length(); i++)
                if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)
                {
                }
                else
                {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            return s;
        }
        
        /**
         * Returns a string that contains the letters and digits in str.
         * @param s
         * @return
         */
        public static String string_lettersdigits(String s)
        {
            for (int i = 0; i < s.length(); i++)
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
                || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)
                || ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57))
                {
                }
                else
                {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            Functions i = new Functions();
            
            return s;
        }
        
    }
    
    /**
     * <h2>Date Functions</h2>
     * <p>In G-Java there are a number of functions to deal with dates and time. A date-time combination is stored in a real number. The integral part of a date-time value is the number of days that have passed since 12/30/1899. The fractional part of the date-time value is fraction of a 24 hour day that has elapsed. </p>
     * <p>To use:
     * Functions.date.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; in date, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:
     * double datetime = Functions.date.date_current_datetime();</p>
     */
    public static class date
    {
        // the date functions/methods
        /**
         * Returns the date-time value that corresponds to the current moment.
         * @return
         */
        public static double date_current_datetime()
        {
            Calendar now = Calendar.getInstance();
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the date-time value that corresponds to the current date only (ignoring the time).
         * @return
         */
        public static double date_current_date()
        {
            Calendar now = Calendar.getInstance();
            now.set(Calendar.HOUR_OF_DAY,0);
            now.set(Calendar.MINUTE,0);
            now.set(Calendar.SECOND,0);
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the date-time value that corresponds to the current time only (ignoring the date).
         * @return
         */
        public static double date_current_time()
        {
            Calendar now = Calendar.getInstance();
            now.set(Calendar.YEAR,then.get(Calendar.YEAR));
            now.set(Calendar.MONTH,then.get(Calendar.MONTH));
            now.set(Calendar.DATE,then.get(Calendar.DATE));
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated date and time.
         * @param y
         * @param m
         * @param d
         * @param h
         * @param min
         * @param s
         * @return
         */
        public static double date_create_datetime(double y,double m,double d,double h,double min,double s)
        {
            Calendar nDate = Calendar.getInstance();
            nDate.set((int) y,(int) m - 1,(int) d,(int) h,(int) min,(int) s);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated date.
         * @param y
         * @param m
         * @param d
         * @return
         */
        public static double date_create_date(double y,double m,double d)
        {
            Calendar nDate = Calendar.getInstance();
            nDate.set((int) y,(int) m,(int) d,0,0,0);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated time.
         * @param h
         * @param m
         * @param s
         * @return
         */
        public static double date_create_time(double h,double m,double s)
        {
            Calendar nDate = Calendar.getInstance();
            nDate.set(then.get(Calendar.YEAR),then.get(Calendar.MONTH),then.get(Calendar.DATE),(int) h,(int) m,
                    (int) s);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns whether the indicated date and time are valid.
         * @param y
         * @param m
         * @param d
         * @param h
         * @param min
         * @param s
         * @return
         */
        public static double date_valid_datetime(double y,double m,double d,double h,double min,double s)
        {
            if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
            if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
            if (d - Math.floor(d) != 0) return 0;
            if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
                return 0;
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
                return 0;
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
            if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
            if (min < 0 || min >= 60 || min - Math.floor(min) != 0) return 0;
            if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
            return 1;
        }
        
        /**
         * Returns whether the indicated date is valid.
         * @param y
         * @param m
         * @param d
         * @return
         */
        public static double date_valid_date(double y,double m,double d)
        {
            if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
            if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
            if (d - Math.floor(d) != 0) return 0;
            if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
                return 0;
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
                return 0;
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
            return 1;
        }
        
        /**
         * Returns whether the indicated time is valid.
         * @param h
         * @param m
         * @param s
         * @return
         */
        public static double date_valid_time(double h,double m,double s)
        {
            if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
            if (m < 0 || m >= 60 || m - Math.floor(m) != 0) return 0;
            if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
            return 1;
        }
        
        /**
         * Returns a new date that is amount years after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_year(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.YEAR,nDate.get(Calendar.YEAR) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount months after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_month(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.MONTH,nDate.get(Calendar.MONTH) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount weeks after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_week(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + 7 * (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount days after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_day(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount hours after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_hour(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.HOUR_OF_DAY,nDate.get(Calendar.HOUR_OF_DAY) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount minutes after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_minute(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.MINUTE,nDate.get(Calendar.MINUTE) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount seconds after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_second(double d,double a)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.SECOND,nDate.get(Calendar.SECOND) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_year(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.YEAR);
        }
        
        /**
         * Returns the month corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_month(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.MONTH);
        }
        
        /**
         * Returns the week of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_week(double d) // Figure out week
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DATE);
        }
        
        /**
         * Returns the day of the month corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_day(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DATE);
        }
        
        /**
         * Returns the hour corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_hour(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.HOUR_OF_DAY);
        }
        
        /**
         * Returns the minute corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_minute(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.MINUTE);
        }
        
        /**
         * Returns the second corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_second(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.SECOND);
        }
        
        /**
         * Returns the day of the week corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_weekday(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DAY_OF_WEEK);
        }
        
        /**
         * Returns the day of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_day_of_year(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DAY_OF_YEAR);
        }
        
        /**
         * Returns the hour of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_hour_of_year(double d)
        {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            return nDate.get(Calendar.HOUR_OF_DAY) + date * 24;
        }
        
        /**
         * Returns the minute of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_minute_of_year(double d)
        {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
            return nDate.get(Calendar.MINUTE) + hour * 60;
        }
        
        /**
         * Returns the second of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_second_of_year(double d)
        {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
            int min = nDate.get(Calendar.MINUTE) - 1 + hour * 60;
            return nDate.get(Calendar.SECOND) + min * 60;
        }
        
        /**
         * Returns the number of years between the two dates. It reports incomplete years as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_year_span(double d1,double d2)
        {
            return d1 * 365.25 - d2 * 365.25;
        }
        
        /**
         * Returns the number of months between the two dates. It reports incomplete months as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_month_span(double d1,double d2)
        {
            return date_get_month(d1) - date_get_month(d2);
        }
        
        /**
         * Returns the number of weeks between the two dates. It reports incomplete weeks as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_week_span(double d1,double d2)
        {
            return date_get_week(d1) - date_get_week(d2);
        }
        
        /**
         * Returns the number of days between the two dates. It reports incomplete days as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_day_span(double d1,double d2)
        {
            return date_get_day(d1) - date_get_day(d2);
        }
        
        /**
         * Returns the number of hours between the two dates. It reports incomplete hours as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_hour_span(double d1,double d2)
        {
            return date_get_hour(d1) - date_get_hour(d2);
        }
        
        /**
         * Returns the number of minutes between the two dates. It reports incomplete minutes as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_minute_span(double d1,double d2)
        {
            return date_get_minute(d1) - date_get_minute(d2);
        }
        
        /**
         * Returns the number of seconds between the two dates. It reports incomplete seconds as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_second_span(double d1,double d2)
        {
            return date_get_second(d1) - date_get_second(d2);
        }
        
        /**
         * Compares the two date-time values. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_datetime(double d1,double d2)
        {
            return (d1 > d2 ? 1 : (d1 < d2 ? -1 : 0));
        }
        
        /**
         * Compares the two date-time values only taking the date part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_date(double d1,double d2)
        {
            return (Math.floor(d1) > Math.floor(d2) ? 1 : (Math.floor(d1) < Math.floor(d2) ? -1 : 0));
        }
        
        /**
         * Compares the two date-time values only taking the time part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_time(double d1,double d2)
        {
            return (Functions.math.frac(d1) > Functions.math.frac(d2) ? 1 : (Functions.math.frac(d1) < Functions.math.frac(d2) ? -1 : 0));
        }
        
        /**
         * Returns the date part of the indicated date-time value, setting the time part to 0.
         * @param d
         * @return
         */
        public static double date_date_of(double d)
        {
            return Math.floor(d);
        }
        
        /**
         * Returns the time part of the indicated date-time value, setting the date part to 0.
         * @param d
         * @return
         */
        public static double date_time_of(double d)
        {
            return Functions.math.frac(d);
        }
        
        /**
         * Returns a string indicating the given date and time in the default format for the system.
         * @param d
         * @return
         */
        public static String date_datetime_string(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.toString();
        }
        
        /**
         * Returns a string indicating the given date in the default format for the system.
         * @param d
         * @return
         */
        public static String date_date_string(double d)
        {
            long milis = (int) (Math.floor(d) * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.toString();
        }
        
        /**
         * Returns a string indicating the given time in the default format for the system.
         * @param d
         * @return
         */
        public static String date_time_string(double d)
        {
            long milis = (int) (Functions.math.frac(d) * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(milis);
            return nDate.toString();
        }
        
        /**
         * Returns the number of days in the month indicated by the date-time value.
         * @param d
         * @return
         */
        public static double date_days_in_month(double d)
        {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            return days[nDate.get(Calendar.MONTH) - 1];
        }
        
        /**
         * Returns the number of days in the year indicated by the date-time value.
         * @param d
         * @return
         */
        public static double date_days_in_year(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0)
                return 366;
            else
                return 365;
        }
        
        /**
         * Returns whether the year indicated by the date-time value is a leap year.
         * @param d
         * @return
         */
        public static double date_leap_year(double d)
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return (nDate.get(Calendar.YEAR) % 4 == 0 ? 1 : 0);
        }
        
        /**
         * Returns whether the indicated date-time value is on today.
         * @param d
         * @return
         */
        public static double date_is_today(double d)
        {
            return (date_current_date() == date_date_of(d) ? 1 : 0);
        }
        
    }
    
    /**
     * <h2>Clipboard Functions</h2>
     * <p>The following functions deal with the clipboard for storing text. </p>
     * <p>   To use:<br>
     * Functions.clipboard.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after clipboard, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ctext = Functions.clipboard.clipboard_get_text();</p>
     */
    public static class clipboard
    {
        
        /**
         * Returns whether there is any text on the clipboard.
         * @return
         */
        public static double clipboard_has_text()
        {
            Transferable clipboardContents = systemClipboard.getContents(null);
            return (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor) ? 1 : 0);
        }
        
        /**
         * Returns the current text on the clipboard.
         * @return
         */
        public static String clipboard_get_text()
        {
            Transferable clipboardContents = systemClipboard.getContents(null);
            if (clipboardContents == null)
            {
                return "";
            }
            else
                try
                {
                    if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor))
                    {
                        String returnText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                        return returnText;
                    }
                }
                catch (UnsupportedFlavorException ufe)
                {
                }
            catch (IOException ioe)
            {
            }
            return "";
        }
        
        /**
         * Sets the string str on the clipboard.
         * @param s
         * @return
         */
        public static double clipboard_set_text(String s)
        {
            Transferable transferableText = new StringSelection(s);
            systemClipboard.setContents(transferableText,null);
            return 0;
        }
        
        
    }
    
    /**
     * <h2> Move Functions</h2>
     * <p>There are a large number of functions available that help you in defining your motions in the G-Java API: </p>
     * <p>To use:<br>
     * Functions.move.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after move, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * if (Functions.move.place_free(10,10))<br>
     * {<br>
     * //do some code<br>
     * } </p>
     */
    public static class move
    {
        
        /**
         * Sets the motion with the given speed in direction dir.
         * @param applies The actor to use
         * @param dir The direction
         * @param speed The speed
         * @author TGMG
         * @since 2.0
         */
        public static void motion_set(Actor applies, double dir, double speed)
        {
            applies.hspeed = -speed;
            applies.vspeed = speed * Math.sin(dir * (Math.PI/180));
        }
        
        /**
         * Adds the motion to the current motion (as a vector addition).
         * @param applies The actor to use
         * @param dir The direction
         * @param speed The speed
         * @author TGMG
         * @since 2.0
         */
        public static void motion_add(Actor applies, double dir, double speed)
        {
            applies.hspeed =  applies.hspeed-speed;
            applies.vspeed =  applies.vspeed + speed * Math.sin(dir * (Math.PI/180));
        }
        
        /**
         * Returns whether the instance placed at position (x,y) meets nobody. So this function takes also non-solid instances into account.
         * @param x
         * @param y
         * @return true if place is empty, false otherwise
         */
        public static boolean place_empty(double x,double y)
        {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size())
            {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                Rectangle thisBounds = dt.getBounds( dt.x, dt.y);
                
                if (thisBounds.contains(x,y))
                {
                    return false;
                }
                else
                {
                    jii++;
                }
            }
            return true;
        }
        
        /**
         * Returns whether the instance placed at position(x,y) is collision-free. This is typically used as a check before actually moving to the new position.
         * @param x
         * @param y
         * @return true if place is collision-free, false otherwise
         */
        public static boolean place_free(double x,double y)
        {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size())
            {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                Rectangle thisBounds = dt.getBounds((int) dt.x,(int) dt.y);
                
                if ((thisBounds.contains(x,y)) && (dt.solid))
                {
                    return false;
                }
                else
                {
                    jii++;
                }
            }
            return true;
        }
        
        /**
         * Returns whether the instance placed at position (x,y) meets the other actor.
         * @param x
         * @param y
         * @param other
         * @return
         */
        public static boolean place_meeting(double x, double y, Actor other)
        {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size())
            {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                if (dt.equals(other))
                {
                    Rectangle thisBounds = dt.getBounds((int) dt.x,(int) dt.y);
                    
                    if ((thisBounds.contains(x,y)))
                    {
                        return true;
                    }
                    else
                    {
                        jii++;
                    }
                }
            }
            return false;
        }
        
        /**
         * Returns whether the instance is aligned with the snapping values.
         * @param instance
         * @param hsnap
         * @param vsnap
         * @return
         */
        public static boolean place_snapped(Actor instance, double hsnap,double vsnap)
        {
            if ((instance.x % hsnap ==0) && (instance.y % vsnap==0))
                return true;
            else
                return false;
        }
        
        /**
         * Moves the instance to a free random, snapped position, like the corresponding action.
         * @param instance
         * @param snaphor
         * @param snapver
         */
        public static void move_random(Actor instance, double snaphor,double snapver)
        {
            int xx = (int) Functions.math.random(basicgame.Current_room.get_width());
            int yy = (int)Functions.math.random(basicgame.Current_room.get_height());
            
            if (!(snaphor == 0))
                xx = (int)(xx/snaphor * Functions.math.round(snaphor));
            if (!(snaphor == 0))
                yy = (int)(yy/snaphor * Functions.math.round(snapver));
            while (!Functions.move.place_free(xx,yy))
            {
                xx = (int)Functions.math.random(basicgame.Current_room.get_width());
                yy = (int)Functions.math.random(basicgame.Current_room.get_height());
                if (!(snaphor == 0))
                    xx = (int)(xx/snaphor * Functions.math.round(snaphor));
                if (!(snaphor == 0))
                    yy = (int)(yy/snaphor * Functions.math.round(snapver));
            }
            instance.x = xx;
            instance.y = yy;
        }
        
        
        /**
         * Snaps the instance, like the corresponding action.
         * @param instance
         * @param snaphor
         * @param vsnap
         */
        public static void move_snap(Actor instance, double snaphor,double snapver)
        {
            instance.x = instance.x/snaphor * Functions.math.round(snaphor);
            instance.y = instance.y/snapver * Functions.math.round(snapver);
        }
        
        /**
         * Wraps the instance when it has left the room to the other side. hor indicates whether to wrap horizontaly and vert indicates whether to wrap vertically. margin indicates how far the origin of the instance must be outside the room before the wrap happens. So it is a margin around the room. You typically use this function in the Outside event.
         * @param instance
         * @param hor
         * @param vert
         * @param margin
         */
        public static void move_wrap(Actor instance, boolean hor, boolean vert, double margin)
        {
            //TODO move_wrap
        }
        
        /**
         * Moves the instances with speed sp toward position (x,y).
         * @param instance
         * @param x
         * @param y
         * @param speed
         */
        public static void move_towards_point(Actor instance, double x, double y, double speed)
        {
            //TODO move_towards_point
        }
        
    }
    
    /**
     * <h2>Instances</h2>
     * <p>In the game, the basic units are the instances of the different actors. During   game play you can change a number of aspects of these instances. Also you can   create new instances and destroy instances.
     * <p>To use:<br>
     * Functions.instance.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after instance, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     *
     */
    public static class instance
    {
        /**
         * Number of instances that currently exist in the room.
         * @return
         */
        public static int instance_count()
        {
            return basicgame.Current_room.instances.size();
        }
        
        /**
         * The Actor object of the particular instance. Here n is the number of instance.
         * @param id
         * @return
         */
        public static Actor instance_actor(int id)
        {
            return (Actor)basicgame.Current_room.instances.get(id);
        }
        
        
        
    }
    
    /**
     * <h2>The Display Functions</h2>
     * <p>The display represents the whole area on the monitor. It has a size (typically   1024x768, or 1280x1024), a color depth, that is, the number of bits that are   used to represent a single pixel (typically 16 = High Color or 32 = Full Color)   and a refresh frequency, that is, the number of times per second the display is   refreshed (typically between 60 and 120). These settings can normally be changed   though the display properties. For games though, in particular when they run in   full-screen mode, it is important to be able to change these settings. All these   settings can be initialized for the game in the <strong>Project Settings</strong>. For use   during game play the following functions exist. Note though that changing the   settings during game play will result in a time delay as things has to be   rebuilt.</p>
     * <p>To use:<br>
     * Functions.display.<strong>&lt;functionname&gt;</strong>(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after display, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * double w = Functions.display.<strong>display_get_width()</strong>;</p>
     */
    public static class display
    {
        static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        static GraphicsDevice gs = ge.getDefaultScreenDevice();
        static DisplayMode dm = gs.getDisplayMode();
        static DisplayMode original = gs.getDisplayMode();
        
        /**
         * Returns the width of the display in pixels.
         * @return width of the display in pixels.
         * @since 2.0
         */
        public static double display_get_width()
        {
            return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }
        /**
         * Returns the height of the display in pixels.
         * @return
         * @since 2.0
         */
        public static double display_get_height()
        {
            return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        }
        
        /**
         * Returns the color depth in bits.
         * @return the color depth in bits.
         * @since 2.0
         */
        public static int display_get_colordepth()
        {
            // Get number of colors
            int bitDepth = dm.getBitDepth();
            if (bitDepth == DisplayMode.BIT_DEPTH_MULTI)
            {
                // Multiple bit depths are supported in this display mode
                return 0;
            }
            else
            {
                return (int)Math.pow(2, bitDepth);
            }
        }
        
        /**
         * Returns the refresh frequency of the display.
         * @return
         * @since 2.0
         */
        public static int display_get_frequency()
        {
            // Get refresh rate in Hz
            return dm.getRefreshRate();
        }
        
        /**
         * Sets the width and height of the display in pixels. Returns whether this was successful. (Realize that only certain combinations are allowed.)
         * @param w
         * @param h
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_size(int w,int h)
        {
            DisplayMode displayMode = new DisplayMode(
                    w, h, display_get_colordepth(), display_get_frequency());
            try
            {
                gs.setDisplayMode(displayMode);
                return true;
            }
            catch (Throwable e)
            {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets the color depth. In general only 16 and 32 are allowed values. Returns whether successful.
         * @param coldepth
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_colordepth(int coldepth)
        {
            DisplayMode displayMode = new DisplayMode(
                    (int)display_get_width(), (int)display_get_height(), coldepth, display_get_frequency());
            try
            {
                gs.setDisplayMode(displayMode);
                return true;
            }
            catch (Throwable e)
            {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets the refresh frequency for the display. Only few frequencies are allowed. Typically you could set this to 60 with a same room speed to get smooth 60 frames per second motion. Returns whether successful.
         * @param frequency
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_frequency(double frequency)
        {
            DisplayMode displayMode = new DisplayMode(
                    (int)display_get_width(), (int)display_get_height(), display_get_colordepth(), (int)frequency);
            try
            {
                gs.setDisplayMode(displayMode);
                return true;
            }
            catch (Throwable e)
            {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets all at once. Returns whether successful.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether successful.
         * @since 2.0
         */
        public static boolean display_set_all(double w,double h,double frequency,double coldepth)
        {
            DisplayMode displayMode = new DisplayMode(
                    (int)w, (int)h, (int)coldepth, (int)frequency);
            try
            {
                gs.setDisplayMode(displayMode);
                return true;
            }
            catch (Throwable e)
            {
                // Desired display mode is not supported
                return false;
            }
        }
        
        /**
         * Tests whether the indicated settings are allowed. It does not change the settings. Returns whether the settings are allowed.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether the settings are allowed.
         * @since 2.0
         */
        public static boolean display_test_all(double w,double h,double frequency,double coldepth)
        {
            DisplayMode displayMode = new DisplayMode(
                    (int)w, (int)h, (int)coldepth, (int)frequency);
            try
            {
                DisplayMode backup = gs.getDisplayMode();
                gs.setDisplayMode(displayMode);
                gs.setDisplayMode(backup);
                return true;
            }
            catch (Throwable e)
            {
                // Desired display mode is not supported
                
                return false;
            }
        }
        
        /**
         * Resets the display settings to the ones when the program was started.
         * @since 2.0
         */
        public static void display_reset()
        {
            gs.setDisplayMode(original);
            
        }
        
        /**
         * Returns the x-coordinate of the mouse on the display.<br>
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return the x-coordinate of the mouse on the display.
         * @since 2.0
         */
        public static double display_mouse_get_x()
        {
            return MouseInfo.getPointerInfo().getLocation().getX();
        }
        
        /**
         * Returns the y-coordinate of the mouse on the display.
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return
         * @since 2.0
         */
        public static double display_mouse_get_y()
        {
            return MouseInfo.getPointerInfo().getLocation().getY();
        }
        
        /**
         * Sets the position of the mouse on the display to the indicated values.
         * @param x
         * @param y
         * @since 2.0
         */
        public static void display_mouse_set(double x,double y)
        {
            try
            {
                java.awt.Robot robot = new java.awt.Robot();
                robot.mouseMove((int) x, (int) y);
            }
            catch (AWTException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        
    }
    
    /**
     *
     */
    public static class draw_shapes
    {
        
        /**
         * Clears the entire room in the given color (no alpha blending).
         * @param col Color to clear the room to
         */
        public static void draw_clear(Color col)
        {
            if (basicgame.Current_room.graphics != null)
            {
                basicgame.Current_room.graphics.setColor( col );
                basicgame.Current_room.graphics.fillRect( 0, 0, basicgame.Current_room.width, basicgame.Current_room.height );
            }
            
            
        }
    }
    
    /**
     * In the game, the basic units are the instances of the different objects. During game play you can change a number of aspects of these instances. Also you can create new instances and destroy instances.
     */
    public static class instances
    {
        /**
         * Creates an instance of act at position (x,y). The function returns the Actor object of the new instance.
         * @param x
         * @param y
         * @param act
         */
        public static void instance_create(double x,double y,Actor act)
        {
            // (act.getClass()) instance = new act.getClass()(x,y,basicgame.Current_room.instance_id);
            basicgame.Current_room.instance_id += 1;
            basicgame.Current_room.SortDepth();
            // basicgame.Current_room.instances.add(0, instance);
        }
        
        /**
         * Destroys the current instance.
         * @param instance
         */
        public static void instance_destroy(Actor instance)
        {
            // run the destory event
            instance.Destroy_event();
            basicgame.Current_room.instances.remove(instance.id);
        }
        
        
    }
    
    /**
     * When you create large room, for example in platform games, with a small view, many instances lie outside the view. Such instances though are still active and will execute their events. Also when performing collision checks these instances are taken into account. This can cost a lot of time, which is often not necessary. (For example, often it is not important whether instances outside the view move.) To solve this problem G-Java contains some functions to deactivate and activate instances. Before using them you must though clearly understand how they work.
     * When you deactivate instances they are in some sense removed from the game. They are not visible anymore nor are any events executed for them. So for all actions and functions they don't exist anymore. This saves a lot of time but you have to be careful. For example, when you delete all instances of a particular type, deactivated instances are not deleted (because they don't exist). So don't think that a key a player picks up can unlock a deactivated door.
     *
     * The most crucial mistake you can make is to deactivate the instance that is responsible for the activation.
     *
     */
    public static class deactivating_instances
    {
        
        /**
         * Deactivates all instances in the room. If notme is true the calling instance is not deactivated (which is normally what you want).
         * @param act
         * @param notme
         */
        public static void instance_deactivate_all(Actor act, boolean notme)
        {
            basicgame.Current_room.deactivated = basicgame.Current_room.instances;
            basicgame.Current_room.instances = new Vector();
        }
        
        /**
         * Activates all instances in the room.
         */
        public static void instance_activate_all()
        {
            basicgame.Current_room.instances.addAll(basicgame.Current_room.deactivated);
        }
        
        
    }
    
    /**
     * Good games require careful timing of things happening. Fortunately G-Java does most of the timing for you.
     */
    public static class timing
    {
        /**
         * Speed of the game in the current room (in steps per second).
         */
        public static double room_speed;
        /**
         * Number of frames that are actually drawn per second.
         */
        public static double fps = basicgame.Current_room.averageFPS;
        /**
         * Number of milliseconds that have passed since the system was started.
         */
        public static double current_time = Functions.date.date_current_time();
        /**
         *  The current year.
         */
        public static double current_year = Functions.date.date_get_year(Functions.date.date_current_date());
        
        /**
         *  The current month.
         */
        public static double current_month = Functions.date.date_get_month(Functions.date.date_current_date());
        /**
         * The current day.
         */
        public static double current_day = Functions.date.date_get_day(Functions.date.date_current_date());
        /**
         * The current day of the week (1=sunday, ..., 7=saturday).
         */
        public static double current_weekday = Functions.date.date_get_weekday(Functions.date.date_current_date());
        /**
         * The current hour.
         */
        public static double current_hour = Functions.date.date_get_hour(Functions.date.date_current_time());
        /**
         * The current minute.
         */
        public static double current_minute = Functions.date.date_get_minute(Functions.date.date_current_time());
        /**
         * The current second.
         */
        public static double current_second = Functions.date.date_get_second(Functions.date.date_current_time());
        
        /**
         * Sleeps numb milliseconds.
         * @param numb
         */
        public static void sleep(long numb)
        {
            try
            {
                java.lang.Thread.sleep(numb);
            }
            catch (InterruptedException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        
    }
    
    
    
    /**
     * Games work in rooms. Each room has an index that is indicated by the name of the room. The current room is stored in variable room. You cannot assume that rooms are numbered in a consecutive order. So never add or subtract a number from the room variable. Instead use these functions
     */
    public static class rooms
    {
        
        /**
         * Index of the current room;
         */
        public static int room = basicgame.Current_room.roomid;
        
        /**
         * Index of the first room in the game.
         */
        public static int room_first = load_Rooms.firstroom;
        
        /**
         * Index of the last room in the game.
         */
        public static int room_last = load_Rooms.lastroom;
        
        /**
         * The width of the current room
         */
        public static int room_width = basicgame.Current_room.width;
        
        /**
         * The height of the current room
         */
        public static int room_height = basicgame.Current_room.height;
        
        /**
         * The caption of the current room
         */
        public static String room_caption = basicgame.Current_room.Caption;
        
        /**
         * @deprecated Used for compatibility with gm
         */
        public static boolean room_persistent = false;
        
        /**
         * Goto the room with index roomid.
         * @param roomid
         */
        public static void room_goto(int roomid)
        {
            int GJavalocalroomid = basicgame.Current_room.id;
            if (basicgame.Runningas != "EApplet")
            {
                load_Rooms.change_room(roomid);
            }
            else
            {
                load_Rooms.change_room(roomid,basicgame.Eapplet);
            }
            load_Rooms.remove_room(GJavalocalroomid);
        }
        
        /**
         * Go to the previous room.
         */
        public static void room_goto_previous()
        {
            int GJavalocalroomid = basicgame.Current_room.id;
            if (basicgame.Runningas != "EApplet")
            {
                load_Rooms.prev_room(basicgame.Current_room.roomid);
            }
            else
            {
                load_Rooms.prev_room(basicgame.Current_room.roomid,basicgame.Eapplet);
            }
            load_Rooms.remove_room(GJavalocalroomid);
        }
        /**
         * Go to the next room.
         */
        public static void room_goto_next()
        {
            int GJavalocalroomid = basicgame.Current_room.id;
            if (basicgame.Runningas != "EApplet")
            {
                load_Rooms.next_room(basicgame.Current_room.roomid);
            }
            else
            {
                load_Rooms.next_room(basicgame.Current_room.roomid,basicgame.Eapplet);
            }
            load_Rooms.remove_room(GJavalocalroomid);
        }
        /**
         * Restart the current room.
         */
        public static void room_restart()
        {
            
            if (basicgame.Runningas != "EApplet")
            {
                load_Rooms.restart_room(basicgame.Current_room.roomid);
            }
            else
            {
                load_Rooms.restart_room(basicgame.Current_room.roomid,basicgame.Eapplet);
            }
        }
        /**
         * Return the index of the room before numb(-1 = none) but don't go there.
         * @param numb
         * @return
         */
        public static int room_previous(int numb)
        {
            return basicgame.Current_room.roomid-1;
        }
        
        /**
         * Return the index of the room after numb(-1 = none).
         * @param numb
         * @return
         */
        public static int room_next(int numb)
        {
            return basicgame.Current_room.roomid-1;
        }
        
        /**
         *  End the game.
         */
        public static void end_game()
        {
            // end the game
            if (basicgame.Runningas == "Application")
            {
                // close the application
                System.exit(0);
            }
            else
            {
                // close the applet
                if (basicgame.Runningas == "EApplet")
                {
                    basicgame.Eapplet.stop();
                }
                else
                {
                    load_Rooms.remove_room(basicgame.Current_room.id);
                }
            }
            
        }
        
        /**
         * Restart the game.
         */
        public static void game_restart()
        {
            int GJavalocalroomid = basicgame.Current_room.id;
            if (!basicgame.Runningas.equals("EApplet"))
            {
                load_Rooms.change_room(load_Rooms.firstroom);
            }
            else
            {
                load_Rooms.change_room(load_Rooms.firstroom,basicgame.Eapplet);
            }
            load_Rooms.remove_room(GJavalocalroomid);
            
        }
        
        /**
         * save game to file, only applications or signed applets
         * @param savFilename The filename of the save file to save to
         * @deprecated Not added yet! Does nothing
         */
        public static void game_save(String savFilename)
        {
            
            // File savefile = (File)getClass().getResourceAsStream(savFilename);
            // File savefile = new File((String)(getClass().getResource(savFilename)));
            // OutputStream os = new OutputStream();
            // RandomAccessFile((File)savefile,)
        }
        
        /**
         * Load game from file, only applications or signed applets
         * @deprecated Not added yet! Does nothing
         * @param savFilename The filename of the save file to load from
         */
        public static void game_load(String savFilename)
        {
            
        }
        
        
    }
    
    /**
     * Other important aspects of many games are the score, the health, and the number of lives. G-java keeps track of the score in a global variable score and the number of lives in a global variable lives. You can change the score by simply changing the value of this variable. The same applies to health and lives. If lives is larger than 0 and becomes smaller than or equal to 0 the no-more-lives event is performed for all instances. If you don't want to show the score and lives in the caption, set the variable show_score, etc., to false. Also you can change the caption. For more complicated games best display the score yourself.
     * @since 2.0
     * @author TGMG
     */
    public static class score
    {
        /**
         *  The game score, Starts at 0
         * @since 2.0
         */
        public static int score = 0;
        
        /**
         * Whether to show the score in the window caption.
         * @since 2.0
         */
        public static boolean show_score = true;
        /**
         * Whether to show the number of lives in the window caption.
         * @since 2.0
         */
        public static boolean show_lives = false;
        /**
         * Whether to show the health in the window caption.
         * @since 2.0
         */
        public static boolean show_health = false;
        
        /**
         * The Game lives, default 5
         *  @since 2.0
         */
        public static int lives = 5;
        
        /**
         * The game health, starts at 100
         *  @since 2.0
         */
        public static int health = 100;
        
        /**
         * The score caption
         * @since 2.0
         */
        public static String score_caption = "score:";
        /**
         * The lives caption
         * @since 2.0
         */
        public static String lives_caption = "lives:";
        
        /**
         * The health caption
         * @since 2.0
         */
        public static String health_caption = "health:";
    }
    
    /**
     * Here are some variables and functions that deal with errors.
     */
    public static class debug
    {
        /**
         * Indicates whether an error has occurred, either true or false
         */
        public static boolean   error_occurred;
        /**
         * String indicating the last error message
         */
        public static String error_last="";
        
        /**
         * Just for compatibility with gm! Don't use!
         * @deprecated Just for compatibility with gm
         * @param str
         */
        public static void show_debug_message(String str)
        {
            System.out.println(str);
        }
    }
    
    /**
     * These functions will give you information about a sprite
     */
    public static class resources_sprite
    {
        /**
         * Just for compatibility with gm! Don't use!
         * @deprecated Just for compatibility with gm
         * @param ind
         * @return
         */
        public static boolean sprite_exists(sprite ind)
        {
            return true;
        }
        
        
        /**
         * Returns the name of the sprite.
         * @param ind
         * @return
         */
        public static String sprite_get_name(sprite ind)
        {
            return "";
        }
        /**
         * Returns the number of subimages of the sprite.
         * @param ind
         * @return
         */
        public static int sprite_get_number(sprite ind)
        {
            return ind.subimages;
        }
        /**
         * Returns the width of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_width(sprite ind)
        {
            return ind.sprite_width;
        }
        /**
         * Returns the height of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_height(sprite ind)
        {
            return ind.sprite_height;
        }
        
        /**
         * Returns whether the sprite with the given index is transparent.
         * @param ind
         * @return
         */
        public static boolean sprite_get_transparent(sprite ind)
        {
            return (ind.Transparent == 1);
        }
        /**
         * Not used for G-Java!
         * @deprecated does nothing, used for GM compatibility
         * @param ind
         * @return false
         */
        public static boolean sprite_get_smooth(sprite ind)
        {
            return false;
        }
        /**
         * Returns the x-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_xoffset(sprite ind)
        {
            return ind.sprite_xoffset;
        }
        /**
         * Returns the y-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_yoffset(sprite ind)
        {
            return ind.sprite_yoffset;
        }
        /**
         * Returns the left side of the bounding box of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_left(sprite ind)
        {
            return ind.BBLeft;
        }
        /**
         * Returns the right side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_right(sprite ind)
        {
            return ind.BBRight;
        }
        
        /**
         * Returns the top side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_top(sprite ind)
        {
            return ind.BBTop;
        }
        /**
         * Returns the bottom side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_bottom(sprite ind)
        {
            return ind.BBBottom;
        }
        /**
         * Not used in G-Java.
         * @deprecated Only used for GM compatibility
         * @param ind
         * @return 2
         */
        public static int sprite_get_bbox_mode(sprite ind)
        {
            return 2;
        }
        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_precise(sprite ind)
        {
            return false;
        }
        
        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_preload(sprite ind)
        {
            return false;
        }
        
        
    }
    
    /**
     * These functions will give you information about a sound
     */
    public static class resources_sound
    {
        /**
         * Returns whether a sound exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return true
         */
        public static boolean  sound_exists(sound ind)
        {
            return true;
        }
        /**
         * Returns the name of the sound.
         * @param ind
         * @return
         */
        public static String sound_get_name(sound ind)
        {
            return ind.sound_name;
        }
        /**
         * Not used for G-java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return 0
         */
        public static int sound_get_kind(sound ind)
        {
            return 0;
        }
        /**
         * Not used for G-Java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return false
         */
        public static boolean sound_get_preload(sound ind)
        {
            return false;
        }
        
        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_discard(sound ind)
        {
        }
        
        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_restore(sound ind)
        {
        }
    }
    
    
    /**
     * These functions will give you information about a font
     */
    public static class resources_font
    {
        /**
         * Returns whether a font exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean font_exists(font ind)
        {
            return true;
        }
        /**
         * Returns the name of the font.
         * @param ind
         * @return
         */
        public static String font_get_name(font ind)
        {
            return ind.fontname;
        }
        /**
         * Returns the fontname of the font.
         * @param ind
         * @return
         */
        public static String  font_get_fontname(font ind)
        {
            return ind.fname;
        }
        /**
         * Returns whether the font is bold.
         * @param ind
         * @return
         */
        public static boolean font_get_bold(font ind)
        {
            return ind.font.isBold();
        }
        /**
         * Returns whether the font is italic.
         * @param ind
         * @return
         */
        public static boolean font_get_italic(font ind)
        {
            return ind.font.isItalic();
        }
        
    }
    
    /**
     * These functions will give you information about a timeline
     */
    public static class resources_timeline
    {
        /**
         * Returns whether a timeline exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean timeline_exists(Timeline ind)
        {
            return true;
        }
        /**
         * Returns the name of the time line.
         * @param ind
         * @return
         */
        public static String timeline_get_name(Timeline ind)
        {
            return ind.name;
        }
        
    }
    
    /**
     * These functions will give you information about a actor
     */
    public static class resources_actor
    {
        /**
         * Returns whether a actor exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean actor_exists(Actor ind)
        {
            return true;
        }
        /**
         * Returns the name of the actor.
         * @param ind
         * @return
         */
        public static String actor_get_name(Actor ind)
        {
            return ind.name;
        }
        
        /**
         * Returns the sprite of the actor.
         *
         * @param ind
         * @return
         */
        public static sprite actor_get_sprite(Actor ind)
        {
            return ind.sprite;
        }
        /**
         * Returns whether the actor is solid.
         * @param ind
         * @return
         */
        public static boolean object_get_solid(Actor ind)
        {
            return ind.solid;
        }
        /**
         * Returns whether the actor is visible.
         * @param ind
         * @return
         */
        public static boolean object_get_visible(Actor ind)
        {
            return ind.visible;
        }
        /**
         * Returns the depth of the actor.
         * @param ind
         * @return
         */
        public static double object_get_depth(Actor ind)
        {
            return ind.depth;
        }
        /**
         * Returns whether the actor is persistent.
         * @param ind
         * @return
         */
        public static boolean object_get_persistent(Actor ind)
        {
            return ind.persistent;
        }
        
    }
    
    
    
    /**
     * These functions will give you information about a room
     */
    public static class resources_room
    {
        /**
         * Returns whether a room exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return
         */
        public static boolean room_exists(RoomPanel ind)
        {
            return true;
        }
        /**
         * Returns the name of the room.
         * @param ind
         * @return
         */
        public static String room_get_name(RoomPanel ind)
        {
            return ind.name;
        }
        
    }
    
    
    /**
     * It is useful to use external files in games. For example, you could make a file that describes at what moments certain things should happen. Also you probably want to save information for the next time the game is run (for example, the current room).
     */
    public static class files
    {
        
        /**
         * read-only files
         */
        public static int fa_readonly =0;
        /**
         * hidden files
         */
        public static int fa_hidden =1;
        /**
         * system files
         */
        public static int fa_sysfile =2;
        /**
         * volume-id files
         */
        public static int fa_volumeid =3;
        /**
         * directories
         */
        public static int fa_directory =4;
        /**
         * archived files
         */
        public static int fa_archive =5;
        
        /**
         * Unique identifier for the game. You can use this if you need a unique file name.
         */
        public static double game_id=0;
        
        /**
         * Temporary directory created for the game. You can store temporary files here. They will be removed at the end of the game.
         */
        public static String temp_directory = System.getProperty("java.io.tmpdir");
        
        /**
         * Working directory for the game. (Not including the final backslash.)
         */
        public static String working_directory = System.getProperty("user.dir");
        
        
        /**
         * Returns the number of command-line parameters (note that the name of the program itself is one of them.
         */
        public static int parameter_count = 0;
        
        /**
         * A String array of the program parameters
         */
        public static String[] parameters;
        
        /**
         * Opens the file with the indicated name for reading. The function returns the FileWriter of the file that must be used in the other functions. You can open multiple files at the same time. Don't forget to close them once you are finished with them.
         * @param fname
         * @return
         */
        public static BufferedReader file_text_open_read(String fname)
        {
            try
            {
                return new BufferedReader(new java.io.FileReader(fname));
            }
            catch (FileNotFoundException ex)
            {
                Exceptions.printStackTrace(ex);
                return null;
            }
        }
        
        /**
         * Opens the indicated file for writing, creating it if it does not exist. The function returns the FileWriter object of the file that must be used in the other functions.
         * @param fname
         * @return The FileWriter object of the file that must be used in the other functions
         */
        public static BufferedWriter file_text_open_write(String fname)
        {
            try
            {
                return new BufferedWriter(new java.io.FileWriter(fname));
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return null;
            }
        }
        /**
         * Opens the indicated file for appending data at the end, creating it if it does not exist. The function returns the FileWriter of the file that must be used in the other functions.
         * @param fname
         * @return
         */
        public static BufferedWriter file_text_open_append(String fname)
        {
            try
            {
                return new BufferedWriter(new java.io.FileWriter(fname,true));
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return null;
            }
        }
        /**
         * Closes the file.
         * @param fname The FileWriter object to close
         * @return
         */
        public static void file_text_close(BufferedWriter fileid)
        {
            try
            {
                fileid.close();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                //unable to close
            }
        }
        
        /**
         * Closes the file.
         * @param fname The FileWriter object to close
         * @return
         */
        public static void file_text_close(BufferedReader fileid)
        {
            try
            {
                fileid.close();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                //unable to close
            }
        }
        
        
        /**
         * Writes the string to the file.
         * @param fname
         * @return
         */
        public static void file_text_write_string(BufferedWriter fileid,String str)
        {
            try
            {
                fileid.write(str);
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Write the real value to the file.
         * @param fname
         * @return
         */
        public static void file_text_write_real(FileWriter fileid,double x)
        {
            try
            {
                fileid.write(" " + x);
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Write a newline character to the file.
         * @param fname
         * @return
         */
        public static void file_text_writeln(BufferedWriter fileid)
        {
            try
            {
                fileid.newLine();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Reads a string from the file and returns this string. A string ends at the end of line.
         * @param fname
         * @return
         */
        public static String file_text_read_string(BufferedReader fileid)
        {
            try
            {
                return fileid.readLine();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return "";
            }
        }
        /**
         * Reads a real value from the file and returns this value.
         * @param fname
         * @return
         */
        public static double file_text_read_real(FileReader fileid)
        {
            try
            {
                int i = fileid.read();
                //get rid of spaces
                while (((""+i).equals(" ")) && (i != -1))
                {
                    i = fileid.read();
                }
                String thenumber = ""+i;
                while ((!(""+i).equals(" ")) && (i != -1))
                {
                    thenumber += ""+fileid.read();
                }
                
                return Functions.string.real(thenumber);
            }
            catch (Exception ex)
            {
                Exceptions.printStackTrace(ex);
                Functions.msgbox("Error reading real!", 1);
                return 0;
            }
        }
        /**
         * Skips the rest of the line in the file and starts at the start of the next line.
         *
         */
        public static void file_text_readln(BufferedReader fileid)
        {
            try
            {
                fileid.readLine();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Returns whether we reached the end of the file.
         * @param fileid
         * @return
         */
        public static boolean file_text_eof(BufferedWriter fileid)
        {
            return true;
        }
        /**
         * Returns whether we reached the end of the file.
         * @param fileid
         * @return
         */
        public static boolean file_text_eof(BufferedReader fileid)
        {
            try
            {
                fileid.mark(4);
                if(fileid.read()==-1)
                    
                    return true;
                else
                    return false;
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return true;
            }
        }
        
        /**
         * Returns whether the file with the given name exists (true) or not (false).
         * @param fname
         * @return
         */
        public static boolean file_exists(String fname)
        {
            return new File(fname).exists();
        }
        /**
         *  Deletes the file with the given name.
         * @param fname
         */
        public static void file_delete(String fname)
        {
            new File(fname).delete();
        }
        /**
         * Renames the file with name oldname into newname.
         * @param oldname
         * @param newname
         */
        public static void file_rename(String oldname, String newname)
        {
            new File(oldname).renameTo(new File(newname));
        }
        /**
         * Copies the file fname to the newname.
         * @param fname
         * @param newname
         */
        public static void file_copy(String fname, String newname)
        {
            try
            {
                java.io.InputStream in;
                in = new java.io.FileInputStream(new java.io.File(fname));
                java.io.File f = new java.io.File(newname);
                if (new java.io.File(fname).isDirectory())
                {
                    f.mkdirs();
                }
                if (!f.exists())
                {
                    f.createNewFile();
                }
                java.io.OutputStream out = new java.io.FileOutputStream(f);
                byte[] b = new byte[1024];
                int len;
                while ((len = in.read(b)) > 0)
                {
                    out.write(b, 0, len);
                }
                in.close();
                out.close();
            }
            catch (Exception ex)
            {
                Exceptions.printStackTrace(ex);
            }
            
        }
        
        /**
         * Returns whether the indicated directory does exist.
         * @param dname
         * @return
         */
        public static boolean directory_exists(String dname)
        {
            return new File(dname).exists();
        }
        /**
         * Creates a directory with the given name(including the path towards it) if it does not exist.
         * @param dname
         */
        public static void directory_create(String dname)
        {
            new File(dname).mkdir();
        }
        
        
        /**
         * Returns the name part of the indicated file name, with the extension but without the path.
         * @param fname
         * @return
         */
        public static String filename_name(String fname)
        {
            return Functions.string.string_replace(fname, filename_path(fname), "");
        }
        /**
         * Returns the path part of the indicated file name, including the final backslash.
         * @param fname
         * @return
         */
        public static String filename_path(String fname)
        {
            try
            {
                java.net.URL u = new java.net.URL(fname);
                return u.getPath();
            }
            catch (MalformedURLException ex)
            {
                Exceptions.printStackTrace(ex);
                return "";
            }
            
        }
        /**
         * Returns the directory part of the indicated file name, which normally is the same as the path except for the final backslash.
         * @param fname
         * @return
         */
        public static String filename_dir(String fname)
        {
            return filename_path(fname).substring(0,filename_path(fname).length()-1 );
        }
        
        /**
         * Returns the drive information of the filename.
         * @param fname
         * @return
         */
        public static String filename_drive(String fname)
        {
            
            return filename_path(fname).substring(0,1);
        }
        /**
         * Returns the extension part of the indicated file name, including the leading dot.
         * @param fname
         * @return
         */
        public static String filename_ext(String fname)
        {
            return filename_name(fname).substring(filename_name(fname).length()-4, filename_name(fname).length());
        }
        /**
         * Returns the indicated file name, with the extension(including the dot) changed to the new extension. By using an empty string as the new extension you can remove the extension.
         * @param fname
         * @param newext
         *
         */
        public static void filename_change_ext(String fname,String newext)
        {
            File f = new File(fname);
            f.renameTo(new File(filename_path(fname).replaceAll(filename_ext(fname), newext)));
        }
        
        
        
        /**
         * Opens the file with the indicated name. The mode indicates what can be done with the file: 0 = reading, 1 = writing, 2 = both reading and writing). The function returns the id of the file that must be used in the other functions. You can open multiple files at the same time. Don't forget to close them once you are finished with them.
         * @param fname
         * @param mode
         * @return
         */
        public static FileStream file_bin_open(String fname, int mode)
        {
            try
            {
                org.gjava.runner.FileStream f = new org.gjava.runner.FileStream();
                if (mode == 0)
                {
                    f.open(fname, false);
                }
                else
                {
                    f.open(fname, true);
                }
                return f;
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return null;
            }
        }
        /**
         * Rewrites the file with the given file id, that is, clears it and starts writing at the start.
         * @param fileid
         */
        public static void file_bin_rewrite(FileStream fileid)
        {
            try
            {
                fileid.open(fileid.fname, true);
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         *
         * @param fileid
         */
        public static void file_bin_close(FileStream fileid)
        {
            try
            {
                fileid.close();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Returns the size(in bytes) of the file with the given file id.
         * @param fileid
         * @return
         */
        public static double file_bin_size(FileStream fileid)
        {
            try
            {
                return fileid.size();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return 0;
            }
        }
        /**
         * Returns the current position(in bytes; 0 is the first position) of the file with the given file id.
         * @return
         */
        public static double file_bin_position(FileStream fileid)
        {
            try
            {
                return fileid.pos();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return 0;
            }
        }
        /**
         * Moves the current position of the file to the indicated position. To append to a file move the position to the size of the file before writing.
         * @param fileid
         * @param pos
         */
        public static void file_bin_seek(FileStream fileid,int pos)
        {
            try
            {
                fileid.seek(pos);
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Writes a byte of data to the file with the given file id.
         * @param fileid
         * @param b
         */
        public static void file_bin_write_byte(FileStream fileid,byte b)
        {
            try
            {
                fileid.writeByte(b);
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
        }
        /**
         * Reads a byte of data from the file and returns this.
         * @param fileid
         * @return
         */
        public static byte file_bin_read_byte(FileStream fileid)
        {
            try
            {
                return fileid.readByte();
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return 0;
            }
        }
        
        /**
         * Returns the number of command-line parameters (note that the name of the program itself is one of them.
         * @return
         */
        public static int parameter_count()
        {
            return parameter_count;
        }
        
        /**
         * Returns command-line parameters n. The first parameter has index 0. This is the name of the program.
         * @param n
         * @return
         */
        public static String parameter_string(int n)
        {
            return parameters[n];
        }
        
        /**
         * Returns the value (a string) of the environment variable with the given name.
         * @param name
         * @return
         */
        public static String environment_get_variable(String name)
        {
            try
            {
                java.util.Properties envProps = new java.util.Properties();
                java.lang.Runtime r = java.lang.Runtime.getRuntime();
                java.lang.Process p = r.exec("cmd /c set>temp.env");
                java.lang.Thread.sleep(500);
                java.io.FileInputStream in = new java.io.FileInputStream("temp.env");
                java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(in));
                java.lang.String line = null;
                while ((line = br.readLine()) != null)
                {
                    int index = -1;
                    if ((index = line.indexOf("=")) > -1)
                    {
                        java.lang.String key = line.substring(0, index).trim();
                        java.lang.String value = line.substring(index + 1).trim();
                        envProps.setProperty(key, value);
                    }
                    else
                    {
                        envProps.setProperty(line, "");
                    }
                }
                in.close();
                new java.io.File("temp.env").delete();
                
                Enumeration names = envProps.propertyNames();
                for (Enumeration e = names ; e.hasMoreElements() ;)
                {
                    String name2 = (String)e.nextElement();
                    if (name2.equals(name))
                        return envProps.getProperty(name);
                }
                return "";
            }
            catch (InterruptedException ex)
            {
                Exceptions.printStackTrace(ex);
                return "";
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
                return "";
            }
        }
        
    }
    
    /**
     * To pass certain parameter settings to programs a standard mechanism is the use of INI files. INI files contain sections and each section contains a number of name-value pairs. For example, here is a typical INI file:
     * <br>
     * [Form]<br>
     * Top=100<br>
     * Left=100<br>
     * Caption=The best game ever<br>
     * [Game]<br>
     * MaxScore=12324<br>
     * <br>
     * This file contains two sections, one call Form and the other called Game. The first section contains three pairs. The first two have a real value while the third has a string value. Such INI files are easy to create and change.
     *
     */
    public static class ini
    {
        /**
         * Opens the INI file with the given name.
         * @param name
         */
        public static void ini_open(String name)
        {
            ini = new INIFile(name);
        }
        /**
         * Closes the currently open INI file.
         */
        public static void ini_close()
        {
            ini.save();
        }
        /**
         * Reads the string value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static String ini_read_string(String section,String key,String def)
        {
            return ini.getStringProperty(section, key);
        }
        
        /**
         * Reads the real value of the indicated key in the indicated section. When the key or section does not exist the default value is returned.
         * @param section
         * @param key
         * @param def
         * @return
         */
        public static double ini_read_real(String section,String key,double def)
        {
            return ini.getDoubleProperty(section, key).doubleValue();
        }
        
        /**
         * Writes the string value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void ini_write_string(String section,String key,String value)
        {
            ini.setStringProperty(section, key, value, "");
        }
        /**
         * Writes the real value for the indicated key in the indicated section.
         * @param section
         * @param key
         * @param value
         */
        public static void ini_write_real(String section,String key,double value)
        {
            ini.setDoubleProperty(section, key, value, "");
        }
        /**
         * Returns whether the indicated key exists in the indicated section.
         * @param section
         * @param key
         * @return
         */
        public static boolean ini_key_exists(String section,String key)
        {
            String[] keys = ini.getPropertyNames(section);
            for (int i=0;i<=keys.length;i++)
                if (keys[i].equals(key))
                    return true;
            return false;
        }
        /**
         * Returns whether the indicated section exists.
         * @param section
         * @return
         */
        public static boolean ini_section_exists(String section)
        {
            String[] sections = ini.getAllSectionNames();
            for (int i=0;i<=ini.getTotalSections();i++)
                if (sections[i].equals(section))
                    return true;
            return false;
        }
        /**
         * Deletes the indicated key from the indicated section.
         * @param section
         * @param key
         */
        public static void ini_key_delete(String section,String key)
        {
            ini.removeProperty(section, key);
        }
        /**
         * Deletes the indicated section.
         * @param section
         */
        public static void ini_section_delete(String section)
        {
            ini.removeSection(section);
        }
        
    }
    
    /**
     * G-Java also has the possibility to start external programs.
     * @since 2.0
     */
    public static class executing_programs
    {
        
        /**
         * Whether the game is running in secure mode.
         * @since 2.0
         * @author TGMG
         */
        public static final boolean secure_mode = false;
        
        /**
         * Executes program prog with arguments arg. wait indicates whether to wait for finishing.
         * @param prog
         * @param arg
         * @param wait
         * @since 2.0
         * @author TGMG
         */
        public static void execute_program(String prog,String arg, boolean wait)
        {
            try
            {
                java.lang.Process proc = java.lang.Runtime.getRuntime().exec(prog + arg);
                if (wait)
                    try
                    {
                        proc.waitFor();
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println("InterruptedException raised: "+e.getMessage());
                    }
            }
            catch (IOException ex)
            {
                Exceptions.printStackTrace(ex);
            }
            
        }
        
        /**
         * Executes the program (or file) in the shell.
         * @param prog
         * @param arg
         * @since 2.0
         * @author TGMG
         */
        public static void execute_shell(String prog,String arg)
        {
            execute_program("bash -i "+prog,arg,false);
        }
    }
    
    /**
     * A stack data structure is a so called LIFO (Last-In First-Out) structures. You can push values on a stack and the remove them again by popping them from the stack. The value that was pushed on the stack most recently is the first to be popped from it again. Stacks are often used when there are interrupts to handle, or when having recursive functions.
     */
    public static class ds_stacks
    {
        /**
         * Creates a new stack. The function returns a Stack object that must be used in all other functions to access the particular stack. You can create multiple stacks.
         * @return a new Stack object
         */
        public static Stack ds_stack_create()
        {
            return new Stack();
        }
        
        /**
         * Destroys the stack with the given id, freeing the memory used. Don't forget to call this function when you are ready with the structure.
         * @param id
         */
        public static void ds_stack_destroy(Stack id)
        {
            id = null;
        }
        
        /**
         * Clears the stack with the given id, removing all data from it but not destroying it.
         * @param id
         */
        public static void ds_stack_clear(Stack id)
        {
            id = new Stack();
        }
        /**
         * Returns the number of values stored in the stack.
         * @param id
         * @return
         */
        public static int ds_stack_size(Stack id)
        {
            return id.size();
        }
        /**
         * Returns whether the stack is empty. This is the same as testing whether the size is 0.
         * @param id
         */
        public static boolean ds_stack_empty(Stack id)
        {
            return id.empty();
        }
        /**
         * Pushes the value on the stack.
         * @param id
         * @param val
         */
        public static void ds_stack_push(Stack id,String val)
        {
            id.push(val);
        }
        /**
         * Returns the value on the top of the stack and removes it from the stack.
         * @param id
         */
        public static String ds_stack_pop(Stack id)
        {
            return (String) id.pop();
        }
        /**
         * Returns the value on the top of the stack but does not remove it from the stack.
         * @param id
         */
        public static String ds_stack_top(Stack id)
        {
            String str = ds_stack_pop(id);
            ds_stack_push(id,str);
            return str;
        }
        
    }
    
    /**
     * A queue is somewhat similar to a stack but it works on a FIFO (First-In First-Out) basis. The value that is put in the queue first is also the first to be removed from it. It works like a queue in a shop. The person who is first in a queue is served first. Queues are typically used to store things that still need to be done but there are many other uses.
     */
    public static class ds_queue
    {
        /**
         * Creates a new queue. The function returns an integer as an id that must be used in all other functions to access the particular queue. You can create multiple queues.
         * @return
         */
        public static LinkedList ds_queue_create()
        {
            return new LinkedList();
        }
        
        
        /**
         * Destroys the queue with the given id, freeing the memory used. Don't forget to call this function when you are ready with the structure.
         * @param id
         */
        public static void ds_queue_destroy(LinkedList id)
        {
            id = null;
        }
        /**
         * Clears the queue, removing all data from it but not destroying it.
         * @param id
         * @return
         */
        public static void ds_queue_clear(LinkedList id)
        {
            id = new LinkedList();
        }
        /**
         * Returns the number of values stored in the queue.
         * @param id
         * @return
         */
        public static int ds_queue_size(LinkedList id)
        {
            return id.size();
        }
        /**
         * Returns whether the queue is empty. This is the same as testing whether the size is 0.
         * @param id
         * @return
         */
        public static boolean ds_queue_empty(LinkedList id)
        {
            return id.isEmpty();
        }
        /**
         * Enters the value in the queue.
         * @param id
         * @param val
         */
        public static void ds_queue_enqueue(LinkedList id,String val)
        {
            id.add(val);
        }
        /**
         * Returns the value that is longest in the queue and removes it from the queue.
         * @param id
         * @return
         */
        public static String ds_queue_dequeue(LinkedList id)
        {
            return (String)id.poll();
        }
        /**
         * Returns the value at the head of the queue, that is, the value that has been the longest in the queue. (It does not remove it from the queue.)
         * @param id
         * @return
         */
        public static String ds_queue_head(LinkedList id)
        {
            return (String)id.getLast();
        }
        /**
         * Returns the value at the tail of the queue, that is, the value that has most recently been added to the queue. (It does not remove it from the queue.)
         * @param id
         * @return
         */
        public static String ds_queue_tail(LinkedList id)
        {
            return (String)id.getFirst();
        }
        
    }
    
    /**
     *
     */
    public static class popups
    {
        
        /**
         * Displays a dialog box with the string as a message.
         * @param str
         */
        public static void show_message(String str)
        {
            Functions.msgbox(str, 0);
        }
        
        /**
         * Displays a question; returns true when the user selects yes and false otherwise.
         * @param str
         * @return
         */
        public static boolean show_question(String str)
        {
            return (JOptionPane.showConfirmDialog(null, str, "Question:", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        }
        
        /**
         * Asks the player in a dialog box for a string. str is the message. def is the default value shown.
         * @param str
         * @param def
         * @return
         */
        public static String get_string(String str,String def)
        {
            return JOptionPane.showInputDialog(null, str, def);
        }
        
        /**
         * Asks the player in a dialog box for a number. str is the message. def is the default number shown.
         * @param str
         * @param def
         * @return
         */
        public static double get_integer(String str,double def)
        {
            return Double.parseDouble(JOptionPane.showInputDialog(null, str, ""+def));
        }
        
        /**
         * Asks the player for a color. defcol is the default color. If the user presses Cancel the value -1 is returned.
         * @param defcol
         * @return
         */
        public static Color get_color(Color defcol)
        {
            return new JColorChooser(defcol).showDialog(null, "Choose color", defcol);
        }
        
        
        /**
         * Asks the player for a filename to open with the given filter.
         * @param filter You need to create a new FileFilter class
         * @param fname
         * @return
         */
        public static String get_open_filename(javax.swing.filechooser.FileFilter filter,String fname)
        {
            JFileChooser jfc = new JFileChooser();
            jfc.setSelectedFile(new File(fname));
            jfc.setFileFilter(filter);
            if(jfc.showOpenDialog(basicgame.Current_room.Room)==(JFileChooser.APPROVE_OPTION))
                return jfc.getName();
            else
                return "";
            
        }
        
        /**
         * Asks for a filename to save with the given filter. If the user presses Cancel an empy string is returned.
         * @param filter
         * @param fname
         * @return
         */
        public static String get_save_filename(javax.swing.filechooser.FileFilter filter,String fname)
        {
            JFileChooser jfc = new JFileChooser();
            jfc.setSelectedFile(new File(fname));
            jfc.setFileFilter(filter);
            if(jfc.showSaveDialog(basicgame.Current_room.Room)==(JFileChooser.APPROVE_OPTION))
                return jfc.getName();
            else
                return "";
            
        }
        
        /**
         * Asks for a directory. dname is the default name. If the user presses Cancel an empy string is returned.
         * @param dname
         * @return
         */
        public static String get_directory(String dname)
        {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.setSelectedFile(new File(dname));
            if(jfc.showOpenDialog(basicgame.Current_room.Room)==(JFileChooser.APPROVE_OPTION))
                return jfc.getName();
            else
                return "";
        }
        
        /**
         * Displays a standard error message (and/or writes it to the log file). abort indicates whether the game should abort.
         * @param str
         * @param abort
         */
        public static void show_error(String str,boolean abort)
        {
            Functions.msgbox(str, 1);
            if (abort)
                Functions.rooms.end_game();
        }
    }
    
    /**
     * One special pop-up is the highscore list that is maintained for each game.
     */
    public static class highscore
    {
        /**
         * Shows the highscore table. numb is the new score. If this score is good enough to be added to the list, the player can input a name. Use -1 to simple display the current list.
         * @param numb
         */
        public static void highscore_show(double numb)
        {
            highscore.setVisible(true);
            String str = Functions.popups.get_string("Player name?", "<nobody>");
            highscore.add_score(str, numb);
        }
        
        /**
         * Sets whether the highscore form must have a border or not.
         * @param show
         */
        public static void highscore_set_border(boolean show)
        {
            highscore.setUndecorated(show);
        }
        
        
        /**
         * Changes the different default strings used when showing the highscore table. caption is the caption of the form. nobody is the string used when there is nobody at the particular rank. escape is the string at the bottom indicating to press the escape key. You can in particular use this when your game should use a different language.
         * @param caption
         * @param nobody
         * @param escape
         */
        public static void highscore_set_strings(String caption,String nobody,String escape)
        {
            //TODO highscore_set_strings (nobody)
            highscore.setTitle(caption);
            highscore.jLabel11.setText(escape);
            
        }
        
        /**
         * Clears the highscore list.
         */
        public static void highscore_clear()
        {
            //TODO highscore_clear
            highscore.s = new Highscore.Score[10];
        }
        /**
         * Adds a player with name str and score numb to the list.
         * @param str
         * @param numb
         */
        public static void highscore_add(String str,double numb)
        {
            highscore.add_score(str, numb);
        }
        /**
         * Adds the current score to the highscore list. The player is asked to provide a name.
         */
        public static void highscore_add_current()
        {
            String str = Functions.popups.get_string("Player name?", "<nobody>");
            highscore.add_score(str,Functions.score.score);
        }
        /**
         * Returns the score of the person on the given place (1-10). This can be used to draw your own highscore list.
         * @param place
         * @return
         */
        public static double highscore_value(int place)
        {
            return highscore.s[place].score;
        }
        /**
         * Returns the name of the person on the given place (1-10).
         * @param place
         * @return
         */
        public static String highscore_name(int place)
        {
            return highscore.s[place].name;
        }
        
    }
    
    
    /**
     * These are functions to ensure compatibility with GM4.
     * @deprecated No need to use these functions unless you are used to gm4!
     */
    public static class GM4
    {
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.min instead
         * @param a
         * @param b
         * @param c
         * @return the minimum of the 3 values
         * @author luiscubal
         */
        public static double min3(double a, double b, double c)
        {
            return Functions.math.min(a,b,c);
        }
        
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.max instead
         * @param a
         * @param b
         * @param c
         * @return the max of the 3 values
         * @author luiscubal
         */
        public static double max3(double a, double b, double c)
        {
            return Functions.math.max(a,b,c);
        }
        
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.mean instead
         * @param a
         * @param b
         * @param c
         * @return the mean of the 3 values
         * @author luiscubal
         */
        public static double mean3(double a, double b, double c)
        {
            return Functions.math.mean(a,b,c);
        }
    }
    
    
    /**
     *
     * @param actor
     * @return number of a certain actor as int
     */
    public static int action_get_number(Actor actor)
    {
        // get the number of instances as a value
        int no_of_instances = 0;
        int jii = 0;
        while (jii < basicgame.Current_room.instances.size())
        {
            Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
            if (dt.equals(actor))
            {
                // add onto the number of instances
                no_of_instances = no_of_instances + 1;
                
            }
            jii++;
        }
        return no_of_instances;
    }
    
        /*
         * public static int min(int... args) { int mini = 0; mini = args[0]; for (int i = 0; i < args.length; i++) {
         * mini = Math.min(mini,args[i]); } return mini; }
         */// Can't be used below 1.5 :(
        /*
         * public static int max(int... args) { int maxi = 0; maxi = args[0]; for (int i = 0; i < args.length; i++) {
         * maxi = Math.max(maxi,args[i]); } return maxi; }
         */
    
    
    
    /**
     *
     */
    //    public void load_image() {
    //        backImage = new ImageIcon(getClass().getResource("dialog.png")).getImage();
    //
    //    }
    
    /**
     * Tell the UIManager to use the platform look and feel
     */
    public void set_native()
    {
        try
        {
            // Tell the UIManager to use the platform look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            // Do nothing
        }
    }
    
    /**
     * @deprecated Does nothing
     * @param message
     * @return
     */
    public static boolean action_if_question(String message)
    {
        // return true if the answer is yes
        //MessageBox box = new MessageBox();
        /* boolean iii = *///box.action_if_question(message);
        
        return true;
        
    }
    
    
    private static void show_message(String str)
    {
        // show a message
        
        // pause the room
        basicgame.Current_room.Paused = true;
        
        // show the message box
        // Room.center(messagebox);
        // JPanel messagepanel = new messagepanel(str);
        // JButton Ok = new JButton("OK");
        // messagebox.add(new Button("OK"), new Rectangle(0,4,1,1));
        // messagepanel.add_OK();
        // Ok.setLocation(150,90);
        // messagebox = load_Rooms.Room;
        // messagebox.getContentPane().add(BorderLayout.CENTER, messagepanel);
        // messagebox.show();
        
        MessageBox.show_message(str);
        basicgame.Current_room.Paused = false;
    }
    
    /**
     *
     * @param url
     */
    public static void openURL(String url)
    {
        String osName = System.getProperty("os.name");
        try
        {
            if (osName.startsWith("Mac OS"))
            {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",new Class[] { String.class });
                openURL.invoke(null,new Object[] { url });
            }
            else if (osName.startsWith("Windows"))
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            else
            { // assume Unix or Linux
                String[] browsers = { "firefox","opera","konqueror","epiphany","mozilla","netscape" };
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++)
                    if (Runtime.getRuntime().exec(new String[] { "which",browsers[count] }).waitFor() == 0)
                        browser = browsers[count];
                if (browser == null)
                    throw new Exception("Could not find web browser");
                else
                    Runtime.getRuntime().exec(new String[] { browser,url });
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error attempting to launch web browser:\n"
                    + e.getLocalizedMessage());
        }
    }
    
    private static void Setup_Functions()
    {
        // in some initializing method or constructor
        then = Calendar.getInstance();
        // Time used by GM to base the datetime off of
        then.set(1899,11,29,22,59,34);
        
        // setup clipboard
        if (basicgame.Runningas != "EApplet") systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
    }
    
    /**
     * Show a message
     * @param message
     * @param icon the image icon
     */
    public static void msgbox(String message,int icon)
    {
        JOptionPane.showMessageDialog(null,message,"G-java",icon);
    }
}
