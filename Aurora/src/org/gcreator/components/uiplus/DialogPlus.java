/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.uiplus;

import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author luis
 */
public class DialogPlus extends JDialog{
    public DialogPlus(){
        setContentPane(new JPanel());
    }
    public void setWindowMask(Icon mask){
        com.sun.jna.examples.WindowUtils.setWindowMask(this, mask);
    }
    public void setDoubleBuffered(boolean b){
        Container c = getContentPane();
        try{
        c.getClass().getMethod("setDoubleBuffered", Boolean.TYPE).invoke(c, b);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
