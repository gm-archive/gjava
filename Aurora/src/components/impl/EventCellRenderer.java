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
         JList.DropLocation dropLocation = list.getDropLocation();
         if(value instanceof events.Event)
         if(isSelected){
             background = ((events.Event) value).getSelectedBackground();
             foreground = ((events.Event) value).getSelectedForeground();
             icon = ((events.Event) value).getSelectedImage();
         }
         else{
             background = ((events.Event) value).getBackground();
             foreground = ((events.Event) value).getForeground();
             icon = ((events.Event) value).getImage();
         }

         setIcon(icon);
         setBackground(background);
         setForeground(foreground);

         return this;
     }
 }