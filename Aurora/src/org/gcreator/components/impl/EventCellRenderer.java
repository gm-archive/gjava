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

import javax.swing.*;
import java.awt.*;
        
public class EventCellRenderer extends JLabel implements ListCellRenderer {
     public EventCellRenderer() {
         setOpaque(true);
     }

     public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {

         setText(value.toString());

         Color background = null;
         Color foreground = null;
         ImageIcon icon = null;

         // check if this cell represents the current DnD drop location
         //JList.DropLocation dropLocation = list.getDropLocation();
         if(isSelected&&value instanceof org.gcreator.events.Event){
             try{
                    background = list.getSelectionBackground();
                }
                catch(Exception e){
                    background = Color.BLUE;
                }
             try{
                    foreground = list.getSelectionForeground();
                }
                catch(Exception e){
                    foreground = Color.WHITE;
                }
             icon = ((org.gcreator.events.Event) value).getSelectedImage();
         }
         else{
             background = ((org.gcreator.events.Event) value).getBackground();
             foreground = ((org.gcreator.events.Event) value).getForeground();
             icon = ((org.gcreator.events.Event) value).getImage();
         }

         setIcon(icon);
         setBackground(background);
         setForeground(foreground);

         return this;
     }
 }