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

/**
 *
 * @author Luís
 */
public class PluginHelper {
    /**
     * Allows the plugin to fetch the main window
     * @return The main window
     */
    public static Aurwindow getWindow(){
        return gcreator.window;
    }
    
    /**
     * Allows the plugin to fetch the workspace tree
     * @return The workspace tree
     */
    public static JTree getWorkspace(){
        return Aurwindow.workspace;
    }
    
    /**
     * Prints an error message in G-Creator's console
     * @param message The message to be written
     */
    public static void println(String message){
            utilities.addStringMessage(message);
    }
    
    public static String getLanguageMessage(int num){
        return LangSupporter.activeLang.getEntry(num);
    }
    
    public static String getLanguageSpecialMessage(String value){
        return LangSupporter.activeLang.getSpecialEntry(value);
    }
    
    public static Project getCurrentProject(){
        return gcreator.window.getCurrentProject();
    }
    
    public static Folder getCurrentFolder(){ //Can be project
        return gcreator.window.getCurrentFolder();
    }
    
    public static org.gcreator.fileclass.Object getCurrentObject(){ //Can be project or folder
        return gcreator.window.getCurrentObject();
    }
    
    public static void addMenu(JMenu menu){
        gcreator.window.menubar.add(menu);
    }
    
    public static void addMenuItem(int menu, JMenuItem item){
        gcreator.window.menus[menu].add(item);
    }
    
    public static void addMenuSeparator(int menu){
        gcreator.window.menus[menu].addSeparator();
    }
    
    public static void addSubMenu(int menu, JMenu submenu){
        gcreator.window.menus[menu].add(submenu);
    }
    
    public static String getClipboardContent(){
        return gcreator.clipboard.getClipboardContents();
    }
    
    public static void setClipboardContent(String content){
        gcreator.clipboard.setClipboardContents(content);
    }
    
    public static void updateStyle(){
        SwingUtilities.updateComponentTreeUI(gcreator.window);
        if (gcreator.window.istabs) {
            SwingUtilities.updateComponentTreeUI(gcreator.window.mdi);
        } else {
            SwingUtilities.updateComponentTreeUI(Aurwindow.tabs);
        }
        SwingUtilities.updateComponentTreeUI(gcreator.window.consolepopup);
        SwingUtilities.updateComponentTreeUI(Aurwindow.newproject);
        SwingUtilities.updateComponentTreeUI(Aurwindow.newfilegroup);
        SwingUtilities.updateComponentTreeUI(Aurwindow.about);
        SwingUtilities.updateComponentTreeUI(Aurwindow.globalsettings);
    }
    
    public static String encrypt(String str){
        return utilities.encrypt(str);
    }
    
    public static String decrypt(String str){
        return utilities.decrypt(str);
    }
    
    public static Component addGlobalTab(String name, JComponent comp){
        return Aurwindow.globalsettings.jTabbedPane1.add(name, comp);
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
        Aurwindow.setMainProject(p);
    }
    public static Project getMainProject(){
        return Aurwindow.getMainProject();
    }
    public static void addToTree(Project p){
        ProjectTree.importFolderToTree(p, org.gcreator.core.gcreator.window.top);
    }
    
    public static URL getResource(String value){
        return PluginHelper.class.getResource(value);
    }
    
    public static ImageIcon getImageResource(String value){
        return new ImageIcon(getResource(value));
    }
    
    public static JInternalFrame createPaletteFrame(String title){
        JInternalFrame f = getWindow().createPaletteFrame();
        f.setTitle(title);
        return f;
    }
}
