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
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class Else extends ActionPattern{
    private static ImageIcon icon = null;//new ImageIcon(StartOfABlock.class.getResource("/org/gcreator/actions/images/Start_Block.png"));
    public Else(){
        super();
    }
    
     
    public String getStandardText(JComponent panel){
        return "Else";
    }
    public void setStandardImage(ImageIcon icon){
        Else.icon = icon;
    }
     
    public String generateGCL(JComponent panel){
        return "else";
    }
     public ImageIcon getStandardImage() {
        return icon;
    }
     
     public boolean indents(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return false;
     }
}
