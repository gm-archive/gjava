/*
 * File.java
 *
 * Created on 4/Set/2007, 20:12:37
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.fileclass;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.zip.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author Luís
 */
public class File extends Object implements Transferable {

    static final long serialVersionUID = 1L;
    public static final DataFlavor NODE_FLAVOR = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType, "Node");
    private static DataFlavor[] flavors = {NODE_FLAVOR};
    public Folder root;
    public String type; //If file is "a.txt", leave only "txt" here

    public java.lang.Object value;
    public ImageIcon treeimage;
    public String xml = ""; // the data xml used to load

    private static final ObjectStreamField[] serialPersistentFields = {/*new ObjectStreamField("root", Folder.class),*/ new ObjectStreamField("type", String.class), 
    new ObjectStreamField("value", java.lang.Object.class)};

    public File(Folder root, String name, String type, Object value) {
        super(name);
        this.root = root;
        this.type = type;
        this.value = value;
        root.add(this);
    }

    private File(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getObjectType() {
        return "File";
    }

    /*private class MyOutputStream extends ImageOutputStreamImpl {

        public ZipOutputStream out;

        public MyOutputStream(ZipOutputStream out) {
            this.out = out;
        }

         
        public void write(byte[] barray, int a, int b) throws IOException {
            for (int i = a; i < b; i++) {
            }
        }
        
         
        public void write(byte[] barray) throws IOException {
            for (int i = 0; i < barray.length; i++) {
                out.write(barray[i]);
            }
        }
        
        public void write(int a) throws IOException {
            out.write((byte) a);
        }
        
        public int read(byte[] barray, int a, int b) {
            return 0;
        }

        public int read(int a) {
            return 0;
        }

        public int read() {
            return 0;
        }
    }*/
    public void writeToBuffer(ZipOutputStream out) throws IOException {

        

    
        if (value instanceof String) {
            out.write(value.toString().getBytes());
        } else if (value instanceof ImageIcon) {
            ImageIcon img = ((ImageIcon) value);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BufferedImage ii = (BufferedImage) img.getImage();
            ImageIO.write(ii, type, baos); 
            out.write(baos.toByteArray());
        } else {//if (value instanceof org.gcreator.fileclass.res.Resource) {
            ObjectOutput s = new ObjectOutputStream(out);
        s.writeObject(value);
        s.flush();
            //out.write(((org.gcreator.fileclass.res.Resource) value).writeXml().getBytes());
        }
    }

    public static ImageIcon getScaledIcon(ImageIcon ii) {
        ImageIcon iii = new ImageIcon();
        if (ii != null) {
            Image i = ii.getImage().getScaledInstance(16, 16, BufferedImage.SCALE_DEFAULT);
            iii.setImage(i);
            return iii;
        }
        return null;
    }

    public Object clone() {
        File o = new File(name, type);
        if (value instanceof Resource) {
            o.value = ((Resource) value).clone();
        } else if (value instanceof ImageIcon) {
            o.value = value;
        } else {
            o.value = value;
        }
        return o;
    }

    public DataFlavor[] getTransferDataFlavors() {
        return flavors;
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return flavor == NODE_FLAVOR;
    }

    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (flavor != NODE_FLAVOR) {
            throw new UnsupportedFlavorException(flavor);
        }
        return this;
    }

    public String getPath() {
        return root.getPath() + "/" + super.getPath();
    }
}