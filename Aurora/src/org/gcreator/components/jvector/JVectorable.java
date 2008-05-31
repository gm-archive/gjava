/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.jvector;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

/**        
 *
 * This interface is part of the JVector G-Creator
 * Vector Graphics Image Editor.
 *         
 * This interface allows JVector to be very flexible,
 * allowing any object (preferably a java.awt.shape)
 * to act as a vector-graphics object (e.g. an arc or 
 * rectangle).
 * It provides an easy way for the
 * JVectorWindow to communicate with the shape, without
 * having to add special casts for the particular
 * shape, making it very easy to add more shapes.
 * 
 * @author Serge Humphrey
 */
public interface JVectorable {
    /**
     * This method is called when the JVectorWindow's
     * <tt>shapePanel</tt> is repainted. It should
     * paint all of the object's content.
     */
    public void paint(Graphics g);
    
    /**
     * This method         returns all of the object's
     * points, for example, a rectangle would
     * return an array of four points, one for
     * each corner.
     * 
     * @return An array of the object's points. 
     */
    public Point[] getPoints();
    /**
     * Sets the value of a particular point
     * belonging to the shape.
     * 
     * @param index The index of the point.
     * This should be the same as the index
     * of the point from the getIndex() method.
     * 
     * @param newPoint The point to replace the
     * current at index <tt>index</tt>.
     */
    public void setPoint(int index, Point newPoint);
    /**
     * Retrives the x co-ordiante of the shape.
     * @return The x co-ordinate of the shape.
     */
    public double getX();
    /**
     * Retrives the y co-ordiante of the shape.
     * @return The y co-ordinate of the shape.
     */
    public double getY();
    /**
     * Retreives the width of the shape. 
     * @return The width of the shape.
     */
    public double getWidth();
    /**
     * Retreives the height of the shape. 
     * @return The height of the shape.
     */
    public double getHeight();
    /**
     * Returns a Component used as a GUI for
     * changing the special properties that
     * the particular shape might have. 
     * (i.e. the start and extent of an Arc2D.)
     * 
     * @return A Component to handle 
     * the special properties the 
     * shape might have.
     */
    public Component getSpecialValuesPanel();
    /**
     *  Makes sure the shape's properties
     * are valid, for example, make sure
     * their width is not smaller than zero.
     */
    public void ensureProperties();
    /**
     * Returns the largest x co-ordinate of
     * the shape.
     * @return A double of the shape's largest
     * x co-ordinate.
     */
    public double getMaximumX();
    /**
     * Returns the largest y co-ordinate of
     * the shape.
     * 
     * @return A double of the shape's largest
     * y co-ordinate.
     */
    public double getMaximumY();
    /**
     * Set's the shape's x,y location.
     * @param x The new x co-ordinate of the shape.
     * @param y The new y co-ordinate of the shape.
     */
    public void setLocation(double x, double y);
    /**
     * Sets the shape's location.
     * @param p The object's new location 
     * specified in a Point object. 
     */
    public void setLocation(Point p);
    /**
     * Sets the shape's width and height.
     * @param d A Dimension of the shape's 
     * new width and height.
     */
    public void setSize(Dimension d);
    /**
     * Sets the shape's width and height.
     * @param width The new width of the shape.
     * @param height The new height of the shape.
     */
    public void setSize(double width, double height);
    /**
     * Sets the shapes width.
     * @param width The new width of the shape.
     */
    public void setWidth(double width);
    /**
     * Sets the shape's height.
     * @param height The shape's new height.
     */
    public void setHeight(double height);
    /**
     * Retruns <tt>true</tt> if the given point
     * intersects with the shape.
     * @param p The Point to test wether or not it
     * intersects with the shape.
     * @return Wether or not the given point 
     * intersects with the shape.
     */
    public boolean intersects(Point p);
    /**
     * Returns if the given Rectangle
     * intersects with the shape.
     * @param r The Rectangle to test wether 
     * or not it intersects with the shape.
     * @return Wether or not the given Rectangle
     * intersects with the shape.
     */
    public boolean intersects(Rectangle r);
    /**
     * Retruns <tt>true</tt> if the given x, y
     * location intersects with the shape.
     * @param x The x location of the point.
     * @param y The y location of the point.
     * @return Returns wether the x,y location
     * intersects with the shape.
     */
    public boolean intersects(double x, double y);
    /**
     * Called when the shape is selected/deselected.
     * @param selected Wether the shape is selected.
     */
    public void callSelected(boolean selected);
    /**
     * Retruns a Vector&lt;JVectorLayer&gt;
     * of the shape's layers.
     * @return A Vector&lt;JVectorLayer&gt;
     * of the shape's layers.
     */
    public Vector<JVectorLayer> getLayers();
    
    /**
     * Returns wether the shape allows a negative
     * width and/or height. For example, a Rectangle
     * should never have a negative size, but a line
     * should always be permitted to have a negative size.
     * 
     * @return A boolean value indicating wether this shape
     * allows a negative size.
     */
    public boolean allowsNegativeSize();
    
    /**
     * Returns the number of the shape.
     * This number is used in the toString()
     * method and must be set manually.
     * @return The number of the shape.
     * @see setN(int n)
     */
    public int getN();
    
    /**
     * Sets the number of this shape. This
     * number is used in the toString() method.
     * @param n The new number of this shape.
     * @see getN()
     */
    public void setN(int n);
}
