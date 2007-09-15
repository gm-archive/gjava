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

import javax.swing.*;
import components.*;
import fileclass.GameProject;
import fileclass.Project;
import fileclass.SpriteGroup;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import managers.ProjectTree;

/**
 *
 * @author Luís
 */
public class ProjectImporter {
   static String name;
   static int type;
   static Project project;
    public static void readConfig(String s)
    {
        System.out.println("reading config file...");
        
        System.out.println(s);
        
        if (s.split(">")[3].equals("Game")) type=0;
        if (type == 0){
                project = new GameProject(name, "");
        }
        Aurwindow.setMainProject(project);
        String[] ss = s.split("<file type=\"");
        int ii=1;
        while(ii < ss.length){
         String[] sss = ss[ii].replaceAll("</file>", "").split("\">");  //SpriteGroup">Sprites
         if(sss[0].equals("SpriteGroup"))
             project.add(new SpriteGroup(project, "Sprites"));
         
        ii++;
        }
        if(project!=null)
                    ProjectTree.importFolderToTree(project, core.aurora.window.top);
        Aurwindow.workspace.updateUI();
    }
    
    public static void OpenProject(Component caller) {
        try {
            //open project
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
            fc.showOpenDialog(caller);
            File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            
            ZipInputStream in = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipe;
            byte[] b = new byte[1024];
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
                    readConfig(stream+"");
                }

            }
       
        } catch (ZipException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
