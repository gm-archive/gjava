/*
 * ScenePanel.java
 * 
 * Created on 11/Set/2007, 15:12:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import javax.swing.*;
import java.awt.*;

import editors.*;
import core.*;

/**
 *
 * @author Luís
 */
public class ScenePanel extends JComponent{
    SceneEditor root;
    public ScenePanel(SceneEditor root){
        this.root = root;
    }
    
    @Override
    public int getWidth(){
        return root.getMapWidth() / root.getZoom() + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0);
    }
    
    @Override
    public int getHeight(){
        return root.getMapHeight() / root.getZoom() + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0);
    }
    
    @Override
    public Dimension getSize(){
        return new Dimension(getWidth(), getHeight());
    }
    
    @Override
    public Dimension getPreferredSize(){
        return getSize();
    }
    
    @Override
    public Dimension getMinimumSize(){
        return getSize();
    }
    
    @Override
    public Dimension getMaximumSize(){
        return getSize();
    }
    
    @Override
    public void update(Graphics g){
        super.update(g);
        super.setSize(getWidth(), getHeight());
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawField(g);
        if(root.isGridVisible())
            drawGrid(g);
    }
    
    public void drawField(Graphics g){
        g.setColor(Colorfeel.FieldBGColor);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void drawGrid(Graphics g){
        g.setColor(Colorfeel.GridColor);
        int truew = root.getMapWidth();
        int trueh = root.getMapHeight();
        int snapx = root.getSnapX();
        int snapy = root.getSnapY();
        int zoom = root.getZoom();
        if(!root.isIsometric()){
            for(int i = 0; i <= truew / snapx ; i++){
                g.drawLine(i * snapx / zoom, 0, i * snapx / zoom, getHeight());
            }
            for(int i = 0; i <= trueh / snapy ; i++){
                g.drawLine(0, i * snapy / zoom, getWidth(), i * snapy / zoom);
            }
        }
        else{
            if(truew>trueh){
            for(int i = (0 - truew / snapx); i <= truew / snapx ; i++){
                g.drawLine(i * snapx / zoom, 0, (i * snapx) / zoom + getHeight(), getHeight());
            }
            for(int i = (0 - truew / snapx); i <= truew / snapx ; i++){
                g.drawLine(getWidth(), i * snapy / zoom,0 , (i * snapy) / zoom + getWidth());
            }
            }
            else{
            for(int i = (0 - trueh / snapy); i <= trueh / snapy ; i++){
                g.drawLine(i * snapx / zoom, 0, (i * snapx) / zoom + getHeight(), getHeight());
            }
            for(int i = (0 - trueh / snapy); i <= trueh / snapy ; i++){
                g.drawLine(getWidth(), i * snapy / zoom,0 , (i * snapy) / zoom + getWidth());
            }
            }
        }
    }
}
