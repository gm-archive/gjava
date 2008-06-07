/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Serge Humphrey
 */
public class Jar {
    private File file;
    public Jar(File f) throws FileNotFoundException {
        if (f == null) {
            throw new NullPointerException("File may not be null!");
        }
        if (!f.exists()) {
            throw new FileNotFoundException(f.getName() + " not found.");
        }
        this.file = f;
    }
    
    public Jar(URL url) throws MalformedURLException {
        try {
            this.file = new File(url.toURI());
        } catch (URISyntaxException exc) {
            throw new MalformedURLException(exc.getReason());
        }
    }
    
    public Jar(URI uri) {
        this.file = new File(uri);
    }
    
    public Jar(String s) {
        this.file = new File(s);
    }
    
    public File getFile() {
        return file;
    }
}
