/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import java.util.*;
import javax.swing.*;
import org.gcreator.fileclass.GFile;

/**
 *
 * @author Ali1
 */
public class Sprite implements Resource {
    private static final long serialVersionUID = 1;
    //public Vector<org.gcreator.fileclass.File> images;
    public Vector<GFile> Simages;
    public int width,height,originX,originY,BBLeft,BBRight,BBTop,BBBottom;
    public boolean precise = true;
    
    /**
     * @param name The name of the sprite.
     * @deprecated*/
    public Sprite(String name){
        this();
    }
    
    public Sprite(/*String name*/)
    {
        //this.name = name;
       // images = new Vector<org.gcreator.fileclass.File>();
        Simages = new Vector<GFile>();
    }

    public GImage getImageAt(int pos){
        if(pos>=Simages.size()) {
            return null;
        }
        //org.gcreator.fileclass.File a = (org.gcreator.fileclass.File)ResourceMenu.getObjectWithName(""+((org.gcreator.fileclass.File) Simages.elementAt(pos)).name,"image",gcreator.window.getCurrentProject()).object;
        org.gcreator.fileclass.GFile a = Simages.elementAt(pos);
        if(a == null) {
            return null;
        }
        return  new GImage((ImageIcon) a.value)/*.image*/;
    }
    
    public org.gcreator.fileclass.GFile getAt(int pos){
        if(pos>=Simages.size()) {
            return null;
        }
        //org.gcreator.fileclass.File a = (org.gcreator.fileclass.File)ResourceMenu.getObjectWithName(""+((org.gcreator.fileclass.File) Simages.elementAt(pos)).name,"image",gcreator.window.getCurrentProject()).object;
        org.gcreator.fileclass.GFile a = Simages.elementAt(pos);
        return a;
    }
    
    public int countImages(){
        return Simages.size();
    }
    
    public void addToList(org.gcreator.fileclass.GFile i){
        //images.add(i);
        Simages.add(i);
    }
    
    public GImage firstImage() {
        if (countImages() <= 0)
            return null;
        return getImageAt(0);
    }
    
    public GImage lastImage() {
        if (countImages() <= 0)
            return null;
        return getImageAt(countImages()-1);
    }
    
    public String writeXml() {
        String xml = "";
      xml += "<?xml version=\"1.0\"?>\n";
      xml += "<sprite>\n";
      xml += "<origin>" + originX + ", " + originY + "</origin>\n";
      xml += "<BB>" + BBLeft + ", " + BBRight + ", " + BBTop + ", " + BBBottom + "</BB>\n";
//      Enumeration<org.gcreator.fileclass.File> e = images.elements();
//      org.gcreator.fileclass.File f;
//      while(e.hasMoreElements()){
//          f = e.nextElement();
//          xml += "<image>" + f.getPath() + "</image>\n";
//      }
//      xml += "</sprite>";
      return xml;
    }

     
    public void readXml(String xml){
        String[] lines = xml.split("\n");
        String line;
        if(!lines[0].matches("<\\?xml version=\"1\\.0\"\\?>")) {
            return;
        }
        if(!lines[1].matches("<sprite>")) {
            return;
        }
        if(lines.length<2) {
            return;
        }
        int i = 2;
        while(i < lines.length){
            line = lines[i];
            System.out.println(line);
            if(line==null||line.equals("")) {
                continue;
            }
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
                BBLeft = Integer.parseInt(or1);
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
    
    @SuppressWarnings("unchecked")
    @Override
    public Object clone() {
        Sprite a = new Sprite(/*name*/);
        a.BBBottom = BBBottom;
        a.BBRight = BBRight;
        a.BBTop = BBTop;
        a.BBLeft = BBLeft;
        a.height = height;
        a.Simages = (Vector) Simages.clone();
        a.originX = originX;
        a.originY = originY;
        a.precise = precise;
        a.width = width;
        return a;
    }
}
