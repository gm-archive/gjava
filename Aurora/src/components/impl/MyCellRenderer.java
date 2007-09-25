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
        
public class MyCellRenderer extends JLabel implements ListCellRenderer {
     public MyCellRenderer() {
         setOpaque(true);
     }

     public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {

         setText(value.toString());

         Color background;
         Color foreground;

         // check if this cell represents the current DnD drop location
         JList.DropLocation dropLocation = list.getDropLocation();
         if(isSelected){
             background = Color.BLUE;
             foreground = Color.WHITE;
         }
         else{
             background = Color.WHITE;
             foreground = Color.BLACK;
         }

         if(value instanceof events.Event)
            setIcon(((events.Event) value).getImage());
         setBackground(background);
         setForeground(foreground);

         return this;
     }
 }