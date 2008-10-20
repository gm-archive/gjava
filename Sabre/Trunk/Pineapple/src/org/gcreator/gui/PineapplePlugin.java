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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import org.gcreator.core.Core;
import org.gcreator.core.Project;
import org.gcreator.editors.ImagePreviewer;
import org.gcreator.editors.TextEditor;
import org.gcreator.plugins.DefaultEventTypes;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.NotifyEvent;
import org.gcreator.plugins.PluginCore;

/**
 * The core for Pineapple.
 * Pineapple deals with most core GUI stuff.
 * 
 * @author Luís Reis
 */
public class PineapplePlugin extends PluginCore {

    /**
     * Owns {@link #tree} and the tabbed pane
     */
    public static JSplitPane splitter;
    public static JTree tree;
    public static DefaultMutableTreeNode projectNode;
    public static JMenuBar menubar;
    public static JMenu fileMenu;
    public static JMenu editMenu;
    public static JMenuItem fileOpenFile;
    public static JMenuItem fileOpenProject;
    public static JMenuItem fileSave;
    public static JMenuItem fileExit;
    /**
     * Provides a way to deal with multiple documents.
     */
    public static DocumentInterfaceProvider dip;

    /**
     * The current project
     */
    public static Project project = null;
    
    /**
     * Initializes the plugin(Registers the event handlers)
     */
    @Override
    public void initialize() {
        EventManager.addEventHandler(this, DefaultEventTypes.WINDOW_CREATED, EventPriority.MEDIUM);
        EventManager.addEventHandler(this, DefaultEventTypes.WINDOW_DISPOSED, EventPriority.MEDIUM);
        EventManager.addEventHandler(this, DefaultEventTypes.FILE_OPENED, EventPriority.LOW);
        EventManager.addEventHandler(this, DefaultEventTypes.FILE_CHANGED, EventPriority.MEDIUM);
        EventManager.addEventHandler(this, DefaultEventTypes.PROJECT_OPENED, EventPriority.MEDIUM);
    }

    /**
     * Handles any provided events
     * @param evt The sent event
     */
    @Override
    public void handleEvent(NotifyEvent evt) {
        if (evt.getEventType().equals(DefaultEventTypes.WINDOW_CREATED)) {

            MainFrame f = Core.getStaticContext().getMainFrame();

            splitter = new JSplitPane();
            splitter.setVisible(true);
            f.setLayout(new BorderLayout());
            f.add(splitter, BorderLayout.CENTER);

            projectNode = new DefaultMutableTreeNode(null);
            tree = new JTree(projectNode);
            tree.setVisible(true);
            tree.setCellRenderer(new ProjectTreeRenderer());
            splitter.setLeftComponent(tree);

            dip = new TabbedInterfaceProvider();
            dip.setVisible(true);
            splitter.setRightComponent(dip);

            menubar = new JMenuBar();
            menubar.setVisible(true);
            f.add(menubar, BorderLayout.NORTH);

            fileMenu = new JMenu("File");
            fileMenu.setMnemonic('F');
            fileMenu.setVisible(true);
            menubar.add(fileMenu);

            fileOpenProject = new JMenuItem("Open Project");
            fileOpenProject.setMnemonic('j');
            fileOpenProject.setVisible(true);
            fileOpenProject.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    openProject();
                }
            });
            fileMenu.add(fileOpenProject);

            fileOpenFile = new JMenuItem("Open File");
            fileOpenFile.setMnemonic('O');
            fileOpenFile.setVisible(true);
            fileOpenFile.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    openFile();
                }
            });
            fileMenu.add(fileOpenFile);

            fileSave = new JMenuItem("Save");
            fileSave.setMnemonic('S');
            fileSave.setVisible(true);
            fileSave.setEnabled(false);
            fileSave.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    saveFile();
                }
            });
            fileMenu.add(fileSave);

            fileExit = new JMenuItem("Exit");
            fileExit.setMnemonic('x');
            fileExit.setVisible(true);
            fileExit.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    EventManager.fireEvent(this, DefaultEventTypes.WINDOW_DISPOSED);
                }
            });
            fileMenu.add(fileExit);

            editMenu = new JMenu("Edit");
            editMenu.setMnemonic('E');
            editMenu.setEnabled(false);
            editMenu.setVisible(true);
            menubar.add(editMenu);
        } else if (evt.getEventType().equals(DefaultEventTypes.FILE_CHANGED)) {
            DocumentPane pane = dip.getSelectedDocument();
            editMenu.removeAll();
            if (pane != null) {
                editMenu.setEnabled(pane.setupEditMenu(editMenu));
                fileSave.setEnabled(pane.canSave());
            } else {
                editMenu.setEnabled(false);
                fileSave.setEnabled(false);
            }
        } else if (evt.getEventType().equals(DefaultEventTypes.FILE_OPENED)) {
            DocumentPane p;
            Object[] arguments = evt.getArguments();
            File f = (File) arguments[0];
            String format = arguments[1].toString(); //Good to avoid exceptions
            if (format.equals("png") ||
                    format.equals("jpg") || format.equals("jpeg") ||
                    format.equals("gif") || format.equals("bmp")) {
                p = new ImagePreviewer(f);
            } else {
                p = new TextEditor(f);
            }
            dip.add(p.getFile().getName(), p);
            evt.handleEvent();
        } else if (evt.getEventType().equals(DefaultEventTypes.WINDOW_DISPOSED)){
            for(DocumentPane doc : dip.getDocuments()){
                if(doc!=null)
                    if(!doc.dispose()){
                        evt.handleEvent();
                        return;
                    }
            }
        } else if (evt.getEventType().equals(DefaultEventTypes.PROJECT_OPENED)){
            project = new Project((File) evt.getArguments()[0]);
            projectNode.setUserObject(project);
            try{
            for(File f : project.getFiles()){
                //TODO: Folders. May be convenient to discuss this in community.
                projectNode.add(new DefaultMutableTreeNode(f));
            }
            }
            catch(Exception e){
                
            }
        }
    }

    /**
     * Opens a file
     */
    public void openFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.setDialogTitle("Select files to open");
        if (chooser.showDialog(Core.getStaticContext().getMainFrame(), "OK") != JFileChooser.CANCEL_OPTION) {
            File[] files = chooser.getSelectedFiles();
            for (File f : files) {
                openFile(f);
            }
        }
    }

    /**
     * Opens a given file
     * @param f The file to open
     */
    public void openFile(final File f) {
        DocumentPane[] comps = dip.getDocuments();
        boolean canOpen = true;
        for (DocumentPane component : comps) {
            if (component != null && component.getFile() == f) {
                canOpen = false;
                break;
            }
        }
        if (canOpen) {
            Thread t = new Thread() {

                @Override
                public void run() {
                    String s = f.getName();
                    String format = "???";
                    try {
                        format = s.substring(s.lastIndexOf('.') + 1);
                    } catch (Exception e) {
                    }
                    EventManager.fireEvent(this, DefaultEventTypes.FILE_OPENED, f, format);
                    dip.updateUI();
                }
            };
            t.start();
        }
    }

    /**
     * Opens a project
     */
    public void openProject() {
        if(project!=null){
            closeProject();
        }
        
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle("Select the project to open");
        int res = chooser.showDialog(Core.getStaticContext().getMainFrame(), "OK");
        if(res!=JFileChooser.CANCEL_OPTION){
            EventManager.fireEvent(this, DefaultEventTypes.PROJECT_OPENED, chooser.getSelectedFile());
        }
        
        tree.updateUI();
    }
    
    /**
     * Closes the current project
     */
    public void closeProject(){
        projectNode.removeAllChildren();
        projectNode.setUserObject(null);
    }

    /**
     * Saves the currently open file
     */
    public void saveFile() {
        DocumentPane p = dip.getSelectedDocument();
        if (p != null) {
            p.save();
        }
    }
}