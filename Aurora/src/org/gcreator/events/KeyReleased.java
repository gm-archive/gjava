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
public class KeyReleased extends KeyboardEvent {
    static final long serialVersionUID = 1L;
    public KeyReleased(int type,String name){
    PRIORITY = 5000;
    this.name=name;
    text=" Released";
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_release.png"));
    }

    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_release.png"));
        return icon;
    }

    public Event clone(){
        return new KeyReleased(type, name);
    }
}
