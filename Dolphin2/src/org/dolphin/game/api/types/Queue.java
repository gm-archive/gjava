package org.dolphin.game.api.types;

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
}
