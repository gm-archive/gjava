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
 */
public class ImageGroup extends Group {
    
    public ImageGroup(){
        super();
    }
    
    public ImageGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("gif")|format.equals("jpg")|format.equals("png"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof ImageGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new ImageGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "ImageGroup";
    }
}
