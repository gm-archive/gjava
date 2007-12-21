/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.impl;

import java.util.*;
import javax.swing.*;
import org.gcreator.core.*;

/**
 *
 * @author luis
 */
public class Toolbar {
    public Toolbar(){}
    public Vector<ToolbarItem> items = new Vector<ToolbarItem>();
    public boolean horizontal = true;
    public boolean first = true;
    public boolean rollover = true;
    public boolean floatable = true;
    public void make(Aurwindow window){
        JToolBar toolbar = new JToolBar();
        for(ToolbarItem item : items){
            if(item instanceof ToolbarSeparator)
                toolbar.addSeparator();
            else{
                ToolbarButton btn = (ToolbarButton) item;
                JButton button = new JButton();
                if(btn.isTextVisible())
                    button.setText(btn.getText());
                button.setToolTipText(btn.getText());
                if(btn.isImageVisible())
                    button.setIcon(btn.getImage());
                toolbar.add(button);
            }
        }
        toolbar.setFloatable(floatable);
        toolbar.setRollover(rollover);
        if(horizontal){
            toolbar.setOrientation(JToolBar.HORIZONTAL);
            if(first)
                window.topContainer.add(toolbar);
            else
                window.bottomContainer.add(toolbar);
        }
        else{
            toolbar.setOrientation(JToolBar.VERTICAL);
            if(first)
                gcreator.window.leftContainer.add(toolbar);
            else
                gcreator.window.rightContainer.add(toolbar);
        }
    }
}
