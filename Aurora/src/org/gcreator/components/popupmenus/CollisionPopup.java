/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.gcreator.core.Aurwindow;
import org.gcreator.core.gcreator;
import org.gcreator.units.ObjectNode;

/**
 *
 * @author Ali
 */
public class CollisionPopup extends JPopupMenu implements ActionListener{
    JMenuItem[] items;
    JMenu res;
    EventSelect selector;
    public CollisionPopup(EventSelect selector){
        populate();
    }

    public void populate() {
        
        this.removeAll();
        //this.add(new JMenuItem("<none>"));
        Enumeration e = Aurwindow.getMainProject().node.children();
        
            e = Aurwindow.getMainProject().node.getChildAt(3).children();
        
        
        res = null;
        populatefromEnum(e);
    }

    private void populatefromEnum(Enumeration e) {
        while (e.hasMoreElements()) {
            Object object = e.nextElement();
            ObjectNode node = (ObjectNode) object;
            
            if (node.object instanceof org.gcreator.fileclass.Group) {
                JMenu resbackup = null;
                if (res != null) {
                    resbackup = res;
                }
                res = new JMenu(node.object.name);
                populatefromEnum(node.object.node.children());
                if (res == null) {
                    res = resbackup;
                }
                if (node.object.node.getChildCount() != 0 && res != null) {
                    this.add(res);
                }
                
                res = null;
            } else if (res == null) {
                this.add(new JMenuItem(node.object.name)).addActionListener(this);
            } else {
                //group
                res.add(new JMenuItem(node.object.name)).addActionListener(this);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(""+e.getActionCommand());
        
    }

    
}
