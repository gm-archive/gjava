/*
 * MyCellRenderer.java
 * 
 * Created on 25/Set/2007, 11:34:53
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
         JList.DropLocation dropLocation = list.getDropLocation();
         
         if(value instanceof org.gcreator.actions.ActionPattern){
             icon = ((org.gcreator.actions.ActionPattern) value).getStandardImage();
             val = ((org.gcreator.actions.ActionPattern) value).getStandardText(null);
             if(isSelected){
                setBackground(((org.gcreator.actions.ActionPattern) value).getSelectedBackground());
                setForeground(((org.gcreator.actions.ActionPattern) value).getSelectedForeground());
             }
             else{
                setBackground(((org.gcreator.actions.ActionPattern) value).getBackground());
                setForeground(((org.gcreator.actions.ActionPattern) value).getForeground());
             }
         }
         setText(val);
         setIcon(icon);

         return this;
     }
 }