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
import java.awt.*;
import java.io.Serializable;
import java.net.URLClassLoader;
import java.util.*;

/**
 *
 * @author Luís
 */
public class Event implements Serializable, Comparable<Event>{
    
    static final long serialVersionUID = 1L;
    
    protected int PRIORITY = 0;
    public Vector<org.gcreator.actions.Action> actions;
    public EventCategory cat = null;
    public Event(){
        actions = new Vector<org.gcreator.actions.Action>();
    }
    public ImageIcon getImage(){
        return null;
    }
    public ImageIcon getSelectedImage(){
        return getImage();
    }
    public Color getSelectedBackground(){
        return Color.BLUE;
    }
    public Color getSelectedForeground(){
        return Color.WHITE;
    }
    public Color getBackground(){
        return Color.WHITE;
    }
    public Color getForeground(){
        return Color.BLACK;
    }
    public boolean allowsOther(){ //Collision
        return false;
    }
    public String writeXml(){
        String xml = "<event type=\""+getClass().getName()+"\">\n";
        for(org.gcreator.actions.Action action : actions)
            xml += action.writeXml();
        xml += "</event>\n";
        return xml;
    }
    public static Event getNewEventFromName(String name) throws Exception{
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class x = loader.loadClass(name);
        return (Event) x.newInstance();
    }
    public int readXml(String[] input, int initialpos){
        return initialpos;
    }
    
    public int compareTo(Event e){
        return e.PRIORITY - PRIORITY;
    }
    
    public Event clone(){
        try{
            return getClass().newInstance();
        }
        catch(Exception e){
            return null;
        }
    }
}
