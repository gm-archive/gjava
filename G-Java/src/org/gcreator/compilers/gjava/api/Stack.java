/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;


/**
 *
 * @author Ali
 */
public class Stack extends Object {
java.util.Stack s;

    Stack(){
        s = new java.util.Stack();
    }
    
    public void destroy()
    {
        s=null;
    }
    
     public void clear()
    {
        s.clear();
    }
     
     public int size()
    {
      return  s.size();
    } 
     
     public boolean empty()
    {
      return  s.empty();
    } 
     
     public void push(Object o)
    {
      s.push(o);
    } 
    
     public Object pop()
    {
     return (Object)s.pop();
    } 
     public Object top()
    {
      return (Object)s.firstElement();
    } 
     
}
