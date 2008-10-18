package org.gcreator.core;

import java.io.File;
import java.net.URL;
import org.gcreator.gui.MainFrame;

/**
 * This class handles G-Creator's application data, making sure all of the
 * appropriate folders exist.
 * 
 * @author luis
 */
public final class StaticContext {

    private File appDataFolder = null;
    private File appExeFolder = null;
    private MainFrame mainFrame = null;

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
    }

    /**
     * Gets the {@link MainFrame}. This may be <tt>null</tt>.
     * @return G-Creator's main frame
     * @see setMianFrame()
     */
    public MainFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * Sets G-Creator's main window. This should only be
     * called once.
     * 
     * @param mainFrame The {@link MainFrame}
     * @see getMainFrame()
     */
    protected void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public File getApplicationDataFolder() {
        return appDataFolder;
    }

    public File getApplicationExecutableFolder() {
        return appExeFolder;
    }
}
