/*
 * RoomPanel.java
 *
 * Created on 27 February 2007, 23:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.JGM.roomeditor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author ali1
 */
public class RoomPanel extends JPanel implements MouseListener {
    
    /** Creates a new instance of RoomPanel */
    public RoomPanel() {
        this.setPreferredSize(new Dimension(1640,4180));
        
    }
    
    int xInc=16, yInc=16;
    
    public void setGrid(int x, int y)
    {
        this.xInc = x;
        this.yInc = y;
    }
    
    
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        //fill with backcolor
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect( 0, 0,  getWidth(), getHeight() );
        
        
        //Draw the Grid
        g.setColor(Color.black);
        // row lines
        for(int j = 0; j <= getHeight(); j=j+yInc) {
            g2.draw(new Line2D.Double(0, j, getWidth(), j));
            
        }
        // col lines
        
        for(int j = 0; j <=  getWidth(); j=j+xInc) {
            g2.draw(new Line2D.Double(j, 0, j, getHeight()));
        }
    }

    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
