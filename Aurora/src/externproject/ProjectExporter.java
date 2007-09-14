/*
 * ProjectImporter.java
 * 
 * Created on 5/Set/2007, 13:24:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package externproject;

import core.*;
import fileclass.*;

import javax.swing.*;
import components.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

/**
 *
 * @author Luís
 */
public class ProjectExporter {
    public static boolean export(Project project, String filename){
      
        String config = getConfigFile(project);
        byte[] buffer = new byte[18024];
        try{
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(filename));
            out.setLevel(Deflater.BEST_SPEED);
            out.putNextEntry(new ZipEntry("src/"));
            out.closeEntry();
            out.putNextEntry(new ZipEntry("config"));
            for(int i = 0; i < config.length(); i++)
                out.write(config.charAt(i));
            out.closeEntry();
            putFolder(project, "", out, 1);
            out.close();
            utilities.addStringMessage("Saved");
        }
        catch(Exception e){
            return false;
        }
        return false; //Failed to export
    }
    public static void putFolder(Folder folder, String prefix, ZipOutputStream out, int b) throws java.io.IOException{
        int a = b;
        fileclass.Object childNode;
        for(int i = 0; i < folder.getChildArrayNum(); i++){
            if((childNode = folder.childAt(i))!=null){
                if(childNode instanceof fileclass.File){
                    out.putNextEntry(new ZipEntry("_" + a));
                    ((fileclass.File) childNode).writeToBuffer(out);
                    out.closeEntry();
                    a++;
                }
                else if(childNode instanceof fileclass.Folder){
                    putFolder((Folder) childNode, prefix + childNode.name + "/", out, a);
                }
            }
        }
    }
    
    public static String getConfigFile(Project project){
        String config = "<?xml version=\"1.0\"?>\n";
        config += "<project>";
        config += "<type>" + project.getType() + "</type>";
        config += "<content>";
        config += getContent("", project);
        config += "</content>";
        config += "</project>";
        return config;
    }
    
    public static String getContent(String prefix, Folder folder){
        String content = "";
        fileclass.Object childNode;
        for(int i = 0; i < folder.getChildArrayNum(); i++){
            if((childNode = folder.childAt(i))!=null){
                content += "<file type=\"" + childNode.getObjectType() + "\">" + prefix + childNode.name;
                if(childNode instanceof fileclass.File){
                    content += "." + ((fileclass.File) childNode).type;
                }
                content += "</file>";
                if(childNode instanceof Folder)
                    content += getContent(prefix + childNode.name + "/", (Folder) childNode);
            }
        }
        return content;
    }
}
