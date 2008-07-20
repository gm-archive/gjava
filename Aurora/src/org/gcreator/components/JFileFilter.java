/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class JFileFilter extends FileFilter {

    private static final long serialVersionUID = 1L;
    private String filter;
    private String desc;

    /**
     * 
     * @param filter The filter regular expression
     * @param desc The description
     */
    public JFileFilter(String filter, String desc) {
        this.filter = filter;
        this.desc = desc;
    }

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String fname = f.getName().toLowerCase();
        String[] s = filter.split("|");
        if(fname.matches(filter))
            return true;
        return false;
    }

    public String getDescription() {
        return desc;
    }
}
