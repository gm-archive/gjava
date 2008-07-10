/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass;

import java.util.*;
import javax.swing.*;
import org.gcreator.units.ObjectNode;

/**
 *
 * @author Luís Reis
 */
public class ModuleProject extends Project{
    
    public int images = 1;
    public int classes = 1;
    public int scripts = 1;
    public int actions = 1;
    
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
        if (key.equals("image")) {
            e = node.getChildAt(0).children();
        }
        if (key.equals("class")) {
            e = node.getChildAt(1).children();
        }
        if (key.equals("action")) {
            e = node.getChildAt(2).children();
        }
        return e;
    }
    
    public Folder getFolderFor(String key){
        if (key.equals("image")) {
            return (Folder) ((ObjectNode) node.getChildAt(0)).object;
        } else if (key.equals("class")) {
            return (Folder) ((ObjectNode) node.getChildAt(1)).object;
        } else if (key.equals("action")){
            return (Folder) ((ObjectNode) node.getChildAt(2)).object;
        }
        return null;
    }
    
    public Folder magicAddition(String file)
    {
        try{
            if(file.equals("png")||file.equals("gif")||file.equals("jpg"))
                return findFolder("$209");
            if(file.equals("egml")||file.equals("gcl")||file.equals("struct")||file.equals("gs"))
                return findFolder("$216");
            if(file.equals("action"))
                return findFolder("$268");
        }
        catch(Exception e){}
        return null;
    }
    
    public Folder magicAddition(Group g){
        try{
            if(g instanceof ImageGroup)
                return findFolder("$209");
            if(g instanceof EGMLGroup)
                return findFolder("$216");
            if(g instanceof ActionGroup)
                return findFolder("$268");
        }
        catch(Exception e){}
        return null;
    }
    
    private static Project balancedCreation(){
        Project project = new ModuleProject();
        project.add(new ImageGroup(project, "$209"));
        project.add(new EGMLGroup(project, "$216"));
        project.add(new ActionGroup(project, "$268"));
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
    
    public boolean allowsDelete(GObject o){
        return false;
    }
    
    public String getObjectType(){
        return "ModuleProject";
    }
    
    private ImageIcon project_module = new ImageIcon(getClass().getResource("/org/gcreator/resources/extension.png"));
    
    public ImageIcon getImage(){
        return project_module;
    }
}
