/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import org.gcreator.actions.ActionPattern;

/**
 *
 * @author luis
 */
public class Else extends ActionPattern{
    private static ImageIcon icon = null;//new ImageIcon(StartOfABlock.class.getResource("/org/gcreator/actions/images/Start_Block.png"));
    public Else(){
        super();
    }
    
     
    @Override
    public String getStandardText(JComponent panel){
        return "Else";
    }
    @Override
    public void setStandardImage(ImageIcon icon){
        Else.icon = icon;
    }
     
    @Override
    public String generateGCL(JComponent panel){
        return "else";
    }
    @Override
     public ImageIcon getStandardImage() {
        return icon;
    }
     
    @Override
     public boolean indents(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return false;
     }
}
