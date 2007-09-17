/*
 * FilesFinder.java
 * 
 * Created on 17/Set/2007, 10:43:29
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managers;

import fileclass.*;

/**
 *
 * @author Luís
 */
public class FilesFinder {
    public static int getFileCountAt(Folder folder, String format){
        if(folder==null||format==null)
            return 0;
        fileclass.Object o;
        int a = folder.getChildNum();
        for(int i = 0; i < folder.getChildNum(); i++){
            o = folder.childAt(i);
            if(o instanceof fileclass.File){
                fileclass.File f = (fileclass.File) o;
                if(!f.type.equals(format))
                    a--;
            }
            if(o instanceof fileclass.Folder){
                Folder f = (Folder) o;
                int g = f.getChildNum();
                g -= getFileCountAt(f, format);
                a -= g;
            }
        }
        return a;
    }
    
    protected static int pos;
    
    public static fileclass.File[] getFilesAt(Folder folder, String format){
        fileclass.File[] files = new fileclass.File[getFileCountAt(folder,format)];
        pos = 0;
        return _getFilesAt(files, folder, format);
    }
    
    private static fileclass.File[] _getFilesAt(fileclass.File[] files, Folder folder, String format){
        for(int i = 0; i < folder.getChildNum(); i++){
            fileclass.Object o = folder.childAt(i);
            if(o instanceof fileclass.File){
                fileclass.File f = (fileclass.File) o;
                if(f.type.equals(format)){
                    files[pos++] = f;
                }
            }
            if(o instanceof fileclass.Folder){
                Folder f = (Folder) o;
                files = _getFilesAt(files, f, format);
            }
        }
        return files;
    }
    
    public static boolean contains(Folder folder, String format){
        if(getFileCountAt(folder, format)>0)
            return true;
        return false;
    }
}
