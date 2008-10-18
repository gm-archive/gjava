/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.pineapple;

import java.awt.BorderLayout;
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
        }
    }
}
