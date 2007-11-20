/*
 * Scene.java
 * 
 * Created on 13-Sep-2007, 07:50:04
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.awt.Color;
import org.gcreator.units.*;
import java.util.*;

/**
 *
 * @author Ali1
 */
public class Scene extends Resource {
    static final long serialVersionUID = 1L;
public String caption = "";
public String code = "//Do nothing";
 //name is already on the list
public int width=640,height=480,speed=60,snapX=16,snapY=16;
public boolean persistant,grid = true,isometric,drawbackcolor=true;
public ViewsModel views;
public Vector actors;
public Color background = Color.lightGray;

public Scene(String name)
{
    this.name = name;
    actors = new Vector();
    views = new ViewsModel();
}

public String writeXml()
  {
    /*
     
     Current format:
     
     <scene>
     <caption>if(1 &lt; 2 &amp;&amp; 3 &gt; 2){&LINEBREAK;THIS IS A CAPTION</caption>
     <code>//Do nothing</code>
     <dimensions>width, height</dimensions>
     <bgcolor>r, g, b</bgcolor>
     <fps>FPS</fps>
     <snap>snapX, snapY</snap>
     <grid>Visible Isometric</grid>
     <views>
     </views>
     </scene>
     
     */
    
      String xml = "<scene version=\"1.0\">\n";
      
      xml += "<caption>";
      
      //The caption should be allowed to have
      if(caption!=null)
        xml += caption
              .replaceAll("&", "&amp;")
              .replaceAll("<", "&lt;")
              .replaceAll(">", "&gt;")
              .replaceAll("\"", "&quot;")
              .replaceAll("'", "&apos;")
              .replaceAll("\r?\n", "&LINEBREAK;"); //This last one is just to make parsing easier.
      
      xml += "</caption>\n";
      
      xml += "<code>";
      
      //The code should be allowed to have
      if(code!=null)
        xml += code
              .replaceAll("&", "&amp;")
              .replaceAll("<", "&lt;")
              .replaceAll(">", "&gt;")
              .replaceAll("\"", "&quot;")
              .replaceAll("'", "&apos;")
              .replaceAll("\r?\n", "&LINEBREAK;"); //This last one is just to make parsing easier.
      
      xml += "</code>\n";
      
      
      xml += "<dimensions>";
      xml += width;
      xml += ", ";
      xml += height;
      xml += "</dimensions>\n";
      
      xml += "<bgcolor>";
      if(drawbackcolor)
        xml += background.getRed() + ", " + background.getGreen() + ", " + background.getBlue();
      else
        xml += "-";
      xml += "</bgcolor>\n";
      
      xml += "<fps>";
      xml += speed;
      xml += "</fps>\n";
      
      
      xml += "<snap>";
      xml += snapX;
      xml += ", ";
      xml += snapY;
      xml += "</snap>\n";
      xml += "<grid>";
      xml += grid ? "Visible" : "Hidden";
      xml += " ";
      xml += isometric ? "Isometric" : "Standard";
      xml += "</grid>\n";

      
      xml += "<views>\n";
      
      xml += views.writeXml();
      
      xml += "</views>\n";
      Object[] o = actors.toArray();
      for(Object a : o) //TODO remove for each loop
          if(a!=null && a instanceof ActorInScene)
              ((ActorInScene) a).writeXml();
      
      xml += "</scene>";
      return xml;
}

     
    public void readXml(String xml) {
        String[] str = xml.split("\n");
        if(str[0]==null||!str[0].equals("<scene version=\"1.0\">"))
            return; //Fails if erroneous scene
        String line;
        for(int i = 1; i < str.length; i++){
            line = str[i];
            System.out.println("line: " + line);
            if(line==null||line.equals(""))
                continue;
            if(line.matches("<caption>.*</caption>")){
                caption = line.replaceAll("<caption>(.*)</caption>", "$1")
                        .replaceAll("&lt;", "<")
                        .replaceAll("&gt;", ">")
                        .replaceAll("&quot;", "\"")
                        .replaceAll("&apos;", "'")
                        .replaceAll("&LINEBREAK;", "\n")
                        .replaceAll("&amp;","&");
                continue;
            }
            if(line.matches("<code>.*</code>")){
                code = line.replaceAll("<code>(.*)</code>", "$1")
                        .replaceAll("&lt;", "<")
                        .replaceAll("&gt;", ">")
                        .replaceAll("&quot;", "\"")
                        .replaceAll("&apos;", "'")
                        .replaceAll("&LINEBREAK;", "\n")
                        .replaceAll("&amp;","&");
                continue;
            }
            if(line.matches("<dimensions>[0-9]+, [0-9]+</dimensions>")){
                width = Integer.parseInt(line.replaceAll("<dimensions>([0-9]+), [0-9]+</dimensions>", "$1"));
                height = Integer.parseInt(line.replaceAll("<dimensions>[0-9]+, ([0-9]+)</dimensions>", "$1"));
                continue;
            }
            if(line.matches("<bgcolor>[0-9]+, [0-9]+, [0-9]+</bgcolor>")){
                drawbackcolor = true;
                int r = Integer.parseInt(line.replaceAll("<bgcolor>([0-9]+), [0-9]+, [0-9]+</bgcolor>", "$1"));
                int g = Integer.parseInt(line.replaceAll("<bgcolor>[0-9]+, ([0-9]+), [0-9]+</bgcolor>", "$1"));
                int b = Integer.parseInt(line.replaceAll("<bgcolor>[0-9]+, [0-9]+, ([0-9]+)</bgcolor>", "$1"));
                background = new Color(r,g,b);
                continue;
            }
            if(line.matches("<bgcolor>-</bgcolor>")){
                drawbackcolor = false;
            }
            if(line.matches("<fps>[0-9]+</fps>")){
                speed = Integer.parseInt(line.replaceAll("<fps>([0-9]+)</fps>", "$1"));
                continue;
            }
            if(line.matches("<snap>[0-9]+, [0-9]+</snap>")){
                snapX = Integer.parseInt(line.replaceAll("<snap>([0-9]+), [0-9]+</snap>", "$1"));
                snapY = Integer.parseInt(line.replaceAll("<snap>[0-9]+, ([0-9]+)</snap>", "$1"));
                continue;
            }
            if(line.matches("<grid>(Visible|Hidden) (Standard|Isometric)</grid>")){
                String x = line.replaceAll("<grid>(Visible|Hidden) (Standard|Isometric)</grid>", "$1");
                String y = line.replaceAll("<grid>(Visible|Hidden) (Standard|Isometric)</grid>", "$2");
                if(x.equals("Visible"))
                    grid = true;
                else
                    grid = false;
                if(y.equals("Standard"))
                    isometric = false;
                else
                    isometric = true;
                continue;
            }
            if(line.matches("<views>"))
                i = views.readXml(i, str);
        }
    }
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    //SuppressWarnings("unchecked")
    public Object clone(){
        Scene a = new Scene(name);
        Object obj = actors.clone();
        if(obj == null)
            a.actors = null;
        else
            a.actors = (Vector) obj;
        a.caption = caption;
        a.code = code;
        a.grid = grid;
        a.height = height;
        a.isometric = isometric;
        a.persistant = persistant;
        a.snapX = snapX;
        a.snapY = snapY;
        a.speed = speed;
        a.views = views;
        a.width = width;
        return a;
    }
}
