/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass;

/**
 *
 * @author Luís
 */
public class SpriteGroup extends Group{
    public SpriteGroup(){
        super();
    }
    
    public SpriteGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("sprite"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof SpriteGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new SpriteGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "SpriteGroup";
    }
}
