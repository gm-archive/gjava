/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.managers;

import java.io.*;
import java.util.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;

/**
 *
 * @author luis
 */
public class ToolbarManager {
    public static Vector<Toolbar> toolbars = new Vector<Toolbar>();
    public static Vector<ToolbarButton> toolbuttons = new Vector<ToolbarButton>();
    
    public static void destroyToolbars(){
        hideAll();
        gcreator.window.topContainer.removeAll();
        gcreator.window.bottomContainer.removeAll();
        gcreator.window.leftContainer.removeAll();
        gcreator.window.rightContainer.removeAll();
    }
    
    public static void hideAll(){
        Enumeration<Toolbar> e = toolbars.elements();
        while(e.hasMoreElements()){
            Toolbar t = e.nextElement();
            t.hideAll();
        }
    }
    
    public static void showAll(){
        Enumeration<Toolbar> e = toolbars.elements();
        while(e.hasMoreElements()){
            Toolbar t = e.nextElement();
            t.showAll();
        }
    }
    
    public static void makeToolbars(Aurwindow window){
        for(Toolbar toolbar : toolbars){
            toolbar.make(window);
        }
    }
    public static void makeToolbars(){
        makeToolbars(gcreator.window);
    }
    public static void remakeToolbars(){
        destroyToolbars();
        makeToolbars();
    }
    public static void parseToolbarFile(String fname) throws IOException{
        File file = new File(fname);
        if(!file.exists()||file.isDirectory())
            return;
        String o = "";
        FileReader reader = new FileReader(file);
        int i = 0;
        while((i = reader.read())!=-1){
            o += (char) i;
        }
        reader.close();
        o = o.replaceAll("\r", "");
        o = o.replaceAll(";.+?\n", "\n");
        o = o.replaceAll("\n\n", "\n");
        System.out.println(o);
        String[] os = o.split("\n");
        boolean pfile = false;
        String v = null;
        Toolbar t = null;
        boolean tvisible = false;
        boolean ivisible = false;
        for(String line : os){
            if(line.equals(""))
                continue;
            if(!pfile){
                if(line.equals("[G-Creator Toolbar List]")){
                    pfile = true;
                    continue;
                }
                else{
                    System.out.println("Not a G-Creator Toolbar List\n->" + line + "<-");
                    break;
                }
            }
            if(v==null){
                if(line.matches("^Version=[0-9]+(\\.[0-9]+)*$")){
                    String ver = line.replaceAll("^Version=([0-9]+(\\.[0-9]+)*)$", "$1");
                    if(ver.matches("1(\\.0)*"))
                        continue;
                    else{
                        System.out.println("Unsupported version " + ver + "! Currently supported version is 1.0.0");
                        break;
                    }
                }
            }
            if(t==null){
                if(line.equals("[Toolbar]")){
                    t = new Toolbar();
                    t.name = null;
                    toolbars.add(t);
                    tvisible = false;
                    ivisible = false;
                    continue;
                }
                else{
                    System.out.println("Unexpected string");
                    break;
                }
            }
            if(line.equals("[Toolbar]")){
                    t = new Toolbar();
                    t.name = null;
                    toolbars.add(t);
                    tvisible = false;
                    ivisible = false;
                    continue;
            }
            if(!line.matches("[a-zA-Z0-9_]+=[^;\\[\\]]+")){
                System.out.println("Invalid format in " + t +"\nShould be in format 'Property=Value'");
                break;
            }
            String key = line.replaceAll("([a-zA-Z0-9_]+)=[^;\\[\\]]+", "$1");
            String value = line.replaceAll("[a-zA-Z0-9_]+=([^;\\[\\]]+)", "$1");
            if(key.equals("Name")){
                t.name = value;
            }
            else if(key.equals("Position")){
                if(!value.equals("Top")&&!value.equals("Bottom")&&!value.equals("Left")&&!value.equals("Right")){
                    System.out.println("Invalid position " + value);
                    break;
                }
                if(value.equals("Top")||value.equals("Left"))
                    t.first = true;
                else
                    t.first = false;
                if(value.equals("Top")||value.equals("Bottom"))
                    t.horizontal = true;
                else
                    t.horizontal = false;
            }
            else if(key.equals("Rollover")){
                if(value.equals("True"))
                    t.rollover = true;
                else if(value.equals("False"))
                    t.rollover = false;
                else{
                    System.out.println("Invalid boolean property: " + value);
                    break;
                }
            }
            else if(key.equals("Floatable")){
                if(value.equals("True"))
                    t.floatable = true;
                else if(value.equals("False"))
                    t.floatable = false;
                else{
                    System.out.println("Invalid boolean property: " + value);
                    break;
                }
            }
            else if(key.equals("TextVisible")){
                System.out.println("TextVisible ->"+value+"<-");
                if(value.equals("True"))
                    tvisible = true;
                else if(value.equals("False"))
                    tvisible = false;
                else{
                    System.out.println("Invalid boolean property: " + value);
                    break;
                }
            }
            else if(key.equals("ImageVisible")){
                System.out.println("ImageVisible ->"+value+"<-");
                if(value.equals("True"))
                    ivisible = true;
                else if(value.equals("False"))
                    ivisible = false;
                else{
                    System.out.println("Invalid boolean property: " + value);
                    break;
                }
            }
            else if(key.equals("Item")){
                boolean found = false;
                buttonloop:
                for(ToolbarButton btn : toolbuttons){
                    if(btn.getID().equals(value)){
                        System.out.println("Identified");
                        btn.setTextVisible(tvisible);
                        System.out.println("tvisible="+tvisible+";isTextVisible="+btn.isTextVisible());
                        btn.setImageVisible(ivisible);
                        System.out.println("ivisible="+ivisible+";isImageVisible="+btn.isImageVisible());
                        t.items.add(btn);
                        found = true;
                        break buttonloop;
                    }
                }
                if(!found)
                    System.out.println("Unknown item " + value + "\nAre you missing a plugin?");
            }
            else if(key.equals("Separator")){
                t.items.add(new ToolbarSeparator());
            }
            else{
                System.out.println("Unknown property: " + key);
            }
        }
    }
    
    public static void writeToolbarFile(String fname) throws IOException{
        File file = new File(fname);
        if(file.isDirectory())
            return; //Unable to output to directory
        FileWriter writer = new FileWriter(file);
        writer.write(";Starting File\n");
        writer.write("[G-Creator Toolbar List]\n");
        writer.write(";Property=Value\n");
        writer.write("Version=1.0.0\n");
        writer.write("\n");
        for(Toolbar toolbar : toolbars){
            writer.write("[Toolbar]\n");
            if(toolbar.name!=null)
                writer.write("Name=" + toolbar.name + "\n");
            writer.write("Position=");
            writer.write((toolbar.horizontal?(toolbar.first? "Top" : "Bottom"):(toolbar.first? "Left" : "Right"))+"\n");
            writer.write("Rollover=" + (toolbar.rollover ? "True" : "False") + "\n");
            writer.write("Floatable=" + (toolbar.floatable ? "True" : "False") + "\n");
            toolbar.items.trimToSize();
            if(toolbar.items.capacity()==0)
                continue;
            Boolean curtextvisible = null;
            Boolean curimgvisible = null;
            for(ToolbarItem item : toolbar.items){
                if(item instanceof ToolbarSeparator)
                    writer.write("Separator=Standard\n");
                else{
                    ToolbarButton btn = (ToolbarButton) item;
                    if(curtextvisible==null||curtextvisible.booleanValue()!=btn.isTextVisible())
                        writer.write("TextVisible=" + ((curtextvisible = btn.isTextVisible())? "True" : "False") + "\n");
                    if(curimgvisible==null||curimgvisible.booleanValue()!=btn.isImageVisible())
                        writer.write("ImageVisible=" + ((curimgvisible = btn.isImageVisible())? "True" : "False") + "\n");
                    writer.write("Item=" + btn.getID() + "\n");
                }
            }
            writer.write("\n");
        }
        writer.close();
    }
}
