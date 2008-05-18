 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.core;

//<editor-fold defaultstate="collapsed" desc="Import statements">
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
import org.gcreator.macro.*;
import org.gcreator.managers.*;
import org.gcreator.plugins.*;
import org.gcreator.refactoring.*;
import org.gcreator.units.*;
//</editor-fold>

/**
 *
 * @author luis
 */
public class GPanel extends JPanel{
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
    //public JSplitPane splitter3;

    public JTabbedPane navigatorTabs;
    //public int look;

    public boolean showToolbars;
    public JTextPane console;
    public JToolBar tool;
    public String lang;
    public boolean antialiasing;
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
    
    //<editor-fold defaultstate="Collapsed" desc="Constructor">
    public GPanel(ICore icore, String[] settings){
        this.icore = icore;
        
        try{
        chooseImage = new JFileChooser();
        chooseImage.setDialogTitle("Select Image");
        chooseImage.setDialogType(JFileChooser.OPEN_DIALOG);
        chooseImage.setApproveButtonText("OK");
        chooseImage.setFileSelectionMode(JFileChooser.FILES_ONLY);
        }catch(Exception e){
            System.out.println("JfileChooser error in static Aurwindow!");
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
        console.setEditable(false);
        
        console.setContentType("text/html");
        scroller.setViewportView(console);
        statusbar = new Statusbar();
        navigatorTabs = new JTabbedPane();
        System.out.println("window2");
        navroot = new JPanel();
        navroot.setLayout(new BorderLayout());
        System.out.println("window"); 
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

        workspace.addKeyListener(new KeyAdapter() {

            @Override
                    public void keyReleased(KeyEvent e) {

                        //Check wether 'Delete' was pressed

                        if (e.getKeyCode() != e.VK_DELETE) {
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
        items[MenuSupporter.GenerateMenuItemId(0, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_new.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 1)] = MenuSupporter.MakeMenuItem(menus[0], 6, "Create a new file");
        items[MenuSupporter.GenerateMenuItemId(0, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/file_new.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)] = MenuSupporter.MakeMenuItem(menus[0], 7, "Open a project");
        items[MenuSupporter.GenerateMenuItemId(0, 2)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_open.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 3)] = MenuSupporter.MakeMenuItem(menus[0], 8, "Save project");
        items[MenuSupporter.GenerateMenuItemId(0, 3)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 3, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 4)] = MenuSupporter.MakeMenuItem(menus[0], 9, "Save project as...");
        items[MenuSupporter.GenerateMenuItemId(0, 4)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_saveas.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 4, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 5)] = MenuSupporter.MakeMenuItem(menus[0], 53, "Save all projects");
        items[MenuSupporter.GenerateMenuItemId(0, 5)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_saveall.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 6)] = MenuSupporter.MakeMenuItem(menus[0], 88, "Save file");
        items[MenuSupporter.GenerateMenuItemId(0, 6)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/file_save.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 7)] = MenuSupporter.MakeMenuItem(menus[0], 89, "Save All files");
        items[MenuSupporter.GenerateMenuItemId(0, 7)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/file_saveall.png")));
        menus[9] = MenuSupporter.MakeSubMenu(menus[0], 10, "Import...");
        menus[9].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/import.png")));
        menus[10] = MenuSupporter.MakeSubMenu(menus[9], 185, "File");
        items[MenuSupporter.GenerateMenuItemId(10, 0)] = MenuSupporter.MakeMenuItem(menus[10], 189, "Import Image");
        items[MenuSupporter.GenerateMenuItemId(10, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(10, 0, evt);
                    }
                });
        menus[11] = MenuSupporter.MakeSubMenu(menus[9], 186, "Project");
        menus[12] = MenuSupporter.MakeSubMenu(menus[0], 11, "Export...");
        menus[12].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/export.png")));
        menus[13] = MenuSupporter.MakeSubMenu(menus[12], 185, "File");
        menus[14] = MenuSupporter.MakeSubMenu(menus[12], 186, "Project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)] = MenuSupporter.MakeMenuItem(menus[0], 12, "Close a project");
        items[MenuSupporter.GenerateMenuItemId(0, 9)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_close.png")));
        items[MenuSupporter.GenerateMenuItemId(0, 9)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(0, 9, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(0, 10)] = MenuSupporter.MakeMenuItem(menus[0], 13, "Closes the application");
        items[MenuSupporter.GenerateMenuItemId(0, 10)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/file_exit.png")));
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
        //menus[5] = MenuSupporter.MakeSubMenu(menus[2], 15, "Look&Feel");
        //menus[6] = MenuSupporter.MakeSubMenu(menus[2], 16, "Display mode");
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
        items[MenuSupporter.GenerateMenuItemId(7, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_language.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 1)] = MenuSupporter.MakeMenuItem(menus[7], 93, "Update");
        items[MenuSupporter.GenerateMenuItemId(7, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_update.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 2)] = MenuSupporter.MakeMenuItem(menus[7], 109, "Extensions Manager");
        items[MenuSupporter.GenerateMenuItemId(7, 2)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_plug.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 2, evt);
                    }
                });
        menus[7].addSeparator();
        items[MenuSupporter.GenerateMenuItemId(7, 3)] = MenuSupporter.MakeMenuItem(menus[7], 130, "Global options");
        items[MenuSupporter.GenerateMenuItemId(7, 3)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_global.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 3, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(7, 5)] = MenuSupporter.MakeMenuItem(menus[7], 267, "Welcome screen");
        items[MenuSupporter.GenerateMenuItemId(7, 5)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 5, evt);
                    }
                });
        menus[7].addSeparator();
        menus[8] = MenuSupporter.MakeSubMenu(menus[7], 171, "Macro");
        menus[8].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_macro.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 4)] = MenuSupporter.MakeMenuItem(menus[7], 183, "PowerPack");
        items[MenuSupporter.GenerateMenuItemId(7, 4)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_powerpack.png")));
        items[MenuSupporter.GenerateMenuItemId(7, 4)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(7, 4, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 0)] = MenuSupporter.MakeMenuItem(menus[8], 172, "Play macro");
        items[MenuSupporter.GenerateMenuItemId(8, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_macro_play.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 1)] = MenuSupporter.MakeMenuItem(menus[8], 173, "Edit macro");
        items[MenuSupporter.GenerateMenuItemId(8, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_macro_edit.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 1, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 2)] = MenuSupporter.MakeMenuItem(menus[8], 174, "Record new macro");
        items[MenuSupporter.GenerateMenuItemId(8, 2)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_macro_record.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 2)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 2, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(8, 3)] = MenuSupporter.MakeMenuItem(menus[8], 182, "Stop recording macro");
        items[MenuSupporter.GenerateMenuItemId(8, 3)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/tools_macro_stop.png")));
        items[MenuSupporter.GenerateMenuItemId(8, 3)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(8, 3, evt);
                    }
                });
        menus[4] = MenuSupporter.MakeMenu(menubar, 4, "Get info about Aurora.");
        items[MenuSupporter.GenerateMenuItemId(4, 0)] = MenuSupporter.MakeMenuItem(menus[4], 24, "About Aurora");
        items[MenuSupporter.GenerateMenuItemId(4, 0)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/help_about.png")));
        items[MenuSupporter.GenerateMenuItemId(4, 0)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 0, evt);
                    }
                });
        items[MenuSupporter.GenerateMenuItemId(4, 1)] = MenuSupporter.MakeMenuItem(menus[4], 25, "Aurora help");
        items[MenuSupporter.GenerateMenuItemId(4, 1)].setIcon(new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/help_help.png")));
        items[MenuSupporter.GenerateMenuItemId(4, 1)].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        onItemActionPerformed(4, 1, evt);
                    }
                });
        /*items[MenuSupporter.GenerateMenuItemId(5, 4)] = MenuSupporter.MakeRadioMenuItem(stylegroup, menus[5], 1, "GTK");
        items[MenuSupporter.GenerateMenuItemId(5, 4)].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        onItemActionPerformed(5, 4, evt);
        }
        });*/
        /*ButtonGroup agroup = new ButtonGroup();
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
                });*/
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
        navigatorTabs.add(LangSupporter.activeLang.getEntry(51), treescroll);
        navigatorTabs.add(LangSupporter.activeLang.getEntry(251), navroot);
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
                        int x = evt.getX()+getLocationOnScreen().x;
                        int y = evt.getY()+getLocationOnScreen().y;
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
                            f.setVisible(true);
                            f.setTitle(title);
                            f.setLayout(new BorderLayout());
                            f.setSize(c.getSize());
                            f.add(c, BorderLayout.CENTER);
                            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            f.setResizable(true);
                            f.setLocation(evt.getX() + getLocationOnScreen().x - 30, evt.getY() + getLocationOnScreen().y - 5);
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

        if (settings[2].equals("Hidden")) {
            onItemActionPerformed(2, 0, null);
        } else {
            items[MenuSupporter.GenerateMenuItemId(2, 0)].setSelected(true);
            icore.pack();
            splitter1.setDividerLocation(0.66);
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
        icore.setSize(w, h);
        splitter2.setDividerLocation(159);
        splitter1.setDividerSize(5);
        splitter2.setDividerSize(5);
        utilities.addMessage(29);
        if(!(new File("settings/disable_welcome")).exists()){
            SplashScreen.message = "Starting welcome window";
            gcreator.splash.repaint();
            WelcomeTab welcome = new WelcomeTab();
            addWindow(welcome, 26);
            updateToDefaultNavigatorPanel(welcome);
        }
        setMinimumSize(new Dimension(200, 200));
        if (settings[6].equals("True")) {
            icore.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else {
            icore.setExtendedState(JFrame.NORMAL);
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
        System.out.println("Delete file");
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
    private void closeAllTabs(DefaultMutableTreeNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ObjectNode on = (ObjectNode)node.getChildAt(i);
            GObject go = on.object;
            
            if (!(go instanceof GFile)) {
                if (go instanceof Folder) {
                    closeAllTabs(on);
                    continue;
                }
                else {
                    continue;
                }
            }
            GFile o = (GFile)go;
            if (o.tabPanel != null) {
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
        System.out.println("popup menu");
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
                m.addActionListener(i, new ActionListener() {

                            public void actionPerformed(ActionEvent evt) {
                                deleteFile((org.gcreator.fileclass.GFile) o);
                            }
                        });
            //}
            //else{
            //    Object i = m.addMenuItem(
            //    246, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/grayed_delete_filegroup.png")));
            //}
        }
        if (o instanceof org.gcreator.fileclass.Group) {
                Object i = m.addMenuItem(
                246, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/delete_filegroup.png")));
                if (((org.gcreator.fileclass.Group) o).root.allowsDelete(o)) {
                    m.addActionListener(i, new ActionListener() {

                                public void actionPerformed(ActionEvent evt) {
                                    deleteGroup((org.gcreator.fileclass.Group) o);
                                }
                            });
                }
                else{
                    m.setEnabled(i, false);
                }
            Object k = m.addMenuItem(
                245, new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/addgroup.png")));
            //k.setVisible(true);
            m.addActionListener(k, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Folder f = getCurrentFolder();
                    int in = 1;
                    for(Object o : f.getChildren()){
                        if(((GObject) o).name.equals("subgroup"+in)){
                            in++;
                            continue;
                        }
                    }
                
                    addGroup(f, f.newGroup("subgroup" + in));
                }
            });
        }
        if (o instanceof Project) {
            Object j = m.addMenuItem(
                245, new ImageIcon(getClass().getResource("/org/gcreator/resources/uiplus/close_project.png")));
            m.addActionListener(j, new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            CloseProject((Project) o, true);
                        }
                    });
        }
        //i.setVisible(true);
        //m.add(i);
        //m.add(j);
        //m.add(k);
        m.show(this, e.getX()+/*getLocationOnScreen().x+*/workspace.getLocationOnScreen().x, e.getY()+/*getLocationOnScreen().y+*/workspace.getLocationOnScreen().y);
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
        System.out.println("Open: " + file.name + "." + file.type);
        boolean found = false;
        int iii = 0;
        int foundloc = 0;
        file.type = file.type.toLowerCase();
        FileOpenListener listener = getFileEditor(file.type);
        ImageIcon img = null;
        try {
            img = (ImageIcon) ((WorkspaceCellRenderer) workspace.getCellRenderer()).getImageFor(file.node);
        } catch (ClassCastException e) {}
        
        if (listener != null) {
            listener.openNewFile(file, this.getCurrentProject(), img);
        } else if(file.type.equals("action")){
            TabPanel tp = new ActionEditor(file, this.getCurrentProject());
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        } else if (file.type.equals("sprite")) {

            System.out.println("Sprite created");

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
            TabPanel tp = new ImageEditor2(this.getCurrentProject(), file);
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
        } else {
            TabPanel tp = new PlainTextEditor(file, this.getCurrentProject());//All unmanaged file formats
            file.tabPanel = tp;
            addEWindow(tp, file.name, img);
        }
        Macro.macroAction(new OpenFileAction(file));
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
    public ICore getICore(){
        return icore;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="dispose">
    public void dispose(){
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
        if(icore!=null)
            icore.disposeIt();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="saveSettings">
    public void saveSettings() {
        System.out.println("Save settings");
        SettingsIO.saveSettings(istabs, scroller.isVisible());
        try {
            ToolbarManager.writeToolbarFile("settings/toolbarList.gctl");
        } catch (IOException e) {
        }
        ScriptThemeManager.save();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="addWindow(TabPanel, int)">
    public void addWindow(TabPanel panel, int title) {
        addWindow(panel, LangSupporter.activeLang.getEntry(title), null);
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
                addWindow(panel, Integer.parseInt(title.substring(1)));
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
                addWindow(panel, Integer.parseInt(title.substring(1)));
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
                tabs.addTab(panel.title, img, panel, "");
                int index = tabs.indexOfComponent(panel);
                tabs.setTabComponentAt(index, new ButtonTabComponent(tabs));
                tabs.setSelectedComponent(panel);
            }
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
            frame.setSize(new Dimension(Math.max(panel.getPreferredSize().width,300),
                                Math.max(panel.getPreferredSize().height,300)) );
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
            org.jdesktop.layout.GroupLayout jInternalFrame1Layout = new org.jdesktop.layout.GroupLayout(frame.getContentPane());
            frame.getContentPane().setLayout(jInternalFrame1Layout);
            if (!istabs) {
                jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(panel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
    private void onItemActionPerformed(int menu, int item, ActionEvent evt) {
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
            addWindow(about, 24);
        }
        if (menu == 4 && item == 1) {
            HelpPanel help = new HelpPanel();
            addWindow(help, 27);
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
        if (menu == 7 && item == 5){
            WelcomeTab welcome = new WelcomeTab();
            addWindow(welcome, 26);
            updateToDefaultNavigatorPanel(welcome);
        }
        if (menu == 8 && item == 0) {
            PlayMacroDialog dialog = new PlayMacroDialog(this, true);
            dialog.setVisible(true);
        }
        if (menu == 8 && item == 2) {
            String mname = JOptionPane.showInputDialog(this, LangSupporter.activeLang.getEntry(175));
            if (mname != null && mname.length() > 0) {
                if (MacroLibrary.findMacro(mname) != null) {
                    JOptionPane.showMessageDialog(this,
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

    //<editor-fold defaultstate="collapsed" desc="onToolbarActionPerformed">
    public void onToolbarActionPerformed(int item, ActionEvent evt) {
        int i;
        Folder a;
        switch (item) {
            case 1:
                if(newproject != null)
                    addWindow(newproject, 55,new ImageIcon(getClass().getResource("/org/gcreator/resources/menu/project_new.png")));
                break;
            case 2:
                ProjectImporter.OpenProject(this);
                break;
            case 3:
                SaveMainProject(false);
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
                if (!(getCurrentProject() instanceof GameProject)){
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                //add sprite
                a = this.getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newSprite" + ((GameProject)getCurrentProject()).sprites++, "sprite");

                break;
            case 6:
                if (!(getCurrentProject() instanceof GameProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                //add sound
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newSound" + ((GameProject)getCurrentProject()).sounds++, "wav");

                break;
            case 7:
                //add class
                if (getCurrentProject() instanceof GameProject)
                    i = ((GameProject)getCurrentProject()).classes;
                else if (getCurrentProject() instanceof ModuleProject)
                    i = ((ModuleProject)getCurrentProject()).classes;
                else {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newClass" + i, "gcl");
                if (getCurrentProject() instanceof GameProject)
                    ((GameProject)getCurrentProject()).classes++;
                else if (getCurrentProject() instanceof ModuleProject)
                    ((ModuleProject)getCurrentProject()).classes++;
                break;
            case 8:
                if (!(getCurrentProject() instanceof GameProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                //getCurrentProject().actors.add(new Actor("newActor" + i));
                addFile(getCurrentFolder(), "act_" + ((GameProject)getCurrentProject()).actors++, "actor");
                break;
            case 9:
                if (!(getCurrentProject() instanceof GameProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                //getCurrentProject().scenes.add(new Scene("newScene" + i));
                addFile(getCurrentFolder(), "sc_" + ((GameProject)getCurrentProject()).scenes++, "scene");
                break;
            case 10:
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                if (getCurrentProject() instanceof GameProject)
                    {
                    org.gcreator.fileclass.GFile file = addFile(getCurrentFolder(), "img_" + ((GameProject)getCurrentProject()).images++, "png");
                    return;
                }
                else if(getCurrentProject() instanceof ModuleProject){
                    org.gcreator.fileclass.GFile file = addFile(getCurrentFolder(), "img_" + ((ModuleProject)getCurrentProject()).images++, "png");
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                }

                break;
            case 11:
                if (!(getCurrentProject() instanceof GameProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "tset_" + ((GameProject)getCurrentProject()).tilesets++, "tileset");
                break;
            case 12:
                if (!(getCurrentProject() instanceof GameProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "tl_" + ((GameProject)getCurrentProject()).timelines++, "timeline");
                break;
            case 13:
                //add class
                if (getCurrentProject() instanceof GameProject)
                    i = ((GameProject)getCurrentProject()).scripts;
                else if (getCurrentProject() instanceof ModuleProject)
                    i = ((ModuleProject)getCurrentProject()).scripts;
                else {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "script_" + i, "gs");
                if (getCurrentProject() instanceof GameProject)
                    ((GameProject)getCurrentProject()).scripts++;
                else if (getCurrentProject() instanceof ModuleProject)
                    ((ModuleProject)getCurrentProject()).scripts++;
                break;
            case 14:
                Folder f = getCurrentFolder();
                int in = 1;
                for(Object o : f.getChildren()){
                    if(((GObject) o).name.equals("subgroup"+in)){
                        in++;
                        continue;
                    }
                }
                
                addGroup(f, f.newGroup("subgroup" + in));
                
                break;               
             case 15:
                 //add path
                if (!(getCurrentProject() instanceof GameProject))
                    return;
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "newPath" + ((GameProject)getCurrentProject()).paths++, "path");
                break;
            case 16:
                if (!(getCurrentProject() instanceof ModuleProject))
                    {
                    JOptionPane.showMessageDialog(null, "You have not selected a project to add to!");
                    return;
                }
                a = getCurrentFolder();
                if (a == null) {
                    JOptionPane.showMessageDialog(null, "Select a folder on the project tree!");
                    return;
                }
                addFile(getCurrentFolder(), "action_" + ((ModuleProject)getCurrentProject()).actions++, "action");
                break;
        }
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="addFile">
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

    //<editor-fold defaultstate="collapsed" desc="addGroup">
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
        if (getCurrentProject() != null) {
            ProjectExporter.export(getCurrentProject(), getCurrentProject().name + ".gcp");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SaveProject(Project)">
    public void SaveProject(Project p) {
        if (p != null) {
            ProjectExporter.export(p, p.name + ".gcp");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CloseProject(Project)">
    public void CloseProject(Project p) {
        org.gcreator.core.utilities.addStringMessage("close project");
        //Close all tabs
        closeAllTabs((DefaultMutableTreeNode) p.node.getParent());
        
        top.remove((DefaultMutableTreeNode) getCurrentProject().node.getParent());
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
        System.out.println("Saving...");
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
        //save to gcp file
        if (mainProject.location == null || mainProject.location.equals("") || saveAs) {
          JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
            fc.showSaveDialog(gcreator.window);
            java.io.File file = fc.getSelectedFile();
            if (file == null) {
              return;
            }
            mainProject.location = file.getPath();
            if (!mainProject.location.contains(".gcp")) 
            {
                mainProject.location += ".gcp";
            }
        }
        ProjectExporter.export(mainProject, mainProject.location);
    }
    //</editor-fold>
    
}
