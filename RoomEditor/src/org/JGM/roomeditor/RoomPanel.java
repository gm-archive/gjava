/*
 * RoomPanel.java
 *
 *
 * This the is panel in the romm editor that displays the actual room!
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
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ali1
 */
public class RoomPanel extends JPanel implements MouseListener,Runnable {
    
    public Vector instances = new Vector();
    public RoomEditor rm;
    boolean running = true;
    
    /** Creates a new instance of RoomPanel */
    public RoomPanel(RoomEditor rm) {
        this.rm = rm;
        this.setPreferredSize(new Dimension(640,480));
        this.addMouseListener(this);
       // Thread t = new Thread(this);
        //t.start();
    }
    
    
    int xInc=16, yInc=16;
    
    public void setGrid(int x, int y) {
        this.xInc = x;
        this.yInc = y;
    }
    
    
    public static final String REAL_NUMBER = "^[-+]?\\d+(\\.\\d+)?$";
    
    //----------------------------------------------------------------------------------------------
    /**
     * Determines if a string contains only digits, decimal points & hyphens.
     * @param string The string to check.
     * @return <code>True</code> if it has only digits, else <code>false</code>.
     * @since J2SE 1.4
     */
    public static boolean isNumeric(String string) {
        return string.matches(REAL_NUMBER);
    }
    
    public void setrmsize(int w, int h)
    {
        this.setPreferredSize(new Dimension(w,h));
    }
    
    public void paint(Graphics g) {
        
        //set size height
       if (Integer.parseInt(rm.jTextField3.getText()) != this.getHeight() ) {
             if (isNumeric(rm.jTextField3.getText()))
        {
            setSize(getWidth(),Integer.parseInt(rm.jTextField3.getText()));
            setPreferredSize(new Dimension(getWidth(),Integer.parseInt(rm.jTextField3.getText())));

            rm.jTextField3.setBackground(Color.white);
            rm.jScrollPane3.repaint();
        } else {
            rm.jTextField3.setBackground(Color.red);
            rm.data.setModified(true);
        }
        }
        //width
       
        if (Integer.parseInt(rm.jTextField2.getText()) != this.getWidth() ) {
             if (isNumeric(rm.jTextField2.getText()))
        {
            setSize(Integer.parseInt(rm.jTextField2.getText()),getHeight());
            setPreferredSize(new Dimension(Integer.parseInt(rm.jTextField2.getText()),getHeight()));

            rm.jTextField2.setBackground(Color.white);
            rm.jScrollPane3.repaint();
        } else {
            rm.jTextField2.setBackground(Color.red);
            rm.data.setModified(true);
        }
        }
        
        //grid
        if (isNumeric(rm.jTextField5.getText())) {
            this.xInc= Integer.parseInt(rm.jTextField5.getText());
            rm.jTextField5.setBackground(Color.white);
        } else{
            
            
            rm.jTextField5.setBackground(Color.red);
            rm.data.setModified(true);
        }
        
        if (isNumeric(rm.jTextField6.getText())) {
            this.yInc= Integer.parseInt(rm.jTextField6.getText());
            rm.jTextField6.setBackground(Color.white);
        } else {
            rm.jTextField6.setBackground(Color.red);
            rm.data.setModified(true);
        }
        
        //fill with backcolor
        g.setColor(rm.jTextField7.getBackground());
        g.fillRect( 0, 0,  getWidth(), getHeight() );
        
        // draw instances
        instances.elements();
        for (Enumeration e = instances.elements() ; e.hasMoreElements() ;) {
            instance i = (instance)e.nextElement();
            //if (i ==null)
            //g.drawImage(i.getimg().getImage(), i.x, i.y,null);
            //System.out.println(""+i.x);
            g.setColor(Color.BLUE);
            //g.drawString(i.actor, i.x, i.y);
            g.drawImage(i.img.getImage(), i.x, i.y, null);
        }
        
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        
        
        
        //Draw the Grid
        if (rm.jCheckBox2.isSelected()) {
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
        
    }
    
    public void mouseClicked(MouseEvent arg0) {
        int ii = 0;
        if(arg0.getButton()==arg0.BUTTON3)
            for (Enumeration e = instances.elements() ; e.hasMoreElements() ;) {
                instance i = (instance)e.nextElement();
                if (i.r.contains(arg0.getX(),arg0.getY())) {
                    if(!i.locked) {
                        
                        instances.remove(ii) ;
                        rm.data.setModified(true);
                    }
                }
                ii++;
            }
        
        repaint();
    }
    
    public void mousePressed(MouseEvent arg0) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void mouseReleased(MouseEvent arg0) {
        if (!rm.actor.equals(""))
        if(arg0.getButton()==arg0.BUTTON1){
            //JOptionPane.showMessageDialog(rm, "snap!");
            double tempx = Math.floor(arg0.getX()/Double.parseDouble(rm.jTextField5.getText())) * Math.round(Double.parseDouble(rm.jTextField5.getText()));
            double tempy = Math.floor(arg0.getY()/Double.parseDouble(rm.jTextField6.getText())) * Math.round(Double.parseDouble(rm.jTextField6.getText()));

            instances.add(new instance((int)tempx,(int)tempy,rm.actor,rm.actorimg,false));
            rm.data.setModified(true);
        }
        repaint();
    }
    
    public void mouseEntered(MouseEvent arg0) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void mouseExited(MouseEvent arg0) {
        //  throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    public void run() {
        while(running) {
            repaint();
            rm.repaint();
            rm.jScrollPane3.repaint();
        }
    }
    
}
