package org.gcreator.core;

import org.gcreator.components.impl.CustomFileFilter;
import org.gcreator.components.impl.WorkspaceCellRenderer;
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
import net.iharder.dnd.*;
import org.gcreator.components.*;
import org.gcreator.components.navigator.*;
import org.gcreator.components.popupmenus.*;
import org.gcreator.editors.*;
import org.gcreator.exceptions.*;
import org.gcreator.externproject.*;
import org.gcreator.fileclass.*;
import org.gcreator.fileclass.res.*;
import org.gcreator.help.*;
import org.gcreator.languages.*;
import org.gcreator.managers.*;
import org.gcreator.macro.*;
import org.gcreator.plugins.*;
import org.gcreator.refactoring.*;
import org.gcreator.units.*;
import org.newdawn.slick.command.MouseButtonControl;

/**
 *
 * @author Luís Reis
 * @author TGMG
 */
public class Aurwindow extends JFrame {

    //<editor-fold defaultstate="collapsed" desc="Variables">
    public DefaultMutableTreeNode top;
    public JMenuBar menubar = new JMenuBar();
    public JMenu[] menus = new JMenu[MenuSupporter.MENULIMIT];
    public JMenuItem[] items = new JMenuItem[MenuSupporter.MENULIMIT * MenuSupporter.ITEMLIMIT];
    public JSplitPane splitter1;
    public JSplitPane splitter2;
    //public JSplitPane splitter3;
    public JTabbedPane navigatorTabs;
    public static JTabbedPane tabs;
    public int look;
    public boolean istabs; //True - tabs; False - MDI
    public static boolean showToolbars;
    public MdiPane mdi;
    public JTextPane console;
    public JScrollPane scroller;
    public static JToolBar tool;
    public static String lang;
    public static WorkspaceTree workspace;
    public static JScrollPane treescroll;
    private static Project mainProject;
    public ButtonGroup stylegroup,  wtreepos;
    //public JComboBox winlist; //This will be the windows list
    public ToolbarPopupMenu toolpopup;
    public ConsolePopupMenu consolepopup;
    public static GlobalSettings globalsettings;
    public static NewProject newproject;
    public static NewFileGroup newfilegroup;
    public static AboutPanel about;
    public Container topContainer,  bottomContainer,  leftContainer,  rightContainer;
    private ChangeListener changed;
    public Statusbar statusbar;
    public JLayeredPane layer = new JLayeredPane();
    private static boolean using = false;
    private Vector<FileOpenListener> listeners = new Vector<FileOpenListener>();
    private JPanel navroot = null;
    private JComponent nav = null;
    private Vector<PanelSelectedListener> psel = new Vector<PanelSelectedListener>();
    public static JPanel nofileselnavigator;
    public static JPanel unkresnav;
    private static boolean dragging = false;
    //</editor-fold>

    private boolean isWorkspaceLeft() {
        if (items[MenuSupporter.GenerateMenuItemId(15, 0)].isSelected()) {
            return true;
        }
        return false;
    }
    
    public void deleteFile(org.gcreator.fileclass.File o) {
        System.out.println("Delete file");
        org.gcreator.fileclass.Folder root = o.root;
        ObjectNode node = o.node;
        o.node = null;
        node.object = null;
        node.removeFromParent();
        root.remove(o);
        Project p = o.getProject();
        Vector<org.gcreator.fileclass.File> files = new Vector<org.gcreator.fileclass.File>();
        getFilesFromTo(p.getChildren(), files);
        for(org.gcreator.fileclass.File file : files){
            DeleteRefactorContext context = new DeleteRefactorContext(o, file);
            RefactoringMethod method = Refactorer.getRefactoringMethod(context);
            if(method!=null)
                method.refactor(context);
        }
        workspace.updateUI();
    }
    
    public void deleteGroup(org.gcreator.fileclass.Group o) {
        org.gcreator.fileclass.Folder root = o.root;
        ObjectNode node = o.node;
        o.node = null;
        node.removeFromParent();
        root.remove(o);
        Project p = o.getProject();
        Vector<org.gcreator.fileclass.File> files = new Vector<org.gcreator.fileclass.File>();
        getFilesFromTo(p.getChildren(), files);
        workspace.updateUI();
    }
    
    public void getFilesFromTo(Vector from, Vector<org.gcreator.fileclass.File> to){
        for(java.lang.Object o : from){
            if(o instanceof org.gcreator.fileclass.File){
                to.add((org.gcreator.fileclass.File) o);
            }
            if(o instanceof Folder){
                getFilesFromTo(((Folder) o).getChildren(), to);
            }
        }
    }

    public void popupTreeMenu(MouseEvent e) {
        System.out.println("popup menu");
        if(!using)
            try {
                Robot robot = new Robot();
                robot.mousePress(MouseEvent.BUTTON1_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                using = true;
                robot.mousePress(MouseEvent.BUTTON3_MASK);
                return;
            } catch (Exception ex) {

            }
        JPopupMenu m = new JPopupMenu();
        //int modifiers = e.getModifiersEx();
        //modifiers -= MouseEvent.BUTTON3_DOWN_MASK;
        //modifiers += MouseEvent.BUTTON1_DOWN_MASK;
        //MouseEvent evt = new MouseEvent(workspace, MouseEvent.BUTTON1_DOWN_MASK|MouseEvent.MOUSE_CLICKED, e.getWhen(), modifiers, e.getX(), e.getY(), e.getClickCount(), false);
        final org.gcreator.fileclass.Object o = getCurrentObject();
        if (o == null) {
            return;
        }
        JMenuItem i = new JMenuItem("Delete");
        i.setEnabled(false);
        if (o instanceof org.gcreator.fileclass.File) {
            if (((org.gcreator.fileclass.File) o).root.allowsDelete(o)) {
                i.setEnabled(true);
                i.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        deleteFile((org.gcreator.fileclass.File) o);
                    }
                });
            }
        }
        if (o instanceof org.gcreator.fileclass.Group) {
            if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                i.setEnabled(true);
                if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                    i.setEnabled(true);
                    i.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent evt) {
                            deleteGroup((org.gcreator.fileclass.Group) o);
                        }
                    });
                }
            }
        }
        i.setVisible(true);
            m.add(i);
            m.show(this, e.getXOnScreen(), e.getYOnScreen());
            using = false;
    }

     public java.lang.Object getWindowListElementAt(int pos) {
        if (istabs) {
            if (tabs == null) {
                return null;
            }
            Component[] panels = tabs.getComponents();
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

        if (e.getButton() == MouseEvent.BUTTON1) {
            org.gcreator.fileclass.Object obj = getCurrentObject();
            if (obj instanceof org.gcreator.fileclass.File) {
                Open((org.gcreator.fileclass.File) obj);
            }
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
        } else if (file.type.equals("sprite")) {
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
            addEWindow(new SpriteEditor(file, this.getCurrentProject()), file.name);
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
                addEWindow(new ActorEditor(file, this.getCurrentProject()), file.name);
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
            addEWindow(new SceneEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("egml") || file.type.equals("gcl")) {
            addEWindow(new org.gcreator.editors.GCLEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("gs")) {
            addEWindow(new org.gcreator.editors.ScriptEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("struct")) {
            addEWindow(new StructureEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("bmp") || file.type.equals("gif") || file.type.equals("jpg") || file.type.equals("jpeg") || file.type.equals("png")) {
            addEWindow(new ImageEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("wav") || file.type.equals("mid") || file.type.equals("ogg")) {
            addEWindow(new SoundEditor(file, this.getCurrentProject()), file.name);
        } else if (file.type.equals("settings")) {
            addEWindow(new SettingsEditor(this.getCurrentProject(), file), file.name);
        } else if (file.type.equals("timeline")) {
            try {
                addEWindow(new TimelineEditor(file, this.getCurrentProject()), file.name);
            } catch (WrongResourceException e) {
            }
        } else if (file.type.equals("tileset")) {
            addEWindow(new TilesetEditor(file, this.getCurrentProject()), file.name);
        } else {
            addEWindow(new PlainTextEditor(file, this.getCurrentProject()), file.name); //All unmanaged file formats
        }
        Macro.macroAction(new OpenFileAction(file));
    }

    public static Project getMainProject() {
        return mainProject;
    }

    public static void setMainProject(Project newmain) {
        mainProject = newmain;
        try {
            workspace.updateUI();
        } catch (Exception e) {
        }
    }

    public void addWindow(TabPanel panel, int title) {
        addWindow(panel, LangSupporter.activeLang.getEntry(title));
    }

    public void addEWindow(TabPanel panel, String title) {
        if (title.charAt(0) == '$') {
            try {
                addWindow(panel, Integer.parseInt(title.substring(1)));
            } catch (Exception e) {
                addWindow(panel, title);
            }
        } else {
            addWindow(panel, title);
        }
    }

    //<editor-fold defaultstate="collapsed" desc="addWindow(panel,title)">
    public void addWindow(TabPanel panel, String title) {
        try {
            panel.parent = this;
            panel.title = title;
            int ver = Integer.parseInt(gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
            if (istabs && ver >= 6) {
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
                try {
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
                } catch (ClassCastException e) {
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
            frame.addInternalFrameListener(new InternalFrameListener() {

                public void internalFrameDeactivated(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }

                public void internalFrameActivated(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }

                public void internalFrameDeiconified(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }

                public void internalFrameIconified(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }

                public void internalFrameClosed(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }

                public void internalFrameClosing(InternalFrameEvent evt) {
                }

                public void internalFrameOpened(InternalFrameEvent evt) {
                    changed.stateChanged(null);
                }
            });
            frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            org.jdesktop.layout.GroupLayout jInternalFrame1Layout = new org.jdesktop.layout.GroupLayout(frame.getContentPane());
            frame.getContentPane().setLayout(jInternalFrame1Layout);
            if (!istabs) {
                jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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

    public boolean addPanelSelectedListener(PanelSelectedListener psl) {
        return psel.add(psl);
    }

    public boolean removePanelSelectedListener(PanelSelectedListener psl) {
        return psel.remove(psl);
    }

    public void callAllPanelSelectedListeners(TabPanel panel) {
        for (PanelSelectedListener psl : psel) {
            psl.panelSelected(panel);
        }
    }

    public JComponent getNavigatorPanel() {
        return nav;
    }

    public void updateNavigatorPanel(JComponent panel) {
        //splitter3.setBottomComponent(panel);
        nav = panel;
        navroot.removeAll();
        if(nav!=null)
            navroot.add(nav, BorderLayout.CENTER);
    }

    public void updateToDefaultNavigatorPanel(TabPanel panel) {
        if (panel == null || panel.project == null) {
            updateNavigatorPanel(nofileselnavigator);
            return;
        }
        if (panel instanceof ActorEditor) {
            updateNavigatorPanel(new ActorNavigator(((ActorEditor) panel).file));
            return;
        }
        updateNavigatorPanel(unkresnav);
    }

    /**
     * @deprecated
     */
    public void setContentPane(Container c) {
    }

    protected Aurwindow(String[] settings) {
        setTitle("G-Creator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setJMenuBar(menubar);
        setIconImage(new ImageIcon(getClass().getResource("/org/gcreator/resources/GCreator.png")).getImage());
        super.setContentPane(new JPanel());
        istabs = true;
        console = new JTextPane();
        topContainer = new Container();
        bottomContainer = new Container();
        rightContainer = new Container();
        leftContainer = new Container();
        console.setEditable(false);
        console.setBackground(Colorfeel.ConsoleBGColor);
        console.setDisabledTextColor(Colorfeel.ConsoleFGColor);
        scroller = new JScrollPane();
        //winlist = new JComboBox();
        //winlist.setModel(new MyModel());
        console.setEditable(false);
        console.setContentType("text/html");
        scroller.setViewportView(console);
        statusbar = new Statusbar();
        navigatorTabs = new JTabbedPane();
        navroot = new JPanel();
        navroot.setLayout(new BorderLayout());

        int ver = Integer.parseInt(gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
        if (ver >= 6) {
            new FileDrop(this, new FileDrop.Listener() {

                public void filesDropped(java.io.File[] files) {
                    // handle file drop
                    for (int i = 0; i < files.length; i++) {
                        System.out.println(files[i].getName());
                    }
                }   // end filesDropped
            }); // end FileDrop.Listener
        }
        SettingsIO.console = console;

        consolepopup = new ConsolePopupMenu();
        console.addMouseListener(new PopupListener(console, consolepopup));
        tabs = new JTabbedPane();
        mdi = new MdiPane();
        splitter1 = new JSplitPane();
        splitter2 = new JSplitPane();
        tabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        changed = new ChangeListener() {

            public void stateChanged(ChangeEvent evt) {
                if (istabs) {
                    Component c = tabs.getSelectedComponent();
                    if (c != null) {
                        selectedDocumentChanged((TabPanel) c);
                    } else {
                        selectedDocumentChanged(null);
                    }
                } else {
                    JInternalFrame f = mdi.getSelectedFrame();
                    if (f != null) {
                        selectedDocumentChanged(((ExtendedFrame) f).getPanel());
                    } else {
                        selectedDocumentChanged(null);
                    }
                }
            }
        };
        tabs.addChangeListener(changed);

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
        workspace = new WorkspaceTree(top);
        workspace.setVisible(true);

        workspace.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    treeDoubleClicked(e);
                }
                
            }

            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()||e.getButton()==MouseEvent.BUTTON3) {
                    System.out.println("Got here");
                    popupTreeMenu(e);
                }
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
        menus[9] = MenuSupporter.MakeSubMenu(menus[0], 10, "Import...");
        menus[10] = MenuSupporter.MakeSubMenu(menus[9], 185, "File");
        items[MenuSupporter.GenerateMenuItemId(10, 0)] = MenuSupporter.MakeMenuItem(menus[10], 189, "Import Image");
        items[MenuSupporter.GenerateMenuItemId(10, 0)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(10, 0, evt);
            }
        });
        menus[11] = MenuSupporter.MakeSubMenu(menus[9], 186, "Project");
        menus[12] = MenuSupporter.MakeSubMenu(menus[0], 11, "Export...");
        menus[13] = MenuSupporter.MakeSubMenu(menus[12], 185, "File");
        menus[14] = MenuSupporter.MakeSubMenu(menus[12], 186, "Project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 10)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 10)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 10, evt);
            }
        });
        /*menus[1] = MenuSupporter.MakeMenu(menubar, 1, "Undo/Redo and clipboard functions can be found here.");
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
        });*/
        menus[2] = MenuSupporter.MakeMenu(menubar, 2, "Layout and design options are defined here.");
        menus[5] = MenuSupporter.MakeSubMenu(menus[2], 15, "Look&Feel");
        menus[6] = MenuSupporter.MakeSubMenu(menus[2], 16, "Display mode");
        menus[15] = MenuSupporter.MakeSubMenu(menus[2], 193, "Display mode");
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
        menus[7].addSeparator();
        menus[8] = MenuSupporter.MakeSubMenu(menus[7], 171, "Macro");
        items[MenuSupporter.GenerateMenuItemId(7, 4)] = MenuSupporter.MakeMenuItem(menus[7], 183, "PowerPack");
        items[MenuSupporter.GenerateMenuItemId(7, 4)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(7, 4, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(8, 0)] = MenuSupporter.MakeMenuItem(menus[8], 172, "Play macro");
        items[MenuSupporter.GenerateMenuItemId(8, 0)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(8, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(8, 1)] = MenuSupporter.MakeMenuItem(menus[8], 173, "Edit macro");
        items[MenuSupporter.GenerateMenuItemId(8, 1)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(8, 1, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(8, 2)] = MenuSupporter.MakeMenuItem(menus[8], 174, "Record new macro");
        items[MenuSupporter.GenerateMenuItemId(8, 2)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(8, 2, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(8, 3)] = MenuSupporter.MakeMenuItem(menus[8], 182, "Stop recording macro");
        items[MenuSupporter.GenerateMenuItemId(8, 3)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(8, 3, evt);
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
        items[MenuSupporter.GenerateMenuItemId(5, 3)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 132, "Metal theme");
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
        wtreepos = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(15, 0)] = MenuSupporter.MakeRadioMenuItem(wtreepos, menus[15], 194, "Tree Left");
        items[MenuSupporter.GenerateMenuItemId(15, 0)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(15, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(15, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(15, 1)] = MenuSupporter.MakeRadioMenuItem(wtreepos, menus[15], 195, "Tree Right");
        items[MenuSupporter.GenerateMenuItemId(15, 1)].addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(15, 1, evt);
            }
        });
        //</editor-fold>
        splitter1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitter2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitter1.setLeftComponent(splitter2);
        splitter1.setRightComponent(scroller);
        if (settings == null || settings.length < 6 || settings[5] == null || !settings[5].equals("Right")) {
            splitter2.setLeftComponent(navigatorTabs);
            splitter2.setRightComponent(tabs);
            items[MenuSupporter.GenerateMenuItemId(15, 0)].setSelected(true);
        } else {
            splitter2.setRightComponent(navigatorTabs);
            splitter2.setLeftComponent(tabs);
            items[MenuSupporter.GenerateMenuItemId(15, 1)].setSelected(true);
        }
        navigatorTabs.add("Workspace", treescroll);
        navigatorTabs.add("Navigator", navroot);
        navigatorTabs.addMouseListener(new MouseListener(){
            public void mouseExited(MouseEvent evt){}
            public void mouseEntered(MouseEvent evt){}
            public void mouseReleased(MouseEvent evt){
                if(evt.getButton()!=MouseEvent.BUTTON1)
                    return;
                dragging = false;
            }
            public void mousePressed(MouseEvent evt){
                if(evt.getButton()!=MouseEvent.BUTTON1)
                    return;
                if(!dragging)
                    dragging = true;
            }
            public void mouseClicked(MouseEvent evt){}
        });
        navigatorTabs.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent evt){}
            public void mouseDragged(MouseEvent evt){
                if(!dragging)
                    return;
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                Point p = navigatorTabs.getLocationOnScreen();
                int nx = p.x;
                int ny = p.y;
                int w = navigatorTabs.getWidth();
                int h = navigatorTabs.getHeight();
                int index = navigatorTabs.getSelectedIndex();
                if(index==-1)
                    return;
                Component c = navigatorTabs.getSelectedComponent();
                String title = navigatorTabs.getTitleAt(index);
                if(x<nx||y<ny||x>nx+w||y>ny+h){
                    Robot r = null;
                    try{
                        r = new Robot();
                    }
                    catch(Exception e){
                        
                    }
                    if(r!=null)
                        r.mouseRelease(InputEvent.BUTTON1_MASK);
                    JFrame f = new JFrame(){
                        public void dispose(){
                            navigatorTabs.addTab(getTitle(), getContentPane());
                            super.dispose();
                        }
                    };
                    f.setAlwaysOnTop(true);
                    f.setVisible(true);
                    f.setTitle(title);
                    f.setLayout(new BorderLayout());
                    f.setSize(c.getSize());
                    f.add(c, BorderLayout.CENTER);
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setResizable(true);
                    f.setLocation(evt.getXOnScreen()-30, evt.getYOnScreen()-5);
                    if(r!=null)
                        r.mousePress(InputEvent.BUTTON1_MASK);
                }
            }
        });
        splitter2.setDividerLocation(100);

        //<editor-fold defaultstate="collapsed" desc="Layout Manager">
        /*org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(tool, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE).add(splitter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))));
        layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().add(tool, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(splitter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)));*/
        Container cont = getContentPane();
        Container panel = new Container();
        panel.setLayout(new BorderLayout());
        topContainer.setLayout(new GridLayout(0, 1));
        cont.setLayout(new BorderLayout());
        cont.add(panel, BorderLayout.CENTER);
        cont.add(statusbar, BorderLayout.SOUTH);
        bottomContainer.setLayout(new GridLayout(0, 1));
        rightContainer.setLayout(new GridLayout(1, 0));
        leftContainer.setLayout(new GridLayout(1, 0));
        //Begin content manager
        //topContainer.add(tool);
        //layer = new JLayeredPane();
        layer.setVisible(true);
        panel.add(bottomContainer, BorderLayout.SOUTH);
        panel.add(topContainer, BorderLayout.NORTH);
        panel.add(leftContainer, BorderLayout.WEST);
        panel.add(rightContainer, BorderLayout.EAST);
        panel.add(layer, BorderLayout.CENTER);
        splitter1.setVisible(true);
        splitter1.setLocation(0, 0);
        splitter1.setSize(layer.getSize());
        layer.add(splitter1, JLayeredPane.DEFAULT_LAYER);
        //layer.add(internal, JLayeredPane.PALETTE_LAYER);
        layer.addComponentListener(new ComponentListener(){
            public void componentHidden(ComponentEvent evt){}
            public void componentShown(ComponentEvent evt){}
            public void componentMoved(ComponentEvent evt){}
            public void componentResized(ComponentEvent evt){
                //String thi = evt.paramString().replaceAll("COMPONENT_RESIZED [(][0-9]+,[0-9]+ (.*)[)]", "$1");
                //String ws = thi.replaceAll("([0-9]+)x[0-9]+", "$1");
                //String hs = thi.replaceAll("[0-9]+x([0-9]+)", "$1");
                //int width = Integer.parseInt(ws);
                //int height = Integer.parseInt(hs);
                //splitter1.setSize(width, height);
                splitter1.setSize(layer.getSize());
                splitter1.updateUI();
            }
        });

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

        if (settings[4].equals("Visible")) {
            showToolbars = true;
            //tool.setVisible(true);
            items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(true);
        } else {
            //tool.setVisible(false);
            showToolbars = false;
            topContainer.setVisible(false);
            bottomContainer.setVisible(false);
            leftContainer.setVisible(false);
            rightContainer.setVisible(false);
            items[MenuSupporter.GenerateMenuItemId(2, 1)].setSelected(false);
        }

        //pack();
        int w = 800;
        int h = 600;
        try {
            w = Integer.parseInt(settings[6].replaceAll("([0-9]+), ([0-9]+)", "$1"));
            h = Integer.parseInt(settings[6].replaceAll("([0-9]+), ([0-9]+)", "$2"));
        } catch (Exception e) {
        }
        setSize(w, h);
        splitter2.setDividerLocation(100);
        splitter1.setDividerSize(5);
        splitter2.setDividerSize(5);
        utilities.addMessage(29);
        //</editor-fold>
        WelcomeTab welcome = new WelcomeTab();
        addWindow(welcome, 26);
        updateToDefaultNavigatorPanel(welcome);
        setMinimumSize(new Dimension(200, 200));
        if (settings[6].equals("True")) {
            setExtendedState(MAXIMIZED_BOTH);
        } else {
            setExtendedState(NORMAL);
        }
        setVisible(true);
        statusbar.setStandardText("Done");
        statusbar.restoreText();
        statusbar.getProgressBar().setVisible(false);
    }
    //</editor-fold>
    int tabsi = 0;

    public JInternalFrame createPaletteFrame(){
        JInternalFrame f = new JInternalFrame();
        f.setVisible(true);
        f.setLocation(50, 50);
        f.setSize(200, 200);
        f.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        layer.add(f, JLayeredPane.PALETTE_LAYER);
        return f;
    }
    
    public JInternalFrame createPaletteFrame(JInternalFrame f){
        f.setVisible(true);
        f.setLocation(50, 50);
        f.setSize(200, 200);
        f.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        layer.add(f, JLayeredPane.PALETTE_LAYER);
        return f;
    }
    
    private void tabsClicked(MouseEvent evt) {
    //Leave in blank... for now...
    }

    private void selectedDocumentChanged(TabPanel tabpanel) {
        updateToDefaultNavigatorPanel(tabpanel);
        callAllPanelSelectedListeners(tabpanel);
    }

    //<editor-fold defaultstate="collapsed" desc="onItemActionPerformed">
    public void updateUI() {
        ((JPanel) this.getContentPane()).updateUI();
    }
    public static JFileChooser chooseImage = new JFileChooser();

    static {
        chooseImage.setDialogTitle("Select Image");
        chooseImage.setDialogType(JFileChooser.OPEN_DIALOG);
        chooseImage.setApproveButtonText("OK");
        chooseImage.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

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
        if (menu == 0 && item == 10) {
            dispose();
        }
        /*if (menu == 1 && item == 2) {
        gcreator.output = "";
        console.setText("");
        }*/
        if (menu == 2 && item == 0) {
            Dimension a = this.getSize();
            int b = this.getExtendedState();
            scroller.setVisible(!scroller.isVisible());
            //pack();
            //this.setSize(a);
            //this.setExtendedState(b);
            this.repaint();
            splitter1.setDividerLocation(0.80);
        }
        if (menu == 2 && item == 1) {
            Dimension a = this.getSize();
            //tool.setVisible(!tool.isVisible());
            showToolbars = items[MenuSupporter.GenerateMenuItemId(2, 1)].isSelected();
            topContainer.setVisible(showToolbars);
            bottomContainer.setVisible(showToolbars);
            leftContainer.setVisible(showToolbars);
            rightContainer.setVisible(showToolbars);
            if (!showToolbars) {
                //ToolbarManager.destroyToolbars();
                ToolbarManager.hideAll();
            } else {
                //ToolbarManager.makeToolbars(this);
                ToolbarManager.showAll();
            }
            //this.setSize(a);
            updateUI();

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
        try {
            if (menu == 5 && item == 0) {
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

            }
            if (menu == 5 && item == 1) {
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
            }
            if (menu == 5 && item == 2) {
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
            }
            if (menu == 5 && item == 3) {
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
            }
            if (menu == 5 && item == 4) {
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
            }
        } catch (Exception e) {
            SwingUtilities.updateComponentTreeUI(this);
        }
        if (menu == 6 && (item < 4)) {
            if (!istabs) {
                int k = splitter2.getDividerLocation();
                tabs.setVisible(true);
                mdi.setVisible(false);
                if (isWorkspaceLeft()) {
                    splitter2.setRightComponent(tabs);
                    if (splitter2.getRightComponent().isVisible()) {
                        splitter2.setDividerLocation(k);
                    }
                } else {
                    splitter2.setLeftComponent(tabs);
                    if (splitter2.getLeftComponent().isVisible()) {
                        splitter2.setDividerLocation(k);
                    }
                }
                istabs = true;
                for (int i = 0; i < mdi.getComponents().length; i++) {
                    try {
                        TabPanel panel = ((ExtendedFrame) mdi.getComponent(i)).getPanel();
                        tabs.addTab(panel.title, panel);
                        int ver = Integer.parseInt(org.gcreator.core.gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
                        if (ver >= 6) {
                            tabs.setTabComponentAt(tabs.indexOfComponent(panel), new ButtonTabComponent(tabs));
                        }
                        tabs.addMouseListener(new MouseAdapter() {

                            public void mouseClicked(MouseEvent evt) {
                                tabsClicked(evt);
                            }
                            });
                    } catch (ClassCastException e) {
                    }
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
                if (isWorkspaceLeft()) {
                    splitter2.setRightComponent(mdi);
                    if (splitter2.getRightComponent().isVisible()) {
                        splitter2.setDividerLocation(k);
                    }
                } else {
                    splitter2.setLeftComponent(mdi);
                    if (splitter2.getLeftComponent().isVisible()) {
                        splitter2.setDividerLocation(k);
                    }
                }

                istabs = false;
                Component[] panels = tabs.getComponents();
                for (int i = 0; i < panels.length; i++) {
                    if (panels[i] instanceof TabPanel) {
                        TabPanel panel = (TabPanel) panels[i];
                        org.jdesktop.layout.GroupLayout jInternalFrame1Layout = (org.jdesktop.layout.GroupLayout) panel.frame.getContentPane().getLayout();
                        jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                        jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
            //PluginsManager manager = new PluginsManager(this, true);
            PluginDialog manager = new PluginDialog(this, true);
            manager.setVisible(true);
        }
        if (menu == 7 && item == 3) {
            addWindow(globalsettings, 131);
        }
        if (menu == 7 && item == 4) {
            addWindow(new PowerPackImporter(), 184);
        }
        if (menu == 8 && item == 0) {
            PlayMacroDialog dialog = new PlayMacroDialog(this, true);
            dialog.setVisible(true);
        }
        if (menu == 8 && item == 2) {
            String mname = JOptionPane.showInputDialog(this, LangSupporter.activeLang.getEntry(175));
            if (mname != null && mname.length() > 0) {
                if (MacroLibrary.findMacro(mname) != null) {
                    JOptionPane.showMessageDialog(
                            this,
                            LangSupporter.activeLang.getEntry(177),
                            LangSupporter.activeLang.getEntry(176),
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    MacroLibrary.addMacro(Macro.record(mname));
                }
            }
        }
        if (menu == 8 && item == 3) {
            Macro.recordingMacro = null;
        }
        if (menu == 10 && item == 0) {
            chooseImage.showDialog(this, null);
            java.io.File f = chooseImage.getSelectedFile();
            try {
                if (f != null) {
                    StdImport.importImage(getCurrentFolder(), f);
                }
            } catch (IOException e) {
            }
        }
        if (menu == 15 && item == 0) {
            splitter2.setRightComponent(null);
            splitter2.setLeftComponent(null);
            splitter2.setRightComponent(istabs ? tabs : mdi);
            splitter2.setLeftComponent(navigatorTabs);
            tabs.updateUI();
            mdi.updateUI();
            splitter2.updateUI();
            splitter1.updateUI();
        }
        if (menu == 15 && item == 1) {
            splitter2.setRightComponent(null);
            splitter2.setLeftComponent(null);
            splitter2.setRightComponent(navigatorTabs);
            splitter2.setLeftComponent(istabs ? tabs : mdi);
            tabs.updateUI();
            mdi.updateUI();
            splitter2.updateUI();
            splitter1.updateUI();
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
                if (mainProject.location == null || mainProject.location.equals("")) {
                    JFileChooser fc = new JFileChooser();
                    fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
                    fc.showSaveDialog(gcreator.window);
                    java.io.File file = fc.getSelectedFile();
                    if (file == null) {
                        return;
                    }
                    mainProject.location = file.getPath();
                    if (!mainProject.location.contains(".")) {
                        mainProject.location += ".gcp";
                    }
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
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
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
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newSound" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newSound" + i, "wav");

                break;
            case 7:
                //add class
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newClass" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newClass" + i, "gcl");

                break;
            case 8:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newActor" + i) != -1) {
                    i++;
                }
                //getCurrentProject().actors.add(new Actor("newActor" + i));
                addFile(getCurrentFolder(), "newActor" + i, "actor");
                break;
            case 9:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newScene" + i) != -1) {
                    i++;
                }
                //getCurrentProject().scenes.add(new Scene("newScene" + i));
                addFile(getCurrentFolder(), "newScene" + i, "scene");
                break;
            case 10:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newImage" + i) != -1) {
                    i++;
                }

                org.gcreator.fileclass.File file = addFile(getCurrentFolder(), "newImage" + i, "png");
                break;
            case 11:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newTileset" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newTileset" + i, "tileset");
                break;
            case 12:
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newTimeline" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newTimeline" + i, "timeline");
                break;
            case 13:
                //add class
                i = 1;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                while (a.findFromName("newScript" + i) != -1) {
                    i++;
                }
                addFile(getCurrentFolder(), "newScript" + i, "gs");

                break;
        }
    }

    //</editor-fold>
    public static ImageIcon imgicon = new ImageIcon(Aurwindow.class.getResource("/org/gcreator/resources/img.png"));

    public org.gcreator.fileclass.File addFile(Folder folder, String name, String type) {

        if (folder == null) {
            return null;
        }
        if (!folder.allowsFileType(type)) {
            folder = folder.magicAddition(type);
            if (folder == null) {
                return null;
            }
        }
        org.gcreator.fileclass.File file = new org.gcreator.fileclass.File(folder, name, type, null);
        /*if (file.type.toLowerCase().equals("png") || file.type.toLowerCase().equals("jpg") || file.type.toLowerCase().equals("gif")) {
        file.treeimage = imgicon;
        }*/
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

    public void paint(Graphics g) {
        super.paint(g);
    }

    public void paintAll(Graphics g) {
        super.paintAll(g);
    }

    public void paintComponents(Graphics g) {
        super.paintComponents(g);
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
        toolpopup = new ToolbarPopupMenu();
        ToolbarManager.makeToolbars(this);
    //tool = new JToolBar("Toolbar");
    //tool.setFloatable(false);

    /*JButton opn = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/openproject.png")), 40);
    JButton save = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/save.png")), 41);
    JButton saveall = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/saveall.png")), 53);
    JButton newp = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/newproject.png")), 39);
    JButton image = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addimage.png")), 42);
    JButton sprite = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addactor02.png")), 43);
    JButton sound = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addsound.png")), 44);
    JButton cl = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addscript.png")), 52);
    JButton actor = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addactor01.png")), 45);
    JButton scene = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addroom.png")), 46);
    JButton tileset = ToolbarManager.addButton(null, 190);
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
    tileset.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    onToolbarActionPerformed(11, evt);
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
    tool.add(tileset);
    tool.add(sound);
    tool.add(cl);
    tool.add(actor);
    tool.add(scene);
    tool.addSeparator();
    //tool.add(run);
    //tool.addSeparator();
    //tool.add(winlist);
    toolpopup = new ToolbarPopupMenu();
    tool.addMouseListener(new PopupListener(tool, toolpopup));*/
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="dispose">
    public void dispose() {
        if (!gcreator.applet && gcreator.plugload) {
            Plugger.onMainWindowDispose();
        }
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
        try {
            ToolbarManager.writeToolbarFile("toolbarList.gctl");
        } catch (IOException e) {
        }
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="remove">
    public void remove(TabPanel panel, JInternalFrame frame) {
        tabs.remove(panel);
        try {
            mdi.remove(frame);
        } catch (NullPointerException e) {
        }
    }
    //</editor-fold>
}
