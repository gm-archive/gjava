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

/**
 *
 * @author Luís
 */
public class AddImageToSprite extends ActionPattern{
    public AddImageToSprite(){
        super();
        setStandardImage(new ImageIcon(getClass().getResource("/org/gcreator/actions/images/Add_Image_To_Sprite.png")));
    }
    
    public JComponent createNewPanel(org.gcreator.actions.Action action){
        AddImageToSpritePanel panel = new AddImageToSpritePanel();
        return panel;
    }
    
    public String getStandardText(JComponent panel){
        return "Add Image To Sprite";
    }
}
