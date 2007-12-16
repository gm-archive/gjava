/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.utils.GMImporter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class plugin extends PluginCore{
    public plugin(){}
    public void onSplashDispose(){
        JMenuItem GM = new JMenuItem();
        VarsRegistry.setVariable("GMImporter.GM", GM);
        GM.setText("Game Maker Project");
        GM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt)
            {
                onGM();
            }
        });
        PluginHelper.addMenuItem(11, GM);
    }
    
    private static FileDialog dialog = null;
    public static final int MODE_GM6 = 1;
    
    public void onGM()
    {
        if(dialog==null){
            dialog = new FileDialog(PluginHelper.getWindow());
        }
        dialog.setFilenameFilter(new FilenameFilter(){
            public boolean accept(File dir, String name){
                 if(dir.isDirectory()||name.endsWith(".gm6")||name.endsWith(".gmd"))
                     return true;
                 return false;
            }
        });
        dialog.setVisible(true);
        String fname = dialog.getDirectory() + File.separator + dialog.getFile();
        if(fname==null)
            return;
        importFile(fname, MODE_GM6);
    }
    
    public void importFile(String fname, int mode)
    {
        if(mode==MODE_GM6)
        {
            try{
                GM6Importer imp = new GM6Importer(fname);
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }
}
