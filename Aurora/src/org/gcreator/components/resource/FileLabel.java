/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
/*internal*/ class FileLabel extends JComponent implements MouseListener{
    private GFile file = null;
    private Project p;
    private String key;
    
    public FileLabel(Project p, String key){
        this.p = p;
        this.key = key;
        this.addMouseListener(this);
    }
    
    public void folderToPopup(Project p, Folder f, JPopupMenu pop){
        Vector v = f.getChildren();
        for(Object o : v){
            GObject g = (GObject) o;
            if(p.validOfType(g, key)){
                if(g instanceof GFile){
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                }
                
                if(g instanceof Folder){
                    FolderMenuItem i = new FolderMenuItem(this);
                    i.setVisible(true);
                    i.file = (Folder) g;
                    folderToPopup(p, f, i);
                }
            }
        }
    }
    
    public void folderToPopup(Project p, Folder f, JMenuItem pop){
        Vector v = f.getChildren();
        for(Object o : v){
            GObject g = (GObject) o;
            if(p.validOfType(g, key)){
                if(g instanceof GFile){
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                }
                
                if(g instanceof Folder){
                    FolderMenuItem i = new FolderMenuItem(this);
                    i.setVisible(true);
                    i.file = (Folder) g;
                    folderToPopup(p, f, i);
                }
            }
        }
    }
    
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){
        JPopupMenu pop = new JPopupMenu();
        folderToPopup(p, p, pop);
        pop.show(this, evt.getX(), evt.getY());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    
    public void setFile(GFile file){
        setFile(file, false);
    }
    
    public void setFile(GFile file, boolean trigger){
        this.file = file;
        updateUI();
        if(trigger)
            ;
    }
    
    public GFile getFile(){
        return file;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        Color c = getForeground();
        
        g.setColor(c);
        g.setFont(f);
        
        if(file==null){
            g.drawString("<none>", 1, fm.getHeight()+1);
            return;
        }
        
        int x = 1;
        
        try{
            WorkspaceCellRenderer r = (WorkspaceCellRenderer) Aurwindow.workspace.getCellRenderer();
            ImageIcon i = r.getImageFor(file.node);
            g.drawImage(i.getImage(), x, 1, i.getImageObserver());
            x += i.getIconWidth() + 1;
        }
        catch(Exception e){}
        
        g.drawString(file.name, x, fm.getHeight()+1);
    }
}
