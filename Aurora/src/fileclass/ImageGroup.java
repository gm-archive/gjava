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
public class ImageGroup extends Group{
    public ImageGroup(){
        super();
    }
    
    public ImageGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("gif")|format.equals("jpg")|format.equals("png"))
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof ImageGroup)
            return true;
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new ImageGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "ImageGroup";
    }
}
