/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import javax.swing.*;
import org.gcreator.editors.*;

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
        if(editor.value.image==null)
            return null;
        org.gcreator.fileclass.GFile imgFile = editor.value.image;
        if(imgFile==null)
            return null;
        return ((org.gcreator.fileclass.res.GImage)(imgFile.value)).image;
    }
    
    public int getPreferredWidth(){
        int w = 0;
        try{
            w = getSourceImage().getIconWidth();
        }
        catch(NullPointerException e){
            return 0;
        }
        w -= editor.value.startx;
        int hsepcount = (w % editor.value.tilew == 0 ? w/editor.value.tilew : (w/editor.value.tilew)+1);
        return w+(hsepcount*2);
    }
    
    public int getPreferredHeight(){
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
        ImageIcon img = getSourceImage();
        g.clearRect(0, 0, getPreferredWidth(), getPreferredHeight());
        if(img==null)
            return;
        int imgw = img.getIconWidth();
        int imgh = img.getIconHeight();
        int bw =  editor.value.bwidth;
        int bh =  editor.value.bheight;
        //int di = 0;
        //int dj = 0;
        //for(int i = editor.value.startx; i < imgw; i+=editor.value.tilew+editor.value.bwidth){
        //    dj = 0;
        //    for(int j = editor.value.starty; j < imgh; j+=editor.value.tileh+editor.value.bheight){
        //        g.drawImage(img.getImage(), di, dj, di+editor.value.tilew, dj+editor.value.tileh, i, j, i+editor.value.tilew, j+editor.value.tileh,img.getImageObserver());
        //        dj += 2;
        //        dj += editor.value.tileh;
        //    }
        //    di += 2;
        //    di += editor.value.tilew;
        //}
        g.drawImage(img.getImage(),0,0,((org.gcreator.fileclass.res.GImage)(editor.value.image.value)).transparentColor,img.getImageObserver());
        g.setColor(Color.WHITE);
        g.setXORMode(Color.BLACK);
        for (int i = editor.value.startx,times = 0; i+bh*times < imgw-1; i+= editor.value.tilew, times++) {
            g.drawLine(i+bh*times,0,i+bh*times,imgh-1);
            if (bh > 0 && i+bh*(times+1) < imgw-1)
                g.drawLine(i+bh*(times+1),0,i+bh*(times+1),imgh-1);
        }
        for (int i = editor.value.starty,times = 0; i+bw*times < imgh-1; i+= editor.value.tileh, times++) {
            g.drawLine(0,i+bw*times,imgw-1,i+bw*times);
            if (bw > 0 && i+bw*(times+1) < imgh-1)
                g.drawLine(0,i+bw*(times+1),imgw-1,i+bw*(times+1));
        }
    }
}
