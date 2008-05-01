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
public class PreviousScene extends ActionPattern{
    
    private static ImageIcon icon = new ImageIcon(PreviousScene.class.getResource("/org/gcreator/actions/images/Previous_Scene.png"));
    public PreviousScene(){
        super();
    }
    
     
    public String getStandardText(JComponent panel){
        return LangSupporter.activeLang.getEntry(228);
    }
    public void setStandardImage(ImageIcon icon){
        PreviousScene.icon = icon;
    }
     
    public String generateGCL(JComponent panel){
        return "room_goto_previous();\n";
    }
     public ImageIcon getStandardImage() {
        return icon;
    }
     
     public boolean indents(JComponent comp, Vector<org.gcreator.actions.Action> indented, Vector<org.gcreator.actions.Action> unindented, JList list, boolean selected){
         return false;
     }
}
