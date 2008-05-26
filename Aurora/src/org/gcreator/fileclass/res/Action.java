/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import java.util.*;
import org.gcreator.fileclass.GFile;
import org.gcreator.units.ActionProperty;

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
    
    public boolean indentself = false;
    public boolean indentnext = false;
    public boolean unindentself = false;
    public boolean unindentnext = false;
    
    public Vector<ActionProperty> args = new Vector<ActionProperty>();
    
    public String output = "";
    
    //public Hashtable<String, Class> table = new Hashtable<String, Class>();
    
    public Action(){
        
    }
    
    public Resource clone(){
        Action act = new Action();
        act.type = type;
        act.image = image;
        act.indentself = indentself;
        act.indentnext = indentnext;
        act.unindentself = unindentself;
        act.unindentnext = unindentnext;
        act.output = output;
        //act.table = (Hashtable<String, Class>) table.clone();
        for(ActionProperty arg : args)
            act.args.add(arg.clone());
        
        return act;
    }
}
