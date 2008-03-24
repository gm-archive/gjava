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
    private Vector<ActionListener> a = new Vector<ActionListener>();
    
    public FileLabel(Project p, String key){
        this.p = p;
        this.key = key;
        this.addMouseListener(this);
    }
    
    public void folderToPopup(Project p, Folder f, JPopupMenu pop){
        Vector v = f.getChildren();
        for(Object o : v){
            GObject g = (GObject) o;
            System.out.println("Object " + g.name);
            if(p.validOfType(g, key)){
                System.out.println("Valid");
                if(g instanceof GFile){
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                    pop.add(i);
                }
                
                if(g instanceof Folder){
                    FolderMenuItem i = new FolderMenuItem();
                    i.setVisible(true);
                    i.file = (Folder) g;
                    folderToPopup(p, (Folder) g, i);
                    pop.add(i);
                }
            }
        }
    }
    
    public void folderToPopup(Project p, Folder f, JMenuItem pop){
        Vector v = f.getChildren();
        for(Object o : v){
            GObject g = (GObject) o;
            System.out.println("Object " + g.name);
            if(p.validOfType(g, key)){
                System.out.println("Valid");
                if(g instanceof GFile){
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                    pop.add(i);
                }
                
                if(g instanceof Folder){
                    FolderMenuItem i = new FolderMenuItem();
                    i.setVisible(true);
                    i.file = (Folder) g;
                    pop.add(i);
                    folderToPopup(p, (Folder) g, i);
                }
            }
        }
    }
    
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){
        Folder f = p.getFolderFor(key);
        if(f==null)
            return;
        JPopupMenu pop = new JPopupMenu();
        FileMenuItem i = new FileMenuItem(this);
        i.setVisible(true);
        i.file = null;
        pop.add(i);
        folderToPopup(p, f, pop);
        pop.show(this, evt.getX(), evt.getY());
    }
    public void mouseReleased(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    
    public void setFile(GFile file){
        setFile(file, false);
    }
    
    public void setFile(GFile file, boolean trigger){
        this.file = file;
        this.repaint();
        if(trigger)
            for(ActionListener al : a){
                al.actionPerformed(null);
            }
    }
    
    public GFile getFile(){
        return file;
    }
    
    public void addActionListener(ActionListener a){
        this.a.add(a);
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
