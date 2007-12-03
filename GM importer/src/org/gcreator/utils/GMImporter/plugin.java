/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.utils.GMImporter;

import javax.swing.*;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class plugin extends PluginCore{
    public plugin(){}
    public void onSplashDispose(){
        JMenuItem GM6 = new JMenuItem();
        VarsRegistry.setVariable("GMImporter.GM6", GM6);
        PluginHelper.addMenuItem(11, GM6);
    }
}
