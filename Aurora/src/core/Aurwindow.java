/*
 * window.java
 *
 * Created on 24/Ago/2007, 13:34:11
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import components.*;

/**
 *
 * @author Luís
 */
public class Aurwindow extends JFrame {

    //<editor-fold defaultstate="expanded" desc="Variables">
    public JMenuBar menubar = new JMenuBar();
    public JMenu[] menus = new JMenu[MenuSupporter.MENULIMIT];
    public JMenuItem[] items = new JMenuItem[MenuSupporter.MENULIMIT * MenuSupporter.ITEMLIMIT];
    public JSplitPane splitter1;
    public JSplitPane splitter2;
    public JTabbedPane tabs;
    public boolean look;
    public boolean istabs; //True - tabs; False - MDI
    public JDesktopPane mdi;
    public JTextPane console;
    public JScrollPane scroller;
    public String output;

    //</editor-fold>
    public void addWindow(TabPanel panel, String title) {
        panel.parent = this;
        panel.title = title;
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
        frame.setTitle(title);
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

    public void addMessage(String message){
        addFormatedMessage(message, null, false);
    }
    
    public void addFormatedMessage(String message, String color, boolean bold){
        String out = "";
        if(color!=null)
            out += "<font color='" + color + "'>";
        if(bold)
            out += "<b>";
        out += message;
        if(bold)
            out += "</b>";
        if(color!=null)
            out += "</font>";
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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            look = true;
        } catch (Exception e) {
            look = false;
        }
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
        
        //<editor-fold defaultstate="expanded" desc="Menu Manager">
        menus[0] = MenuSupporter.MakeMenu(menubar, "File", "Very important functions such as 'Save', 'Open' and 'Exit' can be found here.");
        items[MenuSupporter.GenerateMenuItemId(0, 0)] = MenuSupporter.MakeMenuItem(menus[0], "New Project", "Create a new project");
        items[MenuSupporter.GenerateMenuItemId(0, 1)] = MenuSupporter.MakeMenuItem(menus[0], "New File", "Create a new file");
        items[MenuSupporter.GenerateMenuItemId(0, 2)] = MenuSupporter.MakeMenuItem(menus[0], "Open Project", "Open a project");
        items[MenuSupporter.GenerateMenuItemId(0, 3)] = MenuSupporter.MakeMenuItem(menus[0], "Save", "Save project");
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], "Save As...", "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], "Import file", "Import a file");
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], "Export file", "Export a file");
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], "Exit", "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 7)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(0, 7, evt);
            }
        });

        menus[1] = MenuSupporter.MakeMenu(menubar, "Edit", "Undo/Redo and clipboard functions can be found here.");
        items[MenuSupporter.GenerateMenuItemId(1, 0)] = MenuSupporter.MakeCheckMenuItem(menus[1], "Clear console", "Clear console");
        items[MenuSupporter.GenerateMenuItemId(1, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(1, 0, evt);
            }
        });
        menus[2] = MenuSupporter.MakeMenu(menubar, "View", "Layout and design options are defined here.");
        menus[5] = MenuSupporter.MakeSubMenu(menus[2], "Look&Feel", "Layout and design options are defined here.");
        menus[6] = MenuSupporter.MakeSubMenu(menus[2], "Display mode", "Display mode");
        items[MenuSupporter.GenerateMenuItemId(2, 0)] = MenuSupporter.MakeCheckMenuItem(menus[2], "Display output box", "Display output box");
        items[MenuSupporter.GenerateMenuItemId(2, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(2, 0, evt);
            }
        });
        menus[3] = MenuSupporter.MakeMenu(menubar, "Build&Run", "Compile and test your games.");
        menus[4] = MenuSupporter.MakeMenu(menubar, "Help", "Get info about Aurora.");
        items[MenuSupporter.GenerateMenuItemId(4, 0)] = MenuSupporter.MakeMenuItem(menus[4], "About", "About Aurora");
        items[MenuSupporter.GenerateMenuItemId(4, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(4, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(4, 1)] = MenuSupporter.MakeMenuItem(menus[4], "Help", "Aurora help");
        items[MenuSupporter.GenerateMenuItemId(4, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(4, 1, evt);
            }
        });
        ButtonGroup group = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(5, 0)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], "Native look", "Native look");
        items[MenuSupporter.GenerateMenuItemId(5, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 0, evt);
            }
        });
        if (look) {
            items[MenuSupporter.GenerateMenuItemId(5, 0)].setSelected(true);
        }
        items[MenuSupporter.GenerateMenuItemId(5, 1)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], "Cross-platform look", "Cross-platform look");
        items[MenuSupporter.GenerateMenuItemId(5, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 1, evt);
            }
        });
        if (!look) {
            items[MenuSupporter.GenerateMenuItemId(5, 1)].setSelected(true);
        }
        MenuSupporter.MakeSeparator(menus[5]);
        items[MenuSupporter.GenerateMenuItemId(5, 2)] = MenuSupporter.MakeRadioMenuItem(group, menus[5], "Motif look", "Linux look");
        items[MenuSupporter.GenerateMenuItemId(5, 2)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(5, 2, evt);
            }
        });
        ButtonGroup agroup = new ButtonGroup();
        items[MenuSupporter.GenerateMenuItemId(6, 0)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], "Tabs", "Tabs");
        items[MenuSupporter.GenerateMenuItemId(6, 0)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 0, evt);
            }
        });
        items[MenuSupporter.GenerateMenuItemId(6, 0)].setSelected(true);
        items[MenuSupporter.GenerateMenuItemId(6, 1)] = MenuSupporter.MakeRadioMenuItem(agroup, menus[6], "MDI", "MDI");
        items[MenuSupporter.GenerateMenuItemId(6, 1)].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                onItemActionPerformed(6, 1, evt);
            }
        });
        //</editor-fold>
        //<editor-fold defaultstate="expanded" desc="Splitter Manager">
        splitter1.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitter2.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitter1.setLeftComponent(splitter2);
        splitter1.setRightComponent(scroller);
        splitter2.setRightComponent(tabs);
        WelcomeTab welcome = new WelcomeTab();
        addWindow(welcome, "Welcome!");
        //</editor-fold>
        //<editor-fold defaultstate="expanded" desc="Layout Manager">
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(splitter1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(splitter1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE));
        
        pack();
        setSize(500, 500);

        addMessage("Finished loading application.");
        
        onItemActionPerformed(2,0,null);
        //</editor-fold>
    }

    private void tabsClicked(MouseEvent evt) {
        //Leave in blank... for now...
    }

    private void onItemActionPerformed(int menu, int item, ActionEvent evt) {
        if (menu == 0 && item == 7) {
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
        if (menu == 4 && item == 0) {
            HelpTab help = new HelpTab(0, 0);
            addWindow(help, "Help!");
        }
        if (menu == 4 && item == 1) {
            HelpTab help = new HelpTab();
            addWindow(help, "Help!");
        }
        if (menu == 5 && item == 0) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 1) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
            }
        }
        if (menu == 5 && item == 2) {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
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
                System.out.println("MDI: " + mdi.getComponentCount());
                for (int i = 0; i < mdi.getComponentCount(); i++) {
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
                System.out.println("Tabs:" + tabs.getComponentCount());
                Component[] panels = tabs.getComponents();
                for (int i = 0; i < panels.length; i++) {
                    System.out.println("Loop: " + i);
                    if(panels[i] instanceof TabPanel){
                        TabPanel panel = (TabPanel) panels[i];
                        GroupLayout jInternalFrame1Layout = (GroupLayout) panel.frame.getContentPane().getLayout();
                        jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                        jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                    }
                }
            }
        }
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    public void remove(TabPanel panel, JInternalFrame frame) {
        tabs.remove(panel);
        mdi.remove(frame);
    }
}
