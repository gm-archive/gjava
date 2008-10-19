/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.gcreator.gui;

import javax.swing.JPanel;
import org.gcreator.plugins.DefaultEventTypes;

/**
 * Provides a way to display documents, such as JTabbedPane and a MDI view.
 * 
 * @author Luís Reis
 */
public abstract class DocumentInterfaceProvider extends JPanel{
    
    /**
     * Adds a new DocumentPane
     * @param title The title to be used
     * @param docs The DocumentPane to be added
     */
    public abstract void add(String title, DocumentPane doc);
    
    /**
     * Gets the DocumentPane at a given index
     * @param i The index to be retrieved
     */
    public abstract DocumentPane getDocumentAt(int i);
    
    /**
     * Gets the number of documents.
     */
    public abstract int getDocumentCount();
    
    /**
     * Gets the selected index
     */
    public abstract int getSelectedIndex();
    
    /**
     * Gets the selected document.<br>
     * Pineapple provides a default implementation. Classes extending
     * DocumentInterfaceProviders may override this method to obtain better
     * performance.
     */
    public DocumentPane getSelectedDocument(){
        int i = getSelectedIndex();
        if(i==-1)
            return null;
        if(i<getDocumentCount())
            return getDocumentAt(i);
        return null;
    }
    
    /**
     * Sets the selected index. If that index has no equivalent
     * DocumentPane, then either none will be selected, or this method will
     * be ignored.
     * @param index The index to select
     * 
     * @see DefaultEventTypes#FILE_CHANGED
     */
    public abstract void setSelectedIndex(int index);
    
    /**
     * Gets the title of the document at the given index
     * @param index The index
     */
    public abstract String getTitleAt(int index);
    
    /**
     * Gets the index of a document
     * @param pane The document
     */
    public abstract int getDocumentIndex(DocumentPane pane);
    
    /**
     * Sets the title of the document at the given index
     * @param index The index
     * @param title The new document title
     */
    public abstract void setTitleAt(int index, String title);
    
    /**
     * Removes the document at the given index
     * @param index The index
     */
    public abstract void removeDocumentAt(int index);
    
     /**
     * Removed a given {@link DocumentPane}<br>
     * Pineapple provides a default implementation. Classes extending
     * DocumentInterfaceProviders may override this method to obtain better
     * performance.
     */
    public void remove(DocumentPane pane){
        int i = getDocumentIndex(pane);
        if(i==-1)
            return;
        if(i<getDocumentCount())
            removeDocumentAt(i);
    }
    
    /**
     * Returns ALL DocumentPanes of the provider.
     */
    public DocumentPane[] getDocuments(){
        DocumentPane[] p = new DocumentPane[getDocumentCount()];
        for(int i = 0; i < p.length; i++)
            p[i] = getDocumentAt(i);
        return p;
    }
}
