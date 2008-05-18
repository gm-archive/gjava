/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.managers;

import java.awt.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author luis
 */
public class ScriptThemeManager {

    private static Hashtable<String, Color> colors = new Hashtable<String, Color>();
    private static Hashtable<String, Font> fonts = new Hashtable<String, Font>();
    
    public static void load() {
        File f = new File("settings/scripttheme.xml");
        if (f.exists()) {
            try {
                FileReader r = new FileReader(f);
                BufferedReader in = new BufferedReader(r);
                String s = in.readLine();
                if(!s.equals("<?xml version = \"1.0\"?>"))
                    throw new Exception("Invalid xml version");
                s = in.readLine();
                if(!s.equals("<theme>"))
                    throw new Exception("Invalid xml type");
                while(true){
                    s = in.readLine();
                    // ';', '#', '//', "'", and '--' can be used for a comment
                    if(s.equals("") || s.matches("\\W*;.*") || s.matches("\\W*#.*") || s.matches("\\W*//.+")
                        || s.matches("\\W*'.*") || s.matches("\\W*\\-\\-.*") || s.matches("\\W*REM.*"))
                        continue;
                    if(s.equals("</theme>"))
                        break;
                    if (s.matches("\\W*<element.+")) {
                        String id = s.replaceAll("<element id=\"(\\w+)\">"+
                            "<color>[0-9]+, [0-9]+, [0-9]+</color><font size=\"[0-9]+\" "+
                            "style=\"[0-3]\">.+</font></element>","$1");

                        colors.put(id, getColor(s.replaceAll(
"<element id=\"\\w+\"><color>([0-9]+, [0-9]+, [0-9]+)</color><font size=\"[0-9]+\" style=\"[0-3]\">.+</font></element>", "$1")));
                        String q1 = s.replaceAll("<element id=\"\\w+\">"+
                            "<color>[0-9]+, [0-9]+, [0-9]+</color><font size=\"[0-9]+\" "+
                            "style=\"([0-3])\">.+</font></element>", "$1");
                        String q2 = s.replaceAll("<element id=\"\\w+\">"+
                            "<color>[0-9]+, [0-9]+, [0-9]+</color><font size=\"([0-9]+)\" "+
                            "style=\"[0-3]\">.+</font></element>", "$1");
                        int i1 = Integer.parseInt(q1);
                        int i2 = Integer.parseInt(q2);
                        fonts.put(id, new Font(s.replaceAll("<element id=\"\\w+\">"+
                            "<color>[0-9]+, [0-9]+, [0-9]+</color><font size=\"[0-9]+\" "+
                            "style=\"[0-3]\">(\\w+)</font></element>", "$1"),
                            i1,
                            i2));
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception caught: "+e.toString());
                //e.printStackTrace();
            }
        }
        if(colors.isEmpty()){
            colors.put("Keywords", Color.blue);
            colors.put("Constants", Color.blue.darker());
            colors.put("Comments", Color.green.darker());
            colors.put("Strings", Color.red);
            colors.put("Plain", Color.black);
        }
        
        if(fonts.isEmpty()){
            fonts.put("Keywords", new Font(Font.MONOSPACED, Font.PLAIN, 12));
            fonts.put("Constants", new Font(Font.MONOSPACED, Font.PLAIN, 12));
            fonts.put("Comments", new Font(Font.MONOSPACED, Font.PLAIN, 12));
            fonts.put("Strings", new Font(Font.MONOSPACED, Font.PLAIN, 12));
            fonts.put("Plain", new Font(Font.MONOSPACED, Font.PLAIN, 12));
        }
    }
    
    public static Color getColor(String rgb){
        try{
            int red = Integer.parseInt(rgb.replaceAll("([0-9]+), [0-9]+, [0-9]+", "$1"));
            int blue = Integer.parseInt(rgb.replaceAll("[0-9]+, ([0-9]+), [0-9]+", "$1"));
            int green = Integer.parseInt(rgb.replaceAll("[0-9]+, [0-9]+, ([0-9]+)", "$1"));
            return new Color(red, blue, green);
        }
        catch(Exception e){
            System.out.println(e.toString());
            return new Color(0, 0, 0);
        }
    }

    public static void save() {
        File f = new File("settings/scripttheme.xml");
        BufferedWriter out;
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter os = new FileWriter(f);
            out = new BufferedWriter(os);
            out.write("<?xml version = \"1.0\"?>\n");
            out.write("<theme>\n");
            Enumeration<String> e = colors.keys();
            while (e.hasMoreElements()) {
                String s = e.nextElement();
                if(s==null)
                    s = "null";
                Color c = colors.get(s);
                Font font = fonts.get(s);
                if(c==null)
                    c = Color.BLACK;
                if(font==null)
                    font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
                out.write("<element id=\"" + s + "\"><color>"+c.getRed()+", " +c.getGreen()+", " + c.getBlue()+ "</color><font size=\""+
                                font.getSize()+"\" style=\""+font.getStyle()+"\">"+font.getName()+"</font>");
                out.write("</element>\n");
            }
            out.write("</theme>\n");
            out.close(); 
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void reload(){
        colors.clear();
        fonts.clear();
        load();
    }
    
    public static Hashtable<String, Color> getColors(){
        return colors;
    }
    
    public static Hashtable<String, Font> getFonts(){
        return fonts;
    }
}
