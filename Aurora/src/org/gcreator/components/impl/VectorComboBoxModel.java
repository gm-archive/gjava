/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author luis
 */
public class VectorComboBoxModel extends VectorListModel implements ComboBoxModel{
    private int selindex = -1;
    public VectorComboBoxModel(Vector v){
        super(v);
    }
    public Object getSelectedItem(){
        if(selindex<0||selindex>=getSize())
            return null;
        return getElementAt(selindex);
    }
    public void setSelectedItem(Object o){
        selindex = getIndexOf(o);
    }
}
