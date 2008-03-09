/*
 * GameProject.java
 * 
 * Created on 5/Set/2007, 14:52:05
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import java.util.Enumeration;
import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class GameProject extends Project{
    public GameProject(String name, String location){
        super(name, location);
    }
    
    public GameProject(){}
    
     
    public String getType(){
        return "Game";
    }
    
    public static GameProject balance(){
        return (GameProject) balancedCreation();
    }
    
    public Enumeration getEnum(String key){
        Enumeration e = null;
        if (key.equals("actor")) {
            e = node.getChildAt(5).children();
        } else if (key.equals("scene")) {
            e = node.getChildAt(6).children();
        } else if (key.equals("timeline")) {
            e = node.getChildAt(4).children();
        } else if (key.equals("image")) {
            e = node.getChildAt(0).children();
        } else if (key.equals("sprite")) {
            e = node.getChildAt(1).children();
        } else if (key.equals("tileset")) {
            e = node.getChildAt(2).children();
        } else if (key.equals("sound")) {
            e = node.getChildAt(3).children();
        } else if (key.equals("class")) {
            e = node.getChildAt(7).children();
        }
        return e;
    }
    
    public Folder magicAddition(String file)
    {
        try{
            if(file.equals("png")||file.equals("gif")||file.equals("jpg"))
                return findFolder("$209");
            else if(file.equals("sprite"))
                return findFolder("$210");
            else if(file.equals("tileset"))
                return findFolder("$211");
            else if(file.equals("actor"))
                return findFolder("$214");
            else if(file.equals("scene"))
                return findFolder("$215");
            else if(file.equals("egml")||file.equals("gcl")||file.equals("struct")||file.equals("gs"))
                return findFolder("$216");
            else if(file.equals("timeline"))
                return findFolder("$213");
            return findFolder("$217");
        }
        catch(Exception e){
            return null;
        }
    }
    
    public Folder magicAddition(Group folder){
        try{
            if(folder instanceof ImageGroup)
                return findFolder("$209");
            else if(folder instanceof SpriteGroup)
                return findFolder("$210");
            else if(folder instanceof ActorGroup)
                return findFolder("$214");
            else if(folder instanceof SceneGroup)
                return findFolder("$215");
            else if(folder instanceof TilesetGroup)
                return findFolder("$211");
            else if(folder instanceof TimelineGroup)
                return findFolder("$213");
            else if(folder instanceof EGMLGroup)
                return findFolder("$216");
            return findFolder("Distribution");
        }
        catch(Exception e){
            return null;
        }
    }
     
    private static Project balancedCreation(){
        Project project = new GameProject();
        project.add(new ImageGroup(project, "$209"));
        project.add(new SpriteGroup(project, "$210"));
        project.add(new TilesetGroup(project, "$211"));
        project.add(new SoundGroup(project, "$212"));
        project.add(new TimelineGroup(project, "$213"));
        project.add(new ActorGroup(project, "$214"));
        project.add(new SceneGroup(project, "$215"));
        project.add(new EGMLGroup(project, "$216"));
        project.add(new Group(project, "$217"));
        org.gcreator.fileclass.File a = new org.gcreator.fileclass.File(project, "$218", "settings", null);
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
    
    public boolean allowsDelete(Object o){
        return false;
    }
    
    public String getObjectType(){
        return "GameProject";
    }
    
    private ImageIcon project_game = new ImageIcon(getClass().getResource("/org/gcreator/resources/game.png"));
    
    public ImageIcon getImage(){
        return project_game;
    }
}
