/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.managers;

import com.sun.org.apache.xerces.internal.dom.DeferredElementImpl;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * This provides easy-to-use registry for G-Creator, similar to the Windows Registry.
 * (regedit.exe)
 * @author Serge Humphrey
 */
public final class Registry {
    private static HashMap<String, Object> registry = new HashMap<String, Object>();
    
    /* Don't allow instantation */
    private Registry() {}
    
    /**
     * Sets the value of the given key, and creates the key if it does not exist.
     * @param key The key.
     * @param value The value for the key.
     */
    public static void set(String key, Object value) {
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
    public static boolean create(String key, Object value) {
        if (!exists(key)) {
            set(key, value);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Reads the registry from a file.
     * @param xmlFile The file to read from.
     * @throws java.io.IOException - If an IOException occurs.
     */
    public static void readXML(File xmlFile) throws IOException {
        File objFile = new File(xmlFile.getParent()+"/registry-objects.xml");
        if (!xmlFile.exists() || !objFile.exists()) {
            throw new FileNotFoundException(((!xmlFile.exists()) ? xmlFile.getAbsolutePath() : "")+
                    ((!objFile.exists()) ? ((!xmlFile.exists()) ? " and " : "")+objFile.getAbsolutePath() : ""));
        }
        
        Document doc = getDocument(xmlFile.toURI().toString());
        if (doc == null) {
            return;
        }
        XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(objFile)));
        LinkedList<Object> objects = new LinkedList<Object>();
        try {
            while (true) {
                objects.add(d.readObject());
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            //Wait for exception to close loop
        } finally {
            d.close();
        }
        Element elem = doc.getDocumentElement();
        NodeList nl = elem.getElementsByTagName("key");
        for (int i = 0; i < nl.getLength(); i++) {
            DeferredElementImpl node = (DeferredElementImpl) nl.item(i);
            String key = node.getAttribute("name");
            registry.put(key, objects.get(i));
        }
    }
    
    /**
     * Writes the registry to a file.
     * @param xmlFile The file to write to.
     * @throws java.io.IOException - If an IOException occurs.
     */
    public static void writeXML(File xmlFile) throws IOException {
        try {
            if (!xmlFile.exists()) {
                xmlFile.createNewFile();
            }
            Document doc = newDocument();
            if (doc == null) {
                return;
            }
            
            File objFile = new File(xmlFile.getParent()+"/registry-objects.xml");
            if (!objFile.exists()) {
                objFile.createNewFile();
            }
            
            XMLEncoder en = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(objFile)));
            doc.setXmlVersion("1.0");
            doc.setXmlStandalone(true);
            Element reg = doc.createElement("registry");
            Iterator<String> keys = registry.keySet().iterator();
            for (int i = 0; i < registry.size(); i++) {
                Element key = doc.createElement("key");
                String keyn = keys.next();
                key.setAttribute("name", keyn);
                reg.appendChild(key);
                en.writeObject(registry.get(keyn));
            }
            doc.appendChild(reg);
            en.close();
            Source source = new DOMSource(doc);
            Result result = new StreamResult(xmlFile);
            Transformer xformer = TransformerFactory.newInstance().newTransformer();
            xformer.transform(source, result);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    private static Document getDocument(String name) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(name);
        } catch (SAXException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static Document newDocument() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.newDocument();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}