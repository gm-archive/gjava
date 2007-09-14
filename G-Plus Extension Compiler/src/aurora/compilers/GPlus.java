/*
 * GPlus.java
 * 
 * Created on 14/Set/2007, 17:01:49
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aurora.compilers;

import plugins.*;
import managers.*;
import core.*;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Luís
 */
public class GPlus extends PluginCore{
    public GPlus(){}
    
    public void compile(){}
    
    @Override
    public void onSplashDispose(){
        JMenuItem compileext = new JMenuItem(PluginHelper.getLanguageSpecialMessage("GPlus.CompileCur"));
        
        compileext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                compile();
            }
        });
        
        PluginHelper.println("!!!");
        
        compileext = new JMenuItem(PluginHelper.getLanguageSpecialMessage("GPlus.CompileCur"));
        aurora.window.menus[3].add(compileext);
        
        VarsRegistry.setVariable("GPlus.MenuItem", compileext);
    }
}
