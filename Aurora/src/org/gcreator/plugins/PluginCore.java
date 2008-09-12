/*
 * PluginCore.java
 * 
 * Created on 6/Set/2007, 22:47:18
 * 
 */
package org.gcreator.plugins;

import org.gcreator.exceptions.InvalidSignalException;

/**
 *
 * @author Luís
 */
public abstract class PluginCore {

    public void onLoad() {
    }

    public void onLAFDefined() {
    }

    public void onSplashStart() {
    }

    public void onMainWindowStart() {
    }

    public void onSplashDispose() {
    }

    public void onMainWindowDispose() {
    }

    public Object sendSignal(PluginCore caller, Object signal) throws InvalidSignalException {
        return onSignalReceived(caller, signal);
    }

    protected Object onSignalReceived(PluginCore caller, Object signal) throws InvalidSignalException {
        return null;
    }

    public String getID() {
        return null;
    }

    /**
     * Gets the plugin that 
     * @return The plugin that owns this PluginCore
     */
    public Plugin getPlugin() {
        for (Plugin p : PluginList.getStdList().plugins) {
            if (p.value == this) {
                return p;
            }
        }
        return null;
    }

    public String getPluginName() {
        Plugin p = getPlugin();
        if (p == null) {
            return null;
        }
        return p.name;
    }

    public void uninstall() {
    }
}
