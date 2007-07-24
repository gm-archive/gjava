/*
 * EGMLCompletionItem.java
 * 
 * Created on 20-Jul-2007, 15:21:42
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gjava.egmllexer.codecompletion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JToolTip;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.api.editor.completion.Completion;
import org.netbeans.spi.editor.completion.CompletionItem;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.netbeans.spi.editor.completion.support.CompletionUtilities;
import org.openide.ErrorManager;
import org.openide.text.NbDocument;
import org.openide.util.Utilities;

/**
 *
 * @author Administrator
 */
public class EGMLCompletionItem implements CompletionItem {
    
    private static Color fieldColor = Color.decode("0x0000B2");
    private static ImageIcon fieldIcon = null;
    
    private ImageIcon  _icon;
    private int _type;
    private int _carretOffset;
    private int _dotOffset;
    private String _text;
    
    /**
     * Creates a new instance of EGMLCompletionItem
     */
    public EGMLCompletionItem(String text, int dotOffset, int carretOffset) {
        _text = text;
        _dotOffset = dotOffset;
        _carretOffset = carretOffset;
        
        //if(fieldIcon == null){
         //   fieldIcon = new ImageIcon(Utilities.loadImage("org/netbeans/modules/EGMLcodecompletion/EGML.png"));
        //}
        
        //_icon = fieldIcon;
    }
    
    private void doSubstitute(final JTextComponent component, final String toAdd, final int backOffset) {
        final StyledDocument doc = (StyledDocument)component.getDocument();

        class AtomicChange implements Runnable {
            public void run() {
                int caretOffset = component.getCaretPosition();
                String value = getText();

                if (toAdd != null) {
                    value += toAdd;
                }

                try {
                    doc.remove(_dotOffset+1, _carretOffset-_dotOffset-1);
                    doc.insertString(_dotOffset+1, value , null);
                    component.setCaretPosition(component.getCaretPosition() - backOffset);

                } catch (BadLocationException e) {
                    ErrorManager.getDefault().notify(ErrorManager.INFORMATIONAL, e);
                }                
            }
        }
        
        try {
            
            NbDocument.runAtomicAsUser(doc, new AtomicChange());
        } catch (BadLocationException ex) {
            ErrorManager.getDefault().notify(ErrorManager.INFORMATIONAL, ex);
        }
    }
    
    public void defaultAction(JTextComponent component) {
        doSubstitute(component, null, 0);
        Completion.get().hideAll();
    }
    
    public void processKeyEvent(KeyEvent evt) {
        if (evt.getID() == KeyEvent.KEY_TYPED && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            doSubstitute((JTextComponent) evt.getSource(), _text, _text.length() - 1);
            evt.consume();
        }
    }
    
    public int getPreferredWidth(Graphics g, Font defaultFont) {
        return CompletionUtilities.getPreferredWidth(_text, null, g, defaultFont);
    }
    
    public void render(Graphics g, Font defaultFont, Color defaultColor, Color backgroundColor, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(_icon, _text, null, g, defaultFont,
                (selected ? Color.white : fieldColor), width, height, selected);
    }
    
    public CompletionTask createDocumentationTask() {
        return new AsyncCompletionTask( new AsyncCompletionQuery() {
            protected void query(CompletionResultSet completionResultSet, Document document, int i) {
                completionResultSet.setDocumentation(new EGMLCompletionDocumentation(EGMLCompletionItem.this));
                completionResultSet.finish();
            }
        } );
    }
    
    public CompletionTask createToolTipTask() {
        return new AsyncCompletionTask( new AsyncCompletionQuery() {
            protected void query(CompletionResultSet completionResultSet, Document document, int i) {
                JToolTip toolTip = new JToolTip();
                toolTip.setTipText("Press Enter to insert \"" + getText() + "\"");
                completionResultSet.setToolTip(toolTip);
                completionResultSet.finish();
            }
        } );
    }
    
    public boolean instantSubstitution(JTextComponent component) {
        return true;
    }
    
    public int getSortPriority() {
        return 0;
    }
    
    public CharSequence getSortText() {
        return getText();
    }
    
    public CharSequence getInsertPrefix() {
        return getText();
    }
    
    public String getText() {
        return _text;
    }
    
}