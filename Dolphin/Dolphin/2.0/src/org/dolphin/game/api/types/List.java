package org.dolphin.game.api.types;

import java.util.ArrayList;

public class List extends Variable {
	ArrayList al;

	public List()
	{
	    al = new ArrayList();
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
	     
	     public boolean addel(Variable o)
	    {
	      return  al.add(o);
	    } 
	     
	     public boolean insert(Variable pos,Variable o)
	    {
	         if (pos.getInt() == -1)
	             al.add(o);
	         else
	             al.add(pos.getInt(), o);
	      return true;
	    } 

	     
	      public boolean replace(Variable pos,Variable o)
	    {
	             al.set(pos.getInt(), o);
	      return true;
	    } 
	      
	       public boolean delete(Variable pos)
	    {
	             al.remove(pos.getInt());
	      return true;
	    } 
	       
	       public Variable find_value(Variable pos)
	    {
	          return  (Variable) al.get(pos.getInt());
	      //return true;
	    } 
}
