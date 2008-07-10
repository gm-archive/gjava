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
public class ActorGroup extends Group{
    public ActorGroup(){
        super();
    }
    
    public ActorGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("actor"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof ActorGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new ActorGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "ActorGroup";
    }
}
