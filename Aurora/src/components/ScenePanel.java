/*
 * ScenePanel.java
 * 
 * Created on 11/Set/2007, 15:12:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import components.popupmenus.ResourceMenu;
import javax.swing.*;
import java.awt.*;

import editors.*;
import core.*;
import fileclass.res.*;
import units.*;
import java.util.*;

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
        double zoom = root.getZoom();
        return (int) (root.getMapWidth() / zoom + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0));
    }
    
    @Override
    public int getHeight(){
        double zoom = root.getZoom();
        return (int) (root.getMapHeight() / zoom + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0));
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
        drawActors(g);
        if(root.isGridVisible())
            drawGrid(g);
    }
    
    public void drawActors(Graphics g){
        Scene scn = (Scene) root.file.value;
        Enumeration<ActorInScene> e = scn.actors.elements();
        while(e.hasMoreElements()){
            ActorInScene a = e.nextElement();
            fileclass.res.Actor b = (fileclass.res.Actor) a.actor.value;
            ObjectNode c = components.popupmenus.ResourceMenu.getObjectWithName(b.sprite, "sprite", root.project);
            fileclass.File d = (fileclass.File) c.object;
            fileclass.res.Sprite f = (fileclass.res.Sprite) d.value;
            ImageIcon h = f.getImageAt(0);
            if(h!=null)
                g.drawImage(h.getImage(), (int) (a.x * root.getZoom()), (int) (a.y * root.getZoom()), (int) (h.getIconWidth() * root.getZoom()), (int) (h.getIconHeight() * root.getZoom()), h.getImageObserver());
        }
    }
    
    public void drawField(Graphics g){
        g.setColor(root.getMapBGColor());
        g.fillRect(0, 0, getWidth(), getHeight());
    }
    
    public void drawGrid(Graphics g){
        Color c = root.getMapBGColor();
        int k = c.getRed() + c.getBlue() + c.getGreen();
        k /= 3;
        if(k > 150)
            g.setColor(Colorfeel.GridDarkColor);
        else
            g.setColor(Colorfeel.GridLightColor);
        int truew = root.getMapWidth();
        int trueh = root.getMapHeight();
        int snapx = root.getSnapX();
        int snapy = root.getSnapY();
        double zoom = root.getZoom();
        if(zoom==0)
            zoom = 0.5;
        if(!root.isIsometric()){
            for(int i = 0; i <= truew / snapx ; i++){
                g.drawLine((int) (i * snapx / zoom), 0,(int) ( i * snapx / zoom), getHeight());
            }
            for(int i = 0; i <= trueh / snapy ; i++){
                g.drawLine(0, (int) (i * snapy / zoom), getWidth(), (int) (i * snapy / zoom));
            }
        }
        else{
            if(truew/snapx>=trueh/snapy){
            for(int i = (0 - truew / snapx); i <= truew / snapx; i++){
                g.drawLine((int) (i * snapx / zoom), 0, (int) ((i * snapx) / zoom) + getHeight(), getHeight());
            }
            for(int i = (0 - truew / snapx); i <= truew / snapx ; i++){
                g.drawLine(getWidth(), (int) (i * snapy / zoom), 0, (int) ((i * snapy) / zoom) + getWidth());
            }
            }
            else{
            for(int i = (0 - trueh / snapy) - snapy / 2; i <= trueh / snapy + snapy / 2; i++){
                g.drawLine((int) (i * snapx / zoom), 0, (int) ((i * snapx) / zoom) + getHeight(), getHeight());
            }
            for(int i = (0 - trueh / snapy) - snapy / 2; i <= trueh / snapy + snapy / 2 ; i++){
                g.drawLine(getWidth(), (int) (i * snapy / zoom), 0 , (int) ((i * snapy) / zoom) + getWidth());
            }
            }
        }
    }
}
