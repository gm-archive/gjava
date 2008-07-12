/*
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
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
import java.awt.geom.Line2D;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @autho Serge Humphrey
 */
public class JLine extends Line2D.Double implements JVectorable, Serializable {
    private int n;
    private Vector<JVectorLayer> layers = new Vector<JVectorLayer>(2);
    
    public JLine(double x, double y, double w, double h) {
	    super(x, y, w, h);
	}
    
    public JLine() {}
    
    {
        JVectorLayer v;
        v = new JVectorLayer(Color.BLACK);
        v.composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0F);
        v.type = JVectorLayer.PaintTypes.STROKED;
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
        return new Point[] { new Point((int)x1,(int)y1), new Point((int)x2,(int)y2)};
    }
    /**
     * {@inheritDoc}
     */
    public void setPoint(int index, Point p) {
        if (index < 0 || index > 1)
            throw new IndexOutOfBoundsException("index must be within 0 and 2!");
        if (index == 0) {
            this.x1 = p.x;
            this.y1 = p.y;
        }
        else {
            this.x2 = p.x;
            this.y2 = p.y;
        }
        ensureProperties();
    }
    /**
     * {@inheritDoc}
     */
    public void ensureProperties() {
    }
    /**
     * {@inheritDoc}
     */
    public double getMaximumX() {
        return x2;
    }
    /**
     * {@inheritDoc}
     */
    public double getMaximumY() {
        return y2;
    }
    /**
     * {@inheritDoc}
     */
    public void setLocation(double x, double y) {
        x2 += x-x1;
        y2 += y-y1;
        this.x1 = x;
        this.y1 = y;
    }
    /**
     * {@inheritDoc}
     */
    public void setLocation(Point p) {
        x2 += p.x-x1;
        y2 += p.y-y1;
        this.x1 = p.x;
        this.y1 = p.y;
    }

    /**
     * {@inheritDoc}
     */
    public void setSize(Dimension d) {
        x2 = d.width+x1;
        y2 = d.height+y1;
    }
    /**
     * {@inheritDoc}
     */
    public void setSize(double width, double height) {
        x2 = width+x1;
        y2 = height+y1;
    }
    /**
     * {@inheritDoc}
     */
    public void setWidth(double width) {
        x2 = width+x1;
    }
    /**
     * {@inheritDoc}
     */
    public void setHeight(double height) {
        y2 = height+y1;
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

    public double getX() {
        return x1;
    }

    public double getY() {
        return y1;
    }

    public double getWidth() {
        return x2-x1;
    }

    public double getHeight() {
        return y2-y1;
    }

    public boolean allowsNegativeSize() {
        return true;
    }
    
    @Override
    public String toString() {
        return new String("Line "+n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
