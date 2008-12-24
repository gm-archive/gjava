/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dolphin.game.api.types;

import org.dolphin.game.Game;

/**
 * The Double class wraps a value of the primitive type double in an object.
 * In addition, this class provides several methods for converting a double to a String and a String to a double, as well as other constants and methods useful when dealing with a double.
 * @author TGMG
 */
public class Double extends Variable {

    double i;

    public Double(double ii) {
        i = ii;
        
    }

    @Override
    public Boolean gt(Variable obj) {
        if(i>obj.getDouble()) return Boolean.TRUE;
        else return Boolean.FALSE;
        
    }

    @Override
    public Boolean gte(Variable obj) {
        if(i>=obj.getDouble()) return Boolean.TRUE;
        else return Boolean.FALSE;
    }

    @Override
    public Boolean lt(Variable obj) {
        if(i<obj.getDouble()) return Boolean.TRUE;
        else return Boolean.FALSE;
    }

    @Override
    public Boolean lte(Variable obj) {
        if(i>=obj.getDouble()) return Boolean.TRUE;
        else return Boolean.FALSE;
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
    public Variable sub(Variable o) {
        return Game.getValueOf(i-= o.getDouble());
    }

    @Override
    public Variable add(Variable o) {
        return Game.getValueOf(i+= o.getDouble());
    }
    
    

    @Override
    public Variable band(Variable o) {
        int ii = (int)i;
        ii &= (int) (o.getDouble());
        return Game.getValueOf(i = ii);
        
    }

    @Override
    public Variable bor(Variable o) {
        int ii = (int)i;
        ii |= (int)(o.getDouble());
        return Game.getValueOf(i = ii);
       
    }

    @Override
    public Variable bxor(Variable o) {
        int ii = (int)i;
        ii ^= (int) (o.getDouble());
        return Game.getValueOf(i = ii);
    }

    @Override
    public Variable div(Variable o) {
        return Game.getValueOf(i /= (o.getDouble()));
        
    }

    @Override
    public Variable mult(Variable o) {
        return Game.getValueOf(i *=  (o.getDouble()));
    }

    @Override
    public boolean getBoolean() {
        return !(i == 0);
    }

    @Override
    public Boolean equals(Variable obj) {
        return new Boolean(i == (obj).getDouble());
    }
    
           
    @Override
    public int compareTo(java.lang.Object o)
    {
        if ((o instanceof Double) || (o instanceof Integer))
        {
            if (getDouble() < ((Variable)o).getDouble())
                return -1;
            else if (getDouble() > ((Variable)o).getDouble())
                return 1;
            else
                return 0;
        }
        else
            return super.compareTo(o);  //No order - go by toString
    }
    
}
