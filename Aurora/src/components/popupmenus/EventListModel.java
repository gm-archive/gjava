/*
 * EventListModel.java
 * 
 * Created on 24/Set/2007, 19:55:46
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import java.util.*;
import javax.swing.*;
import events.*;

/**
 *
 * @author Luís
 */
public class EventListModel extends AbstractListModel{
    private Vector<Event> eventlist;
    public EventListModel(){
        eventlist = new Vector<Event>();
    }
    public Object getElementAt(int pos){
        return eventlist.get(pos);
    }
    public ImageIcon getImageAt(int pos){
        return eventlist.get(pos).getImage();
    }
    public int getSize(){
        return eventlist.size();
    }
    public void add(Event event){
        eventlist.add(event);
    }
    public void remove(Event event){
        eventlist.remove(event);
    }
}
