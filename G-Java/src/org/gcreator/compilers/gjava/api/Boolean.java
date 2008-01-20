

package org.gcreator.compilers.gjava.api;

/**
 * The Boolean class wraps a value of the primitive type boolean in an object.
 * In addition, this class provides many methods for converting a boolean to a String and a String to a boolean, as well as other constants and methods useful when dealing with a boolean.
 * @author TGMG
 */
public class Boolean extends Object {
private boolean b;

public Boolean(boolean bb)
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

    @Override
    public java.lang.String toString() {
        if (b==true)
        return "True";
        else
           return "False";
    }

    @Override
    public String getString() {
        return new String(this.toString());
    }
    




}
