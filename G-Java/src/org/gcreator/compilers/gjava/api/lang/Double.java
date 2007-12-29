/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api.lang;

/**
 * The Double class wraps a value of the primitive type double in an object.
 * In addition, this class provides several methods for converting a double to a String and a String to a double, as well as other constants and methods useful when dealing with a double.
 * @author TGMG
 */
public class Double {

    double d;
    /**
     * The largest positive finite value of type double.
     */
    public static double MAX_VALUE = java.lang.Double.MAX_VALUE;
    /**
     * The smallest positive value of type double.
     */
    public static double MIN_VALUE = java.lang.Double.MIN_VALUE;
    /**
     *   A Not-a-Number (NaN) value of type double.
     */
    public static double NaN = java.lang.Double.NaN;
    /**
     *  The negative infinity of type double.
     */
    public static double NEGATIVE_INFINITY = java.lang.Double.NEGATIVE_INFINITY;
    /**
     * The positive infinity of type double.
     */
    public static double POSITIVE_INFINITY = java.lang.Double.POSITIVE_INFINITY;

    /**
     * Returns the value of this Character object as a char primitive.
     * @return
     */
    public double getPrimitive() {
        return d;
    }

    /**
     * Returns true if this Double value is infinitely large in magnitude.
     * @return
     */
    public boolean isInfinite() {
        return java.lang.Double.isInfinite(d);
    }

    /**
     * Returns true if the specified number is infinitely large in magnitude.
     * @param v
     * @return
     */
    public static boolean isInfinite(double v)
    {
        return java.lang.Double.isInfinite(v);
    }
        
         

    /**
     * Returns true if this Double value is the special Not-a-Number (NaN) value.
     * @return
     */
    public boolean isNaN() {
        return java.lang.Double.isNaN(d);
    }
         
         

    /**
     * Returns true if the specified number is the special Not-a-Number (NaN) value.
     * @param v
     * @return
     */
    public static boolean isNaN(double v) {
        return java.lang.Double.isNaN(v);
    }
         
         

    /**
     * Returns a new double initialized to the value represented by the specified String, as performed by the valueOf  method of class Double.
     * @param s
     * @return
     */
    public static double parseDouble(java.lang.String s) {
        return java.lang.Double.parseDouble(s);
    }

}
