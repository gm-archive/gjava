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

import javax.swing.*;
import components.*;
import org.gcreator.fileclass.*;

import java.awt.*;
import java.io.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import org.gcreator.managers.ProjectTree;

/**
 *
 * @author Luís
 */
public class ProjectImporter {
   //static String name;
   static int type;
   static Project project;
   static String config;
  static Vector<String> Stringfiles = new Vector();
   static Vector<byte[]> Bytefiles = new Vector();
   
   public static void readFile(String s, String name)
   {
       Stringfiles.add(s);
   }
   
 
   
    public static void readConfig(String s, String name)
    {
        org.gcreator.fileclass.Folder f = new org.gcreator.fileclass.Folder("");
        
        if (s.split(">")[3].equals("Game")) type = 0;
        if (s.split(">")[3].equals("Package")) type = 1;
        if (s.split(">")[3].equals("Extension")) type = 2;
        if (type == 0){
                project = new GameProject(name, "");
        }
        if (type == 1){
                project = new PackageProject(name, "");
        }
        if (type == 2){
                project = new ExtensionProject(name, "");
        }
        project.name = name;
        String[] ss = s.split("<file type=\"");
        int ii=1;
        int fileno = 0;
        while(ii < ss.length){
         String[] sss = ss[ii].replaceAll("</file>", "").split("\">");  //SpriteGroup">Sprites
         if(sss[0].equals("File")){
             String ssss[] = sss[1].split("\\.");
             System.out.println(""+ssss.length);
             if(ssss.length >0){
             org.gcreator.fileclass.File file = new org.gcreator.fileclass.File(f, ssss[0], ssss[1], null);
           file.xml = Stringfiles.elementAt(fileno);
           if (ssss[1].equals("jpg") || ssss[1].equals("png") || ssss[1].equals("gif"))
           file.value = new ImageIcon(Bytefiles.elementAt(fileno));
           fileno++;
             }
         }
         else if(sss[0].equals("ActorGroup"))
             project.add(f = new ActorGroup(project, sss[1]));
         else if(sss[0].equals("CppGroup"))
             project.add(f = new CppGroup(project, sss[1]));
         else if(sss[0].equals("CppRefGroup"))
             project.add(f = new CppRefGroup(project, sss[1]));
         else if(sss[0].equals("EGMLGroup"))
             project.add(f = new EGMLGroup(project, sss[1]));
         else if(sss[0].equals("ImageGroup"))
             project.add(f = new ImageGroup(project, sss[1]));
         else if(sss[0].equals("JavaGroup"))
             project.add(f = new JavaGroup(project, sss[1]));
         else if(sss[0].equals("JavaRefGroup"))
             project.add(f = new JavaRefGroup(project, sss[1]));
         else if(sss[0].equals("SceneGroup"))
             project.add(f = new SceneGroup(project, sss[1]));
         else if(sss[0].equals("SoundGroup"))
             project.add(f = new SoundGroup(project, sss[1]));
         else if(sss[0].equals("SpriteGroup"))
             project.add(f = new SpriteGroup(project, sss[1]));
         else if(sss[0].equals("StaticGroup"))
             project.add(f = new StaticGroup(project, sss[1]));
         else if(sss[0].equals("Group"))
             project.add(f = new Group(project, sss[1]));

        ii++;
        }
        if(project!=null)
                    ProjectTree.importFolderToTree(project, org.gcreator.core.gcreator.window.top);
        Aurwindow.setMainProject(project);
        Aurwindow.workspace.updateUI();
    }
    
    private static JFileChooser fc = new JFileChooser();
    static{
        fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
    }
    
    public static void OpenProject(Component caller) {
        String fname = null;
        try {
            //open project
            fc.showOpenDialog(caller);
            java.io.File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            
            ZipInputStream in = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipe;
            byte[] b = new byte[1024];
            fname = file.getName().replaceAll("^(.*)\\.(.*)$", "$1");
            while( (zipe = in.getNextEntry()) != null ){
                System.out.println(""+zipe.getName());
                if(!zipe.isDirectory())
                {
                   ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
                 int len;
      while ( (len = in.read(b)) > 0) {
          stream.write(b, 0, len);
      }
                                
                if (zipe.getName().equals("config"))
                    config = stream+"";
                 else if (zipe.getName().contains(".jpg") || zipe.getName().contains(".gif") || zipe.getName().contains(".png")) 
                 {
                     Bytefiles.add(stream.toByteArray());
                     Stringfiles.add("");
                 }
                 else {
                    readFile(stream+"",zipe.getName());
                 Bytefiles.add(stream.toByteArray());
                 }
                 
                }
           
            }
       
        } catch (ZipException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        readConfig(config, fname);
    }
}
