/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.plugins;

import java.util.Vector;
import javax.swing.ImageIcon;

/**
 * @author Luís Reis
 */
public class Plugin {

    public String name = "";
    public String version = "";
    public String img_loc = "";
    public Vector<String> authors = new Vector<String>();
    public String licenseLocation = "";
    public PluginCore value;
    public ImageIcon image;
    public Jar jar;
    public String update;
    public String coreName;
}
