/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.ArrayList;

/**
 *
 * @author TGMG
 */
public class List extends Object {
ArrayList al;

List()
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
}
