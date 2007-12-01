/*
 * TabValues.java
 * 
 * Created on 22/Set/2007, 11:18:02
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.io.Serializable;

/**
 *
 * @author Luís
 */
public class TabValues implements Serializable {
    
    static final long serialVersionUID = 1L;
    public String name;
    private String[] names;
    private Object[] vars;
    
    public TabValues(String name){
        this.name = name;
        names = new String[50];
        vars = new Object[50];
    }
    
    public String[] getKeys(){
        int a = 0;
        for(String name : names) //TODO remove for-each
            if(name!=null)
                a++;
        if(a==0)
            return null;
        String[] x = new String[a];
        a = 0;
        for(String name : names)
            if(name!=null)
                x[a++] = name;
        return x;
    }
    
    public boolean setVariable(String name, Object var){
        if(name==null)
            return false;
        int pos = -1;
        for(int i = 0; i < vars.length; i++)
            if(name.equals(names[i]))
                pos = i;
        if(pos!=-1){
            vars[pos] = var;
            return true;
        }
        int i;
        for(i = 0; vars[i] != null; i++)
            if(i==vars.length-1)
                return false;
        names[i] = name;
        vars[i] = var;
        return true;
    }
    
    public Object getValue(String name){
        if(name==null)
            return null;
        if(names==null)
            return null;
        int pos = -1;
        for(int i = 0; i < names.length; i++)
            if(name.equals(names[i]))
                pos = i;
        if(pos==-1)
            return null;
        return vars[pos];
    }
    
    public String writeXml(){
        if(names==null)
            return null;
        String xml = "";
        for(int i = 0; i < names.length; i++){
            if(names[i]!=null)
                xml += "\t\t<option>\n\t\t\t<name>" + names[i] + "</name>\n\t\t\t<value>" + vars[i].toString()
                        .replaceAll("&", "&amp;")
                        .replaceAll("<", "&lt;")
                        .replaceAll(">", "&gt;") + "</value>\n\t\t</option>\n";
        }
        return xml;
    }
}
