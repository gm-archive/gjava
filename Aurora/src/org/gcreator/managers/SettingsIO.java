/*
 * SettingsIO.java
 *
 * Created on 4/Set/2007, 13:27:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import java.awt.*;
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
public class SettingsIO {
    public static JTextPane console;

    private static void addError(int message) {
        addFormatedMessage(message, "red", true);
    }
    
    private static void addStringMessage(String message){
        addStringFormatedMessage(message, null, false);
    }

    private static void addFormatedMessage(int message, String color, boolean bold) {
        addStringFormatedMessage(LangSupporter.activeLang.getEntry(message), color, bold);
    }

    private static void addStringFormatedMessage(String message, String color, boolean bold) {
        String out = "";
        if (color != null) {
            out += "<font color='" + color + "'>";
        }
        if (bold) {
            out += "<b>";
        }
        out += message;
        if (bold) {
            out += "</b>";
        }
        if (color != null) {
            out += "</font>";
        }
        out += "<br/>";
        gcreator.output += out;
        if(gcreator.output!=null&&console!=null)
            console.setText(gcreator.output);
    }

    public static void saveSettings(int look, boolean istabs, boolean scrollvisible) {
        File a = new File("settings.xml");
        if (!a.exists()) {
            try {
                a.createNewFile();
            } catch (IOException e) {
                addError(30);
            }
        }
        try {
            FileWriter b = new FileWriter("settings.xml");
            BufferedWriter out = new BufferedWriter(b);
            out.write("<?xml version = \"1.0\"?>\n");
            out.write("<settings>");
            out.write("<style>");
            out.write(UIManager.getInstalledLookAndFeels()[look].getName());
            out.write("</style>");
            out.write("<desktop>");
            if (istabs) {
                out.write("Tabs ");
                if(Aurwindow.tabs.getTabPlacement()==JTabbedPane.TOP)
                    out.write("(Top)");
                else if(Aurwindow.tabs.getTabPlacement()==JTabbedPane.LEFT)
                    out.write("(Left)");
                else if(Aurwindow.tabs.getTabPlacement()==JTabbedPane.BOTTOM)
                    out.write("(Bottom)");
                else
                    out.write("(Right)");
            } else {
                out.write("MDI");
            }
            out.write("</desktop>");
            out.write("<console>");
            out.write(scrollvisible ? "Visible" : "Hidden");
            out.write("</console>");
            out.write("<language>");
            out.write(Aurwindow.lang);
            out.write("</language>");
            out.write("<toolbar>");
            out.write(Aurwindow.showToolbars ? "Visible" : "Hidden");
            out.write("</toolbar>");
            out.write("<tree>");
            if(gcreator.window.splitter2.getLeftComponent()==Aurwindow.treescroll){
                out.write("Left");
            }
            else if(gcreator.window.splitter2.getRightComponent()==Aurwindow.treescroll){
                out.write("Right");
            }
            else{
                addStringFormatedMessage("Invalid tree position-setting to Left", "red", false);
                out.write("Left");
            }
            out.write("</tree>");
            out.write("<size>");
            out.write(gcreator.window.getWidth() + ", " + gcreator.window.getHeight());
            out.write("</size>");
            out.write("<antialiasing>");
            out.write(""+Aurwindow.antialiasing);
            out.write("</antialiasing>");
            out.write("</settings>");
            out.close();
        } catch (IOException e) {
            addError(31);
            addStringFormatedMessage(e.getMessage(), null, false);
        }
    }

    public static String[] loadSettings() {
        File target = new File("./settings.xml");
        if (!target.exists()) {
            addStringFormatedMessage(target.getAbsolutePath() + " does not exist", null, false);
            try{
                target.createNewFile();
            }
            catch(Exception e){}
            return null;
        }
        String[] a = new String[8];
        a[0] = null;
        a[1] = null;
        a[2] = null;
        a[3] = null;
        a[4] = null;
        a[5] = null;
        a[6] = null;
        a[7] = null;
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc;
        try{
            builder = fact.newDocumentBuilder();
            doc = builder.parse("settings.xml");
            Node node = doc.getDocumentElement();
            String root = node.getNodeName();
            if(!root.equals("settings")){
                addError(33);
                return null;
            }
            NodeList childs = node.getChildNodes();
            Node child;
            for(int i = 0; i < childs.getLength(); i++){
                child = childs.item(i);
                String name = child.getNodeName();
                int id = -1;
                if(name.equals("style"))
                    id = 0;
                else if(name.equals("desktop"))
                    id = 1;
                else if(name.equals("console"))
                    id = 2;
                else if(name.equals("language"))
                    id = 3;
                else if(name.equals("toolbar"))
                    id = 4;
                else if(name.equals("tree"))
                    id = 5;
                else if(name.equals("size"))
                    id = 6;
                else if(name.equals("antialiasing"))
                    id = 7;
                
                if(id==-1){
                    addError(33);
                    addStringFormatedMessage(name, null, true);
                    return null;
                }
                if(a[id]!=null)
                    addError(34);
                a[id] = child.getTextContent(); //1.4 
            }
            if(a[0]==null||a[1]==null||a[2]==null||a[3]==null||a[4]==null||a[5]==null||a[6]==null||a[7]==null){
                addError(35);
            }
            return a;
        }
        catch(Exception e)
        {
            //the following 2 lines are out to make it run!
          //  addError(32);
           // addStringFormatedMessage(e.getMessage(), null, false);
            return null;
        }
    }
}
