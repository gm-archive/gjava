/*
 * ConsolePopupMenu.java
 * 
 * Created on 5/Set/2007, 19:51:44
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import javax.swing.*;
import java.awt.event.*;

import managers.*;

/**
 *
 * @author Luís
 */
public class PopupMenuManager{
    private JPopupMenu popup;
    
    public PopupMenuManager(){
        popup = new JPopupMenu();
        
    }
    
    public JMenuItem addItem(int label, ActionListener listener){
        JMenuItem menuitem = new JMenuItem(LangSupporter.activeLang.getEntry(label));
        menuitem.addActionListener(listener);
        popup.add(menuitem);
        return menuitem;
    }
    
    class PopupListener extends MouseAdapter {
        JPopupMenu popup;

        PopupListener(JPopupMenu popupMenu) {
            popup = popupMenu;
        }

        public void mousePressed(MouseEvent e) {
            maybeShowPopup(e);
        }

        public void mouseReleased(MouseEvent e) {
            maybeShowPopup(e);
        }

        private void maybeShowPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popup.show(e.getComponent(),
                           e.getX(), e.getY());
            }
        }
    }
}