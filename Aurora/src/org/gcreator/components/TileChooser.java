/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.editors.*;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author luis
 */
public final class TileChooser extends JComponent {
    private final static long serialVersionUID = 1;
    private SceneEditor sceneeditor;
    private int tx, ty;
    
    public TileChooser(SceneEditor editor) {
        sceneeditor = editor;
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                Tileset t = getSourceTileset();
                if (t == null) {
                    return;
                }
                int x = e.getX()-t.startx, y = e.getY()-t.starty;
                int xindex, yindex;
                int xsz = t.bwidth+t.tilew, ysz = t.bheight+t.tileh;
                xindex = (int) Math.floor(x / xsz);
                yindex = (int) Math.floor(y / ysz);
                tx = xindex*xsz+t.startx+xindex;
                ty = yindex*ysz+t.starty+yindex;
                repaint();
            }
        });
        addMouseMotionListener(new MouseAdapter(){
            
            @Override
            public void mouseDragged(MouseEvent e) { //NOTE: This wasn't being called because it was in the wrong listener.
                Tileset t = getSourceTileset();
                if (t == null) {
                    return;
                }
                int x = e.getX()-t.startx, y = e.getY()-t.starty;
                int xindex, yindex;
                int xsz = t.bwidth+t.tilew, ysz = t.bheight+t.tileh;
                xindex = (int) Math.floor(x / xsz);
                yindex = (int) Math.floor(y / ysz);
                tx = xindex*xsz+t.startx+xindex;
                ty = yindex*ysz+t.starty+yindex;
                repaint();
            }
        });
    }
    
    public int getTileX() {
        return tx;
    }
    public int getTileY() {
        return ty;
    }
    public Point getTileLocation() {
        return new Point(tx, ty);
    }
    public Tileset getSourceTileset() {
        try{
            return sceneeditor.getTileset();
        }
        catch(NullPointerException e) {
            return null;
        }
    }
    
    public ImageIcon getSourceImage() {
        Tileset t = getSourceTileset();
        if(t == null) {
            return null;
        }
        return t.getImage();
    }
    
    public int getPreferredWidth() {
        try{
            return getSourceImage().getIconWidth();
        }
        catch(NullPointerException e) {
            return 0;
        }
    }
    
    public int getPreferredHeight() {
        try {
            return getSourceImage().getIconHeight();
        }
        catch (NullPointerException e) {
            return 0;
        }
    }
    
    @Override
    public int getWidth() {
        return getPreferredWidth();
    }
    
    @Override
    public int getHeight() {
        return getPreferredHeight();
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(getPreferredWidth(), getPreferredHeight());
    }
    
    @Override
    public void paint(Graphics g) {
        ImageIcon img = getSourceImage();
        g.clearRect(0, 0, getPreferredWidth(), getPreferredHeight());
        if (img == null) {
            return;
        }
        g.drawImage(img.getImage(), 0, 0, img.getImageObserver());
        g.setColor(Color.WHITE);
        g.setXORMode(Color.black);
        tx = Math.max(tx, getSourceTileset().startx);
        ty = Math.max(ty, getSourceTileset().starty);
        g.drawRect(tx, ty, getSourceTileset().tilew, getSourceTileset().tileh);
        
        int imgw = img.getIconWidth();
        int imgh = img.getIconHeight();
        int w = getSourceTileset().tilew;
        int h = getSourceTileset().tileh;
        int bw = getSourceTileset().bwidth;
        int bh = getSourceTileset().bheight;
    }
}
