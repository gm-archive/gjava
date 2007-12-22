/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class VectorListModel extends AbstractListModel{
    private Vector v;
    public VectorListModel(Vector v){
        this.v = v;
    }
    
    public Object getElementAt(int pos){
        return v.get(pos);
    }
    
    public int getSize(){
        return v.size();
    }
    
    public void setVector(Vector v){
        this.v = v;
    }
    
    public int getIndexOf(Object o){
        return v.indexOf(o);
    }
}
