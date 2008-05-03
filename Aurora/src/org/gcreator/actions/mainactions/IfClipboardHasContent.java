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
    
    static final long serialVersionUID = 1L;
    
    public boolean not = false;
    
    public static ImageIcon img = null;
    
    public IfClipboardHasContent(){
        super();
    }
    
    @Override
    public void save(JComponent panel){
        not = ((YesOrNoIfPanel) panel).NotCheckbox.isSelected();
    }
    
    @Override
    public void load(JComponent panel){
        ((YesOrNoIfPanel) panel).NotCheckbox.setSelected(not);
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
        if(panel!=null)
            save(panel);
        if(panel==null||!(panel instanceof YesOrNoIfPanel)||!((YesOrNoIfPanel) panel).NotCheckbox.isSelected())
            return LangSupporter.activeLang.getEntry(230);
        return LangSupporter.activeLang.getEntry(231);
    }
    
    public String generateGCL(JComponent panel){
        save(panel);
        if(panel==null||!(panel instanceof YesOrNoIfPanel)||!((YesOrNoIfPanel) panel).NotCheckbox.isSelected())
            return "if(clipboard_has_text())\n";
        return "if(!clipboard_has_text())\n";
    }
}
