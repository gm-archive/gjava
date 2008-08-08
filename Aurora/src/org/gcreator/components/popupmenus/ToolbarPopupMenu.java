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

import javax.swing.*;
import java.awt.event.*;

import org.gcreator.core.*;
import org.gcreator.managers.MenuSupporter;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class ToolbarPopupMenu extends JPopupMenu{
    JMenuItem hide;
    public ToolbarPopupMenu(){
        hide = new JMenuItem(Dictionary.getEntry("toolbar-menu-hide"));
        add(hide);
        hide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                _hide();
            }
        });
        this.updateUI();
    }
    private void _hide(){
        gcreator.panel.items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(false);
        gcreator.panel.items[MenuSupporter.GenerateMenuItemId(2, 1)].getActionListeners()[0].actionPerformed(null);
    }
}
