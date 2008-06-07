/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.api.util;

import java.util.Vector;

/**
 *
 * @author Ali
 */
public class ApiClass {
    public String name="",doc="";
    public Vector functions = new Vector<ApiFunction>();
   // ApiFunction[] functions;
    ApiClass(String name )
    {
        this.name = name;
        //this.functions = functions;
    }

    @Override
    public String toString() {
        return name;
    }
    
    @SuppressWarnings("unchecked")
    public void add(ApiFunction af) {
      functions.add(af);  
    }
}
