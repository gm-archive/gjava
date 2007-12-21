/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author luis
 */
public abstract class ToolbarItem {
    //These methods aren't part of the toolbar
    //These are just for organization in the toolbar editor
    /**
     * Paints something in a given graphic. Notice that Y is not a parameter
     * @param g The graphics
     * @param x The X position
     * @param height The Height of the toolbar
     */
    private ActionListener actionlistener = null;
    public abstract void paint(Graphics g, int x, int height);
    public abstract int getWidth();
    public abstract int getHeight();
    public ActionListener getActionListener(){
        return actionlistener;
    }
    public void setActionListener(ActionListener alisten){
        actionlistener = alisten;
    }
}
