/*
 * EventListModel.java
 * 
 * Created on 24/Set/2007, 19:55:46
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class EventListModel extends AbstractListModel{
    org.gcreator.fileclass.res.Actor val;
    public EventListModel(org.gcreator.fileclass.GFile file, Actor actor){
        val = actor;
    }
    public Object getElementAt(int pos){
        return val.events.get(pos);
    }
    public ImageIcon getImageAt(int pos){
        return ((Event)val.events.get(pos)).getImage();
    }
    public int getSize(){
        return val.events.size();
    }
    public void add(Event event){
        if (!contains(event))
        val.events.add(event);
        Collections.sort(val.events);
    }
    public boolean contains(Event e)
    {
        for (Enumeration en = getEvents().elements() ; en.hasMoreElements() ;)
        {
            Event ev = (Event)en.nextElement();
            if (ev.toString().equals(e.toString()))
                return true;
        }
        return false;
    }
    
    public void remove(Event event){
        val.events.remove(event);
    }
    public Vector getEvents(){
        Collections.sort(val.events);
        return val.events;
    }
}
