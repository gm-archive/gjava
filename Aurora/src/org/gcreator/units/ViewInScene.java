/*
 * ViewInScene.java
 * 
 * Created on 11/Set/2007, 21:39:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

/**
 *
 * @author Luís
 */
public class ViewInScene {
    public boolean visibleonstart = false;
    public int viewx = 0;
    public int viewy = 0;
    public int vieww = 640;
    public int viewh = 480;
    public int portx = 0;
    public int porty = 0;
    public int portw = 640;
    public int porth = 480;
    public fileclass.File follow = null;
    public int hbor = 32;
    public int vbor = 32;
    public int hsp = -1;
    public int vsp = -1;
    public String name;
    
    public ViewInScene(String name){
        this.name = name;
    }
    
    public String writeXml(){
        String xml = "\t\t<view>\n";
        
        xml += "\t\t\t<visible>" + (visibleonstart ? "True" : "False") + "</visible>\n";
        
        xml += "\t\t\t<scenepos>";
        xml += viewx;
        xml += ", ";
        xml += viewy;
        xml += ", ";
        xml += vieww;
        xml += ", ";
        xml += viewh;
        xml += "</inroom>\n";
        
        xml += "\t\t\t<portpos>";
        xml += portx;
        xml += ", ";
        xml += porty;
        xml += ", ";
        xml += portw;
        xml += ", ";
        xml += porth;
        xml += "</portpos>\n";
        
        xml += "\t\t</view>\n";
        
        return xml;
    }
    
    @Override
    public String toString(){
        return (visibleonstart ? "<HTML><b>" : "") + name;
    }
}
