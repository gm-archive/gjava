/*
 * Folder.java
 * 
 * Created on 4/Set/2007, 20:13:08
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

/**
 *
 * @author Luís
 */
public abstract class Folder extends Object{
    public Object[] childNodes;
    
    public int find(Object search){
        if(childNodes==null)
            return -1;
        for(int i = 0; i < childNodes.length; i++)
            if(childNodes[i]==search)
                return i;
        return -1;
    }
}
