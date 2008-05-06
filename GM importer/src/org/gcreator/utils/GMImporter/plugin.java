/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.utils.GMImporter;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import org.gcreator.components.JFileFilter;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class plugin extends PluginCore{
    
    public static JFileChooser jFileChooser1 = null;
    
    public plugin(){}
    public void onSplashDispose(){
        System.out.println("onSplashDispose");
        JMenuItem GM = new JMenuItem();
        VarsRegistry.setVariable("GMImporter.GM", GM);
        System.out.println("Registered GM Importer");
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
        //System.out.println("onGM");
//        if(dialog==null){
//            dialog = new FileDialog(PluginHelper.getWindow());
//        }
//        dialog.setFilenameFilter(new FilenameFilter(){
//            public boolean accept(File dir, String name){
//                System.out.println("accept:"+name);
//                 if(dir.isDirectory()||name.endsWith(".gm6")||name.endsWith(".gmd"))
//                     return true;
//                 return false;
//            }
//        });
//        
//        dialog.setVisible(true);
//        
//        String fname = dialog.getDirectory() + File.separator + dialog.getFile();
//        if(fname==null)
//            return;
         if (jFileChooser1 == null) {
            jFileChooser1 = new JFileChooser();
        }

        
            jFileChooser1.resetChoosableFileFilters();
            JFileFilter filter = new JFileFilter(".*\\.gm6", "Game Maker 6 files (*.gm6)");
            jFileChooser1.addChoosableFileFilter(filter);
            JFileFilter filter2 = new JFileFilter(".*\\.*", "Any Files (*.*)");
            jFileChooser1.addChoosableFileFilter(filter2);
            jFileChooser1.setFileFilter(filter);
            jFileChooser1.showDialog(PluginHelper.getWindow(), "OK");
            if (jFileChooser1.getSelectedFile() != null) {
                java.io.File _file = jFileChooser1.getSelectedFile();
        importFile(_file.getPath(), MODE_GM6);
            } else { return;}
    }
    
    public void importFile(String fname, int mode)
    {
        System.out.println("importFile");
        if(mode==MODE_GM6)
        {
            try{
                System.out.println("GM6Importer");
                GM6Importer imp = new GM6Importer(fname);
            }catch(Exception e){
                System.out.println(">>" + e.toString());
            }
        }
    }
}
