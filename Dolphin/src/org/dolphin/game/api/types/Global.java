package org.dolphin.game.api.types;
import java.util.Hashtable;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.String;

/**
 * This is used to store global Variables
 * @author TGMG
 */
public class Global  {
    
     public static Hashtable<java.lang.String, Variable> Variables = new Hashtable<java.lang.String, Variable>(10);
    
    
    public static void setVariable(String name, Object value)
    {
        Variables.put(name.toString(), (Variable)value);
        
    }
    
    public static void setVariable(java.lang.String name, Object value)
    {
        Variables.put(name, (Variable)value);
        
    }
    
    public static Variable getVariable(String name)
    {
    	Variable o = (Variable)Variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
    
     public static Variable getVariable(java.lang.String name)
    {
         Variable o = (Variable)Variables.get(name.toString());
         if (o == null) return new Integer(0);
        return o;
    }
     
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void multVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).mult(multValue));
     }
     
     /*
      * This function is required, for using += with custom Variables
      */
     public static void addVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).add(multValue));
     }
     
     /*
      * This function is required, for using -= with custom Variables
      */
     public static void subVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).sub(multValue));
     }
     
     /*
      * This function is required, for using /= with custom Variables
      */
     public static void divVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).div(multValue));
     }
     
     /*
      * This function is required, for using &= with custom Variables
      */
     public static void bandVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).band(multValue));
     }
     
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void borVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).bor(multValue));
     }
     
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void bxorVariable(java.lang.String name, Variable multValue) {
         Variables.put(name, Variables.get(name).bxor(multValue));
     }

}

