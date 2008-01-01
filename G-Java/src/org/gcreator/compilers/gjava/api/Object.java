

package org.gcreator.compilers.gjava.api;
import org.gcreator.compilers.gjava.api.lang.*;


/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Object {

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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    public boolean notequals(Object obj) {
        return !(super.equals(obj));
    }
    
    public boolean gt(Object obj) {
        return false;
    }
    
    public boolean gte(Object obj) {
        return false;
    }
    
     public boolean lt(Object obj) {
        return false;
    }
    
    public boolean lte(Object obj) {
        return false;
    }
    
    public double getDouble()
    {
        return 0;
    }
    
     public org.gcreator.compilers.gjava.api.lang.String getString()
    {
        return new org.gcreator.compilers.gjava.api.lang.String("");
    }

    
    /**
     * 
     * @return
     */
    public java.lang.String getType() {
        return "Object";
    }
    
    

   
}
