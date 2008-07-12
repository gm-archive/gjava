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
public class BeginStepEvent extends Event{
    static final long serialVersionUID = 1L;
   static ImageIcon icon;
    public BeginStepEvent(){
        PRIORITY = 8510;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/step.png"));
    }
    
     
    public String toString(){
        return "Begin Step";
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/step.png"));
        return icon;
    }
}
