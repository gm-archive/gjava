/*
 * SettingsValues.java
 * 
 * Created on 22/Set/2007, 11:14:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass.res;

/**
 *
 * @author Luís
 */
public class SettingsValues extends Resource{
    private String[] keys = new String[20];
    private TabValues[] tabs = new TabValues[20];
    
    public String[] getKeys(){
        int a = 0;
        for(String key : keys)
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
        return "";
    }
    
    public void readXml(String xml){}
}
