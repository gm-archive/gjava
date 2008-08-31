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
    }

    /*  Don't allow instantation
     */
    private ProjectIO() {
    }
}
