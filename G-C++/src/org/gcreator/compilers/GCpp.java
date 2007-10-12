/*
 * GCpp.java
 * 
 * Created on 10/Set/2007, 21:31:59
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers;

import org.gcreator.plugins.*;
import org.gcreator.exceptions.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class GCpp extends PluginCore{
    public GCpp(){
        VarsRegistry.setVariable("gcpp.version", "draft");
        settings = new GCppOptions();
    } //install
    
    //Since onMainWindowStart is called before
    //the window constructor, we need something after
    //it.
    
    public GCppOptions settings;
    
    @Override
    public void onSplashDispose(){
        init();
    }
    
    public void init(){
        utilities.addStringMessage("Installed G-C++");
        PluginHelper.addGlobalTab("G-C++", settings);
    }
    
    @Override
    protected Object onSignalReceived(PluginCore caller, Object signal) throws InvalidSignalException{
        return null;
    }
}
