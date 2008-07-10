/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import org.gcreator.units.TimelineStep;
import java.util.*;

/**
 *
 * @author luis
 */
public class Timeline implements Resource{
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
