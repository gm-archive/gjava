package org.dolphin.game.api.types;

public class Stack extends Variable {
	public java.util.Stack s;

    public Stack(){
        s = new java.util.Stack();
    }
    
    public Stack getCopy()
    {
    	Stack copy = new Stack();
    	copy.s.addAll(0, s);
    	return copy;
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
     return s.pop();
    } 
     public Object top()
    {
      return s.firstElement();
    } 
     
}
