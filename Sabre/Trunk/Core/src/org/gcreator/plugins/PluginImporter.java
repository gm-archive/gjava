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
import java.util.jar.Manifest;
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
        File f = new File(Core.getStaticContext().getApplicationDataFolder().toString() + "/Plugins/");
        System.out.println(f.toString());
        if (!f.exists()) {
            System.out.println("Creating...");
            f.mkdir();
        }
        if (!f.isDirectory()) {
            System.out.println("Not a directory");
            return;
        }
        File[] fs = f.listFiles();
        System.out.println("Checking " + fs.length + " files.");
        for (File file : fs) {
            if (file.isFile() && file.getName().matches(".*\\.jar")) {
                importPlugin(file);
            }
        }
    }

    public static void importAppExePlugins() {
        File f = new File(Core.getStaticContext().getApplicationExecutableFolder().toString() + "/Plugins/");
        System.out.println(f.toString());
        if (!f.exists()) {
            System.out.println("Creating...");
            f.mkdir();
            return;
        }
        if (!f.isDirectory()) {
            System.out.println("Not a directory");
            return;
        }
        File[] fs = f.listFiles();
        System.out.println("Checking " + fs.length + " files.");
        for (File file : fs) {
            if (file.isFile() && file.getName().matches(".*\\.jar")) {
                importPlugin(file);
            }
        }
    }

    public static void importPlugin(File f) {
        try {
            System.out.println("Loading plugin: " + f.toString());
            JarInputStream jaris = new JarInputStream(new FileInputStream(f));
            Manifest m = jaris.getManifest();
            jaris.close();
            Attributes a = m.getMainAttributes();
            load(f, a.getValue("Pineapple-EntryPoint"));
            /*for(Object obj : o){
                System.out.println("Key: " + obj);
                System.out.println("Value: " + s.get(obj.toString()));
            }
            if (s.containsKey("Sabre-EntryPoint")) {
                load(f, s.get("Sabre-EntryPoint").getValue(""));
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void load(File f, String entryPoint) {
        try {
            System.out.println("Loading " + f.toString());
            URLClassLoader clsloader = new URLClassLoader(new URL[]{f.toURI().toURL()});
            Class c = clsloader.loadClass(entryPoint);
            Object o = c.getConstructor().newInstance();
            c.getMethod("initialize").invoke(o);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
