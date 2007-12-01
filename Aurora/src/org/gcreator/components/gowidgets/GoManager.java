/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.gowidgets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class GoManager {
    private Vector widgets = new Vector();
    
    public GoManager(){}
    
    public void addWidget(VisualWidget widget){
        widgets.add(widget);
    }
    public void removeWidget(VisualWidget widget){
        widgets.remove(widget);
    }
    public boolean hasWidget(VisualWidget widget){
        return widgets.contains(widget);
    }
    public void paint(Graphics2D g){
        Enumeration wenum = widgets.elements();
        VisualWidget vw;
        while(wenum.hasMoreElements()){
            vw = (VisualWidget) wenum.nextElement();
            if(vw.isVisible()){
                paintWidget(g, vw);
            }
        }
    }
    private void paintWidget(Graphics2D g, VisualWidget widget){
        if(widget==null)
            return;
        int w = widget.getWidth();
        int h = widget.getHeight();
        int b = widget.getBorderWidth();
        int px = widget.getX();
        int py = widget.getY();
        BufferedImage i = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        ImageIcon img = new ImageIcon(i);
        widget.paint(img.getImage().getGraphics());
        g.setColor(Colorfeel.GoWindow);
        g.fillRect(px, py, px + w + 2* b, h + 2 * b + 50);
    }
}
