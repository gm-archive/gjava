/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.popupmenus;

import java.util.*;
import javax.swing.*;
import org.gcreator.events.*;
import org.gcreator.fileclass.res.Actor;

/**
 *
 * @author Luís
 */
public class EventListModel extends AbstractListModel {
    private static final long serialVersionUID = 1;
    
    org.gcreator.fileclass.res.Actor val;
    public EventListModel(org.gcreator.fileclass.GFile file, Actor actor){
        val = actor;
    }
    @Override
    public Object getElementAt(int pos){
        try{
        return val.events.get(pos);
        }
        catch(Exception e){
            return null;
        }
    }
    public ImageIcon getImageAt(int pos){
        return ((Event)val.events.get(pos)).getImage();
    }
    @Override
    public int getSize(){
        return val.events.size();
    }
    @SuppressWarnings("unchecked")
    public void add(Event event){
        if (!contains(event)) {
            val.events.add(event);
        }
        Collections.sort(val.events);
    }
    public boolean contains(Event e)
    {
        for (Enumeration en = getEvents().elements() ; en.hasMoreElements() ;)
        {
            Event ev = (Event)en.nextElement();
            if (ev.toString().equals(e.toString())) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(Event event){
        val.events.remove(event);
    }
    @SuppressWarnings("unchecked")
    public Vector getEvents(){
        Collections.sort(val.events);
        return val.events;
    }
}
