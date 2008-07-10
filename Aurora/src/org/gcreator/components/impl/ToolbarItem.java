/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.awt.*;

/**
 *
 * @author luis
 */
public abstract class ToolbarItem {
    //These methods aren't part of the toolbar
    //These are just for organization in the toolbar editor
    /**
     * Paints something in a given graphic. Notice that Y is not a parameter
     * @param g The graphics
     * @param x The X position
     * @param height The Height of the toolbar
     */
    public abstract void paint(Graphics g, int x, int height);
    public abstract int getWidth();
    public abstract int getHeight();
}
