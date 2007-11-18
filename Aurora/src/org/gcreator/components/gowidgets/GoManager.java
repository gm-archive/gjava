/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.gowidgets;

import java.awt.*;
import java.util.*;

/**
 *
 * @author Luís
 */
public class GoManager {
    private Vector<VisualWidget> widgets = new Vector<VisualWidget>();
    
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
        Enumeration<VisualWidget> wenum = widgets.elements();
        VisualWidget vw;
        while(wenum.hasMoreElements()){
            vw = wenum.nextElement();
            if(vw.isVisible()){
                
            }
        }
    }
}
