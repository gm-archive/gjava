/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;

/**
 *
 * @author Ali
 */
public class CollisionEvent extends Event {
  static ImageIcon icon;
    public CollisionEvent(){
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
    }
    
     
    public String toString(){
        return "Collision";
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        return icon;
    }
}
