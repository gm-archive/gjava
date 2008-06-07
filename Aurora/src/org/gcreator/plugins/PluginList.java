/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.plugins;

import java.io.*;
import java.util.*;
import javax.swing.*;
import org.gcreator.core.*;

/**
 * A list of multiple plugins
 * @author Luís Reis
 */
public class PluginList {
    public static final String PLUGLIST = "./settings/pluglist";
    /**
     * The plugin list
     */
    public static final PluginList stdlist = new PluginList(PLUGLIST);
    private PluginList(){} //Don't create plugin lists this way
    
    public Vector<Plugin> plugins = new Vector<Plugin>();
    public PluginList(String location) {
        File pluglist = new File(location);
        FileInputStream reader;
        try{
            reader = new FileInputStream(pluglist);
        }
        catch(IOException e) {
            return;
        }
        Vector<String> lines = new Vector<String>();
        String curstring = "";
        try{
            while(true) {
                int read = reader.read();
                if (read==-1) {
                    break;
                }
                if (read=='\r') {
                    continue;
                }
                if (read=='\n'){
                    lines.add(curstring);
                    curstring = "";
                }
                else{
                    curstring += (char) read;
                }
            }
        }
        catch(IOException e){}
        curstring = null;
        boolean starter = false;
        
        Plugin curplugin = null;
        
        mainloop:
        for(String line : lines) {
            line = line.replace("#(.*)^", "");
            
            if (line.equals("")) {
                continue mainloop;
            }
            if (!starter&&!line.equals("[G-Creator Plugin List]")) {
                //System.out.println("BreaK@2");
                break mainloop;
            }
            else if (!starter){
                starter = true;
                continue mainloop;
            }
            
            if (curplugin==null&&!line.equals("[~Plugin~]")) {
                //System.out.println("BreaK@1");
                break mainloop;
            }
            if (curplugin==null){
                curplugin = new Plugin();
                continue mainloop;
            }
            if (line.equals("[~Plugin~]")){
                //System.out.println("$1Adding plugin"+curplugin.name+" to list.");
                plugins.add(curplugin);
                curplugin = new Plugin();
                continue mainloop;
            }

            if (line.matches("^Author=.*$")){
                curplugin.authors.add(line.replaceAll("^Author=(.*)$", "$1"));
                continue mainloop;
            }

            if (line.matches("^License=.*$")){
                curplugin.licenseLocation = line.replaceAll("^License=(.*)$", "$1");
                continue mainloop;
            }

            if (line.matches("^Name=.*$")){
                curplugin.name = line.replaceAll("^Name=(.*)$", "$1");
                //System.out.println("Found name " + curplugin.name);
                continue mainloop;
            }

            if (line.matches("^Version=.*$")){
                //!OBSOLETE
                //curplugin.version = line.replaceAll("^Version=(.*)$", "$1");
                continue mainloop;
            }

            if (line.matches("^Image=.*$")){
                String fname = "./plugins/" + line.replaceAll("^Image=(.*)$", "$1");
                curplugin.img_loc = fname;
                if ((new File(fname)).exists()&&!line.equals("Image=")) {
                    curplugin.image = new ImageIcon(fname);
                }
                else {
                    curplugin.image = new ImageIcon(getClass().getResource("/org/gcreator/resources/plugin.png"));
                }
                continue mainloop;
            }

            if (line.matches("^Core=.*$")){
                String t = line.replaceAll("^Core=(.*)$", "$1");
                try{
                    curplugin.value = (PluginCore) ClassLoading.classLoader.loadClass(t).newInstance();
                }
                catch(Exception e){
                    System.out.println("Exception while instantating plugin core: "+e);
                    System.out.println("ClassLoading.classLoader.loadClass(t): "+
                            ClassLoading.classLoader.loadClass(t));
                }
                continue mainloop;
            }

            if (line.matches("^Jar=.*$")){
                String t = line.replaceAll("^Jar=(.*)$", "$1");
                curplugin.jar = new Jar(t);
                continue mainloop;
            }

            if (line.matches("^JSFile=.*$")){
                String t = line.replaceAll("^JSFile=(.*)$", "$1");
                try {
                    if (curplugin.value == null) {
                        curplugin.value = new JSPlugin(t);
                    }
                    else{
                        ((JSPlugin) curplugin.value).append(t);
                    }
                }
                catch(Exception e){
                    //System.out.println(e.toString());
                }
                continue mainloop;
            }
            if (curplugin != null) {
                //System.out.println("$2Adding plugin"+curplugin.name+" to list.");
                plugins.add(curplugin);
            } else {
                //System.out.println("'tis null");
            }
        }
        if (curplugin != null) {
                //System.out.println("$3Adding plugin"+curplugin.name+" to list.");
                plugins.add(curplugin);
            }
    }
    
}
