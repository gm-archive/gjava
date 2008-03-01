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
import org.gcreator.editors.ActorEditor;
import org.gcreator.actions.*;
import org.gcreator.editors.*;
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
    
     
    public String getStandardText(JComponent panel){
        return LangSupporter.activeLang.getEntry(220);
    }
    
     
    public String generateGCL(JComponent panel){
        return "}\n";
    }

    public void setStandardImage(ImageIcon icon){
        EndOfABlock.icon = icon;
    }
    
    public ImageIcon getStandardImage() {
        return icon;
    }
    
    public boolean unindentsNext(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return true;
     }
}
