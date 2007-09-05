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
        return false; //Failed to export
    }
    public static String getConfigFile(Project project){
        String config = "<?xml version=\"1.0\"?>";
        config += "<project>";
        config += "<type>" + project.getType() + "</type>";
        config += "<content>";
        //TODO: Content
        config += "</content>";
        config += "</project>";
        return config;
    }
}
