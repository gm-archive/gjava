/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.groups;

import org.gcreator.fileclass.*;

/**
 * 
 * @author Luís
 * 
 * @author Serge Humphrey
 */
public class PathGroup extends Group {
    
    public PathGroup() {
        super();
    }
    
    public PathGroup(Folder root, String name){
        super(root, name);
    }
    
     
    @Override
    public boolean allowsFileType(String format){
        return (format.equalsIgnoreCase("path"));
    }
    
     
    @Override
    public boolean allowsGroup(Group group){
        if(group instanceof PathGroup)
            return true;
        return false;
    }
    
     
    @Override
    public Group newGroup(String name){
        Group group = new PathGroup(this, name);
        add(group);
        return group;
    }
    
    @Override
    public String getObjectType(){
        return "PathGroup";
    }
}
