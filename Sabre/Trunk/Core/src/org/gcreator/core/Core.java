package org.gcreator.core;

import org.gcreator.gui.MainFrame;
import org.gcreator.managers.SettingsManager;
import org.gcreator.plugins.EventHandler;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.EventType;
import org.gcreator.plugins.NotifyEvent;
import org.gcreator.plugins.PluginImporter;

/**
 * The Core class contains all of the core functions, loading, etc.
 * 
 * @author Serge Humphrey
 */
public class Core {

    private static final double version = 0.81;
    private static boolean safe;
    private static final StaticContext staticContext = new StaticContext();

    /**
     * Don't allow instantation */
    private Core() {
    }

    /**
     * Loads the G-Creator core, modules, and settings.
     * @param safe If <tt>true</tt>, don't load plugins and settings.
     * @see unload()
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
                EventManager.throwEvent(this, EventType.WINDOW_CREATED, frame);
                frame.setVisible(true);
            }
        }, EventType.APPLICATION_INITIALIZED, EventPriority.HIGH);

        EventManager.throwEvent(null, EventType.APPLICATION_INITIALIZED);
    }

    /**
     * Unloads the G-Creator core, modules, and saves the settings.
     * @see load(boolean)
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
