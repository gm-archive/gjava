/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

/**
 *
 * @author Ali
 */
public class Queue extends Object {

    java.util.LinkedList l;
    
    Queue(){
        l = new java.util.LinkedList();
    }
    
    public void destroy()
    {
        l=null;
    }
    
       public void clear()
    {
        l.clear();
    }
     
     public int size()
    {
      return  l.size();
    } 
     
     public boolean empty()
    {
      return  l.isEmpty();
    } 
     
     
             
             public boolean enqueue(Object o)
    {
      return  l.add(o);
    } 
             
              public Object dequeue()
    {
      return (Object) l.poll();
    } 
              
               public Object head()
    {
      return (Object) l.getLast();
    } 
               
                public Object tail()
    {
      return (Object) l.getFirst();
    } 
    
}
