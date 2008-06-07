/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.extended;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.gcreator.core.ClassLoading;
import org.gcreator.plugins.Jar;

/**
 *
 * @author bob
 */
public class JarClassLoader extends URLClassLoader {
    
    public JarClassLoader(Jar jar) {
        super(new URL[]{});
        addJar(jar);
    }

    public JarClassLoader(Jar[] jars) {
        super(new URL[0]);
        for (Jar jar : jars) {
            addJar(jar);
        }
    }
    
    public void addJar(Jar jar) {
        super.addURL(getURL(jar));
    }
    
    public Jar[] getJars() {
        Jar[] jars = new Jar[getURLs().length];
        int n = 0;
        for (URL url : getURLs()) {
            try {
                jars[n++] = new Jar(url);
            } catch (MalformedURLException ex) {
                Logger.getLogger(JarClassLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return jars;
    }
    
    protected URL getURL(Jar jar) {
        try {
            return jar.getFile().toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(JarClassLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void reloadJars() {
        Jar[] jars = getJars();
        ClassLoader cl = new JarClassLoader(jars); 
    }
    
    public void reloadJar(Jar jar) {
        ClassLoader cl = new JarClassLoader(jar);
        ClassLoading.classLoader.add(cl);
    }
}
