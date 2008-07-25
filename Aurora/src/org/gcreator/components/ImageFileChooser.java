/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import org.gcreator.core.gcreator;


/**
 *
 * @author Srege Humphrey
 */
public class ImageFileChooser extends JFileChooser {
    
    {   FilePreviewer p = new FilePreviewer();
        setAccessory(p);
        addPropertyChangeListener(p);
    }

    public ImageFileChooser(File f) {
        super(f);
    }
}
class FilePreviewer extends JComponent implements PropertyChangeListener {
    ImageIcon thumbnail = null;
    JButton button;
    File file;
    
    public FilePreviewer() {
	setPreferredSize(new Dimension(100, 50));
        ImageIcon img = new ImageIcon(this.getClass().getResource("/org/gcreator/resources/tree/img.png"));
        button = new JButton(img);
        button.setSize(30, 24);
        button.setLocation(3, 4);
        button.setEnabled(false);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (file == null) {
                        return;
                    }
                    ImageIcon img = new ImageIcon(file.toURI().toURL());
                    JLabel l = new JLabel(img);
                    final JDialog d = new JDialog(gcreator.window, "Image Preview", true);
                    d.setUndecorated(true);
                    d.addFocusListener(new FocusListener() {

                        @Override
                        public void focusGained(FocusEvent e) {
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                            d.dispose();
                        }
                    });
                    l.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            d.dispose();
                        }
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            d.dispose();
                        }
                    });
                    JScrollPane pane = new JScrollPane(l);
                    d.add(pane);
                    d.setSize(Math.min((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()*4/5, img.getIconWidth()+14),
                            Math.min((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()*4/5, img.getIconHeight()+14));
                    d.setLocationRelativeTo(null);
                    d.setVisible(true);
                    d.requestFocusInWindow();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(FilePreviewer.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        add(button);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    }
    
    public void loadImage(File f) {
        this.file = f;
        if (f == null) {
            thumbnail = null;
            button.setEnabled(false);
        } else {
            if (f.isDirectory()) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
            }
            
	    ImageIcon tmpIcon = new ImageIcon(f.getPath());
	    if(tmpIcon.getIconWidth() > 90) {
		thumbnail = new ImageIcon(
		    tmpIcon.getImage().getScaledInstance(90, -1, Image.SCALE_DEFAULT));
	    } else {
		thumbnail = tmpIcon;
	    }
	}
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent e) {
	String prop = e.getPropertyName();
	if(prop == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
	    if(isShowing()) {
                loadImage((File) e.getNewValue());
		repaint();
	    }
	}
    }
    
        @Override
    public void paint(Graphics g) {
	super.paint(g);
	if(thumbnail != null) {
	    int x = getWidth()/2 - thumbnail.getIconWidth()/2;
	    int y = getHeight()/2 - thumbnail.getIconHeight()/2;
	    if(y < 0) {
		y = 0;
	    }
	    
	    if(x < 5) {
		x = 5;
	    }
	    thumbnail.paintIcon(this, g, x, y);
	}
    }
}