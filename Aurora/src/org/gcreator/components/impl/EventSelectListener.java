/*
 * EventSelectListener.java
 * 
 * Created on 24/Set/2007, 19:49:14
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

/**
 *
 * @author Luís
 */
public interface EventSelectListener {
    public static /* not final */ int CREATE = 0;
    public static int BEGINSTEP = 1;
    public static int STEP = 2;
    public static int ENDSTEP = 3;
    public static int DESTROY = 4;
    public static int DRAW = 5;
    public static int MOUSELEFTCLICKED = 6;
    public static int MOUSELEFTPRESSED = 7;
    public static int MOUSELEFTRELEASED = 8;
    public static int GLOBALMOUSELEFTCLICKED = 9;
    public static int GLOBALMOUSELEFTPRESSED = 10;
    public static int GLOBALMOUSELEFTRELEASED = 11;
    public static int MOUSERIGHTCLICKED = 12;
    public static int MOUSERIGHTPRESSED = 13;
    public static int MOUSERIGHTRELEASED = 14;
    public static int GLOBALMOUSERIGHTCLICKED = 15;
    public static int GLOBALMOUSERIGHTPRESSED = 16;
    public static int GLOBALMOUSERIGHTRELEASED = 17;
    public static int MOUSEOVER = 18;
    public static int MOUSEOUT = 19;
    
    public void eventSelected(int type);
}
