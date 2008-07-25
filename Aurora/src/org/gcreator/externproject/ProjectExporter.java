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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import org.gcreator.managers.IOManager;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.gcreator.exceptions.WrongResourceException;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.Project;

/**
 *
 * @author luis
 */
public class ProjectExporter {
    
    public static int compression = 5;
    
    public static void export(Project p, File f) {
        
        try{
            FileOutputStream fs = new FileOutputStream(f);
            ZipOutputStream zip = new ZipOutputStream(fs);
            
            zip.setLevel(compression);
            
            ZipEntry e = new ZipEntry("config");
            
            zip.putNextEntry(e);
            zip.write(generateManifest(p).getBytes());
            zip.closeEntry();
            
            exportFolder(zip, p, 1);
            
            zip.close();
            fs.close();
            
        }
        catch(IOException e){
            System.out.println("IOException:" + e.toString());
        }
        
    }
    
    public static int exportFolder(ZipOutputStream zip, Folder f, int i)
        throws IOException{
        
        int c = i;
        
        Vector v = f.getChildren();
        
        for(Object o : v){
            if(o instanceof GFile){
                ZipEntry e = new ZipEntry("src/_" + c);
                zip.putNextEntry(e);
                IOManager.writeFileAs(zip, (GFile) o);
                zip.closeEntry();
                c++;
            }
            if(o instanceof Group){
                c = exportFolder(zip, (Group) o, c);
            }
        }
        
        return c;
    }
    
    public static String generateManifest(Project p) throws IOException{
        String res = "<?xml version=\"1.0\"?>\n";
        
        res += "<project version=\"1.0\" type=\"";
        Class pc = p.getClass();
        Enumeration<String> e = ProjectIO.projectMap.keys();
        
        String type = null;
        
        while(e.hasMoreElements()){
            String s = e.nextElement();
            Class c = ProjectIO.projectMap.get(s);
            if(c==pc){
                type = s;
                break;
            }
        }
        
        if(type!=null){
            res += type;
        }
        else
            throw new IOException("Invalid project type");
        
        res += "\" curid=\"";
        
        res += p.curid;
        
        res += "\">\n";
        
        res += generateManifestForFolder(p, "\t");
        
        res += "</project>";
        
        return res;
    }
    
    public static String generateManifestForFolder
            (Folder f, String prefix) throws IOException {
        String res = "";
        
        Vector v = f.getChildren();
        
        for(Object o : v){
            if(o instanceof GFile){
                res += prefix;
                res += "<file type=\"";
                res += ((GFile) o).type;
                res += "\" manager=\"";
                res += IOManager.getPreferredTypeFor((GFile) o);
                res += "\" id=\"";
                res += ((GFile) o).getProject().getIdFor((GFile) o);
                res += "\">";
                res += ((GFile) o).name;
                res += "</file>\n";
            }
            else if(o instanceof Group){
                res += prefix;
                res += "<group type=\"";
                res += IOManager.getSimpleNameFor((Group) o);
                res += "\" name=\"" + ((Group) o).name;
                res += "\">\n";
                res += generateManifestForFolder((Group) o, prefix + "\t");
                res += prefix;
                res += "</group>\n";
            }
        }
        
        return res;
    }
}
