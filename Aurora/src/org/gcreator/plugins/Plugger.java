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
import java.net.*;

import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class Plugger {

    private static ClassLoader loader = null;
    
    public static void registerLoader() {
        
        if (loader == null) {
            File x = new File("./plugins/");
            try {
                if (!x.exists()) {
                    x.mkdir();
                }
                URL url = x.toURI().toURL();
                loader = new URLClassLoader(new URL[]{url});
                ClassLoading.classLoader.add(loader);
                
            } catch (Exception e) {
            }
        }
    }

    public static PluginCore[] getPlugList(String[] classFiles) {
        if (classFiles == null) {
            return null;
        }
        PluginCore[] plugins = new PluginCore[classFiles.length];
        for (int i = 0; i < plugins.length; i++) {
            if (classFiles[i] != null) {
                try {
                    if (loader != null) {
                        Class plugin = ClassLoading.classLoader.loadClass(classFiles[i]);
                        Object instance = plugin.newInstance();
                        if (instance instanceof PluginCore) {
                            plugins[i] = (PluginCore) instance;
                        }
                    }
                } catch (Exception e) {
                }

            }
        }
        return plugins;
    //}

    }

    public static ClassLoader getPluginClassLoader() {
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
}
