/*
 * PopupListener.java
 * 
 * Created on 12/Set/2007, 22:04:42
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import java.awt.event.*;
import javax.swing.*;

import org.gcreator.core.*;
import java.awt.*;
import org.gcreator.components.custom.MenuGenerator;

/**
 *
 * @author Luís
 */
public class PopupListener extends MouseAdapter {
    public JPopupMenu listened = null;
    public MenuGenerator gen = null;
    public JComponent component;
    public PopupListener(JComponent component, JPopupMenu listen){
        listened = listen;
        this.component = component;
    }
    
    public PopupListener(JComponent component, MenuGenerator listen){
        gen = listen;
        this.component = component;
    }
     
    public boolean update;
    
    @Override
    public void mousePressed(MouseEvent e) {
        
      maybeShowPopup(e);
      if(update) {
            component.updateUI();
        }
    }

     
    @Override
    public void mouseReleased(MouseEvent e) {
      maybeShowPopup(e);
      if(update) {
            component.updateUI();
        }
    }

    private void maybeShowPopup(MouseEvent e) {
        if(component.isShowing()) {
            Point p = component.getLocationOnScreen();
            if (e.isPopupTrigger()){
                if(listened!=null) {
                    listened.show(component, e.getX(), e.getY());
                }
                if(gen!=null) {
                    gen.show(component, e.getLocationOnScreen().x, e.getLocationOnScreen().y);
                }
            }
    }
    }
}
