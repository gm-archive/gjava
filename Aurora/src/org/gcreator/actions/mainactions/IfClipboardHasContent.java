/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import org.gcreator.actions.components.*;
import javax.swing.*;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author luis
 */
public class IfClipboardHasContent extends ActionPattern{
    public static ImageIcon img = null;
    public IfClipboardHasContent(){
        super();
    }
    
    public void setStandardImage(ImageIcon img){
        IfClipboardHasContent.img = img;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        YesOrNoIfPanel panel = new YesOrNoIfPanel();
        return panel;
    }
    
    public String getStandardText(JComponent panel){
        if(panel==null||!(panel instanceof YesOrNoIfPanel)||!((YesOrNoIfPanel) panel).NotCheckbox.isSelected())
            return LangSupporter.activeLang.getEntry(230);
        return LangSupporter.activeLang.getEntry(231);
    }
    
    public String generateGCL(JComponent panel){
        if(panel==null||!(panel instanceof YesOrNoIfPanel)||!((YesOrNoIfPanel) panel).NotCheckbox.isSelected())
            return "if(Clipboard.hasText())\n";
        return "if(!Clipboard.hasText())\n";
    }
}
