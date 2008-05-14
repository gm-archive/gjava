/*
 * MyModel.java
 * 
 * Created on 10/Set/2007, 17:20:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import javax.swing.*;

import org.gcreator.core.*;

/**
 *
 * @author Luís
 */
public class MyModel extends DefaultComboBoxModel{
    public MyModel(){
        super();
    }
    public Object getElementAt(int pos){
        if(gcreator.window!=null)
            return gcreator.panel.getWindowListElementAt(pos);
        return null;
    }
    public int getSize(){
        if(gcreator.window!=null)
            return gcreator.panel.getWindowListSize();
        return 0;
    }
}
