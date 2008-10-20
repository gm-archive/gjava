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

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.gcreator.plugins.DefaultEventTypes;
import org.gcreator.plugins.EventManager;

/**
 * Provides a tabbed document interface provider.
 * @author Luís Reis
 */
public class TabbedInterfaceProvider extends DocumentInterfaceProvider{
    /**
     * The underlying JTabbedPane.
     * Do not use unless you're directly targetting TabbedInterfaceProvider
     */
    protected JTabbedPane tabs;
    
    /**
     * Creates a new TabbedInterfaceProvider
     */
    public TabbedInterfaceProvider(){
        setLayout(new BorderLayout());
        tabs = new JTabbedPane();
        tabs.setVisible(true);
        add(tabs, BorderLayout.CENTER);
        tabs.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent evt){
                EventManager.fireEvent(TabbedInterfaceProvider.this,
                        DefaultEventTypes.FILE_CHANGED);
            }
        });
    }
    
    //NOTE: The Javadoc from most methods in inherited from
    //DocumentInterfaceProvider
    
    public void setSelectedIndex(int index){
        if(index<-1||index>getDocumentCount())
            tabs.setSelectedIndex(-1);
        else
            tabs.setSelectedIndex(index);
        
    }
    
    public int getSelectedIndex(){
        return tabs.getSelectedIndex();
    }
    
    public int getDocumentCount(){
        return tabs.getComponentCount();
    }
    
    public DocumentPane getDocumentAt(int index){
        try{
            return (DocumentPane) tabs.getComponentAt(index);
        }
        catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    
    public void add(String title, DocumentPane pane){
        tabs.add(title, pane);
        tabs.setTabComponentAt(tabs.indexOfComponent(pane), new TabRenderer(this));
    }
    
    public String getTitleAt(int index){
        return tabs.getTitleAt(index);
    }
    
    public void setTitleAt(int index, String title){
        tabs.setTitleAt(index, title);
    }
    
    /**
     * Gets the selected document.
     */
    @Override //Overritten for possible performance improvements
    public DocumentPane getSelectedDocument(){
        return (DocumentPane) tabs.getSelectedComponent();
    }
    
    public void removeDocumentAt(int index){
        try{
            tabs.remove(index);
            //Eventually should fire event
        }
        catch(Exception e){}
    }
    
    /**
     * Removes a given pane.
     * @param pane The pane to remove
     */
    @Override //Overwritten for possible performance improvements
    public void remove(DocumentPane pane){
        tabs.remove(pane);
        if(pane!=null){
            //Eventually should fire event
        }
    }
    
    public int getDocumentIndex(DocumentPane pane){
        return tabs.indexOfComponent(pane);
    }
    
    /**
     * Updates the look&feel of the tabs
     */
    @Override
    public void updateUI() {
        super.updateUI();
        if(tabs!=null)
            tabs.updateUI();
    }
}
