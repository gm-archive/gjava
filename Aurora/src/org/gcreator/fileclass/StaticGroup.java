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
public class StaticGroup extends Group{
    public StaticGroup(){
        super();
    }
    
    public StaticGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        return null;
    }
    
    public String getObjectType(){
        return "StaticGroup";
    }
}