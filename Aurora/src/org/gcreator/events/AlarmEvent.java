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
 * @author Luís Reis
 */
public class AlarmEvent extends Event{
    static final long serialVersionUID = 1L;
    public int number;
    public static ImageIcon icon;
    public AlarmEvent(int number){
        PRIORITY = (912 - number) * 10;
        this.number = number;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/alarm.png"));
    }
    public String toString(){
        return "Alarm " + number;
    }
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/alarm.png"));
        return icon;
    }
    
    public Event clone(){
        return new AlarmEvent(number);
    }
}
