/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import java.util.Hashtable;

/**
 * This is used to store global variables
 * @author TGMG
 */
class Global  {
    
     static Hashtable variables = new Hashtable(10);
    //Double G_CREATOR__repeat=new Double(0);
    
    
    public static void setVariable(String name, Object value)
    {
        variables.put(name.toString(), value);
        
    }
    
    public static void setVariable(java.lang.String name, Object value)
    {
        variables.put(name, value);
        
    }
    
    public static Object getVariable(String name)
    {
        Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
    
     public static Object getVariable(java.lang.String name)
    {
         Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }

}
