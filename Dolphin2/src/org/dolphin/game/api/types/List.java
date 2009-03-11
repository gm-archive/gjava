package org.dolphin.game.api.types;

import java.util.ArrayList;

public class List extends Object {
	ArrayList<Object> al;

	public List()
	{
	    al = new ArrayList<Object>();
	}

	public void destroy()
	    {
	        al=null;
	    }

	  public void clear()
	    {
	        al.clear();
	    }
	     
	     public int size()
	    {
	      return  al.size();
	    } 
	     
	     public boolean empty()
	    {
	      return  al.isEmpty();
	    } 
	     
	     public boolean addel(Object o)
	    {
	      return  al.add(o);
	    } 
	     
	     public boolean insert(Object pos,Object o)
	    {
	         if (((Double)pos) == -1)
	             al.add(o);
	         else
	             al.add(((Double)pos).intValue(), o);
	      return true;
	    } 

	     
	      public boolean replace(Object pos,Object o)
	    {
	             al.set(((Double)pos).intValue(), o);
	      return true;
	    } 
	      
	       public boolean delete(Object pos)
	    {
	             al.remove(((Double)pos));
	      return true;
	    } 
	       
	       public Object find_value(Object pos)
	    {
	          return  (Object) al.get(((Double)pos).intValue());
	      //return true;
	    } 
}
