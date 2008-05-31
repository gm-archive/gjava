/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.jvector;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.io.Serializable;
import java.util.Hashtable;

/**
 *
 * @author Serge Humphrey
 */
public class JVectorLayer implements Serializable {
    public AffineTransform transform;
    public /*Paint*/Color paint = Color.black;
    public Composite composite = AlphaComposite.SrcOver;
    public Hashtable<RenderingHints.Key, Object> hints = new Hashtable<RenderingHints.Key, Object>(10);
    public Font font = Font.getFont(Font.SERIF);
    public Stroke stroke = new BasicStroke(2);
    public Color XORColor;
    public enum PaintTypes{FILLED, STROKED};
    public PaintTypes type = PaintTypes.FILLED;
    public int n;
    
    public JVectorLayer() {}
    
    // <editor-fold desc="Constructor">
    {
        /*
         * Default Values - do not modify.
         */
        hints.put(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        hints.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        hints.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_NORMALIZE);
        hints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, new Integer(150));
    }// </editor-fold>
    public JVectorLayer(/*Paint*/Color p) {
        this.paint = p;
    }
    public void paint(Graphics g, Shape s) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(paint);
        if (transform != null)
            g2.setTransform(transform);
        g2.setComposite(composite);
        g2.setRenderingHints(hints);
        g2.setFont(font);
        g2.setStroke(stroke);
        if (XORColor != null)
            g2.setXORMode(XORColor);
        if (type == PaintTypes.FILLED)
            g2.fill(s);
        else
            g2.draw(s);
    }
    
    @Override
    public String toString() {
        return "Layer "+n;
    }
}
