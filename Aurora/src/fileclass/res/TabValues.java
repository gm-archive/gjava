/*
 * TabValues.java
 * 
 * Created on 22/Set/2007, 11:18:02
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass.res;

/**
 *
 * @author Luís
 */
public class TabValues{
    public String name;
    private String[] names;
    private Object[] vars;
    
    public String[] getKeys(){
        int a = 0;
        for(String name : names)
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
        int pos = -1;
        for(int i = 0; i < names.length; i++)
            if(name.equals(names[i]))
                pos = i;
        if(pos==-1)
            return null;
        return vars[pos];
    }
}
