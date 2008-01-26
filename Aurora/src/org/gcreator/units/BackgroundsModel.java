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
public class BackgroundsModel extends AbstractListModel implements Serializable{
    static final long serialVersionUID = 1L;
    public Vector<BackgroundInScene> view;
    
    public BackgroundsModel(Vector<BackgroundInScene> view){
        this.view = view;
        if(view.size()==0){
            view.add(new BackgroundInScene("Background 0"));
            view.add(new BackgroundInScene("Background 1"));
            view.add(new BackgroundInScene("Background 2"));
            view.add(new BackgroundInScene("Background 3"));
            view.add(new BackgroundInScene("Background 4"));
            view.add(new BackgroundInScene("Background 5"));
            view.add(new BackgroundInScene("Background 6"));
            view.add(new BackgroundInScene("Background 7"));
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
        /*for(BackgroundInScene each : view) //TODO remove for each loop
            xml += each.writeXml();*/
        return xml;
    }
    
    public int readXml(int init, String[] xml){
        /*String line;
        int curview = 0;
        for(int i = init + 1; i < xml.length; i++){
            line = xml[i];
            if(line.equals("</views>"))
                return i;
            if(line.equals("<view>"))
                i = view.get(curview++).readXml(i, xml);
        }*/
        return init;
    }
}
