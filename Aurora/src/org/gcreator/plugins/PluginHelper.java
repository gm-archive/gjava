/*
 * Very useful class for plugins.
 * Multiple functions should come here.
 * Just a small help for plugins. They can get all these methods from other places.
 */

package org.gcreator.plugins;

import java.awt.Component;
import java.net.URL;
import javax.swing.*;

import org.gcreator.actions.*;
import org.gcreator.fileclass.*;
import org.gcreator.core.*;
import org.gcreator.editors.*;
import org.gcreator.managers.*;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public class PluginHelper {
    /**
     * Allows the plugin to fetch the main window
     * @deprecated
     * @return The main window
     */
    public static Aurwindow getWindow(){
        return gcreator.window;
    }
    
    /**
     * Allows the plugin to fetch the main panel
     * @return The main panel
     */
    public static GPanel getPanel(){
        return gcreator.panel;
    }
    
    /**
     * Allows the plugin to fetch the workspace tree
     * @return The workspace tree
     */
    public static JTree getWorkspace(){
        return gcreator.panel.workspace;
    }
    
    /**
     * Prints an error message in G-Creator's console
     * @param message The message to be written
     */
    public static void println(String message){
            utilities.addStringMessage(message);
    }
    
    public static String getLanguageMessage(String entry){
        return Dictionary.getEntry(entry);
    }
    
    /**
     * @deprecated Use getLanguageMessage instead.
     */
    public static String getLanguageSpecialMessage(String value){
        return getLanguageMessage(value);
    }
    
    public static Project getCurrentProject(){
        return gcreator.panel.getCurrentProject();
    }
    
    public static Folder getCurrentFolder(){ //Can be project
        return gcreator.panel.getCurrentFolder();
    }
    
    public static org.gcreator.fileclass.GObject getCurrentObject(){ //Can be project or folder
        return gcreator.panel.getCurrentObject();
    }
    
    public static void addMenu(JMenu menu){
        gcreator.panel.menubar.add(menu);
    }
    
    public static void removeMenu(JMenu menu){
        gcreator.panel.menubar.remove(menu);
    }
    
    public static void addMenuItem(int menu, JMenuItem item){
        gcreator.panel.menus[menu].add(item);
    }
    
    public static void removeMenuItem(int menu, JMenuItem item){
        gcreator.panel.menus[menu].remove(item);
    }
    
    public static void addMenuSeparator(int menu){
        gcreator.panel.menus[menu].addSeparator();
    }
    
    public static void addSubMenu(int menu, JMenu submenu){
        gcreator.panel.menus[menu].add(submenu);
    }
    
    public static String getClipboardContent(){
        return gcreator.clipboard.getClipboardContents();
    }
    
    public static void setClipboardContent(String content){
        gcreator.clipboard.setClipboardContents(content);
    }
    
    public static void updateStyle(){
        SwingUtilities.updateComponentTreeUI(gcreator.window);
        if (gcreator.panel.istabs) {
            SwingUtilities.updateComponentTreeUI(gcreator.panel.mdi);
        } else {
            SwingUtilities.updateComponentTreeUI(gcreator.panel.tabs);
        }
        SwingUtilities.updateComponentTreeUI(gcreator.panel.consolepopup);
        SwingUtilities.updateComponentTreeUI(gcreator.panel.newproject);
        SwingUtilities.updateComponentTreeUI(gcreator.panel.newfilegroup);
        SwingUtilities.updateComponentTreeUI(gcreator.panel.about);
        SwingUtilities.updateComponentTreeUI(gcreator.panel.globalsettings);
    }
    
    public static String encrypt(String str){
        return utilities.encrypt(str);
    }
    
    public static String decrypt(String str){
        return utilities.decrypt(str);
    }
    
    public static Component addGlobalTab(String name, JComponent comp){
        return gcreator.panel.globalsettings.jTabbedPane1.add(name, comp);
    }
    
    public static void addNewActionPattern(ActionPattern pattern){
        ActionContainer.actionCats.get(0).add(pattern);
    }
    
    public static void addNewActionPattern(ActionCategory category, ActionPattern pattern){
        category.add(pattern);
    }
    
    public static void addNewActionCategory(ActionCategory category){
        ActionContainer.actionCats.add(category);
    }
    public static void setMainProject(Project p){
        GPanel.setMainProject(p);
    }
    public static Project getMainProject(){
        return GPanel.getMainProject();
    }
    public static void addToTree(Project p){
        ProjectTree.importFolderToTree(p, org.gcreator.core.gcreator.panel.top);
    }
    
    public static URL getResource(String value){
        return PluginHelper.class.getResource(value);
    }
    
    public static ImageIcon getImageResource(String value){
        return new ImageIcon(getResource(value));
    }
    
    public static JInternalFrame createPaletteFrame(String title){
        JInternalFrame f = gcreator.panel.createPaletteFrame();
        f.setTitle(title);
        return f;
    }
}
