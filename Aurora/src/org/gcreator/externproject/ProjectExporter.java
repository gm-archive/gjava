/*
 * ProjectImporter.java
 *
 * Created on 5/Set/2007, 13:24:52
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.externproject;

import org.gcreator.core.*;
import org.gcreator.fileclass.*;
import javax.swing.*;
import org.gcreator.components.*;
import java.awt.*;
import java.io.*;
import java.util.zip.ZipOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

/**
 *
 * @author Luís
 */
public class ProjectExporter {

    public static boolean export(Project project, String filename) {

        String config = getConfigFile(project);
        //byte[] buffer = new byte[18024];
        ZipOutputStream out = null;
        try {
            out = new ZipOutputStream(new FileOutputStream(filename));
        } catch (Exception e) {
            System.out.println("ProjectExport: " + e.getLocalizedMessage());
            return false;
        }
        out.setLevel(Deflater.BEST_COMPRESSION);
        //out.putNextEntry(new ZipEntry(""));
        //out.closeEntry();

        try{
        out.putNextEntry(new ZipEntry("config"));
        for (int i = 0; i < config.length(); i++) {
            out.write(config.charAt(i));
        }
        out.closeEntry();
        }
        catch(Exception e){
            System.out.println("ProjectExport: " + e.getLocalizedMessage());
        }
        a = 1;
        putFolder(project, "", out);
        try{
            out.close();
        }
        catch(Exception e){
            System.out.println("ProjectExport: " + e.getLocalizedMessage());
        }
        utilities.addStringMessage("Saved");
        return false; //Failed to export
    }

    private static int a;
    
    public static void putFolder(Folder folder, String prefix, ZipOutputStream out){
        org.gcreator.fileclass.Object childNode;


        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                if (childNode instanceof org.gcreator.fileclass.File) {
                    try{
                        out.putNextEntry(new ZipEntry("src/_" + (a++) + "."+((org.gcreator.fileclass.File)childNode).type));
                        ((org.gcreator.fileclass.File) childNode).writeToBuffer(out);
                        out.closeEntry();
                    }
                    catch(IOException e){
                        System.out.println("ProjectExport: " + e.getLocalizedMessage());
                    }
                } else if (childNode instanceof org.gcreator.fileclass.Folder) {
                    putFolder((Folder) childNode, prefix + childNode.name + "/", out);
                }
            }
        }
    }

    public static String getConfigFile(Project project) {
        String config = "<?xml version=\"1.0\"?>\n";
        config += "<project>";
        config += "<type>" + project.getClass().getName() + "</type>";
        config += "<content>";
        config += getContent("", project);
        config += "</content>";
        config += "</project>";
        return config;
    }

    public static String getContent(String prefix, Folder folder) {
        String content = "";
        org.gcreator.fileclass.Object childNode;
        for (int i = 0; i < folder.getChildArrayNum(); i++) {
            if ((childNode = folder.childAt(i)) != null) {
                content += "<file type=\"" + childNode.getClass().getName() + "\">" + prefix + childNode.name;
                if (childNode instanceof org.gcreator.fileclass.File) {
                    content += "." + ((org.gcreator.fileclass.File) childNode).type;
                }
                content += "</file>";
                if (childNode instanceof Folder) {
                    content += getContent(prefix + childNode.name + "/", (Folder) childNode);
                }
            }
        }
        return content;
    }
}