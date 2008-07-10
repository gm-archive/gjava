/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import javax.swing.*;
import java.awt.*;
        
public class ActionListCellRenderer extends JLabel implements ListCellRenderer {
     public ActionListCellRenderer() {
         setOpaque(true);
     }

     public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {
         ImageIcon icon = null;
         String val = value.toString();

         // check if this cell represents the current DnD drop location
         //JList.DropLocation dropLocation = list.getDropLocation();
         
         if(value instanceof org.gcreator.actions.ActionPattern){
             icon = ((org.gcreator.actions.ActionPattern) value).getStandardImage();
             val = ((org.gcreator.actions.ActionPattern) value).getStandardText(null);
             if(isSelected){
                setBackground(((org.gcreator.actions.ActionPattern) value).getSelectedBackground(list));
                setForeground(((org.gcreator.actions.ActionPattern) value).getSelectedForeground(list));
             }
             else{
                setBackground(((org.gcreator.actions.ActionPattern) value).getBackground(list));
                setForeground(((org.gcreator.actions.ActionPattern) value).getForeground(list));
             }
         }
         else if(value instanceof org.gcreator.actions.ActionCategory){
             icon = ((org.gcreator.actions.ActionCategory) value).icon;
             val = ((org.gcreator.actions.ActionCategory) value).name;
             if(isSelected){
                setBackground(((org.gcreator.actions.ActionCategory) value).getSelectedBackground(list));
                setForeground(((org.gcreator.actions.ActionCategory) value).getSelectedForeground(list));
             }
             else{
                setBackground(((org.gcreator.actions.ActionCategory) value).background);
                setForeground(((org.gcreator.actions.ActionCategory) value).foreground);
             }
         }
         setText(val);
         setIcon(icon);

         return this;
     }
 }