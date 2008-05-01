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
    public static /* not final */ int CREATE = 1000;
    public static int DESTROY = 2000;
    public static int BEGINSTEP = 3001;
    public static int STEP = 3002;
    public static int ENDSTEP = 3003;
    public static int DRAW = 4005;
    public static int MOUSELEFTCLICKED = 5006;
    public static int MOUSELEFTPRESSED = 5007;
    public static int MOUSELEFTRELEASED = 5008;
    public static int GLOBALMOUSELEFTCLICKED = 5009;
    public static int GLOBALMOUSELEFTPRESSED = 5010;
    public static int GLOBALMOUSELEFTRELEASED = 5011;
    public static int MOUSERIGHTCLICKED = 5012;
    public static int MOUSERIGHTPRESSED = 5013;
    public static int MOUSERIGHTRELEASED = 5014;
    public static int GLOBALMOUSERIGHTCLICKED = 5015;
    public static int GLOBALMOUSERIGHTPRESSED = 5016;
    public static int GLOBALMOUSERIGHTRELEASED = 5017;
    public static int MOUSEOVER = 5018;
    public static int MOUSEOUT = 5019;
    public static int ALARM = 5020;
    public static int Keyboard = 6000;
    public static int Collision = 7000;
    public static int Keypress = 8000;
    public static int Keyrelease = 9000;
    public static int Other = 10000;
    public void eventSelected(int type);
    public void eventSelected(int type,String name);
}
