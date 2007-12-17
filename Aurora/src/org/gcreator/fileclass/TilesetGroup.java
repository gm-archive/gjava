/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

/**
 *
 * @author luis
 */
public class TilesetGroup extends Group{
    public TilesetGroup(){
        super();
    }
    
    public TilesetGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("tileset"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof TilesetGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new TilesetGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "TilesetGroup";
    }
}