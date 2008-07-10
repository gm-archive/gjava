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
public class ToolbarSeparator extends ToolbarItem{
    public ToolbarSeparator(){
        
    }
    public int getWidth(){
        return 3;
    }
    public int getHeight(){
        return 10;
    }
    public void paint(Graphics g, int x, int width){
        g.setColor(Color.BLACK);
        g.drawLine(x+1, 1, x+1, width-1);
    }
}
