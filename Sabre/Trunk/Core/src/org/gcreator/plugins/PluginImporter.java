package org.gcreator.plugins;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarInputStream;
import org.gcreator.core.Core;

/**
 * This class handles the importing of plugins, usually at startup.
 * 
 * @author Luís Reis
 */
public class PluginImporter {

    public static void loadPlugins() {
        importAppDataPlugins();
        importAppExePlugins();
    }

    public static void importAppDataPlugins() {
        File f = new File(Core.getStaticContext().getApplicationDataFolder().toURI() + "Plugins/");
        System.out.println(f.toString());
        if (!f.exists() || !f.isFile()) {
            return;
        }
        File[] fs = f.listFiles();
        for (File file : fs) {
            if (file.isFile() && file.getName().matches(".*\\.jar")) {
                importPlugin(file);
            }
        }
    }

    public static void importAppExePlugins() {
        File f = new File(Core.getStaticContext().getApplicationExecutableFolder().toURI() + "Plugins/");
        System.out.println(f.toString());
        if (!f.exists()) {
            f.mkdir();
            return;
        }
        if (!f.isFile()) {
            return;
        }
        File[] fs = f.listFiles();
        for (File file : fs) {
            if (file.isFile() && file.getName().matches(".*\\.jar")) {
                importPlugin(file);
            }
        }
    }

    public static void importPlugin(File f) {
        try {
            JarInputStream jaris = new JarInputStream(new FileInputStream(f));
            Map<String, Attributes> s = jaris.getManifest().getEntries();
            jaris.close();
            System.out.println(s.keySet().toArray()[0]);
            if (s.containsKey("Sabre-EntryPoint")) {
                load(f, s.get("Sabre-EntryPoint").getValue(""));
            }
        } catch (Exception e) {
        }
    }

    public static void load(File f, String entryPoint) {
        try {
            URLClassLoader clsloader = new URLClassLoader(new URL[]{f.toURI().toURL()});
            Class c = clsloader.loadClass(entryPoint);
        } catch (Exception e) {

        }
    }
}
