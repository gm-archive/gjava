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
package org.gcreator.editors;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.gcreator.gui.DocumentPane;

/**
 * Previews an image
 * @author Luís Reis
 */
public class ImagePreviewer extends DocumentPane{
    private JScrollPane scroll;
    private JPanel panel;
    private BufferedImage img = null;
    
    public ImagePreviewer(File file){
        super(file);
        
        scroll = new JScrollPane();
        panel = new JPanel(){
            @Override
            public void paint(Graphics g){
                if(img!=null)
                    g.drawImage(img, 0, 0, null);
            }
        };
        try{
            img = ImageIO.read(file);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        scroll.setVisible(true);
        panel.setVisible(true);
        panel.setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        scroll.setViewportView(panel);
        
        setLayout(new BorderLayout());
        add(scroll, BorderLayout.CENTER);
    }
    
    @Override
    public boolean canSave(){
        return false;
    }
}
