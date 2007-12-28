/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api.lang;

import org.gcreator.compilers.gjava.api.*;

/**
 *
 * @author TGMG
 */
public class String extends org.gcreator.compilers.gjava.api.Object{
    
   java.lang.String s="";
   
   /**
 * Returns the value of this String object as a string primitive.
 * @return
 */
public java.lang.String getPrimitive()
{
    return s;
}

    @Override
    public java.lang.String toString() {
        return s;
    }
   
   

}
