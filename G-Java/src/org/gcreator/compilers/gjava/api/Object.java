/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.api.lang.String;

/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Object {

    public boolean isInstanceOf(Object obj)
    {
        return (obj instanceof Object);
    }
    
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    
    public String getType() {
        return (String) super.toString();
    }
    
    

   
}
