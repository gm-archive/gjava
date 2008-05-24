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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.gcreator.core.*;
import org.gcreator.components.*;

/**
 *
 * @author Luís
 */
public class MenuSupporter {
    public static final int MENULIMIT = 20;
    public static final int ITEMLIMIT = 20;
    public static JMenu MakeMenu(JMenuBar menubar, int label, String description){
        JMenu menu = new JMenu(LangSupporter.activeLang.getEntry(label));
        menu.getAccessibleContext().setAccessibleDescription(description);
        menu.setToolTipText(description);
        menubar.add(menu);
        return menu;
    }
    
    public static JMenu MakeSubMenu(JMenu menu, int label, String description){
        JMenu amenu = new ExtendedMenu(LangSupporter.activeLang.getEntry(label));
        menu.getAccessibleContext().setAccessibleDescription(description);
        menu.add(amenu);
        amenu.setToolTipText(description);
        return amenu;
    }
    
    public static JMenuItem MakeMenuItem(JMenu menu, int label, String description){
        JMenuItem item = new ExtendedMenuItem(LangSupporter.activeLang.getEntry(label));
        item.getAccessibleContext().setAccessibleDescription(description);
        item.setToolTipText(description);
        menu.add(item);
        return item;
    }
    
    public static JRadioButtonMenuItem MakeRadioMenuItem(ButtonGroup group, JMenu menu, int label, String description){
        JRadioButtonMenuItem item = new ExtendedRadioMenuItem(LangSupporter.activeLang.getEntry(label));
        item.getAccessibleContext().setAccessibleDescription(description);
        item.setToolTipText(description);
        group.add(item);
        menu.add(item);
        return item;
    }
    
    public static JCheckBoxMenuItem MakeCheckMenuItem(JMenu menu, int label, String description){
        JCheckBoxMenuItem item = new ExtendedCheckMenuItem(LangSupporter.activeLang.getEntry(label));
        item.getAccessibleContext().setAccessibleDescription(description);
        item.setToolTipText(description);
        menu.add(item);
        return item;
    }
    
    public static void MakeSeparator(JMenu menu){
        menu.addSeparator();
    }
    
    public static int GenerateMenuItemId(int menu, int menuitem){
        return (menu * ITEMLIMIT) + menuitem;
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="MakeDefaultMenus">
    public static void MakeDefaultMenus(GPanel panel){
        JMenu menus[] = panel.menus;
        JMenuItem items[] = panel.items;
        menus[0] = MenuSupporter.MakeMenu(panel.menubar, 0, "Very important functions such as 'Save', 'Open' and 'Exit' can be found here.");
        items[MenuSupporter.GenerateMenuItemId(0, 0)] = MenuSupporter.MakeMenuItem(menus[0], 5, "Create a new project");
        items[MenuSupporter.GenerateMenuItemId(0, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 0)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_new.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 1)] = MenuSupporter.MakeMenuItem(menus[0], 6, "Create a new file");
        items[MenuSupporter.GenerateMenuItemId(0, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 1)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/file_new.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)] = MenuSupporter.MakeMenuItem(menus[0], 7, "Open a project");
        items[MenuSupporter.GenerateMenuItemId(0, 2)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_open.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 3)] = MenuSupporter.MakeMenuItem(menus[0], 8, "Save project");
        items[MenuSupporter.GenerateMenuItemId(0, 3)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 3, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], 9, "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 4)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_saveas.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 4, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], 53, "Save all projects");
        items[MenuSupporter.GenerateMenuItemId(0, 5)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_saveall.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], 88, "Save file");
        items[MenuSupporter.GenerateMenuItemId(0, 6)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/file_save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], 89, "Save All files");
        items[MenuSupporter.GenerateMenuItemId(0, 7)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/file_saveall.png")));
        menus[9] = MenuSupporter.MakeSubMenu(menus[0], 10, "Import...");
        menus[9].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/import.png")));
        menus[10] = MenuSupporter.MakeSubMenu(menus[9], 185, "File");
        items[MenuSupporter.GenerateMenuItemId(10, 0)] = MenuSupporter.MakeMenuItem(menus[10], 189, "Import Image");
        items[MenuSupporter.GenerateMenuItemId(10, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(10, 0, evt);
                    }
                });
        menus[11] = MenuSupporter.MakeSubMenu(menus[9], 186, "Project");
        menus[12] = MenuSupporter.MakeSubMenu(menus[0], 11, "Export...");
        menus[12].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/export.png")));
        menus[13] = MenuSupporter.MakeSubMenu(menus[12], 185, "File");
        menus[14] = MenuSupporter.MakeSubMenu(menus[12], 186, "Project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/project_close.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 9)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 9, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 10)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 10)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/file_exit.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 10)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 10, evt);
                    }
                });
        /*menus[1] = MenuSupporter.MakeMenu(menubar, 1, "Undo/Redo and clipboard functions can be found here.");
        items[MenuSupporter.GenerateMenuItemId(1, 0)] = MenuSupporter.MakeMenuItem(menus[1], 76, "Find");
        items[MenuSupporter.GenerateMenuItemId(1, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/general/find.png")));
        items[MenuSupporter.GenerateMenuItemId(1, 0)].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        onItemActionPerformed(1, 0, evt);
        }
        });
        items[MenuSupporter.GenerateMenuItemId(1, 1)] = MenuSupporter.MakeMenuItem(menus[1], 83, "Find&Replace");
        items[MenuSupporter.GenerateMenuItemId(1, 1)].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        onItemActionPerformed(1, 1, evt);
        }
        });
        items[MenuSupporter.GenerateMenuItemId(1, 2)] = MenuSupporter.MakeMenuItem(menus[1], 14, "Clear console");
        items[MenuSupporter.GenerateMenuItemId(1, 2)].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        onItemActionPerformed(1, 2, evt);
        }
        });*/
        menus[2] = MenuSupporter.MakeMenu(panel.menubar, 2, "Layout and design options are defined here.");
        //menus[5] = MenuSupporter.MakeSubMenu(menus[2], 15, "Look&Feel");
        //menus[6] = MenuSupporter.MakeSubMenu(menus[2], 16, "Display mode");
        menus[15] = MenuSupporter.MakeSubMenu(menus[2], 193, "Display mode");
        items[MenuSupporter.GenerateMenuItemId(2, 0)] = MenuSupporter.MakeCheckMenuItem(menus[2], 22, "Display output box");
        items[MenuSupporter.GenerateMenuItemId(2, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(2, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(2, 1)] = MenuSupporter.MakeCheckMenuItem(menus[2], 75, "Display the toolbar");
        items[MenuSupporter.GenerateMenuItemId(2, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(2, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(2, 2)] = MenuSupporter.MakeMenuItem(menus[2], 270, "View Console Output");
        items[MenuSupporter.GenerateMenuItemId(2, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(2, 2, evt);
                    }
                });
        menus[3] = MenuSupporter.MakeMenu(panel.menubar, 3, "Compile and test your games.");
        items[MenuSupporter.GenerateMenuItemId(3, 0)] = MenuSupporter.MakeMenuItem(menus[3], 98, "Set as main project");
        items[MenuSupporter.GenerateMenuItemId(3, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(3, 0, evt);
                    }
                });
        MenuSupporter.MakeSeparator(menus[3]);
        /*items[MenuSupporter.GenerateMenuItemId(3, 1)] = MenuSupporter.MakeMenuItem(menus[3], 99, "Clean current project");
        items[MenuSupporter.GenerateMenuItemId(3, 2)] = MenuSupporter.MakeMenuItem(menus[3], 100, "Clean main project");
        MenuSupporter.MakeSeparator(menus[3]);
        //Settings can be found at the tools menu
        //Main project
        items[MenuSupporter.GenerateMenuItemId(3, 3)] = MenuSupporter.MakeMenuItem(menus[3], 101, "Build");
        items[MenuSupporter.GenerateMenuItemId(3, 4)] = MenuSupporter.MakeMenuItem(menus[3], 102, "Test");
        items[MenuSupporter.GenerateMenuItemId(3, 5)] = MenuSupporter.MakeMenuItem(menus[3], 103, "Build&Test");
        items[MenuSupporter.GenerateMenuItemId(3, 6)] = MenuSupporter.MakeMenuItem(menus[3], 104, "Final Build");
        MenuSupporter.MakeSeparator(menus[3]);
        //Main project
        items[MenuSupporter.GenerateMenuItemId(3, 7)] = MenuSupporter.MakeMenuItem(menus[3], 105, "Build");
        items[MenuSupporter.GenerateMenuItemId(3, 8)] = MenuSupporter.MakeMenuItem(menus[3], 106, "Test");
        items[MenuSupporter.GenerateMenuItemId(3, 9)] = MenuSupporter.MakeMenuItem(menus[3], 107, "Build&Test");
        items[MenuSupporter.GenerateMenuItemId(3, 10)] = MenuSupporter.MakeMenuItem(menus[3], 108, "Final Build");*/

        menus[7] = MenuSupporter.MakeMenu(panel.menubar, 114, "Tools");
        items[MenuSupporter.GenerateMenuItemId(7, 0)] = MenuSupporter.MakeMenuItem(menus[7], 23, "Select the language");
        items[MenuSupporter.GenerateMenuItemId(7, 0)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_language.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 1)] = MenuSupporter.MakeMenuItem(menus[7], 93, "Update");
        items[MenuSupporter.GenerateMenuItemId(7, 1)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_update.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 2)] = MenuSupporter.MakeMenuItem(menus[7], 109, "Extensions Manager");
        items[MenuSupporter.GenerateMenuItemId(7, 2)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_plug.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 2, evt);
                    }
                });
        menus[7].addSeparator();
        items[MenuSupporter.GenerateMenuItemId(7, 3)] = MenuSupporter.MakeMenuItem(menus[7], 130, "Global options");
        items[MenuSupporter.GenerateMenuItemId(7, 3)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_global.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 3, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 5)] = MenuSupporter.MakeMenuItem(menus[7], 267, "Welcome screen");
        items[MenuSupporter.GenerateMenuItemId(7, 5)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 5, evt);
                    }
                });
        menus[7].addSeparator();
        menus[8] = MenuSupporter.MakeSubMenu(menus[7], 171, "Macro");
        menus[8].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_macro.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 4)] = MenuSupporter.MakeMenuItem(menus[7], 183, "PowerPack");
        items[MenuSupporter.GenerateMenuItemId(7, 4)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_powerpack.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 4, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 0)] = MenuSupporter.MakeMenuItem(menus[8], 172, "Play macro");
        items[MenuSupporter.GenerateMenuItemId(8, 0)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_macro_play.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 1)] = MenuSupporter.MakeMenuItem(menus[8], 173, "Edit macro");
        items[MenuSupporter.GenerateMenuItemId(8, 1)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_macro_edit.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 2)] = MenuSupporter.MakeMenuItem(menus[8], 174, "Record new macro");
        items[MenuSupporter.GenerateMenuItemId(8, 2)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_macro_record.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 3)] = MenuSupporter.MakeMenuItem(menus[8], 182, "Stop recording macro");
        items[MenuSupporter.GenerateMenuItemId(8, 3)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/tools_macro_stop.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 3, evt);
                    }
                });
        menus[4] = MenuSupporter.MakeMenu(panel.menubar, 4, "Get info about Aurora.");
        items[MenuSupporter.GenerateMenuItemId(4, 0)] = MenuSupporter.MakeMenuItem(menus[4], 24, "About Aurora");
        items[MenuSupporter.GenerateMenuItemId(4, 0)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/help_about.png")));
        items[MenuSupporter.GenerateMenuItemId(4, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(4, 1)] = MenuSupporter.MakeMenuItem(menus[4], 25, "Aurora help");
        items[MenuSupporter.GenerateMenuItemId(4, 1)].setIcon(new ImageIcon(MenuSupporter.class.getResource("/org/gcreator/resources/menu/help_help.png")));
        items[MenuSupporter.GenerateMenuItemId(4, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 1, evt);
                    }
                });
        /*items[MenuSupporter.GenerateMenuItemId(5, 4)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 1, "GTK");
        items[MenuSupporter.GenerateMenuItemId(5, 4)].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        onItemActionPerformed(5, 4, evt);
        }
        });*/
        /*ButtonGroup agroup = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(6, 0)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 20, "Tabs Top");
        items[MenuSupporter.GenerateMenuItemId(6, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(6, 1)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 90, "Tabs Left");
        items[MenuSupporter.GenerateMenuItemId(6, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 2)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 91, "Tabs Bottom");
        items[MenuSupporter.GenerateMenuItemId(6, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 3)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 92, "Tabs Right");
        items[MenuSupporter.GenerateMenuItemId(6, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 3, evt);
                    }
                });
        MenuSupporter.MakeSeparator(menus[6]);
        items[MenuSupporter.GenerateMenuItemId(6, 4)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 21, "MDI");
        items[MenuSupporter.GenerateMenuItemId(6, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 4, evt);
                    }
                });*/
        panel.wtreepos = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(15, 0)] = MenuSupporter.MakeRadioMenuItem(panel.wtreepos, menus[15], 194, "Tree Left");
        items[MenuSupporter.GenerateMenuItemId(15, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(15, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(15, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(15, 1)] = MenuSupporter.MakeRadioMenuItem(panel.wtreepos, menus[15], 195, "Tree Right");
        items[MenuSupporter.GenerateMenuItemId(15, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(15, 1, evt);
                    }
                });
    }
    
    public static void onItemActionPerformed(int a, int b, ActionEvent evt){
        gcreator.panel.onItemActionPerformed(a, b, evt);
    }
    //</editor-fold>
}
