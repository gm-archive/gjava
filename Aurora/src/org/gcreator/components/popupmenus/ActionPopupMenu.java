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
import org.gcreator.managers.ActorEditorClipboard;

/**
 *
 * @author luis
 */
public class ActionPopupMenu extends JPopupMenu{
    
    private ActorEditor edit;
    
    private JMenuItem delete,cut,copy,paste,editaction;
    
    public ActionPopupMenu(ActorEditor edit){
        this.edit = edit;
        delete = new JMenuItem("Delete");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
       editaction = new JMenuItem("Edit");
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onDelete();
            }
        });
        cut.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onCut();
            }
        });
        copy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onCopy();
            }
        });
        paste.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onPaste();
            }
        });
        editaction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                onEdit();
            }
        });
        //this.add(editaction);
        this.add(cut);
        this.add(copy);
        this.add(paste);
        this.add(delete);
    }
    
    public void onEdit(){
            edit.jScrollPane3.setViewportView(((org.gcreator.actions.Action) edit.jList2.getSelectedValue()).getPanel());
    }
    
    public void onCut() {
        if (edit.jList2.getSelectedIndex()==-1)
        {
           System.out.println("Error you need to select an action!");
           
        }
        int x = edit.jList2.getSelectedIndex();
        try{
            Vector array = ((Event) edit.jList1.getSelectedValue()).actions;
            org.gcreator.actions.Action a = (org.gcreator.actions.Action)array.get(x);
            ActorEditorClipboard.copiedAction = a;
            array.remove(x);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
    
    public void onCopy() {
     int x = edit.jList2.getSelectedIndex();
        try{
            Vector array = ((Event) edit.jList1.getSelectedValue()).actions;
            org.gcreator.actions.Action a = (org.gcreator.actions.Action)array.get(x);
            ActorEditorClipboard.copiedAction = a.clone();
            
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
    
    public void onPaste() {
    if(ActorEditorClipboard.copiedAction == null) return;
    try{
            Vector array = ((Event) edit.jList1.getSelectedValue()).actions;
            array.add(ActorEditorClipboard.copiedAction);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
    
    public void onDelete(){
        int x = edit.jList2.getSelectedIndex();
        try{
            Vector array = ((Event) edit.jList1.getSelectedValue()).actions;
            array.remove(x);
        }
        catch(Exception e){}
        edit.updateUI();
        edit.updateActionList();
    }
}
