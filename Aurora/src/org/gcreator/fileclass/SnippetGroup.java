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
public class SnippetGroup extends Group{
    public SnippetGroup(){
        super();
    }
    
    public SnippetGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("snippet"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof SnippetGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new SnippetGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "SnippetGroup";
    }
}
