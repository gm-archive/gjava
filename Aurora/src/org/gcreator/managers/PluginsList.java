/*
 * SettingsIO.java
 *
 * Created on 4/Set/2007, 13:27:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import java.io.*;
import org.gcreator.exceptions.*;
import javax.swing.*;
import org.gcreator.core.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 *
 * @author Luís
 */
public class PluginsList {
    public static String[] loadPluglist() {
        File target = new File("pluglist.xml");
        if (!target.exists()) {
            return null;
        }
        String[] a = new String[50]; //Up to 50 plugins.
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc;
        try{
            builder = fact.newDocumentBuilder();
            doc = builder.parse("pluglist.xml");
            Node node = doc.getDocumentElement();
            String root = node.getNodeName();
            if(!root.equals("pluglist")){
                return null;
            }
            NodeList childs = node.getChildNodes();
            Node child;
            int id = 0;
            for(int i = 0; i < childs.getLength(); i++){
                child = childs.item(i);
                String name = child.getNodeName();
                if(!name.equals("plugin"))
                    return null;
                a[id++] = child.getTextContent(); //modified for 1.4 .getTextContent()
            }
            return a;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
