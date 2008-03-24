/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;
import org.gcreator.fileclass.GFile;

/**
 *
 * @author Ali
 */
public class CollisionEvent extends Event {
  static ImageIcon icon;
  public GFile other;
  static final long serialVersionUID = 1L;
  
    public CollisionEvent(){
            }

    public CollisionEvent(GFile other) {
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        this.other = other;
    }
    
     
    public String toString(){
        return "Collision with " + other.name;
    }
    
     
    public ImageIcon getImage(){
        if (icon==null)
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        return icon;
    }
}
