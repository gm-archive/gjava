/*
 * aurora.java
 * 
 * Created on 24/Ago/2007, 13:32:12
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import editors.ActorEditor;
import plugins.*;
import managers.*;
import clipboard.*;
import languages.*;

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
    public static ClipboardManager clipboard = new ClipboardManager();
    
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
        String[] settings = SettingsIO.loadSettings();

        if (settings == null) {
            settings = new String[5];
            settings[0] = "Native";
            settings[1] = "Tabs";
            settings[2] = "Visible";
            settings[3] = "English";
            settings[4] = "Visible";
        }

        LangSupporter.activeLang = new English();
        
        if (!settings[3].equals("English")) {
            if (settings[3].equals("Portuguese (European)")) {
                LangSupporter.activeLang = new Portuguese();
            } else if (settings[3].equals("German")) {
                LangSupporter.activeLang = new German();
            } else {
                utilities.addError(36);
            }
        }

        try {
            if (settings != null && settings[0] != null && settings[0].equals("Native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else if (settings == null || settings[0] == null || settings[0].equals("Cross-platform")) {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } else if (settings[0].equals("Motif")) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }
        } catch (Exception e) {}
        Plugger.onMainWindowStart(plugins);
        ActorEditor.setupActions();
        
        window = new Aurwindow(settings);
        window.console.setText(output);
        if(splash!=null){
            Plugger.onSplashDispose(aurora.plugins);
            window.menubar.updateUI();
            splash.dispose();
        }
        if(window!=null){
            SwingUtilities.updateComponentTreeUI(window.consolepopup);
            //SwingUtilities.updateComponentTreeUI(window); //NULLPOINTEREXCEPTION try...catch doesn't work.
        }
    }
}
