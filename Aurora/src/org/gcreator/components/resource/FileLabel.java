/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.resource;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import org.gcreator.components.impl.WorkspaceCellRenderer;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.GObject;
import org.gcreator.fileclass.Project;


/**
 *
 * @author Luís
 */
/*internal*/ class FileLabel extends JComponent implements MouseListener {

    private GFile file = null;
    private Project p;
    private String key;
    private Vector<ActionListener> a = new Vector<ActionListener>();
    private boolean savecheck = true;

    public FileLabel(Project p, String key) {
        this.p = p;
        this.key = key;
        this.addMouseListener(this);
    }

    public void folderToPopup(Project p, Folder f, JPopupMenu pop) {
        Vector v = f.getChildren();
        for (Object o : v) {
            GObject g = (GObject) o;
            System.out.println("Object " + g.name);
            if (p.validOfType(g, key)) {
                System.out.println("Valid");
                if (g instanceof GFile) {
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                    pop.add(i);
                }

                if (g instanceof Folder) {
                    FolderMenuItem i = new FolderMenuItem();
                    i.setVisible(true);
                    i.file = (Folder) g;
                    folderToPopup(p, (Folder) g, i);
                    pop.add(i);
                }
            }
        }
    }

    public void folderToPopup(Project p, Folder f, JMenuItem pop) {
        Vector v = f.getChildren();
        for (Object o : v) {
            GObject g = (GObject) o;
            System.out.println("Object " + g.name);
            if (p.validOfType(g, key)) {
                System.out.println("Valid");
                if (g instanceof GFile) {
                    FileMenuItem i = new FileMenuItem(this);
                    i.setVisible(true);
                    i.file = (GFile) g;
                    pop.add(i);
                }

                if (g instanceof Folder) {
                    FolderMenuItem i = new FolderMenuItem();
                    i.setVisible(true);
                    i.file = (Folder) g;
                    pop.add(i);
                    folderToPopup(p, (Folder) g, i);
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent evt) {
    }

    @Override
    public void mouseEntered(MouseEvent evt) {
    }

    @Override
    public void mousePressed(MouseEvent evt) {
        Folder f = p.getFolderFor(key);
        if (f == null) {
            return;
        }
        JPopupMenu pop = new JPopupMenu();
        FileMenuItem i = new FileMenuItem(this);
        i.setVisible(true);
        i.file = null;
        pop.add(i);
        folderToPopup(p, f, pop);
        pop.show(this, evt.getX(), evt.getY());
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
    }

    public void setFile(GFile file) {
        setFile(file, false);
    }

    public void setFile(GFile file, boolean trigger) {
        if (file != null && isSaveChecked() && file.tabPanel != null && file.tabPanel.wasModified()) {
            int result = JOptionPane.showConfirmDialog(this, "File " + file.name + " was modified. Do you want to save it?",
                    "File not saved", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                file.tabPanel.Save();
                setFile(file, trigger, false);
            } else if (result == JOptionPane.NO_OPTION) {
                setFile(file, trigger, false);
            }
        } else {
            setFile(file, trigger, false);
        }
    }

    public void setFile(GFile file, boolean trigger, boolean UNUSED) {
        this.file = file;
        this.repaint();
        if (trigger) {
            for (ActionListener al : a) {
                System.out.println("Action Performed");
                al.actionPerformed(null);
            }
        }
    }

    public GFile getFile() {
        return file;
    }

    public void addActionListener(ActionListener a) {
        this.a.add(a);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        Color c = getForeground();

        g.setColor(c);
        g.setFont(f);

        if (file == null) {
            g.drawString("<none>", 1, fm.getHeight() + 1);
            return;
        }

        int x = 1;

        try {
            WorkspaceCellRenderer r = (WorkspaceCellRenderer) gcreator.panel.workspace.getCellRenderer();
            Icon i = r.getImageFor(file.node);
            i.paintIcon(this, g, x, 1);
            //g.drawImage(i.getImage(), x, 1, i.getImageObserver());
            x += i.getIconWidth() + 1;
        } catch (Exception e) {
        }

        g.drawString(file.name, x, fm.getHeight() + 1);
    }

    public boolean isSaveChecked() {
        return savecheck;
    }

    public void setSaveChecked(boolean savecheck) {
        this.savecheck = savecheck;
    }
}
