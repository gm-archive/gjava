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
public class ExtendedToolButton extends JButton implements MouseListener{
    public void mouseExited(MouseEvent evt){
        gcreator.panel.statusbar.restoreText();
    }
    public void mouseEntered(MouseEvent evt){
        try{
            gcreator.panel.statusbar.setText(getToolTipText());
        }
        catch(NullPointerException e){}
    }
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    public ExtendedToolButton(){
        addMouseListener(this);
    }
    private boolean bold = false;
    public boolean isBold(){
        return bold;
    }
    public void setBold(boolean bold){
        this.bold = bold;
        updateUI();
    }
    public String getText(){
        return (bold ? "<HTML><B>" : "") + super.getText();
    }
}
