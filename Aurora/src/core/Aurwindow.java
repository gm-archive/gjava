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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
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
import javax.swing.tree.TreeSelectionModel;
import managers.MenuSupporter;
import java.awt.*;
import java.awt.event.*;
import components.*;
import managers.*;
import javax.swing.*;
import languages.*;
import java.io.*;
import exceptions.*;
import java.util.zip.ZipFile;

/**
 *
 * @author Luís
 */
public class Aurwindow extends JFrame {

    //<editor-fold defaultstate="expanded" desc="Variables">
    public static String output = "";
    public JMenuBar menubar = new JMenuBar();
    public JMenu[] menus = new JMenu[MenuSupporter.MENULIMIT];
    public JMenuItem[] items = new JMenuItem[MenuSupporter.MENULIMIT * MenuSupporter.ITEMLIMIT];
    public JSplitPane splitter1;
    public JSplitPane splitter2;
    public JTabbedPane tabs;
    public int look;
    public boolean istabs; //True - tabs; False - MDI
    public JDesktopPane mdi;
    public JTextPane console;
    public JScrollPane scroller;
    public JToolBar tool;
    public static String lang;
    public static JTree workspace;
    public static JScrollPane treescroll;

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
        frame.setTitle(LangSupporter.activeLang.getEntry(title));
        frame.setVisible(true);
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

    public void addMessage(int message) {
        addFormatedMessage(message, null, false);
    }

    public void addStringMessage(String message) {
        addStringFormatedMessage(message, null, false);
    }

    public void addError(int message) {
        addFormatedMessage(message, "red", true);
    }

    public void addFormatedMessage(int message, String color, boolean bold) {
        addStringFormatedMessage(LangSupporter.activeLang.getEntry(message), color, bold);
    }

    public void addStringFormatedMessage(String message, String color, boolean bold) {
        String out = "";
        if (color != null) {
            out += "<font color='" + color + "'>";
        }
        if (bold) {
            out += "<b>";
        }
        out += message;
        if (bold) {
            out += "</b>";
        }
        if (color != null) {
            out += "</font>";
        }
        out += "<br/>";
        output += out;
        console.setText(output);
    }

    public Aurwindow(String[] args) {
        super("Aurora");

        output = "";
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
            settings = new String[4];
            settings[0] = "Native";
            settings[1] = "Tabs";
            settings[2] = "Visible";
            settings[3] = "English";
        }

        if (!settings[3].equals("English")) {
            if (settings[3].equals("Portuguese")) {
                LangSupporter.activeLang = new Portuguese();
            }
            else if(settings[3].equals("German")){
                LangSupporter.activeLang = new German();
            }
            else {
                addError(36);
            }
        }
        try {
            lang = LangSupporter.activeLang.getLanguage();
        } catch (Exception e) {
        }
        createToolBar();
        
        DefaultMutableTreeNode top =
            new DefaultMutableTreeNode("<HTML><b>" + LangSupporter.activeLang.getEntry(51));
        top.setAllowsChildren(true);
        workspace = new JTree(top);
        workspace.setVisible(true);
        treescroll = new JScrollPane(workspace);
        
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
        items[MenuSupporter.GenerateMenuItemId(0, 3)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], 9, "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], 53, "Save all projects");
        items[MenuSupporter.GenerateMenuItemId(0, 5)].setIcon(new ImageIcon(getClass().getResource("/resources/toolbar/saveall.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], 10, "Import a file");
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], 11, "Export a file");
        items[MenuSupporter.GenerateMenuItemId(0, 8)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 9)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 9, evt);
            }
        });

        menus[1] = MenuSupporter.MakeMenu(menubar, 1, "Undo/Redo and clipboard functions can be found here.");
        items[MenuSupporter.GenerateMenuItemId(1, 0)] = MenuSupporter.MakeCheckMenuItem(menus[1], 14, "Clear console");
        items[MenuSupporter.GenerateMenuItemId(1, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(1, 0, evt);
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
        items[MenuSupporter.GenerateMenuItemId(2, 1)] = MenuSupporter.MakeMenuItem(menus[2], 23, "Select the language");
        items[MenuSupporter.GenerateMenuItemId(2, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(2, 1, evt);
            }
        });
        menus[3] = MenuSupporter.MakeMenu(menubar, 3, "Compile and test your games.");
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
        items[MenuSupporter.GenerateMenuItemId(6, 0)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 20, "Tabs");
        items[MenuSupporter.GenerateMenuItemId(6, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(6, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(6, 1)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], 21, "MDI");
        items[MenuSupporter.GenerateMenuItemId(6, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 1, evt);
            }
        });
        //</editor-fold>

        splitter1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitter2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitter1.setLeftComponent(splitter2);
        splitter1.setRightComponent(scroller);
        splitter2.setLeftComponent(workspace);
        splitter2.setRightComponent(tabs);
        WelcomeTab welcome = new WelcomeTab();
        addWindow(welcome, 26);


        //<editor-fold defaultstate="expanded" desc="Layout Manager">
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(tool, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE).addComponent(splitter1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(tool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(splitter1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)));



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
            items[MenuSupporter.GenerateMenuItemId(6, 1)].setSelected(true);
            onItemActionPerformed(6, 1, null);
        }
        splitter2.setDividerLocation(0.33);
        
        pack();
        //setSize(550, 550);
        addMessage(29);
        //</editor-fold>
    }

    private void tabsClicked(MouseEvent evt) {
        //Leave in blank... for now...
    }

    private void onItemActionPerformed(int menu, int item, ActionEvent evt) {
        if (menu == 0 && item == 2) {
            try {
                //open project
                JFileChooser fc = new JFileChooser();
                fc.setFileFilter(new CustomFileFilter(".GCP", "G-Creator Project File"));
                fc.showOpenDialog(this);
                File file = fc.getSelectedFile();
                if (file == null) {
                    return;
                }
                ZipFile z = new ZipFile(file);
                z.entries();
                z.close();
            } catch (ZipException ex) {
                Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (menu == 0 && item == 3) {
            //save project
        }
        if (menu == 0 && item == 9) {
            dispose();
        }
        if (menu == 1 && item == 0) {
            output = "";
            console.setText("");
        }
        if (menu == 2 && item == 0) {
            scroller.setVisible(!scroller.isVisible());
            pack();
            splitter1.setDividerLocation(0.66);
        }
        if (menu == 2 && item == 1) {
            LanguageTab lang = new LanguageTab();
            addWindow(lang, 28);
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
        if (menu == 6 && item == 0) {
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
        if (menu == 6 && item == 1) {
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
    }

    public void onToolbarActionPerformed(int item, ActionEvent evt){
        switch(item){
            case 4:
                NewProject win = new NewProject();
                addWindow(win, 55);
                break;
        }
    }
    
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

        newp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                onToolbarActionPerformed(4, evt);
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

    @Override
    public void dispose() {
        saveSettings();
        super.dispose();
    }

    public void saveSettings() {
        SettingsIO.saveSettings(look, istabs, scroller.isVisible());
    }

    public void remove(TabPanel panel, JInternalFrame frame) {
        tabs.remove(panel);
        mdi.remove(frame);
    }
}
