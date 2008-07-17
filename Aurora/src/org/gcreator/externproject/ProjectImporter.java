/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.externproject;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.gcreator.components.impl.CustomFileFilter;

/**
 *
 * @author luis
 */
public class ProjectImporter {
    
    private static JFileChooser fc = new JFileChooser();
    
    static{
        fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
    }
    
    public static void OpenProject(Component caller){
        String fname = null;
        if (fc.showOpenDialog(caller) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        
        File file = fc.getSelectedFile();
        if(file==null) return;
        if(!file.exists()) return;
        if(file.isDirectory()) return;
        
        ImportContext c = new ImportContext(file);
        
        try{
            OpenProject(c);
        } catch(IOException e){
            JOptionPane.showMessageDialog(caller, "Could not load file:\n"
                    + e.getMessage(), "Project I/O Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void OpenProject(ImportContext c) throws IOException{
        FileInputStream fs = new FileInputStream(c.getFile());
        ZipInputStream zip = new ZipInputStream(fs);
    }
}
