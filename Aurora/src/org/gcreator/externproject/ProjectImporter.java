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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.gcreator.components.impl.ByteInputStream;
import org.gcreator.components.impl.CustomFileFilter;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.managers.IOManager;
import org.gcreator.managers.ProjectTree;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
public class ProjectImporter {

    private static JFileChooser fc = new JFileChooser();
    

    static {
        fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
    }

    public static void OpenProject(Component caller) {
        String fname = null;
        if (fc.showOpenDialog(caller) == JFileChooser.CANCEL_OPTION) {
            return;
        }

        File file = fc.getSelectedFile();
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            return;
        }
        ImportContext c = new ImportContext(file);

        try {
            OpenProject(c);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(caller, "Could not load project:\n" + e.getMessage(), "Project I/O Error", JOptionPane.ERROR_MESSAGE);
        } catch (SAXException e) {
            JOptionPane.showMessageDialog(caller, "Failed to load project:\n" + e.getMessage(), "Project SAX Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void OpenProject(ImportContext c) throws IOException, SAXException {
        FileInputStream fs = new FileInputStream(c.getFile());
        ZipInputStream zip = new ZipInputStream(fs);
        c.zip = zip;

        ZipEntry entry;
        
        boolean manfound = false;
        String s = "";
        entry = zip.getNextEntry();
        while (entry != null) {
            if (entry.getName().equals("config")) {
                manfound = true;
                while (zip.available() > 0) {
                    int ch = zip.read();
                    if(ch==-1) break;
                    s += (char) ch;
                }
                zip.closeEntry();
                break;
            }
            zip.closeEntry();
            entry = zip.getNextEntry();
        }
        if(entry==null)
            zip.closeEntry();
        if (!manfound) {
            throw new IOException("Could not find project manifest");
        }
        parseManifest(zip, c, s);
    }

    private static void parseManifest(ZipInputStream zip, ImportContext c, String s)
            throws SAXException, IOException {
    //    System.out.println("s="+s);
        SAXParser sax = new SAXParser(new ByteInputStream(s.getBytes()));
        Node root = sax.getRootNode();
        if (root == null) {
            throw new SAXException("No root node");
        }
        String rname = root.getName();
        if (rname == null || !rname.equals("project")) {
            throw new SAXException("Invalid root name: " + rname);
        }
        String version = null;
        String type = null;
        String curid = null;
        for (int i = 0; i < root.getAttributeCount(); i++) {
            String n = root.getAttributeName(i);
       //     System.out.println("n="+n);
            String val = root.getAttributeValue(n);
      //      System.out.println("val="+val);
            if (n.equals("version")) {
                version = val;
                continue;
            }
            if (n.equals("type")) {
                type = val;
                continue;
            }
            if (n.equals("curid")){
                curid = val;
            }
            //Ignore other attributes for forward-compatibility reasons
        }
        if (version == null) {
            throw new SAXException("Malformed project manifest: No project version specified");
        }
        if (!version.equals("1.0")) {
            throw new SAXException("Invalid version. The project may be from a future version of G-Creator.");
        }
        if (type == null) {
            throw new SAXException("Malformed project manifest: No project type specified.");
        }
        if (curid == null){
            throw new SAXException("Malformed project manifest: No curid specified");
        }
        Class ptype = ProjectIO.projectMap.get(type);
        if (ptype == null) {
            throw new SAXException("Unknown project type");
        }
        Constructor cons;
        try {
            cons = ptype.getConstructor();
        } catch (NoSuchMethodException e) {
            throw new SAXException("Project type does not own empty constructor");
        }

        Project p;
        try {
            p = (Project) cons.newInstance();
        } catch (ClassCastException e) {
            throw new SAXException("Type is not a project");
        } catch (InstantiationException e) {
            throw new SAXException("Could not call constructor");
        } catch (IllegalAccessException e) {
            throw new SAXException("Constructor must be marked as public");
        } catch (InvocationTargetException e) {
            throw new SAXException("Constructor threw exception");
        }

        c.p = p;
        String path = c.getFile().getAbsolutePath();
        String name = path.substring(path.lastIndexOf(File.separator)+1);
        name = name.substring(0, name.indexOf("."));

        p.name = name;
        p.location = c.getFile();
        try{
        p.curid = Integer.parseInt(curid);
        }
        catch(Exception e){
            throw new SAXException("Malformed project manifest: curid must be integer");
        }
        if(p.curid<=0){
            throw new SAXException("Malformed project manifest: curid must be positive");
        }

        //Method e;
        //try {
        //    e = ptype.getMethod("balance");
        //} catch (NoSuchMethodException ex) {
        //    e = null;
        //}

        //if (e != null) {
        //    try {
        //        e.invoke(p);
        //    } catch (Exception ex) {
        //        //Ignore
        //    }
        //}

        importFolder(p, root, c);

        ProjectTree.importFolderToTree(p, org.gcreator.core.gcreator.panel.top);

    }

    private static ZipEntry getNextValidEntry(ImportContext c) throws IOException {

        ZipEntry z = c.zip.getNextEntry();

        while (z.isDirectory() || !z.getName().matches("^src/_[0-9]+$")) {
            c.zip.closeEntry();
            z = c.zip.getNextEntry();
            if (z == null) {
                throw new IOException("Invalid number of files");
            }
        }

        return z;
    }

    private static void importFolder(Folder f, Node node, ImportContext c)
            throws SAXException, IOException {
        for (int i = 0; i < node.getChildrenCount(); i++) {
            Node child = node.getChildAt(i);
            String name = child.getName();

            if (name.equals("file")) {
                String fname = child.getContent();
                String type = null;
                String manager = null;
                String id = null;
                for (int j = 0; j < child.getAttributeCount(); j++) {
                    String aname = child.getAttributeName(j);
                    if (aname.equals("type")) {
                        type = child.getAttributeValue(aname);
                    } else if (aname.equals("manager")) {
                        manager = child.getAttributeValue(aname);
                    } else if(aname.equals("id")) {
                        id = child.getAttributeValue(aname);
                    } else {
                        throw new SAXException("Invalid manifest. Unknown file attribute " + aname);
                    }
                }
                if (type == null) {
                    throw new SAXException("Invalid manifest. Missing file type");
                }
                if (manager == null) {
                    throw new SAXException("Invalid manifest. Missing content manager");
                }
                if (id == null){
                    throw new SAXException("Invalid manifest. Missing file id");
                }
                if (child.getChildrenCount() > 0) {
                    throw new SAXException("Invalid manifest. Unexpected children for file.");
                }
                int cid = 0;
                try{
                    cid = Integer.parseInt(id);
                }
                catch(Exception e){
                    throw new SAXException("Invalid manifest: File id must be integer");
                }
                if(cid<=0)
                    throw new SAXException("Invalid manifest: File id must be positive");
                GFile file = new GFile(f, fname, type, null, true);
                getNextValidEntry(c);
                file.value = importContent(c, type, manager, fname, c.zip);
                f.getProject().files.add(cid-1, file);

            } else if (name.equals("group")) {
              //  System.out.println("Got to group");
                if (child.getAttributeCount() != 2) {
                    throw new SAXException("Invalid manifest. Wrong number of attributes for group.");
                }
                String gname = null;
                String gtype = null;
                for (int j = 0; j < child.getAttributeCount(); j++) {
                    String aname = child.getAttributeName(j);
                    if (aname.equals("type")) {
                        gtype = child.getAttributeValue(aname);
                    } else if (aname.equals("name")) {
                        gname = child.getAttributeValue(aname);
                    } else {
                        throw new SAXException("Invalid manifest. Unknown group attribute " + aname);
                    }
                }
                Class cls = IOManager.getClassFrom(gtype);
                Constructor con;
                try {
                    con = cls.getConstructor(Folder.class, String.class);
                } catch (NoSuchMethodException e) {
                    throw new SAXException("Could not find valid group constructor");
                }

                Group g;
                try {
                    g = (Group) con.newInstance(f, gname);
                } catch (ClassCastException e) {
                    throw new SAXException("Invalid group type: Type must extend class Group");
                } catch (InstantiationException e) {
                    throw new SAXException("Could not properly call group constructor");
                } catch (IllegalAccessException e) {
                    throw new SAXException("Group constructor must be marked as public");
                } catch (InvocationTargetException e) {
                    throw new SAXException("Group constructor threw an exception");
                }
                f.add(g);
                importFolder(g, child, c);
            } else {
                throw new SAXException("Invalid manifest. Unknown entry " + name);
            }
        }
    }

    public static Object importContent(ImportContext c, String type, String manager, String name, InputStream s)
            throws IOException, SAXException {
        if(manager.equals("Null")){
            return null;
        }
        if (manager.equals("PlainText")) {
            String res = "";
            int i = s.read();
            while (i!=-1) {
                res += (char) i;
                i = s.read();
            }
            return res;
        }
        if (manager.equals("File")) {
            File file = File.createTempFile("gc_tmp_", "." + type);
            FileOutputStream fs = new FileOutputStream(file);
            int i = s.read();
            while(i!=-1){
                fs.write(i);
                i = s.read();
            }
            fs.close();
            return file;
        }
        if (manager.equals("Image")) {
            BufferedImage b = ImageIO.read(s);
            return new ImageIcon(b);
        }
        if (manager.equals("Sprite")){
            ObjectInputStream stream = new ObjectInputStream(s);
            try {
                Sprite sp = (Sprite) stream.readObject();
                sp.p = c.getProject();
                return sp;
            } catch (ClassNotFoundException e) {
                throw new IOException("Could not read serialized object: Class Not Found");
            }
        }
        if (manager.equals("Serialize")) {
            ObjectInputStream stream = new ObjectInputStream(s);
            try {
                return stream.readObject();
            } catch (ClassNotFoundException e) {
                throw new IOException("Could not read serialized object: Class Not Found");
            }
        }
        throw new SAXException("Invalid content manager and/or file type");
    }
}
