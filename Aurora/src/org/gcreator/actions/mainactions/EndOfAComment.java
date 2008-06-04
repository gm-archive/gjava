/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import java.util.Vector;
import org.gcreator.actions.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class EndOfAComment extends ActionPattern{
    
    private static ImageIcon icon = null;//;new ImageIcon(StartOfAComment.class.getResource("/org/gcreator/actions/images/Start_Block.png"));
    public EndOfAComment(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return "End of a comment";
    }
    @Override
    public void setStandardImage(ImageIcon icon){
        EndOfAComment.icon = icon;
    }
     
    @Override
    public String generateGCL(JComponent panel){
        return "*/";
    }
    @Override
     public ImageIcon getStandardImage() {
        return icon;
    }
     
    @Override
     public boolean unindentsNext(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return true;
     }
}
