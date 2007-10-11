/*
 * FilesClipboard.java
 * 
 * Created on 11/Out/2007, 10:26:44
 * 
 * Allows file copy-paste of files
 */

package managers;

/**
 *
 * @author Luís
 */
public class FilesClipboard {
    private static org.gcreator.fileclass.Object obj = null;
    
    public static void setClipboardObject(org.gcreator.fileclass.Object object){
        obj = object;
    }
    
    public static org.gcreator.fileclass.Object getCliboardObject(){
        return obj;
    }
    
    public static org.gcreator.fileclass.Object copyObject(){
        return obj.clone();
    }
}
