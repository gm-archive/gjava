package org.dolphin.game.api.types;
import java.util.Hashtable;

/**
 * This is used to store global Variables
 * @author TGMG
 */
public class Global  {
    
     public static Hashtable<java.lang.String, Object> variables = new Hashtable<java.lang.String, Object>(10);
    
    
       
    
    public static Object getVariable(String name)
    {
    	Object o = (Object)variables.get(name.toString());
         if (o == null) return 0.0d;
        return o;
    }
    
         
    /*
     * This function is required, it sets the value of Object with string name.
     */
    public static void setVariable(java.lang.String name, Object value) {
        variables.put(name, value);
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public static void multVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.mult(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using += with custom variables
     */
    public static void addVariable(java.lang.String name, Object multValue) {
        variables.put(name,Variable.add( getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using -= with custom variables
     */
    public static void subVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.sub(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using /= with custom variables
     */
    public static void divVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.div(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using &= with custom variables
     */
    public static void bandVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.band(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public static void borVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.bor(getVariable(name),multValue));
    }
    
    /*
     * This function is required, for using *= with custom variables
     */
    public static void bxorVariable(java.lang.String name, Object multValue) {
        variables.put(name, Variable.bxor(getVariable(name),multValue));
    }

}

