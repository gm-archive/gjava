/*
 * GameProjectr.java
 * 
 * Created on 5/Set/2007, 14:52:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import javax.swing.ImageIcon;
import org.gcreator.managers.FilesFinder;

/**
 *
 * @author Luís
 */
public class ExtensionProject extends Project {
    public ExtensionProject(String name, String location){
        super(name, location);
    }
    
    public ExtensionProject(){}
    
     
    public boolean allowsFileType(String format){
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        return false;
    }
    
     
    public String getType(){
        return "Extension";
    }
    
    public String getObjectType(){
        return "ExtensionProject";
    }
    
     
    public Group newGroup(String name){
        Group group = new Group(this, name);
        add(group);
        return group;
    }
    
    public org.gcreator.fileclass.GFile[] getJavaFiles(){
        return org.gcreator.managers.FilesFinder.getFilesAt(this, "java");
    }
    
    public org.gcreator.fileclass.GFile[] getCppFiles(){
        return org.gcreator.managers.FilesFinder.getFilesAt(this, "cpp");
    }
    
    private ImageIcon img = new ImageIcon(getClass().getResource("/org/gcreator/resources/extension.png"));
    
    public ImageIcon getImage(){
        return img;
    }
}
