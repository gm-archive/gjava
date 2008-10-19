/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.gcreator.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.ref.WeakReference;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 * Provides a way for {@link TabbedInterfaceProvider} to have close buttons
 * on tabs
 * @author Luís Reis
 */
public class TabRenderer extends JPanel{
    private WeakReference<TabbedInterfaceProvider> tabs;
    public TabRenderer(TabbedInterfaceProvider tabs){
        this.tabs = new WeakReference<TabbedInterfaceProvider>(tabs);
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setOpaque(false);
        JLabel label = new JLabel(){
            @Override
            public String getText(){
                try{
                    TabbedInterfaceProvider pane = TabRenderer.this.tabs.get();
                    return pane.getDocumentAt(pane.tabs.indexOfTabComponent
                            (TabRenderer.this)).getTitle();
                }
                catch(Exception e){
                    return null;
                }
            }
        };
        label.setVisible(true);
        add(label);
        final JButton b = new JButton("X");
        //b.setUI(new BasicButtonUI());
        b.setContentAreaFilled(false);
        b.setFocusable(false);
        b.setRolloverEnabled(true);
        /*final JButton b = new JButton(){
            @Override
            public void paint(Graphics g){
                if(getModel().isPressed())
                    g.setColor(Color.BLUE);
                else
                    g.setColor(Color.BLACK);
                int width = getWidth();
                int height = getHeight();
                if(getModel().isRollover()){
                    g.drawRect(-1, -1, width, height);
                }
                g.drawLine(0, 0, width, height);
                g.drawLine(0, height, width, 0);
            }
        };*/
        //b.setPreferredSize(new Dimension(17, 17));
        b.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent evt){
                b.repaint();
            }
            public void mouseExited(MouseEvent evt){
                b.repaint();
            }
            public void mouseClicked(MouseEvent evt){}
            public void mousePressed(MouseEvent evt){}
            public void mouseReleased(MouseEvent evt){}
        });
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                TabbedInterfaceProvider pane = TabRenderer.this.tabs.get();
                pane.remove(pane.getDocumentAt(pane.tabs.indexOfTabComponent(
                        TabRenderer.this)));
            }
        });
        add(b);
    }
}
