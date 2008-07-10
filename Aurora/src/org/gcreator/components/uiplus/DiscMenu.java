/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.uiplus;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.util.Vector;
import javax.swing.*;

/**
 * DiscMenu are a new way of dealing with menus.
 * Instead of standard menus, disc menu organizes data in a circle way.
 * However, you should use org.gcreator.components.custom.MenuGenerator instead.
 * @author Luís Reis
 */
public class DiscMenu extends DialogPlus {

    //TransparentBackground t;
    private int index = 0;
    private int selection = -1;
    public DiscMenuContainer curcontainer = null;
    private static ImageIcon prev =
            new ImageIcon(DiscMenu.class.getResource("/org/gcreator/resources/uiplus/prev.png"));
    private static ImageIcon prevnot =
            new ImageIcon(DiscMenu.class.getResource("/org/gcreator/resources/uiplus/prevnot.png"));
    private static ImageIcon next =
            new ImageIcon(DiscMenu.class.getResource("/org/gcreator/resources/uiplus/next.png"));
    private static ImageIcon nextnot =
            new ImageIcon(DiscMenu.class.getResource("/org/gcreator/resources/uiplus/nextnot.png"));
    private boolean useless = false;
    private static Vector<DiscMenu> menus = new Vector<DiscMenu>();

    public DiscMenu() {
        super();
        try {
            for (DiscMenu menu : menus) {
                menu.dispose();
            }
        } catch (Exception e) {
            //ConcurrentModification
        }
        menus.add(this);
        setLayout(new BorderLayout());
        //add(t = new TransparentBackground(), BorderLayout.CENTER);
        addFocusListener(new FocusListener() {

            public void focusLost(FocusEvent evt) {
                //dispose();
                selection = -1;
                repaint();
                useless = true;
                fadeOut(1);
            }

            public void focusGained(FocusEvent evt) {
            }
        });
        setSize(118, 114);
        setLocation(100, 100);
        setUndecorated(true);
        curcontainer = new DiscMenuContainer(null, null);
        addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent evt) {
                if (!useless) {
                    motion(evt);
                }
            }

            public void mouseEntered(MouseEvent evt) {
                if (!useless) {
                    motion(evt);
                }
            }

            public void mouseReleased(MouseEvent evt) {
                if (!useless) {
                    press(evt);
                }
            }

            public void mousePressed(MouseEvent evt) {
            }

            public void mouseClicked(MouseEvent evt) {
            }
        });
        addMouseMotionListener(new MouseMotionListener() {

            public void mouseMoved(MouseEvent evt) {
                if (!useless) {
                    motion(evt);
                }
            }

            public void mouseDragged(MouseEvent evt) {
                if (!useless) {
                    motion(evt);
                }
            }
        });
        setWindowMask(new ImageIcon(getClass().getResource("/org/gcreator/resources/mask.png")));
        setDoubleBuffered(true);
        setAlwaysOnTop(true);
        JPanel p = new JPanel() {
            public static final long serialVersionUID = 1;
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                DiscMenu.this.paintComponent(g);
            }
        };
        p.setFocusable(false);
        setLayout(new BorderLayout());
        p.setVisible(true);
        this.add(p, BorderLayout.CENTER);
    }

    private void motion(MouseEvent evt) {
        int os = selection;
        int x = evt.getX();
        int y = evt.getY();

        if (x > -1 && x < 34 && y > 41 && y < 76) {
            selection = index * 6;
        } else if (x > 5 && x < 40 && y > 5 && y < 40) {
            selection = index * 6 + 1;
        } else if (x > 41 && x < 76 && y > -1 && y < 34) {
            selection = index * 6 + 2;
        } else if (x > 77 && x < 112 && y > 5 && y < 39) {
            selection = index * 6 + 3;
        } else if (x > 83 && x < 118 && y > 41 && y < 76) {
            selection = index * 6 + 4;
        } else if (x > 41 && x < 76 && y > 79 && y < 114) {
            selection = index * 6 + 5;
        } else {
            selection = -1;
        }

        if (os != selection) {
            invalidate();
            repaint();
        }
    }

    private void call(DiscMenuItem item) {
        call(item, false);
    }

    private void call(DiscMenuItem item, boolean back) {
        if(!item.isEnabled()) {
            return;
        }
        ActionEvent evt = new ActionEvent(this, -1, "call");
        item.actionPerformed(evt, back);
        if (!(item instanceof DiscMenuContainer)) {
            this.dispose();
        }
    }

    private void press(MouseEvent evt) {
        int x = evt.getX();
        int y = evt.getY();

        if (x > 44 && y > 42 && x < 79 && y < 77 && curcontainer.prevcontainer != null) {
            call(curcontainer.prevcontainer, true);
        }
        if (x > -1 && x < 34 && y > 41 && y < 76 && index * 6 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6));
        } else if (x > 5 && x < 40 && y > 5 && y < 40 && index * 6 + 1 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6 + 1));
        } else if (x > 41 && x < 76 && y > -1 && y < 34 && index * 6 + 2 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6 + 2));
        } else if (x > 77 && x < 112 && y > 5 && y < 39 && index * 6 + 3 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6 + 3));
        } else if (x > 83 && x < 118 && y > 41 && y < 76 && index * 6 + 4 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6 + 4));
        } else if (x > 41 && x < 76 && y > 79 && y < 114 && index * 6 + 5 < curcontainer.count()) {
            call(curcontainer.elementAt(index * 6 + 5));
        }

        if (y < 88 || y > 105) {
            return;
        }
        if (index != 0 && x > 19 && x < 38) {
            index--;
            repaint();
            return;
        }
        int size = 0;
        if (curcontainer != null) {
            size = curcontainer.count();
        }
        if (size % 6 == 0) {
            size /= 6;
        } else {
            size /= 6;
            size++;
        }

        if (index < size - 1 && x > 79 && x < 98) {
            index++;
            repaint();
        }

    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public void paintComponent(Graphics gg) {
        Color t1 = Color.WHITE;
        Color t2 = Color.BLUE;

        try {
            t1 = SystemColor.menu;
            t2 = SystemColor.activeCaption;
        } catch (Exception e) {
            System.err.println("Exception while trying to retrieve System Colors.");
        }
        int r = 8;
        
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, (org.gcreator.core.gcreator.panel.antialiasing)
                ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        if (selection == index * 6 && index * 6 < curcontainer.count() && curcontainer.elementAt(index * 6).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(0, 42, 33, 33, r, r);

        if (selection == index * 6 + 1 && index * 6 + 1 < curcontainer.count() && curcontainer.elementAt(index * 6 + 1).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(6, 6, 33, 33, r, r);

        if (selection == index * 6 + 2 && index * 6 + 2 < curcontainer.count() && curcontainer.elementAt(index * 6 + 2).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(42, 0, 33, 33, r, r);

        if (selection == index * 6 + 3 && index * 6 + 3 < curcontainer.count() && curcontainer.elementAt(index * 6 + 3).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(78, 6, 33, 33, r, r);

        if (selection == index * 6 + 4 && index * 6 + 4 < curcontainer.count() && curcontainer.elementAt(index * 6 + 4).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(84, 42, 33, 33, r, r);

        if (selection == index * 6 + 5 && index * 6 + 5 < curcontainer.count() && curcontainer.elementAt(index * 6 + 5).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRoundRect(42, 80, 33, 33, r, r);

        g.setColor(Color.BLACK);
        g.drawRoundRect(42, 0, 33, 33, r, r);
        g.drawRoundRect(6, 6, 33, 33, r, r);
        g.drawRoundRect(78, 6, 33, 33, r, r);
        g.drawRoundRect(0, 42, 33, 33, r, r);
        g.drawRoundRect(84, 42, 33, 33, r, r);
        g.drawRoundRect(42, 80, 33, 33, r, r);

        int size = 0;
        if (curcontainer != null) {
            size = curcontainer.count();
        }
        if (size % 6 == 0) {
            size /= 6;
        } else {
            size /= 6;
            size++;
        }
        if (index == 0) {
            g.drawImage(prevnot.getImage(), 20, 88, prevnot.getImageObserver());
        } else {
            g.drawImage(prev.getImage(), 20, 88, prev.getImageObserver());
        }

        if (index > size - 2) {
            g.drawImage(nextnot.getImage(), 80, 88, nextnot.getImageObserver());
        } else {
            g.drawImage(next.getImage(), 80, 88, next.getImageObserver());
        }

        DiscMenuItem item;
        //draw position 1
        try {
            item = curcontainer.elementAt(index * 6);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 1, 43, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 2
        try {
            item = curcontainer.elementAt(index * 6 + 1);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 7, 7, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 3
        try {
            item = curcontainer.elementAt(index * 6 + 2);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 43, 2, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 4
        try {
            item = curcontainer.elementAt(index * 6 + 3);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 79, 7, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 5
        try {
            item = curcontainer.elementAt(index * 6 + 4);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 85, 43, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 6
        try {
            item = curcontainer.elementAt(index * 6 + 5);
            ImageIcon i = item.image;
            BufferedImage b = null;
            b = new BufferedImage(
                    i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = (Graphics2D) b.getGraphics();
            g2.drawImage(i.getImage(), 0, 0, i.getImageObserver());
            if(!item.isEnabled()){
                ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
                ColorConvertOp op = new ColorConvertOp(cs, null);
                b = op.filter(b, null);
            }
            g.drawImage(b, 43, 81, null);
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        if (curcontainer.prevcontainer != null && curcontainer.image != null) {
            setWindowMask(new ImageIcon(getClass().getResource("/org/gcreator/resources/mask2.png")));
            ImageIcon i = curcontainer.image;
            g.drawImage(
                    i.getImage(),
                    42,
                    42, i.getImageObserver());
        } else {
            setWindowMask(new ImageIcon(getClass().getResource("/org/gcreator/resources/mask.png")));
        }
    }

    @Override
    public void dispose() {
        menus.remove(this);
        super.dispose();
    }
    
    @Override
    public void setVisible(boolean b) {
        if (b)
            useless = false;
        super.setVisible(b);
    }
}
