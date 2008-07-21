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

import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class ExtensionProject extends Project {

    public ExtensionProject(String name, java.io.File location) {
        super(name, location);
    }

    public ExtensionProject() {
    }

    public boolean allowsFileType(String format) {
        return false;
    }

    public boolean allowsGroup(Group group) {
        return false;
    }

    public String getType() {
        return "Extension";
    }

    public String getObjectType() {
        return "ExtensionProject";
    }

    public Group newGroup(String name) {
        Group group = new Group(this, name);
        add(group);
        return group;
    }

    public org.gcreator.fileclass.GFile[] getJavaFiles() {
        return org.gcreator.managers.FilesFinder.getFilesAt(this, "java");
    }

    public org.gcreator.fileclass.GFile[] getCppFiles() {
        return org.gcreator.managers.FilesFinder.getFilesAt(this, "cpp");
    }
    private ImageIcon img = new ImageIcon(getClass().getResource("/org/gcreator/resources/extension.png"));

    public ImageIcon getImage() {
        return img;
    }
}
