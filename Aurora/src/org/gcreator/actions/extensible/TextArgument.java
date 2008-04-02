/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.extensible;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class TextArgument implements Argument{
    public TextArgument(){
        
    }

    public JComponent generateComponent(int index){
        return new XPanel();
    }
    
    public Object getValue(JComponent c){
        return ((XPanel) c).field.getText();
    }
}

class XPanel extends JPanel{
    public JLabel label;
    public JTextField field;
    public XPanel(){
        super();
        
        label = new JLabel();
        label.setVisible(true);
        
        field = new JTextField();
        field.setVisible(true);
        
        setVisible(true);
        setLayout(new BorderLayout());
        add(label, BorderLayout.WEST);
        add(field, BorderLayout.CENTER);
    }
}
