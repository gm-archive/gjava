/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import org.gcreator.fileclass.GFile;

/**
 *
 * @author luis
 */
public class Action implements Resource{
    public static final int TYPE_VOID = 0;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_IDE = 2;
    public static final int TYPE_PROPERTIES = 3;
    
    public int type = 0;
    public GFile image = null;
    
    public Action(){
        
    }
    
    public Resource clone(){
        Action act = new Action();
        act.type = type;
        act.image = image;
        
        return act;
    }
}
