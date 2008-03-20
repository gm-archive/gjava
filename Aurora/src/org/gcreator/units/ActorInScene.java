/*
 * ActorInScene.java
 * 
 * Created on 10/Set/2007, 21:58:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.awt.*;
import java.io.Serializable;

/**
 *
 * @author Luís
 */
public class ActorInScene implements Serializable {
    static final long serialVersionUID = 1L;
   // public org.gcreator.fileclass.File actor;
    public String Sactor;
    public int x;
    public int y;
    public double id;
    
    public ActorInScene(org.gcreator.fileclass.GFile actor, int x, int y,double id){
        //this.actor = actor;
        Sactor = actor.name;
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public String writeXml(){
        return "<actor type=\"" + Sactor + "\" x=" + x + " y=" + y + " id="+id+" />";
    }
}
