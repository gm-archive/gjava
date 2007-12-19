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
    private static ClassLoader loader = null;
    public static PluginCore[] getPlugList(String[] classFiles){
        if(classFiles==null)
            return null;
            PluginCore[] plugins = new PluginCore[classFiles.length];
            if(loader==null){
            File x = new File("./plugins/");
            try {
            if(!x.exists())
                x.mkdir();
                URL url = x.toURI().toURL();
                loader = new URLClassLoader(new URL[]{url});
            } catch(Exception e){ }
            }
            for(int i = 0; i < plugins.length; i++){
                if(classFiles[i]!=null){
                    try {
                        if (loader != null) {
                    Class plugin = loader.loadClass(classFiles[i]);
                    Object instance = plugin.newInstance();
                    if(instance instanceof PluginCore){
                        plugins[i] = (PluginCore) instance;
                    }
                        }
                    } catch(Exception e){ 
            System.out.println(e.toString());
            
        }
                    
                }
            }
            for(int i = 0; i < plugins.length; i++){
                if(plugins[i]==null)
                    break;
                System.out.println(i + ": " + plugins[i].toString());
            }
            return plugins;
        //}
        
    }
    
    public static ClassLoader getPluginClassLoader(){
        return loader;
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
