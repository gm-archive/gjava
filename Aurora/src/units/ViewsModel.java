/*
 * ViewsModel.java
 * 
 * Created on 11/Set/2007, 21:43:15
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package units;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public class ViewsModel extends AbstractListModel{
    public ViewInScene[] view;
    
    public ViewsModel(){
        view = new ViewInScene[8];
        view[0] = new ViewInScene(0);
        view[1] = new ViewInScene(1);
        view[2] = new ViewInScene(2);
        view[3] = new ViewInScene(3);
        view[4] = new ViewInScene(4);
        view[5] = new ViewInScene(5);
        view[6] = new ViewInScene(6);
        view[7] = new ViewInScene(7);
    }
    
    public Object getElementAt(int pos){
        return view[pos];
    }
    
    public int getSize(){
        return 8;
    }
}
