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
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ViewsModel extends AbstractListModel implements Serializable{
    static final long serialVersionUID = 1L;
    public ViewInScene[] view;
    
    public ViewsModel(){
        view = new ViewInScene[8];
        view[0] = new ViewInScene("View 0");
        view[1] = new ViewInScene("View 1");
        view[2] = new ViewInScene("View 2");
        view[3] = new ViewInScene("View 3");
        view[4] = new ViewInScene("View 4");
        view[5] = new ViewInScene("View 5");
        view[6] = new ViewInScene("View 6");
        view[7] = new ViewInScene("View 7");
    }
    
    public Object getElementAt(int pos){
        return view[pos];
    }
    
    public int getSize(){
        return 8;
    }
    
    public String writeXml(){
        String xml = "";
        for(ViewInScene each : view)
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
                i = view[curview++].readXml(i, xml);
        }
        return init;
    }
}
