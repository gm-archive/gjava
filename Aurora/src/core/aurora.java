/*
 * aurora.java
 * 
 * Created on 24/Ago/2007, 13:32:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import plugins.*;
import managers.*;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class aurora {
    private static String[] arguments;
    public static final String version = "1.0alpha"; 
    public static Aurwindow window;
    public static String output = "";
    private static SplashScreen splash;
    public static PluginCore[] plugins;
    
    public static String[] getargs(){
        return arguments;
    }
    
    public static void main(String[] args){
        plugins = Plugger.getPlugList(PluginsList.loadPluglist());
        arguments = args;
        Plugger.loadPlugins(plugins);
        Plugger.onSplashStart(plugins);
        splash = new SplashScreen();
        start();
        
        //Edit the plugin list at pluglist.xml (same directory as settings.xml)
    }
    
    public static void start(){
        Plugger.onMainWindowStart(plugins);
        window = new Aurwindow();
        if(window!=null)
            SwingUtilities.updateComponentTreeUI(window); //NULLPOINTEREXCEPTION try...catch doesn't work.
        window.console.setText(output);
        if(splash!=null){
            Plugger.onSplashDispose(aurora.plugins);
            splash.dispose();
        }
    }
}
