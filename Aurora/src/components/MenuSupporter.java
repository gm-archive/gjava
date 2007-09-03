/*
 * MenuSupporter.java
 * 
 * Created on 24/Ago/2007, 14:59:55
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Luís
 */
public class MenuSupporter {
    public static final int MENULIMIT = 30;
    public static final int ITEMLIMIT = 30;
    public static JMenu MakeMenu(JMenuBar menubar, String label, String description){
        JMenu menu = new JMenu(label);
        menu.getAccessibleContext().setAccessibleDescription(description);
        menubar.add(menu);
        return menu;
    }
    
    public static JMenu MakeSubMenu(JMenu menu, String label, String description){
        JMenu amenu = new JMenu(label);
        menu.getAccessibleContext().setAccessibleDescription(description);
        menu.add(amenu);
        return amenu;
    }
    
    public static JMenuItem MakeMenuItem(JMenu menu, String label, String description){
        JMenuItem item = new JMenuItem(label);
        item.getAccessibleContext().setAccessibleDescription(description);
        menu.add(item);
        return item;
    }
    
    public static JRadioButtonMenuItem MakeRadioMenuItem(ButtonGroup group, JMenu menu, String label, String description){
        JRadioButtonMenuItem item = new JRadioButtonMenuItem(label);
        item.getAccessibleContext().setAccessibleDescription(description);
        group.add(item);
        menu.add(item);
        return item;
    }
    
    public static JCheckBoxMenuItem MakeCheckMenuItem(JMenu menu, String label, String description){
        JCheckBoxMenuItem item = new JCheckBoxMenuItem(label);
        item.getAccessibleContext().setAccessibleDescription(description);
        menu.add(item);
        return item;
    }
    
    public static void MakeSeparator(JMenu menu){
        menu.addSeparator();
    }
    
    public static int GenerateMenuItemId(int menu, int menuitem){
        return (menu * ITEMLIMIT) + menuitem;
    }
}
