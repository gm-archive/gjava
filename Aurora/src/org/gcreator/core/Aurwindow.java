/*
 * window.java
 *
 * Created on 24/Ago/2007, 13:34:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.core;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.beans.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

import org.gcreator.components.*;
import org.gcreator.components.popupmenus.*;
import org.gcreator.editors.*;
import org.gcreator.exceptions.*;
import org.gcreator.externproject.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;
import org.gcreator.languages.*;
import org.gcreator.managers.*;
import org.gcreator.plugins.*;
import java.awt.datatransfer.Transferable;

import org.gcreator.help.AboutPanel;
import org.gcreator.help.HelpPanel;
import org.gcreator.units.*;


/**
 *
 * @author LuÃƒÂ­s
 */
public class Aurwindow extends JFrame {

    //<editor-fold defaultstate="collapsed" desc="Variables">

    public DefaultMutableTreeNode top;
    public JMenuBar menubar = new JMenuBar();
    public JMenu[] menus = new JMenu[MenuSupporter.MENULIMIT];
    public JMenuItem[] items = new JMenuItem[MenuSupporter.MENULIMIT * MenuSupporter.ITEMLIMIT];
    public JSplitPane splitter1;
    public JSplitPane splitter2;
    public static JTabbedPane tabs;
    public int look;
    public boolean istabs; //True - tabs; False - MDI

    public JDesktopPane mdi;
    public JTextPane console;
    public JScrollPane scroller;
    public static JToolBar tool;
    public static String lang;
    public static JTree workspace;
    public static JScrollPane treescroll;
    private static Project mainProject;
    public ButtonGroup stylegroup;
    //public JComboBox winlist; //This will be the windows list

    public TreeCellRenderer renderer;
    public ToolbarPopupMenu toolpopup;
    public ConsolePopupMenu consolepopup;

    public static GlobalSettings globalsettings;
    public static NewProject newproject;
    public static NewFileGroup newfilegroup;
    public static AboutPanel about;
    
    //</editor-fold>

    public java.lang.Object getWindowListElementAt(int pos) {
        if (istabs) {
            Component[] panels = tabs.getComponents();
            if (tabs == null) {
                return null;
            }
            if (panels[pos] instanceof TabPanel) {
                return panels[pos];
            }
            return null;
        } else {
            return null;
        }
    }

    public int getWindowListSize() {
        if (istabs) {
            return tabs.getComponents().length - 1;
        } else {
            return 0;
        }
    }

    public void treeDoubleClicked(MouseEvent e) {

        org.gcreator.fileclass.Object obj = getCurrentObject();
        if (obj instanceof org.gcreator.fileclass.File) {
            Open((org.gcreator.fileclass.File) obj);
        }
    }

    public void Open(org.gcreator.fileclass.File file) {
        boolean found = false;
        int iii = 0;
        int foundloc = 0;
        file.type = file.type.toLowerCase();
        FileOpenListener listener = getFileEditor(file.type);
        if (listener != null) {
            listener.openNewFile(file, this.getCurrentProject());
        }
        if (file.type.equals("sprite")) {
            //            for (Enumeration e = getCurrentProject().sprites.elements(); e.hasMoreElements();) {
//                if (((Sprite) e.nextElement()).name.equals(file.name)) {
//                    found = true;
//                    foundloc = iii;
//                }
//                iii++;
//            }
//            if (!found) {
//                getCurrentProject().sprites.add(new Sprite(file.name));
//                foundloc = getCurrentProject().sprites.size() + 1;
//            }
            addWindow(new SpriteEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("actor")) {
            //            for (Enumeration e = getCurrentProject().actors.elements(); e.hasMoreElements();) {
//                if (((Actor) e.nextElement()).name.equals(file.name)) {
//                    found = true;
//                    foundloc = iii;
//                }
//                iii++;
//            }
//            if (!found) {
//                getCurrentProject().actors.add(new Actor(file.name));
//                foundloc = getCurrentProject().actors.size() + 1;
//            }
            try {
                addWindow(new ActorEditor(file, this.getCurrentProject()), file.name);
            } catch (WrongResourceException e) {
            }
        } else if (file.type.equals("scene")) {
            //            for (Enumeration e = getCurrentProject().scenes.elements(); e.hasMoreElements();) {
//                if (((Scene) e.nextElement()).name.equals(file.name)) {
//                    found = true;
//                    foundloc = iii;
//                }
//                iii++;
//            }
//            if (!found) {
//                getCurrentProject().scenes.add(getCurrentProject().scenes.size() + 1, new Scene(file.name));
//                foundloc = getCurrentProject().scenes.size() + 1;
//            }
            addWindow(new SceneEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("egml")) {
            addWindow(new org.gcreator.editors.GCLEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("java")) {
            addWindow(new JavaEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("cpp") || file.type.equals("h")) {
            addWindow(new CppEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("bmp") || file.type.equals("gif") || file.type.equals("jpg") || file.type.equals("jpeg") || file.type.equals("png")) {
            addWindow(new ImageEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("settings")) {
            addWindow(new SettingsEditor(this.getCurrentProject(), file), file.name);
        } else {
            addWindow(new PlainTextEditor(file, this.getCurrentProject()), file.name); //All unmanaged file formats
        }
    }

    public static Project getMainProject() {
        return mainProject;
    }

    public static void setMainProject(Project newmain) {
        mainProject = newmain;
        workspace.updateUI();
    }

    public void addWindow(TabPanel panel, int title) {
        addWindow(panel, LangSupporter.activeLang.getEntry(title));
    }

    //<editor-fold defaultstate="collapsed" desc="addWindow(panel,title)">

    public void addWindow(TabPanel panel, String title) {
        try {
            panel.parent = this;
            panel.title = title;
            if (istabs) {
                for (int i = 0; i < tabs.getTabCount(); i++) {
                    if (tabs.getTitleAt(i).equals(title) && ((TabPanel) tabs.getComponentAt(i)).project == null) {
                        tabs.setSelectedComponent(tabs.getComponentAt(i));

                        return;
                    } else if (tabs.getTitleAt(i).equals(title) && ((TabPanel) tabs.getComponentAt(i)).project.equals(this.getCurrentProject()) && tabs.getComponentAt(i).getClass().getName().equals(panel.getClass().getName())) {
                        tabs.setSelectedComponent(tabs.getComponentAt(i));
                        return;
                    }
                }
                tabs.addTab(panel.title, panel);
                tabs.setTabComponentAt(tabs.indexOfComponent(panel), new ButtonTabComponent(tabs));
                tabs.setSelectedComponent(panel);
                tabs.addMouseListener(new MouseAdapter() {

                            public void mouseClicked(MouseEvent evt) {
                                tabsClicked(evt);
                            }
                        });
            }
            for (int i = 0; i < mdi.getComponentCount(); i++) {
                if (((ExtendedFrame) mdi.getComponent(i)).getTitle().equals(title) && ((ExtendedFrame) mdi.getComponent(i)).getPanel().project == null) {
                    ((ExtendedFrame) mdi.getComponent(i)).setSelected(true);

                    return;
                } else if (((ExtendedFrame) mdi.getComponent(i)).getTitle().equals(title) && (((ExtendedFrame) mdi.getComponent(i)).getPanel().project.equals(this.getCurrentProject()))) {
                    try {

                        ((ExtendedFrame) mdi.getComponent(i)).setSelected(true);

                        return;
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            ExtendedFrame frame = new ExtendedFrame();
            panel.frame = frame;
            frame.setPanel(panel);
            frame.setClosable(true);
            frame.setIconifiable(true);
            frame.setMaximizable(true);
            frame.setResizable(true);
            frame.setVisible(true);
            frame.setTitle(panel.title);
            frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(frame.getContentPane());
            frame.getContentPane().setLayout(jInternalFrame1Layout);
            if (!istabs) { 
               jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
               jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            }
            frame.setBounds(0, 0, 300, 300);

            mdi.add(frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
            frame.setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    //winlist.updateUI();
    }
    //</editor-fold>

    private Vector<FileOpenListener> listeners = new Vector<FileOpenListener>();

    public boolean installFileEditor(FileOpenListener listener) {
        return listeners.add(listener);
    }

    public boolean unistallFileEditor(FileOpenListener listener) {
        return listeners.remove(listener);
    }

    public FileOpenListener getFileEditor(String format) {
        Enumeration<FileOpenListener> enumeration = listeners.elements();
        try {
            FileOpenListener listener;
            while (enumeration.hasMoreElements()) {
                listener = enumeration.nextElement();
                String[] formats = listener.getFileFormats();
                for (int i = 0; i < formats.length; i++) {
                    if (formats[i].toLowerCase().equals(format.toLowerCase())) {
                        return listener;
                    }
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    //<editor-fold defaultstate="collapsed" desc="Constructor">

    protected Aurwindow(String[] settings) {
        setTitle("G-Creator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setJMenuBar(menubar);
        setIconImage(new ImageIcon(getClass().getResource("/org/gcreator/resources/GCreator.png")).getImage());
        istabs = true;
        console = new JTextPane();
        console.setEditable(false);
        console.setBackground(Colorfeel.ConsoleBGColor);
        console.setDisabledTextColor(Colorfeel.ConsoleFGColor);
        scroller = new JScrollPane();
        //winlist = new JComboBox();
        //winlist.setModel(new MyModel());
        console.setEditable(false);
        console.setContentType("text/html");
        scroller.setViewportView(console);

        //LangSupporter.activeLang = new English();

        SettingsIO.console = console;

        consolepopup = new ConsolePopupMenu();
        console.addMouseListener(new PopupListener(console, consolepopup));
        tabs = new JTabbedPane();
        mdi = new JDesktopPane();
        splitter1 = new JSplitPane();
        splitter2 = new JSplitPane();
        tabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        try {
            if (LangSupporter.activeLang != null) {
                lang = LangSupporter.activeLang.getLanguage();
            } else {
                lang = "";
            }
        } catch (Exception e) {
        }

        createToolBar();

        top = new DefaultMutableTreeNode("<HTML><b>" + LangSupporter.activeLang.getEntry(51));
        top.setAllowsChildren(true);

        /*
         * Set up tree
         */
        workspace = new JTree(top);
        workspace.setVisible(true);
        workspace.setScrollsOnExpand(true);
        workspace.setDragEnabled(true);
        workspace.setDropMode(DropMode.ON_OR_INSERT);
        workspace.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        try {
            int ver = Integer.parseInt(gcreator.java_version.replaceAll("1\\.([0-9])\\..*", "$1"));
            if (ver >= 6) {
                // Tree drag and drop support

                workspace.setDropMode(DropMode.ON_OR_INSERT);

                workspace.setTransferHandler(new TransferHandler() {

                            protected Transferable createTransferable(JComponent c) {
                                ObjectNode f = (ObjectNode) workspace.getLastSelectedPathComponent();
                                if (f.object instanceof org.gcreator.fileclass.File) {
                                    System.out.println("" + ((org.gcreator.fileclass.File) f.object).name);
                                    return ((org.gcreator.fileclass.File) f.object);
                                } else {
                                    return null;
                                }
                            }

                            public int getSourceActions(JComponent c) {
                                return MOVE;
                            }

                            public boolean canImport(TransferHandler.TransferSupport support) {
                                TreePath drop = ((JTree.DropLocation) support.getDropLocation()).getPath();
                                if (drop == null) {
                                    return false;
                                }
                                ObjectNode dropNode = (ObjectNode) drop.getLastPathComponent();
                                ObjectNode dragNode = (ObjectNode) ((JTree) support.getComponent()).getLastSelectedPathComponent();
                                //if (dragNode == dropNode) return false;
		//if (dragNode.isNodeDescendant(dropNode)) return false;
                                if (dropNode.object instanceof org.gcreator.fileclass.Group) {
                                    if (((org.gcreator.fileclass.Group) dropNode.object).allowsFileType(((org.gcreator.fileclass.File) dragNode.object).type)) {
                                        return true;
                                    } else {
                                        return false;
                                    }

                                }

                                return false;
                            }

                            public boolean importData(TransferHandler.TransferSupport support) {
                                if (!canImport(support)) {
                                    return false;
                                }
                                JTree.DropLocation drop = (JTree.DropLocation) support.getDropLocation();
                                int dropIndex = drop.getChildIndex();
                                ObjectNode dropNode = (ObjectNode) drop.getPath().getLastPathComponent();
                                ObjectNode dragNode = (ObjectNode) ((JTree) support.getComponent()).getLastSelectedPathComponent();
                                if (dropIndex == -1) {
                                    dropIndex = dropNode.getChildCount();
                                }
                                if (dropNode == dragNode.getParent() && dropIndex > dragNode.getParent().getIndex(dragNode)) {
                                    dropIndex--;
                                }
                                dropNode.insert(dragNode, dropIndex);
                                workspace.expandPath(new TreePath(dropNode.getPath()));
                                workspace.updateUI();
                                return true;

                            }
                        });
            }
            else{
                System.out.println(ver);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        renderer = new TreeImageManager();
        workspace.setCellRenderer(renderer);
        workspace.addMouseListener(new MouseListener() {

                    public void mouseClicked(MouseEvent e) {
                        if (e.getClickCount() == 2) {
                            treeDoubleClicked(e);
                        }
                    }

                    public void mousePressed(MouseEvent e) {
                    }

                    public void mouseReleased(MouseEvent e) {
                    }

                    public void mouseEntered(MouseEvent e) {
                    }

                    public void mouseExited(MouseEvent e) {
                    }
                });
        treescroll = new JScrollPane();
        treescroll.setViewportView(workspace);

        menus[0] = MenuSupporter.MakeMenu(menubar, 0, "Very important functions such as 'Save', 'Open' and 'Exit' can be found here.");
        items[MenuSupporter.GenerateMenuItemId(0, 0)] = MenuSupporter.MakeMenuItem(menus[0], 5, "Create a new project");
        items[MenuSupporter.GenerateMenuItemId(0, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/newproject.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 1)] = MenuSupporter.MakeMenuItem(menus[0], 6, "Create a new file");
        items[MenuSupporter.GenerateMenuItemId(0, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/general/newfile.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)] = MenuSupporter.MakeMenuItem(menus[0], 7, "Open a project");
        items[MenuSupporter.GenerateMenuItemId(0, 2)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/openproject.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 3)] = MenuSupporter.MakeMenuItem(menus[0], 8, "Save project");
        items[MenuSupporter.GenerateMenuItemId(0, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 3, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], 9, "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], 53, "Save all projects");
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], 88, "Save file");
        items[MenuSupporter.GenerateMenuItemId(0, 6)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], 89, "Save All files");
        items[MenuSupporter.GenerateMenuItemId(0, 7)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/saveall.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 8)] = MenuSupporter.MakeMenuItem(menus[0], 10, "Import...");
        items[MenuSupporter.GenerateMenuItemId(0, 8)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 8, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 11, "Export...");
        items[MenuSupporter.GenerateMenuItemId(0, 10)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 11)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 11)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 11, evt);
                    }
                });
        menus[1] = MenuSupporter.MakeMenu(menubar, 1, "Undo/Redo and clipboard functions can be found here.");
        items[MenuSupporter.GenerateMenuItemId(1, 0)] = MenuSupporter.MakeMenuItem(menus[1], 76, "Find");
        items[MenuSupporter.GenerateMenuItemId(1, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/general/find.png")));
        items[MenuSupporter.GenerateMenuItemId(1, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(1, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(1, 1)] = MenuSupporter.MakeMenuItem(menus[1], 83, "Find&Replace");
        items[MenuSupporter.GenerateMenuItemId(1, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(1, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(1, 2)] = MenuSupporter.MakeMenuItem(menus[1], 14, "Clear console");
        items[MenuSupporter.GenerateMenuItemId(1, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(1, 2, evt);
                    }
                });
        menus[2] = MenuSupporter.MakeMenu(menubar, 2, "Layout and design options are defined here.");
        menus[5] = MenuSupporter.MakeSubMenu(menus[2], 15, "Look&Feel");
        menus[6] = MenuSupporter.MakeSubMenu(menus[2], 16, "Display mode");
        items[MenuSupporter.GenerateMenuItemId(2, 0)] = MenuSupporter.MakeCheckMenuItem(menus[2], 22, "Display output box");
        items[MenuSupporter.GenerateMenuItemId(2, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(2, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(2, 1)] = MenuSupporter.MakeCheckMenuItem(menus[2], 75, "Display the toolbar");
        items[MenuSupporter.GenerateMenuItemId(2, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(2, 1, evt);
                    }
                });

        menus[3] = MenuSupporter.MakeMenu(menubar, 3, "Compile and test your games.");
        items[MenuSupporter.GenerateMenuItemId(3, 0)] = MenuSupporter.MakeMenuItem(menus[3], 98, "Set as main project");
        items[MenuSupporter.GenerateMenuItemId(3, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(3, 0, evt);
                    }
                });
        MenuSupporter.MakeSeparator(menus[3]);
        /*items[MenuSupporter.GenerateMenuItemId(3, 1)] = MenuSupporter.MakeMenuItem(menus[3], 99, "Clean current project");
        items[MenuSupporter.GenerateMenuItemId(3, 2)] = MenuSupporter.MakeMenuItem(menus[3], 100, "Clean main project");
        MenuSupporter.MakeSeparator(menus[3]);
        //Settings can be found at the tools menu
        //Main project
        items[MenuSupporter.GenerateMenuItemId(3, 3)] = MenuSupporter.MakeMenuItem(menus[3], 101, "Build");
        items[MenuSupporter.GenerateMenuItemId(3, 4)] = MenuSupporter.MakeMenuItem(menus[3], 102, "Test");
        items[MenuSupporter.GenerateMenuItemId(3, 5)] = MenuSupporter.MakeMenuItem(menus[3], 103, "Build&Test");
        items[MenuSupporter.GenerateMenuItemId(3, 6)] = MenuSupporter.MakeMenuItem(menus[3], 104, "Final Build");
        MenuSupporter.MakeSeparator(menus[3]);
        //Main project
        items[MenuSupporter.GenerateMenuItemId(3, 7)] = MenuSupporter.MakeMenuItem(menus[3], 105, "Build");
        items[MenuSupporter.GenerateMenuItemId(3, 8)] = MenuSupporter.MakeMenuItem(menus[3], 106, "Test");
        items[MenuSupporter.GenerateMenuItemId(3, 9)] = MenuSupporter.MakeMenuItem(menus[3], 107, "Build&Test");
        items[MenuSupporter.GenerateMenuItemId(3, 10)] = MenuSupporter.MakeMenuItem(menus[3], 108, "Final Build");*/

        menus[7] = MenuSupporter.MakeMenu(menubar, 114, "Tools");
        items[MenuSupporter.GenerateMenuItemId(7, 0)] = MenuSupporter.MakeMenuItem(menus[7], 23, "Select the language");
        items[MenuSupporter.GenerateMenuItemId(7, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 1)] = MenuSupporter.MakeMenuItem(menus[7], 93, "Update");
        items[MenuSupporter.GenerateMenuItemId(7, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/GCreator.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 2)] = MenuSupporter.MakeMenuItem(menus[7], 109, "Extensions Manager");
        items[MenuSupporter.GenerateMenuItemId(7, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 2, evt);
                    }
                });
        menus[7].addSeparator();
        items[MenuSupporter.GenerateMenuItemId(7, 3)] = MenuSupporter.MakeMenuItem(menus[7], 130, "Global options");
        items[MenuSupporter.GenerateMenuItemId(7, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 3, evt);
                    }
                });
        menus[4] = MenuSupporter.MakeMenu(menubar, 4, "Get info about Aurora.");
        items[MenuSupporter.GenerateMenuItemId(4, 0)] = MenuSupporter.MakeMenuItem(menus[4], 24, "About Aurora");
        items[MenuSupporter.GenerateMenuItemId(4, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(4, 1)] = MenuSupporter.MakeMenuItem(menus[4], 25, "Aurora help");
        items[MenuSupporter.GenerateMenuItemId(4, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 1, evt);
                    }
                });
        stylegroup = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(5, 0)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 17, "Native look");
        items[MenuSupporter.GenerateMenuItemId(5, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(5, 0, evt);
                    }
                });
        if (look == 0) {
            items[MenuSupporter.GenerateMenuItemId(5, 0)].setSelected(true);
        }

        items[MenuSupporter.GenerateMenuItemId(5, 1)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 18, "Cross-platform look");
        items[MenuSupporter.GenerateMenuItemId(5, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(5, 1, evt);
                    }
                });
        if (look == 1) {
            items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
        }
        MenuSupporter.MakeSeparator(menus[5]);
        items[MenuSupporter.GenerateMenuItemId(5, 2)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 19, "Linux look");
        items[MenuSupporter.GenerateMenuItemId(5, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(5, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(5, 3)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 132, "Ocean theme");
        items[MenuSupporter.GenerateMenuItemId(5, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(5, 3, evt);
                    }
                });
        /*items[MenuSupporter.GenerateMenuItemId(5, 4)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 1, "GTK");
        items[MenuSupporter.GenerateMenuItemId(5, 4)].addActionListener(new ActionListener() {

             
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 4, evt);
            }
        });*/
        ButtonGroup agroup = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(6, 0)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 20, "Tabs Top");
        items[MenuSupporter.GenerateMenuItemId(6, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(6, 1)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 90, "Tabs Left");
        items[MenuSupporter.GenerateMenuItemId(6, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 2)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 91, "Tabs Bottom");
        items[MenuSupporter.GenerateMenuItemId(6, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(6, 3)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 92, "Tabs Right");
        items[MenuSupporter.GenerateMenuItemId(6, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 3, evt);
                    }
                });
        MenuSupporter.MakeSeparator(menus[6]);
        items[MenuSupporter.GenerateMenuItemId(6, 4)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 21, "MDI");
        items[MenuSupporter.GenerateMenuItemId(6, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(6, 4, evt);
                    }
                });

        //</editor-fold>
        splitter1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitter2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitter1.setLeftComponent(splitter2);
        splitter1.setRightComponent(scroller);
        splitter2.setLeftComponent(treescroll);
        splitter2.setRightComponent(tabs);
        WelcomeTab welcome = new WelcomeTab();
        addWindow(welcome, 26);

        //<editor-fold defaultstate="collapsed" desc="Layout Manager">
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tool, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE).addComponent(splitter1, GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(tool, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(splitter1, GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)));


        if (settings[2].equals("Hidden")) {
            onItemActionPerformed(2, 0, null);
        } else {
            items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(true);
            pack();
            splitter1.setDividerLocation(0.66);
        }

        try {
            if (settings != null && settings[0] != null && settings[0].equals("Native")) {
                look = 0;
            } else if (settings == null || settings[0] == null || settings[0].equals("Cross-platform")) {
                items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
                look = 1;
            } else if (settings[0].equals("Motif")) {
                items[MenuSupporter.GenerateMenuItemId(5, 2)].setSelected(true);
                look = 2;
            } else if (settings[0].equals("Metal")) {
                items[MenuSupporter.GenerateMenuItemId(5, 3)].setSelected(true);
                look = 3;
            } else {
                items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
                look = 1;
            }
        } catch (Exception e) {
            items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
            look = 1;
        }

        if (settings[1].equals("MDI")) {
            items[MenuSupporter.GenerateMenuItemId(6, 4)].setSelected(true);
            onItemActionPerformed(6, 4, null);
        }
        if (settings[1].equals("Tabs (Left)")) {
            items[MenuSupporter.GenerateMenuItemId(6, 1)].setSelected(true);
            onItemActionPerformed(6, 1, null);
        }
        if (settings[1].equals("Tabs (Bottom)")) {
            items[MenuSupporter.GenerateMenuItemId(6, 2)].setSelected(true);
            onItemActionPerformed(6, 2, null);
        }
        if (settings[1].equals("Tabs (Right)")) {
            items[MenuSupporter.GenerateMenuItemId(6, 3)].setSelected(true);
            onItemActionPerformed(6, 3, null);
        }
        splitter2.setDividerLocation(0.33);

        if (settings[4].equals("Visible")) {
            tool.setVisible(true);
            items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(true);
        } else {
            tool.setVisible(false);
            items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(false);
        }

        pack();
        //setSize(550, 550);
        utilities.addMessage(29);
        //</editor-fold>
        workspace.expandRow(0);
        setMinimumSize(new Dimension(200, 200));
        setVisible(true);
    }
    //</editor-fold>

    private void tabsClicked(MouseEvent evt) {
    //Leave in blank... for now...
    }

    //<editor-fold defaultstate="collapsed" desc="onItemActionPerformed">

    private void onItemActionPerformed(int menu, int item, ActionEvent evt) {
        if (menu == 0 && item == 0) {
            addWindow(newproject, 55);
        }
        if (menu == 0 && item == 1) {
            addWindow(newfilegroup, 96);
        }
        if (menu == 0 && item == 2) {
            ProjectImporter.OpenProject(this);
        }
        if (menu == 0 && item == 3) {
            SaveProject();
        }
        if (menu == 0 && item == 8) {
            importDialog _import = new importDialog(this, true);
            _import.setVisible(true);
        }
        if (menu == 0 && item == 11) {
            dispose();
        }
        if (menu == 1 && item == 2) {
            gcreator.output = "";
            console.setText("");
        }
        if (menu == 2 && item == 0) {
            Dimension a = this.getSize();
            int b = this.getExtendedState();
            scroller.setVisible(!scroller.isVisible());
            pack();
            this.setSize(a);
            this.setExtendedState(b);
            splitter1.setDividerLocation(0.80);
        }
        if (menu == 2 && item == 1) {
            Dimension a = this.getSize();
            tool.setVisible(!tool.isVisible());
            this.setSize(a);
        }
        if (menu == 3 && item == 0) {
            setMainProject(getCurrentProject());
        }
        if (menu == 4 && item == 0) {
            addWindow(about, 27);
        }
        if (menu == 4 && item == 1) {
            HelpPanel help = new HelpPanel();
            addWindow(help, 27);
        }
        if (menu == 5 && item == 0) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                SwingUtilities.updateComponentTreeUI(consolepopup);
                look = 0;
                workspace.updateUI();
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 1) {
            try {
                javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.OceanTheme());
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                SwingUtilities.updateComponentTreeUI(consolepopup);
                look = 1;
                workspace.updateUI();
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 2) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                SwingUtilities.updateComponentTreeUI(consolepopup);
                look = 2;
                workspace.updateUI();
            } catch (Exception e) {

            }
        }
        if (menu == 5 && item == 3) {
            try {
                javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(new javax.swing.plaf.metal.DefaultMetalTheme());
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                SwingUtilities.updateComponentTreeUI(consolepopup);
                look = 3;
                workspace.updateUI();
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 4) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                SwingUtilities.updateComponentTreeUI(consolepopup);
                look = 3;
                workspace.updateUI();
            } catch (Exception e) {
            }
        }
        SwingUtilities.updateComponentTreeUI(this);
        if (menu == 6 && (item < 4)) {
            if (!istabs) {
                int k = splitter2.getDividerLocation();
                tabs.setVisible(true);
                mdi.setVisible(false);
                splitter2.setRightComponent(tabs);
                if (splitter2.getRightComponent().isVisible()) {
                    splitter2.setDividerLocation(k);
                }
                istabs = true;
                for (int i = 0; i < mdi.getComponents().length; i++) {
                    TabPanel panel = ((ExtendedFrame) mdi.getComponent(i)).getPanel();
                    tabs.addTab(panel.title, panel);
                    tabs.setTabComponentAt(tabs.indexOfComponent(panel), new ButtonTabComponent(tabs));
                    tabs.addMouseListener(new MouseAdapter() {

                                public void mouseClicked(MouseEvent evt) {
                                    tabsClicked(evt);
                                }
                            });
                }
            }
        }
        if (menu == 6 && item == 0) {
            tabs.setTabPlacement(JTabbedPane.TOP);
        }
        if (menu == 6 && item == 1) {
            tabs.setTabPlacement(JTabbedPane.LEFT);
        }
        if (menu == 6 && item == 2) {
            tabs.setTabPlacement(JTabbedPane.BOTTOM);
        }
        if (menu == 6 && item == 3) {
            tabs.setTabPlacement(JTabbedPane.RIGHT);
        }
        if (menu == 6 && item == 4) {
            if (istabs) {
                int k = splitter2.getDividerLocation();
                tabs.setVisible(false);
                mdi.setVisible(true);
                splitter2.setRightComponent(mdi);
                if (splitter2.getRightComponent().isVisible()) {
                    splitter2.setDividerLocation(k);
                }
                istabs = false;
                Component[] panels = tabs.getComponents();
                for (int i = 0; i < panels.length; i++) {
                    if (panels[i] instanceof TabPanel) {
                        TabPanel panel = (TabPanel) panels[i];
                        GroupLayout jInternalFrame1Layout = (GroupLayout) panel.frame.getContentPane().getLayout();
                        jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                        jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                    }
                }
            }
        }
        if (menu == 7 && item == 0) {
            LanguageTab lang = new LanguageTab();
            addWindow(lang, 28);
        }
        if (menu == 7 && item == 1) {
            utilities.addStringMessage("Update");
            Updater.update();
        }
        if (menu == 7 && item == 2) {
            PluginsManager manager = new PluginsManager(this, true);
            manager.setVisible(true);
        }
        if (menu == 7 && item == 3) {
            addWindow(globalsettings, 131);
        }
    }

    //</editor-fold>
    //Tree accessing functions

    public Project getCurrentProject() {
        Folder curfol = getCurrentFolder();
        if (curfol == null) {
            return null; //null for none
        }
        while (curfol instanceof Group) {
            curfol = ((Group) curfol).root;
        }
        if (curfol instanceof Project) {
            return (Project) curfol;
        }
        return null;
    }

    public Folder getCurrentFolder() {
        if (getCurrentObject() == null) {
            return null; //null for none
        }
        if (getCurrentObject() instanceof Folder) {
            return (Folder) getCurrentObject();
        }
        if (getCurrentObject() instanceof org.gcreator.fileclass.File) {
            return ((org.gcreator.fileclass.File) getCurrentObject()).root;
        }
        return null;
    }

    public org.gcreator.fileclass.Object getCurrentObject() {
        //Currently selected object
        if (workspace.getSelectionCount() != 1) {
            return null;
        }
        TreePath selection = workspace.getSelectionPath();
        if (!(selection.getLastPathComponent() instanceof ObjectNode)) {
            return null;
        }
        ObjectNode node = (ObjectNode) selection.getLastPathComponent();
        return node.object;
    }

    //<editor-fold defaultstate="collapsed" desc="onToolbarActionPerformed">

    public void onToolbarActionPerformed(int item, ActionEvent evt) {
        int i;
        Folder a;
        switch (item) {
            case 1:
                addWindow(newproject, 55);
                break;
            case 2:
                ProjectImporter.OpenProject(this);
                break;
            case 3:
                //only save for main project
                System.out.println("Saving...");
                if (istabs) {
                    for (int ii = 0; ii < tabs.getTabCount(); ii++) {
                        if (((TabPanel) tabs.getComponentAt(ii)).project == null) {
                        } else if (((TabPanel) tabs.getComponentAt(ii)).project.equals(Aurwindow.getMainProject()) && ((TabPanel) tabs.getComponentAt(ii)).wasModified()) {
                            ((TabPanel) tabs.getComponentAt(ii)).Save();
                        }
                    }
                } else {
                    for (int ii = 0; ii < mdi.getComponentCount(); ii++) {
                        if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project == null) {
                        } else if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project.equals(Aurwindow.getMainProject()) && ((ExtendedFrame) mdi.getComponent(ii)).getPanel().wasModified()) {
                            ((ExtendedFrame) mdi.getComponent(ii)).getPanel().Save();
                        }
                    }
                }
                //save to gcp file
                if (mainProject.location.equals("")) {
                    JFileChooser fc = new JFileChooser();
                    fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
                    fc.showSaveDialog(gcreator.window);
                    java.io.File file = fc.getSelectedFile();
                    if (file == null) {
                        return;
                    }
                    mainProject.location = file.getPath();
                    
                }
                ProjectExporter.export(mainProject, mainProject.location);
                break;
            case 4:
                //save all projects
                System.out.println("Saving all...");
                if (istabs) {
                    for (int ii = 0; ii < tabs.getTabCount(); ii++) {
                        if (((TabPanel) tabs.getComponentAt(ii)).wasModified()) {
                            ((TabPanel) tabs.getComponentAt(ii)).Save();
                        }
                    }
                } else {
                    for (int ii = 0; ii < mdi.getComponentCount(); ii++) {
                        if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().wasModified()) {
                            ((ExtendedFrame) mdi.getComponent(ii)).getPanel().Save();
                        }
                    }
                }
                break;
            case 5:
                //add sprite
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newSprite" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newSprite" + i, "sprite");

                break;
            case 6:
                //add sound
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newSound" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newSound" + i, "sound");

                break;
            case 7:
                //add class
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newClass" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newClass" + i, "egml");

                break;
            case 8:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newActor" + i) != -1) {
                    i++;
                }
                getCurrentProject().actors.add(new Actor("newActor" + i));
                addFile(getCurrentFolder(), "newActor" + i, "actor");
                break;
            case 9:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newScene" + i) != -1) {
                    i++;
                }
                getCurrentProject().scenes.add(new Scene("newScene" + i));
                addFile(getCurrentFolder(), "newScene" + i, "scene");
                break;
            case 10:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    return;
                }
                while (a.findFromName("newImage" + i) != -1) {
                    i++;
                }

                org.gcreator.fileclass.File file = addFile(getCurrentFolder(), "newImage" + i, "png");

        }
    }

    //</editor-fold>

    public org.gcreator.fileclass.File addFile(Folder folder, String name, String type) {

        if (folder == null) {
            return null;
        }
        if (!folder.allowsFileType(type)) {
            return null;
        }
        org.gcreator.fileclass.File file = new org.gcreator.fileclass.File(folder, name, type, null);
        if (file.type.toLowerCase().equals("png") || file.type.toLowerCase().equals("jpg") || file.type.toLowerCase().equals("gif")) {
            file.treeimage = new ImageIcon(getClass().getResource("/org/gcreator/resources/img.png"));
        }
        ObjectNode node = new ObjectNode(file);
        folder.node.add(node);
        TreePath tp = new TreePath(node.getPath());
        workspace.setSelectionPath(tp);
        Open(file);
        workspace.updateUI();
        return file;
    }

    public boolean addGroup(Folder folder, Group group) {
        if (folder == null) {
            return false;
        }
        if (!folder.allowsGroup(group)) {
            return false;
        }
        ObjectNode node = new ObjectNode(group);
        folder.node.add(node);
        workspace.updateUI();
        return true;
    }

    //<editor-fold defaultstate="collapsed" desc="SaveProject">

    public void SaveProject() {
        if (getCurrentProject() != null) {
            ProjectExporter.export(getCurrentProject(), getCurrentProject().name + ".gcp");
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="createToolBar">

    public void createToolBar() {
        tool = new JToolBar("Toolbar");
        tool.setFloatable(false);

        JButton opn = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/openproject.png")), 40);
        JButton save = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/save.png")), 41);
        JButton saveall = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/saveall.png")), 53);
        JButton newp = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/newproject.png")), 39);
        JButton image = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addimage.png")), 42);
        JButton sprite = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addactor02.png")), 43);
        JButton sound = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addsound.png")), 44);
        JButton cl = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addscript.png")), 52);
        JButton actor = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addactor01.png")), 45);
        JButton scene = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addroom.png")), 46);



        image.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(10, evt);
                    }
                });

        sprite.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(5, evt);
                    }
                });

        sound.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(6, evt);
                    }
                });

        cl.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(7, evt);
                    }
                });

        actor.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(8, evt);
                    }
                });

        scene.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(9, evt);
                    }
                });

        newp.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(1, evt);
                    }
                });

        opn.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(2, evt);
                    }
                });

        save.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(3, evt);
                    }
                });

        saveall.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onToolbarActionPerformed(4, evt);
                    }
                });

        tool.setPreferredSize(new Dimension(450, 50));
        tool.setRollover(true);
        tool.add(newp);
        tool.add(opn);
        tool.addSeparator();
        tool.add(save);
        tool.add(saveall);
        tool.addSeparator();
        tool.add(image);
        tool.add(sprite);
        tool.add(sound);
        tool.add(cl);
        tool.add(actor);
        tool.add(scene);
        tool.addSeparator();
        //tool.add(run);
        //tool.addSeparator();
        //tool.add(winlist);
        toolpopup = new ToolbarPopupMenu();
        tool.addMouseListener(new PopupListener(tool, toolpopup));
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="dispose">

    public void dispose() {
        Plugger.onMainWindowDispose(gcreator.plugins);
        saveSettings();
        if (istabs) {
            for (Component a : tabs.getComponents()) {
                if (a instanceof TabPanel) {
                    ((TabPanel) a).dispose();
                } else {
                    for (Component x : mdi.getComponents()) {
                        if (x instanceof ExtendedFrame) {
                            ((ExtendedFrame) x).dispose();
                        }
                    }
                }
            }
        }
        System.exit(0);
        super.dispose();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="saveSettings">

    public void saveSettings() {
        SettingsIO.saveSettings(look, istabs, scroller.isVisible());
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="remove">

    public void remove(TabPanel panel, JInternalFrame frame) {
        tabs.remove(panel);
        mdi.remove(frame);
    }
    //</editor-fold>

}
