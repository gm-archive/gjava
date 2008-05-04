/*
 * GImage.java
 * 
 * Created on 13-Sep-2007, 07:50:32
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.awt.Color;
import java.util.*;
import javax.swing.*;

/**
 * 
 * @author Serge Humphrey
 */
public class GImage extends Resource {

    static final long serialVersionUID = 1L;
    public ImageIcon image;
    public int width,height;
    public boolean transparent;
    public Color transparentColor;  
    
    public GImage(String name) {
        this.name = name;
        image = null;
    }
        
    public ImageIcon getImage() {
        return image;
    }
    
    public String writeXml() {
      String xml = "";
      xml += "<?xml version=\"1.0\"?>\n";
      xml += "<gimage>\n";
      xml += "<transparent>"+transparent+"</transparent>\n";
      xml += "<color>"+transparentColor.getRed()+", "+transparentColor.getGreen()+", "+transparentColor.getBlue()+"</color>\n";
      xml += "</gimage>\n";
      return xml;
    }

     
    public void readXml(String xml){     
        String[] lines = xml.split("\n");
        String line;
        if(!lines[0].matches("<\\?xml version=\"1\\.0\"\\?>"))
            return;
        if(!lines[1].matches("<gimage>"))
            return;
        if(lines.length < 3)
            return;
        int i = 3;
        while(i < lines.length) {
            line = lines[i];
            System.out.println(line);
            if(line == null || line.equals(""))
                continue;
            if(line.equals("</gimage>")){
                break;
            }
            
            if (line.matches("<transparent>(true|false)</transparent>")) {
                String trans = line.replaceAll("<transparent>(true|false)</transparent>", "$1");
                transparent = Boolean.parseBoolean(trans);
            }
            else if (line.matches("<color>[0-9]*, [0-9]*, [0-9]</color>")) {
                String sred = line.replaceAll("<color>([0-9]*), [0-9]*, [0-9]*</color>", "$1");
                String sgreen = line.replaceAll("<color>[0-9]*, ([0-9]*), [0-9]*</color>", "$1");
                String sblue = line.replaceAll("<color>[0-9]*, [0-9]*, ([0-9]*)</color>", "$1");
                int red = Integer.parseInt(sred);
                int green = Integer.parseInt(sgreen);
                int blue = Integer.parseInt(sblue);
                transparentColor = new Color(red, green, blue);
            }
            i++;
        }
    }
    
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone() {
        GImage a = new GImage(name);
        a.height = height;
        a.width = width;
        a.transparent = transparent;
        a.transparentColor = transparentColor;  
        return a;
    }
}
