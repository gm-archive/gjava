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

import java.util.Enumeration;
import java.util.Vector;
import org.gcreator.exceptions.NoSuchFolderException;

/**
 *
 * @author Luís
 */
public abstract class Project extends Folder {

    public transient java.io.File location = null;
    /**
     * Shouldn't be public, but superpackages aren't implemented in Java 6 yet...
     * Use functions instead
     */
    public transient Vector<GFile> files = new Vector<GFile>();
    
    public Project() {
        super(null);
    }

    public int getIdFor(GFile file) {
        return files.indexOf(file);
    }

    public GFile getFileFor(int id) {
        try {
            return files.get(id);
        } catch (Exception e) {
            return null;
        }
    }

    public void addFile(GFile file) {
        try {
            files.add(file);
        } catch (Exception e) {
            System.out.println("Failed to add due to " + e);
        }
    }

    public Project(String name, java.io.File location) {
        super(name);
        this.location = location;
    }

    public String getType() {
        return null;
    }

    public static Project balance() {
        return null;//new Project();
    }

    @Override
    public String getObjectType() {
        return "Project";
    }

    public Enumeration getEnum(String key) {
        return null;
    }

    public boolean validOfType(GObject obj, String key) {
        return true;
    }

    public Folder getFolderFor(String key) {
        return null;
    }

    @Override
    public boolean allowDrag() {
        return false;
    }

    @Override
    public String getPath() {
        return "/";
    }

    @Override
    public Folder findFolder(String name) throws NoSuchFolderException {
        if (name == null) {
            throw new NoSuchFolderException();
        }
        if (name.equals("") || name.equals("/")) {
            return this;
        }
        if (name.charAt(0) == '/') {
            name = name.substring(1);
        }
        for (int i = 0; i < childNodes.size(); i++) {
            Object o = childNodes.get(i);
            if (o != null && o instanceof Folder) {
                try {
                    Folder a = ((Folder) o).findFolder(name.substring(name.indexOf(name)));
                    return a;
                } catch (NoSuchFolderException e) {
                }
            }
        }
        throw new NoSuchFolderException("Project");
    }

    @Override
    public GFile findFile(String name) throws NoSuchFolderException {
        if (name == null) {
            throw new NoSuchFolderException();
        }
        if (name.equals("") || name.equals("/")) {
            return null;
        }
        if (name.charAt(0) == '/') {
            name = name.substring(1);
        }
        for (int i = 0; i < childNodes.size(); i++) {
            Object o = childNodes.get(i);
            if (o != null && o instanceof Folder) {
                try {
                    GFile a = ((Folder) o).findFile(name.substring(name.indexOf(name)));
                    return a;
                } catch (NoSuchFolderException e) {
                }
            }
            if (o != null && o instanceof GFile) {
                if (((GFile) o).name.equals(name)) {
                    return (GFile) o;
                }
            }
        }
        throw new NoSuchFolderException("Project: " + name);
    }

    @Override
    public Project getProject() {
        return this;
    }
}
