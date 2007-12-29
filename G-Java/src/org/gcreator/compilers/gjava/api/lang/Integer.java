/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api.lang;

/**
 * The Integer class wraps a value of the primitive type int  in an object. 
 * In addition, this class provides several methods for converting an int to a String and a String to an int, as well as other constants and methods useful when dealing with an int.
 * @author TGMG
 */
public class Integer {

    int i;

    Integer(int ii) {
        i = ii;
    }
    /**
     * The largest positive finite value of type float.
     */
    public static float MAX_VALUE = java.lang.Float.MAX_VALUE;
    /**
     * The smallest positive value of type float.
     */
    public static float MIN_VALUE = java.lang.Float.MIN_VALUE;

    /**
     * Returns the value of this Float object as a primitive.
     * @return
     */
    public int getPrimitive() {
        return i;
    }

    /**
     * Returns a new double initialized to the value represented by the specified String.
     * @param s
     * @return
     */
    public static int parseString(java.lang.String s) {
        return java.lang.Integer.parseInt(s);
    }
}
