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

import core.*;

/**
 *
 * @author Luís
 */
public class PopupListener extends MouseAdapter{
    public JPopupMenu listened;
    public PopupListener(JPopupMenu listen){
        listened = listen;
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
        if(listened instanceof ConsolePopupMenu)
            if (e.isPopupTrigger())
                listened.show(aurora.window.console, e
                .getX(), e.getY());
        if(listened instanceof ToolbarPopupMenu)
            if (e.isPopupTrigger())
                listened.show(Aurwindow.tool, e
                .getX(), e.getY());
    }
}
