/*
 * Project.java
 * 
 * Created on 4/Set/2007, 20:15:34
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import org.gcreator.exceptions.NoSuchFolderException;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Classes;
//import fileclass.res.Image;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sound;
import org.gcreator.fileclass.res.Sprite;
import java.util.Vector;

/**
 *
 * @author Luís
 */
public class Project extends Folder{
    public String location; //If project "Alfa" is in "C:/Program Files/Alfa", leave only "C:/Program Files/";
    
    //The following vectors are for saving, getting resouces etc
    public Vector<Actor> actors = new Vector<Actor>();
    public Vector<Sprite> sprites = new Vector<Sprite>(); 
    public Vector<Sound> sounds = new Vector<Sound>();
    public Vector<Scene> scenes = new Vector<Scene>(); 
    public Vector<Classes> classes = new Vector<Classes>(); 
    
    public Project(String name, String location){
        super(name);
        this.location = location;
    }
    
    public String getType(){
        return null;
    }
    
    @Override
    public String getObjectType(){
        return "Project";
    }
    
    @Override
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
}
