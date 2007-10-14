/*
 * ToolbarPopupMenu.java
 * 
 * Created on 13/Set/2007, 12:58:19
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import javax.swing.*;
import java.awt.event.*;

import org.gcreator.core.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class ToolbarPopupMenu extends JPopupMenu{
    JMenuItem hide;
    public ToolbarPopupMenu(){
        hide = new JMenuItem(LangSupporter.activeLang.getEntry(117));
        add(hide);
        hide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                _hide();
            }
        });
        this.updateUI();
    }
    private void _hide(){
        gcreator.window.items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(false);
        gcreator.window.items[MenuSupporter.GenerateMenuItemId(2, 1)].getActionListeners()[0].actionPerformed(null);
    }
}
