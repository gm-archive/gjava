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
import org.gcreator.fileclass.res.TimelineStep;
import org.gcreator.managers.ActorEditorClipboard;

/**
 *
 * @author luis
 */
public class ActionPopupMenu extends JPopupMenu{
    
    private ActorEditor aedit = null;
    private TimelineEditor tedit = null;
    
    private JMenuItem delete,cut,copy,paste,editaction;
    
    public ActionPopupMenu(ActorEditor edit){
        this.aedit = edit;
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
    
    public ActionPopupMenu(TimelineEditor edit){
        this.tedit = edit;
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
            if(aedit!=null)
                aedit.jScrollPane3.setViewportView(((org.gcreator.actions.Action) aedit.jList2.getSelectedValue()).getPanel());
            if(tedit!=null)
                aedit.jScrollPane3.setViewportView(((org.gcreator.actions.Action) tedit.jList1.getSelectedValue()).getPanel());
    }
    
    public void onCut() {
        if(aedit!=null)
        if (aedit.jList2.getSelectedIndex()==-1)
        {
           System.out.println("Error you need to select an action!");
           
        }
        if(tedit!=null)
        if (tedit.jList1.getSelectedIndex()==-1)
        {
           System.out.println("Error you need to select an action!");
           
        }
        int x = 0;
        if(aedit!=null)
            x = aedit.jList2.getSelectedIndex();
        if(tedit!=null)
            x = tedit.jList1.getSelectedIndex();
        try{
            Vector array = null;
            if(aedit!=null)
                array = ((Event) aedit.jList1.getSelectedValue()).actions;
            if(tedit!=null)
                array = (TimelineStep) tedit.jComboBox3.getSelectedItem();
            org.gcreator.actions.Action a = (org.gcreator.actions.Action)array.get(x);
            ActorEditorClipboard.copiedAction = a;
            array.remove(x);
        }
        catch(Exception e){}
        if(aedit!=null){
            aedit.updateUI();
            aedit.updateActionList();
        }
    }
    
    
    
    public void onCopy() {
     int x = 0;
     if(aedit!=null)
         x = aedit.jList2.getSelectedIndex();
     if(tedit!=null)
         x = tedit.jList1.getSelectedIndex();
        try{
            Vector array = null;
            if(aedit!=null)
                array = ((Event) aedit.jList1.getSelectedValue()).actions;
            if(tedit!=null)
                array = (TimelineStep) tedit.jComboBox3.getSelectedItem();
            org.gcreator.actions.Action a = (org.gcreator.actions.Action)array.get(x);
            ActorEditorClipboard.copiedAction = a.clone();
            
        }
        catch(Exception e){}
        if(aedit!=null){
            aedit.updateUI();
            aedit.updateActionList();
        }
        if(tedit!=null){
            tedit.updateUI();
            tedit.updateActionList();
        }
    }
    
    public void onPaste() {
    if(ActorEditorClipboard.copiedAction == null) return;
    try{
        Vector array = null;
            if(aedit!=null)
                array = ((Event) aedit.jList1.getSelectedValue()).actions;
            if(tedit!=null)
                array = (TimelineStep) tedit.jComboBox3.getSelectedItem();
            array.add(ActorEditorClipboard.copiedAction);
        }
        catch(Exception e){}
    if(aedit!=null){
        aedit.updateUI();
        aedit.updateActionList();
    }
    if(tedit!=null){
        tedit.updateUI();
        tedit.updateActionList();
    }
    }
    
    public void onDelete(){
        int x = 0;
        if(aedit!=null)
            aedit.jList2.getSelectedIndex();
        if(tedit!=null)
            tedit.jList1.getSelectedIndex();
        try{
            Vector array = null;
            if(aedit!=null)
                array = ((Event) aedit.jList1.getSelectedValue()).actions;
            if(tedit!=null)
                array = (TimelineStep) tedit.jComboBox3.getSelectedItem();
            array.remove(x);
        }
        catch(Exception e){}
        if(aedit!=null){
        aedit.updateUI();
        aedit.updateActionList();
        }
        if(tedit!=null){
            tedit.updateUI();
            tedit.updateActionList();
        }
    }
}
