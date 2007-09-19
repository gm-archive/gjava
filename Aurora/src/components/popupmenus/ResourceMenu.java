/*
 * ResourceMenu.java
 * 
 * Created on 16-Sep-2007, 03:10:07
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components.popupmenus;

import core.aurora;
import fileclass.Project;
import fileclass.res.Resource;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import units.ObjectNode;
import managers.*;

/**
 *
 * @author Ali1
 */
public class ResourceMenu extends JPanel implements MouseListener,
		ActionListener {
    public String kind;
    public JLabel label;
    JButton button;
    JPopupMenu pm;
    JMenuItem noresource;
    JMenu res;
    Project pro;

    public ResourceMenu(String kind, String def, boolean showDef, Project pro)
    {
        this.pro = pro;
        this.kind = kind;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		label = new JLabel(def);
		label.setBorder(BorderFactory.createEtchedBorder());
		label.addMouseListener(this);
		add(label,gbc);
		gbc = new GridBagConstraints();
		button = new JButton("...");
		button.addMouseListener(this);
		button.setPreferredSize(new Dimension(20,19));
		button.setMaximumSize(button.getPreferredSize());
		add(button,gbc);

		pm = new JPopupMenu();
		if (showDef)
			{
			noresource = pm.add(new JMenuItem(def));
			noresource.addActionListener(this);
			}
		populate();
		

    }
    
    public void updateUI(){
        super.updateUI();
        populate();
    }
    
    public void populate()
    {
        if(pm==null)
            return;
        pm.removeAll();
        pm.add(noresource);
        Vector vect;
        Enumeration e = pro.node.children();
        if (kind.equals("actor"))
            e = pro.node.getChildAt(3).children();
        else if (kind.equals("scene"))
            e = pro.node.getChildAt(5).children();
        else if (kind.equals("image"))
            e = pro.node.getChildAt(0).children();
        else if (kind.equals("sprite"))
            e = pro.node.getChildAt(1).children();
        else if (kind.equals("sound"))
            e = pro.node.getChildAt(2).children();
        else if (kind.equals("class"))
            e = pro.node.getChildAt(4).children();
        res = null;
        populatefromEnum(e);

    }
    
    private void populatefromEnum(Enumeration e)
    {
        while (e.hasMoreElements()) {
            Object object = (Object) e.nextElement();
            ObjectNode node = (ObjectNode) object;
            System.out.println(""+node.object.name);
            if (node.object instanceof fileclass.Group)
            {
                JMenu resbackup = null;
                if (res != null)
                    resbackup =res;
                res = new JMenu(node.object.name);
                populatefromEnum(node.object.node.children());
                if (res ==null)
                    res = resbackup;
                if (node.object.node.getChildCount() != 0 && res !=null)
                pm.add(res);
//                if (resbackup != null)
//                    res = resbackup;
                res=null;
            }
            else if (res == null)
            {
                pm.add(new JMenuItem(node.object.name)).addActionListener(this);
            }
            else
            {
                //group
              res.add(new JMenuItem(node.object.name)).addActionListener(this);
            }
                        
        }
    }
    
    public void mouseClicked(MouseEvent e) {
        populate();
        if (pm.getComponentCount() == 0) return;
		pm.show(e.getComponent(),e.getX(),e.getY());
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
       
    }

    public void actionPerformed(ActionEvent e) {
       label.setText(e.getActionCommand());
        for(ActionListener listen : listeners){
            listen.actionPerformed(e);
        }
    }
    
    ActionListener[] listeners = new ActionListener[10];
    
    public void addActionListener(ActionListener a){
        int i = 0;
        while(listeners[i]!=null)
            i++;
        listeners[i] = a;
    }
}
