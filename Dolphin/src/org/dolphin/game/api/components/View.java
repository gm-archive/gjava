/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.components;

import java.io.Serializable;

/**
 *
 * @author Ali
 */
public class View implements Serializable {
private static final long serialVersionUID = 1L;

    int x,y,width,height,portx,porty,portwidth,portheight;
    boolean visible;

    public View(int viewx,int viewy,int viewwidth,int viewheight,int portx,int porty,int portwidth,int portheight,int hspeed,int vspeed,int hbor,int vbor,boolean visible){

        x=viewx;
        y=viewy;
        width=viewwidth;
        height=viewheight;
        this.portx=portx;
        this.porty=porty;
        this.portwidth=portwidth;
        this.portheight=portheight;
        this.visible=visible;
    }
}
