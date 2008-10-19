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

import java.io.File;
import java.net.URI;
import javax.swing.JMenu;
import javax.swing.JPanel;

/**
 * DocumentPane is the most basic unit of file editing.
 * @author Luís Reis
 */
public class DocumentPane extends JPanel{
    private File file;
    
    /**
     * Creates a DocumentPane for a specific file.
     * @param file The file
     */
    public DocumentPane(File file){
        this.file = file;
    }
    
    /**
     * Creates a DocumentPane from an URI location.
     * @param fileLocation The location
     * 
     * @see #DocumentPane(File)
     */
    public DocumentPane(URI fileLocation){
        this.file = new File(fileLocation);
    }
    
    /**
     * Creates a DocumentPane from a file name.
     * @param filename The name of the file to create.
     * 
     * @see #DocumentPane(File)
     */
    public DocumentPane(String filename){
        this.file = new File(filename);
    }
    
    /**
     * Gets the file
     */
    public File getFile(){
        return file;
    }
    
    /**
     * Sets the content of the 'edit' menu.
     * @param editMenu The 'edit' menu
     * @return Whether or not the edit menu should be disabled.
     */
    public boolean setupEditMenu(JMenu editMenu){
        return true;
    }
}
