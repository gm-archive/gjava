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
package org.gcreator.managers;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.gcreator.core.Core;
import org.gcreator.xml.Node;
import org.gcreator.xml.SAXImporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * The Settings Manager
 * This handles Registry, which is just like the
 * Windows Registry (regedit.exe) or GNOME Registry (gconf-editor),
 * but it can only hold Strings.
 * 
 * @author Serge Humphrey
 */
public class SettingsManager {

    private static Hashtable<String, String> registry;
    private static File registryFile = new File(Core.getStaticContext().getApplicationDataFolder().getPath() + File.separator + "settings.xml");

    /**
     * Don't allow instantation.  */
    private SettingsManager() {
    }

    /**
     * Loads the G-Creator settings, or creates them
     * if they do not exist or an error occurs while
     * loading them.
     */
    public static void load() {
        try {
            if (registry == null) {
                registry = new Hashtable<String, String>();
            } else {
                registry.clear();
            }

            if (!registryFile.exists()) {
                registryFile.createNewFile();
                return;
            }
            if (!registryFile.canRead()) {
                System.err.println("Registry load error: Can't read file " + registryFile);
                return;
            }
            SAXImporter im = new SAXImporter(registryFile);
            Node root = im.getDocumentRoot();
            for (Node n : root.getChildren()) {

                if (n == null || !n.hasAttribute("name")) {
                    continue;
                }

                String name = n.getAttributeValue("name");
                String value = n.getContent();

                registry.put(name, value);
            }
        } catch (SAXParseException ex) {
        } catch (IOException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Saves the Registry to an XML file.
     */
    public static void unload() {
        try {

            if (!registryFile.exists()) {
                registryFile.createNewFile();
            }
            if (!registryFile.canWrite()) {
                System.err.println("Registry load error: Can't write to file " + registryFile);
                return;
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            doc.setXmlVersion("1.0");
            doc.setXmlStandalone(true);
            Element root = doc.createElement("registry");
            Iterator<String> keys = registry.keySet().iterator();
            for (int i = 0; i < registry.size(); i++) {
                Element key = doc.createElement("key");
                String keyn = keys.next();
                key.setAttribute("name", keyn);
                key.setTextContent(registry.get(keyn));
                root.appendChild(key);
            }
            doc.appendChild(root);
            DOMSource source = new DOMSource(doc);
            Result result = new StreamResult(registryFile);
            Transformer xformer = TransformerFactory.newInstance().newTransformer();
            xformer.transform(source, result);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SettingsManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Sets the value of the given key, and creates the key if it does not exist.
     * @param key The key.
     * @param value The value for the key.
     */
    public static void set(String key, String value) {
        registry.put(key, value);
    }

    /**
     * Returns <tt>true</tt> if the given key exists.
     * @param key The key.
     * @return Wether or not the specified key exists.
     */
    public static boolean exists(String key) {
        return registry.containsKey(key);
    }

    /**
     * Deletes the key from the registry if it exists.
     * @param key The key to delete.
     * @return The value of the key that was deleted, or <tt>null</tt> if key did not already exist. 
     * (Note that if will also return <tt>null</tt> if the value of the key is <tt>null</tt>.)
     */
    public static Object delete(String key) {
        return registry.remove(key);
    }

    /**
     * Returns the value of the key (which may be <tt>null</tt>), or <tt>null</tt> if the key does not exist.
     * @param key The key to find the value for.
     * @return The value of the given key. (Or <tt>null</tt> if ot does not exist.)
     */
    public static Object get(String key) {
        return registry.get(key);
    }

    /**
     * Registers a key with a given value if it does not exist.
     * This has no effect if the key already exists.
     * @param key The key to create
     * @param value The value for the given key.
     * @return Return <tt>true</tt> if the key was created. Else returns <tt>false</tt>.
     */
    public static boolean create(String key, String value) {
        if (!exists(key)) {
            set(key, value);
            return true;
        } else {
            return false;
        }
    }
}
