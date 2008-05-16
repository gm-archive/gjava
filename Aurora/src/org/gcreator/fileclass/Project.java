/*
 * Project.java
 * 
 * Created on 4/Set/2007, 20:15:34
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import java.util.Enumeration;
import org.gcreator.exceptions.NoSuchFolderException;

/**
 *
 * @author Luís
 */
public class Project extends Folder {
     
    public String location = "";
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
    
    public Project(String name, String location){
        super(name);
        this.location = location;
    }
    
    public String getType(){
        return null;
    }
    
    public static Project balance(){
        return new Project();
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
    
    public Project getProject(){
        return this;
    }
}
