/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.externproject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URI;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import org.gcreator.core.GPanel;
import org.gcreator.fileclass.Folder;
import org.gcreator.units.ObjectNode;

/**
 *
 * @author luis
 */
public class StdImport{
    public static void importImage(Folder folder, File path) throws IOException{
        importImage(folder, path.getAbsolutePath());
    }
    public static void importImage(Folder folder, URL path) throws IOException{
        importImage(folder, path.getFile());
    }
    public static void importImage(Folder folder, URI path) throws IOException{
        importImage(folder, path.getPath() + path.getQuery());
    }
    public static void importImage(Folder folder, String path) throws IOException{
        org.gcreator.fileclass.Folder f = org.gcreator.core.gcreator.panel.getCurrentFolder();
        String t = path.replaceAll(".*\\.", "");
        if (!f.allowsFileType(t)) {
            System.out.println(t);
            f = f.magicAddition(t);
            if(f==null){
                return;
            }
        }
        File _file = new File(path);
        org.gcreator.fileclass.GFile file = new org.gcreator.fileclass.GFile(f, _file.getName().substring(0, _file.getName().lastIndexOf(".")), "", null);
            file.type = path.substring(path.lastIndexOf(".") + 1);
            System.out.println(path);
            if (file.type.toLowerCase().equals("gif")) {
                System.out.println("GIF!");
                //                    boolean animated = false;
                ImageReader reader = ImageIO.getImageReadersByFormatName("gif").next();
                //                    if (reader.getNumImages(true) > 1) {
//                        animated = true;
//                    }
                reader.setInput(new FileImageInputStream(_file));
                System.out.println("No: " + reader.getNumImages(true));
                BufferedImage[] b = new BufferedImage[reader.getNumImages(true)];

                for (int i = 0; i < reader.getNumImages(true); i++) {
                    b[i] = reader.read(i);
                }
                file.value = new ImageIcon(b[0]);
                //file.treeimage = org.gcreator.fileclass.File.getScaledIcon(new ImageIcon(b[1]));
            } else {
                System.out.println("Type:" + file.type.toLowerCase());
                file.value = new ImageIcon(ImageIO.read(_file));
                //file.treeimage = org.gcreator.fileclass.File.getScaledIcon((ImageIcon) file.value);
            }
            System.out.println("will add");
            f.add(file);
            ObjectNode node = new ObjectNode(file);
            f.node.add(node);
            org.gcreator.core.gcreator.panel.workspace.updateUI();
    }
}
