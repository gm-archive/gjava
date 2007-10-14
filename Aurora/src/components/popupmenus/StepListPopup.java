/*
 * ConsolePopupMenu.java
 * 
 * Created on 12/Set/2007, 21:59:43
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import components.impl.EventSelectListener;
import javax.swing.*;
import java.awt.event.*;


import org.gcreator.core.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class StepListPopup extends JPopupMenu{
    JMenuItem begin, step, end;
    EventSelect selector;
    public StepListPopup(EventSelect selector){
        begin = new JMenuItem("Begin Step");
        step = new JMenuItem("Step");
        end = new JMenuItem("End Step");
        this.selector = selector;
        add(begin);
        begin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                beginstep();
            }
        });
        add(step);
        step.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                stdstep();
            }
        });
        add(end);
        end.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                endstep();
            }
        });
        this.updateUI();
    }
    
    private void beginstep(){
        selector.callEvent(EventSelectListener.BEGINSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void stdstep(){
        selector.callEvent(EventSelectListener.STEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
    
    private void endstep(){
        selector.callEvent(EventSelectListener.ENDSTEP);
        this.setVisible(false);
        selector.dispose();
        selector = null; //Maybe this will help with garbage collection
    }
}
