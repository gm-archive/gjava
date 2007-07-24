                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 /*
 * EGMLCompletionDocumentation.java
 *
 * Created on November 26, 2006, 3:15 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.egmllexer.codecompletion;

import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;

/**
 *
 * @author Geertjan Wielenga
 */
public class EGMLCompletionDocumentation implements CompletionDocumentation {
    
    private EGMLCompletionItem _item;
    
    public EGMLCompletionDocumentation(EGMLCompletionItem item) {
        _item = item;
    }
    
    public String getText() {
        return "Placeholder for documentation on <h3>" + _item.getText() + "</h3>";
    }
    
    public URL getURL() {
        return null;
    }
    
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }
    
    public Action getGotoSourceAction() {
        return null;
    }
    
}
