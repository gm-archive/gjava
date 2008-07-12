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
public class JavaGroup extends Group{
    public JavaGroup(){
        super();
    }
    
    public JavaGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("java"))
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        if(group instanceof JavaGroup)
            return true;
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new JavaGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "JavaGroup";
    }
}
