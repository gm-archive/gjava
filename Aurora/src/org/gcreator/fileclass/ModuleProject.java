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
        if (key.equals("class")) {
            e = node.getChildAt(0).children();
        }
        return e;
    }
    
    public Folder magicAddition(String file)
    {
        try{
            if(file.equals("egml")||file.equals("gcl")||file.equals("struct")||file.equals("gs"))
                return findFolder("Classes");
        }
        catch(Exception e){}
        return null;
    }
    
    public Folder magicAddition(Group g){
        try{
            if(g instanceof EGMLGroup)
                return findFolder("Classes");
        }
        catch(Exception e){}
        return null;
    }
    
    private static Project balancedCreation(){
        Project project = new ModuleProject();
        project.add(new EGMLGroup(project, "Classes"));
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
