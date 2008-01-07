

package org.gcreator.compilers.gjava.api;

/**
 * The Boolean class wraps a value of the primitive type boolean in an object.
 * In addition, this class provides many methods for converting a boolean to a String and a String to a boolean, as well as other constants and methods useful when dealing with a boolean.
 * @author TGMG
 */
public class Boolean extends Object {
private boolean b;

/**
 * The Boolean object corresponding to the primitive value true.
 */
public static Boolean TRUE = new Boolean(true);
/**
 * The Boolean object corresponding to the primitive value false.
 */
public static Boolean FALSE = new Boolean(false);

Boolean(boolean bb)
{
    b=bb;
}

/**
 * Returns the value of this Boolean object as a boolean primitive.
 * @return
 */
public boolean getBoolean()
{
    return b;
}

/**
 * Returns a Boolean with a value represented by the specified String. The Boolean returned represents the value true if the string argument is not null  and is equal, ignoring case, to the string "true".
 * @param s
 * @return
 */
public boolean parseBoolean(java.lang.String s)
{
    return java.lang.Boolean.valueOf(s).booleanValue();
    
}


}
