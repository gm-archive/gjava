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
public class ToolButtonListCellRenderer extends JLabel implements ListCellRenderer{
    public ToolButtonListCellRenderer(){
        setOpaque(true);
    }
    
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean hasFocus){
        if(value instanceof ToolbarSeparator){
            setText("----------------- [Separator]");
            setIcon(null);
            setForeground(Color.GRAY);
        }
        else if(value instanceof ToolbarButton){
            ToolbarButton btn = (ToolbarButton) value;
            setText((btn.isBold() ? "<HTML><B>" : "") + btn.getText());
            setIcon(btn.getImage());
        }
        else{
            if(isSelected){
                setForeground(Color.RED);
                setBackground(Color.BLACK);
            }
            else{
                setForeground(Color.BLACK);
                setBackground(Color.RED);
            }
            setText("Invalid component");
            setIcon(null);
            return this;
        }
        if(isSelected){
            if(!(value instanceof ToolbarSeparator))
                setForeground(/*UIManager.getColor("List.selectionForeground")*/Color.WHITE);
            setBackground(/*UIManager.getColor("List.selectionBackground")*/Color.BLUE);
        }
        else{
            if(!(value instanceof ToolbarSeparator))
                setForeground(/*UIManager.getColor("List.foreground")*/Color.BLACK);
            setBackground(/*UIManager.getColor("List.background")*/Color.WHITE);
        }
        return this;
    }
}
