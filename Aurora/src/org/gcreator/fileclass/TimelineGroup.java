/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author luis
 */
public class TimelineGroup extends Group{
    public TimelineGroup(){
        super();
    }
    
    public TimelineGroup(Folder root, String name){
        super(root, name);
    }
    
    public boolean allowsFileType(String format){
        if(format.equals("timeline"))
            return true;
        return false;
    }
    
    public boolean allowsGroup(Group group){
        if(group instanceof TimelineGroup)
            return true;
        return false;
    }
    
    public Group newGroup(String name){
        Group group = new TimelineGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "TimelineGroup";
    }
}
