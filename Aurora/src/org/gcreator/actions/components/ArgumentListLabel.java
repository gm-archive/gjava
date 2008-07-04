/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.components;

import javax.swing.JLabel;

/**
 *
 * @author Luís
 */
/*internal*/ class ArgumentListLabel extends JLabel{
    ArgumentListLabel(ArgumentList a){
        super(a==null?"":a.toString());
    }
}
