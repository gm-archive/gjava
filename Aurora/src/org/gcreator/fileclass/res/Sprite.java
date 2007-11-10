/*
 * Sprite.java
 * 
 * Created on 13-Sep-2007, 07:50:32
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ali1
 */
public class Sprite extends Resource {
    public Vector<org.gcreator.fileclass.File> images;
    public int width,height,originX,originY,BBleft,BBRight,BBTop,BBBottom;
    public boolean precise = true;
    
    public Sprite(String name)
    {
        this.name = name;
        images = new Vector<org.gcreator.fileclass.File>();
    }

    public ImageIcon getImageAt(int pos){
        if(pos>=images.size())
            return null;
        org.gcreator.fileclass.File a = images.elementAt(pos);
        if(a==null)
            return null;
        if(a.value instanceof ImageIcon)
            return (ImageIcon) images.elementAt(pos).value;
        return null;
    }
    
    public int countImages(){
        return images.size();
    }
    
    public void addToList(org.gcreator.fileclass.File i){
        images.add(i);
    }
    
     
    public String writeXml() {
        String xml = "";
      xml += "<?xml version=\"1.0\"?>\n";
      xml += "<sprite>\n";
      xml += "<origin>" + originX + ", " + originY + "</origin>\n";
      xml += "<BB>" + BBleft + ", " + BBRight + ", " + BBTop + ", " + BBBottom + "</BB>\n";
      Enumeration<org.gcreator.fileclass.File> e = images.elements();
      org.gcreator.fileclass.File f;
      while(e.hasMoreElements()){
          f = e.nextElement();
          xml += "<image>" + f.getPath() + "</image>\n";
      }
      xml += "</sprite>";
      return xml;
    }

     
    public void readXml(String xml){
        String[] lines = xml.split("\n");
        String line;
        if(!lines[0].matches("<\\?xml version=\"1\\.0\"\\?>"))
            return;
        if(!lines[1].matches("<sprite>"))
            return;
        if(lines.length<2)
            return;
        int i = 2;
        while(i < lines.length){
            line = lines[i];
            System.out.println(line);
            if(line==null||line.equals(""))
                continue;
            if(line.equals("</sprite>")){
                break;
            }
            if(line.matches("<origin>[0-9]*, [0-9]*</origin>")){
                String orx = line.replaceAll("<origin>([0-9]*), [0-9]*</origin>", "$1");
                String ory = line.replaceAll("<origin>[0-9]*, ([0-9]*)</origin>", "$1");
                originX = Integer.parseInt(orx);
                originY = Integer.parseInt(ory);
            }
            if(line.matches("<BB>[0-9]*, [0-9]*, [0-9]*, [0-9]*</BB>")){
                String or1 = line.replaceAll("<BB>([0-9]*), [0-9]*, [0-9]*, [0-9]*</BB>", "$1");
                String or2 = line.replaceAll("<BB>[0-9]*, ([0-9]*), [0-9]*, [0-9]*</BB>", "$1");
                String or3 = line.replaceAll("<BB>[0-9]*, [0-9]*, ([0-9]*), [0-9]*</BB>", "$1");
                String or4 = line.replaceAll("<BB>[0-9]*, [0-9]*, [0-9]*, ([0-9]*)</BB>", "$1");
                BBleft = Integer.parseInt(or1);
                BBRight = Integer.parseInt(or2);
                BBTop = Integer.parseInt(or3);
                BBBottom = Integer.parseInt(or4);
            }
            i++;
        }
    }
    
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    //SuppressWarnings("unchecked")
    public Resource clone(){
        Sprite a = new Sprite(name);
        a.BBBottom = BBBottom;
        a.BBRight = BBRight;
        a.BBTop = BBTop;
        a.BBleft = BBleft;
        a.height = height;
        a.images = (Vector<org.gcreator.fileclass.File>) images.clone();
        a.originX = originX;
        a.originY = originY;
        a.precise = precise;
        a.width = width;
        return a;
    }
}
