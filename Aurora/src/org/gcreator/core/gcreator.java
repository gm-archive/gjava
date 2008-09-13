/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.core;

//import com.l2fprod.gui.plaf.skin.Skin;
//import com.l2fprod.gui.plaf.skin.SkinLookAndFeel;
import org.gcreator.managers.ClipboardManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import org.gcreator.api.util.CreateApiList;
import org.gcreator.components.NewFileGroup;
import org.gcreator.components.NewProject;
import org.gcreator.components.SystemOutputReader;
import org.gcreator.components.impl.DefaultToolbarItem;
import org.gcreator.components.impl.ToolbarButton;
import org.gcreator.components.navigator.NoFileSelectedNavigator;
import org.gcreator.components.navigator.UnknownResourceNavigator;
import org.gcreator.extended.JarClassLoader;
import org.gcreator.help.AboutPanel;
//import org.lwjgl.util.applet.LWJGLInstaller;
import org.gcreator.managers.Registry;
import org.gcreator.managers.ScriptThemeManager;
import org.gcreator.managers.SettingsIO;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.Jar;
import org.gcreator.plugins.Plugger;
import org.gcreator.threading.ThreadPool;
import org.gcreator.units.Dictionary;
import org.gcreator.units.SystemErrStream;
import org.gcreator.units.SystemOutStream;

/**
 *
 * @author Luís
 * @author TGMG
 * @author Serge Humphrey
 */
public class gcreator {

    private static String[] arguments;
    public static final double version = 0.83;
    public static final String displayVersion = "1.0 Milestone 3";
    public static Aurwindow window;
    public static GPanel panel;
    public static String output = "";
    public static SplashScreen splash;
    public static ClipboardManager clipboard = new ClipboardManager();
    public static String folder;
    private static String java_version = System.getProperty("java.version");
    public static String settingsLocation = "." + File.separator + "settings" + File.separator;
    public final static JarClassLoader lafLoader = new JarClassLoader();
    /**
     * Use this to bypass printing stuff in the GUI components and print it directly to the <tt>System</tt>.
     * Use only for debuging and printing large amounts of data.
     */
    public static PrintStream debugOut = System.out;
    /**
     * Use this to bypass printing stuff in the GUI components and print it directly to the <tt>System</tt>.
     * Use only for debuging and printing large amounts of data.
     */
    public static PrintStream debugErr = System.err;

    static {
        //Tap into System.out and System.err
        new SystemOutputReader();
        SystemOutStream.instance = new SystemOutStream(System.out);
        System.setOut(SystemOutStream.instance);
        SystemErrStream.instance = new SystemErrStream(System.err);
        System.setErr(SystemErrStream.instance);

    //try {
            /*
     * Ethos does not work very well when switching to another L&F.
     * Is is also ugly and incredibly slow, therefore I have disabled it.
     */
    //Skin skin = SkinLookAndFeel.loadThemePack(org.gcreator.utils.ethos.Plugin.class.getResource("/themepack.zip"));
    //SkinLookAndFeel.setSkin(skin);
    //UIManager.installLookAndFeel(new LookAndFeelInfo("Ethos", SkinLookAndFeel.class.getName()));
    //UIManager.setLookAndFeel(new SkinLookAndFeel());
    //} catch (Exception exc) {
    //    System.err.println("Exception_at gcreator<static>: "+exc);
    //}
    }

    public static String[] getargs() {
        return arguments;
    }

    public static final String getJavaVersion() {
        return java_version;
    }
    protected static boolean applet;

    public static void main(String[] args) {
        applet = false;
        __main(args);
    }
    protected static boolean plugload = true;

    public static void __main(String[] args, boolean plugload, boolean applet) {
        gcreator.plugload = plugload;
        gcreator.applet = applet;
        __main(args);
    }

    public static void __main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            loadLookandFeels();
        } catch (Exception exc) {
            System.out.println("Exception: " + exc);
        }
        boolean plugload = true;
        boolean ismdi = false;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
                if (args[i].equals("-safe")) {
                    plugload = false;
                } else if (args[i].matches("^-jemul:.*$")) {
                    java_version = args[i].replaceFirst("^-jemul:(.*)$", "$1");
                } else if (args[i].equals("-mdi")) {
                    ismdi = true;
                } else if (args[i].matches("^-(-?)help$")) {
                    System.out.println("G-Creator version: " + version);
                    System.out.println("Licensed under LGPL v3. More information in README.txt and 'About'.");
                    System.out.println("-safe\t\tStarts G-Creator in safe mode. (No plugins)");
                    System.out.println("-E --evil-mode\t\tStarts G-Creator in evil mode.");
                    System.out.println("-jemul:version\tPretends the user is running G-Creator with version 'version'");
                    System.out.println("-mdi\t\tStarts G-Creator in MDI mode");
                    System.out.println("-help\t\tDisplays info about G-Creator");
                    System.exit(0);
                }
            }
        }
        int ver = Integer.parseInt(gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
        System.out.println("Running Java version " + java_version);
        if (!applet) {
            folder = "" + gcreator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            int location = folder.lastIndexOf("/");
            folder = folder.substring(0, location + 1);
            folder = folder.replaceAll("file://", "");
            folder = folder.replaceAll("%20", " ");
            folder = folder.substring(1);
            folder = folder.replace("/", "\\");
            if (plugload) {
                Plugger.registerLoader();
            }
        }
        if (ver <= 4) {
            plugload = false;
        }
        arguments = args;
        if (!applet) {
            SettingsIO.loadSettings();
        }

        Dictionary.loadDictionaries();

        Dictionary.activeDictionary = (String) Registry.get("Global.language");
        if (Dictionary.activeDictionary == null) {
            Dictionary.activeDictionary = "en";
        }


        try {
            MetalLookAndFeel.setCurrentTheme((MetalTheme) Registry.get("Graphics.metalTheme"));
        } catch (Exception exc) {
            System.err.println("[gcreator:191]Exception: " + exc);
        }
        ToolbarButton newp = new DefaultToolbarItem("std_newProject", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/newproject.png")), "general-toolbar-newproject");
        ToolbarButton opn = new DefaultToolbarItem("std_openProject", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/openproject.png")), "general-toolbar-openproject");
        ToolbarButton save = new DefaultToolbarItem("std_save", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/save.png")), "general-toolbar-save");
        ToolbarButton saveall = new DefaultToolbarItem("std_saveAll", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/saveall.png")), "general-toolbar-saveall");
        ToolbarButton saveproj = new DefaultToolbarItem("std_saveProj", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/project_saveall.png")), "general-toolbar-projectsaveall");
        ToolbarButton addimg = new DefaultToolbarItem("std_addImage", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addimage.png")), "general-toolbar-addimage");
        ToolbarButton addspr = new DefaultToolbarItem("std_addSprite", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsprite.png")), "general-toolbar-addsprite");
        ToolbarButton addtls = new DefaultToolbarItem("std_addTileset", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addtileset.png")), "general-toolbar-addtileset");
        ToolbarButton addpth = new DefaultToolbarItem("std_addPath", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addpath.png")), "general-toolbar-addpath");
        ToolbarButton addsnd = new DefaultToolbarItem("std_addSound", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsound.png")), "general-toolbar-addsound");
        ToolbarButton addtml = new DefaultToolbarItem("std_addTimeline", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addtimeline.png")), "general-toolbar-addtimeline");
        ToolbarButton addact = new DefaultToolbarItem("std_addActor", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addactor.png")), "general-toolbar-addactor");
        ToolbarButton addscn = new DefaultToolbarItem("std_addScene", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addroom.png")), "general-toolbar-addscene");
        //ToolbarButton addcls = new DefaultToolbarItem("std_addClass", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addclass.png")), 52);
        ToolbarButton addgs = new DefaultToolbarItem("std_addScript", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addscript.png")), "general-toolbar-addscript");
        ToolbarButton addgr = new DefaultToolbarItem("std_addGroup", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addgroup.png")), "general-toolbar-addgroup");
        ToolbarButton addaction = new DefaultToolbarItem("std_addAction", new ImageIcon(gcreator.class.getResource("/org/gcreator/actions/images/Main.png")), "general-toolbar-addaction");
        //ToolbarButton addsnippet = new DefaultToolbarItem("std_addSnippet", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsnippet.png")), 286);

        newp.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(1, evt);
            }
        });

        opn.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(2, evt);
            }
        });

        save.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(3, evt);
            }
        });

        saveall.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(4, evt);
            }
        });

        saveproj.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.SaveProject();
            }
        });

        addimg.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(10, evt);
            }
        });

        addspr.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(5, evt);
            }
        });

        addtls.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(11, evt);
            }
        });

        addpth.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(15, evt);
            }
        });

        addsnd.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(6, evt);
            }
        });

        addact.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(8, evt);
            }
        });

        addscn.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(9, evt);
            }
        });

//        addcls.setActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                window.onToolbarActionPerformed(7, evt);
//            }
//        });

        addgs.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(13, evt);
            }
        });

        addtml.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(12, evt);
            }
        });

        addgr.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(14, evt);
            }
        });

        addaction.setActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(16, evt);
            }
        });

        /*addsnippet.setActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        panel.onToolbarActionPerformed(17, evt);
        }
        });*/

        ToolbarManager.toolbuttons.add(newp);
        ToolbarManager.toolbuttons.add(opn);
        ToolbarManager.toolbuttons.add(save);
        ToolbarManager.toolbuttons.add(saveall);
        ToolbarManager.toolbuttons.add(saveproj);
        ToolbarManager.toolbuttons.add(addimg);
        ToolbarManager.toolbuttons.add(addspr);
        ToolbarManager.toolbuttons.add(addtls);
        ToolbarManager.toolbuttons.add(addpth);
        ToolbarManager.toolbuttons.add(addsnd);
        ToolbarManager.toolbuttons.add(addtml);
        ToolbarManager.toolbuttons.add(addact);
        ToolbarManager.toolbuttons.add(addscn);
        ToolbarManager.toolbuttons.add(addaction);
//        ToolbarManager.toolbuttons.add(addcls);
        ToolbarManager.toolbuttons.add(addgs);
        ToolbarManager.toolbuttons.add(addgr);
        //ToolbarManager.toolbuttons.add(addsnippet);

        /*Toolbar tool = new Toolbar();
        tool.horizontal = true;
        tool.first = true;
        tool.rollover = true;
        tool.items.add(newp);
        tool.items.add(opn);
        tool.items.add(new ToolbarSeparator());
        tool.items.add(save);
        tool.items.add(saveall);
        tool.items.add(new ToolbarSeparator());
        tool.items.add(addimg);
        tool.items.add(addspr);
        tool.items.add(addtls);
        tool.items.add(addsnd);
        tool.items.add(addact);
        tool.items.add(addscn);
        tool.items.add(addcls);
        ToolbarManager.toolbars.add(tool);*/

        ScriptThemeManager.load();

        if (!applet && plugload) {
            Plugger.onLoad();
            Plugger.onSplashStart();
        }

        splash = new SplashScreen(applet);

        try {
            ToolbarManager.parseToolbarFile("settings/toolbarList.gctl");
        } catch (Exception e) {
            System.out.println("Error while parsint toolbar file: " + e);
        }

        //setup api list
        CreateApiList.setup();

        //install LWJGL
//      try {
//          LWJGLInstaller.tempInstall();
//      } catch (Exception le) {
//         System.out.println(""+le.getLocalizedMessage());
//      }

        try {/*
            if (settings != null && settings[0] != null && settings[0].equals("Native")) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else if (settings == null || settings[0] == null || settings[0].equals("Cross-platform")) {
            javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.OceanTheme());
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } else if (settings[0].equals("Motif")) {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } else if (settings[0].equals("Metal")) {
            javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.DefaultMetalTheme());
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }*/
            if (Registry.get("Graphics.theme").equals("Native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else {
                LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
                int i;
                for (i = 0; i < info.length; i++) {
                    if (info[i].getClassName().equals(Registry.get("Graphics.theme"))) {
                        try {
                            LookAndFeel look = (LookAndFeel) Class.forName(info[i].getClassName()).newInstance();
                            UIManager.setLookAndFeel(look);
                        } catch (ClassNotFoundException exc) {
                            //Was the lookAndFeel loaded from a JAR?
                            LookAndFeel look = (LookAndFeel) lafLoader.loadClass(info[i].getClassName()).newInstance();
                            UIManager.setLookAndFeel(look);
                        }
                        //UIManager.setLookAndFeel(info[i].getClassName());
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("[gcreator]Exception Caught: " + e.getMessage());
            e.printStackTrace();
        }
        //SystemOutputReader.instance.
        if (splash != null) {
            SwingUtilities.updateComponentTreeUI(splash);
        }
        SwingUtilities.updateComponentTreeUI(SystemOutputReader.instance);
        splash.progressBar.setVisible(true);

        if (!applet && plugload) {
            Plugger.onMainWindowStart();
        }
        //ActorEditor.setupActions();
        window = new Aurwindow();
        panel.console.setText(output);
        gcreator.panel.globalsettings = new org.gcreator.components.GlobalSettings();
        gcreator.panel.newfilegroup = new NewFileGroup();
        gcreator.panel.newproject = new NewProject();
        gcreator.panel.about = new AboutPanel();
        gcreator.panel.nofileselnavigator = new NoFileSelectedNavigator();
        gcreator.panel.unkresnav = new UnknownResourceNavigator();
        window.setVisible(true);
        if (splash != null) {
            splash.fadeOut();
            if (!applet && plugload) {
                Plugger.onSplashDispose();
            }
            panel.menubar.updateUI();
        }
        // Doing this on average cuts the heap memory by 5-10 MB, and it isn't
        // it doesn't seem to slow G-Creator down when it executes.
        // Test it yourself using the Sun Java 6 Console "JConsole" tool.
        ThreadPool.scheduledAtFixedRate(new Thread("Forced Garbage Collection") {

            @Override
            public void run() {
                Runtime.getRuntime().gc();
            }
        }, 2000L, 3000L, TimeUnit.MILLISECONDS);
    }

    private static void loadLookandFeels() throws Exception {
        //Load lookandfeels from /settings/LookAndFeels
        BufferedReader r = new BufferedReader(new FileReader(new File("settings/LookAndFeels")));
        String lafname = null;
        while (r.ready()) {
            String s = r.readLine().trim();
            if (s.startsWith(";") || s.equals("")) {
                continue;
            }
            if (s.startsWith("jar")) {
                lafLoader.addJar(new Jar(new URL(s.replaceAll("jar\\W*\\\"(.+)\\\"\\W*", "$1"))));
            } else if (s.startsWith("lafname")) {
                lafname = s.replaceAll("lafname\\W*\\\"(.+)\\\"\\W*", "$1");
            } else if (s.startsWith("laf")) {
                if (lafname == null) {
                    throw new ParseException("Error while parsing /settings/LookAndFeels!", 0);
                }
                String laf = s.replaceAll("laf\\W*(.+)\\W*", "$1");
                UIManager.installLookAndFeel(lafname, laf);
                lafname = null;
            }
        }
        r.close();
    }

    /* Don't allow instantation*/
    private gcreator() {
    }
}
