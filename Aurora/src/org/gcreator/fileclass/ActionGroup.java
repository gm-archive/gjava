/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author luis
 */
public class ActionGroup extends Group{
    public ActionGroup(){
        super();
    }
    
    public ActionGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("action"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof ActionGroup)
            return true;
        return false;
    }
     
    public Group newGroup(String name){
        Group group = new ActionGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "ActionGroup";
    }
}
