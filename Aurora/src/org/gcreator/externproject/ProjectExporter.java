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
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.GObject;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.Project;

/**
 *
 * @author luis
 */
public class ProjectExporter {

    public static int COMPRESSION = 9;

    public static void export(Project p, File f) {

        try {
            FileOutputStream fs = new FileOutputStream(f);
            ZipOutputStream zip = new ZipOutputStream(fs);

            zip.setLevel(COMPRESSION);

            ZipEntry e = new ZipEntry("config");

            zip.putNextEntry(e);
            zip.write(generateManifest(p).getBytes());
            zip.closeEntry();

            exportFolder(zip, p, 1);

            zip.close();
            fs.close();

        } catch (IOException e) {
            System.out.println("IOException:" + e.toString());
            e.printStackTrace();
        }

    }

    public static int exportFolder(ZipOutputStream zip, Folder f, int i)
            throws IOException {

        int c = i;

        Vector v = f.getChildren();

        for (Object o : v) {
            if (o instanceof GFile) {
                ZipEntry e = new ZipEntry("src/_" + c);
                zip.putNextEntry(e);
                IOManager.writeFileAs(zip, (GFile) o);
                zip.closeEntry();
                c++;
            }
            if (o instanceof Group) {
                c = exportFolder(zip, (Group) o, c);
            }
        }

        return c;
    }

    public static String generateManifest(Project p) throws IOException {
        StringBuffer res = new StringBuffer("<?xml version=\"1.0\"?>\n");

        res.append("<project version=\"1.0\" type=\"");
        Class pc = p.getClass();
        Enumeration<String> e = ProjectIO.projectMap.keys();

        String type = null;

        while (e.hasMoreElements()) {
            String s = e.nextElement();
            Class c = ProjectIO.projectMap.get(s);
            if (c == pc) {
                type = s;
                break;
            }
        }

        if (type != null) {
            res.append(type);
        } else {
            throw new IOException("Invalid project type");
        }

        res.append("\" curid=\"");

        res.append(p.curid);

        res.append("\">\n");

        res.append(generateManifestForFolder(p, "\t"));

        res.append("</project>");

        return res.toString();
    }

    public static String generateManifestForFolder(Folder f, String prefix) throws IOException {
        StringBuffer res = new StringBuffer();

        for (GObject o : f.getChildren()) {
            if (o instanceof GFile) {
                res.append(prefix)
                .append("<file type=\"")
                .append(((GFile) o).type)
                .append("\" manager=\"")
                .append(IOManager.getPreferredTypeFor((GFile) o))
                .append("\">")
                .append(((GFile) o).name)
                .append("</file>\n");
            } else if (o instanceof Group) {
                res.append(prefix)
                .append("<group type=\"")
                .append(IOManager.getSimpleNameFor((Group) o))
                .append("\" name=\"" + ((Group) o).name)
                .append("\">\n")
                .append(generateManifestForFolder((Group) o, prefix + "\t"))
                .append(prefix)
                .append("</group>\n");
            }
        }

        return res.toString();
    }
}
