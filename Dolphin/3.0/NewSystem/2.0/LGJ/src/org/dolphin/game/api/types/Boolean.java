package org.dolphin.game.api.types;

public class Boolean extends Variable {

	public static final Boolean TRUE = new Boolean(true), FALSE = new Boolean(false);
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

    @Override
    public int getInt()
    {
        if (b == true)
            return 1;
        else
            return 0;
    }

    @Override
    public int compareTo(java.lang.Object o)
    {
        if (o instanceof Boolean)
        {
            if (getInt() < ((Variable)o).getInt())
                return -1;
            else if (getInt() > ((Variable)o).getInt())
                return 1;
            else
                return 0;
        }
        else
            return super.compareTo(o);  //No order - go by toString
    }

	
}
