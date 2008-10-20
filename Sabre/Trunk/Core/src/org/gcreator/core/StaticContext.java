/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.gcreator.core;

import java.io.File;
import java.net.URL;
import java.util.Vector;
import org.gcreator.gui.MainFrame;
import org.gcreator.plugins.PluginCore;

/**
 * This class handles G-Creator's application data, making sure all of the
 * appropriate folders exist.
 * 
 * @author Luís Reis
 */
public final class StaticContext {

    private File appDataFolder = null;
    private File appExeFolder = null;
    private MainFrame mainFrame = null;
    private Vector<PluginCore> plugins = null;

    /**
     * Creates a new {@link StaticContext} and ensures
     * that all of the data folders exist.
     * Only to be used by the core module.
     */
    protected StaticContext() {
        String s = System.getProperty("APPDATA");
        if (s == null) {
            s = System.getProperty("user.home") + "/.sabre/";
        } else {
            s += "/Sabre/";
        }
        appDataFolder = new File(s);
        if (!appDataFolder.exists()) {
            appDataFolder.mkdir();
        }
        URL u = getClass().getProtectionDomain().getCodeSource().getLocation();
        try {
            File fl = new File(u.toURI());
            appExeFolder = new File(fl.getParent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        plugins = new Vector<PluginCore>();
    }

    /**
     * Gets the {@link MainFrame}. This may be <tt>null</tt>.
     * @return G-Creator's main frame
     * @see #setMainFrame(MainFrame)
     */
    public MainFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * Sets G-Creator's main window. This should only be
     * called once.
     * 
     * @param mainFrame The {@link MainFrame}
     * @see #getMainFrame()
     */
    protected void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    /**
     * Gets the Application Data folder.
     * This folder's location is operating system-dependent
     * 
     * @return the Application Data folder.
     */
    public File getApplicationDataFolder() {
        return appDataFolder;
    }

    /**
     * Gets the application executable folder.
     * 
     * @return the application executable folder.
     */
    public File getApplicationExecutableFolder() {
        return appExeFolder;
    }
    
    /**
     * Adds a plugin to the plugin list.
     */
    public void addPlugin(PluginCore plugin){
        plugins.add(plugin);
    }
    
    /**
     * Gets the loaded plugins
     */
    public Vector<PluginCore> getPlugins(){
        return (Vector<PluginCore>) plugins.clone();
    }
}
