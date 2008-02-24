/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import javax.swing.*;
import org.gcreator.editors.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public class TileChooser extends JComponent{
    private SceneEditor sceneeditor;
    public TileChooser(SceneEditor editor){
        sceneeditor = editor;
    }
    
    public Tileset getSourceTileset(){
        try{
            return sceneeditor.getTileset();
        }
        catch(NullPointerException e){
            return null;
        }
    }
    
    public ImageIcon getSourceImage(){
        Tileset t = getSourceTileset();
        if(t==null)
            return null;
        return t.getImage();
    }
    
    public int getPreferredWidth(){
        int w = 0;
        try{
            w = getSourceImage().getIconWidth();
            w -= getSourceTileset().startx;
        }
        catch(NullPointerException e){
            return 0;
        }
        /*Tileset t = getSourceTileset();
        int hsepcount = 
                (w % t.tilew == 0 ?
                    w/t.tilew
                    : (w/t.tilew)+1);
        return w+(hsepcount*2);*/
        return w;
    }
    
    public int getPreferredHeight(){
        int h = 0;
        try{
            h = getSourceImage().getIconHeight();
        }
        catch(NullPointerException e){
            return 0;
        }
        /*Tileset t = getSourceTileset();
        h -= t.starty;
        int vsepcount = 
                (h % t.tileh == 0 ?
                    h/t.tileh
                    : (h/t.tileh)+1);
        return h+(vsepcount*2);*/
        return h;
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
        g.drawImage(img.getImage(), 0, 0, img.getImageObserver());
        int x = (Integer) sceneeditor.jSpinner13.getValue();
        int y = (Integer) sceneeditor.jSpinner14.getValue();
        int w = (Integer) sceneeditor.jSpinner15.getValue();
        int h = (Integer) sceneeditor.jSpinner16.getValue();
        g.setColor(Color.WHITE);
        g.drawRect(x-2, y-2, w+4, h+4);
        g.drawRect(x, y, w, h);
        g.setColor(Color.BLACK);
        g.drawRect(x-1, y-1, w+2, h+2);
        /*int imgw = img.getIconWidth();
        int imgh = img.getIconHeight();
        int di = 0;
        int dj = 0;
        Tileset t = getSourceTileset();
        for(int i = t.startx; i < imgw; i+=t.tilew+t.bwidth){
            dj = 0;
            for(int j = t.starty; j < imgh; j+=t.tileh+t.bheight){
                g.drawImage(img.getImage(), di, dj,
                        di+t.tilew, dj+t.tileh, i, j,
                        t.tilew, j+t.tileh,img.getImageObserver());
                dj += 2;
                dj += t.tileh;
            }
            di += 2;
            di += t.tilew;
        }*/
    }
}
