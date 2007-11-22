/*
 * Draw2D
 * All 2D drawing functions go here
 */

package org.gcreator.compilers.gjava.api;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import org.gcreator.compilers.gjava.core.basicgame;

    public class draw2d {

        /**
         * Clears the entire room in the given color (no alpha blending).
         * @param col Color to clear the room to
         */
        public static void clear(Color col) {
            if (basicgame.Current.graphics != null) {
                basicgame.Current.graphics.setColor(col);
                basicgame.Current.graphics.fillRect(0, 0, basicgame.Current.width, basicgame.Current.height);
            }
        }

        /**
         * Draws an ellipse to the current room.
         * @param x1 
         * @param y1 
         * @param x2 
         * @param y2 
         * @param outline Whether or not the ellipse is just an outline or is filled with the curent color
         */
        public static void ellipse(Graphics g,double x1, double y1, double x2, double y2, boolean outline) {
            if (g != null)
            if (outline) {
                g.drawOval((int) x1, (int) y1, (int) x2, (int) y2);
            } else {
                g.fillOval((int) x1, (int) y1, (int) x2, (int) y2);
            }
        }

public static void image(Graphics g,Image image,double x, double y)
{
if (g != null)
g.drawImage(image,(int)x,(int)y, null);
}

public static void text(Graphics g,String str,double x, double y)
{
if (g != null)
g.drawString(str, (int)x, (int)y);
}

public static void rectangle(Graphics g,double x1, double y1, double x2, double y2, boolean outline)
{
if (g != null)
            if (outline) {
                g.drawRect((int) x1, (int) y1, (int) x2, (int) y2);
            } else {
                g.fillRect((int) x1, (int) y1, (int) x2, (int) y2);
            }
}


public static void line(Graphics g,double x1, double y1, double x2, double y2)
{
if (g != null)
g.drawLine((int)x1, (int)y1,(int) x2,(int) y2);
}

public static void setColor(Graphics g,Color c)
{
if (g != null)
g.setColor(c);
}

public static void setColor(Graphics g,double red, double green, double blue)
{
if (g != null)
g.setColor(new Color((int)red,(int)green,(int)blue));
}

public static void setFont(Graphics g,Font f)
{
if (g != null)
g.setFont(f);
}

public static void rect3D(Graphics g,double x,double y,double width, double height, boolean raised)
{
if (g != null)
g.draw3DRect((int)x,(int)y,(int)width,(int)height, raised);

}

private void circle(Graphics g, int x, int y, int radius, boolean outline){
    if (g != null)
        if (outline)
	g.drawOval(x - radius, y - radius, radius*2, radius*2);
        else
            g.fillOval(x - radius, y - radius, radius*2, radius*2);
}


public static void roundRect(Graphics g,double x, double y, double width, double height, double arcwidth, double archeight)
{
    if (g != null)
g.drawRoundRect((int)x, (int)y, (int)width, (int)height, (int)arcwidth, (int)archeight);
}
}

