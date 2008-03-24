/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.components.popupmenus;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.gcreator.components.resource.*;
import org.gcreator.events.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author Luís
 */
public class CollisionListPopup extends JPopupMenu {

    private String key;
    private EventSelect selector;

    public CollisionListPopup(EventSelect selector, String key) {
        Project p = selector.ae.project;
        this.key = key;
        this.selector = selector;
        folderToPopup(p, p.getFolderFor(key));
    }

    public void folderToPopup(Project p, Folder f) {
        Vector v = f.getChildren();
        for (Object o : v) {
            GObject g = (GObject) o;
            if (p.validOfType(g, key)) {
                if (g instanceof GFile) {
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                    this.add(i);
                }

                if (g instanceof Folder) {
                    FolderMenuItem i = new FolderMenuItem();
                    i.setVisible(true);
                    i.file = (Folder) g;
                    folderToPopup(p, (Folder) g);
                    this.add(i);
                }
            }
        }
    }

    public void done(GFile file) {
        Vector e = ((Actor) selector.ae.file.value).events;
        boolean has = false;
        for(Object o : e){
            if(!(o instanceof Event)) //This should NEVER happen
                return;
            if(((Event) o) instanceof CollisionEvent)
                if(((CollisionEvent) o).other==file){
                    has = true;
                    break;
                }
        }
        if(!has){
            e.add(new CollisionEvent(file));
        }
        selector.ae.jList1.updateUI();
        selector.dispose();
        selector = null;
    }
}
