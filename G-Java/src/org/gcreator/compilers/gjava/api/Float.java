
package org.gcreator.compilers.gjava.api;

/**
 * The Float class wraps a value of primitive type float in an object.
 * In addition, this class provides several methods for converting a float to a String and a String to a float, as well as other constants and methods useful when dealing with a float.
 * @author TGMG
 */
public class Float extends Object{
float f;

Float(float ff) {
    f=ff;
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
     *   A Not-a-Number (NaN) value of type float.
     */
    public static float NaN = java.lang.Float.NaN;
    /**
     *  The negative infinity of type float.
     */
    public static float NEGATIVE_INFINITY = java.lang.Float.NEGATIVE_INFINITY;
    /**
     * The positive infinity of type float.
     */
    public static float POSITIVE_INFINITY = java.lang.Float.POSITIVE_INFINITY;

    /**
     * Returns the value of this Float object as a char primitive.
     * @return
     */
    public float getPrimitive() {
        return f;
    }

    /**
     * Returns true if this Double value is infinitely large in magnitude.
     * @return
     */
    public boolean isInfinite() {
        return java.lang.Float.isInfinite(f);
    }

    /**
     * Returns true if the specified number is infinitely large in magnitude.
     * @param v
     * @return
     */
    public static boolean isInfinite(float v)
    {
        return java.lang.Float.isInfinite(v);
    }
        
         

    /**
     * Returns true if this Double value is the special Not-a-Number (NaN) value.
     * @return
     */
    public boolean isNaN() {
        return java.lang.Float.isNaN(f);
    }
         
         

    /**
     * Returns true if the specified number is the special Not-a-Number (NaN) value.
     * @param v
     * @return
     */
    public static boolean isNaN(float v) {
        return java.lang.Float.isNaN(v);
    }
         
         

    /**
     * Returns a new double initialized to the value represented by the specified String, as performed by the valueOf  method of class Double.
     * @param s
     * @return
     */
    public static float parseString(java.lang.String s) {
        return java.lang.Float.parseFloat(s);
    }

    @Override
    public float getFloat()
    {
        return f;
    }
    
    @Override
    public double getDouble()
    {
        return getFloat();
    }
    
    @Override
    public String getString() {
        return new String(""+f);
    }
    
    @Override
    public boolean getBoolean() {
        return !(f == 0);
    }
    
    @Override
    public Boolean equals(Object obj) {
        return new Boolean(f == (obj).getFloat());
    }
    
    @Override
    public int compareTo(java.lang.Object o)
    {
        if ((o instanceof Float) || (o instanceof Double) || (o instanceof Integer))
        {
            if (getDouble() < ((Object)o).getDouble())
                return -1;
            else if (getDouble() > ((Object)o).getDouble())
                return 1;
            else
                return 0;
        }
        else
            return super.compareTo(o);  //No order - go by toString
    }
    
    @Override
    public java.lang.String toString()
    {
        return "" + f;
    }
}
