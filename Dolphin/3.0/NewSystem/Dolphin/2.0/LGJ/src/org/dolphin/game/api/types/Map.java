package org.dolphin.game.api.types;

import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Map extends Variable {
	TreeMap<Variable, Variable> h;

	public Map()
	{
	    h = new TreeMap();
	}

	public void destroy()
	    {
	        h=null;
	    }

	  public void clear()
	    {
	        h.clear();
	    }
	     
	     public int size()
	    {
	      return  h.size();
	    } 
	     
	     public boolean empty()
	    {
	      return  h.isEmpty();
	    } 
	     
	     public void add(Variable key, Variable value)
	    {
	         h.put(key, value);
	    } 
	     
	     public void delete(Variable key)
	    {
	         h.remove(key);
	    } 
	     
	     public boolean exists(Variable key)
	    {
	         if (h.get(key) !=null ) return true;
	         else return false;
	    } 
	     
	     public Variable find(Variable key)
	    {
	         return (Variable)h.get(key);
	    } 
	     
	     /** Returns the first (smallest) key, or new Variable() if the map is empty */
	     public Variable findFirst()
	     {
	         try
	         {
	            return h.firstKey();
	         } catch (NoSuchElementException e)
	         {
	             return new Variable();
	         }
	     }
	     
	     /** Returns the last (largest) key, or new Variable() if the map is empty */
	     public Variable findLast()
	     {
	         try
	         {
	            return h.lastKey();
	         } catch (NoSuchElementException e)
	         {
	             return new Variable();
	         }
	     }
	     
	     /** Returns previous key, or new Variable() if the order can't be determined
	      *  or the key given is null or not in the map
	      */
	     public Variable findPrevious(Variable key)
	     {
	         try
	         {
	             Variable o = h.lowerKey(key);
	             if (o != null)
	                 return o;
	             else
	                 return new Variable();
	         } catch (Exception e)
	         {
	             return new Variable();
	         }
	     }
	     
	     /** Returns next key, or new Variable() if the order can't be determined
	      *  or the key given is null or not in the map
	      */
	     public Variable findNext(Variable key)
	     {
	         try
	         {
	             Variable o = h.higherKey(key);
	             if (o != null)
	                 return o;
	             else
	                 return new Variable();
	         } catch (Exception e)
	         {
	             return new Variable();
	         }
	     }
}
