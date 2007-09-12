/*
 * Very useful class for plugins.
 * Multiple functions should come here.
 * Just a small help for plugins. They can get all these methods from other places.
 */

package plugins;

import javax.swing.*;

import fileclass.*;
import core.*;
import managers.*;

/**
 *
 * @author Luís
 */
public class PluginHelper {
    public static Aurwindow getWindow(){
        return aurora.window;
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
    
    public static Project getCurrentProject(){
        return aurora.window.getCurrentProject();
    }
    
    public static Folder getCurrentFolder(){ //Can be project
        return aurora.window.getCurrentFolder();
    }
    
    public static void addMenu(JMenu menu){
        aurora.window.menubar.add(menu);
    }
    
    public static String getClipboardContent(){
        return aurora.clipboard.getClipboardContents();
    }
    
    public static void setClipboardContent(String content){
        aurora.clipboard.setClipboardContents(content);
    }
}
