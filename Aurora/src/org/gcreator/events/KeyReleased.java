/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;

/**
 *
 * @author TGMG
 */
public class KeyReleased extends KeyboardEvent {
static final long serialVersionUID = 1L;
public KeyReleased(int type){
        this.type = type;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/key_release.png"));
    }
}
