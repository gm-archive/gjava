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
import org.gcreator.editors.ActorEditor;
import org.gcreator.plugins.*;
import org.gcreator.managers.*;
import org.gcreator.clipboard.*;
import org.gcreator.languages.*;

import javax.swing.*;
import org.gcreator.api.util.CreateApiList;
import org.gcreator.components.NewFileGroup;
import org.gcreator.components.NewProject;
import org.gcreator.components.impl.DefaultToolbarItem;
import org.gcreator.components.impl.Toolbar;
import org.gcreator.components.impl.ToolbarButton;
import org.gcreator.components.impl.ToolbarSeparator;
import org.gcreator.help.AboutPanel;

/**
 *
 * @author Luís
 */
public class gcreator {
    private static String[] arguments;
    public static final String version = "1.0m1"; 
    public static Aurwindow window;
    public static String output = "";
    private static SplashScreen splash;
    public static PluginCore[] plugins;
    public static ClipboardManager clipboard = new ClipboardManager();
    public static String folder;
    private static String java_version = System.getProperty("java.version");
    
    public static String[] getargs(){
        return arguments;
    }

    public static final String getJavaVersion(){
        return java_version;
    }
    
    protected static boolean applet;
    
    public static void main(String[] args){
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
                System.out.println("Licensed under GPL v3. More information in README.txt and 'About'.");
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
                if(plugload)
                    plugins = Plugger.getPlugList(PluginsList.loadPluglist());
        }
        if(ver<=4)
            plugload = false;
        arguments = args;
        
                String[] settings = null;
        
        if(!applet){
            settings = SettingsIO.loadSettings();
        }

        if (settings == null) {
            settings = new String[6];
            settings[0] = "Native";
            settings[1] = "Tabs (Top)";
            settings[2] = "Visible";
            settings[3] = "English";
            settings[4] = "Visible";
            settings[5] = "Left";
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
        ToolbarButton addimg = new DefaultToolbarItem("std_addImage", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addimage.png")), 42);
        ToolbarButton addspr = new DefaultToolbarItem("std_addSprite", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addactor02.png")), 43);
        ToolbarButton addtls = new DefaultToolbarItem("std_addTileset",null, 190);
        ToolbarButton addsnd = new DefaultToolbarItem("std_addSound", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addsound.png")), 44);
        ToolbarButton addact = new DefaultToolbarItem("std_addActor", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addactor01.png")), 52);
        ToolbarButton addscn = new DefaultToolbarItem("std_addScene", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addroom.png")), 45);
        ToolbarButton addcls = new DefaultToolbarItem("std_addClass", new ImageIcon(gcreator.class.getResource("/org/gcreator/resources/toolbar/addscript.png")), 46);

        newp.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(1, evt);
            }
        });

        opn.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(2, evt);
            }
        });
        
        save.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(3, evt);
            }
        });
        
        saveall.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(4, evt);
            }
        });
        
        addimg.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(10, evt);
            }
        });
        
        addspr.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(5, evt);
            }
        });
        
        addtls.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(11, evt);
            }
        });
        
        addsnd.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(6, evt);
            }
        });
        
        addact.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(8, evt);
            }
        });
        
        addscn.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(9, evt);
            }
        });
        
        addcls.setActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                window.onToolbarActionPerformed(7, evt);
            }
        });
        
        ToolbarManager.toolbuttons.add(newp);
        ToolbarManager.toolbuttons.add(opn);
        ToolbarManager.toolbuttons.add(save);
        ToolbarManager.toolbuttons.add(saveall);
        ToolbarManager.toolbuttons.add(addimg);
        ToolbarManager.toolbuttons.add(addspr);
        ToolbarManager.toolbuttons.add(addtls);
        ToolbarManager.toolbuttons.add(addsnd);
        ToolbarManager.toolbuttons.add(addact);
        ToolbarManager.toolbuttons.add(addscn);
        ToolbarManager.toolbuttons.add(addcls);
        
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
        
        if(!applet&&plugload){
            Plugger.loadPlugins(plugins);
            Plugger.onSplashStart(plugins);
        }
        splash = new SplashScreen(applet);
        
        try{
            ToolbarManager.parseToolbarFile("toolbarList.gctl");
        }
        catch(Exception e){}
        
        //setup api list
        CreateApiList.setup();

        try {
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
            }
            
        } catch (Exception e) {}
        if(!applet&&plugload)
            Plugger.onMainWindowStart(plugins);
        //ActorEditor.setupActions();
        window = new Aurwindow(settings);
        window.console.setText(output);
        Aurwindow.globalsettings = new org.gcreator.components.GlobalSettings();
        Aurwindow.newfilegroup = new NewFileGroup();
        Aurwindow.newproject = new NewProject();
        Aurwindow.about = new AboutPanel();
        if(splash!=null){
            if(!applet&&plugload)
                Plugger.onSplashDispose(gcreator.plugins);
            window.menubar.updateUI();
            splash.dispose();
        }
    }
}
