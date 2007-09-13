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
public class JavaGroup extends Group{
    public JavaGroup(){
        super();
    }
    
    public JavaGroup(Folder root, String name){
        super(root, name);
    }
    
    @Override
    public boolean allowsFileType(String format){
        if(format.equals("java"))
            return true;
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof JavaGroup)
            return true;
        return false;
    }
    
    @Override
    public Group newGroup(String name){
        Group group = new JavaGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "JavaGroup";
    }
}
