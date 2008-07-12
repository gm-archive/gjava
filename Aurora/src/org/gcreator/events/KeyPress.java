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

import javax.swing.ImageIcon;
import org.gcreator.components.impl.EventSelectListener;

/**
 *
 * @author TGMG
 */
public class KeyPress extends KeyboardEvent {
    static final long serialVersionUID = 1L;

    public KeyPress(int type,String name){
    PRIORITY = 6000;
    this.name=name;
        this.type = type;
        text=" Pressed";
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_press.png"));
    }

    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_press.png"));
        return icon;
    }

    public Event clone(){
        return new KeyPress(type, name);
    }
}
