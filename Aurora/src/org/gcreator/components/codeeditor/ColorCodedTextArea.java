/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components.codeeditor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import org.gcreator.autocomplete.AutocompleteFrame;
import org.gcreator.autocomplete.GSAutocomplete;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Project;

public final class ColorCodedTextArea extends JTextArea implements DocumentListener, KeyListener {
    
    private static final long serialVersionUID = 1;
    protected Project project;
    protected KeywordList keywordList;
    protected UndoManager undo = new UndoManager();
    protected UndoAction undoAction = new UndoAction();
    protected RedoAction redoAction = new RedoAction();
    protected ColorCodedView view;
    
    @Override
    public String getUIClassID() {
        return "JEditTextAreaUI";
    }
    
    static {
        UIManager.getDefaults().put("JEditTextAreaUI", "org.gcreator.components.codeeditor.TextEditAreaUI");
    }
    
    public void callAutocomplete() {
        if (!isEditable()) {
            return;
        }
        AutocompleteFrame f = new GSAutocomplete(this.getSelectionStart(), this.getSelectionEnd(), this, project);
        if (f != null && !f.requestDie()) {
            try {
                FontMetrics fm = getFontMetrics(getFont());
                int x = 0;
                int lh = fm.getHeight();
                int y = lh;
                int w = getWidth();
                String d = getText();
                for (int i = 0; i < getSelectionEnd(); i++) {
                    char t = d.charAt(i);
                    if (t == '\r' || (t == '\n' && (i == 0 || d.charAt(i - 1) != '\r'))) {
                        x = 0;
                        y += lh;
                        continue;
                    }
                    int cw;
                    if (t != '\t') {
                        cw = fm.charWidth(t);
                    } else {
                        cw = fm.charWidth(' ') * 10;
                    }
                    if (x + cw > w) {
                        x = cw;
                        y += lh;
                        continue;
                    }
                    x += cw;
                }
                String before = getDocument().getText(0, getCaretPosition()).replaceAll("\t", "    ");
                int top = 0;
                if (before.contains("\n")) {
                    int n = 0;
                    String text = before;
                    while ((text.indexOf("\n")) != -1) {
                        n++;
                        text = text.replaceFirst("\n", "^");
                    }
                    top = getFontMetrics(getFont()).getHeight()*n;
                    before = before.substring(before.lastIndexOf("\n")+1);
                }
                f.setLocation(getLocationOnScreen().x+getFontMetrics(getFont()).stringWidth(before), 
                        getLocationOnScreen().y+top);
                f.setVisible(true);
            } catch (BadLocationException ex) {
                Logger.getLogger(ColorCodedTextArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void insert(int start, int end, String text) {
        String doc = getText();
        String n = doc.substring(0, Math.min(doc.length(),start));
        n += text;
        n += doc.substring(Math.min(Math.max(0, end),doc.length()), doc.length());
        setText(n);
    }
    
    /**
     * Creates a new JEditTextArea with the specified settings.
     * @param p The Project.
     */
    public ColorCodedTextArea(Project p) {
        this(p, new GCLKeywordList(), null);
    }
    
    public ColorCodedTextArea(Project p, String text) {
        this(p, new GCLKeywordList(), text);
    }
    
    public ColorCodedTextArea() {
        this(null, new GCLKeywordList(), null);
    }
    // Avoid ambiguous reference with ColorCodedTextArea(null)
//    public ColorCodedTextArea(String text) {
//        this(null, new GCLKeywordList(), text);
//    }
    
    /**
     * You must specify <tt>text </tt> if you don't want setting the text to be recorded in the Undo operations.
     * @param p The Project
     * @param l The KeywordList
     * @param text The text
     */
    public ColorCodedTextArea(Project p, KeywordList l, String text) {
        this.project = p;
        if (l != null) {
            this.keywordList = l;
        } else {
            throw new NullPointerException("KeywordList may not be null.");
        }
        setDragEnabled(true); 
        addKeyListener(this);
        
        if (text != null && text != "") {
            setText(text);
        }
        
        getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undo.addEdit(e.getEdit());
                undoAction.updateUndoState();
                redoAction.updateRedoState();
            }
        });
        
        getDocument().addDocumentListener(this);
        setBackground(Color.WHITE);
    }
    
    public KeywordList getKeywordList() {
        return keywordList;
    }
    
    public void setKeywordList(KeywordList l) {
        if (l == null) {
            throw new NullPointerException("KeywordList may not be null!");
        }
        keywordList = l;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_SPACE) {
            callAutocomplete();
        } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Z) {
            if (undo.canUndo()) {
                undo.undo();
            }
        } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Y) {
            if (undo.canRedo()) {
                undo.redo();
            }
        } else if (e.getKeyChar() == '}') {
            try {
                Document doc = getDocument();
                int lineIndex = getLineOfOffset(getCaretPosition() - 1);
                String line = doc.getText(getLineStartOffset(lineIndex), getLineEndOffset(lineIndex) - getLineStartOffset(lineIndex));
                if (line.startsWith("\t")) {
                    doc.remove(getLineStartOffset(lineIndex), 1);//remove 1 tab.
                }
            } catch (BadLocationException ex) {
               // Logger.getLogger(ColorCodedTextArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*auto-indentation...*/
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Document doc = getDocument();
                boolean isOpenBracket = doc.getText(getCaretPosition()-2, 1).equals("{");
                int lineIndex = getLineOfOffset(getCaretPosition()-2);
                String line = doc.getText(getLineStartOffset(lineIndex), getLineEndOffset(lineIndex)-getLineStartOffset(lineIndex));
                boolean isLineTabbed = line.startsWith("\t");
                if (getCaretPosition() > 0 && (isOpenBracket || isLineTabbed)) {
                    String tabs = "\t"+ ((isOpenBracket && isLineTabbed) ? "\t" : "");
                    
                    if (line.startsWith("\t\t") || isOpenBracket)  {
                        if (line.lastIndexOf("\t") != -1) {
                            String start = line.substring(0, line.lastIndexOf("\t"));
                            int pos;
                            while ((pos = start.indexOf("\t")) != -1) {
                                tabs += "\t";
                                start = start.substring(pos+1);
                            }
                        }
                    }
                    doc.insertString(getCaretPosition(), tabs, null);
                }
            } catch (BadLocationException ex) {
                Logger.getLogger(ColorCodedTextArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (getCaretPosition() <= 0) {
            gcreator.debugOut.println("caret postion too small");
            return;
        }
        
        try {
            String s = getDocument().getText(getCaretPosition() - 1, 1);
            boolean yes = false;
            System.out.println("1: "+getDocument().getText(getCaretPosition() - 2, 1)+" 2: "+ getDocument().getText(getCaretPosition() - 1, 1));
            if ((getCaretPosition() > 2 && getDocument().getText(getCaretPosition() - 2, 1).equals("/")) ||
                (getCaretPosition() > 1 && getDocument().getText(getCaretPosition() - 1, 1).equals("/"))) {
                yes = true;
            }
            int pos = getCaretPosition();
            if (true) {//(s.equals("\"") || s.equals("\'") || yes) {
              //  for (int[] i : view.allcomments) {System.out.println("i0: "+i[0]+" i1: "+i[1]+" pos: "+getCaretPosition());
                 //   if (i[0] == pos || i[1] == pos) {
                        
                        final int startLine = getLineOfOffset(pos-1);
                        final int endLine = getLineOfOffset(getDocument().getLength());
                        view.damageLineRange(startLine, endLine, getBounds(), ColorCodedTextArea.this);
                    //    break;
               //     }
             //   }
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(ColorCodedTextArea.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }
    
    /**
     * An Undo Action.
     */
    protected class UndoAction extends AbstractAction {
        private static final long serialVersionUID = 1;
        
        public UndoAction() {
            super("Undo");
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.undo();
            } catch (CannotUndoException ex) {
                System.out.println("Unable to undo: " + ex);
                ex.printStackTrace();
            }
            updateUndoState();
            redoAction.updateRedoState();
        }

        protected void updateUndoState() {
            if (undo.canUndo()) {
                setEnabled(true);
                putValue(Action.NAME, undo.getUndoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Undo");
            }
        }
}
    
    /**
    * A Redo Action.
    */
    protected class RedoAction extends AbstractAction {
        private static final long serialVersionUID = 1;
        public RedoAction() {
            super("Redo");
            setEnabled(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                undo.redo();
            } catch (CannotRedoException ex) {
                System.out.println("Unable to redo: " + ex);
                ex.printStackTrace();
            }
            updateRedoState();
            undoAction.updateUndoState();
        }

        protected void updateRedoState() {
            if (undo.canRedo()) {
                setEnabled(true);
                putValue(Action.NAME, undo.getRedoPresentationName());
            } else {
                setEnabled(false);
                putValue(Action.NAME, "Redo");
            }
        }
    }
}
