/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.awt.event.*;
import javax.swing.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís Reis
 */
public class ExtendedMenuItem extends JMenuItem implements MouseListener{
    public static final String uiClassId = "MenuItemUI";
    
    public void mouseExited(MouseEvent evt){
        gcreator.panel.statusbar.restoreText();
    }
    public void mouseEntered(MouseEvent evt){
        gcreator.panel.statusbar.setText(getToolTipText());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    public ExtendedMenuItem(String text){
        super(text);
        addMouseListener(this);
    }
    public String getUIClassID(){
        return uiClassId;
    }
}
