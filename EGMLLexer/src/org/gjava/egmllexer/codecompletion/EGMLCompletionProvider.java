/*
 * EGMLCompletionProvider.java
 * 
 * Created on 20-Jul-2007, 15:21:19
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gjava.egmllexer.codecompletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.ErrorManager;


/**
 *
 * @author Administrator
 */
@SuppressWarnings("unchecked")
public class EGMLCompletionProvider implements CompletionProvider {
    
    public CompletionTask createTask(int queryType, final JTextComponent component) {
        
        return new AsyncCompletionTask(new AsyncCompletionQuery() {
            
            protected void query(final CompletionResultSet resultSet, Document doc, final int caretOffset) {
                
                final StyledDocument bDoc = (StyledDocument)doc;
                
                class Operation implements Runnable {
                    
                    String filter = null;
                    int startOffset = caretOffset-1;
                    
                    public void run() {
                        
                        //Here we create the filter:
                        try {
                            final int lineStartOffset = Utilities.getRowFirstNonWhite(bDoc, caretOffset);
                            if(lineStartOffset > -1 && caretOffset > lineStartOffset){
                                final char[] line = bDoc.getText(lineStartOffset, caretOffset-lineStartOffset).toCharArray();
                                final int whiteOffset = Utilities.indexOfWhite(line);
                                filter = new String(line, whiteOffset+1, line.length-whiteOffset-1);
                            }
                        } catch (BadLocationException ex) {
                            ErrorManager.getDefault().notify(ex);
                        }
                        
                        //Here we use the filter, if not null:
                        if(filter != null){
                            final Iterator it = keywords.iterator();
                            while(it.hasNext()){
                                final String entry = (String)it.next();
                                if(entry.startsWith(filter)){
                                    resultSet.addItem(new EGMLCompletionItem(entry, startOffset, caretOffset));
                                }
                            }
                        } else{
                            final Iterator it = keywords.iterator();
                            while(it.hasNext()){
                                final String entry = (String)it.next();
                                resultSet.addItem(new EGMLCompletionItem(entry, startOffset, caretOffset));
                            }
                        }
                        
                        resultSet.setAnchorOffset(caretOffset);
                        resultSet.finish();
                        
                    }
                }
                
                Operation oper = new Operation();
                bDoc.render(oper);
            }

            
        }, component);
    }
    
    
    public int getAutoQueryTypes(JTextComponent component, String typedText) {
        return 1;
    }
    
    private final static List keywords = new ArrayList();
    static{
        keywords.add("while");
        keywords.add("if");
        keywords.add("else");
        keywords.add("boolean");
        keywords.add("int");
        keywords.add("double");
        
    }
    
}