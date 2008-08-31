/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.externproject;

import java.io.File;
import java.util.zip.ZipInputStream;
import org.gcreator.fileclass.Project;

/**
 *
 * @author luis
 */
public class ImportContext {

    private File f = null;
    public ZipInputStream zip = null;
    public Project p = null;

    public ImportContext(File f) {
        this.f = f;
    }

    public File getFile() {
        return f;
    }

    public Project getProject() {
        return p;
    }
}
