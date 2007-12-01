/*
 * ViewInScene.java
 * 
 * Created on 11/Set/2007, 21:39:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.Serializable;

/**
 *
 * @author Luís
 */
public class ViewInScene implements Serializable {
    static final long serialVersionUID = 1L;
    public boolean visibleonstart = false;
    public int viewx = 0;
    public int viewy = 0;
    public int vieww = 640;
    public int viewh = 480;
    public int portx = 0;
    public int porty = 0;
    public int portw = 640;
    public int porth = 480;
    public org.gcreator.fileclass.File follow = null;
    public int hbor = 32;
    public int vbor = 32;
    public int hsp = -1;
    public int vsp = -1;
    public String name;
    
    public ViewInScene(String name){
        this.name = name;
    }
    
    public String writeXml(){
        String xml = "<view>\n";
        
        xml += "<visible>" + (visibleonstart ? "True" : "False") + "</visible>\n";
        
        xml += "<scenepos>";
        xml += viewx;
        xml += ", ";
        xml += viewy;
        xml += ", ";
        xml += vieww;
        xml += ", ";
        xml += viewh;
        xml += "</scenepos>\n";
        
        xml += "<portpos>";
        xml += portx;
        xml += ", ";
        xml += porty;
        xml += ", ";
        xml += portw;
        xml += ", ";
        xml += porth;
        xml += "</portpos>\n";
        
        xml += "</view>\n";
        
        return xml;
    }
    
     
    public int readXml(int init, String[] xml){
        String line;
        for(int i = init + 1; i < xml.length; i++){
            line = xml[i];
            if(line.equals("</view>"))
                return i;
            if(line.matches("<visible>(True|False)</visible>")){
                visibleonstart = line.replaceAll("<visible>(True|False)</visible>", "$1").equals("True");
                continue;
            }
            if(line.matches("<scenepos>[0-9]+, [0-9]+, [0-9]+, [0-9]+</scenepos>")){
                viewx = Integer.parseInt(line.replaceAll("<scenepos>([0-9]+), [0-9]+, [0-9]+, [0-9]+</scenepos>", "$1"));
                viewy = Integer.parseInt(line.replaceAll("<scenepos>[0-9]+, ([0-9]+), [0-9]+, [0-9]+</scenepos>", "$1"));
                vieww = Integer.parseInt(line.replaceAll("<scenepos>[0-9]+, [0-9]+, ([0-9]+), [0-9]+</scenepos>", "$1"));
                viewh = Integer.parseInt(line.replaceAll("<scenepos>[0-9]+, [0-9]+, [0-9]+, ([0-9]+)</scenepos>", "$1"));
                continue;
            }
            if(line.matches("<portpos>[0-9]+, [0-9]+, [0-9]+, [0-9]+</portpos>")){
                portx = Integer.parseInt(line.replaceAll("<portpos>([0-9]+), [0-9]+, [0-9]+, [0-9]+</portpos>", "$1"));
                porty = Integer.parseInt(line.replaceAll("<portpos>[0-9]+, ([0-9]+), [0-9]+, [0-9]+</portpos>", "$1"));
                portw = Integer.parseInt(line.replaceAll("<portpos>[0-9]+, [0-9]+, ([0-9]+), [0-9]+</portpos>", "$1"));
                porth = Integer.parseInt(line.replaceAll("<portpos>[0-9]+, [0-9]+, [0-9]+, ([0-9]+)</portpos>", "$1"));
                continue;
            }
        }
        return init;
    }
    
    public String toString(){
        return (visibleonstart ? "<HTML><b>" : "") + name;
    }
}
