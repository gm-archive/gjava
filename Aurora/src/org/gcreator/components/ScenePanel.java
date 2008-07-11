/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import org.gcreator.editors.SceneEditor;
import javax.swing.*;
import java.awt.*;

import org.gcreator.editors.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.res.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import org.gcreator.units.*;
import java.util.*;
import org.gcreator.components.popupmenus.*;
import org.gcreator.fileclass.GFile;

/**
 *
 * @author Luís
 */
public class ScenePanel extends JPanel implements MouseListener, MouseMotionListener{
    private static final long serialVersionUID = 1;
    SceneEditor root;
    ScenePopupMenu popup;
    public final ImageIcon unknown;
    boolean draggingActor;
    ActorInScene actorDragging;
    boolean draggingTile;
    Tile tileDragging;
    Dimension dragOffset = new Dimension();
    
    public ScenePanel(SceneEditor root){
        this.root = root;
        this.addMouseListener(this);
        popup = new ScenePopupMenu(root);
        this.addMouseListener(new PopupListener(this, popup));
        this.addMouseMotionListener(this);
        unknown = new ImageIcon(getClass().getResource("/org/gcreator/resources/Unknown.png"));
        setDoubleBuffered(true);
    }
    
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){
        draggingActor = false;
        draggingTile = false;
        dragOffset.width = 0;
        dragOffset.height = 0;
    }
    public void mousePressed(MouseEvent evt){
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int a = root.mode();
            if(a == SceneEditor.INVALID) {
                return;
            }
            int x = (int) (evt.getX() * root.getZoom());
            int y = (int) (evt.getY() * root.getZoom());
            if (a == SceneEditor.ERASE) {
                eraseActorsAt(x, y);
            } else if (a == SceneEditor.PENCIL) {
                addActorAt(x, y);
            } else if (a == SceneEditor.EDIT) {
                moveActorAt(x, y);
            } else if (a == SceneEditor.TILEADD) {
                addTileAt(x, y);
            } else if (a == SceneEditor.TILEEDIT) {
                moveTileAt(x, y);
            } else if (a == SceneEditor.TILEERASE) {
                deleteTileAt(x, y);
            }
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
    
    @SuppressWarnings("unchecked")
    public void addActorAt(int x, int y){
        // if there is no actor selected in the list to add, don't add it.
        if (root.curactor.getFile() == null) {
            return;
        }
        ActorInScene act = root.makeNewActor(x,y);
        if (act == null) {
            System.err.println("Error while adding actor at "+x+", "+y+" Actor returned from root is null.");
        }
        if(root.eraseActorsBelow()){
            Sprite s;
            try{
                s = (Sprite) ((Actor) act.Sactor.value).sprite.value;
            }
            catch(Exception e){
                s = null;
            }
            root.eraseActorsAt(new Rectangle(x, y, s==null?16:s.getImageIconAt(0).getIconWidth(), s==null?16:s.getImageIconAt(0).getIconHeight()));
        }
        ((Scene) root.file.value).actors.add(act);
        draggingActor = true;
        actorDragging = act;
    }
    
    @SuppressWarnings("unchecked")
    public void addTileAt(int x, int y){
        Tile tile = root.makeNewTile(x, y);
        if (tile != null) {
            if(root.eraseActorsBelow()){
                root.eraseTilesAt(root.getTileLayer(), new Rectangle(x, y, tile.width, tile.height));
            }
            root.getTileLayer().add(tile);
            if(root.getTileLayer().optimize != null){
            Graphics g = root.getTileLayer().optimize.getImage().getGraphics();
            g.drawImage(tile.getTilesetImage().getImage().
                                 getScaledInstance((int)(tile.width/root.getZoom()), 
                                 (int)(tile.height/root.getZoom()), Image.SCALE_FAST),
                                 (int)(tile.x/root.getZoom()),(int) (tile.y/root.getZoom()), tile.getTilesetImage().getImageObserver());
            }
            draggingTile = true;
            tileDragging = tile;
        }
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
            int d;
            if(b==null) {
                d = 0;
            }
            else {
                d = b.depth;
            }
            if(d<result) {
                result = d;
            }
        }
        e = scn.tileLayers.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            TileLayer a = (TileLayer) e.nextElement();
            if (a == null) {
                return result;
            }
            if (a.depth < result) {
                result = a.depth;
            }
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
            int d;
            if(b!=null) {
                d = b.depth;
            }
            else {
                d = 0;
            }
            if(d>result) {
                result = d;
            }
        }
        e = scn.tileLayers.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            TileLayer a = (TileLayer) e.nextElement();
            if (a == null) {
                return result;
            }
            if(a.depth>result) {
                result = a.depth;
            }
        }
        return result;
    }
    
    public int getNextDepth(int Depth){
        int result = Integer.MIN_VALUE;
        Scene scn = (Scene) root.file.value;
        Enumeration e = scn.actors.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            if (a == null) {
                System.out.println("[NextDepth]a is null!");
                return result;
            }
            if (a.Sactor == null) {
                System.out.println("[NextDepth]a.Sactor is null!");
                return Integer.MIN_VALUE;
            }
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) a.Sactor.value;
            if (b == null) {
                b = new Actor();
            }
            if (b.depth > result && b.depth < Depth) {
                b.depth = result;
            }
        }
        e = scn.tileLayers.elements(); //<ActorInScene>
        while(e.hasMoreElements()){
            TileLayer a = (TileLayer) e.nextElement();
            if (a.depth > result && a.depth < Depth) {
                a.depth = result;
            }
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
        if(root.isGridVisible()) {
            drawGrid(g);
        }
    }
    
    public void drawActors(Graphics g) {
        Scene scn = (Scene) root.file.value;
        if(scn.actors.isEmpty() && scn.tileLayers.isEmpty()) {
            return;
        }
        Enumeration e;
        int dep = getMaximumDepth();
        int mindep = getMinimumDepth();
        Rectangle r = getVisibleRect();
        while(dep>=mindep){
            e = scn.actors.elements();//<ActorInScene>
            while(e.hasMoreElements()){
                ActorInScene ascn = (ActorInScene) e.nextElement();
                if (ascn.Sactor == null) {
                    System.out.println("[drawActors]ascn.Sactor is null!");
                    return;
                }
                org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) ascn.Sactor.value;
                if(b == null) {
                    b = new Actor();
                    //continue;
                }
                if (b.depth == dep) {
                        GFile sf = b.sprite;
                    org.gcreator.fileclass.res.Sprite f = null;
                    if (sf != null && sf.value != null) {
                        f = (org.gcreator.fileclass.res.Sprite) sf.value;
                    }
                    else
                        f = null; //Needed in order to use "unknown" image.
                    
                    
                    if (f!=null&&f.getImageIconAt(0) != null) {
                        ImageIcon h = f.getImageIconAt(0);
                        int x = (int) ((ascn.x - f.originX) / root.getZoom());
                        int y = (int) ((ascn.y - f.originY) / root.getZoom());
                        int width = (int) (h.getIconWidth() / root.getZoom());
                        int height = (int) (h.getIconHeight() / root.getZoom());
                        if(x>r.getX()+r.getWidth()||y>r.getY()+r.getHeight())
                            continue; //Don't bother drawing. It won't appear.
                        if(x+width<r.getX()||y+height<r.getY())
                            continue; //Don't bother drawing. It won't appear.
                        g.drawImage(
                                h.getImage(), x, y,
                                width, height,
                                h.getImageObserver()
                        );
                        g.setColor(Color.BLACK);
                        g.drawRect(x, y, width, height);
                    }
                    else {
                        g.drawImage(
                                unknown.getImage(), 
                                (int) (ascn.x / root.getZoom()), 
                                (int) (ascn.y / root.getZoom()), 
                                (int) (16 / root.getZoom()), 
                                (int) (16 / root.getZoom()), 
                                unknown.getImageObserver());
                    }
                }
            }
            Enumeration tle = scn.tileLayers.elements();
            while (tle.hasMoreElements()) {
                TileLayer l = (TileLayer) tle.nextElement();
                if (!l.visible) {
                    continue;
                }
                if (l.depth == dep) {
                    if(l.optimize!=null){
                        g.drawImage(l.optimize.getImage(), 0, 0, l.optimize.getImageObserver());
                        continue;
                    }
                    l.optimize = new ImageIcon(new BufferedImage(root.getMapWidth(), root.getMapHeight(), BufferedImage.TYPE_INT_ARGB));
                    Graphics ig = l.optimize.getImage().getGraphics();
                    e = l.tiles.elements();
                    while(e.hasMoreElements()){
                        Tile ascn = (Tile) e.nextElement();
                        try{
                        ImageIcon h = ascn.getTilesetImage();
                        if(h != null) {
                            //if(ascn.x>r.getX()+r.getWidth()||ascn.y>r.getY()+r.getHeight())
                            //    continue; //Don't bother drawing. It won't show up anyway.
                            //if(ascn.x+ascn.width<r.getX()||ascn.y+ascn.height<r.getY())
                            //    continue; //Don't bother drawing. It won't show up anyway.
                             ig.drawImage(h.getImage().
                                 getScaledInstance((int)(ascn.width/root.getZoom()), 
                                 (int)(ascn.height/root.getZoom()), Image.SCALE_FAST),
                                 (int)(ascn.x/root.getZoom()),(int) (ascn.y/root.getZoom()), h.getImageObserver());   
                            /*g.drawImage(
                                    h.getImage(),
                                    (int) ((ascn.dx) / root.getZoom()),
                                    (int) ((ascn.dy) / root.getZoom()),
                                    (int) (ascn.width / root.getZoom()),
                                    (int) (ascn.height / root.getZoom()),
                                    ascn.sx+((Tileset) ascn.file.value).startx,
                                    ascn.sy+((Tileset) ascn.file.value).starty,
                                    ascn.width,
                                    ascn.height,
                                    h.getImageObserver()
                                );
                                */
                            } else {
                                System.out.println("but h is null");
                            }
                        }
                        catch(NullPointerException ex){
                            System.out.println("[6794358]nullpointerexception: "+ex);
                        }
                    }
                    g.drawImage(l.optimize.getImage(), 0, 0, l.optimize.getImageObserver());
                }
            }
            if(dep<=mindep) {
                break;
            }
            dep = getNextDepth(dep);
        }
        /*while(e.hasMoreElements()){
            ActorInScene a = (ActorInScene)e.nextElement();
            org.gcreator.fileclass.res.Actor b = (org.gcreator.fileclass.res.Actor) 
         ((org.gcreator.fileclass.File)ResourceMenu.getObjectWithName(a.Sactor,"actor",gcreator.window.getCurrentProject()).object).value;
            ObjectNode c = b.getSpriteFile().node;
            if(c!=null){
                org.gcreator.fileclass.File d = (org.gcreator.fileclass.File) c.object;
                org.gcreator.fileclass.res.Sprite f = (org.gcreator.fileclass.res.Sprite) d.value;
                ImageIcon h = f.getImageAt(0);
                if(h!=null)
                    g.drawImage(h.getImage(), (int) ((a.x - f.originX) / root.getZoom()), 
         (int) ((a.y - f.originY) / root.getZoom()), (int) (h.getIconWidth() / root.getZoom()), (int) (h.getIconHeight() / root.getZoom()), h.getImageObserver());
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
        ImageIcon i = ((ImageIcon)bg.image.value);
        if(i==null) {
            return;
        }
        int hrep = bg.hmode;
        int vrep = bg.vmode;
        if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_SINGLE){
            g.drawImage(i.getImage(), 0, 0, (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_SINGLE){
            g.drawImage(i.getImage(), 0, 0, (int) (((Scene) root.file.value).width / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_STRETCH){
            g.drawImage(i.getImage(), 0, 0, (int) (((Scene) root.file.value).width / root.getZoom()), 
                    (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_STRETCH){
            g.drawImage(i.getImage(), 0, 0, (int) (i.getIconWidth() / root.getZoom()), 
                    (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_SINGLE){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++) {
                g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), 0, (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
            }
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_STRETCH){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++) {
                g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), 0, (int) (i.getIconWidth() / root.getZoom()), (int) (((Scene) root.file.value).height / root.getZoom()), i.getImageObserver());
            }
        }
        else if(hrep==BackgroundInScene.MODE_SINGLE&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconHeight() < ((Scene) root.file.value).height; j++) {
                g.drawImage(i.getImage(), 0, (int) (j * i.getIconHeight() / root.getZoom()), (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
            }
        }
        else if(hrep==BackgroundInScene.MODE_STRETCH&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconHeight() < ((Scene) root.file.value).height; j++) {
                g.drawImage(i.getImage(), 0, (int) (j * i.getIconHeight() / root.getZoom()), (int) (((Scene) root.file.value).width / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
            }
        }
        else if(hrep==BackgroundInScene.MODE_REPEAT&&vrep==BackgroundInScene.MODE_REPEAT){
            for(int j = 0; j * i.getIconWidth() < ((Scene) root.file.value).width; j++) {
                for (int k = 0; k * i.getIconHeight() < ((Scene) root.file.value).height; k++) {
                    g.drawImage(i.getImage(), (int) (j * i.getIconWidth() / root.getZoom()), (int) (k * i.getIconHeight() / root.getZoom()), (int) (i.getIconWidth() / root.getZoom()), (int) (i.getIconHeight() / root.getZoom()), i.getImageObserver());
                }
            }
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
        if(zoom==0) {
            zoom = 0.5;
        }
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
        if (draggingActor && actorDragging != null) {
            if (root.snapToGrid()) {
                Scene s = (Scene) root.file.value;
                actorDragging.x = (Math.round((e.getX()+dragOffset.width) / s.snapX) * s.snapX);
                actorDragging.y = (Math.round((e.getY()+dragOffset.height) / s.snapY) * s.snapY);
            } else {
                actorDragging.x = e.getX()+dragOffset.width;
                actorDragging.y = e.getY()+dragOffset.height;
            }
            repaint(0, 0, getPreferredSize().width, getPreferredSize().height);
        } else if (draggingTile && tileDragging != null) {
            if (root.snapToGrid()) {
                Scene s = (Scene) root.file.value;
                tileDragging.x = (Math.round((e.getX()+dragOffset.width) / s.snapX) * s.snapX);
                tileDragging.y = (Math.round((e.getY()+dragOffset.height) / s.snapY) * s.snapY);
            } else {
                tileDragging.x = e.getX()+dragOffset.width;
                tileDragging.y = e.getY()+dragOffset.height;
            }
            root.scene.tileLayers.get(tileDragging.layer).optimize = null;
            //for(TileLayer layer : root.scene.tileLayers)
            //    if(layer.depth==tileDragging.layer)
            //        layer.optimize = null;
            repaint(0, 0, getPreferredSize().width, getPreferredSize().height);
        }
        double zoom = root.getZoom();
        root.BottomLeft.setText("X: " + (int) (e.getX()*zoom) + " Y: " + (int) (e.getY()*zoom));
    }

    public void mouseMoved(MouseEvent evt) {
        double zoom = root.getZoom();
        root.BottomLeft.setText("X: " + (int) (evt.getX()*zoom) + " Y: " + (int) (evt.getY()*zoom));
    }

    private void deleteTileAt(int x, int y) {
        Tile t = root.findTileAt(x, y);
        if (t == null) {
            return;
        }
        root.getTileLayer().remove(t);
        repaint();
    }

    private void moveActorAt(int x, int y) {
        ActorInScene bob = root.findActorAt(x, y);
        if (bob == null) {
            return;
        }
        dragOffset.width = bob.x - x;
        dragOffset.height = bob.y - y;
        draggingActor = true;
        actorDragging = bob;
        repaint();
    }

    private void moveTileAt(int x, int y) {
        Tile t = root.findTileAt(x, y);
        if (t == null) {
            return;
        }
        dragOffset.width = t.x - x;
        dragOffset.height = t.y - y;
        draggingTile = true;
        tileDragging = t;
        repaint();
    }
}
