/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dolphin.game.api.types;

import java.io.Serializable;
import java.util.Hashtable;
import org.dolphin.game.Game;

/**
 * The Integer class wraps a value of the primitive type int  in an object. 
 * In addition, this class provides several methods for converting an int to a String and a String to an int, as well as other constants and methods useful when dealing with an int.
 * @author TGMG
 */
public class Integer extends Variable implements Serializable {
private static final long serialVersionUID = 1L;

    int i;

   public Integer(int ii) {
        i = ii;
    }

    @Override
    public Variable bnegate() {
        return Game.getValueOf(~i);
        
    }

    @Override
    public Variable negate() {
        return Game.getValueOf(-i);
    }
   
   
    @Override
    public double getDouble() {
        return i;
    }

    
    
    @Override
    public Variable sub(Variable o) {
        return Game.getValueOf( (int)(i-o.getDouble()));
        
    }
    
        
    @Override
    public Variable add(Variable o) {
        return Game.getValueOf(i+ (int) (o.getDouble()));
      // return Game.getValueOf(i+ (int) (o.getDouble()));//2321
        
    }

    
   

        
     @Override
    public Variable div(Variable o) {
         if (o.getDouble() != 0)
       return Game.getValueOf(i / (int) (o.getDouble()));
         else 
             return Game.getValueOf(0);
    }
     
          
      @Override
    public Variable mult(Variable o) {
        return Game.getValueOf(i *(int) (o.getDouble()));
        
    }

    

   
    
    @Override
    public Variable band(Variable o) {
         return Game.getValueOf(i &(int) (o.getDouble()));
    }

        
     @Override
    public Variable bor(Variable o) {
        return Game.getValueOf(i |(int) (o.getDouble()));
    }

   
    
    @Override
    public Variable bxor(Variable o) {
        return Game.getValueOf(i ^(int) (o.getDouble()));
    }

    @Override
   public int getInt(){
       return i;
   }

    @Override
    public boolean getBoolean() {
        return !(i == 0);
    }

    @Override
    public Boolean gt(Variable obj) {
        return new Boolean(i>obj.getInt());
    }

    @Override
    public Boolean gte(Variable obj) {
        return new Boolean(i>=obj.getInt());
    }

    @Override
    public Boolean lt(Variable obj) {
        return new Boolean(i<obj.getInt());
    }

    public boolean lt(int obj) {
        return /*new Boolean*/(i<obj);
    }

    @Override
    public Boolean lte(Variable obj) {
        return new Boolean(i>=obj.getInt());
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
    public Boolean equals(Variable obj) {
        return new Boolean(i == (obj).getDouble());
    }

    public Variable setValue(int v){
        //this.i=v;
        return this;
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
    
    /*
	 * get the positive value of this
	 */
	public Variable positive(){
		return Game.getValueOf(+i);
	}
}
