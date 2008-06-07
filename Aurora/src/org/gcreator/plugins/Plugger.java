/*
 * Plugger.java
 * 
 * Created on 9/Set/2007, 23:21:35
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.plugins;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gcreator.core.*;
import org.gcreator.extended.JarClassLoader;

/**
 *
 * @author Luís
 */
public class Plugger {

    private static JarClassLoader loader = null;
    
    private Plugger() {
    }
    
    public static void registerLoader() {
        if (loader != null) {
            return;
        }
        File f = new File("settings/pluglist");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            ClassLoading.classLoader.add(loader = new JarClassLoader(getJars()));
        } catch (Exception ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.WARNING, null, ex);
        }
    }
    
    public static void load(Jar jar) {
        try {
            File f = new File("plugins/jars/" + jar.getFile());
            if (loader == null) {
                return;
            }
            Vector<Jar> jars = new Vector<Jar>(loader.getJars().length + 1);
            for (Jar ijar : loader.getJars()) {
                jars.add(ijar);
            }
            jars.add(new Jar(new File("plugins/jars/" + jar.getFile().getName())));
            ClassLoading.classLoader.remove(loader);
            loader = new JarClassLoader(jars.toArray(new Jar[0]));
            ClassLoading.classLoader.add(loader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static JarClassLoader getPluginClassLoader() {
        return loader;
    }

    public static void onLoad() {
        for (Plugin plugin : PluginList.stdlist.plugins) {
                if (plugin != null && plugin.value!=null) {
                    plugin.value.onLoad();
                }
            }
    }

    public static void onSplashStart() {
            for (Plugin plugin : PluginList.stdlist.plugins) {
                if (plugin != null && plugin.value!=null) {
                    plugin.value.onSplashStart();
                }
            }
    }

    public static void onMainWindowStart() {
        for (Plugin plugin : PluginList.stdlist.plugins) {
                if (plugin != null && plugin.value!=null) {
                    plugin.value.onMainWindowStart();
                }
            }
    }

    public static void onSplashDispose() {
        for (Plugin plugin : PluginList.stdlist.plugins) {
                if (plugin != null && plugin.value!=null) {
                    plugin.value.onSplashDispose();
                }
            }
    }

    public static void onMainWindowDispose() {
        for (Plugin plugin : PluginList.stdlist.plugins) {
                if (plugin != null && plugin.value!=null) {
                    plugin.value.onMainWindowDispose();
                }
            }
    }
    
    public static void reloadPlugins() {
        ClassLoading.classLoader.remove(loader);
        File x = new File("./plugins/jars");
        try {
            loader = new JarClassLoader(getJars());
            ClassLoading.classLoader.add(loader);
            for (Plugin p : PluginList.stdlist.plugins) {
                p.value.uninstall();
                p.value.onSplashDispose();
            }
        } catch (Exception e) {
        }
    }
    
    private static Jar[] getJars() {
        BufferedInputStream in = null;
        StringBuffer str = new StringBuffer(120);
        try {
            in = new BufferedInputStream(new FileInputStream(new File("settings/pluglist")));
            int data;
            while ((data = in.read()) != -1) {
                str.append((char)data);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String[] lines = str.toString().replaceAll("\r", "").split("\n");
        ArrayList<Jar> jars = new ArrayList<Jar>(5);
        for (String line : lines) {
            if(line.matches("^Jar=.*$")) {
                try {
                    jars.add(new Jar(new File("plugins/jars/" + line.replaceAll("^Jar=(.*)$", "$1"))));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return jars.toArray(new Jar[]{});
    }
    
}
