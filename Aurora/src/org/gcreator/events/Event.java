/*
 * Event.java
 * 
 * Created on 24/Set/2007, 19:58:46
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class Event implements Serializable {
    
    static final long serialVersionUID = 1L;
    
    
    public Vector<org.gcreator.actions.Action> actions;
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
}
