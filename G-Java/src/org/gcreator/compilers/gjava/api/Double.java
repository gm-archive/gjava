/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.api;

/**
 * The Double class wraps a value of the primitive type double in an object.
 * In addition, this class provides several methods for converting a double to a String and a String to a double, as well as other constants and methods useful when dealing with a double.
 * @author TGMG
 */
public class Double extends Object {

    double i;

    public Double(double ii) {
        i = ii;
        
    }
   
    @Override
    public double getDouble() {
        return i;
    }

    @Override
    public int getInt() {
        return (int)i;
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
    public Object sub(Object o) {
        i-= o.getDouble();
        return this;
    }

    @Override
    public Object add(Object o) {
        i+= o.getDouble();
        return this;
    }
    
    public void add(double o){
        i+=o;
    }

    @Override
    public Object band(Object o) {
        int ii = (int)i;
        ii &= (int) (o.getDouble());
        i = ii;
        return this;
    }

    @Override
    public Object bor(Object o) {
        int ii = (int)i;
        ii |= (int)(o.getDouble());
        i = ii;
        return this;
    }

    @Override
    public Object bxor(Object o) {
        int ii = (int)i;
        ii ^= (int) (o.getDouble());
        i = ii;
        return this;
    }

    @Override
    public Object div(Object o) {
        i /= (o.getDouble());
        return this;
    }

    @Override
    public Object mult(Object o) {
        i *=  (o.getDouble());
        return this;
    }

    @Override
    public boolean getBoolean() {
        return !(i == 0);
    }

    @Override
    public Boolean equals(Object obj) {
        return new Boolean(i == (obj).getDouble());
    }
    
    public void setValue(double d)
    {
        i=d;
    }
        
    @Override
    public int compareTo(java.lang.Object o)
    {
        if ((o instanceof Double) || (o instanceof Integer) || (o instanceof Float))
        {
            if (getDouble() < ((Object)o).getDouble())
                return -1;
            else if (getDouble() > ((Object)o).getDouble())
                return 1;
            else
                return 0;
        }
        else
            return super.compareTo(o);  //No order - go by toString
    }
    
    @Override
    public float getFloat()
    {
        return (float)getDouble();
    }
    
}
