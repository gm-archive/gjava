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

/**
 *
 * @author Luís
 */
public class ActorInScene {
    public org.gcreator.fileclass.File actor;
    public int x;
    public int y;
    public double id;
    
    public ActorInScene(org.gcreator.fileclass.File actor, int x, int y,double id){
        this.actor = actor;
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public String writeXml(){
        return "<actor type=\"" + actor.getPath() + "\" x=" + x + " y=" + y + " id="+id+" />";
    }
}
