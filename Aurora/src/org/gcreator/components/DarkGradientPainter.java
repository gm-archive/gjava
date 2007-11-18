/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;

/**
 *
 * @author Luís
 */
public abstract class DarkGradientPainter{
    public static void paint(Graphics2D g, int width, int height){
        g.setPaint(new GradientPaint(new Point(0,0), Color.BLACK, new Point(width, height), Color.GRAY));
        g.fillRect(0, 0, width, height);
    }
}
