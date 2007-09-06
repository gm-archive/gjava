/*
 * window.java
 *
 * Created on 24/Ago/2007, 13:34:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

//import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeCellRenderer;
import managers.MenuSupporter;
import java.awt.*;
import java.awt.event.*;
import components.*;
import managers.*;
import languages.*;
import java.io.*;
import exceptions.*;
import externproject.*;
import fileclass.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Luís
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

    public static Project mainProject;
    public static Vector actors = new Vector(1); //Not needed
    public static Vector sprites = new Vector(1); //Not needed
    public static Vector scenes = new Vector(1); //Not needed

    public TreeCellRenderer renderer;
    
    //</editor-fold>




    public void addWindow(TabPanel panel, int title) {
        panel.parent = this;
        panel.title = LangSupporter.activeLang.getEntry(title);
        if (istabs) {
            tabs.addTab(panel.title, panel);
            tabs.setTabComponentAt(tabs.indexOfComponent(panel), new ButtonTabComponent(tabs));
            tabs.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent evt) {
                    tabsClicked(evt);
                }
            });
        }
        ExtendedFrame frame = new ExtendedFrame();
        panel.frame = frame;
        frame.setPanel(panel);
        frame.setClosable(true);
        frame.setIconifiable(true);
        frame.setMaximizable(true);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setTitle(LangSupporter.activeLang.getEntry(title));
        frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(jInternalFrame1Layout);
        if (!istabs) {
            jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
            jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        }
        frame.setBounds(0, 0, 300, 300);
        mdi.add(frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }

    public Aurwindow() {
        super("Aurora");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setJMenuBar(menubar);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        splitter1 = new JSplitPane();
        splitter2 = new JSplitPane();
        tabs = new JTabbedPane();
        mdi = new JDesktopPane();
        istabs = true;
        console = new JTextPane();
        scroller = new JScrollPane();

        console.setEditable(false);
        console.setContentType("text/html");
        scroller.setViewportView(console);

        LangSupporter.activeLang = new English();

        SettingsIO.console = console;
        String[] settings = SettingsIO.loadSettings();
        if (settings == null) {
            settings = new String[5];
            settings[0] = "Native";
            settings[1] = "Tabs";
            settings[2] = "Visible";
            settings[3] = "English";
            settings[4] = "Visible";
        }

        if (!settings[3].equals("English")) {
            if (settings[3].equals("Portuguese")) {
                LangSupporter.activeLang = new Portuguese();
            } else if (settings[3].equals("German")) {
                LangSupporter.activeLang = new German();
            } else {
                utilities.addError(36);
            }
        }
        try {
            lang = LangSupporter.activeLang.getLanguage();
        } catch (Exception e) {
        }
        createToolBar();

        top = new DefaultMutableTreeNode("<HTML><b>" + LangSupporter.activeLang.getEntry(51));
        top.setAllowsChildren(true);
        workspace = new JTree(top);
        workspace.setVisible(true);
        workspace.setScrollsOnExpand(true);
        renderer = new TreeImageManager();
        workspace.setCellRenderer(renderer);
        
        treescroll = new JScrollPane();
        treescroll.setViewportView(workspace);

        menus[0] = MenuSupporter.MakeMenu(menubar, 0, "Very important functions such as 'Save', 'Open' and 'Exit' can be found here.");
        items[MenuSupporter.GenerateMenuItemId(0, 0)] = MenuSupporter.MakeMenuItem(menus[0], 5, "Create a new project");
        items[MenuSupporter.GenerateMenuItemId(0, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(0, 0)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/newproject.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 1)] = MenuSupporter.MakeMenuItem(menus[0], 6, "Create a new file");
        items[MenuSupporter.GenerateMenuItemId(0, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 1, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(0, 2)] = MenuSupporter.MakeMenuItem(menus[0], 7, "Open a project");
        items[MenuSupporter.GenerateMenuItemId(0, 2)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/openproject.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 2, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(0, 3)] = MenuSupporter.MakeMenuItem(menus[0], 8, "Save project");
        items[MenuSupporter.GenerateMenuItemId(0, 3)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 3, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], 9, "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], 53, "Save all projects");
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], 88, "Save file");
        items[MenuSupporter.GenerateMenuItemId(0, 6)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], 89, "Save All files");
        items[MenuSupporter.GenerateMenuItemId(0, 7)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/saveall.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 8)] = MenuSupporter.MakeMenuItem(menus[0], 10, "Import a file");
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 11, "Export a file");
        items[MenuSupporter.GenerateMenuItemId(0, 10)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 11)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 11)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 11, evt);
            }
        });

        menus[1] = MenuSupporter.MakeMenu(menubar, 1, "Undo/Redo and clipboard functions can be found here.");
        items[MenuSupporter.GenerateMenuItemId(1, 0)] = MenuSupporter.MakeMenuItem(menus[1], 76, "Find");
        items[MenuSupporter.GenerateMenuItemId(1, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(1, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(1, 1)] = MenuSupporter.MakeMenuItem(menus[1], 83, "Find&Replace");
        items[MenuSupporter.GenerateMenuItemId(1, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(1, 1, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(1, 2)] = MenuSupporter.MakeMenuItem(menus[1], 14, "Clear console");
        items[MenuSupporter.GenerateMenuItemId(1, 2)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(1, 2, evt);
            }
        });
        menus[2] = MenuSupporter.MakeMenu(menubar, 2, "Layout and design options are defined here.");
        menus[5] = MenuSupporter.MakeSubMenu(menus[2], 15, "Layout and design options are defined here.");
        menus[6] = MenuSupporter.MakeSubMenu(menus[2], 16, "Display mode");
        items[MenuSupporter.GenerateMenuItemId(2, 0)] = MenuSupporter.MakeCheckMenuItem(menus[2], 22, "Display output box");
        items[MenuSupporter.GenerateMenuItemId(2, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(2, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(2, 1)] = MenuSupporter.MakeCheckMenuItem(menus[2], 75, "Display the toolbar");
        items[MenuSupporter.GenerateMenuItemId(2, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(2, 1, evt);
            }
        });
        menus[3] = MenuSupporter.MakeMenu(menubar, 3, "Compile and test your games.");
        menus[7] = MenuSupporter.MakeMenu(menubar, 92, "Tools");
        items[MenuSupporter.GenerateMenuItemId(7, 0)] = MenuSupporter.MakeMenuItem(menus[7], 23, "Select the language");
        items[MenuSupporter.GenerateMenuItemId(7, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(7, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(7, 1)] = MenuSupporter.MakeMenuItem(menus[7], 93, "Select the language");
        menus[4] = MenuSupporter.MakeMenu(menubar, 4, "Get info about Aurora.");
        items[MenuSupporter.GenerateMenuItemId(4, 0)] = MenuSupporter.MakeMenuItem(menus[4], 24, "About Aurora");
        items[MenuSupporter.GenerateMenuItemId(4, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(4, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(4, 1)] = MenuSupporter.MakeMenuItem(menus[4], 25, "Aurora help");
        items[MenuSupporter.GenerateMenuItemId(4, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(4, 1, evt);
            }
        });
        ButtonGroup group = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(5, 0)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], 17, "Native look");
        items[MenuSupporter.GenerateMenuItemId(5, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 0, evt);
            }
        });
        if (look == 0) {
            items[MenuSupporter.GenerateMenuItemId(5, 0)].setSelected(true);
        }
        items[MenuSupporter.GenerateMenuItemId(5, 1)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], 18, "Cross-platform look");
        items[MenuSupporter.GenerateMenuItemId(5, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 1, evt);
            }
        });
        if (look == 1) {
            items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
        }
        MenuSupporter.MakeSeparator(menus[5]);
        items[MenuSupporter.GenerateMenuItemId(5, 2)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], 19, "Linux look");
        items[MenuSupporter.GenerateMenuItemId(5, 2)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 2, evt);
            }
        });
        ButtonGroup agroup = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(6, 0)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 20, "Tabs Top");
        items[MenuSupporter.GenerateMenuItemId(6, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(6, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(6, 1)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 90, "Tabs Left");
        items[MenuSupporter.GenerateMenuItemId(6, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 1, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(6, 2)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 91, "Tabs Bottom");
        items[MenuSupporter.GenerateMenuItemId(6, 2)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 2, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(6, 3)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 92, "Tabs Right");
        items[MenuSupporter.GenerateMenuItemId(6, 3)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 3, evt);
            }
        });
        MenuSupporter.MakeSeparator(menus[6]);
        items[MenuSupporter.GenerateMenuItemId(6, 4)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 21, "MDI");
        items[MenuSupporter.GenerateMenuItemId(6, 4)].addActionListener(new ActionListener() {

            @Override
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


        //<editor-fold defaultstate="expanded" desc="Layout Manager">
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tool, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE).addComponent(splitter1, GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(tool, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(splitter1, GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)));



        if (settings[2].equals("Hidden")) {
            onItemActionPerformed(2, 0, null);
        } else {
            items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(true);
            pack();
            splitter1.setDividerLocation(0.66);
        }

        try {
            if (settings[0].equals("Native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                items[MenuSupporter.GenerateMenuItemId(5, 0)].setSelected(true);
                look = 0;
            } else if (settings[0].equals("Cross-platform")) {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
                look = 1;
            } else if (settings[0].equals("Motif")) {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                items[MenuSupporter.GenerateMenuItemId(5, 2)].setSelected(true);
                look = 2;
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
    }

    private void tabsClicked(MouseEvent evt) {
        //Leave in blank... for now...
    }

    //<editor-fold defaultstate="collapsed" desc="onItemActionPerformed">
    private void onItemActionPerformed(int menu, int item, ActionEvent evt) {
        if (menu == 0 && item == 0) {
            NewProject win = new NewProject();
            addWindow(win, 55);
        }
        if (menu == 0 && item == 1) {
            NewFileGroup win = new NewFileGroup();
            addWindow(win, 96);
        }
        if (menu == 0 && item == 2) {
            ProjectImporter.OpenProject(this);
        }
        if (menu == 0 && item == 3) {
            SaveProject();
        }
        if (menu == 0 && item == 11) {
            dispose();
        }
        if (menu == 1 && item == 2) {
            aurora.output = "";
            console.setText("");
        }
        if (menu == 2 && item == 0) {
            scroller.setVisible(!scroller.isVisible());
            pack();
            splitter1.setDividerLocation(0.66);
        }
        if (menu == 2 && item == 1) {
            tool.setVisible(!tool.isVisible());
        }
        if (menu == 4 && item == 0) {
            HelpTab help = new HelpTab(0, 0);
            addWindow(help, 27);
        }
        if (menu == 4 && item == 1) {
            HelpTab help = new HelpTab();
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
                look = 0;
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 1) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
                if (istabs) {
                    SwingUtilities.updateComponentTreeUI(mdi);
                } else {
                    SwingUtilities.updateComponentTreeUI(tabs);
                }
                look = 1;
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
                look = 2;
            } catch (Exception e) {
            }
        }
        if (menu == 6 && (item == 0 || item == 1)) {
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

                        @Override
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
        if (getCurrentObject() instanceof fileclass.File) {
            return ((fileclass.File) getCurrentObject()).root;
        }
        return null;
    }

    public fileclass.Object getCurrentObject() {
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
                NewProject win = new NewProject();
                addWindow(win, 55);
                break;
            case 2:
                ProjectImporter.OpenProject(this);
                break;
            case 3:
                //save
                break;
            case 4:
                //save all
                break;
            case 5:

                //add sprite
                i = 1;
                a = getCurrentFolder();
                if(a==null)
                    return;
                while(a.findFromName("newSprite" + i)!=-1)
                    i++;
                addFile(getCurrentFolder(), "newSprite" + i, "sprite");
                
                /*System.out.println("" + actors.size());
                if (actors.size() == 0) {
                    pos = 0;
                } else {
                    for (Enumeration e = actors.elements(); e.hasMoreElements();) {
                        if (((Actor) e.nextElement()).equals(null)) {
                            //if one of the old resources were deleted
                        } else if (i == actors.size() - 1) {
                            pos = i;
                        }
                        i++;
                    }
                }
                if (pos == 1) {
                    //  ((DefaultMutableTreeNode)mainProject.getChildAt(0)).add(new DefaultMutableTreeNode("Spr_"+i));
                    ((Folder) mainProject.childAt(1)).add(new fileclass.File(mainProject, "Spr_" + i, "sprite", ""));
                    actors.add(new Actor());
                } else {
                    ((Folder) mainProject.childAt(1)).add(new fileclass.File(mainProject, "Spr_" + i, "sprite", ""));
                    actors.add(pos, new Actor());
                    System.out.println("test");
                }*/


                break;
            case 6:
                //add sound
                break;
            case 7:
                //add class
                break;
            case 8:
                i = 1;
                a = getCurrentFolder();
                if(a==null)
                    return;
                while(a.findFromName("newActor" + i)!=-1)
                    i++;
                addFile(getCurrentFolder(), "newActor" + i, "actor");
                break;
                case 9:
                i = 1;
                a = getCurrentFolder();
                if(a==null)
                    return;
                while(a.findFromName("newScene" + i)!=-1)
                    i++;
                addFile(getCurrentFolder(), "newScene" + i, "scene");
                break;
        }
    }

    //</editor-fold>
    public fileclass.File addFile(Folder folder, String name, String type){
        if(folder==null)
            return null;
        if(!folder.allowsFileType(type))
            return null;
        fileclass.File file = new fileclass.File(folder, name, type, "");
        ObjectNode node = new ObjectNode(file);
        folder.node.add(node);
        workspace.updateUI();
        return file;
    }
    
    public boolean addGroup(Folder folder, Group group){
        if(folder==null)
            return false;
        if(!folder.allowsGroup(group))
            return false;
        ObjectNode node = new ObjectNode(group);
        folder.node.add(node);
        workspace.updateUI();
        return true;
    }
    
    //<editor-fold defaultstate="collapsed" desc="SaveProject">
    public void SaveProject() {
        GameProject test = new GameProject("My class", "C:/Documents and Settings");
        test.add(new fileclass.File(test, "Settings", "settings", "Xyz"));
        ProjectExporter.export(test, lang);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="createToolBar">
    public void createToolBar() {
        tool = new JToolBar();
        tool.setFloatable(false);


        JButton opn = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/openproject.png")), 40);
        JButton save = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/save.png")), 41);
        JButton saveall = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/saveall.png")), 53);
        JButton newp = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/newproject.png")), 39);
        JButton sprite = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/addactor02.png")), 43);
        JButton sound = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/addsound.png")), 44);
        JButton cl = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/addscript.png")), 52);
        JButton actor = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/addactor01.png")), 45);
        JButton scene = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/resources/toolbar/addroom.png")), 46);

        sprite.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(5, evt);
            }
        });

        sound.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(6, evt);
            }
        });

        cl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(7, evt);
            }
        });

        actor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(8, evt);
            }
        });

        scene.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(9, evt);
            }
        });

        newp.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(1, evt);
            }
        });

        opn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(2, evt);
            }
        });

        save.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(3, evt);
            }
        });

        tool.add(newp);
        tool.add(opn);
        tool.add(save);
        tool.add(saveall);
        tool.add(sprite);
        tool.add(sound);
        tool.add(cl);
        tool.add(actor);
        tool.add(scene);
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="dispose">
    @Override
    public void dispose() {
        saveSettings();
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
