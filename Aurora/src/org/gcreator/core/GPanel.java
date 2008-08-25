/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.core;

//<editor-fold defaultstate="collapsed" desc="Import statements">
import com.golden.gamedev.util.FileUtil;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import net.iharder.dnd.*;
import org.gcreator.components.*;
import org.gcreator.components.custom.*;
import org.gcreator.components.impl.*;
import org.gcreator.components.navigator.*;
import org.gcreator.components.popupmenus.*;
import org.gcreator.editors.*;
import org.gcreator.exceptions.*;
import org.gcreator.externproject.*;
import org.gcreator.fileclass.*;
import org.gcreator.help.*;
//import org.gcreator.macro.*;
import org.gcreator.managers.*;
import org.gcreator.plugins.*;
import org.gcreator.refactoring.*;
import org.gcreator.units.*;
//</editor-fold>
/**
 * GPanel is the main panel
 * 
 * @author Luís Reis
 * @author TGMG
 */
public class GPanel extends JPanel {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    private ICore icore;
    public boolean istabs; //True - tabs; False - MDI
    public MdiPane mdi;
    public JTabbedPane tabs;
    public JScrollPane scroller;
    private ChangeListener changed;
    public DefaultMutableTreeNode top;
    public JMenuBar menubar = new JMenuBar();
    public JMenu[] menus = new JMenu[MenuSupporter.MENULIMIT];
    public JMenuItem[] items = new JMenuItem[MenuSupporter.MENULIMIT * MenuSupporter.ITEMLIMIT];
    public JSplitPane splitter1;
    public JSplitPane splitter2;
    public int dividerLocation;
    //public JSplitPane splitter3;
    public JTabbedPane navigatorTabs;
    //public int look;
    public boolean showToolbars;
    public JTextPane console;
    public JToolBar tool;
    //public String lang;
    public WorkspaceTree workspace;
    public JScrollPane treescroll;
    private static Project mainProject;
    public ButtonGroup wtreepos;
    //public JComboBox winlist; //This will be the windows list
    public ToolbarPopupMenu toolpopup;
    public ConsolePopupMenu consolepopup;
    public GlobalSettings globalsettings;
    public NewProject newproject;
    public NewFileGroup newfilegroup;
    public AboutPanel about;
    public Container topContainer,  bottomContainer,  leftContainer,  rightContainer;
    public Statusbar statusbar;
    public JLayeredPane layer = new JLayeredPane();
    private boolean using = false;
    private Vector<FileOpenListener> listeners = new Vector<FileOpenListener>();
    private JPanel navroot = null;
    private JComponent nav = null;
    private Vector<PanelSelectedListener> psel = new Vector<PanelSelectedListener>();
    public JPanel nofileselnavigator;
    public JPanel unkresnav;
    private boolean dragging = false;
    private int tabsi = 0;
    public JFileChooser chooseImage;// = new JFileChooser();
    //public static ImageIcon imgicon = new ImageIcon(Aurwindow.class.getResource("/org/gcreator/resources/img.png"));
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GPanel (Constructor)">
    public GPanel(ICore icore) {
        this.icore = icore;

        try {
            chooseImage = new JFileChooser();
            chooseImage.setDialogTitle("Select Image");
            chooseImage.setDialogType(JFileChooser.OPEN_DIALOG);
            chooseImage.setApproveButtonText("OK");
            chooseImage.setFileSelectionMode(JFileChooser.FILES_ONLY);
        } catch (Exception e) {
            System.out.println("JFileChooser error in static Aurwindow: " + e);
            e.printStackTrace();
        }
        try {
            chooseImage = new JFileChooser();
            chooseImage.setDialogTitle("Select Image");
            chooseImage.setDialogType(JFileChooser.OPEN_DIALOG);
            chooseImage.setApproveButtonText("OK");
            chooseImage.setFileSelectionMode(JFileChooser.FILES_ONLY);
        } catch (Exception e) {
        }

        SplashScreen.message = "Initiating window....";
        gcreator.splash.repaint();
        icore.setTitle("G-Creator");
        icore.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        icore.setJMenuBar(menubar);
        icore.setIconImage(new ImageIcon(getClass().getResource("/org/gcreator/resources/GCreator.png")).getImage());
        JPanel p = new JPanel();
        p.setVisible(true);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        SplashScreen.message = "Starting user interface...";
        gcreator.splash.repaint();

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

        console.setContentType("text/html");
        scroller.setViewportView(console);
        statusbar = new Statusbar();
        navigatorTabs = new JTabbedPane();
        navroot = new JPanel();
        navroot.setLayout(new BorderLayout());
        /*new FileDrop(this, new FileDrop.Listener() {
        @Override
        public void filesDropped(java.io.File[] files) {
        // handle file drop
        for (int i = 0; i < files.length; i++) {
        }
        }   // end filesDropped
        }); // end FileDrop.Listener*/

        consolepopup = new ConsolePopupMenu();
        console.addMouseListener(new PopupListener(console, consolepopup));
        tabs = new JTabbedPane();
        mdi = new MdiPane();
        splitter1 = new JSplitPane();
        splitter2 = new JSplitPane();
        tabs.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        changed = new ChangeListener() {

            @Override
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

        tabs.addMouseListener(new MouseListener() {

            public void mousePressed(MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    TabsPopupMenu m = new TabsPopupMenu(tabs);
                    m.show(evt);
                }
            }

            public void mouseEntered(MouseEvent evt) {
            }

            public void mouseExited(MouseEvent evt) {
            }

            public void mouseReleased(MouseEvent evt) {
            }

            public void mouseClicked(MouseEvent evt) {
            }
        });


        createToolBar();

        top = new DefaultMutableTreeNode("<HTML><b>" + org.gcreator.units.Dictionary.getEntry("workspace-rootnode"));
        top.setAllowsChildren(true);

        /*
         * Set up tree
         */
        workspace = new WorkspaceTree(top);
        workspace.setVisible(true);

        workspace.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                //Check wether 'Delete' was pressed

                if (e.getKeyCode() != KeyEvent.VK_DELETE) {
                    return;
                }

                final org.gcreator.fileclass.GObject o = getCurrentObject();
                if (o == null) {
                    return;
                }

                if (o instanceof org.gcreator.fileclass.GFile) {
                    if (((org.gcreator.fileclass.GFile) o).root.allowsDelete(o)) {
                        if (getConfirmDelete("Are you sure you want to delete this resource?")) {
                            deleteFile((org.gcreator.fileclass.GFile) o);
                        }
                    }
                }
                if (o instanceof org.gcreator.fileclass.Group) {
                    if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                        if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                            if (getConfirmDelete("Are you sure you want to delete this group and all of its contents?")) {
                                deleteGroup((org.gcreator.fileclass.Group) o);
                            }
                        }
                    }
                }
            }

            public boolean getConfirmDelete(String message) {
                int i = JOptionPane.showConfirmDialog(GPanel.this, message, "Confirmation", JOptionPane.YES_NO_OPTION);
                return (i == 0);
            }
        });

        workspace.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    treeDoubleClicked(e);
                }

            }

            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger() || e.getButton() == MouseEvent.BUTTON3) {
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

        MenuSupporter.MakeDefaultMenus(this);

        splitter1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitter1.setOneTouchExpandable(true);//Note that this doesn't display correctly in GTK+
        splitter2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitter1.setLeftComponent(splitter2);
        splitter1.setRightComponent(scroller);
        if (Registry.get("Window.treePosition") == null || !Registry.get("Window.treePosition").equals("Right")) {
            splitter2.setLeftComponent(navigatorTabs);
            splitter2.setRightComponent(tabs);
            items[MenuSupporter.GenerateMenuItemId(15, 0)].setSelected(true);
        } else {
            splitter2.setRightComponent(navigatorTabs);
            splitter2.setLeftComponent(tabs);
            items[MenuSupporter.GenerateMenuItemId(15, 1)].setSelected(true);
        }
        navigatorTabs.add(org.gcreator.units.Dictionary.getEntry("workspace-title"), treescroll);
        navigatorTabs.add(org.gcreator.units.Dictionary.getEntry("navigator-title"), navroot);
        navigatorTabs.addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent evt) {
            }

            public void mouseEntered(MouseEvent evt) {
            }

            public void mouseReleased(MouseEvent evt) {
                if (evt.getButton() != MouseEvent.BUTTON1) {
                    return;
                }
                dragging = false;
            }

            public void mousePressed(MouseEvent evt) {
                if (evt.getButton() != MouseEvent.BUTTON1) {
                    return;
                }
                if (!dragging) {
                    dragging = true;
                }
            }

            public void mouseClicked(MouseEvent evt) {
            }
        });
        navigatorTabs.addMouseMotionListener(new MouseMotionListener() {

            public void mouseMoved(MouseEvent evt) {
            }

            public void mouseDragged(MouseEvent evt) {
                if (!dragging) {
                    return;
                }
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                Point p = navigatorTabs.getLocationOnScreen();
                int nx = p.x;
                int ny = p.y;
                int w = navigatorTabs.getWidth();
                int h = navigatorTabs.getHeight();
                int index = navigatorTabs.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                Component c = navigatorTabs.getSelectedComponent();
                String title = navigatorTabs.getTitleAt(index);
                if (x < nx || y < ny || x > nx + w || y > ny + h) {
                    Robot r = null;
                    try {
                        r = new Robot();
                    } catch (Exception e) {
                    }
                    if (r != null) {
                        r.mouseRelease(InputEvent.BUTTON1_MASK);
                    }
                    JFrame f = new JFrame() {

                        @Override
                        public void dispose() {
                            navigatorTabs.addTab(getTitle(), getContentPane());
                            super.dispose();
                        }
                    };
                    f.setAlwaysOnTop(true);
                    f.setTitle(title);
                    f.setLayout(new BorderLayout());
                    f.setSize(c.getSize());
                    f.add(c, BorderLayout.CENTER);
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setResizable(true);
                    f.setLocation(evt.getXOnScreen() - 30, evt.getYOnScreen() - 5);
                    f.setVisible(true);
                    if (r != null) {
                        r.mousePress(InputEvent.BUTTON1_MASK);
                    }
                }
            }
        });
        splitter2.setDividerLocation(149);

        /*org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(tool, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE).add(splitter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))));
        layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout.createSequentialGroup().add(tool, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(splitter1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)));*/
        SplashScreen.message = "Creating toolbars";
        gcreator.splash.repaint();
        Container cont = p;
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
        layer.addComponentListener(new ComponentListener() {

            public void componentHidden(ComponentEvent evt) {
            }

            public void componentShown(ComponentEvent evt) {
            }

            public void componentMoved(ComponentEvent evt) {
            }

            public void componentResized(ComponentEvent evt) {
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
        try{
            dividerLocation = (Integer) Registry.get("Window.consoleLocation");
        }
        catch(Exception e){}
        
        try{
        }
        catch(Exception e){}
        try{
        if (((Boolean) Registry.get("Window.showConsole")) == false) {
            onItemActionPerformed(2, 0, null);
        } else {
            items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(true);
            icore.pack();
            splitter1.setDividerLocation(dividerLocation);
        }
        }
        catch(Exception e){
            onItemActionPerformed(2, 0, null);
        }
        /*try {
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
        }*/
        if (((Boolean) Registry.get("Window.showToolbar")) == true) {
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
        
        Dimension d = (Dimension) Registry.get("Window.size");
        icore.setSize(d.width, d.height);
        
        splitter2.setDividerLocation(159);
        splitter1.setDividerSize(10);
        splitter2.setDividerSize(5);
        if ((Boolean)Registry.get("Window.showWelcome")) {
            SplashScreen.message = "Starting welcome window";
            gcreator.splash.repaint();
            WelcomeTab welcome = new WelcomeTab();
            addTranslatedWindow(welcome, "general-welcome-title");
            updateToDefaultNavigatorPanel(welcome);
        }
        setMinimumSize(new Dimension(200, 200));
        try{
        if (((Boolean) Registry.get("Window.maximized")) == true) {
            icore.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else {
            icore.setExtendedState(JFrame.NORMAL);
        }
        }
        catch(Exception e){
            icore.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        String desktop = (String) Registry.get("Window.desktop");
        if (desktop.equals("TOP")) {
        } else if (desktop.equals("LEFT")) {
            tabs.setTabPlacement(JTabbedPane.LEFT);
        } else if (desktop.equals("BOTTOM")) {
            tabs.setTabPlacement(JTabbedPane.BOTTOM);
        } else if (desktop.equals("RIGHT")) {
            tabs.setTabPlacement(JTabbedPane.RIGHT);
        } else if (desktop.equals("MDI")) {
            this.istabs = false;
            int k = this.splitter2.getDividerLocation();
            this.tabs.setVisible(false);
            this.mdi.setVisible(true);
            if (this.isWorkspaceLeft()) {
                this.splitter2.setRightComponent(this.mdi);
                if (this.splitter2.getRightComponent().isVisible()) {
                    this.splitter2.setDividerLocation(k);
                }
            } else {
                this.splitter2.setLeftComponent(this.mdi);
                if (this.splitter2.getLeftComponent().isVisible()) {
                    this.splitter2.setDividerLocation(k);
                }
            }
        }
        
        statusbar.setStandardText("Done");
        statusbar.restoreText();
        statusbar.getProgressBar().setVisible(false);
        SplashScreen.message = "Displaying application";
        gcreator.splash.repaint();
    //setVisible(true);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="isWorkspaceLeft">
    public boolean isWorkspaceLeft() {
        if (items[MenuSupporter.GenerateMenuItemId(15, 0)].isSelected()) {
            return true;
        }
        return false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="deleteFile">
    public void deleteFile(org.gcreator.fileclass.GFile o) {
        org.gcreator.fileclass.Folder root = o.root;
        ObjectNode node = o.node;
        o.node = null;
        node.object = null;
        node.removeFromParent();
        root.remove(o);
        Project p = o.getProject();
        Vector<org.gcreator.fileclass.GFile> files = new Vector<org.gcreator.fileclass.GFile>();
        getFilesFromTo(p.getChildren(), files);
        for (org.gcreator.fileclass.GFile file : files) {
            DeleteRefactorContext context = new DeleteRefactorContext(o, file);
            RefactoringMethod method = Refactorer.getRefactoringMethod(context);
            if (method != null) {
                method.refactor(context);
            }
        }
        if (o.tabPanel != null) {
            remove(o.tabPanel, o.tabPanel.frame);
        }
        workspace.updateUI();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="deleteGroup">
    public void deleteGroup(org.gcreator.fileclass.Group o) {
        org.gcreator.fileclass.Folder root = o.root;
        ObjectNode node = o.node;
        o.node = null;
        node.removeFromParent();
        root.remove(o);
        Project p = o.getProject();
        Vector<org.gcreator.fileclass.GFile> files = new Vector<org.gcreator.fileclass.GFile>();
        getFilesFromTo(p.getChildren(), files);
        workspace.updateUI();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="closeAllTabs">
    private void closeAllTabs(DefaultMutableTreeNode node, Project project) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ObjectNode on = (ObjectNode) node.getChildAt(i);
            GObject go = on.object;

            if (!(go instanceof GFile)) {
                if (go instanceof Folder) {
                    closeAllTabs(on, project);
                    continue;
                } else {
                    continue;
                }
            }
            GFile o = (GFile) go;
            if (o.tabPanel != null && o.tabPanel.project == project) {
                remove(o.tabPanel, o.tabPanel.frame);
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getFilesFromTo">
    public void getFilesFromTo(Vector from, Vector<org.gcreator.fileclass.GFile> to) {
        for (java.lang.Object o : from) {
            if (o instanceof org.gcreator.fileclass.GFile) {
                to.add((org.gcreator.fileclass.GFile) o);
            }
            if (o instanceof Folder) {
                getFilesFromTo(((Folder) o).getChildren(), to);
            }
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="popupTreeMenu">
    public void popupTreeMenu(MouseEvent e) {
        if (!using) {
            try {
                Robot robot = new Robot();
                robot.mousePress(MouseEvent.BUTTON1_MASK);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                using = true;
                robot.mousePress(MouseEvent.BUTTON3_MASK);
                return;
            } catch (Exception ex) {
            }
        }
        MenuGenerator m = new MenuGenerator();
        //int modifiers = e.getModifiersEx();
        //modifiers -= MouseEvent.BUTTON3_DOWN_MASK;
        //modifiers += MouseEvent.BUTTON1_DOWN_MASK;
        //MouseEvent evt = new MouseEvent(workspace, MouseEvent.BUTTON1_DOWN_MASK|MouseEvent.MOUSE_CLICKED, e.getWhen(), modifiers, e.getX(), e.getY(), e.getClickCount(), false);
        final org.gcreator.fileclass.GObject o = getCurrentObject();
        if (o == null) {
            return;
        }
        /*JMenuItem i = new JMenuItem("Delete");
        JMenuItem j = new JMenuItem("Close Project");
        JMenuItem k = new JMenuItem();
        i.setEnabled(false);
        j.setVisible(false);
        k.setVisible(false);*/

        if (o instanceof org.gcreator.fileclass.GFile) {
            //if (((org.gcreator.fileclass.GFile) o).root.allowsDelete(o)) {
            Object i = m.addMenuItem(
                    246, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/delete_filegroup.png")));
            m.setEnabled(i, ((org.gcreator.fileclass.GFile) o).root.allowsDelete(o));
            MenuGenerator.addActionListener(i, new ActionListener() {

                public void actionPerformed(ActionEvent evt) {
                    deleteFile((org.gcreator.fileclass.GFile) o);
                }
            });
            //}
            //else{
            //    Object i = m.addMenuItem(
            //    246, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/grayed_delete_filegroup.png")));
            //}
            if (o.editable) {
                i = m.addMenuItem(271, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/rename_file.png")));
                MenuGenerator.addActionListener(i, new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String s = JOptionPane.showInputDialog(GPanel.this, "Type a new name for " + o.name + ".", o.name);
                        if (s != null && !s.trim().equals("")) {
                            o.name = s;
                            workspace.updateUI();
                        }
                    }
                });
            }
        }
        if (o instanceof org.gcreator.fileclass.Group) {
            Object i = m.addMenuItem(
                    246, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/delete_filegroup.png")));
            if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                MenuGenerator.addActionListener(i, new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        deleteGroup((org.gcreator.fileclass.Group) o);
                    }
                });
            } else {
                m.setEnabled(i, false);
            }
            Object k = m.addMenuItem(
                    245, new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addgroup.png")));
            //k.setVisible(true);
            MenuGenerator.addActionListener(k, new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Folder f = getCurrentFolder();
                    int in = 1;
                    for (Object o : f.getChildren()) {
                        if (((GObject) o).name.equals("subgroup" + in)) {
                            in++;
                            continue;
                        }
                    }

                    addGroup(f, f.newGroup("subgroup" + in));
                }
            });
            if (o.editable) {
                k = m.addMenuItem(271, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/rename_file.png")));
                MenuGenerator.addActionListener(k, new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String s = JOptionPane.showInputDialog(GPanel.this, "Type a new name for " + o.name + ".", o.name);
                        if (s != null && !s.trim().equals("")) {
                            o.name = s;
                            workspace.updateUI();
                        }
                    }
                });
            }
        }
        if (o instanceof Project) {
            Object j = m.addMenuItem(
                    245, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/close_project.png")));
            MenuGenerator.addActionListener(j, new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    CloseProject((Project) o, true);
                }
            });
        }
        //i.setVisible(true);
        //m.add(i);
        //m.add(j);
        //m.add(k);
        m.show(this, e.getX() +/*getLocationOnScreen().x+*/ workspace.getLocationOnScreen().x, e.getY() +/*getLocationOnScreen().y+*/ workspace.getLocationOnScreen().y);
        using = false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getWindowListElementAt">
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
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getWindowListSize">
    public int getWindowListSize() {
        if (istabs) {
            return tabs.getComponents().length - 1;
        } else {
            return 0;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="treeDoubleClicked">
    public void treeDoubleClicked(MouseEvent e) {

        if (e.getButton() == MouseEvent.BUTTON1) {
            org.gcreator.fileclass.GObject obj = getCurrentObject();
            if (obj instanceof org.gcreator.fileclass.GFile) {
                Open((org.gcreator.fileclass.GFile) obj);
            }
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Open">
    /**
     * Opens a file, calling the proper editor and adding it to the tabbed pane or MDI.<br/>
     * It also summons a macro.
     * @param file The GFile to open
     */
    public void Open(org.gcreator.fileclass.GFile file) {
        boolean found = false;
        int iii = 0;
        int foundloc = 0;
        file.type = file.type.toLowerCase();
        FileOpenListener listener = getFileEditor(file.type);
        ImageIcon img = null;
        try {
            img = (ImageIcon) ((WorkspaceCellRenderer) workspace.getCellRenderer()).getImageFor(file.node);
        } catch (ClassCastException e) {
        }

        if (listener != null) {
            listener.openNewFile(file, this.getCurrentProject(), img);
        } else if (file.type.equals("action")) {
            TabPanel tp = new ActionEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
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
            TabPanel tp = new SpriteEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } /*else if (file.type.equals("snippet")) {
        TabPanel tp = new SnippetEditor(this.getCurrentProject(), file);
        file.tabPanel = tp;
        addEWindow(tp, file.name, img);
        } */ else if (file.type.equals("actor")) {
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
                TabPanel tp = new ActorEditor(file, this.getCurrentProject());
                file.tabPanel = tp;
                addEWindow(tp, file.name, img);
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

            TabPanel tp = new SceneEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("egml") || file.type.equals("gcl")) {
        //TabPanel tp = new GCLEditor(file, this.getCurrentProject());
        //file.tabPanel = tp;
        //addEWindow(tp, file.name, img);
        } else if (file.type.equals("gs")) {
            TabPanel tp = new ScriptEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("struct")) {
            TabPanel tp = new StructureEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("bmp") || file.type.equals("gif") || file.type.equals("jpg") || file.type.equals("jpeg") || file.type.equals("png") || file.type.equals("img")) {
            TabPanel tp = new ImageEditor(this.getCurrentProject(), file);
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("wav") || file.type.equals("mid") || file.type.equals("ogg")) {
            TabPanel tp = new SoundEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("settings")) {
            TabPanel tp = new SettingsEditor(this.getCurrentProject(), file);
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("timeline")) {
            try {
                TabPanel tp = new TimelineEditor(file, this.getCurrentProject());
                file.tabPanel = tp;
                addEWindow(tp, file.name, img);
            } catch (WrongResourceException e) {
            }
        } else if (file.type.equals("tileset")) {
            TabPanel tp = new TilesetEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("path")) {
            try {
                TabPanel tp = new PathEditor(file, this.getCurrentProject());
                file.tabPanel = tp;
                addEWindow(tp, file.name, img);
            } catch (WrongResourceException ex) {
                Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(file.type.equals("rtf")){
            TabPanel tp = new RTFEditor(this.getCurrentProject(), file);
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else {
            TabPanel tp = new PlainTextEditor(file, this.getCurrentProject());//All unmanaged file formats
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getMainProject">
    public static Project getMainProject() {
        return mainProject;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="setMainProject">
    public static void setMainProject(Project newmain) {
        mainProject = newmain;
        try {
            gcreator.panel.workspace.updateUI();
        } catch (Exception e) {
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="updateToDefaultNavigatorPanel">
    public void updateToDefaultNavigatorPanel(TabPanel panel) {
        if (panel == null || panel.project == null) {
            updateNavigatorPanel(nofileselnavigator);
            return;
        }
        if (panel instanceof ActorEditor) {
            updateNavigatorPanel(new ActorNavigator(((ActorEditor) panel).file));
            return;
        }
        if (panel instanceof SpriteEditor) {
            updateNavigatorPanel(new SpriteNavigator(((SpriteEditor) panel).file));
            return;
        }
        updateNavigatorPanel(unkresnav);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getICore">
    public ICore getICore() {
        return icore;
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
        if (icore != null) {
            icore.disposeIt();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="saveSettings">
    public void saveSettings() {
        SettingsIO.saveSettings();
        try {
            ToolbarManager.writeToolbarFile("settings/toolbarList.gctl");
        } catch (IOException e) {
        }
        ScriptThemeManager.save();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="addWindow(TabPanel, int)">
    public void addTranslatedWindow(TabPanel panel, String title) {
        addWindow(panel, org.gcreator.units.Dictionary.getEntry(title), null);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addWindow(TabPanel, int, ImageIcon">
    public void addWindow(TabPanel panel, int title, ImageIcon img) {
        addWindow(panel, LangSupporter.activeLang.getEntry(title), img);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addEWindow(TabPanel, String)">
    public void addEWindow(TabPanel panel, String title) {
        if (title.charAt(0) == '$') {
            try {
                addTranslatedWindow(panel, title.substring(1));
            } catch (Exception e) {
                addWindow(panel, title, null);
            }
        } else {
            addWindow(panel, title, null);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addEWindow(TabPanel, String, ImageIcon">
    public void addEWindow(TabPanel panel, String title, ImageIcon img) {
        if (title.charAt(0) == '$') {
            try {
                addTranslatedWindow(panel, title.substring(1));
            } catch (Exception e) {
                addWindow(panel, title, img);
            }
        } else {
            addWindow(panel, title, img);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addWindow(TabPanel, String, ImageIcon)">
    public void addWindow(TabPanel panel, String title, ImageIcon img) {
        try {
            panel.parent = this;
            panel.title = title;
            for (int i = 0; i < tabs.getTabCount(); i++) {
                if (tabs.getTitleAt(i).equals(title) && ((TabPanel) tabs.getComponentAt(i)).project == null) {
                    tabs.setSelectedComponent(tabs.getComponentAt(i));

                    return;
                } else if (tabs.getTitleAt(i).equals(title) && ((TabPanel) tabs.getComponentAt(i)).project.equals(this.getCurrentProject()) && tabs.getComponentAt(i).getClass().getName().equals(panel.getClass().getName())) {
                    tabs.setSelectedComponent(tabs.getComponentAt(i));
                    return;
                }
            }
            tabs.addTab(panel.title, img, panel, "");
            int index = tabs.indexOfComponent(panel);
            tabs.setTabComponentAt(index, new ButtonTabComponent(tabs));
            tabs.setSelectedComponent(panel);
            /*
             * This does not work
             * 
             * USELESS
             * 
             * 
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
             */
            ExtendedFrame frame = new ExtendedFrame();
            panel.frame = frame;
            frame.setPanel(panel);
            frame.setSize(new Dimension(Math.max(panel.getPreferredSize().width, 300),
                    Math.max(panel.getPreferredSize().height, 300)));
            frame.setMinimumSize(panel.getPreferredSize());
            frame.updateUI();
            frame.setClosable(true);
            frame.setIconifiable(true);
            frame.setMaximizable(true);
            frame.setResizable(true);
            frame.setVisible(true);
            frame.setTitle(panel.title);
            frame.setFrameIcon(img);
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
            GroupLayout jInternalFrame1Layout = new GroupLayout(frame.getContentPane());
            frame.getContentPane().setLayout(jInternalFrame1Layout);
            if (!istabs) {
                jInternalFrame1Layout.setHorizontalGroup(
                        jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(
                        jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            }
            //frame.setBounds(0, 0, 300, 300);
            mdi.add(frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
            frame.setSelected(true);
        } catch (Exception ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    //winlist.updateUI();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="installFileEditor">
    public boolean installFileEditor(FileOpenListener listener) {
        return listeners.add(listener);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="uninstallFileEditor">
    public boolean unistallFileEditor(FileOpenListener listener) {
        return listeners.remove(listener);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getFileEditor">
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
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getCurrentProject">
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
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getCurrentFolder">
    public Folder getCurrentFolder() {
        if (getCurrentObject() == null) {
            return null; //null for none
        }
        if (getCurrentObject() instanceof Folder) {
            return (Folder) getCurrentObject();
        }
        if (getCurrentObject() instanceof org.gcreator.fileclass.GFile) {
            return ((org.gcreator.fileclass.GFile) getCurrentObject()).root;
        }
        return null;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getCurrentObject">
    public org.gcreator.fileclass.GObject getCurrentObject() {
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
    //</editor-fold>
    
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

    //<editor-fold defaultstate="collapsed" desc="updateNavigatorPanel">
    public void updateNavigatorPanel(JComponent panel) {
        //splitter3.setBottomComponent(panel);
        nav = panel;
        navroot.removeAll();
        if (nav != null) {
            navroot.add(nav, BorderLayout.CENTER);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="createPaletteFrame()">
    public JInternalFrame createPaletteFrame() {
        JInternalFrame f = new JInternalFrame();
        f.setVisible(true);
        f.setLocation(50, 50);
        f.setSize(200, 200);
        f.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        layer.add(f, JLayeredPane.PALETTE_LAYER);
        return f;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="createPaletteFrame(JInternalFrame)">
    public JInternalFrame createPaletteFrame(JInternalFrame f) {
        f.setVisible(true);
        f.setLocation(50, 50);
        f.setSize(200, 200);
        f.setDefaultCloseOperation((JFrame.DISPOSE_ON_CLOSE));
        layer.add(f, JLayeredPane.PALETTE_LAYER);
        return f;
    }
    //</editor-fold>
    
    private void selectedDocumentChanged(TabPanel tabpanel) {
        updateToDefaultNavigatorPanel(tabpanel);
        callAllPanelSelectedListeners(tabpanel);
    }

    //<editor-fold defaultstate="collapsed" desc="onItemActionPerformed">
    public void onItemActionPerformed(int menu, int item, ActionEvent evt) {
        if (menu == 0 && item == 0) {
            addWindow(newproject, 55, (ImageIcon) items[MenuSupporter.GenerateMenuItemId(menu, item)].getIcon());
        }
        if (menu == 0 && item == 1) {
            addWindow(newfilegroup, 96, (ImageIcon) items[MenuSupporter.GenerateMenuItemId(menu, item)].getIcon());
        }
        if (menu == 0 && item == 2) {
            ProjectImporter.OpenProject(this);
        }
        if (menu == 0 && item == 3) {
            SaveMainProject(false);
        }
        if (menu == 0 && item == 4) {
            SaveMainProject(true);
        }
        if (menu == 0 && item == 6) {
            if (istabs) {
                ((TabPanel) tabs.getSelectedComponent()).Save();
            } else {
                ((ExtendedFrame) mdi.getSelectedFrame()).getPanel().Save();
            }
        }
        if (menu == 0 && item == 7) {
            if (istabs) {
                for (Component c : tabs.getComponents()) {
                    try {
                        ((TabPanel) c).Save();
                    } catch (Exception e) {
                    }
                }
            } else {
                for (JInternalFrame c : mdi.getDesktop().getAllFrames()) {
                    try {
                        ((ExtendedFrame) c).getPanel().Save();
                    } catch (Exception e) {
                    }
                }
            }
        }
        if (menu == 0 && item == 9) {
            CloseProject();
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
            int b = icore.getExtendedState();
            scroller.setVisible(!scroller.isVisible());
            Registry.set("Window.showConsole", scroller.isVisible());
            this.repaint();
            splitter1.setDividerLocation(dividerLocation);
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
        if (menu == 2 && item == 2) {
            SystemOutputReader.showDialog();
        }
        if (menu == 3 && item == 0) {
            setMainProject(getCurrentProject());
        }
        if (menu == 4 && item == 0) {
            addTranslatedWindow(about, "general-about-title");
        }
        if (menu == 4 && item == 1) {
            HelpPanel help = new HelpPanel();
            addTranslatedWindow(help, "general-help-title");
        }
        /*if (menu == 6 && (item < 4)) {
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
        if (menu == 6 && item == 4) {//MDI
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
        }*/
        if (menu == 7 && item == 0) {
            LanguageTab lang = new LanguageTab();
            addWindow(lang, 28, (ImageIcon) items[MenuSupporter.GenerateMenuItemId(menu, item)].getIcon());
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
            addWindow(globalsettings, 131, (ImageIcon) items[MenuSupporter.GenerateMenuItemId(menu, item)].getIcon());
        }
        if (menu == 7 && item == 4) {
            addWindow(new PowerPackImporter(), 184,
                    (ImageIcon) items[MenuSupporter.GenerateMenuItemId(menu, item)].getIcon());
        }
        if (menu == 7 && item == 5) {
            WelcomeTab welcome = new WelcomeTab();
            addTranslatedWindow(welcome, "general-welcome-title");
            updateToDefaultNavigatorPanel(welcome);
        }
        if (menu == 8 && item == 0) {
        //PlayMacroDialog dialog = new PlayMacroDialog(this, true);
        //dialog.setVisible(true);
        }
        if (menu == 8 && item == 2) {
            String mname = JOptionPane.showInputDialog(this, LangSupporter.activeLang.getEntry(175));
            if (mname != null && mname.length() > 0) {
            /*if (MacroLibrary.findMacro(mname) != null) {
            JOptionPane.showMessageDialog(this,
            LangSupporter.activeLang.getEntry(177),
            LangSupporter.activeLang.getEntry(176),
            JOptionPane.ERROR_MESSAGE);
            } else {
            MacroLibrary.addMacro(Macro.record(mname));
            }*/
            }
        }
        if (menu == 8 && item == 3) {
        //Macro.recordingMacro = null;
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

    //<editor-fold defaultstate="collapsed" desc="onToolbarActionPerformed">
    public void onToolbarActionPerformed(int item, ActionEvent evt) {
        int i;
        Folder a;
        switch (item) {
            case 1:
                if (newproject != null) {
                    addWindow(newproject, 55, new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_new.png")));
                }
                break;
            case 2:
                ProjectImporter.OpenProject(this);
                break;
            case 3:
                if (istabs) {
                    try {
                        ((TabPanel) tabs.getSelectedComponent()).Save();
                    } catch (NullPointerException exc) {
                    }
                } else {
                    ((ExtendedFrame) mdi.getSelectedFrame()).getPanel().Save();
                }
                break;
            case 4:
                //save all projects
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
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                //add sprite
                a = this.getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newSprite" + ((GameProject) getCurrentProject()).sprites++, "sprite");

                break;
            case 6:
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                //add sound
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newSound" + ((GameProject) getCurrentProject()).sounds++, "wav");

                break;
            case 7:
                //add class
                if (getCurrentProject() instanceof GameProject) {
                    i = ((GameProject) getCurrentProject()).classes;
                } else if (getCurrentProject() instanceof ModuleProject) {
                    i = ((ModuleProject) getCurrentProject()).classes;
                } else {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }

                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newClass" + i, "gcl");
                if (getCurrentProject() instanceof GameProject) {
                    ((GameProject) getCurrentProject()).classes++;
                } else if (getCurrentProject() instanceof ModuleProject) {
                    ((ModuleProject) getCurrentProject()).classes++;
                }
                break;
            case 8:
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                //getCurrentProject().actors.add(new Actor("newActor" + i));
                addFile(getCurrentFolder(), "act_" + ((GameProject) getCurrentProject()).actors++, "actor");
                break;
            case 9:
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                //getCurrentProject().scenes.add(new Scene("newScene" + i));
                addFile(getCurrentFolder(), "sc_" + ((GameProject) getCurrentProject()).scenes++, "scene");
                break;
            case 10:
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                if (getCurrentProject() instanceof GameProject) {
                    org.gcreator.fileclass.GFile file = addFile(getCurrentFolder(), "img_" + ((GameProject) getCurrentProject()).images++, "png");
                    return;
                } else if (getCurrentProject() instanceof ModuleProject) {
                    org.gcreator.fileclass.GFile file = addFile(getCurrentFolder(), "img_" + ((ModuleProject) getCurrentProject()).images++, "png");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                }

                break;
            case 11:
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "tset_" + ((GameProject) getCurrentProject()).tilesets++, "tileset");
                break;
            case 12:
                if (!(getCurrentProject() instanceof GameProject)) {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "tl_" + ((GameProject) getCurrentProject()).timelines++, "timeline");
                break;
            case 13:
                //add class
                if (getCurrentProject() instanceof GameProject) {
                    i = ((GameProject) getCurrentProject()).scripts;
                } else if (getCurrentProject() instanceof ModuleProject) {
                    i = ((ModuleProject) getCurrentProject()).scripts;
                } else {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "script_" + i, "gs");
                if (getCurrentProject() instanceof GameProject) {
                    ((GameProject) getCurrentProject()).scripts++;
                } else if (getCurrentProject() instanceof ModuleProject) {
                    ((ModuleProject) getCurrentProject()).scripts++;
                }
                break;
            case 14:
                Folder f = getCurrentFolder();
                int in = 1;
                for (Object o : f.getChildren()) {
                    if (((GObject) o).name.equals("subgroup" + in)) {
                        in++;
                        continue;
                    }
                }

                addGroup(f, f.newGroup("subgroup" + in));

                break;
            case 15:
                //add path
                if (!(getCurrentProject() instanceof GameProject)) {
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newPath" + ((GameProject) getCurrentProject()).paths++, "path");
                break;
            case 16:
                if (!(getCurrentProject() instanceof ModuleProject)) {
                    JOptionPane.showMessageDialog(null, "<html>You have not selected a <em>module</> to add to!</>");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "action_" + ((ModuleProject) getCurrentProject()).actions++, "action");
                break;
            //case 17:
            //    if (!(getCurrentProject() instanceof GameProject)) {
            //        return;
            //    }
            //    a = getCurrentFolder();
            //    if (a == null) {
            //        JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
            //        return;
            //    }
            //    addFile(getCurrentFolder(), "newSnippet" + ((GameProject) getCurrentProject()).snippets++, "snippet");
            //    break;
        }
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addFile()">
    public org.gcreator.fileclass.GFile addFile(Folder folder, String name, String type) {

        if (folder == null) {
            return null;
        }
        if (!folder.allowsFileType(type)) {
            folder = folder.magicAddition(type);
            if (folder == null) {
                return null;
            }
        }
        org.gcreator.fileclass.GFile file = new org.gcreator.fileclass.GFile(folder, name, type, null);
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
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addGroup()">
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
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SaveProject()">
    public void SaveProject() {
        Project p = getCurrentProject();
        if (p != null) {
            SaveProject(p);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SaveProject(Project)">
    public void SaveProject(Project p) {
        if (p != null) {
            if (istabs) {
                for (int ii = 0; ii < tabs.getTabCount(); ii++) {
                    if (((TabPanel) tabs.getComponentAt(ii)).project == null) {
                    } else if (((TabPanel) tabs.getComponentAt(ii)).project.equals(p) && ((TabPanel) tabs.getComponentAt(ii)).wasModified()) {
                        ((TabPanel) tabs.getComponentAt(ii)).Save();
                    }
                }
            } else {
                for (int ii = 0; ii < mdi.getComponentCount(); ii++) {
                    if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project == null) {
                    } else if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project.equals(p) && ((ExtendedFrame) mdi.getComponent(ii)).getPanel().wasModified()) {
                        ((ExtendedFrame) mdi.getComponent(ii)).getPanel().Save();
                    }
                }
            }
            //save to gcp file
            if (p.location == null || p.location.equals("")) {
                JFileChooser fc = new JFileChooser();
                fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
                fc.showSaveDialog(gcreator.window);
                java.io.File file = fc.getSelectedFile();
                if (file == null) {
                    return;
                }
                p.location = file;
                if (!FileUtil.getExtension(p.location).equalsIgnoreCase("gcp")) {
                    p.location = FileUtil.setExtension(p.location, "gcp");
                }
            }
            ProjectExporter.export(p, p.location);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CloseProject(Project)">
    public void CloseProject(Project p) {
        org.gcreator.core.utilities.addStringMessage("close project");
        //Close all tabs
        closeAllTabs((DefaultMutableTreeNode) p.node.getParent(), p);

        top.remove((DefaultMutableTreeNode) getCurrentProject().node/*.getParent()*/);
        workspace.updateUI();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CloseProject(Project, boolean)">
    public void CloseProject(Project p, boolean askForConfirmation) {
        if (askForConfirmation == false) {
            CloseProject(p);
            return;
        }
        if (p == null) {
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Do you want to save your project first?");
        if (option == JOptionPane.CANCEL_OPTION) {
            return;
        }
        if (option == JOptionPane.YES_OPTION) {
            SaveProject(p);
        }
        CloseProject(p);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CloseProject">
    public void CloseProject() {
        if (getCurrentProject() == null) {
            JOptionPane.showMessageDialog(this, "Please select a project.");
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Do you want to save your project first?");
        if (option == JOptionPane.CANCEL_OPTION) {
            return;
        }
        if (option == JOptionPane.YES_OPTION) {
            SaveProject();
        }
        CloseProject(getCurrentProject());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="createToolBar">
    public void createToolBar() {
        toolpopup = new ToolbarPopupMenu();
        ToolbarManager.makeToolbars(this);
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

    //<editor-fold defaultstate="collapsed" desc="SaveProject(boolean)">
    public void SaveMainProject(boolean saveAs) {
        //only save for main project
        if (istabs) {
            for (int ii = 0; ii < tabs.getTabCount(); ii++) {
                if (((TabPanel) tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) tabs.getComponentAt(ii)).project.equals(getMainProject()) && ((TabPanel) tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) mdi.getComponent(ii)).getPanel().project.equals(getMainProject()) && ((ExtendedFrame) mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        if (mainProject == null) {
            JOptionPane.showMessageDialog(this, "<html>No main project selected.<br/>Please select main project in Build&Run>Set as Main Project.</html>",
                    "A Fatal Exception OE has occured at "+Integer.toHexString((int)(Math.random()*Integer.MAX_VALUE)).toUpperCase(), JOptionPane.ERROR_MESSAGE);
            return;
        }
        //save to gcp file
        if (mainProject.location == null || mainProject.location.equals("") || saveAs) {
            JFileChooser fc = new JFileChooser((Registry.exists("Directories.gpanelSaveProject")) ? (BeanFile)Registry.get("Directories.gpanelSaveProject") : null);
            fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
            if (fc.showSaveDialog(gcreator.window) != JFileChooser.APPROVE_OPTION) {
                return;
            }
            java.io.File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            mainProject.location = file;
            if (!FileUtil.getExtension(mainProject.location).equalsIgnoreCase("gcp")) {
                mainProject.location = FileUtil.setExtension(mainProject.location, "gcp");
            }
            Registry.set("Directories.gpanelSaveProject", new BeanFile(fc.getCurrentDirectory()));
        }
        ProjectExporter.export(mainProject, mainProject.location);
    }
    //</editor-fold>
}
