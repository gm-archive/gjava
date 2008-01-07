
package org.gcreator.compilers.gjava.api;

/**
 * The Long class wraps a value of the primitive type long  in an object.
 * In addition, this class provides several methods for converting a long to a String and a String to a long, as well as other constants and methods useful when dealing with a long.
 * @author TGMG
 */
public class Long {
long l;

Long(long ll)
{
    l=ll;
}

/**
     * The largest positive finite value of type long.
     */
    public static long MAX_VALUE = java.lang.Long.MAX_VALUE;
    /**
     * The smallest positive value of type long.
     */
    public static long MIN_VALUE = java.lang.Long.MIN_VALUE;

    /**
     * Returns the value of this Long object as a primitive.
     * @return
     */
    public long getPrimitive() {
        return l;
    }

    /**
     * Returns a new long initialized to the value represented by the specified String.
     * @param s
     * @return
     */
    public static long parseString(java.lang.String s) {
        return java.lang.Long.parseLong(s);
    }
}
