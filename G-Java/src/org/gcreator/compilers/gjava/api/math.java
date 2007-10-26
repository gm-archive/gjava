/*
 * math.java
 * 
 * Created on 11-Sep-2007, 00:40:55
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Arrays;

/**
     * <h2>Math Functions</h2>
     * The following functions exist that deal with real numbers. All of these functions require the G-Java api functions. These functions mainly deal with doubles, for more Math functions for other data types such as float look into java.lang.Math. Although the G-java API provides more functions for Math than java.lang.Math!<br>
     * <br>
     * To use:<br>
     * Functions.Math.functionname(args);<br>
     * <br>
     * The code completion in the java editor will bring up a list of functions as soon as you type the "." in Math, if not you can manually call code completion using Ctrl+Space.<br>
     * <br>
     * Example:<br>
     * <code>int randomnumber = Functions.Math.random(10); //Random number between 0 and 10</code>
     */
    public class math {

        /**
         * The Mathematical constant PI to 17 decimal places
         *  @since 2.0
         */
        public static double PI = Math.PI;

        /**
         * The Mathematical constant E, the base of the natural logarithms
         */
        public static double E = Math.E;

        /**
         * Returns the cube root of a double value. For positive finite x, cbrt(-x) == -cbrt(x); that is, the cube root of a negative value is the negative of the cube root of that value's magnitude.
         *
         * @param x
         * @return
         */
        public static double cbrt(double x) {
            return Math.cbrt(x);
        }

        /**
         * Returns a random real number between 0 and x. The number is always smaller than x.
         * @param x
         * @return
         */
        public static double random(double x) {
            return Math.random() * x;
        }

        /**
         * Returns the absolute value of x.
         * @param x
         * @return
         */
        public static double abs(double x) {
            return Math.abs(x);
        }

        /**
         * Returns the sign of x (-1, 0 or 1).
         * @param x
         * @return
         */
        public static double sign(double x) {
            return x < 0 ? -1 : (x > 0 ? 1 : 0);
        }

        /**
         * Returns x rounded to the nearest integer.
         * @param x
         * @return
         */
        public static double round(double x) {
            return Math.round(x);
        }

        /**
         * Returns the floor of x, that is, x rounded down to an integer.
         * @param x
         * @return
         */
        public static double floor(double x) {
            return Math.floor(x);
        }

        /**
         * Returns the ceiling of x, that is, x rounded up to an integer.
         * @param x
         * @return
         */
        public static double ceil(double x) {
            return Math.ceil(x);
        }

        /**
         * Returns the fractional part of x, that is, the part behind the decimal dot.
         * @param x
         * @return the fractional part of x, that is, the part behind the decimal dot.
         */
        public static double frac(double x) {
            return x - Math.floor(x);
        }

        /**
         * Returns the square root of x. x must be non-negative.
         * @param x
         * @return the square root of x. x must be non-negative.
         */
        public static double sqrt(double x) {
            return Math.sqrt(x);
        }

        /**
         * Returns x*x.
         * @param x
         * @return x*x.
         */
        public static double sqr(double x) {
            return x * x;
        }

        /**
         * Returns x to the power n.
         * @param x
         * @param n
         * @return
         */
        public static double power(double x, double n) {
            return Math.pow(x, n);
        }

        /**
         * Returns e to the power x.
         * @param x
         * @return
         */
        public static double exp(double x) {
            return Math.log(x) / Math.log(Math.E);
        }

        /**
         * Returns the natural logarithm of x.
         * @param x
         * @return
         */
        public static double ln(double x) {
            return 0;
        }

        /**
         * Returns the log base 2 of x.
         * @param x
         * @return
         */
        public static double log2(double x) {
            return Math.log(x) / Math.log(2);
        }

        /**
         * Returns the log base 10 of x.
         * @param x
         * @return
         */
        public static double log10(double x) {
            return Math.log(x);
        }

        /**
         * Returns the log base n of x.
         * @param n
         * @param x
         * @return
         */
        public static double logn(double n, double x) {
            return Math.log(x) / Math.log(n);
        }

        /**
         * Returns the sine of x (x in radians).
         * @param x
         * @return
         */
        public static double sin(double x) {
            return Math.sin(x);
        }

        /**
         * Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
         * @param x
         * @return
         */
        public static double signum(double x) {
            return Math.signum(x);
        }

        /**
         * Returns the hyperbolic sine of x
         * @param x
         * @return
         */
        public static double sinh(double x) {
            return Math.sinh(x);
        }

        /**
         * Returns the cosine of x (x in radians).
         * @param x
         * @return
         */
        public static double cos(double x) {
            return Math.cos(x);
        }

        /**
         * Returns the hyperbolic cosine of x.
         * @param x
         * @return
         */
        public static double cosh(double x) {
            return Math.cosh(x);
        }

        /**
         * Returns ex -1.
         * @param x
         * @return
         */
        public static double expm1(double x) {
            return Math.expm1(x);
        }

        /**
         * Returns sqrt(x*x +y*y) without intermediate overflow or underflow.
         * @param x
         * @param y
         * @return
         */
        public static double hypot(double x, double y) {
            return Math.hypot(x, x);
        }

        /**
         * Returns the size of an ulp of the argument.
         * @param x
         * @return
         */
        public static double ulp(double x) {
            return Math.ulp(x);
        }

        /**
         * Returns the hyperbolic tangent of x
         * @param x
         * @return
         */
        public static double tanh(double x) {
            return Math.tanh(x);
        }

        /**
         * Returns the tangent of x (x in radians).
         * @param x
         * @return
         */
        public static double tan(double x) {
            return Math.tan(x);
        }

        /**
         * Returns the inverse sine of x.
         * @param x
         * @return
         */
        public static double arcsin(double x) {
            return Math.asin(x);
        }

        /**
         * Returns the inverse cosine of x.
         * @param x
         * @return
         */
        public static double arccos(double x) {
            return Math.acos(x);
        }

        /**
         * Returns the inverse tangent of x.
         * @param x
         * @return
         */
        public static double arctan(double x) {
            return Math.atan(x);
        }

        /**
         * Calculates arctan(Y/X), and returns an angle in the correct quadrant.
         * @param y
         * @param x
         * @return
         */
        public static double arctan2(double y, double x) {
            return Math.atan2(y, x);
        }

        /**
         * Converts degrees to radians.
         * @param x degrees to convert
         * @return radians double value
         */
        public static double degtorad(double x) {
            return Math.toRadians(x);
        }

        /**
         * Converts radians to degrees.
         * @param x radians to convert
         * @return degrees double value
         */
        public static double radtodeg(double x) {
            return Math.toDegrees(x);
        }

        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double min(double v1, double v2) {
            return Math.min(v1, v2);
        }

        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @return
         */
        public static double min(double v1, double v2, double v3) {
            return min(v3, min(v1, v2));
        }

        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @return
         */
        public static double min(double v1, double v2, double v3, double v4) {
            return min(v4, min(v3, min(v1, v2)));
        }

        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @return
         */
        public static double min(double v1, double v2, double v3, double v4, double v5) {
            return min(v5, min(v4, min(v3, min(v1, v2))));
        }

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
        public static double min(double v1, double v2, double v3, double v4, double v5, double v6) {
            return min(v6, min(v5, min(v4, min(v3, min(v1, v2)))));
        }

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
        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7) {
            return min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2))))));
        }

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
        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8) {
            return min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2)))))));
        }

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
        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9) {
            return min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va) {
            return min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2)))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb) {
            return min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2))))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc) {
            return min(vc, min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2)))))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd) {
            return min(vd, min(vc, min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2))))))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve) {
            return min(ve, min(vd, min(vc, min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2)))))))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf) {
            return min(vf, min(ve, min(vd, min(vc, min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2))))))))))))));
        }

        public static double min(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf, double vg) {
            return min(vg, min(vf, min(ve, min(vd, min(vc, min(vb, min(va, min(v9, min(v8, min(v7, min(v6, min(v5, min(v4, min(v3, min(v1, v2)))))))))))))));
        }

        /**
         * Returns the maximum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double max(double v1, double v2) {
            return Math.max(v1, v2);
        }

        public static double max(double v1, double v2, double v3) {
            return max(v3, max(v1, v2));
        }

        public static double max(double v1, double v2, double v3, double v4) {
            return max(v4, max(v3, max(v1, v2)));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5) {
            return max(v5, max(v4, max(v3, max(v1, v2))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6) {
            return max(v6, max(v5, max(v4, max(v3, max(v1, v2)))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7) {
            return max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8) {
            return max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2)))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9) {
            return max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va) {
            return max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2)))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb) {
            return max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2))))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc) {
            return max(vc, max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2)))))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd) {
            return max(vd, max(vc, max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2))))))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve) {
            return max(ve, max(vd, max(vc, max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2)))))))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf) {
            return max(vf, max(ve, max(vd, max(vc, max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2))))))))))))));
        }

        public static double max(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf, double vg) {
            return max(vg, max(vf, max(ve, max(vd, max(vc, max(vb, max(va, max(v9, max(v8, max(v7, max(v6, max(v5, max(v4, max(v3, max(v1, v2)))))))))))))));
        }

        /**
         * Returns the average of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double mean(double v1, double v2) {
            return (v1 + v2) / 2;
        }

        public static double mean(double v1, double v2, double v3) {
            return (v1 + v2 + v3) / 3;
        }

        public static double mean(double v1, double v2, double v3, double v4) {
            return (v1 + v2 + v3 + v4) / 4;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5) {
            return (v1 + v2 + v3 + v4 + v5) / 5;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6) {
            return (v1 + v2 + v3 + v4 + v5 + v6) / 6;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7) / 7;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8) / 8;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9) / 9;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va) / 10;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb) / 11;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc) / 12;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd) / 13;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve) / 14;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve + vf) / 15;
        }

        public static double mean(double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, double va, double vb, double vc, double vd, double ve, double vf, double vg) {
            return (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + va + vb + vc + vd + ve + vf + vg) / 16;
        }

        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a) {
            return a;
        }

        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b) {
            if (a < b) {
                return a;
            } else {
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
        public double median(double a, double b, double c) {
            double[] x = new double[]{a, b, c};
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
        public double median(double a, double b, double c, double d) {
            double[] x = new double[]{a, b, c, d};
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
        public double median(double a, double b, double c, double d, double e) {
            double[] x = new double[]{a, b, c, d, e};
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
        public double median(double a, double b, double c, double d, double e, double f) {
            double[] x = new double[]{a, b, c, d, e, f};
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
        public double median(double a, double b, double c, double d, double e, double f, double g) {
            double[] x = new double[]{a, b, c, d, e, f, g};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h) {
            double[] x = new double[]{a, b, c, d, e, f, g, h};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
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
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
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
        public static double true_median(double a) {
            return a;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b) {
            return (a + b) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c) {
            double[] x = new double[]{a, b, c};
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
        public double true_median(double a, double b, double c, double d) {
            double[] x = new double[]{a, b, c, d};
            Arrays.sort(x);
            return (x[1] + x[2]) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c, double d, double e) {
            double[] x = new double[]{a, b, c, d, e};
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
        public double true_median(double a, double b, double c, double d, double e, double f) {
            double[] x = new double[]{a, b, c, d, e, f};
            Arrays.sort(x);
            return (x[2] + x[3]) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c, double d, double e, double f, double g) {
            double[] x = new double[]{a, b, c, d, e, f, g};
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
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h) {
            double[] x = new double[]{a, b, c, d, e, f, g, h};
            Arrays.sort(x);
            return (x[3] + x[4]) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i};
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
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j};
            Arrays.sort(x);
            return (x[4] + x[5]) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k};
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
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l};
            Arrays.sort(x);
            return (x[5] + x[6]) / 2;
        }

        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m};
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
        public double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n};
            Arrays.sort(x);
            return (x[6] + x[7]) / 2;
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
        public static double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
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
        public static double true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p) {
            double[] x = new double[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
            Arrays.sort(x);
            return (x[7] + x[8]) / 2;
        }


        /**
         * Returns the distance between point (x1,y1) and point (x2,y2).
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_distance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(sqr(x2 - x1) + sqr(y2 - y1));
        }

        /**
         * Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_direction(double x1, double y1, double x2, double y2) {
            if (y1 < y2 && x1 == x2) {
                return 90;
            } else if (y1 > y2 && x1 == x2) {
                return 270;
            }
            double basic = Math.atan((y1 - y2) / (x1 - x2));
            if (x1 < x2 && y1 > y2) {
                return basic;
            } else if (x1 > x2 && y1 > y2) {
                return 90 + basic;
            } else if (x1 > x2 && y1 < y2) {
                return basic - 180;
            } else {
                return 360 + basic;
            }
        }

        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(String a) {
            return true;
        }

        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(double a) {
            return false;
        }

        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(boolean a) {
            return false;
        }

        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(String a) {
            return false;
        }

        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(double a) {
            return true;
        }

        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(boolean a) {
            return false;
        }


        /**
         * Returns the horizontal x-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return length
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_x(double len, double dir) {
            return len * cos(dir);
        }

        /**
         * Returns the vertical y-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_y(double len, double dir) {
            return len * sin(dir);
        }
    }

