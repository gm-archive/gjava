/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;
import org.gcreator.components.impl.EventSelectListener;

/**
 *
 * @author TGMG
 */
public class KeyPress extends KeyboardEvent {
    static final long serialVersionUID = 1L;

    public KeyPress(int type,String name){
    PRIORITY = 600;
    this.name=name;
        this.type = type;
        text=" Pressed";
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_press.png"));
    }

    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_press.png"));
        return icon;
    }

    public Event clone(){
        return new KeyPress(type, name);
    }
}
