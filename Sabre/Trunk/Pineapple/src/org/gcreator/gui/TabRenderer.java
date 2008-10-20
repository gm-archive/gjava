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

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.ref.WeakReference;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Provides a way for {@link TabbedInterfaceProvider} to have close buttons
 * on tabs
 * @author Luís Reis
 */
public class TabRenderer extends JPanel{
    private WeakReference<TabbedInterfaceProvider> tabs;
    
    /**
     * Creates a new TabRenderer
     * @param tabs The TabbedInterfaceProvider
     */
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
        b.setContentAreaFilled(false);
        b.setFocusable(false);
        b.setRolloverEnabled(true);
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
                DocumentPane doc = pane.getDocumentAt(pane.tabs.indexOfTabComponent(
                        TabRenderer.this));
                doc.dispose();
            }
        });
        add(b);
    }
}
