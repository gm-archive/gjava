/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

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
