/*
 * instance.java
 *
 * Created on 15 April 2007, 23:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.JGM.roomeditor;

import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author ali1
 */
public class instance {
        public int x,y;
        public String actor = "Actor";
        public ImageIcon img;
        public Rectangle r;
        public boolean locked = false;
        instance(int x,int y,String actor,ImageIcon img,boolean locked) {
            this.x =x;
            this.y = y;
            this.actor=actor;
            this.img =img;
            this.locked = locked;
            this.r = new Rectangle(x,y,img.getImage().getWidth(null),img.getImage().getHeight(null));
            System.out.println(""+img.getImage().getWidth(null));
        }
        
        public ImageIcon getimg() {
            return img;
        }
        
    }
    

