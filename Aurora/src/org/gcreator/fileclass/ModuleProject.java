/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís Reis
 */
public class ModuleProject extends Project{
    public ModuleProject(String name, String location){
        super(name, location);
    }
    
    public ModuleProject(){}
    
     public String getType(){
        return "Module";
    }
     
    public static ModuleProject balance(){
        return (ModuleProject) balancedCreation();
    }
     
    public Enumeration getEnum(String key){
        Enumeration e = null;
        return e;
    }
    
    public Folder magicAddition(String file)
    {
        return null;
    }
    
    private static Project balancedCreation(){
        Project project = new ModuleProject();
        
        return project;
    }
    
    public boolean allowsFileType(String format){
        return false;
    }
    
    public boolean allowsGroup(Group group){
        return false;
    }
    
    public Group newGroup(String name){
        return null;
    }
    
    public String getObjectType(){
        return "ModuleProject";
    }
    
    private ImageIcon project_module = new ImageIcon(getClass().getResource("/org/gcreator/resources/extension.png"));
    
    public ImageIcon getImage(){
        return project_module;
    }
}
