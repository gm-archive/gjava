/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.units;

import java.io.File;
import java.net.URI;

/**
 * This class provides a Bean implementation of java.io.File.
 * This is escepially useful if you are using a <tt>java.beans.XMLEncoder</tt> or a <tt>java.beans.XMLDecoder</tt>.
 * 
 * @author Serge Humphrey
 * @see java.beans.XMLEncoder
 * @see java.beans.XMLDecoder
 */
public final class BeanFile extends File {
    private String spath;
    
    public BeanFile() {
        super("./");
        spath = getAbsolutePath();
    }
    /**
     * Creates a new BeanFile from a given file.
     * @param file The file to create the BeanFile from.
     */
    public BeanFile(File file) {
        super(file.toURI());
        spath = file.getAbsolutePath();
    }
    
    /**
     * {@inheritDoc}
     */
    public BeanFile(String pathname) {
	super(pathname);
        spath = getAbsolutePath();
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(String parent, String child) {
	super(parent, child);
        spath = getAbsolutePath();
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(File parent, String child) {
	super(parent, child);
        spath = getAbsolutePath();
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(URI uri) {
        super(uri);
        spath = getAbsolutePath();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new BeanFile((File)super.clone());
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getAbsolutePath() {
        return (spath != null) ? spath : super.getAbsolutePath();
    }
    
    /**
     @deprecated <strong>DO NOT USE</strong>
     */
    public void setSPath(String path) {
        this.spath = path;
    }
    
    /**
     @deprecated <strong>DO NOT USE</strong>
     */
    public String getSPath() {
        return spath;
    }
}
