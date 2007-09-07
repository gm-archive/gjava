/*
 * PluginLoader.java
 * 
 * Created on 6/Set/2007, 23:12:54
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plugins;

import java.io.*;
import java.net.*;

/**
 *
 * @author Luís
 */
public class PluginLoader{
    public PluginLoader(){}
    
    public void load(String[] classFiles){
        try{
            for(int i = 0; i < classFiles.length; i++)
                if(classFiles[i]!=null)
                    try{
                        loadClass(classFiles[i]);
                    }
                    catch(Exception e){System.out.println(e.toString());}
        }
        catch(NullPointerException e){}
    }
    
    public void loadClass(String classFile) throws Exception{
        File x = new File("plugins/");
        URL url = x.toURI().toURL();
        URL[] urls = new URL[1];
        urls[0] = url;
        ClassLoader loader = new URLClassLoader(urls);
        Class plugin = loader.loadClass(classFile);
        installClass(plugin);
    }
    
    public void installClass(Class plugin) throws Exception{
        Object instance = plugin.newInstance();
        loadPlugin((PluginCore) instance);
    }
    
    public void loadPlugin(PluginCore plugin){
        plugin.start();
    }
}
