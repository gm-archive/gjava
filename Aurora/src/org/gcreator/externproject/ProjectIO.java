/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.externproject;

import java.util.Hashtable;

/**
 *
 * @author Serge Humphrey
 */
public class ProjectIO {
    public static Hashtable<String, Class> projectMap;
    //public static HashMap<String, Class> fileMap;
    
    static {
        /* Initilize HashMaps*/
        projectMap = new Hashtable<String, Class>(5);
        
        //Game types
        projectMap.put("Game.Empty", org.gcreator.fileclass.GameProject.class);
        projectMap.put("Game.RPG", org.gcreator.fileclass.GameProject.class);
        projectMap.put("Game.Platform", org.gcreator.fileclass.GameProject.class);
        projectMap.put("Game.Aviation", org.gcreator.fileclass.GameProject.class);
        
        //Module types
        projectMap.put("Module.Empty", org.gcreator.fileclass.ModuleProject.class);
        
        
        /*fileMap = new HashMap<String, Class>(10);
        // Game
        fileMap.put("Game.File", org.gcreator.fileclass.GFile.class);
        fileMap.put("Game.ImageGroup", org.gcreator.fileclass.groups.ImageGroup.class);
        fileMap.put("Game.SpriteGroup", org.gcreator.fileclass.groups.SpriteGroup.class);
        fileMap.put("Game.TilesetGroup", org.gcreator.fileclass.groups.TilesetGroup.class);
        fileMap.put("Game.PathGroup", org.gcreator.fileclass.groups.PathGroup.class);
        fileMap.put("Game.SoundGroup", org.gcreator.fileclass.groups.SoundGroup.class);
        fileMap.put("Game.TimelineGroup", org.gcreator.fileclass.groups.TimelineGroup.class);
        fileMap.put("Game.ActorGroup", org.gcreator.fileclass.groups.ActorGroup.class);
        fileMap.put("Game.SceneGroup", org.gcreator.fileclass.groups.SceneGroup.class);
        fileMap.put("Game.GCLGroup", org.gcreator.fileclass.groups.GCLGroup.class);
        fileMap.put("Game.PlainGroup", org.gcreator.fileclass.Group.class);
        // Module
        fileMap.put("Module.File", org.gcreator.fileclass.GFile.class);
        fileMap.put("Game.ImageGroup", org.gcreator.fileclass.groups.ImageGroup.class);
        fileMap.put("Game.GCLGroup", org.gcreator.fileclass.groups.GCLGroup.class);
        fileMap.put("Game.ActionGroup", org.gcreator.fileclass.groups.ActionGroup.class);
        fileMap.put("Module.PlainGroup", org.gcreator.fileclass.Group.class);*/
    }
    
    /*
     * Don't allow instantation
     */
    private ProjectIO() {}
}
