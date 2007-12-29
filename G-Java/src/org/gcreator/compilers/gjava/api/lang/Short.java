/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api.lang;

/**
 * The Short class is the standard wrapper for short values.
 * @author TGMG
 */
public class Short {
short s;

Short(short ss)
{
    s=ss;
}

/**
     * The largest positive finite value of type short.
     */
    public static short MAX_VALUE = java.lang.Short.MAX_VALUE;
    /**
     * The smallest positive value of type short.
     */
    public static short MIN_VALUE = java.lang.Short.MIN_VALUE;

    /**
     * Returns the value of this short object as a primitive.
     * @return
     */
    public short getPrimitive() {
        return s;
    }

    /**
     * Returns a new short initialized to the value represented by the specified String.
     * @param s
     * @return
     */
    public static short parseString(java.lang.String s) {
        return java.lang.Short.parseShort(s);
    }
}
