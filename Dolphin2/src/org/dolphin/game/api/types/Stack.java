package org.dolphin.game.api.types;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.dolphin.game.api.components.ErrorHandler;

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
     
     public String writeToString()
     {
    	 try {
    	 ByteArrayOutputStream f = new ByteArrayOutputStream();
    	 ObjectOutputStream out = new ObjectOutputStream(f);
    	        out.writeObject(s);
    	        out.close();
    	 /*f.write(101);
    	 f.write(s.size());
    	 for (Object obj : s) {
			if (obj instanceof Double)
				f.write(1);
			else
				f.write(0);
		}
    	 f.close();*/
    	 return f.toString();
    	 }catch (Exception e){
    		 ErrorHandler.showError(e, false);
    	 }
    	 return "";
     }
     
     public void readFromString(String string)
     {
    	 try {
    	 ByteArrayInputStream f = new ByteArrayInputStream(string.getBytes());
    	 ObjectInputStream out = new ObjectInputStream(f);
    	 java.util.Stack st = (java.util.Stack)out.readObject();
    	 s=st;
    	 out.close();
    	 }catch (Exception e){
    		 ErrorHandler.showError(e, false);
    	 }
     }
     
}
