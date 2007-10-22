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
    
    @Override
    public String getType(){
        return "Game";
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
