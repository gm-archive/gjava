/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.plugins;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.gcreator.core.ClassLoading;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 * A list of multiple plugins
 * @author Luís Reis
 */
public class PluginList {

    public static final String PLUGLIST;

    static {
        PLUGLIST = new String("./settings/pluglist.xml");
    }
    /**
     * The plugin list
     */
    private static PluginList stdlist;
    public Vector<Plugin> plugins = new Vector<Plugin>();

    private PluginList(String location) {
        Node root = null;
        try {
            SAXParser parser = new SAXParser(new BufferedInputStream(new FileInputStream(location)));
            root = parser.getRootNode();
        } catch (SAXException ex) {
            Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (root == null) {
            System.err.println("Null root. Plugins not loaded.");
            return;
        }

        for (int i = 0; i < root.getChildrenCount(); i++) {
            try {
                Node n = root.getChildAt(i);
                Plugin p = readPlugin(n, true);
                plugins.add(p);
            } catch (SAXException ex) {
                Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static Plugin readPlugin(Node root, boolean initilizeCore) throws SAXException, IOException {
        Plugin p = new Plugin();
        Hashtable<String, Node> nodes = new Hashtable<String, Node>();
        for (int i = 0; i < root.getChildrenCount(); i++) {
            Node n = root.getChildAt(i);
            nodes.put(n.getName(), n);
        }
        if (nodes.containsKey("author")) {
            String s = nodes.get("author").getContent();
            if (s.contains("|")) {
                for (String author : s.split("\\|")) {
                    p.authors.add(author);
                }
            } else {
                p.authors.add(s);
            }
        }
        if (nodes.containsKey("name")) {
            p.name = nodes.get("name").getContent();
        }
        if (nodes.containsKey("image")) {
            p.img_loc = nodes.get("image").getContent();
            if ((new File(p.img_loc)).exists()) {
                p.image = new ImageIcon(p.img_loc);
            } else {
                p.image = new ImageIcon(PluginList.class.getResource("/org/gcreator/resources/plugin.png"));
            }
        } else {
            p.image = new ImageIcon(PluginList.class.getResource("/org/gcreator/resources/plugin.png"));
        }
        if (nodes.containsKey("core")) {
            try {
                p.coreName = nodes.get("core").getContent();
                if (initilizeCore) {
                    p.value = (PluginCore) ClassLoading.classLoader.loadClass(p.coreName).newInstance();
                }
            } catch (InstantiationException ex) {
                Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PluginList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (nodes.containsKey("update")) {
            p.update = nodes.get("update").getContent();
        }
        if (nodes.containsKey("version")) {
            p.version = nodes.get("version").getContent();
        }
        if (nodes.containsKey("jar")) {
            p.jar = new Jar(nodes.get("jar").getContent());
        }
        if (nodes.containsKey("jsfile")) {
            String t = nodes.get("jsfile").getContent();
            if (p.value == null) {
                p.value = new JSPlugin(t);
            } else {
                ((JSPlugin) p.value).append(t);
            }
        }
        return p;
    }
    
    public static PluginList getStdList() {
        if (stdlist == null) {
            stdlist = new PluginList(PLUGLIST);
        }
        return stdlist;
    }
}
