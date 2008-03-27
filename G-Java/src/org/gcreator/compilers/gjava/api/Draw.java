/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.api;

import org.gcreator.compilers.gjava.Game;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

/**
 *
 * @author TGMG
 */
public class Draw extends Draw2d {

    /**
     * Draws an ellipse to the current scene.
     * @param x1 
     * @param y1 
     * @param x2 
     * @param y2 
     * @param outline Whether or not the ellipse is just an outline or is filled with the curent color
     */
    public static void ellipse(double x1, double y1, double x2, double y2, boolean outline) {
        if (g != null) {
            //Game.Current.getCanvas().getGraphics().setColor(new Color(1,2,4));
            if (outline) {
                Game.Current.getCanvas().getGraphics().drawOval((int) x1, (int) y1, (int) x2, (int) y2);
            } else {
                Game.Current.getCanvas().getGraphics().fillOval((int) x1, (int) y1, (int) x2, (int) y2);
            }
        }
    }
    
}
