/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import org.gcreator.editors.*;
import org.gcreator.actions.components.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class AddImageToSprite extends ActionPattern{
    static final long serialVersionUID = 1L;
    public static ImageIcon img = new ImageIcon(Comment.class.getResource("/org/gcreator/actions/images/Add_Image_To_Sprite.png"));
    
    public String URL = "", Sprite = "";
    public int fails_1 = 0, fails_2 = 0;
    
    public AddImageToSprite(){
        super();
    }
    
    @Override
    public void save(JComponent panel){
        URL = ((AddImageToSpritePanel) panel).URL.getText();
        Sprite = ((AddImageToSpritePanel) panel).Sprite.getText();
        fails_1 = ((AddImageToSpritePanel) panel).fails1.getSelectedIndex();
        fails_2 = ((AddImageToSpritePanel) panel).fails2.getSelectedIndex();
    }
    
    @Override
    public void load(JComponent panel){
        ((AddImageToSpritePanel) panel).URL.setText(URL);
        ((AddImageToSpritePanel) panel).Sprite.setText(Sprite);
        ((AddImageToSpritePanel) panel).fails1.setSelectedIndex(fails_1);
        ((AddImageToSpritePanel) panel).fails2.setSelectedIndex(fails_2);
    }
    
    public void setStandardImage(ImageIcon img){
        AddImageToSprite.img = img;
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
    public  JComponent createNewPanel(org.gcreator.actions.Action action, Project project){
        AddImageToSpritePanel panel = new AddImageToSpritePanel();
        return panel;
    }
    
    public String getStandardText(JComponent panel){
        if(panel!=null)
            save(panel);
        return LangSupporter.activeLang.getEntry(229);
    }
    
    public String generateGCL(JComponent cmp){
        if(cmp!=null)
            save(cmp);
        return "";
    }
}
