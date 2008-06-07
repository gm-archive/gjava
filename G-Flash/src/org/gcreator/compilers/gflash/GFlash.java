/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gflash;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import org.gcreator.fileclass.Project;
import org.gcreator.plugins.PlatformCore;
import org.gcreator.plugins.PluginCore;
import org.gcreator.plugins.PluginHelper;

/**
 *
 * @author bob
 */
public class GFlash extends PlatformCore {
    public GFlash() {
    }
    public void onload() {
    }
    @Override
    public void onSplashStart() {
    }
    @Override
    public void onMainWindowStart() {
    }
    @Override
    public void onSplashDispose() {
        init();
    }
    @Override
    public void onMainWindowDispose() {
    }
    
    @Override
    public Object onSignalReceived(PluginCore caller, Object signal) {
        if(signal instanceof Object[]){
            Object[] args = (Object[]) signal;
            if(args[0].equals("compile")) {
                for(int i = 1; i < args.length; i++){
                    if(args[i] != null&&args[i] instanceof Project){
                        run((Project) args[i]);
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    JMenuItem menuItem;
    public void init() {
        menuItem = new JMenuItem("Compile with G-Flash");
        menuItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
               startprogress();
            }
        });
        PluginHelper.addMenuItem(3, menuItem);
    }
    
    @Override
    public void uninstall() {
        PluginHelper.removeMenuItem(3, menuItem);
    }
    @Override
    public void run(Project p) {
        System.out.println("Run G-Flash");
    }
}
