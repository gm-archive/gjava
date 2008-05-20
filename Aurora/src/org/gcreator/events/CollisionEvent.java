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

    public CollisionEvent() {
        PRIORITY = 800;
    }

    public CollisionEvent(GFile other) {
        PRIORITY = 800;
        icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        this.other = other;
    }

    public String toString() {
        return "Collision with " + other.name;
    }

    public ImageIcon getImage() {
        if (icon == null) {
            icon = new ImageIcon(getClass().getResource("/org/gcreator/resources/events/collision.png"));
        }
        return icon;
    }
}
