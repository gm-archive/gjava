/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.extensible;

import javax.swing.*;

/**
 *
 * @author Luís
 */
public interface Argument {
    public JComponent generateComponent(int index);
    public Object getValue(JComponent c);
}
