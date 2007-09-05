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

/**
 *
 * @author Luís
 */
public class ProjectExporter {
    public static boolean export(Project project, String filename){
        System.out.println(getConfigFile(project));
        return false; //Failed to export
    }
    public static String getConfigFile(Project project){
        String config = "<?xml version=\"1.0\"?>";
        config += "<project>";
        config += "<type>" + project.getType() + "</type>";
        config += "<content>";
        config += getContent("", project);
        config += "</content>";
        config += "</project>";
        return config;
    }
    
    public static String getContent(String prefix, Folder folder){
        String content = "<file>" + prefix + "/</file>";  //To make sure no empty folder is deleted.
        fileclass.Object childNode;
        for(int i = 0; i < folder.getChildArrayNum(); i++){
            if((childNode = folder.childAt(i))!=null){
                content += "<file>" + prefix + "/" + childNode.name;
                if(childNode instanceof fileclass.File){
                    content += "." + ((fileclass.File) childNode).type;
                }
                content += "</file>";
                if(childNode instanceof Folder)
                    content += getContent(prefix + "/" + childNode.name, (Folder) childNode);
            }
        }
        return content;
    }
}
