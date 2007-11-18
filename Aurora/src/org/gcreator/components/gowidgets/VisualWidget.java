/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.gowidgets;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public interface VisualWidget{
    public void paint(Graphics g);
    public Dimension getSize();
    public void setSize(Dimension d);
    public void setSize(int width, int height);
    public void setWidth(int width);
    public void setHeight(int height);
    public int getWidth();
    public int getHeight();
    public Point getLocation();
    public void setLocation(Point p);
    public void setLocation(int x, int y);
    public int getX();
    public int getY();
    public void setX(int x);
    public void setY(int y);
    public boolean isVisible();
    public void setVisible(boolean visible);
    public boolean isIcon();
    public boolean isIconizable();
    public void setIcon(boolean icon);
    public ImageIcon getImage();
    public void setImage(ImageIcon img);
    public String getText();
    public void setText(String text);
    public boolean isClosable();
    public void setClosable(boolean closable);
    public void close();
    public int getBorderWidth();
    public void setBorderWidth(int border);
    public GoManager getGoManager();
}
