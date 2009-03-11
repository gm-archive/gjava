package org.dolphin.game.api.types;

import java.util.NoSuchElementException;
import java.util.TreeMap;

public class PriorityQueue extends Object {
	/* Stored as a TreeMap with the key representing the priority in the queue.
     * TreeMap stores in ascending order of key, so to get head of queue, get
     * the first key in the TreeMap.
     */
    private TreeMap<Object, Object> m;
    
    public PriorityQueue()
    {
        m = new TreeMap();
    }
    
    public void destroy()
    {
        m = null;
    }        
    
    public void clear()
    {
        m.clear();
    }
    
    public int size()
    {
        return m.size();
    }
    
    public boolean isEmpty()
    {
        return m.isEmpty();
    }
    
    public void add(Object value, Object priority)
    {
        m.put(priority, value);
    }
    
    //change priority
    //find priority
    //delete value
    
    public Object deleteMin()
    {
        try
        {
            Object minKey = m.firstKey();
            Object minValue = m.get(minKey);
            m.remove(minKey);
            return minValue;
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return 0.0d;
        }
    }
    
    public Object findMin()
    {
        try
        {
            return m.get(m.firstKey());
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return 0.0d;
        }
    }
    
    public Object deleteMax()
    {
        try
        {
            Object maxKey = m.lastKey();
            Object maxValue = m.get(maxKey);
            m.remove(maxKey);
            return maxValue;
        } catch (NoSuchElementException e) //If the queue was empty
        {
            return 0.0d;
        }
    }
    
    public Object findMax()
    {
        try
        {
            return m.get(m.lastKey());
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return 0.0d;
        }
    }
    
    /** Returns the key for the given value, or new Object()
     *  if the given value is not present
     */
    private Object getKey(Object value)
    {
        Object currentKey = m.firstKey();
        for (int i = 0; i < m.size(); i++)
        {
            if (Variable.compare(m.get(currentKey),value) == 0)
                return currentKey;
            currentKey = m.higherKey(currentKey);
        }
        return 0.0d;
    }
    
    public void changePriority(Object value, Object newPriority)
    {
        //Keys are priorities...
        Object oldKey = getKey(value);
        m.remove(oldKey);
        m.put(newPriority, value);
    }
    
    public Object findPriority(Object value)
    {
        return getKey(value);
    }
    
    public void deleteValue(Object value)
    {
        m.remove(getKey(value));
    }
}
