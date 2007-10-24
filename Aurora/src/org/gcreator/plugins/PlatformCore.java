/*
 * PlatformCore.java
 * 
 * Created on 07-Sep-2007, 19:34:25
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Folder;

/**
 *
 * @author Ali1
 */
public class PlatformCore extends PluginCore {
    
    public static void putFolder(Folder folder, String prefix, ZipOutputStream out) throws java.io.IOException {
        org.gcreator.fileclass.Object childNode;


        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.File) {
                  
                    System.out.println(""+((org.gcreator.fileclass.File) childNode).type);
                    
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode, prefix + childNode.name + "/", out);
                }
            }
        }
    }
    
    public void parseSprites(){
    
    }

    public void parseActors(){}
    
    public void parseScenes(){}
    
    public void parseClasses(){}
}
