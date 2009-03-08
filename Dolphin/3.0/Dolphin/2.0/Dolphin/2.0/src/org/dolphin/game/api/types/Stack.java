package org.dolphin.game.api.types;

public class Stack extends Variable {
	java.util.Stack s;

    public Stack(){
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
    
     public Variable pop()
    {
     return (Variable)s.pop();
    } 
     public Variable top()
    {
      return (Variable)s.firstElement();
    } 
     
}
