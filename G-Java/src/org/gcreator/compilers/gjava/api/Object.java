

package org.gcreator.compilers.gjava.api;
//import org.gcreator.compilers.gjava.api.lang.*;

import java.util.Hashtable;



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
        variables.put(name.toString(), value);
        
    }
    
    public void setVariable(java.lang.String name, Object value)
    {
        variables.put(name, value);
        
    }
    
    public Object getVariable(String name)
    {
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
