/*
 * SettingsIO.java
 *
 * Created on 4/Set/2007, 13:27:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.managers;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.units.Dictionary;

/**
 *
 * @author Luís
 */
public final class SettingsIO {

    /* Don't allow instantation.
     */
    private SettingsIO() {
    }
    private static final File registry = new File(gcreator.settingsLocation + "registry.xml");

    public static void saveSettings() {
        savetoRegistry();
        try {
            Registry.writeXML(registry);
        } catch (IOException e) {
            utilities.addError("general-errors-writesettings");
            utilities.addStringFormatedMessage(e.getMessage(), null, false);
        }
    }

    public static void loadSettings() {
        try {
            Registry.readXML(registry);
        } catch (IOException ex) {
            Logger.getLogger(SettingsIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            registerRegistry();
        }
    }

    private static void registerRegistry() {
        Registry.create("Graphics.theme", "Native");
        Registry.create("Window.desktop", "TOP");
        Registry.create("Window.showConsole", false);
        Registry.create("Global.language", "en");
        Registry.create("Window.showToolbar", true);
        Registry.create("Window.treePosition", "LEFT");
        Registry.create("Window.size", new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width * 4 / 5,
                Toolkit.getDefaultToolkit().getScreenSize().height * 4 / 5));
        Registry.create("Graphics.antialiasing", true);
        Registry.create("Graphics.metalTheme", MetalLookAndFeel.getCurrentTheme());
        Registry.create("Window.consoleLocation", 540);
        Registry.create("Window.maximized", false);
        Registry.create("Window.showWelcome", true);
    }

    private static void savetoRegistry() {
        Registry.set("Graphics.theme", ((UIManager.getLookAndFeel().getClass().getName().
                equals(UIManager.getSystemLookAndFeelClassName()))
                ? "Native" : UIManager.getLookAndFeel().getClass().getName()));
        Registry.set("Window.size", gcreator.window.getSize());
        Registry.set("Graphics.metalTheme", MetalLookAndFeel.getCurrentTheme());
        Registry.set("Window.consoleLocation", gcreator.panel.splitter1.getDividerLocation());
        Registry.set("Window.maximized", gcreator.window.getExtendedState() == Frame.MAXIMIZED_BOTH);
        Registry.set("Global.language", Dictionary.activeDictionary);
    }
}
