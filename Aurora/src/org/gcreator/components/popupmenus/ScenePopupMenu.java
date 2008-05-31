/*
 * ScenePopupMenu.java
 * 
 * Created on 13/Out/2007, 14:15:15
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import org.gcreator.editors.SceneEditor;
import javax.swing.*;
import org.gcreator.managers.*;
import java.awt.event.*;
import org.gcreator.core.*;
import org.gcreator.editors.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public class ScenePopupMenu extends JPopupMenu{
    public JCheckBoxMenuItem grid;
    private SceneEditor res;
    public ScenePopupMenu(SceneEditor res){
        this.res = res;
        grid = new JCheckBoxMenuItem("Display grid");
        grid.setSelected(((Scene) res.file.value).grid);
        grid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                grid();
            }
        });
        this.add(grid);
        this.updateUI();
    }
    public void setVisible(boolean v){
        if(v==true)
            grid.setSelected(((Scene) res.file.value).grid);
        super.setVisible(v);
    }
    public void grid(){
        ((Scene) res.file.value).grid = grid.isSelected();
        res.jToggleButton1.setSelected(grid.isSelected());
        res.scenePanel.updateUI();
    }
}
