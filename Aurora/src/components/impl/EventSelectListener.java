/*
 * EventSelectListener.java
 * 
 * Created on 24/Set/2007, 19:49:14
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.impl;

/**
 *
 * @author Luís
 */
public interface EventSelectListener {
    public static int CREATE = 0;
    public static int BEGINSTEP = 1;
    public static int STEP = 2;
    public static int ENDSTEP = 3;
    
    public void eventSelected(int type);
}
