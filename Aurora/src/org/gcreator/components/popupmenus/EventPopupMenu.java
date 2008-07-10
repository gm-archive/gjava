/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.popupmenus;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import org.gcreator.components.custom.MenuGenerator;
import org.gcreator.editors.*;

/**
 *
 * @author luis
 */
public class EventPopupMenu extends MenuGenerator {
    private static final long serialVersionUID = 1;
    private Vector array;
    private ActorEditor edit;
    
    private Object delete;
    
    public EventPopupMenu(ActorEditor edit){
        this.array = edit.elist.getEvents();
        this.edit = edit;
        delete = addMenuItem(255, new ImageIcon(getClass().getResource("/org/gcreator/resources/general/delete.png")));
        addActionListener(delete, new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onDelete();
            }
        });
    }
    
    public void onDelete(){
        int x = edit.jList1.getSelectedIndex();
        try{
            array.remove(x);
        }
        catch(Exception e){}
        if (edit.jList1.getSelectedIndex() >= edit.actor.events.size()) {
            edit.jList1.setSelectedIndex(edit.actor.events.size() - 1);
        }
        edit.updateUI();
        edit.updateActionList();
    }
}
