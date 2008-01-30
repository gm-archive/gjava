/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.plugins;

import java.util.Vector;

/**
 * @author Luís Reis
 */
public class Plugin {
    public String name = "";
    public String version = "";
    public Vector<String> authors = new Vector<String>();
    public String licenseLocation = "";
    public Vector<String> files = new Vector<String>();
    public PluginCore value;
}
