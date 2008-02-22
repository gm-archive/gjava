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
import java.net.URL;
import java.util.Vector;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicHTML;
import org.gcreator.editors.*;
        
public class ActionsCellRenderer extends JLabel implements ListCellRenderer {
     public ActionsCellRenderer() {
         setOpaque(true);
     }
     
     public int indent = 0;
     public Vector<org.gcreator.actions.Action> indented = new Vector<org.gcreator.actions.Action>();
     public Vector<org.gcreator.actions.Action> unindented = new Vector<org.gcreator.actions.Action>();
     public JList list;
     
     public Component getListCellRendererComponent(JList list,
                                                   Object value,
                                                   int index,
                                                   boolean isSelected,
                                                   boolean cellHasFocus) {
         this.list = list;
         ImageIcon icon = null;
         String val = value.toString();
         if(list.getModel().getElementAt(0)==value){
             //This is the first element
             indent = 0;
             indented.clear();
             unindented.clear();
         }

         // check if this cell represents the current DnD drop location
         //JList.DropLocation dropLocation = list.getDropLocation();
         
         if(value instanceof org.gcreator.actions.Action){
             org.gcreator.actions.Action act = (org.gcreator.actions.Action) value;
             icon = act.getImage();
             val = act.getLabel();
             if(val.indexOf("\n")!=-1)
                 val = val.substring(0, val.indexOf("\n")) + "\n...";
             if(isSelected){
                try{
                    setBackground(list.getSelectionBackground());
                }
                catch(Exception e){
                    setBackground(Color.BLUE);
                }
                try{
                    setForeground(list.getSelectionForeground());
                }
                catch(Exception e){
                    setForeground(Color.WHITE);
                }
             }
             else{
                setBackground(act.getBackground());
                setForeground(act.getForeground());
             }
             if(act.indents(indented, unindented, list, isSelected)){
                 indented.add(act);
                 indent++;
             }
             if(act.unindents(indented, unindented, list, isSelected)){
                 unindented.add(act);
                 indent--;
             }
         }
        
         if(indent<0)
             indent = 0;
         
         setText(val);
         setIcon(icon);
         setBorder(BorderFactory.createEmptyBorder(0, indent*30, 0, 0));
         
         if(value instanceof org.gcreator.actions.Action){
             org.gcreator.actions.Action act = (org.gcreator.actions.Action) value;
             if(act.indentsNext(indented, unindented, list, isSelected)){
                 indented.add(act);
                 indent++;
             }
             if(act.unindentsNext(indented, unindented, list, isSelected)){
                 unindented.add(act);
                 indent--;
             }
         }

         return this;
     }
 }