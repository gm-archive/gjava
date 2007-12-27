/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.awt.*;
import javax.swing.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public class TimelineStepsCellRenderer extends JLabel implements ListCellRenderer{
    public TimelineStepsCellRenderer(){
        setOpaque(true);
    }
    
    public Component getListCellRendererComponent
            (JList list, Object value, int index, boolean selected, boolean focus){
        if(value==null){
            setText("");
        }
        else if(value instanceof TimelineStep){
            TimelineStep step = (TimelineStep) value;
            setText("Step " + step.stepnum);
        }
        else{
            setText("Invalid resource");
        }
        if(selected){
            setForeground(Color.WHITE);
            setBackground(Color.BLUE);
        }
        else{
            setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }
        return this;
    }
}
