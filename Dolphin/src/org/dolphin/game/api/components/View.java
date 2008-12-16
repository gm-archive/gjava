/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.components;

/**
 *
 * @author Ali
 */
public class View {

    int x,y,width,height,portx,porty,portwidth,portheight;

    public View(int viewx,int viewy,int viewwidth,int viewheight,int portx,int porty,int portwidth,int portheight){

        x=viewx;
        y=viewy;
        width=viewwidth;
        height=viewheight;
        this.portx=portx;
        this.porty=porty;
        this.portwidth=portwidth;
        this.portheight=portheight;
    }
}
