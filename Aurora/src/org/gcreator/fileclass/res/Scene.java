/*
 * Scene.java
 * 
 * Created on 13-Sep-2007, 07:50:04
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

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
public int width,height,speed,snapX,snapY;
public boolean persistant,grid,isometric;
public ViewsModel views;
public Vector<ActorInScene> actors;

public Scene(String name)
{
    this.name = name;
    actors = new Vector<ActorInScene>();
}

public String writeXml()
  {
    /*
     
     Current format:
     
     <scene>
        <caption>if(1 &lt; 2 &amp;&amp; 3 &gt; 2){&LINEBREAK;THIS IS A CAPTION</caption>
        <code>//Do nothing</code>
        <dimensions>width, height</dimensions>
        <preferences>
            <snap>snapX, snapY</snap>
            <grid>Visible Isometric</grid>
        </preferences>
     </scene>
     
     */
    
      String xml = "<scene>\n";
      
      xml += "\t<caption>";
      
      //The caption should be allowed to have 
      xml += caption
              .replaceAll("&", "&amp;")
              .replaceAll("<", "&lt;")
              .replaceAll(">", "&gt;")
              .replaceAll("\"", "&quot;")
              .replaceAll("'", "&apos;")
              .replaceAll("\r?\n", "&LINEBREAK;"); //This last one is just to make parsing easier.
      
      xml += "</caption>\n";
      
      xml += "\t<code>";
      
      //The caption should be allowed to have 
      xml += code
              .replaceAll("&", "&amp;")
              .replaceAll("<", "&lt;")
              .replaceAll(">", "&gt;")
              .replaceAll("\"", "&quot;")
              .replaceAll("'", "&apos;")
              .replaceAll("\r?\n", "&LINEBREAK;"); //This last one is just to make parsing easier.
      
      xml += "</code>\n";
      
      xml += "\t<dimensions>";
      xml += width;
      xml += ", ";
      xml += height;
      xml += "</dimensions>\n";
      
      xml += "\t<fps>";
      xml += speed;
      xml += "</fps>\n";
      
      xml += "\t<preferences>\n"; //User preferences
      xml += "\t\t<snap>";
      xml += snapX;
      xml += ", ";
      xml += snapY;
      xml += "</snap>\n";
      xml += "\t\t<grid>";
      xml += grid ? "Visible" : "Hidden";
      xml += " ";
      xml += isometric ? "Isometric" : "Standard";
      xml += "</grid>\n";
      xml += "\t</preferences>\n";
 
      xml += "\t<views>\n";
      xml += views.writeXml();
      xml += "\t</views>\n";
      
      xml += "</scene>";
      return xml;
}

    @Override
    public void readXml(String xml) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    @SuppressWarnings("unchecked")
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
