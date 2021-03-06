/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.units;

import java.io.Serializable;

/**
 * @author Luís Reis
 */
public class BackgroundInScene implements Serializable{
    static final long serialVersionUID = 1L;
    
    public String name;
    public int image = -1;
    public static final int MODE_SINGLE = 0;
    public static final int MODE_REPEAT = 1;
    public static final int MODE_STRETCH = 2;
    public int hmode = MODE_SINGLE;
    public int vmode = MODE_SINGLE;
    public boolean visibleonstart = false,stretch=false;
    public double xpos=0,ypos=0,hspeed=0,vspeed=0,tileh=0,tilev=0;
    
    public BackgroundInScene(String name){
        this.name = name;
    }
    
    public String toString(){
        return visibleonstart ? "<HTML><b>"+name : name;
    }
}
