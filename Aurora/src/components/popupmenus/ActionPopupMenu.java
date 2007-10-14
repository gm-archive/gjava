/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import org.gcreator.events.*;
import editors.*;

/**
 *
 * @author luis
 */
public class ActionPopupMenu extends JPopupMenu{
    
    private ActorEditor edit;
    
    private JMenuItem delete;
    
    public ActionPopupMenu(ActorEditor edit){
        this.edit = edit;
        delete = new JMenuItem("Delete");
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onDelete();
            }
        });
        this.add(delete);
    }
    
    public void onDelete(){
        int x = edit.jList2.getSelectedIndex();
        try{
            Vector<actions.Action> array = ((Event) edit.jList1.getSelectedValue()).actions;
            array.remove(x);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
}
