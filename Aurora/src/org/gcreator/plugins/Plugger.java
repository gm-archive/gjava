/*
 * Plugger.java
 * 
 * Created on 9/Set/2007, 23:21:35
 * 
 */
package org.gcreator.plugins;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gcreator.core.ClassLoading;
import org.gcreator.extended.JarClassLoader;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 *
 * @author Luís
 */
public class Plugger {

    private static JarClassLoader loader = null;

    private Plugger() {
    }

    public static void registerLoader() {
        if (loader != null) {
            return;
        }
        File f = new File(PluginList.PLUGLIST);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            ClassLoading.classLoader.add(loader = new JarClassLoader(getJars()));
        } catch (Exception ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    public static void load(Jar jar) {
        File f = new File("plugins/jars/" + jar.getFile());
        if (loader == null) {
            return;
        }
        Vector<Jar> jars = new Vector<Jar>(loader.getJars().length + 1);
        for (Jar ijar : loader.getJars()) {
            jars.add(ijar);
        }
        jars.add(new Jar(new File("plugins/jars/" + jar.getFile().getName())));
        ClassLoading.classLoader.remove(loader);
        loader = new JarClassLoader(jars.toArray(new Jar[0]));
        ClassLoading.classLoader.add(loader);

    }

    public static JarClassLoader getPluginClassLoader() {
        return loader;
    }

    public static void onLoad() {
        for (Plugin plugin : PluginList.getStdList().plugins) {
            if (plugin != null && plugin.value != null) {
                plugin.value.onLoad();
            }
        }
    }

    public static void onSplashStart() {
        for (Plugin plugin : PluginList.getStdList().plugins) {
            if (plugin != null && plugin.value != null) {
                plugin.value.onSplashStart();
            }
        }
    }

    public static void onMainWindowStart() {
        for (Plugin plugin : PluginList.getStdList().plugins) {
            if (plugin != null && plugin.value != null) {
                plugin.value.onMainWindowStart();
            }
        }
    }

    public static void onSplashDispose() {
        for (Plugin plugin : PluginList.getStdList().plugins) {
            if (plugin != null && plugin.value != null) {
                plugin.value.onSplashDispose();
            }
        }
    }

    public static void onMainWindowDispose() {
        for (Plugin plugin : PluginList.getStdList().plugins) {
            if (plugin != null && plugin.value != null) {
                plugin.value.onMainWindowDispose();
            }
        }
    }

    public static void reloadPlugins() {
        ClassLoading.classLoader.remove(loader);
        File x = new File("./plugins/jars");
        try {
            loader = new JarClassLoader(getJars());
            ClassLoading.classLoader.add(loader);
            for (Plugin p : PluginList.getStdList().plugins) {
                p.value.uninstall();
                p.value.onSplashDispose();
            }
        } catch (Exception e) {
        }
    }

    private static Jar[] getJars() {
        SAXParser parser = null;
        try {
            parser = new SAXParser(new BufferedInputStream(new FileInputStream(PluginList.PLUGLIST)));
        } catch (SAXException ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Plugger.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (parser == null || parser.getRootNode() == null) {
            return new Jar[]{};
        }
        ArrayList<Jar> jars = new ArrayList<Jar>(5);
        for (Node n : parser.getRootNode().getClildren()) {
            for (Node cn : n.getClildren()) {
                if (cn.getName().equals("jar")) {
                    jars.add(new Jar(cn.getContent()));
                    break;
                }
            }
        }
        return jars.toArray(new Jar[jars.size()]);
    }
}
