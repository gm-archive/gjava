/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.pineapple;

import javax.swing.JOptionPane;
import org.gcreator.plugins.PluginCore;

/**
 *
 * @author luis
 */
public class PineapplePlugin extends PluginCore{
    @Override
    public void initialize(){
        JOptionPane.showMessageDialog(null, "initialize() called");
    }
}
