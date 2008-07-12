/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
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
public class CreateEvent extends Event{
    static final long serialVersionUID = 1L;
   static ImageIcon icon;
    public CreateEvent(){
        PRIORITY = 10000;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/create.png"));
    }
    
     
    public String toString(){
        return "Create";
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/create.png"));
        return icon;
    }
}
