/*
 * ViewsModel.java
 * 
 * Created on 11/Set/2007, 21:43:15
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.Serializable;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ViewsModel extends AbstractListModel implements Serializable{
    static final long serialVersionUID = 1L;
    public Vector<ViewInScene> view;
    
    public ViewsModel(Vector<ViewInScene> view){
        this.view = view;
        if(view.size()==0){
            view.add(new ViewInScene("View 0"));
            view.add(new ViewInScene("View 1"));
            view.add(new ViewInScene("View 2"));
            view.add(new ViewInScene("View 3"));
            view.add(new ViewInScene("View 4"));
            view.add(new ViewInScene("View 5"));
            view.add(new ViewInScene("View 6"));
            view.add(new ViewInScene("View 7"));
        }
    }
    
    public Object getElementAt(int pos){
        return view.get(pos);
    }
    
    public int getSize(){
        return 8;
    }
    
    public String writeXml(){
        String xml = "";
        for(ViewInScene each : view) //TODO remove for each loop
            xml += each.writeXml();
        return xml;
    }
    
    public int readXml(int init, String[] xml){
        String line;
        int curview = 0;
        for(int i = init + 1; i < xml.length; i++){
            line = xml[i];
            if(line.equals("</views>"))
                return i;
            if(line.equals("<view>"))
                i = view.get(curview++).readXml(i, xml);
        }
        return init;
    }
}
