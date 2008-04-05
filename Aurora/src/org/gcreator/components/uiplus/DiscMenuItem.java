/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.uiplus;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class DiscMenuItem {
    public ImageIcon image = null;
    public String label = null;
    private Vector<ActionListener> action = new Vector<ActionListener>();
    private boolean enabled = true;
    
    public DiscMenuItem(String label, ImageIcon image){
        this.image = image;
        this.label = label;
    }
    
    public void addActionListener(ActionListener act){
        action.add(act);
    }
    
    protected void actionPerformed(ActionEvent evt){
        actionPerformed(evt, false);
    }
    
    protected void actionPerformed(ActionEvent evt, boolean back){
        for(ActionListener l : action)
            l.actionPerformed(evt);
    }
    
    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }
    
    public boolean isEnabled(){
        return enabled;
    }
}
