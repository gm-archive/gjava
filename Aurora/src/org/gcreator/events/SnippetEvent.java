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

/**
 *
 * @author Luís
 */
public class SnippetEvent extends Event{
    private Event childEvent = null;
    private boolean after = false;
    
    public SnippetEvent(Event e, boolean after){
        PRIORITY = e.PRIORITY + (after?1:0);
        childEvent = e;
        this.after = after;
    }
    
    @Override
    public ImageIcon getImage(){
        return childEvent.getImage();
    }
    
    @Override
    public String toString(){
        if(after)
            return "After " + childEvent.toString();
        return "Before " + childEvent.toString();
    }
}
