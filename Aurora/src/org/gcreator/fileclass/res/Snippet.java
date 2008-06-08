/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author Luís
 */
public class Snippet implements Resource{
    
    @Override
    public Object clone(){
        Snippet s = new Snippet();
        
        return s;
    }
}
