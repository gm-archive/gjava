/*
 * Very useful class for plugins.
 * Multiple functions should come here.
 * Just a small help for plugins. They can get all these methods from other places.
 */

package org.gcreator.plugins;

import javax.swing.*;

import org.gcreator.fileclass.*;
import org.gcreator.core.*;
import managers.*;

/**
 *
 * @author Luís
 */
public class PluginHelper {
    public static Aurwindow getWindow(){
        return gcreator.window;
    }
    
    public static JTree getWorkspace(){
        return Aurwindow.workspace;
    }
    
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
    
    public static void addMenu(JMenu menu){
        gcreator.window.menubar.add(menu);
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
    }
    
    public static String encrypt(String str){
        return utilities.encrypt(str);
    }
    
    public static String decrypt(String str){
        return utilities.decrypt(str);
    }
}
