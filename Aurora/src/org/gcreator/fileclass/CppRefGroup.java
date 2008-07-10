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
public class CppRefGroup extends Group{
    public CppRefGroup(){
        super();
    }
    
    public CppRefGroup(Folder root, String name){
        super(root, name);
    }
    
     
    public boolean allowsFileType(String format){
        if(format.equals("a")) //Static library
            return true;
        return false;
    }
    
     
    public boolean allowsGroup(Group group){
        return false;
    }
    
     
    public Group newGroup(String name){
        Group group = new JavaGroup(this, name);
        add(group);
        return group;
    }
    
    public String getObjectType(){
        return "CppRefGroup";
    }
}
