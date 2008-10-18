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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import org.gcreator.core.Core;
import org.gcreator.gui.MainFrame;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.NotifyEvent;
import org.gcreator.plugins.PluginCore;

/**
 *
 * @author luis
 */
public class PineapplePlugin extends PluginCore{
    public static JSplitPane splitter;
    public static JTree tree;
    public static JMenuBar menubar;
    public static JMenu fileMenu;
    
    @Override
    public void initialize(){
        EventManager.addEventHandler(this, "window-initialized", EventPriority.MEDIUM);
    }
    
    @Override
    public void handleEvent(NotifyEvent evt){
        if(evt.getEventType().equals("window-initialized")){
            MainFrame f = Core.getStaticContext().getMainFrame();
            splitter = new JSplitPane();
            splitter.setVisible(true);
            f.setLayout(new BorderLayout());
            f.add(splitter, BorderLayout.CENTER);
            tree = new JTree();
            tree.setVisible(true);
            splitter.setLeftComponent(tree);
            
            menubar = new JMenuBar();
            menubar.setVisible(true);
            f.add(menubar, BorderLayout.NORTH);
            
            fileMenu = new JMenu("File");
            fileMenu.setMnemonic('F');
            fileMenu.setVisible(true);
            menubar.add(fileMenu);
        }
    }
}
