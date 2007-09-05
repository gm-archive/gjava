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
public class Folder extends Object{
    private Object[] childNodes;
    
    
    
    public Folder(String name){
        super(name);
        childNodes = new Object[100]; //Up to 100 childNodes
    }
    
    public boolean add(Object node){
        int i = 0;
        while(i < 100 && childNodes[i]!=null)
            i++;
        if(i==100)
            return false;
        childNodes[i] = node;
        return true;
    }
    
    public int find(Object search){
        if(childNodes==null)
            return -1;
        for(int i = 0; i < childNodes.length; i++)
            if(childNodes[i]==search)
                return i;
        return -1;
    }
    
    public Object childAt(int pos){
        return childNodes[pos];
    }
    
    public int getChildNum(){
        int num = 0;
        for(int i = 0; i < childNodes.length; i++)
            if(childNodes[i]!=null)
                num++;
        return num;
    }
    
    public int getChildArrayNum(){
        return childNodes.length;
    }
    
    public boolean allowsFileType(String format){
        return true;
    }
    
    public boolean allowsGroup(Group group){
        return true;
    }
}
