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
import fileclass.*;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.zip.ZipOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;

/**
 *
 * @author Luís
 */
public class GPlus extends PluginCore{
    public GPlus(){}
    
    public void compile(){
        Project x = PluginHelper.getWindow().getCurrentProject();
        PluginHelper.println(x.name);
        if(x instanceof ExtensionProject){
            try {
                ZipOutputStream out = new ZipOutputStream(new FileOutputStream(x.name + ".ext"));
                out.setLevel(Deflater.BEST_COMPRESSION);
                out.putNextEntry(new ZipEntry("src/Java/"));
                out.closeEntry();
                out.putNextEntry(new ZipEntry("src/Cpp/"));
                out.closeEntry();
                out.putNextEntry(new ZipEntry("src/EGML/"));
                out.closeEntry();
                out.putNextEntry(new ZipEntry("ref/Java/"));
                out.closeEntry();
                out.putNextEntry(new ZipEntry("ref/Cpp/"));
                out.closeEntry();
                out.close();
            }
            catch(Exception e){
                PluginHelper.println("Exception thrown: " + e.toString());
            }
        }
        else{
            PluginHelper.println("Project must be extension");
        }
    }
    
    @Override
    public void onSplashDispose(){
        JMenuItem compileext = new JMenuItem(PluginHelper.getLanguageSpecialMessage("GPlus.CompileCur"));
        
        compileext.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent evt){
                compile();
            }
        });
        
        PluginHelper.println("!!!");
        
        aurora.window.menus[3].add(compileext);
        
        VarsRegistry.setVariable("GPlus.MenuItem", compileext);
    }
}

