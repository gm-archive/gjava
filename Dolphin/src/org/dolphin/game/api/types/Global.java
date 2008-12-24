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

}

