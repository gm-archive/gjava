/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import org.gcreator.editors.*;

/**
 *
 * @author Luís
 */
public interface SettingsManager {
    public void open(SettingsEditor editor);
    public boolean close(SettingsEditor editor);
}
