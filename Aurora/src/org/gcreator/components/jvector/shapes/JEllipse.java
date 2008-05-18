
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.jvector.shapes;

import org.gcreator.components.jvector.*;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author bob
 */
public class JEllipse extends Ellipse2D.Double implements JVectorable, Serializable {
    private int n;
    private Vector<JVectorLayer> layers = new Vector<JVectorLayer>(2);
    
    public JEllipse(double x, double y, double w, double h) {
        super(x, y, w, h);
    }
    
    public JEllipse() {}
    
    {
        JVectorLayer v;
        v = new JVectorLayer(Color.RED);
        v.composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0F);
        layers.add(v);
    }
    /**
     * {@inheritDoc}
     */
    public void paint(Graphics g) {
        for (JVectorLayer v : layers) {
            v.paint(g, this);
        }
    }
    /**
     * {@inheritDoc}
     */
    public Point[] getPoints() {
        return new Point[] { new Point((int)getX(), (int)getY()),
           new Point((int)(getX()+getWidth()), (int)(getY()+getHeight()))};
    }
    /**
     * {@inheritDoc}
     */
    public void setPoint(int index, Point p) {
        if (index < 0 || index > 1)
            throw new IndexOutOfBoundsException("index must be within 0 and 2!");
        if (index == 0) {
            this.width -= p.x-this.x;
            this.height -= p.y-this.y;
            this.x = p.x;
            this.y = p.y;
        }
        else {
            this.width = p.x-this.x;
            this.height = p.y-this.y;
        }
        ensureProperties();
    }
    /**
     * {@inheritDoc}
     */
    public void ensureProperties() {
        double x2,y2;
        x2 = width+x;
        y2 = height+y;
        x = Math.min(x, x2);
        y = Math.min(y, y2);
        width = Math.abs(x - x2);
        height = Math.abs(y - y2);
    }
    /**
     * {@inheritDoc}
     */
    public double getMaximumX() {
        return getMaxX();
    }
    /**
     * {@inheritDoc}
     */
    public double getMaximumY() {
        return getMaxY();
    }
    /**
     * {@inheritDoc}
     */
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * {@inheritDoc}
     */
    public void setLocation(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * {@inheritDoc}
     */
    public void setSize(Dimension d) {
        width = d.width;
        height = d.height;
    }
    /**
     * {@inheritDoc}
     */
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * {@inheritDoc}
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * {@inheritDoc}
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * {@inheritDoc}
     */
    public boolean intersects(Point p) {
        return intersects(p.x, p.y, 1, 1);
    }
    /**
     * {@inheritDoc}
     */
    public boolean intersects(Rectangle r) {
        return intersects(r);
    }
    /**
     * {@inheritDoc}
     */
    public boolean intersects(double x, double y) {
        return intersects(x, y, 1, 1);
    }
    /**
     * 
     * {@inheritDoc}
     */
    public Component getSpecialValuesPanel() {
        return null;
    }
    /**
     * {@inheritDoc}
     */
    public void callSelected(boolean selected) {
    }
    /**
     * {@inheritDoc}
     */
    public Vector<JVectorLayer> getLayers() {
        return layers;
    }

    public boolean allowsNegativeSize() {
        return false;
    }
    
    @Override
    public String toString() {
        return new String("Ellipse "+n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
