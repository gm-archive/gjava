/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.custom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.components.uiplus.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class MenuGenerator {
    private JPopupMenu std = null;
    private DiscMenu disc = null;
    
    public static final int TYPE_STD = 1;
    public static final int TYPE_DISC = 2;
    
    public static int type = TYPE_DISC;
    
    private int ltype;
    private Object parent;
    
    public MenuGenerator() {
        ltype = type;//Don't change your mind
        
        initMenu();
    }
    
    public static void addActionListener(Object o, ActionListener a){
        if(o instanceof JMenuItem) {
            ((JMenuItem) o).addActionListener(a);
        }
        if(o instanceof DiscMenuItem) {
            ((DiscMenuItem) o).addActionListener(a);
        }
    }
    
    private void initMenu(){
        if(ltype==TYPE_STD){
            parent = std = new JPopupMenu();
        }
        else{
            disc = new DiscMenu();
            parent = disc.curcontainer = new DiscMenuContainer(null, null);
        }
    }
    
    public Object addMenuItem(Object parent, int entry, ImageIcon img){
        return addMenuItem(parent, entry, img, true);
    }
    
    public Object addMenuItem(int entry, ImageIcon img){
        return addMenuItem(entry, img, true);
    }
    
    public Object addMenuItem(Object parent, int entry, ImageIcon img, boolean enabled){
        String lang = LangSupporter.activeLang.getEntry(entry);
        
        if(ltype==TYPE_STD){
            JMenuItem i = new JMenuItem(lang, img);
            i.setVisible(true);
            i.setEnabled(enabled);
            ((JMenu) parent).add(i);
            return i;
        }
        else{
            DiscMenuItem i = new DiscMenuItem(lang, img);
            i.setEnabled(enabled);
            ((DiscMenuContainer) parent).add(i);
            return i;
            //return null;
        }
    }
    
    public Object addMenuItem(int entry, ImageIcon img, boolean enabled){ //root
        String lang = LangSupporter.activeLang.getEntry(entry);
        
        if(ltype==TYPE_STD){
            JMenuItem i = new JMenuItem(lang, img);
            i.setVisible(true);
            i.setEnabled(enabled);
            ((JPopupMenu) parent).add(i);
            return i;
        }
        else{
            DiscMenuItem i = new DiscMenuItem(lang, img);
            i.setEnabled(enabled);
            ((DiscMenuContainer) parent).add(i);
            return i;
            //return null;
        }
    }
    
    public Object addSubMenu(Object parent, int entry, ImageIcon img){
        String lang = LangSupporter.activeLang.getEntry(entry);
        
        if(ltype==TYPE_STD){
            JMenu i = new JMenu(lang);
            i.setVisible(true);
            i.setIcon(img);
            ((JMenu) parent).add(i);
            return i;
        }
        else{
            DiscMenuItem i = new DiscMenuItem(lang, img);
            ((DiscMenuContainer) parent).add(i);
            return i;
            //return null;
        }
    }
    
    public Object addSubMenu(int entry, ImageIcon img){ //root
        String lang = LangSupporter.activeLang.getEntry(entry);
        
        if(ltype==TYPE_STD){
            JMenu i = new JMenu(lang);
            i.setVisible(true);
            i.setIcon(img);
            ((JMenu) parent).add(i);
            return i;
        }
        else{
            DiscMenuContainer i = new DiscMenuContainer(lang, img);
            ((DiscMenuContainer) parent).add(i);
            return i;
            //return null;
        }
    }
    
    public void setEnabled(Object o, boolean enabled){
        if(o instanceof DiscMenuItem){
            ((DiscMenuItem) o).setEnabled(enabled);
        }
        if(o instanceof JMenuItem){
            ((JMenuItem) o).setEnabled(enabled);
        }
    }
    
    public void show(Component invoker, int x, int y){
        Point p = invoker.getLocation();
        if(ltype == TYPE_STD) {
            std.show(invoker, x, y);
        }
        else{
            
            disc.setLocation(x+p.x-disc.getWidth()/2, y+p.y-disc.getHeight()/2);
            disc.setVisible(true);
        }
    }
}
