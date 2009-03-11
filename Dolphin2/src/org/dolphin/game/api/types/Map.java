package org.dolphin.game.api.types;

import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Map {
	TreeMap<Object, Object> h;

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
	     
	     public void add(Object key, Object value)
	    {
	         h.put(key, value);
	    } 
	     
	     public void delete(Object key)
	    {
	         h.remove(key);
	    } 
	     
	     public boolean exists(Object key)
	    {
	         if (h.get(key) !=null ) return true;
	         else return false;
	    } 
	     
	     public Object find(Object key)
	    {
	         return h.get(key);
	    } 
	     
	     /** Returns the first (smallest) key, or new Object() if the map is empty */
	     public Object findFirst()
	     {
	         try
	         {
	            return h.firstKey();
	         } catch (NoSuchElementException e)
	         {
	             return 0.0d;
	         }
	     }
	     
	     /** Returns the last (largest) key, or new Object() if the map is empty */
	     public Object findLast()
	     {
	         try
	         {
	            return h.lastKey();
	         } catch (NoSuchElementException e)
	         {
	             return 0.0d;
	         }
	     }
	     
	     /** Returns previous key, or new Object() if the order can't be determined
	      *  or the key given is null or not in the map
	      */
	     public Object findPrevious(Object key)
	     {
	         try
	         {
	             Object o = h.lowerKey(key);
	             if (o != null)
	                 return o;
	             else
	                 return 0.0d;
	         } catch (Exception e)
	         {
	             return 0.0d;
	         }
	     }
	     
	     /** Returns next key, or new Object() if the order can't be determined
	      *  or the key given is null or not in the map
	      */
	     public Object findNext(Object key)
	     {
	         try
	         {
	             Object o = h.higherKey(key);
	             if (o != null)
	                 return o;
	             else
	                 return 0.0d;
	         } catch (Exception e)
	         {
	             return 0.0d;
	         }
	     }
}
