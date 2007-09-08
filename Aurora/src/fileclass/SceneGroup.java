/*
 * ActorGroup.java
 * 
 * Created on 5/Set/2007, 23:24:50
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

/**
 *
 * @author Luís
 */
public class SceneGroup extends Group{
    public SceneGroup(){
        super();
    }
    
    public SceneGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("scene"))
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof SceneGroup)
            return true;
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new SceneGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "SceneGroup";
    }
}
