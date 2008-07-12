/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import java.io.Serializable;

/**
 *
 * @author Ali1
 */
public interface Resource extends Serializable, Cloneable{
    //public String name;
    static final long serialVersionUID = 1L;
//    public abstract String writeXml();
//    public abstract void readXml(String xml);
//    public abstract String exportToHtml(boolean xhtml);
     
    public Object clone();
}
