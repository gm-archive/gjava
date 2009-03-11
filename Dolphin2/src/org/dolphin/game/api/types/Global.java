package org.dolphin.game.api.types;
import java.util.Hashtable;

/**
 * This is used to store global Variables
 * @author TGMG
 */
public class Global  {
    
     public static Hashtable<java.lang.String, Object> Variables = new Hashtable<java.lang.String, Object>(10);
    
    
    public static void setVariable(String name, Object value)
    {
        Variables.put(name.toString(), (Object)value);
        
    }
    
    
    
    public static Object getVariable(String name)
    {
    	Object o = (Object)Variables.get(name.toString());
         if (o == null) return 0.0d;
        return o;
    }
    
         
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void multVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.mult(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using += with custom Variables
      */
     public static void addVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.add(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using -= with custom Variables
      */
     public static void subVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.sub(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using /= with custom Variables
      */
     public static void divVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.div(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using &= with custom Variables
      */
     public static void bandVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.band(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void borVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.bor(Variables.get(name),multValue));
     }
     
     /*
      * This function is required, for using *= with custom Variables
      */
     public static void bxorVariable(java.lang.String name, Object multValue) {
         Variables.put(name, Variable.bxor(Variables.get(name),(multValue)));
     }

}

