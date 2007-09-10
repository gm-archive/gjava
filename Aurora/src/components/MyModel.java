/*
 * MyModel.java
 * 
 * Created on 10/Set/2007, 17:20:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import javax.swing.*;

import core.*;

/**
 *
 * @author Luís
 */
public class MyModel extends DefaultComboBoxModel{
    public MyModel(){
        super();
    }
    public Object getElementAt(int pos){
        if(aurora.window!=null)
            return aurora.window.getWindowListElementAt(pos);
        return null;
    }
    public int getSize(){
        if(aurora.window!=null)
            return aurora.window.getWindowListSize();
        return 0;
    }
}
