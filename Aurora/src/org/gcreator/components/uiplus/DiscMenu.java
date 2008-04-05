/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.components.uiplus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class DiscMenu extends JDialog {

    TransparentBackground t;
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

    public DiscMenu() {
        setLayout(new BorderLayout());
        add(t = new TransparentBackground(), BorderLayout.CENTER);
        addFocusListener(new FocusListener() {

                    public void focusLost(FocusEvent evt) {
                        dispose();
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
                        motion(evt);
                    }

                    public void mouseEntered(MouseEvent evt) {
                        motion(evt);
                    }

                    public void mouseReleased(MouseEvent evt) {
                        press(evt);
                    }

                    public void mousePressed(MouseEvent evt) {
                    }

                    public void mouseClicked(MouseEvent evt) {
                    }
                });
        addMouseMotionListener(new MouseMotionListener() {

                    public void mouseMoved(MouseEvent evt) {
                        motion(evt);
                    }

                    public void mouseDragged(MouseEvent evt) {
                        motion(evt);
                    }
                });
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
            repaint();
        }
    }
    
    private void call(DiscMenuItem item){
        call(item, false);
    }
    
    private void call(DiscMenuItem item, boolean back){
        ActionEvent evt = new ActionEvent(this, -1, "call");
        item.actionPerformed(evt, back);
        if(!(item instanceof DiscMenuContainer))
            this.dispose();
    }
    
    private void press(MouseEvent evt){
        int x = evt.getX();
        int y = evt.getY();
        
        if(x>44&&y>42&&x<79&&y<77&&curcontainer.prevcontainer!=null){
            call(curcontainer.prevcontainer, true);
        }
        if (x > -1 && x < 34 && y > 41 && y < 76&&index * 6 < curcontainer.count()) {
            call(curcontainer.elementAt(index*6));
        } else if (x > 5 && x < 40 && y > 5 && y < 40&&index * 6 +1 < curcontainer.count()) {
            call(curcontainer.elementAt(index*6+1));
        } else if (x > 41 && x < 76 && y > -1 && y < 34&&index * 6 + 2< curcontainer.count()) {
            call(curcontainer.elementAt(index*6+2));
        } else if (x > 77 && x < 112 && y > 5 && y < 39&&index * 6 + 3< curcontainer.count()) {
            call(curcontainer.elementAt(index*6+3));
        } else if (x > 83 && x < 118 && y > 41 && y < 76&&index * 6 + 4< curcontainer.count()) {
            call(curcontainer.elementAt(index*6+4));
        } else if (x > 41 && x < 76 && y > 79 && y < 114&&index * 6 + 5< curcontainer.count()) {
            call(curcontainer.elementAt(index*6+5));
        }
        
        if(y<88||y>105)
            return;
        if(index!=0&&x>19&&x<38){
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
        
        if(index<size-1&&x>79&&x<98){
            index++;
            repaint();
        }
        
    }

    public void paint(Graphics g) {
        super.paint(g);

        Color t1 = SystemColor.menu;
        Color t2 = SystemColor.activeCaption;

        if (selection == index * 6&&index * 6 < curcontainer.count()&&curcontainer.elementAt(index * 6).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(0, 42, 33, 33);

        if (selection == index * 6 + 1&&index * 6 + 1 < curcontainer.count()&&curcontainer.elementAt(index * 6 + 1).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(6, 6, 33, 33);

        if (selection == index * 6 + 2&&index * 6 + 2 < curcontainer.count()&&curcontainer.elementAt(index * 6 + 2).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(42, 0, 33, 33);
        
        if (selection == index * 6 + 3&&index * 6 + 3 < curcontainer.count()&&curcontainer.elementAt(index * 6 + 3).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(78, 6, 33, 33);

        if (selection == index * 6 + 4&&index * 6 + 4 < curcontainer.count()&&curcontainer.elementAt(index * 6 + 4).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(84, 42, 33, 33);
        
        if (selection == index * 6 + 5&&index * 6 + 5 < curcontainer.count()&&curcontainer.elementAt(index * 6 + 5).isEnabled()) {
            g.setColor(t2);
        } else {
            g.setColor(t1);
        }
        g.fillRect(42, 80, 33, 33);

        g.setColor(Color.BLACK);
        g.drawRect(42, 0, 33, 33);
        g.drawRect(6, 6, 33, 33);
        g.drawRect(78, 6, 33, 33);
        g.drawRect(0, 42, 33, 33);
        g.drawRect(84, 42, 33, 33);
        g.drawRect(42, 80, 33, 33);

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

        if (index > size-2) {
            g.drawImage(nextnot.getImage(), 80, 88, nextnot.getImageObserver());
        } else {
            g.drawImage(next.getImage(), 80, 88, next.getImageObserver());
        }

        //draw position 1
        try {
            ImageIcon i = curcontainer.elementAt(index * 6).image;
            g.drawImage(i.getImage(), 1, 43, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 2
        try {
            ImageIcon i = curcontainer.elementAt(index * 6 + 1).image;
            g.drawImage(i.getImage(), 7, 7, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 3
        try {
            ImageIcon i = curcontainer.elementAt(index * 6 + 2).image;
            g.drawImage(i.getImage(), 43, 1, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 4
        try {
            ImageIcon i = curcontainer.elementAt(index * 6 + 3).image;
            g.drawImage(i.getImage(), 79, 7, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 5
        try {
            ImageIcon i = curcontainer.elementAt(index * 6 + 4).image;
            g.drawImage(i.getImage(), 85, 43, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?

        //draw position 6
        try {
            ImageIcon i = curcontainer.elementAt(index * 6 + 5).image;
            g.drawImage(i.getImage(), 43, 81, i.getImageObserver());
        } catch (Exception e) {
        } //Out of bounds? NullPointer?
        
        if(curcontainer.prevcontainer!=null&&curcontainer.image!=null){
            ImageIcon i = curcontainer.image;
            g.drawImage(
                    i.getImage(),
                    45,
                    43, i.getImageObserver());
        }
    }
}
