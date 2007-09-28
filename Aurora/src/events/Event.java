/*
 * Event.java
 * 
 * Created on 24/Set/2007, 19:58:46
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package events;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author Luís
 */
public class Event {
    public Vector<actions.Action> actions;
    public Event(){
        actions = new Vector<actions.Action>();
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
        String xml = "<event>\n";
        for(actions.Action action : actions)
            xml += action.writeXml();
        xml += "</event>\n";
        return xml;
    }
}
