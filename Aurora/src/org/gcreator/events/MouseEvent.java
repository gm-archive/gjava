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
public class MouseEvent extends Event{
    static final long serialVersionUID = 1L;
    public int type;
    public static ImageIcon icon ;
    public MouseEvent(int type){
        PRIORITY = 4000;
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/mouse.png"));
    }
     
    public String toString(){
        switch(type){
            case 5006: return "Left Button Clicked";
            case 5007: return "Left Button Pressed";
            case 5008: return "Left Button Released";
            case 5009: return "Global Left Button Clicked";
            case 5010: return "Global Left Button Pressed";
            case 5011: return "Global Left Button Released";
            case 5012: return "Right Button Clicked";
            case 5013: return "Right Button Pressed";
            case 5014: return "Right Button Released";
            case 5015: return "Global Right Button Clicked";
            case 5016: return "Global Right Button Pressed";
            case 5017: return "Global Right Button Released";
            case 5018: return "Mouse Entered (Over)";
            case 5019: return "Mouse Exited (Out)";
            default: return "Invalid Mouse Event";
        }
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/mouse.png"));
        return icon;
    }
    
    public Event clone(){
        return new MouseEvent(type);
    }
}
