/*
 * ActorGroup.java
 * 
 * Created on 5/Set/2007, 23:24:50
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

/**
 *
 * @author Luís
 */
public class CppRefGroup extends Group{
    public CppRefGroup(){
        super();
    }
    
    public CppRefGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("a")) //Static library
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new JavaGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "JavaGroup";
    }
}
