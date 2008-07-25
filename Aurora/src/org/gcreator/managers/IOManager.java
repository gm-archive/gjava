/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.managers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Group;
import org.gcreator.fileclass.res.Resource;
import org.gcreator.fileclass.groups.*;
import org.gcreator.fileclass.res.Sprite;
import org.xml.sax.SAXException;

/**
 *
 * @author luis
 */
public class IOManager {
    public static String getPreferredTypeFor(GFile f) throws IOException{
        Object o = f.value;
        if(o==null)
            return f._savetype = "Null";
        if(o instanceof String)
            return f._savetype = "PlainText";
        if(o instanceof ImageIcon)
            return f._savetype = "Image";
        if(o instanceof BufferedImage)
            return f._savetype = "Image";
        if(o instanceof File) //java.io
            return f._savetype = "File";
        if(o instanceof Sprite)
            return f._savetype = "Sprite";
        if(o instanceof Resource)
            return f._savetype = "Serialize";
        throw new IOException("Unknown preferred type for"
                    + f.getClass().getName());
    }
    
    public static String getSimpleNameFor(Folder f) throws IOException{
        Class c = f.getClass();
        if(c==Group.class) return "Group";
        if(c==ActionGroup.class) return "ActionGroup";
        if(c==ActorGroup.class) return "ActorGroup";
        if(c==GCLGroup.class) return "CodeGroup";
        if(c==ImageGroup.class) return "ImageGroup";
        if(c==PathGroup.class) return "PathGroup";
        if(c==SceneGroup.class) return "SceneGroup";
        if(c==SnippetGroup.class) return "SnippetGroup";
        if(c==SoundGroup.class) return "SoundGroup";
        if(c==SpriteGroup.class) return "SpriteGroup";
        if(c==StaticGroup.class) return "StaticGroup";
        if(c==TilesetGroup.class) return "TilesetGroup";
        if(c==TimelineGroup.class) return "TimelineGroup";
        throw new IOException("Unknown simple type for"
                + f.getClass().getName());
    }
    
    public static Class getClassFrom(String name) throws SAXException{
        if(name.equals("CodeGroup"))
            return GCLGroup.class;
        if(name.equals("Group"))
            return Group.class;
        try{
            return Class.forName("org.gcreator.fileclass.groups." + name);
        }
        catch(Exception e){
            throw new SAXException("Unknown group type " + name);
        }
    }
    
    public static void writeFileAs(ZipOutputStream s, GFile f) throws IOException{
        String str = f._savetype;
        
        if(str.equals("Null")){
            //Don't do anything
        }
        else if(str.equals("File")){
            File file = (File) f.value;
            FileInputStream fs = new FileInputStream(file);
            int i = fs.read();
            while(i!=-1){
                s.write(i);
                i = fs.read();
            }
            fs.close();
        }
        else if(str.equals("PlainText")){
            String val = f.value.toString();
            s.write(val.getBytes());
        }
        else if(str.equals("Image")){
            Object o = f.value;
            if(o instanceof BufferedImage){
                ImageIO.write((BufferedImage) o, f.type, s);
            }
            else if(o instanceof ImageIcon){
                ImageIO.write((BufferedImage) ((ImageIcon) o).getImage(), f.type, s);
            }
        }
        else if(str.equals("Sprite")){
            Object o = f.value;
            ObjectOutputStream out = new ObjectOutputStream(s);
            out.writeObject(o);
        }
        else if(str.equals("Serialize")){
            Object o = f.value;
            ObjectOutputStream out = new ObjectOutputStream(s);
            out.writeObject(o);
        }
    }
}
