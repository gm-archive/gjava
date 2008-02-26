/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author luis
 */
public class ToolbarCellRenderer extends JLabel implements ListCellRenderer{
    public ToolbarCellRenderer(){
        setOpaque(true);
    }
    
    public Component getListCellRendererComponent(
            JList list, Object value, int position, boolean selected, boolean focus){
        if(value==null){
            return null;
        }
        if(value instanceof Toolbar){
            Toolbar toolbar = (Toolbar) value;
            if(selected)
                try{
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                }
                catch(Exception e){
                    setBackground(Color.BLUE);
                    setForeground(Color.WHITE);
                }
            else{
                /*try{
                    setForeground(list.getForeground());
                }
                catch(Exception e){*/
                    setForeground(Color.BLACK);
                    setForeground(Color.WHITE);
                //}
            }
            if(toolbar.name==null)
                setText("Untitled Toolbar");
            else
                setText(toolbar.name);
        }
        else{
            if(selected)
                setForeground(Color.PINK);
            else
                setForeground(Color.RED);
            setText("Invalid");
        }
        if(selected)
            try{
                setBackground(list.getSelectionBackground());
            }
            catch(Exception e){
                setBackground(Color.BLUE);
            }
        else
            /*try{
                setBackground(list.getBackground());
            }
            catch(Exception e){*/
                setBackground(Color.WHITE);
            //}
        return this;
    }
}
