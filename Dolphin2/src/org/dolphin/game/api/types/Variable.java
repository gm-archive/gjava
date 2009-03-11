package org.dolphin.game.api.types;

import java.io.Serializable;

import org.dolphin.game.api.GCL;
import org.dolphin.game.api.components.Actor;

/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Variable implements Cloneable, Serializable {
private static final long serialVersionUID = 1L;

	
	/*
	 * This function is required, it sets the value of variable with string
	 * name.
	 */
	public void setVariable(java.lang.String name, Object value) {
	}

	/*
	 * 
	 * Gets the value of the variable with string name.
	 * 
	 */
	public Object getVariable(java.lang.String name) {
		return 0.0d;
	}

	public static Object add (Object o,Object d){
		if (o instanceof String || d instanceof String)
			return ""+o+d;
		return ((Double)o)+((Double)d);
	}
	
	public static Object add (Object o,double d){
		if (o instanceof String)
			return ""+o+d;
		return ((Double)o)+d;
	}
	
	public static Object add (double d,Object o){
		if (o instanceof String)
			return ""+d+o;
		return ((Double)o)+d;
	}
	
	/*
	 * Used to check if 2 objects equal each other
	 */
	public static boolean equals(Object o1, Object o2){
		return (o1.equals(o2));
	}
	
	/*
	 * CompareTo is normally used in priority queues to get the order
	 */
	public static int compare(Object o1, Object o2){
		return o1.toString().compareTo(o2.toString());
	}

	public static Object bxor(Object object, Object object2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object bor(Object object, Object multValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object band(Object object, Object multValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object div(Object object, Object multValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sub(Object object, Object multValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object mult(Object object, Object multValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
