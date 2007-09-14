/*
 * VarsRegistry.java
 * 
 * Created on 10/Set/2007, 23:42:51
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package plugins;

/**
 *
 * @author Luís
 */

//useful to store variables.

public class VarsRegistry {
    
    private static String[] names = new String[200];
    private static Class[] vars = new Class[200];
    
    public static String[] getKeys(){
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
    
    public static boolean setVariable(String name, Object var){
        if(name==null)
            return false;
        int pos = -1;
        for(int i = 0; i < vars.length; i++)
            if(name.equals(names[i]))
                pos = i;
        if(pos!=-1){
            vars[pos] = var.getClass();
            return true;
        }
        int i;
        for(i = 0; vars[i] != null; i++)
            if(i==vars.length-1)
                return false;
        names[i] = name;
        vars[i] = var.getClass();
        return true;
    }
    
    public static Object getVariable(String name){
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
