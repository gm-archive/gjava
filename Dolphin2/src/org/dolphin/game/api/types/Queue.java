package org.dolphin.game.api.types;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.dolphin.game.api.components.ErrorHandler;

public class Queue extends Variable {
public java.util.LinkedList l;
    
    public Queue(){
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
       
       public Queue getCopy()
       {
       	Queue copy = new Queue();
       	copy.l.addAll(0, l);
       	return copy;
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
      return l.poll();
    } 
              
               public Object head()
    {
      return  l.getLast();
    } 
               
                public Object tail()
    {
      return  l.getFirst();
    } 
                
                public String writeToString()
                {
               	 try {
               	 ByteArrayOutputStream f = new ByteArrayOutputStream();
               	 ObjectOutputStream out = new ObjectOutputStream(f);
               	        out.writeObject(l);
               	        out.close();
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
               	java.util.LinkedList st = (java.util.LinkedList)out.readObject();
               	 l=st;
               	 out.close();
               	 }catch (Exception e){
               		 ErrorHandler.showError(e, false);
               	 }
                }
}
