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

    public static Hashtable<String, Color> colors;

    public static void load() {
        File f = new File("settings/scripttheme");
        if (!f.exists()) {
            colors = new Hashtable<String, Color>();
        } else {
            colors = new Hashtable<String, Color>();
            try {
                System.out.println("Reading");
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
                    if(s.equals(""))
                        continue;
                    if(s.equals("</theme>"))
                        break;
                    String id = s.replaceAll(
                            "<color id=\"([a-zA-Z_0-9]+)\">[0-9]+</color>", "$1");
                    System.out.println("id="+id);
                    String val = s.replaceAll(
                            "<color id=\"[a-zA-Z_0-9]+\">([0-9]+)</color>", "$1");
                    System.out.println("val="+val);
                    int rgb = Integer.parseInt(val);
                    colors.put(id, new Color(rgb));
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        if(colors.isEmpty()){
            colors.put("keyword", Color.blue);
            colors.put("comment", Color.green.darker());
            colors.put("string", Color.red);
        }
    }

    public static void save() {
        File f = new File("settings/scripttheme");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter os = new FileWriter(f);
            BufferedWriter out = new BufferedWriter(os);

            out.write("<?xml version = \"1.0\"?>\n");
            out.write("<theme>\n");
            Enumeration<String> e = colors.keys();
            while (e.hasMoreElements()) {
                String s = e.nextElement();
                out.write("<color id=\"" + s + "\">");
                int i = 0;
                i = colors.get(s).getRed();
                i *= 256;
                i += colors.get(s).getGreen();
                i *= 256;
                i += colors.get(s).getBlue();
                out.write(((Integer) i).toString());
                out.write("</color>\n");
            }
            out.write("</theme>\n");

            out.close();
        } catch (IOException e) {
        }
    }
}
