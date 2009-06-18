package org.dolphin.game.api.types;

import java.io.Serializable;

import org.dolphin.game.Game;
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
		else if (o instanceof Double && d instanceof Double)
		return ((Double)o)+((Double)d);
		else
			return 0d;
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
	
	public static Object add(double d1,double d2){
		return d1+d2;
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

	public static Object bxor(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (double)(((Double)object).intValue() ^ ((Double)multValue).intValue());
		return object;
	}

	public static Object bor(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (double)(((Double)object).intValue() | ((Double)multValue).intValue());
		return object;
	}

	public static Object band(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (double)(((Double)object).intValue() & ((Double)multValue).intValue());
		return object;
	}

	public static Object div(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object / (Double)multValue;
		return object;
	}

	public static Object sub(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object - (Double)multValue;
		return object;
	}

	public static Object mult(Object object, Object multValue) {
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object * (Double)multValue;
		return object;
	}
	
	public static boolean gt(Object object, Object multValue){
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object > (Double)multValue;
		return false;
	}
	
	public static boolean gte(Object object, Object multValue){
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object >= (Double)multValue;
		return false;
	}
	
	public static boolean lt(Object object, Object multValue){
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object < (Double)multValue;
		return false;
	}
	
	public static boolean lte(Object object, Object multValue){
		if (object instanceof Double && multValue instanceof Double)
			return (Double)object <= (Double)multValue;
		return false;
	}
	
	/*
	 * This is used for instance variables to get the actor out of a java Object
	 */
	public static Actor getActor(Object object){
		if (object instanceof Actor){
			return (Actor)object;
		}
		if (object instanceof Double)
		{
			double number = (Double)object;
			if (number > 100000)
			{
				return Game.currentRoom.getInstance(number);
			}
			else
				return Actor.noone;
		}
		if (object instanceof AllOfObject)
			return (((AllOfObject)object).getActor()==null)?Actor.noone:((AllOfObject)object).getActor();
		
		return Actor.noone;
		
	}
	
	public static Class getTheClass(Object o){
		if (o instanceof AllOfObject)
			return ((AllOfObject)o).theclass;
		return o.getClass();
	}

	/*
	 * This is used in scripts to get the argument from the list without throwing a outofbounds exception
	 */
	public static Object getArgument(Object[] list,int id){
		if (list.length >= id)
		return list[id];
		else
			return 0d;
	}
	
	public static Boolean toBoolean(Object o){
		if (o instanceof Boolean)
			return (Boolean)o;
		else if (o instanceof Double)
			return ((Double)o <= 0.4)? false:true; //0.4 is false 0.5 is true
		else if (o instanceof Actor)
			return (((Actor)o).equals(Actor.noone))? false:true;
		return false;
	}


}
