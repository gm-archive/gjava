package org.dolphin.game.api.types;
import java.util.Hashtable;
import org.dolphin.game.api.types.Integer;
import org.dolphin.game.api.types.String;

/**
 * This is used to store global Variables
 * @author TGMG
 */
public class Global  {
    
     static Hashtable Variables = new Hashtable(10);
    //Double G_CREATOR__repeat=new Double(0);
    
    
    public static void setVariable(String name, Object value)
    {
        Variables.put(name.toString(), value);
        
    }
    
    public static void setVariable(java.lang.String name, Object value)
    {
        Variables.put(name, value);
        
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

