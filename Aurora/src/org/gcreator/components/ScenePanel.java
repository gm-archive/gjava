/*
 * ScenePanel.java
 * 
 * Created on 11/Set/2007, 15:12:20
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import org.gcreator.editors.SceneEditor;
import javax.swing.*;
import java.awt.*;

import org.gcreator.editors.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.res.*;
import java.awt.event.*;
import org.gcreator.units.*;
import java.util.*;
import org.gcreator.components.popupmenus.*;

/**
 *
 * @author Luís
 */
public class ScenePanel extends JPanel implements MouseListener, MouseMotionListener{
    SceneEditor root;
    ScenePopupMenu popup;
    public ScenePanel(SceneEditor root){
        this.root = root;
        this.addMouseListener(this);
        popup = new ScenePopupMenu(root);
        this.addMouseListener(new PopupListener(this, popup));
        this.addMouseMotionListener(this);
    }
    
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){
        if(evt.getButton()==MouseEvent.BUTTON1){
            int a = root.mode();
            if(a==SceneEditor.INVALID)
                return;
            int x = (int) (evt.getX() * root.getZoom());
            int y = (int) (evt.getY() * root.getZoom());
            if(a==SceneEditor.ERASE)
                eraseActorsAt(x, y);
            if(a==SceneEditor.PENCIL)
                addActorAt(x, y);
            if(a==SceneEditor.TILEADD)
                addTileAt(x, y);
            root.updateScroll();
        }
    }
    public void mouseClicked(MouseEvent evt){}
    
    public void eraseActorsAt(int x, int y){
        root.eraseActorsAt(x, y);
    }
    
    public void eraseActorsAt(Rectangle r){
        root.eraseActorsAt(r);
    }
    
    public void addActorAt(int x, int y){
        // if there is no actor selected in the list to add, don't add it.
        if (root.curactor.getFile() == null)
            return;
        ActorInScene act = root.makeNewActor(x,y);
        if (act == null) {
            System.err.println("Error while adding actor at "+x+", "+y+" Actor returned from root is null.");
        }
        if(root.eraseActorsBelow()){
            Sprite s = (Sprite) act.Sactor.value;
            root.eraseActorsAt(new Rectangle(x, y, s.getImageAt(0).width, s.getImageAt(0).height));
        }
        /*
         * already done in root.makeNewActor()
         if(root.snapToGrid()){
            Scene s = (Scene) root.file.value;
            if(x%s.snapX>s.snapX/2){
                x /= s.snapX;
                x++;
                x *= s.snapX;
            }
            else{
                x /= s.snapX;
                x *= s.snapX;
            }
            if(y%s.snapY>s.snapY/2){
                y /= s.snapY;
                y++;
                y *= s.snapY;
            }
            else{
                y /= s.snapY;
                y *= s.snapY;
            }
        }*/
        ((Scene) root.file.value).actors.add(act);
    }
    
    public void addTileAt(int x, int y){
        Tile tile = root.makeNewTile(x, y);
        ((Scene) root.file.value).tiles.add(tile);
    }
     
    public int getWidth(){
        double zoom = root.getZoom();
        return (int) (root.getMapWidth() / zoom + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0));
    }
    
     
    public int getHeight(){
        double zoom = root.getZoom();
        return (int) (root.getMapHeight() / zoom + (root.isGridVisible()&&!root.isIsometric() ? 1 : 0));
    }
    
     
    public Dimension getSize(){
        return new Dimension(getWidth(), getHeight());
    }
    
     
    public Dimension getPreferredSize(){
        return getSize();
    }
    
     
    public Dimension getMinimumSize(){
        return getSize();
    }
    
     
    public Dimension getMaximumSize(){
        return getSize();
    }
    
    public int getMinimumDepth(){
        int result = Integer.MAX_VALUE;
        Scene scn = (Scene) root.file.value;
        Enumeration e = scn.actors.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            if (a == null) {
                System.out.println("[MinDepth]a is null!");
                return result;
            }
            if (a.Sactor == null) {
                System.out.println("[MinDepth]a.Sactor is null!");
                return Integer.MAX_VALUE;
            }
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) a.Sactor.value;
            if(b.depth<result)
                result = b.depth;
        }
        e = scn.tiles.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            Tile a = (Tile) e.nextElement();
            if(a.depth<result)
                result = a.depth;
        }
        return result;
    }
    
    public int getMaximumDepth(){
        int result = Integer.MIN_VALUE;
        Scene scn = (Scene) root.file.value;
        Enumeration e = scn.actors.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            if (a == null) {
                System.out.println("[MaxDepth]a is null!");
                return result;
            }
                
            if (a.Sactor == null) {
                System.out.println("[MaxDepth]a.Sactor is null!");
                return result;
            }
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) a.Sactor.value;
            if(b.depth>result)
                result = b.depth;
        }
        e = scn.tiles.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            Tile a = (Tile) e.nextElement();
            if(a.depth>result)
                result = a.depth;
        }
        return result;
    }
    
    public int getNextDepth(int Depth){
        int result = Integer.MIN_VALUE;
        Scene scn = (Scene) root.file.value;
        Enumeration e = scn.actors.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            if (a.Sactor == null) {
                System.out.println("[NextDepth]a.Sactor is null!");
                return Integer.MIN_VALUE;
            }
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) a.Sactor.value;
            if(b.depth>result&&b.depth<Depth)
                b.depth = result;
        }
        e = scn.tiles.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            Tile a = (Tile) e.nextElement();
            if(a.depth>result&&a.depth<Depth)
                a.depth = result;
        }
        return result;
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
    
    public void drawActors(Graphics g) {
        Scene scn = (Scene) root.file.value;
        if(scn.actors.isEmpty() && scn.tiles.isEmpty())
            return;
        Enumeration e;
        int dep = getMaximumDepth();
        int mindep = getMinimumDepth();
        while(dep>=mindep){
            e = scn.actors.elements();//<ActorInScene>
            while(e.hasMoreElements()){
                ActorInScene ascn = (ActorInScene) e.nextElement();
                if (ascn.Sactor == null) {
                    System.out.println("[drawActors]ascn.Sactor is null!");
                    return;
                }
                org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) ascn.Sactor.value;
                if(b.depth==dep){
                    try{
                    org.gcreator.fileclass.res.Sprite f = (org.gcreator.fileclass.res.Sprite) b.sprite.value;
                    ImageIcon h = f.getImageAt(0).image;
                    if(h!=null)
                        g.drawImage(
                                h.getImage(),
                                (int) ((ascn.x - f.originX) / root.getZoom()),
                                (int) ((ascn.y - f.originY) / root.getZoom()),
                                (int) (h.getIconWidth() / root.getZoom()),
                                (int) (h.getIconHeight() / root.getZoom()),
                                h.getImageObserver()
                        );
                    }
                    catch(NullPointerException ex){
                        System.out.println("Exception at addactors: "+ex);
                    }
                }
            }
            e = scn.tiles.elements();//<ActorInScene>
            while(e.hasMoreElements()){
                Tile ascn = (Tile) e.nextElement();
                if(ascn.depth==dep){
                    try{
                    ImageIcon h = ascn.getTilesetImage();
                    if(h!=null)
                        g.drawImage(
                                h.getImage(),
                                (int) ((ascn.dx) / root.getZoom()),
                                (int) ((ascn.dy) / root.getZoom()),
                                (int) (ascn.width / root.getZoom()),
                                (int) (ascn.height / root.getZoom()),
                                ascn.sx+((Tileset) ascn.tileset.value).startx,
                                ascn.sy+((Tileset) ascn.tileset.value).starty,
                                ascn.width,
                                ascn.height,
                                h.getImageObserver()
                        );
                    }
                    catch(NullPointerException ex){}
                }
            }
            if(dep<=mindep)
                break;
            dep = getNextDepth(dep);
        }
        /*while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) ((org.gcreator.fileclass.File)ResourceMenu.getObjectWithName(a.Sactor,"actor",gcreator.window.getCurrentProject()).object).value;
            ObjectNode c = b.getSpriteFile().node;
            if(c!=null){
                org.gcreator.fileclass.File d = (org.gcreator.fileclass.File) c.object;
                org.gcreator.fileclass.res.Sprite f = (org.gcreator.fileclass.res.Sprite) d.value;
                ImageIcon h = f.getImageAt(0);
                if(h!=null)
                    g.drawImage(h.getImage(), (int) ((a.x - f.originX) / root.getZoom()), (int) ((a.y - f.originY) / root.getZoom()), (int) (h.getIconWidth() / root.getZoom()), (int) (h.getIconHeight() / root.getZoom()), h.getImageObserver());
            }
        }*/
    }
    
    public void drawField(Graphics g){
        g.setColor(root.getMapBGColor());
        g.fillRect(0, 0, getWidth(), getHeight());
        try{
            Scene scn = (Scene) root.file.value;
            for(Object o : scn.backgrounds){
                drawBackground(g, (BackgroundInScene) o);
            }
        }
        catch(NullPointerException e){}
    }
    
    public void drawBackground(Graphics g, BackgroundInScene bg){
        ImageIcon i = ((GImage) bg.image.value).getImage();
        if(i==null)
            return;
        int hrep = bg.hmode;
        int vrep = bg.vmode;
        if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_SINGLE){
            g.drawImage(i.getImage(), 0, 0, (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_SINGLE){
            g.drawImage(i.getImage(), 0, 0, (int) (((Scene) root.file.value).width / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_STRETCH){
            g.drawImage(i.getImage(), 0, 0, (int) (((Scene) root.file.value).width / root.getZoom()), (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_STRETCH){
            g.drawImage(i.getImage(), 0, 0, (int) (i.getIconWidth() / root.getZoom()), (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_SINGLE){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++)
                g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), 0, (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_STRETCH){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++)
                g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), 0, (int) (i.getIconWidth() / root.getZoom()), (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconHeight() < ((Scene) root.file.value).height; j++)
                g.drawImage(i.getImage(), 0, (int) (j * i.getIconHeight() / root.getZoom()), (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconHeight() < ((Scene) root.file.value).height; j++)
                g.drawImage(i.getImage(), 0, (int) (j * i.getIconHeight() / root.getZoom()), (int) (((Scene) root.file.value).width / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++)
                for(int k = 0; k * i.getIconHeight() < ((Scene) root.file.value).height; k++)
                    g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), (int) (k * i.getIconHeight() / root.getZoom()), (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
    }
    
    public void drawGrid(Graphics gg){
        /*
        Color c = root.getMapBGColor();
        int k = c.getRed() + c.getBlue() + c.getGreen();
        k /= 3;
        if(k > 150)
            g.setColor(Colorfeel.GridDarkColor);
        else
            g.setColor(Colorfeel.GridLightColor);
         */
        Graphics g = gg.create();
        g.setColor(Color.BLACK);
        g.setXORMode(Color.white);
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

    public void mouseDragged(MouseEvent e) {
        //do nothing
    }

    public void mouseMoved(MouseEvent evt) {
        double zoom = root.getZoom();
        root.BottomLeft.setText("X:" + (int) (evt.getX()*zoom) + " Y:" + (int) (evt.getY()*zoom));
    }
}
