/*
 * ProjectImporter.java
 * 
 * Created on 5/Set/2007, 13:24:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package externproject;

import core.*;

import javax.swing.*;
import components.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/**
 *
 * @author Luís
 */
public class ProjectImporter {
    public static void OpenProject(Component caller) {
        try {
            //open project
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new CustomFileFilter(".GCP", "G-Creator Project File"));
            fc.showOpenDialog(caller);
            File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            ZipFile z = new ZipFile(file);
            z.entries();
            z.close();
        } catch (ZipException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
