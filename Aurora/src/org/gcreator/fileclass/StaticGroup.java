/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
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
public class StaticGroup extends Group{
    public StaticGroup(){
        super();
    }
    
    public StaticGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        return false;
    }
    
    public boolean allowsDelete(Object o){
        return false;
    }
     
    public Group newGroup(String name){
        return null;
    }
    
    public String getObjectType(){
        return "StaticGroup";
    }
}
