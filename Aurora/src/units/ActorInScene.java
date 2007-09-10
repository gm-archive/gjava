/*
 * ActorInScene.java
 * 
 * Created on 10/Set/2007, 21:58:56
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package units;

import java.awt.*;

/**
 *
 * @author Luís
 */
public class ActorInScene {
    private fileclass.File actor;
    private int x;
    private int y;
    
    public ActorInScene(fileclass.File actor, int x, int y){
        this.actor = actor;
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
}
