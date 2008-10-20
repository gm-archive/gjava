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
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.gcreator.core.Core;

/**
 * DocumentPane is the most basic unit of file editing.
 * @author Luís Reis
 */
public class DocumentPane extends JPanel {

    private File file;

    /**
     * Creates a DocumentPane for a specific file.
     * @param file The file
     */
    public DocumentPane(File file) {
        this.file = file;
    }

    /**
     * Creates a DocumentPane from an URI location.
     * @param fileLocation The location
     * 
     * @see #DocumentPane(File)
     */
    public DocumentPane(URI fileLocation) {
        this(new File(fileLocation));
    }

    /**
     * Creates a DocumentPane from a file name.
     * @param filename The name of the file to create.
     * 
     * @see #DocumentPane(File)
     */
    public DocumentPane(String filename) {
        this(new File(filename));
    }

    /**
     * Gets the file
     */
    public File getFile() {
        return file;
    }

    /**
     * Saves the file
     * @return Whether or not the file was saved
     */
    public boolean save() {
        if (file == null) {
            if (!saveas()) {
                return false;
            //no else here
            }
        }
        if (saveBackend()) {
            setModified(false);
            return true;
        }
        return false;
    }

    /**
     * Saves the backend with no interface requests
     */
    public boolean saveBackend() {
        return false;
    }

    /**
     * Saves the file with a new location
     * @return Whether save was sucessful or not
     */
    public boolean saveas() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select where to save");
        chooser.setDialogType(JFileChooser.SAVE_DIALOG);
        if (chooser.showDialog(Core.getStaticContext().getMainFrame(), "OK") != JFileChooser.CANCEL_OPTION) {
            file = chooser.getSelectedFile();
            return true;
        }
        return false;
    }

    /**
     * Sets the content of the 'edit' menu.
     * @param editMenu The 'edit' menu
     * @return Whether or not the edit menu should be disabled.
     */
    public boolean setupEditMenu(JMenu editMenu) {
        return false;
    }
    private boolean modified = false;

    /**
     * Returns whether or not the file was modified
     */
    public boolean isModified() {
        return modified;
    }

    /**
     * Sets whether or not the file was modified
     * @param modified Whether or not the file was modified
     */
    public void setModified(boolean modified) {
        this.modified = modified;
        if (PineapplePlugin.dip.getSelectedDocument() == this) {
            PineapplePlugin.fileSave.setEnabled(canSave());
        }
        PineapplePlugin.dip.updateUI();
    }

    /**
     * Gets whether or not the file can be saved
     */
    public boolean canSave() {
        return isModified() || !getFile().exists();
    }

    /**
     * Gets the title of the document
     */
    public String getTitle() {
        String title = "";
        File f = null;
        f = getFile();
        if (f == null) {
            title = "untitled";
        } else {
            title = f.getName();
        }
        if (isModified()) {
            title += "*";
        }
        return title;
    }

    /**
     * Destroys, but asks whether or not to save the document first
     * Returns whether or not is was disposed
     */
    public boolean dispose() {
        if (canSave()) {
            String title = getTitle();
            int res = JOptionPane.showConfirmDialog(Core.getStaticContext().getMainFrame(),
                    "Do you wish to save document " + "\"" + title.substring(0, title.length() - 1) + "\" before closing?");
            if (res == JOptionPane.CANCEL_OPTION) {
                return false;
            }
            if (res == JOptionPane.YES_OPTION) {
                if (!save()) {
                    return false; //If can not save, then do not close
                }
            }
        }
        PineapplePlugin.dip.remove(this);
        return true;
    }
}
