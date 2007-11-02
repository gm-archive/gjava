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
public class JavaRefGroup extends Group{
    public JavaRefGroup(){
        super();
    }
    
    public JavaRefGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("class")) //Compiled Java
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new JavaGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "JavaRefGroup";
    }
}
