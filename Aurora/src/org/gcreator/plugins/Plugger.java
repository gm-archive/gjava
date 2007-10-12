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

/**
 *
 * @author Luís
 */
public class Plugger {
    public static PluginCore[] getPlugList(String[] classFiles){
        try{
            PluginCore[] plugins = new PluginCore[classFiles.length];
            File x = new File("plugins/");
            URL url = x.toURI().toURL();
            URL[] urls = new URL[1];
            urls[0] = url;
            ClassLoader loader = new URLClassLoader(urls);
            for(int i = 0; i < plugins.length; i++)
                if(classFiles[i]!=null){
                    Class plugin = loader.loadClass(classFiles[i]);
                    Object instance = plugin.newInstance();
                    if(instance instanceof PluginCore)
                        plugins[i] = (PluginCore) instance;
                }
            return plugins;
        }
        catch(Exception e){
            return null;
        }
    }
    
    public static void loadPlugins(PluginCore[] plugins){
        if(plugins!=null)
        for(int i = 0; i < plugins.length; i++)
            if(plugins[i]!=null){
                plugins[i].onLoad();
            }
    }
    
    public static void onSplashStart(PluginCore[] plugins){
        if(plugins!=null)
        for(int i = 0; i < plugins.length; i++)
            if(plugins[i]!=null){
                plugins[i].onSplashStart();
            }
    }
    
    public static void onMainWindowStart(PluginCore[] plugins){
        if(plugins!=null)
        for(int i = 0; i < plugins.length; i++)
            if(plugins[i]!=null){
                plugins[i].onMainWindowStart();
            }
    }
    
    public static void onSplashDispose(PluginCore[] plugins){
        if(plugins!=null)
        for(int i = 0; i < plugins.length; i++)
            if(plugins[i]!=null){
                plugins[i].onSplashDispose();
            }
    }
    
    public static void onMainWindowDispose(PluginCore[] plugins){
        if(plugins!=null)
        for(int i = 0; i < plugins.length; i++)
            if(plugins[i]!=null){
                plugins[i].onMainWindowDispose();
            }
    }
}
