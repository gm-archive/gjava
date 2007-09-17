/*
 * GameProjectr.java
 * 
 * Created on 5/Set/2007, 14:52:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass;

import managers.FilesFinder;

/**
 *
 * @author Luís
 */
public class ExtensionProject extends Project {
    public ExtensionProject(String name, String location){
        super(name, location);
    }
    
    @Override
    public boolean allowsFileType(String format){
        return false;
    }
    
    @Override
    public boolean allowsGroup(Group group){
        return false;
    }
    
    @Override
    public String getType(){
        return "Extension";
    }
    
    public String getObjectType(){
        return "ExtensionProject";
    }
    
    public fileclass.File[] getJavaFiles(){
        return managers.FilesFinder.getFilesAt(this, "java");
    }
}
