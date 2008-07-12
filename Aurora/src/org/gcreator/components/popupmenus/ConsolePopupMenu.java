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
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class ConsolePopupMenu extends JPopupMenu{
    JMenuItem copymessage;
    JMenuItem clear;
    JMenuItem hide;
    public ConsolePopupMenu(){
        copymessage = new JMenuItem(LangSupporter.activeLang.getEntry(115));
        copymessage.setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/general/copy.png")));
        clear = new JMenuItem(LangSupporter.activeLang.getEntry(14));
        hide = new JMenuItem(LangSupporter.activeLang.getEntry(116));
        add(copymessage);
        copymessage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                copymessage();
            }
        });
        add(clear);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                clear();
            }
        });
        add(hide);
        hide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                _hide();
            }
        });
        this.updateUI();
    }
    
    private void copymessage(){
        String content = gcreator.panel.console.getText();
        content = content.replaceAll("\n", "");
        content = content.replaceAll("<(b[^r]|[^b]).*?/?>", "");
        content = content.replaceAll("\\s+", " ");
        content = content.replaceAll("^\\s", "");
        content = content.replaceAll("<br/?>", "\n");
        gcreator.clipboard.setClipboardContents(content);
    }
    
    private void clear(){
        gcreator.panel.console.setText("");
        gcreator.output = "";
    }
    
    private void _hide(){
        gcreator.panel.items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(false);
        gcreator.panel.items[MenuSupporter.GenerateMenuItemId(2, 0)].getActionListeners()[0].actionPerformed(null);
    }
}
