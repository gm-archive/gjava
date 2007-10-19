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
import org.gcreator.editors.*;
        
public class ActionsCellRenderer extends JLabel implements ListCellRenderer {
     public ActionsCellRenderer() {
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
         
         if(value instanceof actions.Action){
             icon = ((actions.Action) value).getImage();
             val = ((actions.Action) value).getLabel();
             if(val.indexOf("\n")!=-1)
                 val = val.substring(0, val.indexOf("\n")) + "\n...";
             if(isSelected){
                setBackground(((actions.Action) value).getSelectedBackground());
                setForeground(((actions.Action) value).getSelectedForeground());
             }
             else{
                setBackground(((actions.Action) value).getBackground());
                setForeground(((actions.Action) value).getForeground());
             }
         }
         setText(val);
         setIcon(icon);

         return this;
     }
 }