/*
 * ImagePane.java
 *
 * Created on 8 de Maio de 2008, 21:44
 */

package org.gcreator.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.gcreator.editors.*;

/**
 *
 * @author  luis
 */
public class ImagePane extends JPanel {

    public ImageEditor2 editor;
    private Cursor c = null;
    private Cursor c2 = null;
    private int px, py;
    private int cx, cy;
    private boolean drawing = false;
    private boolean kstate = false;
    private boolean resizing = false;
    
    /** Creates new form ImagePane */
    public ImagePane(ImageEditor2 _editor) {
        editor = _editor;
        initComponents();
        addMouseListener(new MouseListener(){
            public void mouseExited(MouseEvent evt){
                if(c!=null)
                    setCursor(c);
            }
            
            public void mouseEntered(MouseEvent evt){
                c = getCursor();
                
                if(editor.jToggleButton1.isSelected()||
                        editor.jToggleButton2.isSelected()||
                        editor.jToggleButton3.isSelected()||
                        editor.jToggleButton4.isSelected()){
                    setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
                }
            }
            
            public void mouseReleased(MouseEvent evt){
                if(editor.jToggleButton2.isSelected()&&drawing){
                    Graphics g = editor.i.getImage().getImage().getGraphics();
                    Color c = editor.colorSelection2.getBackground();
                    c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
                    g.setColor(c);
                    //g.drawLine((int) (px * getZoom()), (int) (py*getZoom()), (int) (evt.getX() * getZoom()), (int) (evt.getY() * getZoom()));
                    //g.drawLine(px, py, evt.getX(), evt.getY());
                    g.drawLine((int) (px / getZoom()), (int) (py / getZoom()), (int) (evt.getX() / getZoom()), (int) (evt.getY() / getZoom()));
                    drawing = false;
                    repaint();
                    editor.changed = true;
                }
                if(editor.jToggleButton3.isSelected()&&drawing){
                    Graphics g = editor.i.getImage().getImage().getGraphics();
                    Color c = editor.colorSelection2.getBackground();
                    c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
                    g.setColor(c);
                    //g.drawLine((int) (px * getZoom()), (int) (py*getZoom()), (int) (evt.getX() * getZoom()), (int) (evt.getY() * getZoom()));
                    //g.drawLine(px, py, evt.getX(), evt.getY());
                    int x1 = px>evt.getX()?evt.getX():px;
                    int x2 = px<evt.getX()?evt.getX():px;
                    int y1 = py>evt.getY()?evt.getY():py;
                    int y2 = py<evt.getY()?evt.getY():py;
                    g.drawRect(
                            (int) (x1 / getZoom()), (int) (y1 / getZoom()), (int) ((x2-x1) / getZoom()), (int) ((y2-y1) / getZoom()));
                    drawing = false;
                    repaint();
                    editor.changed = true;
                }
                if(editor.jToggleButton4.isSelected()&&drawing){
                    Graphics g = editor.i.getImage().getImage().getGraphics();
                    Color c = editor.colorSelection2.getBackground();
                    c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
                    g.setColor(c);
                    //g.drawLine((int) (px * getZoom()), (int) (py*getZoom()), (int) (evt.getX() * getZoom()), (int) (evt.getY() * getZoom()));
                    //g.drawLine(px, py, evt.getX(), evt.getY());
                    int x1 = px>evt.getX()?evt.getX():px;
                    int x2 = px<evt.getX()?evt.getX():px;
                    int y1 = py>evt.getY()?evt.getY():py;
                    int y2 = py<evt.getY()?evt.getY():py;
                    g.fillRect(
                            (int) (x1 / getZoom()), (int) (y1 / getZoom()), (int) ((x2-x1) / getZoom()), (int) ((y2-y1) / getZoom()));
                    drawing = false;
                    repaint();
                    editor.changed = true;
                }
            }
            
            public void mousePressed(MouseEvent evt){
                if(kstate){
                    px = (int) (evt.getX() / getZoom());
                    py = (int) (evt.getY() / getZoom());
                    resizing = true;
                    editor.changed = true;
                }
                else if(editor.jToggleButton1.isSelected()){
                    drawPixelIn(evt.getX(), evt.getY(), false);
                    editor.changed = true;
                }
                else if(editor.jToggleButton2.isSelected()){
                    px = evt.getX();
                    py = evt.getY();
                    cx = px;
                    cy = py;
                    drawing = true;
                }
                else if(editor.jToggleButton3.isSelected()){
                    px = evt.getX();
                    py = evt.getY();
                    cx = px;
                    cy = py;
                    drawing = true;
                }
                else if(editor.jToggleButton4.isSelected()){
                    px = evt.getX();
                    py = evt.getY();
                    cx = px;
                    cy = py;
                    drawing = true;
                }
            }
            
            public void mouseClicked(MouseEvent evt){
                
            }
        });
        
        addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent evt){
                if(evt.getX()>getPreferredWidth()-10&&
                        evt.getY()>getPreferredHeight()-10
                        &&evt.getX()<getPreferredWidth()
                        &&evt.getY()<getPreferredHeight()){
                    if(!kstate){
                        c2 = getCursor();
                        setCursor(new Cursor(Cursor.SE_RESIZE_CURSOR));
                        kstate = true;
                    }
                }
                else{
                    if(kstate){
                        setCursor(c2);
                        kstate = false;
                    }
                }
            }
            
            public void mouseDragged(MouseEvent evt){
                if(editor.jToggleButton1.isSelected()){
                    drawPixelIn(evt.getX(), evt.getY(), true);
                    editor.changed = true;
                }
                if(editor.jToggleButton2.isSelected()||editor.jToggleButton3.isSelected()
                        ||editor.jToggleButton4.isSelected()){
                    cx = evt.getX();
                    cy = evt.getY();
                    repaint();
                }
            }
        });
    }
    
    public void drawPixelIn(int x, int y, boolean continuous){
        int rx = (int) (x / getZoom());
        int ry = (int) (y / getZoom());
        //int rx = x;
        //int ry = y;
        
        Graphics g = editor.i.getImage().getImage().getGraphics();
        Color c = editor.colorSelection2.getBackground();
        c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
        g.setColor(c);
        if(!continuous)
            g.drawRect(rx, ry, 1, 1);
        else
            g.drawLine(px, py, rx, ry);
        repaint();
        
        px = rx;
        py = ry;
    }
    
    public int getPreferredWidth(){
        return (int)(editor.i.image.getIconWidth()*getZoom())+10;
    }
    
    public int getPreferredHeight(){
        return  (int) (editor.i.image.getIconHeight()*getZoom())+10;
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(getPreferredWidth(),
               getPreferredHeight());
    }
    
    public double getZoom(){
        switch (editor.i.zoom) {
            case 5:
                return 6;
            case 4:
                return 5;
            case 3:
                return 4;
            case 2:
                return 3;
            case 1:
                return 2;
            case 0:
                return 1;
            case -1:
                return 0.5;
            case -2:
                return 0.33;
            case -3:
                return 0.25;
            case -4:
                return 0.2;
            default:
                return 0.16;
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        ImageIcon img = editor.i.getImage();
        
        g.setColor(editor.i.transparentColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.drawImage(img.getImage(), 0, 0, (int) (img.getIconWidth()*getZoom()),
                (int) (img.getIconHeight()*getZoom()), img.getImageObserver());
        
        if(editor.jToggleButton2.isSelected()&&drawing){
            Color c = editor.colorSelection2.getBackground();
            c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
            g.setColor(c);
            g.drawLine(px, py, cx, cy);
        }
        if(editor.jToggleButton3.isSelected()&&drawing){
            Color c = editor.colorSelection2.getBackground();
            c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
            g.setColor(c);
            g.drawRect(px<cx?px:cx, py<cy?py:cy, px<cx?cx-px:px-cx, py<cy?cy-py:py-cy);
        }
        if(editor.jToggleButton4.isSelected()&&drawing){
            Color c = editor.colorSelection2.getBackground();
            c = new Color(c.getRed(), c.getGreen(), c.getBlue(), (Integer) editor.jSpinner2.getValue());
            g.setColor(c);
            g.fillRect(px<cx?px:cx, py<cy?py:cy, px<cx?cx-px:px-cx, py<cy?cy-py:py-cy);
        }
        
        g.setColor(Color.black);
        g.fillRect(getPreferredWidth()-10, getPreferredHeight()-10, 10, 10);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
