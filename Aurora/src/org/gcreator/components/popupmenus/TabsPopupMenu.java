/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.components.popupmenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import org.gcreator.components.custom.*;

/**
 *
 * @author luis
 */
public class TabsPopupMenu extends MenuGenerator {

    public TabsPopupMenu(final JTabbedPane tabs) {
        if (tabs.getComponentCount() > 0) {
            addActionListener(
                    addMenuItem(288,
                    new ImageIcon(getClass().getResource("/org/gcreator/resources/close.png"))), new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    tabs.remove(tabs.getSelectedComponent());
                }
            });
        }
    }
}
