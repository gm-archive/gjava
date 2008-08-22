package org.gcreator.compilers.gjava.api;

import java.util.Comparator;
/**
 *
 * @author ray
 */
public class DescendingComparator implements Comparator {
    
    @Override
    public int compare(java.lang.Object o1, java.lang.Object o2)
    {
        if ((o1 instanceof Object) && (o2 instanceof Object))
        {
            int i = ((Object)o1).compareTo(o2);
            if (i == 0)
                return 0;
            else if (i < 0)
                return 1;
            else
                return -1;
        }
        else
            return -1;
    }
}
