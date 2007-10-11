/*
 * ActorGroup.java
 * 
 * Created on 5/Set/2007, 23:24:50
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author Luís
 */
public class CppGroup extends Group{
    public CppGroup(){
        super();
    }
    
    public CppGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("cpp")||format.equals("h"))
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof CppGroup)
            return true;
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new CppGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "CppGroup";
    }
}
