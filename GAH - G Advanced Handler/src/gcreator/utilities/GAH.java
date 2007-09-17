/*
 * GAH.java
 * 
 * Created on 17/Set/2007, 18:08:09
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gcreator.utilities;

import javax.swing.*;
import plugins.*;
import java.awt.event.*;

/**
 *
 * @author Luís
 */
public class GAH extends PluginCore{
    public GAH(){}
    
    @Override
    public void onSplashDispose(){
        JMenu Advanced = new JMenu(PluginHelper.getLanguageSpecialMessage("GAH.Menu"));
        JMenuItem gc = new JMenuItem(PluginHelper.getLanguageSpecialMessage("GAH.GC"));
        Advanced.add(gc);
        PluginHelper.addMenu(Advanced);
        VarsRegistry.setVariable("GAH.Menu", Advanced);
        VarsRegistry.setVariable("GAH.GC", gc);
        gc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.gc();
                PluginHelper.println("Garbage Collection performed");
            }
        });
    }
}
