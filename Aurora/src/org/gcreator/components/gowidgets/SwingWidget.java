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
public class SwingWidget extends CoreWidget{
    private JComponent comp;
    
    public SwingWidget(JComponent c){
        comp = c;
    }
    
    public void paint(Graphics g){
    
    }
    
    public int getX(){
        return comp.getX();
    }
    
    public int getY(){
        return comp.getY();
    }
    
    public void setVisible(boolean visible){
        comp.setVisible(visible);
    }
    
    public boolean isVisible(){
        return comp.isVisible();
    }
    
    public void setX(int x){
        comp.setLocation(x, getY());
    }
    
    public void setY(int y){
        comp.setLocation(getX(), y);
    }
    
    public void setLocation(Point p){
        comp.setLocation(p);
    }
    
    public void setLocation(int x, int y){
        setX(x);
        setY(y);
    }
    
    public Point getLocation(){
        return comp.getLocation();
    }
    
    public int getHeight(){
        return comp.getHeight();
    }
    
    public int getWidth(){
        return comp.getWidth();
    }
    
    public void setWidth(int width){
        comp.setSize(width, getHeight());
    }
    
    public void setHeight(int height){
        comp.setSize(getWidth(), height);
    }
    
    public void setSize(int width, int height){
        setWidth(width);
        setHeight(height);
    }
    
    public void setSize(Dimension d){
        setSize(d);
    }
    
    public Dimension getSize(){
        return comp.getSize();
    }
}
