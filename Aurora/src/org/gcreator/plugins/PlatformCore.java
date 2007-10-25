/*
 * PlatformCore.java
 * 
 * Created on 07-Sep-2007, 19:34:25
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import java.io.IOException;
import java.util.zip.ZipOutputStream;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Sprite;

/**
 *
 * @author Ali1
 */
public class PlatformCore extends PluginCore {
    
    public static void putFolder(Folder folder) {
      org.gcreator.fileclass.Object childNode;


        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.File) {
                  
                    if (((org.gcreator.fileclass.File) childNode).type.equals("sprite"))
                        parseSprite((Sprite)((org.gcreator.fileclass.File) childNode).value);
                    
                    
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode);
                }
            }
        }
    }
    
    public static void parseSprite(Sprite s){
    System.out.println(""+s.name);
    }

    public static void parseActor(){}
    
    public static void parseScene(){}
    
    public static void parseClass(){}
    
    public void run(Project project)
    {
        if (project !=null)
        putFolder(project);
    }
}
