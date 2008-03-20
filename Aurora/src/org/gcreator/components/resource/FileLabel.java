/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components.resource;

import java.awt.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.fileclass.*;

/**
 *
 * @author Luís
 */
/*internal*/ class FileLabel extends JComponent{
    private GFile file = null;
    
    public FileLabel(){
    
    }
    
    public void setFile(GFile file){
        this.file = file;
        updateUI();
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
