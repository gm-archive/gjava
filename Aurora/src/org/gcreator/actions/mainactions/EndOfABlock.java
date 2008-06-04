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
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class EndOfABlock extends ActionPattern{
    
     private static ImageIcon icon = new ImageIcon(EndOfABlock.class.getResource("/org/gcreator/actions/images/End_Block.png"));
     
    public EndOfABlock(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return LangSupporter.activeLang.getEntry(220);
    }
    
     
    @Override
    public String generateGCL(JComponent panel){
        return "}\n";
    }

    @Override
    public void setStandardImage(ImageIcon icon){
        EndOfABlock.icon = icon;
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
