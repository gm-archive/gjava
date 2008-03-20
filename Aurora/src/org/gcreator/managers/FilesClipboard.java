/*
 * FilesClipboard.java
 * 
 * Created on 11/Out/2007, 10:26:44
 * 
 * Allows file copy-paste of files
 */

package org.gcreator.managers;

/**
 *
 * @author Luís
 */
public class FilesClipboard {
    private static org.gcreator.fileclass.GObject obj = null;
    
    public static void setClipboardObject(org.gcreator.fileclass.GObject object){
        obj = object;
    }
    
    public static org.gcreator.fileclass.GObject getCliboardObject(){
        return obj;
    }
    
    public static org.gcreator.fileclass.GObject copyObject(){
        return obj.clone();
    }
}
