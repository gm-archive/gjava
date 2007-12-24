/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.*;

/**
 *
 * @author Luís Reis
 */
public class AlarmEvent extends Event{
    static final long serialVersionUID = 1L;
    public int number;
    public static ImageIcon icon;
    public AlarmEvent(int number){
        this.number = number;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/alarm.png"));
    }
    public String toString(){
        return "Alarm " + number;
    }
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/alarm.png"));
        return icon;
    }
}
