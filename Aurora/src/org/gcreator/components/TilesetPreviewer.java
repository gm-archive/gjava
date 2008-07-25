/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.awt.*;
import javax.swing.*;
import org.gcreator.editors.*;
//import org.gcreator.fileclass.res.GImage;

/**
 *
 * @author luis
 */
public class TilesetPreviewer extends JComponent{
    private TilesetEditor editor;
    
    public TilesetPreviewer(TilesetEditor editor){
        this.editor = editor;
    }
    
    private ImageIcon getSourceImage(){
        if(editor==null)
            return null;
        if(editor.value.image==-1)
            return null;
        org.gcreator.fileclass.GFile imgFile =
                editor.project.getFileFor(editor.value.image);
        if(imgFile==null)
            return null;
        return (ImageIcon) imgFile.value;
    }
    
    public int getPreferredWidth(){
        /*int w = 0;
        try{
            w = getSourceImage().getIconWidth();
        }
        catch(NullPointerException e){
            return 0;
        }
        w -= editor.value.startx;
        int hsepcount = (w % editor.value.tilew == 0 ? w/editor.value.tilew : (w/editor.value.tilew)+1);
        return w+(hsepcount*2);
        */
        try {
            return ((ImageIcon)
                    editor.project.getFileFor(editor.value.image).value).getIconWidth();
        } catch (NullPointerException exc) {
            return 0;
        } catch (ClassCastException exc) {
            System.out.println("??? "+exc);
            return 0;
        }
    }
    
    public int getPreferredHeight(){
        /*
        int h = 0;
        try{
            h = getSourceImage().getIconHeight();
        }
        catch(NullPointerException e){
            return 0;
        }
        h -= editor.value.starty;
        int vsepcount = (h % editor.value.tileh == 0 ? h/editor.value.tileh : (h/editor.value.tileh)+1);
        return h+(vsepcount*2);
        */
        try {
            return ((ImageIcon) editor.project.getFileFor(editor.value.image).value).getIconHeight();
        } catch (NullPointerException exc) {
            return 0;
        } catch (ClassCastException exc) {
            System.out.println("??? "+exc);
            return 0;
        }
    }
    
    public int getWidth(){
        return getPreferredWidth();
    }
    
    
    public int getHeight(){
        return getPreferredHeight();
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(getPreferredWidth(), getPreferredHeight());
    }
    
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon img = getSourceImage();
        g.clearRect(0, 0, getPreferredWidth(), getPreferredHeight());
        if(img==null)
            return;
        int imgw = img.getIconWidth();
        int imgh = img.getIconHeight();
        int w = editor.value.tilew;
        int h = editor.value.tileh;
        int bw =  editor.value.bwidth;
        int bh =  editor.value.bheight;
        g.drawImage(img.getImage(),0,0,Color.WHITE,img.getImageObserver());
        g.setColor(Color.WHITE);
        g.setXORMode(Color.BLACK);
        //g.setColor(Color.BLUE); -- What's wrong with XORMode?
        
        for (int i = editor.value.startx; i < imgw-1; i += w+bw)
            for (int j = editor.value.starty; j < imgh-1; j += h+bh) {
                g.drawRect(i, j, w, h);
            }
    }
}
