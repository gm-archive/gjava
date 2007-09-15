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
import fileclass.ActorGroup;
import fileclass.EGMLGroup;
import fileclass.GameProject;
import fileclass.Group;
import fileclass.ImageGroup;
import fileclass.Project;
import fileclass.SceneGroup;
import fileclass.SoundGroup;
import fileclass.SpriteGroup;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/**
 *
 * @author Luís
 */
public class ProjectImporter {
   static String name;
   static int type;
    public static void readConfig(String s)
    {
        System.out.println("reading config file...");
        
        System.out.println(s);
        String[] ss = s.split(">");
        if (ss[3].equals("Game")) type=0;
//        int ii=0;
//        while(ii < ss.length){
//        ii++;
//        }
        type=0;
        name="";
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
            byte[] b = new byte[1024];;
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
            
            //create project
            Project project = null;
            
            if (type == 0){
                project = new GameProject(name, "");
                Aurwindow.setMainProject(project);
                project.add(new ImageGroup(project, "Images"));
                project.add(new SpriteGroup(project, "Sprites"));
                project.add(new SoundGroup(project, "Sounds"));
                project.add(new ActorGroup(project, "Actors"));
                project.add(new SceneGroup(project, "Scenes"));
                project.add(new EGMLGroup(project, "Classes"));
                project.add(new Group(project, "Extensions"));
                new fileclass.File(project, "Settings", "settings", null);
            }
        
        } catch (ZipException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
