package org.dolphin.game.api.types;

public class Boolean extends Variable {

	public static final Boolean TRUE = new Boolean(true), FALSE = new Boolean(false);
	private boolean b;
	
	public Boolean(boolean bb)
	{
	    b=bb;
	}
	
}
