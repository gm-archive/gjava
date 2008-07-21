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
public class BeanFile extends File {
    public BeanFile() {
        super("./");
    }
    /**
     * Creates a new BeanFile from a given file.
     * @param file The file to create the BeanFile from.
     */
    public BeanFile(File file) {
        super(file.toURI());
    }
    
    /**
     * {@inheritDoc}
     */
    public BeanFile(String pathname) {
	super(pathname);
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(String parent, String child) {
	super(parent, child);
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(File parent, String child) {
	super(parent, child);
    }

    /**
     * {@inheritDoc}
     */
    public BeanFile(URI uri) {
        super(uri);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
