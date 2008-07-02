/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.components;

import java.util.Vector;

/**
 *
 * @author Luís
 */
public class ArgumentList {
    public Vector<String> arguments = new Vector<String>();
    
    @Override
    public String toString(){
        String res = "";
        String last = arguments.lastElement();
        for(String arg : arguments){
            res += arg;
            if(!arg.equals(last))
                res += ", ";
        }
        return res;
    }
}
