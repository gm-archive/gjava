/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.popupmenus;

import org.gcreator.editors.ActorEditor;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import org.gcreator.events.*;
import org.gcreator.editors.*;

/**
 *
 * @author luis
 */
public class EventPopupMenu extends JPopupMenu{
    private static final long serialVersionUID = 1;
    private Vector array;
    private ActorEditor edit;
    
    private JMenuItem delete;
    
    public EventPopupMenu(ActorEditor edit){
        this.array = edit.elist.getEvents();
        this.edit = edit;
        delete = new JMenuItem("Delete");
        delete.setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/general/delete.png")));
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onDelete();
            }
        });
        this.add(delete);
    }
    
    public void onDelete(){
        int x = edit.jList1.getSelectedIndex();
        try{
            array.remove(x);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
}
