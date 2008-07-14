/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api;

/**
 * The Integer class wraps a value of the primitive type int  in an object. 
 * In addition, this class provides several methods for converting an int to a String and a String to an int, as well as other constants and methods useful when dealing with an int.
 * @author TGMG
 */
public class Integer extends org.gcreator.compilers.gjava.api.Object {

    int i;

   public Integer(int ii) {
        i = ii;
    }

    @Override
    public Object bnegate() {
        return new Integer(~i);
        
    }

    @Override
    public Object negate() {
        return new Integer(-i);
    }
   
   
    @Override
    public double getDouble() {
        return i;
    }

    @Override
    public Object setsub(Object o) {
        i-= (int) (o.getDouble());
        return this;
    }
    
    @Override
    public Object sub(Object o) {
        return new Integer( (int)(i-o.getDouble()));
        
    }
    
    @Override
    public Object setadd(Object o) {
         i+= (int) (o.getDouble());
         return this;
    }

    @Override
    public Object add(Object o) {
        return new Integer(i+ (int) (o.getDouble()));
    }
    
     @Override
    public Object div(Object o) {
         if (o.getDouble() != 0)
       return new Integer(i / (int) (o.getDouble()));
         else 
             return new Integer(0);
    }
     
      @Override
    public Object setdiv(Object o) {
       i /= (int) (o.getDouble());
       return this;
    }
      
      @Override
    public Object mult(Object o) {
        return new Integer(i *(int) (o.getDouble()));
        
    }

    @Override
    public Object setmult(Object o) {
        i *= (int) (o.getDouble());
        return this;
    }

    @Override
    public Object setband(Object o) {
        i &= (int) (o.getDouble());
        return this;
    }
    
    @Override
    public Object band(Object o) {
         return new Integer(i &(int) (o.getDouble()));
    }

    @Override
    public Object setbor(Object o) {
        i |= (int) (o.getDouble());
        return this;
    }
    
     @Override
    public Object bor(Object o) {
        return new Integer(i |(int) (o.getDouble()));
    }

    @Override
    public Object setbxor(Object o) {
        i ^= (int) (o.getDouble());
        return this;
    }
    
    @Override
    public Object bxor(Object o) {
        return new Integer(i ^(int) (o.getDouble()));
    }

   

    @Override
    public boolean getBoolean() {
        return !(i == 0);
    }

    @Override
    public String getString() {
        return new String(""+i);
    }

    @Override
    public java.lang.String toString() {
        return ""+i;
    }
    

    @Override
    public Boolean equals(Object obj) {
        return new Boolean(i == (obj).getDouble());
    }

    public Object setValue(int v){
        this.i=v;
        return this;
    }
    
    
}
