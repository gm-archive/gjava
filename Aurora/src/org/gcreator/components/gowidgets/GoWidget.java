/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.gowidgets;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public abstract class GoWidget extends CoreWidget{
    private boolean visible = true;
    private Point location = new Point(0,0);
    private Dimension size = new Dimension(100,100);
    
    public boolean isVisible(){
        return visible;
    }
    
    public void setVisible(boolean visible){
        this.visible = visible;
    }
    
    public void setLocation(Point p){
        location = p;
    }
    
    public void setLocation(int x, int y){
        location = new Point(x,y);
    }
    
    public Point getLocation(){
        return location;
    }
    
    public int getX(){
        return location.x;
    }
    
    public int getY(){
        return location.y;
    }
    
    public void setX(int x){
        location.x = x;
    }
    
    public void setY(int y){
        location.y = y;
    }
    
    public Dimension getSize(){
        return size;
    }
    
    public void setSize(Dimension size){
        this.size = size;
    }
    
    public void setSize(int width, int height){
        size = new Dimension(width, height);
    }
    
    public int getWidth(){
        return size.width;
    }
    
    public void setWidth(int width){
        size.width = width;
    }
    
    public int getHeight(){
        return size.height;
    }
    
    public void setHeight(int height){
        size.height = height;
    }
}
