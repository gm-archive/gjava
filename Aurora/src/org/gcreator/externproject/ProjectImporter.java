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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.gcreator.components.impl.CustomFileFilter;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

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
            JOptionPane.showMessageDialog(caller, "Could not load project:\n"
                    + e.getMessage(), "Project I/O Error", JOptionPane.ERROR_MESSAGE);
        } catch(SAXException e){
            JOptionPane.showMessageDialog(caller, "Failed to load project:\n"
                    + e.getMessage(), "Project SAX Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void OpenProject(ImportContext c) throws IOException, SAXException{
        FileInputStream fs = new FileInputStream(c.getFile());
        ZipInputStream zip = new ZipInputStream(fs);
        
        ZipEntry entry;
        
        boolean manfound = false;
        entry = zip.getNextEntry();
        while(entry!=null){
            if(entry.getName().equals("config")){
                manfound = true;
                parseManifest(zip, c);
            }
            zip.closeEntry();
            entry = zip.getNextEntry();
        }
        if(!manfound)
            throw new IOException("Could not find project manifest");
    }
    
    private static void parseManifest(ZipInputStream zip, ImportContext c)
    throws SAXException, IOException{
        
        SAXParser sax = new SAXParser(zip);
        Node root = sax.getRootNode();
        if(root == null)
            throw new SAXException("No root node");
        String rname = root.getName();
        if(rname==null||!rname.equals("project"))
            throw new SAXException("Invalid root name: " + rname);
        String version = null;
        String type = null;
        for(int i = 0; i < root.getAttributeCount(); i++){
            String n = root.getAttributeName(i);
            String val = root.getAttributeValue(n);
            if(n.equals("version")){
                version = val;
                continue;
            }
            if(n.equals("type"))
                type = val;
            //Ignore other attributes for forward-compatibility reasons
        }
        if(version==null)
            throw new SAXException("Malformed project manifest: No project version specified");
        if(!version.equals("1.0"))
            throw new SAXException("Invalid version. The project may be from a future version of G-Creator.");
        if(type==null)
            throw new SAXException("Malformed project manifest: No project type specified.");
    }
}
