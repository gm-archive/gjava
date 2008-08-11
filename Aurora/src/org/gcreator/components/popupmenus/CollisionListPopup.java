/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.popupmenus;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.gcreator.components.resource.*;
import org.gcreator.core.GPanel;
import org.gcreator.events.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author Luís
 */
public class CollisionListPopup extends JPopupMenu {
    private static final long serialVersionUID = 1;
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

    @SuppressWarnings("unchecked")
    public void done(GFile file) {
        Vector e = selector.ae.actor.events;
        boolean has = false;
        for(Object o : e){
            if(!(o instanceof Event)) {
                //This should NEVER happen
                return;
            }
            if(((Event) o) instanceof CollisionEvent) {
                if (GPanel.getMainProject().getFileFor(((CollisionEvent) o).other) == file) {
                    JOptionPane.showMessageDialog(null, "Found");
                    has = true;
                    break;
                }
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
