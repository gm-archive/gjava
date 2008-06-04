/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.script.*;
import javax.swing.JOptionPane;

/**
 * JSPlugin is a class which provides support for JavaScript plugins.
 * 
 * @author Luís Reis
 */
public class JSPlugin extends PlatformCore{
    public static PluginCore plugin = null;
    public static Object transmission = null;
    public static Object ret = null;
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("JavaScript");
    public String value = "";
    
    public JSPlugin(String jsfile){
        append(jsfile);
    }
    
    public void append(String jsfile){
        File f = new File("./plugins/" + jsfile);
        FileReader fr = null;
        FileInputStream r = null; 
        char chr;
        try{
            r = new FileInputStream(f);
            while((chr = (char) r.read())!=-1&&r.available()!=0){
                value += chr;
            }
        }
        catch(IOException e){}
        try{
            value += "\n";
            r.close();
        }
        catch(Exception e){}
    }
    
    public void onLoad(){
        plugin = this;
        try{
            engine.eval("var plugin = org.gcreator.plugins.JSPlugin.plugin;");
        }
        catch(Exception e){}
        plugin = null;
        try{
            engine.eval(value);
            engine.eval("try{ onLoad(); } catch(exc){}");
        }
        catch(Exception e){
        }
    }
    
    public void onSplashStart(){
        try{
            engine.eval("try{ onSplashStart(); } catch(exc){}");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Failed to execute onSplashStart() code");
        }
    }
    
    public void onSplashDispose(){
        try{
            engine.eval("try{ onSplashDispose(); } catch(exc){}");
        }
        catch(Exception e){
        }
    }
    
    public void onMainWindowStart(){
        try{
            engine.eval("try{ onMainWindowStart(); } catch(exc){}");
        }
        catch(Exception e){
        }
    }
    
    public void onMainWindowDispose(){
        try{
            engine.eval("try{ onMainWindowStart(); } catch(exc){}");
        }
        catch(Exception e){
        }
    }
    
    public void onLAFDefined(){
        try{
            engine.eval("try{ onLAFDefined(); } catch(exc){}");
        }
        catch(Exception e){
        }
    }
    
    public Object onSignalReceived(PluginCore caller, Object signal){
        ret = null;
        plugin = caller;
        transmission = signal;
        try{
            engine.eval("try{\n"+
                    "org.gcreator.plugins.JSPlugin.ret = onSignalReceived(\n"
                    + "org.gcreator.plugins.JSPlugin.plugin,\n"
                    + "org.gcreator.plugins.JSPlugin.transmission); } catch(exc){}");
        }
        catch(Exception e){
        }
        plugin = null;
        transmission = null;
        return ret;
    }
}
