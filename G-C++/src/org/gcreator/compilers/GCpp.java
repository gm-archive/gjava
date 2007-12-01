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
        utilities.addStringMessage("Installed G-C++");
        PluginHelper.addGlobalTab("G-C++", settings);
        JButton run = new JButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")));

        run.addActionListener(new ActionListener() {

                    @Override
            public void actionPerformed(ActionEvent evt) {
                        run(Aurwindow.getMainProject());
                    }
                });
        Aurwindow.tool.add(run);
    }

    @Override
    protected Object onSignalReceived(PluginCore caller, Object signal) throws InvalidSignalException {
        return null;
    }

    @Override
    public void run(org.gcreator.fileclass.Project project) {
        if (gcreator.window.istabs) {
            for (int ii = 0; ii < Aurwindow.tabs.getTabCount(); ii++) {
                if (((TabPanel) Aurwindow.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) Aurwindow.tabs.getComponentAt(ii)).project.equals(Aurwindow.getMainProject()) && ((TabPanel) Aurwindow.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) Aurwindow.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < gcreator.window.mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project.equals(Aurwindow.getMainProject()) && ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        if (project == null) {
            return;
        }
        utilities.addStringMessage("Building/running using G-C++");
        super.run(project);
        GCppDialog compiler = new GCppDialog(project);
    }
}
