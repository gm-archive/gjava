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

/**
 *
 * @author Luís
 */
public class PopupListener extends MouseAdapter{
    public JPopupMenu listened;
    public JComponent component;
    public PopupListener(JComponent component, JPopupMenu listen){
        listened = listen;
        this.component = component;
    }
     
    public boolean update;
    
    public void mousePressed(MouseEvent e) {
        
      maybeShowPopup(e);
      if(update)
          component.updateUI();
    }

     
    public void mouseReleased(MouseEvent e) {
      maybeShowPopup(e);
      if(update)
          component.updateUI();
    }

    private void maybeShowPopup(MouseEvent e) {
        if(component.isShowing())
            if (e.isPopupTrigger())
                listened.show(component, e
                .getX(), e.getY());
    }
}
