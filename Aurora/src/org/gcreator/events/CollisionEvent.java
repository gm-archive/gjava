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
import org.gcreator.fileclass.GFile;

/**
 *
 * @author Ali
 */
public class CollisionEvent extends Event {

    static ImageIcon icon;
    public GFile other;
    static final long serialVersionUID = 1L;

    public CollisionEvent() {
        PRIORITY = 8000;
    }

    public CollisionEvent(GFile other) {
        PRIORITY = 8000;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        this.other = other;
    }

    public String toString() {
        return "Collision with " + other.name;
    }

    public ImageIcon getImage() {
        if (icon == null) {
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        }
        return icon;
    }
    
    public Event clone(){
        return new CollisionEvent(other);
    }
}
