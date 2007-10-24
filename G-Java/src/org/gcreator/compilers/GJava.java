/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore{
    public GJava(){
        
    }
    
    @Override
    public void onSplashDispose(){
        init();
    }
    
    public void init(){
        utilities.addStringMessage("Installed G-Java!");
        // add toolbar button
        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);

        run.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                run(gcreator.window.getMainProject());
            }
        });
        gcreator.window.tool.add(run);
    }
}
