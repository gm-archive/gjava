package org.dolphin.game.api.types;

import java.util.NoSuchElementException;
import java.util.TreeMap;

public class PriorityQueue extends Variable {
	/* Stored as a TreeMap with the key representing the priority in the queue.
     * TreeMap stores in ascending order of key, so to get head of queue, get
     * the first key in the TreeMap.
     */
    private TreeMap<Variable, Variable> m;
    
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
    
    public void add(Variable value, Variable priority)
    {
        m.put(priority, value);
    }
    
    //change priority
    //find priority
    //delete value
    
    public Variable deleteMin()
    {
        try
        {
            Variable minKey = m.firstKey();
            Variable minValue = m.get(minKey);
            m.remove(minKey);
            return minValue;
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return new Variable();
        }
    }
    
    public Variable findMin()
    {
        try
        {
            return m.get(m.firstKey());
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return new Variable();
        }
    }
    
    public Variable deleteMax()
    {
        try
        {
            Variable maxKey = m.lastKey();
            Variable maxValue = m.get(maxKey);
            m.remove(maxKey);
            return maxValue;
        } catch (NoSuchElementException e) //If the queue was empty
        {
            return new Variable();
        }
    }
    
    public Variable findMax()
    {
        try
        {
            return m.get(m.lastKey());
        } catch (NoSuchElementException e)  //If the queue was empty
        {
            return new Variable();
        }
    }
    
    /** Returns the key for the given value, or new Variable()
     *  if the given value is not present
     */
    private Variable getKey(Variable value)
    {
        Variable currentKey = m.firstKey();
        for (int i = 0; i < m.size(); i++)
        {
            if (m.get(currentKey).compareTo(value) == 0)
                return currentKey;
            currentKey = m.higherKey(currentKey);
        }
        return new Variable();
    }
    
    public void changePriority(Variable value, Variable newPriority)
    {
        //Keys are priorities...
        Variable oldKey = getKey(value);
        m.remove(oldKey);
        m.put(newPriority, value);
    }
    
    public Variable findPriority(Variable value)
    {
        return getKey(value);
    }
    
    public void deleteValue(Variable value)
    {
        m.remove(getKey(value));
    }
}
