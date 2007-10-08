/*
 * PopupListener.java
 * 
 * Created on 12/Set/2007, 22:04:42
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

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
    public Component component;
    public PopupListener(Component component, JPopupMenu listen){
        listened = listen;
        this.component = component;
    }
    @Override
    public void mousePressed(MouseEvent e) {
      maybeShowPopup(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        if(component.isShowing())
            if (e.isPopupTrigger())
                listened.show(component, e
                .getX(), e.getY());
    }
}
