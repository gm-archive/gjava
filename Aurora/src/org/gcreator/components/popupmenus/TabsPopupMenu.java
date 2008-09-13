package org.gcreator.components.popupmenus;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import org.gcreator.components.custom.MenuGenerator;

/**
 *
 * @author luis
 */
public class TabsPopupMenu extends MenuGenerator {

    public TabsPopupMenu(final JTabbedPane tabs) {
        if (tabs.getComponentCount() > 0) {
            TabsPopupMenu.addActionListener(
                    addTranslatableMenuItem("popup-tabs-close",
                    new ImageIcon(getClass().getResource("/org/gcreator/resources/close.png"))), new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    tabs.remove(tabs.getSelectedComponent());
                }
            });
            
            TabsPopupMenu.addActionListener(
                    addTranslatableMenuItem("popup-tabs-close-other",
                    new ImageIcon(getClass().getResource("/org/gcreator/resources/closeothertabs.png"))), new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    while (tabs.getTabCount() > 1) {
                        tabs.remove((tabs.getSelectedIndex() != 0) ? 0 : 1);
                    }
                }
            });
        }
    }
}
