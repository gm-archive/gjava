/*
 * MenuSupporter.java
 * 
 * Created on 24/Ago/2007, 14:59:55
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import javax.swing.*;
import java.awt.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class MenuSupporter {
    public static final int MENULIMIT = 30;
    public static final int ITEMLIMIT = 30;
    public static JMenu MakeMenu(JMenuBar menubar, int label, String description){
        JMenu menu = new JMenu(LangSupporter.activeLang.getEntry(label)){
            public void paint(Graphics g){
                super.paint(g);
                gcreator.window.paintGraph();
            }
            };
        menu.getAccessibleContext().setAccessibleDescription(description);
        menubar.add(menu);
        return menu;
    }
    
    public static JMenu MakeSubMenu(JMenu menu, int label, String description){
        JMenu amenu = new JMenu(LangSupporter.activeLang.getEntry(label)){
            public void paint(Graphics g){
                super.paint(g);
                gcreator.window.paintGraph();
            }
            };
        menu.getAccessibleContext().setAccessibleDescription(description);
        menu.add(amenu);
        return amenu;
    }
    
    public static JMenuItem MakeMenuItem(JMenu menu, int label, String description){
        JMenuItem item = new JMenuItem(LangSupporter.activeLang.getEntry(label)){
            public void paint(Graphics g){
                super.paint(g);
                gcreator.window.paintGraph();
            }
            };
        item.getAccessibleContext().setAccessibleDescription(description);
        menu.add(item);
        return item;
    }
    
    public static JRadioButtonMenuItem MakeRadioMenuItem(ButtonGroup group, JMenu menu, int label, String description){
        JRadioButtonMenuItem item = new JRadioButtonMenuItem(LangSupporter.activeLang.getEntry(label)){
            public void paint(Graphics g){
                super.paint(g);
                gcreator.window.paintGraph();
            }
            };
        item.getAccessibleContext().setAccessibleDescription(description);
        group.add(item);
        menu.add(item);
        return item;
    }
    
    public static JCheckBoxMenuItem MakeCheckMenuItem(JMenu menu, int label, String description){
        JCheckBoxMenuItem item = new JCheckBoxMenuItem(LangSupporter.activeLang.getEntry(label)){
            public void paint(Graphics g){
                super.paint(g);
                gcreator.window.paintGraph();
            }
            };
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
