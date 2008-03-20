/*
 * FilesFinder.java
 * 
 * Created on 17/Set/2007, 10:43:29
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
public class FilesFinder {
    public static int getFileCountAt(Folder folder, String format){
        if(folder==null||format==null)
            return 0;
        org.gcreator.fileclass.GObject o;
        int a = folder.getChildNum();
        for(int i = 0; i < folder.getChildNum(); i++){
            o = folder.childAt(i);
            if(o instanceof org.gcreator.fileclass.GFile){
                org.gcreator.fileclass.GFile f = (org.gcreator.fileclass.GFile) o;
                if(!f.type.equals(format))
                    a--;
            }
            if(o instanceof org.gcreator.fileclass.Folder){
                Folder f = (Folder) o;
                int g = f.getChildNum();
                g -= getFileCountAt(f, format);
                a -= g;
            }
        }
        return a;
    }
    
    protected static int pos;
    
    public static org.gcreator.fileclass.GFile[] getFilesAt(Folder folder, String format){
        org.gcreator.fileclass.GFile[] files = new org.gcreator.fileclass.GFile[getFileCountAt(folder,format)];
        pos = 0;
        return _getFilesAt(files, folder, format);
    }
    
    private static org.gcreator.fileclass.GFile[] _getFilesAt(org.gcreator.fileclass.GFile[] files, Folder folder, String format){
        for(int i = 0; i < folder.getChildNum(); i++){
            org.gcreator.fileclass.GObject o = folder.childAt(i);
            if(o instanceof org.gcreator.fileclass.GFile){
                org.gcreator.fileclass.GFile f = (org.gcreator.fileclass.GFile) o;
                if(f.type.equals(format)){
                    files[pos++] = f;
                }
            }
            if(o instanceof org.gcreator.fileclass.Folder){
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
