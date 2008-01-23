/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components;

import java.awt.*;
import javax.swing.*;

import org.gcreator.editors.*;

/**
 * Previews a sprite subimage
 * @author Luís Reis
 */
public class SubimagePreview extends JLabel{
    private SpriteEditor editor;
    
    /**
     * Creates a new sprite subimage previewer
     * @param editor The sprite editor
     */
    public SubimagePreview(SpriteEditor editor){
        this.editor = editor;
    }
    
    public ImageIcon getCurrentImage(){
        return editor.getCurrentImage();
    }
    
    public Dimension getPreferredSize(){
        ImageIcon img = getCurrentImage();
        if(img==null)
            return new Dimension(0, 0);
        return new Dimension(img.getIconWidth(), img.getIconHeight());
    }
    
    public void paint(Graphics g){
        ImageIcon img = getCurrentImage();
        drawBackground(g);
        if(img!=null)
            g.drawImage(img.getImage(), 0, 0, img.getImageObserver());
    }
    
    public void drawBackground(Graphics g){
        Dimension d = getPreferredSize();
        boolean white = true;
        g.setColor(Color.WHITE);
        for(int i = 0; i < d.width/10; i++)
            for(int j = 0; j < d.height/10; j++){
                g.fillRect(i*10, j*10, 10, 10);
                if(white=!white)
                    g.setColor(Color.WHITE);
                else
                    g.setColor(Color.DARK_GRAY);
            }
    }
}
