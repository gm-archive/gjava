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

import java.awt.*;
import javax.swing.*;
//import org.gcreator.macro.*;
        
/*public class MacroCellRenderer extends JLabel implements ListCellRenderer {
     public MacroCellRenderer() {
         setOpaque(true);
     }

     public static ImageIcon recording = new ImageIcon();
     
     public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {

         setText(value.toString());
         if(value instanceof Macro){
             setText(((Macro) value).getName());
         }

         Color background = null;
         Color foreground = null;

         // check if this cell represents the current DnD drop location
         //JList.DropLocation dropLocation = list.getDropLocation();
         if(value instanceof Macro)
         if(isSelected){
             try{
                 foreground = list.getSelectionForeground();
             }
             catch(Exception e){
                 foreground = Color.WHITE;
             }
             if(value==Macro.recordingMacro)
                 background = new Color(0, 200, 0);
             else
                 try{
                 background = list.getSelectionBackground();
                 }
                 catch(Exception e){
                     background = Color.BLUE;
                 }
         }
         else{
             foreground = Color.BLACK;
             if(value==Macro.recordingMacro)
                 background = Color.YELLOW;
             else
                 background = Color.WHITE;
         }
         
         setIcon(null);
         setBackground(background);
         setForeground(foreground);

         return this;
     }
 }*/