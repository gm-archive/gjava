/*
 * MyCellRenderer.java
 * 
 * Created on 25/Set/2007, 11:34:53
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.impl;

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
         
         if(value instanceof actions.ActionPattern){
             icon = ((actions.ActionPattern) value).getStandardImage();
             val = ((actions.ActionPattern) value).getStandardText(null);
             if(isSelected){
                setBackground(((actions.ActionPattern) value).getSelectedBackground());
                setForeground(((actions.ActionPattern) value).getSelectedForeground());
             }
             else{
                setBackground(((actions.ActionPattern) value).getBackground());
                setForeground(((actions.ActionPattern) value).getForeground());
             }
         }
         setText(val);
         setIcon(icon);

         return this;
     }
 }