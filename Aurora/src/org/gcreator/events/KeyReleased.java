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
public class KeyReleased extends KeyboardEvent {
static final long serialVersionUID = 1L;
public KeyReleased(int type,String name){
    this.name=name;
    text=" Released";
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_release.png"));
    }

public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_release.png"));
        return icon;
    }
}
