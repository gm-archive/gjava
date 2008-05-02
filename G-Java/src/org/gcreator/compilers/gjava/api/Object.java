

package org.gcreator.compilers.gjava.api;
//import org.gcreator.compilers.gjava.api.lang.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Object {

    Hashtable variables = new Hashtable(10);
    //Double G_CREATOR__repeat=new Double(0);
    
    
    public void setVariable(String name, Object value)
    {
        try {
            java.lang.String nm= ""+name;
            Method m = Variables.class.getDeclaredMethod("set"+name.charAt(nm, 0).toUpperCase()+nm.substring(1) + "", new Class[]{Object.class});
            try {
                
                    m.invoke(Variables.class.newInstance(), value);
               
                System.out.println("method invoked!");
            } catch (Exception ex) {
                System.out.println("no method"+ex);
            variables.put(name.toString(), value);
            } 
        } catch (NoSuchMethodException ex) {
            System.out.println("no method"+ex);
            variables.put(name.toString(), value);
        } catch (SecurityException ex) {
            System.out.println("security:"+ex);
            variables.put(name.toString(), value);
        }
        
        
    }
    
    public void setVariable(java.lang.String name, Object value)
    {
        
        variables.put(name, value);
        
    }
    
    public Object getVariable(String name)
    {
        try {
            java.lang.String nm= ""+name;
            Method m = Variables.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
            try {                
                  return  (Object) m.invoke(Variables.class.newInstance(), null);
               
               // System.out.println("method invoked!");
            } catch (Exception ex) {
                System.out.println("no method"+ex);
            variables.get(name.toString());
            } 
        } catch (NoSuchMethodException ex) {
            System.out.println("no method"+ex);
            variables.get(name.toString());
        } catch (SecurityException ex) {
            System.out.println("security:"+ex);
            variables.get(name.toString());
        }
        
        Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
    
     public Object getVariable(java.lang.String name)
    {
         Object o = (Object)variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
    
    /**
     * 
     * @param obj
     * @return
     */
    public boolean isInstanceOf(Object obj)
    {
        return (obj instanceof Object);
    }
    
    /**
     * 
     * @param obj
     * @return
     */
    public Boolean equals(Object obj) {
        return new Boolean(this == (obj));
    }
    
    public Boolean notequals(Object obj) {
        return new Boolean(!(super.equals(obj)));
    }
    
    public Object not()
    {
         return new Boolean(!this.getBoolean());  
    }
    
    public Object negate()
    {
          return this;
    }
    
    public Object bnegate()
    {
         return this;
    }
    
    public Boolean gt(Object obj) {
        return new Boolean(false);
    }
    
    public Boolean gte(Object obj) {
        return new Boolean(false);
    }
    
     public Boolean lt(Object obj) {
        return new Boolean(false);
    }
    
    public Boolean lte(Object obj) {
        return new Boolean(false);
    }
    
    
        
    public Object sub(Object o)
    {
        return o;
    }
    
    public Object add(Object o)
    {
        return o;
    }
    
    public Object mult(Object o)
    {
        return o;
    }
    
    /**
     * Divide
     * @param o
     * @return
     */
    public Object div(Object o)
    {
        return o;
    }
    
        public Object setsub(Object o)
    {
        return o;
    }
    
    public Object setadd(Object o)
    {
        return o;
    }
    
    public Object setmult(Object o)
    {
        return o;
    }
    
    /**
     * Set Divide
     * @param o
     * @return
     */
    public Object setdiv(Object o)
    {
        return o;
    }
    
    /**
     * Boolean and
     * @param o
     * @return
     */
    public Object and(Object o)
    {
        return o;
    }
    
    /**
     * Boolean or
     * @param o
     * @return
     */
    public Object or(Object o)
    {
        return o;
    }
    
    /**
     * Boolean xor
     * @param o
     * @return
     */
    public Object xor(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise and
     * @param o
     * @return
     */
    public Object band(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise or
     * @param o
     * @return
     */
    public Object bor(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise xor
     * @param o
     * @return
     */
    public Object bxor(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise and
     * @param o
     * @return
     */
    public Object setband(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise or
     * @param o
     * @return
     */
    public Object setbor(Object o)
    {
        return o;
    }
    
    /**
     * Bitwise xor
     * @param o
     * @return
     */
    public Object setbxor(Object o)
    {
        return o;
    }
    
    public Object mod(Object o)
    {
        return o;
    }
    
    public Object bleft(Object o)
    {
        return o;
    }
    
    public Object bright(Object o)
    {
        return o;
    }
    
    public double getDouble()
    {
        return 0;
    }
    
    public int getInt()
    {
        return (int)getDouble();
    }
    
    public float getFloat()
    {
        return 0;
    }
    
    public boolean getBoolean()
    {
        return false;
    }
    
     public org.gcreator.compilers.gjava.api.String getString()
    {
        return new org.gcreator.compilers.gjava.api.String("");
    }

    
    /**
     * 
     * @return
     */
    public java.lang.String getType() {
        return "Object";
    }
    
    

   
}
