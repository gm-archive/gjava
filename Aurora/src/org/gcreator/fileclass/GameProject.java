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

/**
 *
 * @author Luís
 */
public class GameProject extends Project {
    public GameProject(String name, String location){
        super(name, location);
    }
    
    public GameProject(){}
    
     
    public String getType(){
        return "Game";
    }
    
    public Folder magicAddition(String file)
    {
        try{
            if(file.equals("png")||file.equals("gif")||file.equals("jpg"))
                return findFolder("Images");
            else if(file.equals("sprite"))
                return findFolder("Sprites");
            else if(file.equals("actor"))
                return findFolder("Actors");
            else if(file.equals("scene"))
                return findFolder("Scenes");
            else if(file.equals("egml"))
                return findFolder("Classes");
            return findFolder("Distribution");
        }
        catch(Exception e){
            return null;
        }
    }
    
    public Folder magicAddition(Group folder){
        try{
            if(folder instanceof ImageGroup)
                return findFolder("Images");
            else if(folder instanceof SpriteGroup)
                return findFolder("Sprites");
            else if(folder instanceof ActorGroup)
                return findFolder("Actors");
            else if(folder instanceof SceneGroup)
                return findFolder("Scenes");
            return findFolder("Distribution");
        }
        catch(Exception e){
            return null;
        }
    }
     
    public static Project balancedCreation(){
        Project project = new GameProject();
        project.add(new ImageGroup(project, "Images"));
        project.add(new SpriteGroup(project, "Sprites"));
        project.add(new SoundGroup(project, "Sounds"));
        project.add(new ActorGroup(project, "Actors"));
        project.add(new SceneGroup(project, "Scenes"));
        project.add(new EGMLGroup(project, "Classes"));
        project.add(new Group(project, "Distribution"));
        org.gcreator.fileclass.File a = new org.gcreator.fileclass.File(project, "Settings", "settings", null);
        a.editable = false;
        a.value = new org.gcreator.fileclass.res.SettingsValues();
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
        return "GameProject";
    }
    
    private ImageIcon project_game = new ImageIcon(getClass().getResource("/org/gcreator/resources/game.png"));
    
    public ImageIcon getImage(){
        return project_game;
    }
}
