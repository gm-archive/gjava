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
public String caption = "";
public String code = "//Do nothing";
 //name is already on the list
public int width=640,height=480,speed=60,snapX=16,snapY=16;
public boolean persistant,grid = true,isometric,drawbackcolor;
public ViewsModel views;
public Vector<ActorInScene> actors;
public Color background = Color.lightGray;

public Scene(String name)
{
    this.name = name;
    actors = new Vector<ActorInScene>();
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
     <preferences>
     <snap>snapX, snapY</snap>
     <grid>Visible Isometric</grid>
     </preferences>
     <views>
     </views>
     <content>
     </content>
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
      xml += background.getRed() + ", " + background.getGreen() + ", " + background.getBlue();
      xml += "</bgcolor>\n";
      
      xml += "<fps>";
      xml += speed;
      xml += "</fps>\n";
      
      
      xml += "<preferences>\n"; //User preferences
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
      xml += "</preferences>\n";

      
      xml += "<views>\n";
      
      xml += views.writeXml();
      
      xml += "</views>\n";
       
      xml += "<content>\n";
      Object[] o = actors.toArray();
      for(Object a : o)
          if(a!=null && a instanceof ActorInScene)
              ((ActorInScene) a).writeXml();
      xml += "</content>\n";
      
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
            }
        }
    }
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    //SuppressWarnings("unchecked")
    public Resource clone(){
        Scene a = new Scene(name);
        Object obj = actors.clone();
        if(obj == null)
            a.actors = null;
        else
            a.actors = (Vector<ActorInScene>) obj;
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
