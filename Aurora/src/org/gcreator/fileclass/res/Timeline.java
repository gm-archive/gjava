/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

import org.gcreator.units.TimelineStep;
import java.util.*;

/**
 *
 * @author luis
 */
public class Timeline extends Resource{
    static final long serialVersionUID = 1L;
    public Vector<TimelineStep> steps = new Vector<TimelineStep>();
    
    /**@deprecated*/
    public Timeline(String name){
        //this.name = name;
        this();
    }
    
    public Timeline(){
        
    }
    
    public Object clone(){
        Timeline a = new Timeline(/*name*/);
        return a;
    }
    
    public String exportToHtml(boolean xhtml){
        return "";
    }
}
