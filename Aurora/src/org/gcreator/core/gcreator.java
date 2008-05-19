/*
 * aurora.java
 * 
 * Created on 24/Ago/2007, 13:32:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gcreator.plugins.*;
import org.gcreator.managers.*;
import org.gcreator.clipboard.*;
import org.gcreator.languages.*;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import org.gcreator.api.util.CreateApiList;
import org.gcreator.components.NewFileGroup;
import org.gcreator.components.NewProject;
import org.gcreator.components.SystemOutputReader;
import org.gcreator.components.impl.DefaultToolbarItem;
import org.gcreator.components.impl.ToolbarButton;
import org.gcreator.components.navigator.*;
import org.gcreator.help.AboutPanel;
//import org.lwjgl.util.applet.LWJGLInstaller;
import org.gcreator.units.SystemErrStream;
import org.gcreator.units.SystemOutStream;

/**
 *
 * @author Luís, TGMG
 */
public class gcreator {
    private static String[] arguments;
    public static final String version = "0.83"; //only use numbers as it is parsed to double for updating!
    public static Aurwindow window;
    public static GPanel panel;
    public static String output = "";
    static SplashScreen splash;
    public static ClipboardManager clipboard = new ClipboardManager();
    public static String folder;
    private static String java_version = System.getProperty("java.version");
    public static String settingsLocation = "." + File.separator + "settings" + File.separator;
    
    static {
        new SystemOutputReader();
        SystemOutStream.instance = new SystemOutStream(System.out);
        System.setOut(SystemOutStream.instance);
        SystemErrStream.instance = new SystemErrStream(System.err);
        System.setErr(SystemErrStream.instance);
    }
    
    public static String[] getargs(){
        return arguments;
    }

    public static final String getJavaVersion(){
        return java_version;
    }
    
    protected static boolean applet;
    
    public static void main(String[] args) {
        applet = false;
        __main(args);
    }
    
    protected static boolean plugload = true;
    
    public static void __main(String[] args, boolean plugload, boolean applet){
        gcreator.plugload = plugload;
        gcreator.applet = applet;
        __main(args);
    }
    
    public static void __main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            
        }
        //System.setProperty("file.encoding", "UTF-8");
        boolean plugload = true;
        boolean ismdi = false;
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] = " + args[i]);
            if(args[i].equals("-safe"))
                plugload = false;
            else if(args[i].matches("^-jemul:.*$")){
                java_version = args[i].replaceFirst("^-jemul:(.*)$", "$1");
            }
            else if(args[i].equals("-mdi"))
                ismdi = true;
            else if(args[i].matches("^-(-?)help$")){
                System.out.println("G-Creator version: " + version);
                System.out.println("Licensed under LGPL v3. More information in README.txt and 'About'.");
                System.out.println("-safe\t\tStarts G-Creator in safe mode. (No plugins)");
                System.out.println("-jemul:version\tPretends the user is running G-Creator with version 'version'");
                System.out.println("-mdi\t\tStarts G-Creator in MDI mode");
                System.out.println("-help\t\tDisplays info about G-Creator");
                System.exit(0);
            }
        }
        int ver = Integer.parseInt(gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
        System.out.println("Running Java version " + java_version);
        if(!applet){
        folder = "" + gcreator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		int location = folder.lastIndexOf("/");
		folder = folder.substring(0,location+1);
		folder = folder.replaceAll("file://","");
		folder = folder.replaceAll("%20"," ");
		folder = folder.substring(1);
		folder = folder.replace("/","\\");
                if(plugload){
                    Plugger.registerLoader();
                    //plugins = Plugger.getPlugList(PluginsList.loadPluglist());
                }
        }
        if(ver<=4)
            plugload = false;
        arguments = args;
        
                String[] settings = null;
        
        if(!applet){
            settings = SettingsIO.loadSettings();
        }

        if (settings == null) {
            settings = new String[8];
            //settings[0] = "Metal";
            settings[0] = UIManager.getSystemLookAndFeelClassName();
            settings[1] = "Tabs (Top)";
            settings[2] = "Visible";
            settings[3] = "English";
            settings[4] = "Visible";
            settings[5] = "Left";
            settings[6] = "800, 600";
            settings[7] = "true";
        }

        if(ismdi||ver<6)
            settings[1] = "MDI";

        LangSupporter.activeLang = new English();
        
        if (!settings[3].equals("English")) {
            if (settings[3].equals("Portuguese (European)")) {
                LangSupporter.activeLang = new Portuguese();
            } else if (settings[3].equals("German")) {
                LangSupporter.activeLang = new German();
            } else if (settings[3].equals("German (Old)")) {
                LangSupporter.activeLang = new GermanOld();
            } else if (settings[3].equals("Russian")) {
                LangSupporter.activeLang = new Russian();
            } else if (settings[3].equals("Spanish")) {
                LangSupporter.activeLang = new Spanish();
            } else {
                utilities.addError(36);
            }
        }
        ToolbarButton newp = new DefaultToolbarItem("std_newProject", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/newproject.png")), 39);
        ToolbarButton opn = new DefaultToolbarItem("std_openProject", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/openproject.png")), 40);
        ToolbarButton save = new DefaultToolbarItem("std_save", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/save.png")), 41);
        ToolbarButton saveall = new DefaultToolbarItem("std_saveAll", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/saveall.png")), 53);
        ToolbarButton addimg = new DefaultToolbarItem("std_addImage", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addimage.png")), 198);
        ToolbarButton addspr = new DefaultToolbarItem("std_addSprite", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsprite.png")), 43);
        ToolbarButton addtls = new DefaultToolbarItem("std_addTileset", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addtileset.png")), 190);
        ToolbarButton addpth = new DefaultToolbarItem("std_addPath", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addpath.png")), 258);
        ToolbarButton addsnd = new DefaultToolbarItem("std_addSound", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsound.png")), 44);
        ToolbarButton addtml = new DefaultToolbarItem("std_addTimeline", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addtimeline.png")), 204);
        ToolbarButton addact = new DefaultToolbarItem("std_addActor", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addactor.png")), 45);
        ToolbarButton addscn = new DefaultToolbarItem("std_addScene", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addroom.png")), 46);
        //ToolbarButton addcls = new DefaultToolbarItem("std_addClass", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addclass.png")), 52);
        ToolbarButton addgs = new DefaultToolbarItem("std_addScript", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addscript.png")), 207);
        ToolbarButton addgr = new DefaultToolbarItem("std_addGroup", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addgroup.png")), 245);
        ToolbarButton addaction = new DefaultToolbarItem("std_addAction", new ImageIcon(gcreator.class.getResource("/org/gcreator/actions/images/Main.png")), 269);
        
        newp.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(1, evt);
            }
        });

        opn.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(2, evt);
            }
        });
        
        save.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(3, evt);
            }
        });
        
        saveall.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(4, evt);
            }
        });
        
        addimg.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(10, evt);
            }
        });
        
        addspr.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(5, evt);
            }
        });
        
        addtls.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(11, evt);
            }
        });
        
        addpth.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(15, evt);
            }
        });
        
        addsnd.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(6, evt);
            }
        });
        
        addact.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(8, evt);
            }
        });
        
        addscn.setActionListener(new ActionListener() {
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
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(13, evt);
            }
        });
        
        addtml.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(12, evt);
            }
        });
        
        addgr.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(14, evt);
            }
        });
        
        addaction.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                panel.onToolbarActionPerformed(16, evt);
            }
        });
        
        ToolbarManager.toolbuttons.add(newp);
        ToolbarManager.toolbuttons.add(opn);
        ToolbarManager.toolbuttons.add(save);
        ToolbarManager.toolbuttons.add(saveall);
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
        
        if(!applet&&plugload){
            Plugger.onLoad();
            Plugger.onSplashStart();
        }
        
        splash = new SplashScreen(applet);
        
        try{
            ToolbarManager.parseToolbarFile("settings/toolbarList.gctl");
        }
        catch(Exception e){}
        
        //setup api list
        CreateApiList.setup();
        
        //install LWJGL
      try {
//  LWJGLInstaller.tempInstall();
} catch (Exception le) {
 System.out.println(""+le.getLocalizedMessage());
}

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
            LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
            int i;
            for (i = 0; i < info.length; i++) {
                if (info[i].getClassName().equals(settings[0])) {
                     UIManager.setLookAndFeel(info[i].getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("[gcreator]Exception Caught: "+e.getMessage());
            e.printStackTrace();
        }
        //SystemOutputReader.instance.
        if(splash!=null)
            SwingUtilities.updateComponentTreeUI(splash);
        splash.progressBar.setVisible(true);
        
        if(!applet&&plugload)
            Plugger.onMainWindowStart();
        //ActorEditor.setupActions();
        window = new Aurwindow(settings);
        gcreator.panel.antialiasing = Boolean.parseBoolean(settings[7]);
        panel.console.setText(output);
        gcreator.panel.globalsettings = new org.gcreator.components.GlobalSettings(settings);
        gcreator.panel.newfilegroup = new NewFileGroup();
        gcreator.panel.newproject = new NewProject();
        gcreator.panel.about = new AboutPanel();
        gcreator.panel.nofileselnavigator = new NoFileSelectedNavigator();
        gcreator.panel.unkresnav = new UnknownResourceNavigator();
        window.setVisible(true);
        
        if(splash!=null){
            splash.fadeOut();
            if(!applet&&plugload)
                Plugger.onSplashDispose();
            panel.menubar.updateUI();
        }
    }
}
