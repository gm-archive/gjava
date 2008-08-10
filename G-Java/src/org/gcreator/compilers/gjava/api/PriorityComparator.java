package org.gcreator.compilers.gjava.api;

/** Used to order elements in a PriorityQueue according to their priority.
 * This comparator reverses the ordering of the objects' priority value,
 * because a PriorityQueue's head is the <i>least</i> object according to
 * the comparator used, but it is more intuitive to have a higher number priority
 * at the front of a priority queue.
 *
 * @author ray
 */
public class PriorityComparator implements java.util.Comparator {
    @Override
    public int compare(java.lang.Object o1, java.lang.Object o2)
    {
        if ((o1 instanceof Object) && (o2 instanceof Object))
        {
            if (((Object)o1).getPriority() > ((Object)o2).getPriority())
                return -1;
            else if (((Object)o1).getPriority() < ((Object)o2).getPriority())
                return 1;
            else
                return 0;
        }
        else
            throw new ClassCastException();
    }
}
