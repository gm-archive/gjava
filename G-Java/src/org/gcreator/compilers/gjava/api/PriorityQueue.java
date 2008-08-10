package org.gcreator.compilers.gjava.api;

import java.util.Iterator;

/** Class to represent a priority queue.
 *
 * @author Ray
 */
public class PriorityQueue extends Object{
    private java.util.PriorityQueue<Object> pq;
    private java.util.Comparator comparator = new PriorityComparator();
    
    public PriorityQueue()
    {
        pq = new java.util.PriorityQueue(11, comparator);
    }
    
    public void destroy()
    {
        pq = null;
    }        
    
    /** Removes all items from this priority queue */
    public void clear()
    {
        pq.clear();
    }
    
    /** Returns the number of items in this priority queue
     * @return The number of items in this priority queue
     */
    public int size()
    {
        return pq.size();
    }
    
    /** Returns true if the queue is empty, false otherwise */
    public boolean isEmpty()
    {
        return pq.isEmpty();
    }
    
    /** Adds an item to the priority queue
     * @param value The item to be added
     * @param priority The priority in the queue. Priority is based on <code>priority.getFloat()</code>
     */
    public void add(Object value, Object priority)
    {
        value.setPriority(priority.getFloat());
        try
        {
            pq.add(value);
        } catch (NullPointerException e)
        {
            GCL.show_error(new String("Null value attempted to be added to priority queue"), new Boolean(false));
        }
    }
    
    /** Removes and returns the item with the lowest priority */
    public Object deleteMin()
    {
        Object min = findMin();
        pq.remove(min);
        return min;
    }
    
    /** Returns but does not remove the item with the lowest priority */
    public Object findMin()
    {
        Iterator<Object> iter = pq.iterator();
        Object currentMin = iter.next();
        while (iter.hasNext())
        {
            Object next = iter.next();
            if (comparator.compare(currentMin, next) < 0)
                currentMin = next;
        }
        return currentMin;
    }
    
    /** Removes and returns the item with the highest priority */
    public Object deleteMax()
    {
        Object o = pq.poll();
        if (o != null)
            return o;
        else
            return new Object();
    }
    
    /** Returns but does not remove the item with the highest priority */
    public Object findMax()
    {
        Object o = pq.peek();
        if (o != null)
            return o;
        else
            return new Object();
    }
    
    /** Changes the priority of the specified value if it is in the queue */
    public void changePriority(Object value, Object newPriority)
    {
        Iterator<Object> iter = pq.iterator();
        boolean notFound = true;
        while (iter.hasNext() && notFound)
        {
            Object o = iter.next();
            if ((o.equals(value)).getBoolean())
            {
                o.setPriority(newPriority.getPriority());
                notFound = false;
            }
        }
        if (notFound)
            GCL.show_error(new String("Value not present in this priority queue"), new Boolean(false));
    }
    
    /** Returns the priority of the specified value if it is in the queue */
    public Object findPriority(Object value)
    {
        Iterator<Object> iter = pq.iterator();
        while (iter.hasNext())
        {
            Object o = iter.next();
            if ((o.equals(value)).getBoolean())
                return new Float(o.getPriority());
        }
        GCL.show_error(new String("Value not present in this priority queue"), new Boolean(false));
        return new Object();
    }
    
    public void deleteValue(Object value)
    {
        if (!pq.remove(value))
            GCL.show_error(new String("Value not present in this priority queue"), new Boolean(false));
    }
    
/*    To do:
ds_priority_write(id) Turns the data structure into a string and returns this string. The string can then be used to e.g. save it to a file. This provides an easy mechanism for saving data structures.
ds_priority_read(id,str) Reads the data structure from the given string (as created by the previous call). 
 */
}
