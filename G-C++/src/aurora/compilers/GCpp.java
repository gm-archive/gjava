/*
 * GCpp.java
 * 
 * Created on 10/Set/2007, 21:31:59
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aurora.compilers;

import plugins.*;
import exceptions.*;
import core.*;

/**
 *
 * @author Luís
 */
public class GCpp extends PluginCore{
    public GCpp(){} //install
    
    //Since onMainWindowStart is called before
    //the constructor, we need something after
    //it.
    
    @Override
    public void onSplashDispose(){
        init();
    }
    
    public void init(){
        VarsRegistry.setVariable("gcpp.version", "draft");
        utilities.addStringMessage("Installed G-C++");
    }
    
    @Override
    protected Object onSignalReceived(PluginCore caller, Object signal) throws InvalidSignalException{
        return null;
    }
}
