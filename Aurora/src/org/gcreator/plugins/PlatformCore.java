/*
 * PlatformCore.java
 * 
 * Created on 07-Sep-2007, 19:34:25
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;

/**
 *
 * @author Ali1
 */
public class PlatformCore extends PluginCore {
    
    public void putFolder(Folder folder) {
      org.gcreator.fileclass.Object childNode;


        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.File) {
                  try {
                    if (((org.gcreator.fileclass.File) childNode).type.equals("sprite"))
                        parseSprite((Sprite)((org.gcreator.fileclass.File) childNode).value);
                    else if (((org.gcreator.fileclass.File) childNode).type.equals("scene"))
                        parseScene((Scene)((org.gcreator.fileclass.File) childNode).value);
                  } catch (Exception e) {}
                    
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode);
                }
            }
        }
    }
    
    public void parseSprite(Sprite s){
    System.out.println(""+s.name);
    }

    public void parseActor(Actor a) throws IOException{}
    
    public void parseScene(Scene s) throws IOException{}
    
    public void parseClass()throws IOException{}
    
    public void run(Project project)
    {
        if (project !=null)
        putFolder(project);
    }
    
    // Print a line to the bufferedwriter
	public static void print(BufferedWriter file,String printString) throws IOException
		{
		file.write(printString);
		file.newLine();
		}
        
        public static void openbrowser(String location)
		{
		if (System.getProperty("os.name").indexOf("Windows") == 0)
			{
			try
				{
				Runtime.getRuntime().exec("explorer.exe " + location);
				}
			catch (IOException e)
				{
				e.printStackTrace();
				}
			}
		else
			{
			// Unsupported OS for opening the browser
			}
		}
    
    public void copyDirectory(File srcDir, File dstDir) throws IOException {
        if (srcDir.isDirectory()) {
            if (!dstDir.exists()) {
                dstDir.mkdir();
            }
    
            String[] children = srcDir.list();
            for (int i=0; i<children.length; i++) {
                copyDirectory(new File(srcDir, children[i]),
                                     new File(dstDir, children[i]));
            }
        } else {
            copyFile(srcDir, dstDir);
        }
    }
    
    // Copies src file to dst file.
    // If the dst file does not exist, it is created
    void copyFile(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
    
        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }
}
