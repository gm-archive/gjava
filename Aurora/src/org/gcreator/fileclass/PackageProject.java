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

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class PackageProject extends Project {
    public PackageProject(String name, File location){
        super(name, location);
    }
    
    public PackageProject(){}
    
     
    public String getType(){
        return "Package";
    }
    
    public String getObjectType(){
        return "PackageProject";
    }
    
    private ImageIcon img = new ImageIcon(getClass().getResource("/org/gcreator/resources/package.png"));
    
    public ImageIcon getImage(){
        return img;
    }
}
