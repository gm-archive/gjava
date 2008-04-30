/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Hashtable;

/**
 *
 * @author TGMG
 */
public class Map extends Object {
Hashtable h;

Map()
{
    h = new Hashtable();
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
         return (Object)h.get(key);
    } 
}
