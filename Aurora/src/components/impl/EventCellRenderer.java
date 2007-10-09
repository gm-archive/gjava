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
         if(value instanceof org.gcreator.events.Event)
         if(isSelected){
             background = ((org.gcreator.events.Event) value).getSelectedBackground();
             foreground = ((org.gcreator.events.Event) value).getSelectedForeground();
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