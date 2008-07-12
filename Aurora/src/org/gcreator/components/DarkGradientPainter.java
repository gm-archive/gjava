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

import java.awt.*;

/**
 *
 * @author Luís
 */
public abstract class DarkGradientPainter{
    public static void paint(Graphics2D g, int width, int height){
        g.setPaint(new GradientPaint(new Point(0,0), Color.BLACK, new Point(width, height), Color.GRAY));
        g.fillRect(0, 0, width, height);
    }
}
