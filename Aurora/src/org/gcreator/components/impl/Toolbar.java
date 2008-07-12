/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import java.util.*;
import javax.swing.*;
import org.gcreator.components.*;
import org.gcreator.components.popupmenus.PopupListener;
import org.gcreator.core.*;

/**
 *
 * @author luis
 */
public class Toolbar {
    public Toolbar(){}
    public Vector<ToolbarItem> items = new Vector<ToolbarItem>();
    public boolean horizontal = true;
    public boolean first = true;
    public boolean rollover = true;
    public boolean floatable = true;
    public String name = null;
    public Vector<JToolBar> toolbars = new Vector<JToolBar>();
    
    public void hideAll(){
        Enumeration<JToolBar> e = toolbars.elements();
        while(e.hasMoreElements()){
            JToolBar t = e.nextElement();
            t.setVisible(false);
                        
            //Hide any possible toolbar window.
            ((javax.swing.plaf.basic.BasicToolBarUI)t.getUI()).setFloating(false,null);
            t.updateUI();
        }
    }
    
    public void showAll(){
        Enumeration<JToolBar> e = toolbars.elements();
        while(e.hasMoreElements()){
            JToolBar t = e.nextElement();
            t.setVisible(true);
        }
    }
    
    public void make(GPanel panel){
        JToolBar toolbar = new JToolBar();
        toolbars.add(toolbar);
        if(name!=null){
            toolbar.setToolTipText(name);
            toolbar.setName(name);
        }
        for(ToolbarItem item : items){
            if(item instanceof ToolbarSeparator)
                toolbar.addSeparator();
            else{
                ToolbarButton btn = (ToolbarButton) item;
                ExtendedToolButton button = new ExtendedToolButton();
                if(btn.isTextVisible())
                    button.setText(btn.getText());
                button.setToolTipText(btn.getText());
                if(btn.isImageVisible())
                    button.setIcon(btn.getImage());
                if(btn.isBold())
                    button.setBold(true);
                button.addActionListener(btn.getActionListener());
                toolbar.add(button);
            }
        }
        toolbar.setFloatable(floatable);
        toolbar.setRollover(rollover);
        if(horizontal){
            toolbar.setOrientation(JToolBar.HORIZONTAL);
            if(first)
                panel.topContainer.add(toolbar);
            else
                panel.bottomContainer.add(toolbar);
        }
        else{
            toolbar.setOrientation(JToolBar.VERTICAL);
            if(first)
                panel.leftContainer.add(toolbar);
            else
                panel.rightContainer.add(toolbar);
        }
        toolbar.addMouseListener(new PopupListener(toolbar, panel.toolpopup));
    }
}
