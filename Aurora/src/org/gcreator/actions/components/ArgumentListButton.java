/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.components;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Luís
 */
/*internal*/ class ArgumentListButton extends JButton implements ActionListener{
    ArgumentList a;
    ArgumentListButton(ArgumentList a){
        super("...");
        this.a = a;
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        Container c = this.getParent();
        while(!(c instanceof JFrame))
            c = c.getParent();
        ArgumentListDialog d = new ArgumentListDialog((JFrame) c, true);
        d.setVisible(true);
    }
}
