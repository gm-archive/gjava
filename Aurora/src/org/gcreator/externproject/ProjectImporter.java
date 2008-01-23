/*
 * ProjectImporter.java
 *
 * Created on 5/Set/2007, 13:24:52
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.externproject;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.zip.*;
import javax.swing.*;
import org.gcreator.components.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;
import org.gcreator.managers.*;
import org.gcreator.plugins.Plugger;

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
    static Vector<java.lang.Object> objects = new Vector();

    public static void readFile(String s, String name) {
        Stringfiles.add(s);
    }

    public static void readConfig(String s, String name) {
        org.gcreator.fileclass.Folder f = new org.gcreator.fileclass.Folder("");
        String ptype = s.split(">")[3].split("<")[0];
        boolean run2 = false;
        try {
            System.out.println(ptype);
            project = (Project) ClassLoading.classLoader.loadClass(ptype).newInstance();
        } catch (Exception e) {
        System.out.println(e.toString());
        run2 = true;
        }
        if(run2)
        try {
            project = (Project) ClassLoading.classLoader.loadClass(ptype).newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        project.name = name;
        s = s.replaceAll("</content>", "");
        String[] ss = s.split("<file type=\"");
        int ii = 0;
        int fileno = 0;
        while (ii < ss.length) {
            String[] sss = ss[ii].replaceAll("</file>", "").split("\">"); //SpriteGroup">Sprites
            if (sss[0].equals("org.gcreator.fileclass.File")) {
                sss[1] = sss[1].replaceAll("</project>", "");
                String[] ssss = sss[1].split("\\.");
                String dir = sss[1];
                if (dir.indexOf("/") != -1) {
                    dir = dir.substring(0, dir.lastIndexOf("/"));
                } else {
                    dir = "/";
                }
                if (ssss.length > 0) {
                    try {
                        String tname = ssss[0];
                        if (tname.indexOf("/") != -1) {
                            tname = tname.substring(tname.lastIndexOf("/") + 1);
                        }
                        org.gcreator.fileclass.File file = new org.gcreator.fileclass.File(project.findFolder(dir), tname, ssss[1], null);
                        //file.value = Stringfiles.elementAt(fileno);
                        file.value = objects.elementAt(fileno);
//                        if (ssss[1].equals("settings")) {
//                            SettingsValues w = new SettingsValues();
//                            w.readXml((String) file.value);
//
//                            file.value = w;
//                        } else if (ssss[1].equals("sprite")) {
//                            Sprite a = new Sprite(file.name);
//                            a.readXml((String) file.value);
//                            file.value = a;
//                        } else if (ssss[1].equals("actor")) {
//                            Actor a = new Actor(file.name);
//                            a.readXml((String) file.value);
//                            file.value = a;
//                        } else if (ssss[1].equals("scene")) {
//                            Scene a = new Scene(file.name);
//                            a.readXml((String) file.value);
//                            file.value = a;
                        /*} else*/
                        
                        if (ssss[1].equals("jpg") || ssss[1].equals("png") || ssss[1].equals("gif")) 
                            file.value = new ImageIcon(Bytefiles.elementAt(fileno));
                        
                        
//                         else {
//                            FileOpenListener l = gcreator.window.getFileEditor(ssss[1]);
//                            if (l != null) {
//                                file.value = l.generateResource(file, (String) file.value);
//                            }
//                        }
                        fileno++;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }/* else if (sss[0].equals("ActorGroup")) {
                project.add(f = new ActorGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("CppGroup")) {
                project.add(f = new CppGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("CppRefGroup")) {
                project.add(f = new CppRefGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("EGMLGroup")) {
                project.add(f = new EGMLGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("ImageGroup")) {
                project.add(f = new ImageGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("JavaGroup")) {
                project.add(f = new JavaGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("JavaRefGroup")) {
                project.add(f = new JavaRefGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("SceneGroup")) {
                project.add(f = new SceneGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("SoundGroup")) {
                project.add(f = new SoundGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("SpriteGroup")) {
                project.add(f = new SpriteGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("StaticGroup")) {
                project.add(f = new StaticGroup(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            } else if (sss[0].equals("Group")) {
                project.add(f = new Group(project, sss[1].substring(sss[1].lastIndexOf("/") + 1)));
            }*/
            else{
                boolean rung = false;
                try{
                    Group t = (Group) ClassLoading.classLoader.loadClass(sss[0]).newInstance();
                    t.root = project;
                    t.name = sss[1].substring(sss[1].lastIndexOf("/") + 1);
                    project.add(t);
                }
                catch(Exception e)
                {
                    rung = true;
                }
                if(rung)
                try{
                    Group t = (Group) ClassLoading.classLoader.loadClass(sss[0]).newInstance();
                    t.root = project;
                    t.name = sss[1].substring(sss[1].lastIndexOf("/") + 1);
                    project.add(t);
                }
                catch(Exception e){}
            }

            ii++;
        }
        if (project != null) {
            ProjectTree.importFolderToTree(project, org.gcreator.core.gcreator.window.top);
        }
        Aurwindow.setMainProject(project);
        Aurwindow.workspace.updateUI();
    }
    private static JFileChooser fc = new JFileChooser();
    static {
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
            if(!file.exists())
                return;
            if(file.isDirectory())
                return;
            FileInputStream fin = new FileInputStream(file);
            ZipInputStream in = new ZipInputStream(fin);
            ZipEntry zipe;
            byte[] b = new byte[1024];
            fname = file.getName().replaceAll("^(.*)\\.(.*)$", "$1");
            while ((zipe = in.getNextEntry()) != null) {
                System.out.println("" + zipe.getName());
                if (!zipe.isDirectory()) {
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    int len;
                    while ((len = in.read(b)) > 0) {
                        stream.write(b, 0, len);
                    }
                    System.out.println("after write");


                    if (zipe.getName().equals("config")) {
                        config = stream + "";
                    } else {
                        
                    
                    ///
                        if (zipe.getName().endsWith(".jpg") || zipe.getName().endsWith(".gif") || zipe.getName().endsWith(".png")) {
                            Bytefiles.add(stream.toByteArray());
                            Stringfiles.add("");
                            objects.add("");
                        }
                        else if(zipe.getName().endsWith(".txt")||zipe.getName().endsWith(".egml")){
                            Bytefiles.add(stream.toByteArray());
                            Stringfiles.add(new String(stream.toByteArray()));
                            objects.add(new String(stream.toByteArray()));
                        } else {
                            
                            /// following code beta
                    ObjectInputStream s = new ObjectInputStream(new ByteArrayInputStream(stream.toByteArray()));
                    
                    try {
                        objects.add(s.readObject());
                        s.close();
                    } catch (Exception e) {
                        //class not found?
                        System.out.println("Class error(projectimporter): " + e.getLocalizedMessage());
                    }
                            
                            readFile(stream + "", zipe.getName());

                            Bytefiles.add(stream.toByteArray());

                            //  String today = (String)s.readObject();
                        }
                    }
                }
            }
        } catch (ZipException ex) {
            System.out.println(ex.toString() + ": " + ex.getMessage());
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println(ex.toString() + ": " + ex.getMessage());
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        readConfig(config, fname);
    }
}