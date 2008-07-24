/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass;

import java.util.Enumeration;
import org.gcreator.exceptions.NoSuchFolderException;

/**
 *
 * @author Luís
 */
public abstract class Project extends Folder {
     
    public java.io.File location = null;
    //public javax.swing.tree.DefaultMutableTreeNode froot;
    //The following vectors are for saving, getting resouces etc
    /*public Vector<Actor> actors = new Vector<Actor>();
    public Vector<Sprite> sprites = new Vector<Sprite>(); 
    public Vector<Sound> sounds = new Vector<Sound>();
    public Vector<Scene> scenes = new Vector<Scene>(); 
    public Vector<Classes> classes = new Vector<Classes>(); */
    
    public Project(){
        super(null);
    }
    
    public Project(String name, java.io.File location) {
        super(name);
        this.location = location;
    }
    
    public String getType(){
        return null;
    }
    
    public static Project balance(){
        return null;//new Project();
    } 
     
    public String getObjectType(){
        return "Project";
    }
    
    public Enumeration getEnum(String key){
        return null;
    }
    
    public boolean validOfType(GObject obj, String key){
        return true;
    }
    
    public Folder getFolderFor(String key){
        return null;
    }
    
    public boolean allowDrag(){
        return false;
    }
    
    public String getPath(){
        return "/";
    }
     
    public Folder findFolder(String name) throws NoSuchFolderException{
        if(name==null)
            throw new NoSuchFolderException();
        if(name.equals("")||name.equals("/"))
            return this;
        if(name.charAt(0)=='/')
            name = name.substring(1);
        for(int i = 0; i < childNodes.size(); i++){
            Object o = childNodes.get(i);
            if(o != null && o instanceof Folder){
                try{
                    Folder a = ((Folder) o).findFolder(name.substring(name.indexOf(name)));
                    return a;
                }
                catch(NoSuchFolderException e){}
            }
        }
        throw new NoSuchFolderException("Project");
    }
    
    public GFile findFile(String name) throws NoSuchFolderException{
        if(name==null)
            throw new NoSuchFolderException();
        if(name.equals("")||name.equals("/"))
            return null;
        if(name.charAt(0)=='/')
            name = name.substring(1);
        for(int i = 0; i < childNodes.size(); i++){
            Object o = childNodes.get(i);
            if(o != null && o instanceof Folder){
                try{
                    GFile a = ((Folder) o).findFile(name.substring(name.indexOf(name)));
                    return a;
                }
                catch(NoSuchFolderException e){}
            }
            if(o != null && o instanceof GFile){
                if(((GFile) o).name.equals(name)) return (GFile) o;
            }
        }
        throw new NoSuchFolderException("Project: " + name);
    }
    
    public Project getProject(){
        return this;
    }
}
