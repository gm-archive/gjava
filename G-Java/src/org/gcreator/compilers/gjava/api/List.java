/*
 * This class is needed for the gcl list functions
 */

package org.gcreator.compilers.gjava.api;

import java.util.ArrayList;

/**
 * List class
 * @author TGMG
 */
public class List extends Object {
ArrayList al;

List()
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
         if (pos.getInt() == -1)
             al.add(o);
         else
             al.add(pos.getInt(), o);
      return true;
    } 

     
      public boolean replace(Object pos,Object o)
    {
             al.set(pos.getInt(), o);
      return true;
    } 
      
       public boolean delete(Object pos)
    {
             al.remove(pos.getInt());
      return true;
    } 
       
       public Object find_value(Object pos)
    {
          return  (Object) al.get(pos.getInt());
      //return true;
    } 
       
       public void sort(boolean ascending)
       {
           if (ascending)   //Use natural (ascending) ordering
               java.util.Collections.sort(al);
           else             //Use inverted ordering
               java.util.Collections.sort(al, new DescendingComparator());
       }
       
       public int findIndex(Object o)
       {
           return al.indexOf(o);
       }
}
