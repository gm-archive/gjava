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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.gcreator.components.impl.ByteInputStream;
import org.gcreator.components.impl.CustomFileFilter;
import org.gcreator.fileclass.Project;
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
        String s = "";
        entry = zip.getNextEntry();
        while(entry!=null){
            if(entry.getName().equals("config")){
                manfound = true;
                while(zip.available()>0){
                    s += (byte) zip.read();
                }
            }
            zip.closeEntry();
            entry = zip.getNextEntry();
        }
        if(!manfound)
            throw new IOException("Could not find project manifest");
        parseManifest(zip, c, s);
    }
    
    private static void parseManifest(ZipInputStream zip, ImportContext c, String s)
    throws SAXException, IOException{
        
        SAXParser sax = new SAXParser(new ByteInputStream(s.getBytes()));
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
        Class ptype = ProjectIO.projectMap.get(type);
        if(ptype==null)
            throw new SAXException("Unknown project type");
        Constructor cons;
        try{
            cons = ptype.getConstructor();
        }
        catch(NoSuchMethodException e){
            throw new SAXException("Project type does not own empty constructor");
        }
        
        Project p;
        try{
             p = (Project) cons.newInstance();
        }
        catch(ClassCastException e){
            throw new SAXException("Type is not a project");
        }
        catch(InstantiationException e){
            throw new SAXException("Could not call constructor");
        }
        catch(IllegalAccessException e){
            throw new SAXException("Constructor must be marked as public");
        }
        catch(InvocationTargetException e){
            throw new SAXException("Constructor threw exception");
        }
        
        String path = c.getFile().getAbsolutePath();
        String name = path.substring(path.lastIndexOf(File.separator));
        name = name.substring(name.indexOf("."));
        
        p.name = name;
        p.location = path;
        
        Method e;
        try{
             e = ptype.getMethod("balance");
        }
        catch(NoSuchMethodException ex){
            e = null;
        }
        
        //Note: If the class has no "balance" function
        //do not fail. balance may not be needed in that
        //particular case
        if(e!=null){
            try{
                e.invoke(p);
            }
            catch(Exception ex){
                //Ignore
            }
        }
        
        
        
    }
    
    private static ZipEntry getNextValidEntry(ZipInputStream s) throws IOException{
        
        ZipEntry z = s.getNextEntry();
        
        while(z.isDirectory()||!z.getName().matches("^src/_[0-9]+$")){
            s.closeEntry();
            z = s.getNextEntry();
            if(z==null)
                throw new IOException("Invalid number of files");
        }
        
        return z;
    }
}
