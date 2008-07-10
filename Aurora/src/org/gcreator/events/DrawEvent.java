/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.events;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class DrawEvent extends Event{
    static final long serialVersionUID = 1L;
    static ImageIcon icon;
    public DrawEvent(){
        PRIORITY = 1000;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/draw.png"));
    }
    
     
    public String toString(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/draw.png"));
        return "Draw";
    }
    
     
    public ImageIcon getImage(){
        return icon;
    }
}
