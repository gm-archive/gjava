/*
 * Changes Copyright (C) 2007 TGMG www.g-creator.org
 * Copyright (C) 2007 Clam <ebordin@aapt.net.au>
 *
 * This file was modified from LGM and is licensed under the GNU GPL v3.
 * See README for more details
 */

package org.gcreator.components;

import org.gcreator.editors.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SubimagePreview extends JPanel implements MouseListener{

    private static final long serialVersionUID = 1L;
    private SpriteEditor editor;

    public SubimagePreview(SpriteEditor frame) {
        super();
        editor = frame;
        addMouseListener(this);
    }

    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){
        editor.jSpinner1.setValue(evt.getX());
        editor.jSpinner2.setValue(evt.getY());
    }
    public void mousePressed(MouseEvent evt){
        editor.jSpinner1.setValue(evt.getX());
        editor.jSpinner2.setValue(evt.getY());
    }
    public void mouseClicked(MouseEvent evt){
        editor.jSpinner1.setValue(evt.getX());
        editor.jSpinner2.setValue(evt.getY());
    }
     
    public void paint(Graphics g) {
        boolean isBlack = true;
        for (int i = 0; i <= getWidth() / 10; i++) {
            boolean isNBlack = isBlack;
            for (int j = 0; j <= getHeight() / 10; j++) {
                if (isBlack = !isBlack) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.fillRect(i * 10 + 1, j * 10 + 1, 10, 10);
            }
            isBlack = !isNBlack;
        }

        if (editor.getCurrentImage() != null) {
            g.drawImage(editor.getCurrentImage().getImage(), 0, 0, editor.getCurrentImage().getImageObserver());
        }
        g.setColor(Color.BLACK);
        g.drawLine(editor.sprite.originX-10, editor.sprite.originY, editor.sprite.originX+10, editor.sprite.originY);
        g.drawLine(editor.sprite.originX, editor.sprite.originY-10, editor.sprite.originX, editor.sprite.originY+10);
        g.drawRect(editor.sprite.BBleft-1, editor.sprite.BBTop-1, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
        g.drawRect(editor.sprite.BBleft+1, editor.sprite.BBTop+1, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
        g.setColor(Color.WHITE);
        g.drawRect(editor.sprite.BBleft, editor.sprite.BBTop, editor.sprite.width-editor.sprite.BBRight-editor.sprite.BBleft, editor.sprite.height-editor.sprite.BBTop-editor.sprite.BBBottom);
    }
    
     
    public int getWidth(){
        if(editor.getCurrentImage()==null)
            return 0;
        return editor.getCurrentImage().getIconWidth();
    }
    
     
    public int getHeight(){
        if(editor.getCurrentImage()==null)
            return 0;
        return editor.getCurrentImage().getIconHeight();
    }
    
     
    public Dimension getPreferredSize(){
        return new Dimension(getWidth(), getHeight());
    }
}