/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 * 
 * @author Luís
 * 
 * @author bob
 */
public class PathGroup extends Group {
    
    public PathGroup() {
        super();
    }
    
    public PathGroup(Folder root, String name){
        super(root, name);
    }
    
     
    @Override
    public boolean allowsFileType(String format){
        return (format.equalsIgnoreCase("path"));
    }
    
     
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof PathGroup)
            return true;
        return false;
    }
    
     
    @Override
    public Group newGroup(String name){
        Group group = new PathGroup(this, name);
        add(group);
        return group;
    }
    
    @Override
    public String getObjectType(){
        return "PathGroup";
    }
}
