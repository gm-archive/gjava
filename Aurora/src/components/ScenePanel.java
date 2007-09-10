/*
 * ScenePanel.java
 * 
 * Created on 10/Set/2007, 21:44:22
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import javax.swing.*;
import java.awt.*;

import editors.SceneEditor;

/**
 *
 * @author Luís
 */
public class ScenePanel extends JPanel{
    private SceneEditor root;
    public ScenePanel(SceneEditor root){
        this.root = root;
    }
    
    @Override
    public Dimension getSize(){
        return new Dimension(root.getMapWidth(), root.getMapHeight());
    }
    
    @Override
    public int getWidth(){
        return root.getMapWidth();
    }
    
    @Override
    public int getHeight(){
        return root.getMapHeight();
    }
    
    public int getVisibleWidth(){
        return getWidth() < super.getWidth() ? getWidth() : super.getWidth();
    }
    
    public int getVisibleHeight(){
        return getHeight() < super.getHeight() ? getHeight() : super.getHeight();
    }
    
    @Override
    public void paintComponent(Graphics g){
        //Size should be placed as setSize
        
        g.setColor(root.getBackgroundColor());
        g.fillRect(0, 0, getVisibleWidth() / root.getZoom(), getVisibleHeight() / root.getZoom());
        
        if(root.isGridVisible())
            drawGrid(g, root.isIsometric());
    }
    
    public void drawGrid(Graphics g, boolean isometric){
        int wsize = getWidth();
        int hsize = getHeight();
        int vwsize = getVisibleWidth();
        int vhsize = getVisibleHeight();
        int snapx = root.getSnapX();
        int snapy = root.getSnapY();
        int zoom = root.getZoom();
        int scrollx = root.getScrollX();
        int scrolly = root.getScrollY();
        g.setColor(Color.BLACK);
        if(!isometric){
            for(int i = 0; i <= vhsize / snapx;i++)
                g.drawLine(0
                        , i * snapx / zoom
                        , vwsize / zoom + scrollx
                        , i * snapx / zoom);
            for(int i = 0; i <= vwsize / snapy; i++)
                g.drawLine(i * snapy / zoom 
                        , 0
                        , i * snapy / zoom
                        , vhsize / zoom);
        }
    }
}
