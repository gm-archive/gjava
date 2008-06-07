/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.plugins;

import java.io.File;
import java.util.*;
import javax.swing.*;
import org.gcreator.core.ClassLoading;

/**
 * @author Luís Reis
 */
public class Plugin {
    public String name = "";
    //public String version = "";
    public String img_loc = "";
    public Vector<String> authors = new Vector<String>();
    public String licenseLocation = "";
    public PluginCore value;
    public ImageIcon image;
    public Jar jar;
    
    public static Plugin parsePlugin(String[] lines) {
        Plugin plugin = new Plugin();
        String core = null;
        mainloop:
        for(String line : lines) {
            line = line.replace("#(.*)^", "").replaceAll("\r", "");
            if(line.equals("")) {
                continue mainloop;
            }
            
            if (line.equals("[~Plugin~]")) {
                continue mainloop;
            }
            
            if(line.matches("^Author=.*$")){
                plugin.authors.add(line.replaceAll("^Author=(.*)$", "$1"));
                continue mainloop;
            }
            
            if(line.matches("^License=.*$")){
                plugin.licenseLocation = line.replaceAll("^License=(.*)$", "$1");
                continue mainloop;
            }
            
            if(line.matches("^Name=.*$")){
                plugin.name = line.replaceAll("^Name=(.*)$", "$1");
                continue mainloop;
            }
            
            if(line.matches("^Version=.*$")) {
                continue mainloop;
            }
            
            if(line.matches("^Image=.*$")){
                String fname = "./plugins/" + line.replaceAll("^Image=(.*)$", "$1");
                plugin.img_loc = fname;
                if((new File(fname)).exists()&&!line.equals("Image=")) {
                    plugin.image = new ImageIcon(fname);
                }
                else {
                     plugin.image = new ImageIcon(Plugin.class.getResource("/org/gcreator/resources/plugin.png"));
                }
                continue mainloop;
            }
            
            if(line.matches("^Core=.*$")){
                core = line.replaceAll("^Core=(.*)$", "$1");
                continue mainloop;
            }
            if(line.matches("^Jar=.*$")){
                String t = line.replaceAll("^Jar=(.*)$", "$1");
                plugin.jar = new Jar(t);
                Plugger.load(plugin.jar);
                if (core != null) {
                    try {
                        plugin.value = (PluginCore) ClassLoading.classLoader.loadClass(core).newInstance();
                    } catch(Exception e) {
                        System.out.println("%Exception: "+e);
                        System.out.println("ClassLoading.classLoader.loadClass(core): "+
                        ClassLoading.classLoader.loadClass(core));
                    }
                    core = null;
                }
                continue mainloop;
            }
        }
        return plugin;
    }
}
