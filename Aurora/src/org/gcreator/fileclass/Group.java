/*
 * Group.java
 * 
 * Created on 4/Set/2007, 20:14:26
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author Luís
 */
public class Group extends Folder{
    public Folder root;

    public Group(){super("");}

    
    public Group(Folder root, String name){
        super(name);
        this.root = root;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new Group(this, name);
        add(group);
        return group;
    }
    
    @Override
    public String getObjectType(){
        return "Group";
    }
}
