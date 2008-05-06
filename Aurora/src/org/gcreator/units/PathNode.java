/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.awt.Point;
import java.text.NumberFormat;
import org.w3c.dom.NamedNodeMap;

/**
 *
 * @author bob
 */
public class PathNode extends Point {

    public PathNode(NamedNodeMap attributes) {
        x = Integer.parseInt(attributes.getNamedItem("x").getNodeValue());
        y = Integer.parseInt(attributes.getNamedItem("y").getNodeValue());
        speed = java.lang.Double.parseDouble(attributes.getNamedItem("speed").getNodeValue());
    }

    public PathNode(String string) {
        x = Integer.parseInt(string.replaceAll("<node\\w+x=\"\"\\w+y=\".+\"\\w+speed=\".+\"\\w+/>", "$1"));
        y = Integer.parseInt(string.replaceAll("<node\\w+x=\".+\"\\w+y=\"\"\\w+speed=\".+\"\\w+/>", "$1"));
        speed = java.lang.Double.parseDouble(
                    string.replaceAll("<node\\w+x=\".+\"\\w+y=\".+\"\\w+speed=\"\"\\w+/>", "$1"));
    }
    
    public PathNode(int x, int y) {
        super(x,y);
    }
    
    public PathNode() {
        super();
    }
    
    public PathNode(Point p) {
        super(p);
    }
    
    private double speed = 1;
    
    public double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        return "("+x+","+y+")"+"  sp: "+nf.format(speed);
    }
    
    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (java.lang.Double.doubleToLongBits(this.speed) ^ (java.lang.Double.doubleToLongBits(this.speed) >>> 32));
        return hash;
    }

}
