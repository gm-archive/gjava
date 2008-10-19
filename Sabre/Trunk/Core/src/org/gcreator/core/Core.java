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

import org.gcreator.gui.MainFrame;
import org.gcreator.managers.SettingsManager;
import org.gcreator.plugins.DefaultEventTypes;
import org.gcreator.plugins.EventHandler;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.NotifyEvent;
import org.gcreator.plugins.PluginImporter;

/**
 * The Core class contains all of the core functions, loading, etc.
 * 
 * @author Serge Humphrey
 */
public class Core {

    /* 0.97... -> Alpha
     * ...001 -> 1       */
    private static final double version = 0.97001;
    private static boolean safe;
    private static final StaticContext staticContext = new StaticContext();

    /**
     * Don't allow instantation */
    private Core() {
    }

    /**
     * Loads the G-Creator core, modules, and settings.
     * @param safe If <tt>true</tt>, don't load plugins and settings.
     * @see #unload()
     */
    protected static void load(boolean safe) {
        Core.safe = safe;
        if (!Core.safe) {
            SettingsManager.load();
            PluginImporter.loadPlugins();
        }

        /* Initilize the main window */
        EventManager.addEventHandler(new EventHandler() {

            public void handleEvent(NotifyEvent evt) {
                MainFrame frame = new MainFrame();
                staticContext.setMainFrame(frame);
                frame.initialize();
                EventManager.fireEvent(this, DefaultEventTypes.WINDOW_CREATED, frame);
                frame.setVisible(true);
            }
        }, DefaultEventTypes.APPLICATION_INITIALIZED, EventPriority.LOW);

        EventManager.fireEvent(null, DefaultEventTypes.APPLICATION_INITIALIZED);
    }

    /**
     * Unloads the G-Creator core, modules, and saves the settings.
     * @see #load(boolean)
     */
    protected static void unload() {
        if (!Core.safe) {
            SettingsManager.unload();
        }
    }

    /**
     * The G-Creator Core version.
     * 
     * @return The G-Creator core version.
     */
    public static double version() {
        return version;
    }

    /**
     * Returns wheter or not safe mode is on.
     * @return <tt>true</tt> if safe mode is on. Otherwise <tt>false</tt>.
     */
    public boolean isSafeMode() {
        return safe;
    }

    /**
     * Retrieves the Core's StaticContext
     * @return The Core's StaticContext
     */
    public static StaticContext getStaticContext() {
        return staticContext;
    }
}
