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
import org.gcreator.events.*;
import org.gcreator.fileclass.res.Actor;

/**
 *
 * @author Luís
 */
public class EventListModel extends AbstractListModel{
    org.gcreator.fileclass.res.Actor val;
    public EventListModel(org.gcreator.fileclass.File file){
        val = (org.gcreator.fileclass.res.Actor) file.value;
    }
    public Object getElementAt(int pos){
        return val.events.get(pos);
    }
    public ImageIcon getImageAt(int pos){
        return val.events.get(pos).getImage();
    }
    public int getSize(){
        return val.events.size();
    }
    public void add(Event event){
        val.events.add(event);
    }
    public void remove(Event event){
        val.events.remove(event);
    }
}
