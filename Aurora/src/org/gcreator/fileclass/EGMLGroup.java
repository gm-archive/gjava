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
public class EGMLGroup extends Group{
    public EGMLGroup(){
        super();
    }
    
    public EGMLGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("egml"))
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof EGMLGroup)
            return true;
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new EGMLGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "EGMLGroup";
    }
}
