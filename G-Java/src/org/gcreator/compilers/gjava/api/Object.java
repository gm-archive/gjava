package org.gcreator.compilers.gjava.api;

import java.lang.reflect.Method;
import java.util.Hashtable;


/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Object implements Cloneable {

       
    
    /*
     * This method is used for more complex gcl functions, not needed yet
     */
    public void setVariable(String name, Object value)
    {}
//    {
//        try {
//            java.lang.String nm= ""+name;
//            Method m = Variables.class.getDeclaredMethod("set"+name.charAt(nm, 0).toUpperCase()+nm.substring(1) + "", new Class[]{Object.class});
//            try {
//                
//                    m.invoke(Variables.class.newInstance(), value);
//               
//                System.out.println("method invoked!");
//            } catch (Exception ex) {
//                System.out.println("no method"+ex);
//            variables.put(name.toString(), value);
//            } 
//        } catch (NoSuchMethodException ex) {
//            System.out.println("no method"+ex);
//            variables.put(name.toString(), value);
//        } catch (SecurityException ex) {
//            System.out.println("security:"+ex);
//            variables.put(name.toString(), value);
//        }
//        
//        
//    }
    
    /*
     * This function is required, it sets the value of variable with string name.
     */
    public void setVariable(java.lang.String name, Object value)
    {
//        variables.put(name, value);
    }
    
    public Object getVariable(String name)
    {return new Object();}
//    {
//        try {
//            java.lang.String nm= ""+name;
//            Method m = Variables.class.getDeclaredMethod("get"+(""+nm.charAt(0)).toUpperCase()+nm.substring(1) + "", new Class[]{});
//            try {                
//                  return  (Object) m.invoke(Variables.class.newInstance(), null);
//               
//               // System.out.println("method invoked!");
//            } catch (Exception ex) {
//                System.out.println("no method"+ex);
//            variables.get(name.toString());
//            } 
//        } catch (NoSuchMethodException ex) {
//            System.out.println("no method"+ex);
//            variables.get(name.toString());
//        } catch (SecurityException ex) {
//            System.out.println("security:"+ex);
//            variables.get(name.toString());
//        }
//        
//        Object o = (Object)variables.get(name.toString());
//         if (o == null) return new Integer(0);
//        return o;
//    }
    
    /*
     * Gets the value of the variable with string name.
     * 
     */
     public Object getVariable(java.lang.String name)
    {
         return new Object();
//         Object o = (Object)variables.get(name.toString());
//         if (o == null) return new Integer(0);
//        return o;
    }
    
    /**
     * Check if obj is inace of this Object
     * @param obj - the object to check
     * @return
     */
    public boolean isInstanceOf(Object obj)
    {
        return (obj instanceof Object);
    }
    
    /**
     * If the objects are equal
     * @param obj
     * @return
     */
    public Boolean equals(Object obj) {
        return new Boolean(this == (obj));
    }
    
    /**
     * If the value is not equal to the obj or not
     * @return
     */
    public Boolean notequals(Object obj) {
        return new Boolean(!(super.equals(obj)));
    }
    
    /**
     * Not function, turns true to false etc
     * @return
     */
    public Object not()
    {
         return new Boolean(!this.getBoolean());  
    }
    
    /**
     * negate the value of this object
     * @return
     */
    public Object negate()
    {
          return this;
    }
    
    /**
     * bnegate
     * @return
     */
    public Object bnegate()
    {
         return this;
    }
    
    /**
     * Greater than
     * @param obj - object to check
     * @return
     */
    public Boolean gt(Object obj) {
        return new Boolean(false);
    }
    
    
    /**
     * Greater than equal to
     * @param obj - object to check
     * @return
     */
    public Boolean gte(Object obj) {
        return new Boolean(false);
    }
    /**
     * less than 
     * @param obj - object to check
     * @return
     */
     public Boolean lt(Object obj) {
        return new Boolean(false);
    }
    
    /**
     * less than equal to
     * @param obj - object to check
     * @return
     */
    public Boolean lte(Object obj) {
        return new Boolean(false);
    }
    
    
    /**
     * Subtract
     * @param o - object to subtract by
     * @return
     */    
    public Object sub(Object o)
    {
        return o;
    }
    
    /**
     * Add
     * @param o - object to add
     * @return
     */
    public Object add(Object o)
    {
        return o;
    }
    
    /**
     * Multiply
     * @param o - object to multiply by
     * @return
     */
    public Object mult(Object o)
    {
        return o;
    }
    
    /**
     * Divide
     * @param o - object to divide by
     * @return
     */
    public Object div(Object o)
    {
        return o;
    }
    
    /**
     * Set Subtract (-=)
     * @param o
     * @return
     */
    public Object setsub(Object o)
    {
        return o;
    }
    
   /**
     * Set Add (+=)
     * @param o
     * @return
     */
    public Object setadd(Object o)
    {
        return o;
    }
    
    /**
     * Set Multiply (*=)
     * @param o
     * @return
     */
    public Object setmult(Object o)
    {
        return o;
    }
    
    /**
     * Set Divide (/=)
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
     * Set Bitwise and
     * @param o
     * @return
     */
    public Object setband(Object o)
    {
        return o;
    }
    
    /**
     * Set Bitwise or
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
    
    /**
     * Mod function
     * @param o
     * @return
     */
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
     * Returns the type of the object (Integer, Double etc)
     * @return
     */
    public java.lang.String getType() {
        return "Object";
    }

    @Override
    public java.lang.String toString() {
        return getType()+":"+getDouble();
    }
    
    

   
}
