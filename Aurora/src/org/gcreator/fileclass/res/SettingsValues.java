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

/**
 *
 * @author Luís
 */
public class SettingsValues implements Resource{
    static final long serialVersionUID = 1L;
    private String[] keys = new String[20];
    private TabValues[] tabs = new TabValues[20];
    
    public String[] getKeys(){
        int a = 0;
        for(String key : keys) //TODO for each
            if(key!=null)
                a++;
        if(a==0)
            return null;
        String[] x = new String[a];
        a = 0;
        for(String key : keys)
            if(key!=null)
                x[a++] = key;
        return x;
    }
    
    public boolean setVariable(String name, TabValues var){
        if(name==null)
            return false;
        int pos = -1;
        for(int i = 0; i < tabs.length; i++)
            if(name.equals(keys[i]))
                pos = i;
        if(pos!=-1){
            tabs[pos] = var;
            return true;
        }
        int i;
        for(i = 0; tabs[i] != null; i++)
            if(i==keys.length-1)
                return false;
        keys[i] = name;
        tabs[i] = var;
        return true;
    }
    
    public TabValues getValue(String name){
        if(name==null)
            return null;
        int pos = -1;
        for(int i = 0; i < keys.length; i++)
            if(name.equals(keys[i]))
                pos = i;
        if(pos==-1)
            return null;
        return tabs[pos];
    }
    
    public String writeXml(){
        String xml = "<settings>\n";
        for(int i = 0; i < keys.length; i++){
            if(keys[i]!=null){
                xml += "\t<tab name=\"" + keys[i] + "\">\n";
                xml += tabs[i].writeXml();
                xml += "\t</tab>\n";
            }
        }
        xml += "</settings>\n";
        return xml;
    }
    
    public void readXml(String xml){}
    
     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone(){
        SettingsValues a = new SettingsValues();
        //a.keys = keys.clone();
        //a.name = name;
        //a.tabs = tabs.clone();
        return a;
    }
}
