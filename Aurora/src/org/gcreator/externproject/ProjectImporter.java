/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.externproject;

import org.gcreator.components.impl.CustomFileFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.zip.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.gcreator.components.impl.ByteInputStream;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;
import org.gcreator.managers.*;

/**
 *
 * @author Luís
 */
public class ProjectImporter {

    //static String name;
    static int type;
    static Project project;
    static String config;
    static Vector<String> Stringfiles = new Vector<String>();
    static Vector<byte[]> Bytefiles = new Vector<byte[]>();
    static Vector<Object> objects = new Vector<Object>();

    public static void readFile(String s, String name) {
        Stringfiles.add(s);
    }

    public static void readConfig(String s, String name) {
        org.gcreator.fileclass.Folder f = new org.gcreator.fileclass.Folder("");
        String ptype = s.split(">")[3].split("<")[0];
        boolean run2 = false;
        try {
            //      System.out.println(ptype);
            project = (Project) ClassLoading.classLoader.loadClass(ptype).newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
            run2 = true;
        }
        if (run2) {
            try {
                project = (Project) ClassLoading.classLoader.loadClass(ptype).newInstance();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        project.name = name;
//        System.out.println("NAME: " + name);
        s = s.replaceAll("<project>.*?<content>", "");
        s = s.replaceAll("</content>", "");
        try {
            s = s.replaceAll("<?\\?xml version=\"1\\.0\"\\?>", "");
        } catch (IndexOutOfBoundsException e) {
        }
        //     System.out.println("Splitting s, which is: " + s);
        String[] ss = s.split("<file type=\"");
        int ii = 1;
        int fileno = 0;
        while (ii < ss.length) {
            String[] sss = ss[ii].replaceAll("</file>", "").split("\">"); //SpriteGroup">Sprites
            //        System.out.println("Being ss[ii]="+ss[ii]);
            //        System.out.println("In this position, sss[0] was equal to " + sss[0]);
            if (sss[0].equals("org.gcreator.fileclass.GFile")) {
                //         System.out.println("START FILE");
                sss[1] = sss[1].replaceAll("</project>", "");
                String[] ssss = sss[1].split("\\.");
                String[] g = sss[1].split("/");
                Folder fol = project;
                try {
                    for (int i = 0; i < g.length - 1; i++) {
                        if (g[i].equals("")) {
                            continue;
                        //     System.out.println("trying to find " + g[i]);
                        }
                        fol = fol.findChildFolder(g[i]);
                    //      System.out.println("findFolder " + fol.name);
                    }
                } catch (Exception e) {
                    System.err.println(e.toString());
                    fol = project;
                }
                //if (dir.indexOf("/") != -1) {
                //    dir = dir.substring(0, dir.lastIndexOf("/"));
                //} else {
                //    dir = "/";
                //}
                if (ssss.length > 0) {
                    try {
                        String tname = ssss[0];
                        if (tname.indexOf("/") != -1) {
                            tname = tname.substring(tname.lastIndexOf("/") + 1);
                        }
                        //org.gcreator.fileclass.GFile file = new org.gcreator.fileclass.GFile(project.findFolder(dir), tname, ssss[1], null);
                        org.gcreator.fileclass.GFile file = new org.gcreator.fileclass.GFile(fol, tname, ssss[1], null);
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
//                        } else if (ssss[1].equals("jpg") || ssss[1].equals("png") || ssss[1].equals("gif")) {
//                           GImage a = new GImage(file.name);
//                           a.readXml((String) file.value);
//                           file.value = a;
//                        } else {
//                            FileOpenListener l = gcreator.window.getFileEditor(ssss[1]);
//                            if (l != null) {
//                                file.value = l.generateResource(file, (String) file.value);
//                            }
//                        }
                        fileno++;
                    } catch (Exception e) {
                        System.err.println("In 1: sss=" + sss);
                        System.err.println(e.getMessage());
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
            }*/ else {
                boolean rung = false;
                try {
                    Group t = (Group) ClassLoading.classLoader.loadClass(sss[0]).newInstance();
                    t.root = project;
                    t.name = sss[1].substring(sss[1].lastIndexOf("/") + 1);
                    String[] g = sss[1].split("/");
                    Folder fol = project;
                    for (int i = 0; i < g.length - 1; i++) {
                        if (g[i].equals("")) {
                            continue;
                        }
                        fol = fol.findChildFolder(g[i]);
                    }
                    fol.add(t);
                } catch (Exception e) {
                    System.out.println("In 2: " + e);
                    rung = true;
                }
                if (rung) {
                    try {
                        Group t = (Group) ClassLoading.classLoader.loadClass(sss[0]).newInstance();
                        t.root = project;
                        t.name = sss[1].substring(sss[1].lastIndexOf("/") + 1);
                        String[] g = sss[1].split("/");
                        Folder fol = project;
                        for (int i = 0; i < g.length - 1; i++) {
                            if (g[i].equals("")) {
                                continue;
                            }
                            fol = fol.findChildFolder(g[i]);
                        }
                        fol.add(t);
                    } catch (Exception e) {
                        if (sss.length < 2) {
                            System.err.println("ERROR: sss has a length of " + sss.length);
                            System.out.println("ss[ii]=" + ss[ii]);
                        }
                        System.out.println("In 3: sss[1]=" + sss[1]);
                        System.err.println(e.toString());
                    }
                }
            }

            ii++;
        }
        if (project != null) {
            ProjectTree.importFolderToTree(project, org.gcreator.core.gcreator.panel.top);

            if (project instanceof GameProject) {
                try {
                    GameProject p = (GameProject) project;
                    p.actors = p.getFolderFor("actor").getChildNum() + 1;
                    p.classes = p.getFolderFor("class").getChildNum() + 1;
                    p.images = p.getFolderFor("image").getChildNum() + 1;
                    p.paths = p.getFolderFor("path").getChildNum() + 1;
                    p.scenes = p.getFolderFor("scene").getChildNum() + 1;
                    p.scripts = p.getFolderFor("class").getChildNum() + 1;
                    p.sounds = p.getFolderFor("sound").getChildNum() + 1;
                    p.sprites = p.getFolderFor("sprite").getChildNum() + 1;
                    p.tilesets = p.getFolderFor("tileset").getChildNum() + 1;
                    p.timelines = p.getFolderFor("timeline").getChildNum() + 1;
                } catch (NullPointerException exc) {
                    exc.printStackTrace();
                }
            } else if (project instanceof ModuleProject) {
                try {
                    ModuleProject p = (ModuleProject) project;
                    p.actions = p.getFolderFor("action").getChildNum() + 1;
                    p.classes = p.getFolderFor("class").getChildNum() + 1;
                    p.images = p.getFolderFor("image").getChildNum() + 1;
                    p.scripts = p.getFolderFor("class").getChildNum() + 1;
                } catch (NullPointerException exc) {
                    exc.printStackTrace();
                }
            }
        }
        GPanel.setMainProject(project);
        gcreator.panel.workspace.updateUI();
    }
    private static JFileChooser fc = new JFileChooser();
    

    static {
        fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
    }

    public static void OpenProject(Component caller) {
        String fname = null;
        try {
            //open project
            if (fc.showOpenDialog(caller) == JFileChooser.CANCEL_OPTION) {
                return;
            }
            java.io.File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            if (!file.exists()) {
                return;
            }
            if (file.isDirectory()) {
                return;
            }
            FileInputStream fin = new FileInputStream(file);
            ZipInputStream in = new ZipInputStream(fin);
            ZipEntry zipe;
            byte[] b = new byte[1024];
            fname = file.getName().replaceAll("^(.*)\\.(.*)$", "$1");
            while ((zipe = in.getNextEntry()) != null) {
                //          System.out.println("" + zipe.getName());
                if (!zipe.isDirectory()) {
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    int len;
                    while ((len = in.read(b)) > 0) {
                        stream.write(b, 0, len);
                    }
                    //           System.out.println("after write");


                    if (zipe.getName().equals("config")) {
                        config = stream + "";
                    } else {


                        ///
                        if (zipe.getName().endsWith(".txt") || zipe.getName().endsWith(".egml")) {
                            Bytefiles.add(stream.toByteArray());
                            Stringfiles.add(new String(stream.toByteArray()));
                            objects.add(new String(stream.toByteArray()));
                        } else if (zipe.getName().endsWith(".png")) {
                            Bytefiles.add(stream.toByteArray());
                            Stringfiles.add(new String(stream.toByteArray()));
                            FileOutputStream fr = new FileOutputStream("read.png");
                            fr.write(stream.toByteArray());
                            fr.close();
                            BufferedImage bu = ImageIO.read(new FileInputStream("read.png"));
                            objects.add(new ImageIcon(bu));
                        } else {

                            /// following code beta
                            try {
                                ObjectInputStream s = new ObjectInputStream(new ByteArrayInputStream(stream.toByteArray()));
                                objects.add(s.readObject());
                                s.close();
                            } catch (EOFException exc) {
                                System.err.println("[ProjectImporter]EOFException: " + exc);
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