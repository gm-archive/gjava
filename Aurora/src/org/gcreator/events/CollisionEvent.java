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
  String actor="";
  static final long serialVersionUID = 1L;
  
    public CollisionEvent(){
            }

    public CollisionEvent(String actionCommand) {
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        actor = actionCommand;
    }
    
     
    public String toString(){
        return actor;
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        return icon;
    }
}
