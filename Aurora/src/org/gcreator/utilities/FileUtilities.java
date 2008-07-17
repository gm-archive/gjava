/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Various file-related methods.
 * 
 * @author Serge Humphrey
 */
public class FileUtilities {
    /**
     * Don't allow instantation.
     */
    private FileUtilities() {
    }
    
    /**
     * Copies a file to a specific destination.
     * @param src The file to copy.
     * @param dest The file to copy the file to. If it is a drectory, then
     * the name of the <tt>src</tt> file is used.
     * @return The new file that was created when the file was copied.
     * @throws java.io.IOException if <tt>dest</tt> is a directory and does
     * not exist, or if an error occurs while copying the file.
     */
    public static File copyFile(File src, File dest) throws IOException {
        //long startTime = System.nanoTime();
        if (!src.exists()) {
            throw new IOException("File"+src.getPath()+" does not exist.");
        } else if (dest.isDirectory() && !dest.exists()) {
            throw new IOException("Directory "+dest+" does not exist.");
        }
        if (dest.isDirectory()) {
            dest = new File(dest.getPath()+"/"+src.getName());
        }
        if (!dest.exists()) {
            dest.createNewFile();
        }
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        int data;
        while( (data = in.read()) != -1) {
            out.write(data);
        }
        in.close();
        out.flush();
        out.close();
        /*
        long time = System.nanoTime()-startTime;
        System.out.println("It took "+time+" nano-secoonds to copy "+src.getName());
        System.out.println("(That's "+time*10e9+" seconds.)");
        */
        return dest;
    }
}
