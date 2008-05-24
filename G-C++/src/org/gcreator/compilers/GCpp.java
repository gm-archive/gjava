/*
 * GCpp.java
 * 
 * Created on 10/Set/2007, 21:31:59
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers;

import org.gcreator.plugins.*;
import org.gcreator.exceptions.*;
import org.gcreator.core.*;
import org.gcreator.managers.*;
import org.gcreator.components.*;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class GCpp extends PlatformCore {

    public GCpp() {
        VarsRegistry.setVariable("gcpp.version", "draft");
        
        settings = new GCppOptions();
    } //install

    //Since onMainWindowStart is called before
    //the window constructor, we need something after
    //it.

    public GCppOptions settings;

    
    @Override
    public void onSplashDispose() {
        init();
    }

    public void init() {
        utilities.addStringMessage("Installed SeaGulls(C++)");
        PluginHelper.addGlobalTab("SeaGulls (C++)", settings);
        JMenuItem run = new ExtendedMenuItem("Compile with SeaGulls (C++)");
        
        run.addActionListener(new ActionListener() {

                    @Override
            public void actionPerformed(ActionEvent evt) {
                        run(GPanel.getMainProject());
                    }
                });
        PluginHelper.addMenuItem(3, run);
    }

    @Override
    protected Object onSignalReceived(PluginCore caller, Object signal) throws InvalidSignalException {
        return null;
    }

    @Override
    public void run(org.gcreator.fileclass.Project project) {
        if (gcreator.panel.istabs) {
            for (int ii = 0; ii < gcreator.panel.tabs.getTabCount(); ii++) {
                if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).project.equals(GPanel.getMainProject()) && ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) gcreator.panel.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < gcreator.panel.mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().project.equals(GPanel.getMainProject()) && ((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) gcreator.panel.mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        if (project == null) {
            return;
        }
        utilities.addStringMessage("Building/running using SeaGulls(C++)");
        super.run(project);
        GCppDialog compiler = new GCppDialog(project);
    }
}
