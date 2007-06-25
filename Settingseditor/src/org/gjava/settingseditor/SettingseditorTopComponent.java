package org.gjava.settingseditor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import org.JGM.roomeditor.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ListCellRenderer;
import org.openide.filesystems.FileLock;
import org.openide.util.Exceptions;
import javax.swing.JColorChooser;

import org.openide.windows.TopComponent;

/**
 * Top component which displays something.
 */
final class SettingseditorTopComponent extends TopComponent {
    
    static int from;
    public static SettingsDataObject a;
    private static SettingseditorTopComponent instance;
    /** path to the icon used by the component and its open action */
    //    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    
    private static final String PREFERRED_ID = "SettingseditorTopComponent";
    public final DefaultListModel roomz = new DefaultListModel();
    public String path = "";
    
    
    private SettingseditorTopComponent(SettingsDataObject a) {
        this.a = a;
        final SettingsDataObject aa = a;
        initComponents();
        //this.setHtmlDisplayName("Settings");
        
        //NbBundle.getMessage(SettingseditorTopComponent.class, "CTL_SettingseditorTopComponent"));
        //setToolTipText(NbBundle.getMessage(SettingseditorTopComponent.class, "HINT_SettingseditorTopComponent"));
        path = a.getPrimaryFile().getPath();
        
        //        setIcon(Utilities.loadImage(ICON_PATH, true));
        
        jList1.setDropTarget(new DropTarget(this,new DropTargetListener() {
            public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
                //not needed
            }
            public void dragExit(DropTargetEvent dropTargetEvent) {
                //not needed
            }
            public void dragOver(DropTargetDragEvent dtde) {
                if( dtde.isDataFlavorSupported(GMJRoomDataNode.Room_DATA_FLAVOR ) ) {
                    //only accept object of our type
                    dtde.acceptDrag( DnDConstants.ACTION_COPY_OR_MOVE );
                } else {
                    //reject everything else
                    dtde.rejectDrag();
                }
            }
            public void drop(DropTargetDropEvent dtde) {
                
                System.out.println("Drop called!");
                
                //first check if we support this type of data
                if( !dtde.isDataFlavorSupported( GMJRoomDataNode.Room_DATA_FLAVOR ) ) {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                GMJRoomData data = null;
                try {
                    
                    //get the dragged data from the transferable
                    data = (GMJRoomData) dtde.getTransferable().getTransferData(GMJRoomDataNode.Room_DATA_FLAVOR);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (UnsupportedFlavorException ex) {
                    ex.printStackTrace();
                }
                
                dtde.dropComplete( null != data );
                if( null != data ) {
                    
                }
                //add to list
                
                roomz.addElement(data);
                aa.setModified(true);
                //jList1.getModel().addElement(data.path);
                System.out.println("add room to list "+jList1.getModel().getSize());
                //ado.data.img = data.path;
                
            }
            
            
            
            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
            }
        }));
        jList1.setModel(roomz);
        jList1.setCellRenderer(new SimpleCellRenderer());
        //jList1.setDragEnabled(true);
        
        
        openfile();
    }
    
    //save the settings file
    public void savefile() {
        FileLock lock;
        try {
            lock= a.getPrimaryFile().lock();
        } catch (Exception e) {
            return;
        }
        {
            java.io.PrintWriter to = null;
            
            try {
                to = new java.io.PrintWriter(a.getPrimaryFile().getOutputStream(lock));
                
                to.println("<?xml version=\"1.0\"?>");
                
                if (jCheckBox3.isSelected() == true)
                    to.println("<FullScreen>True</FullScreen>");
                else
                    to.println("<FullScreen>False</FullScreen>");
                
                if (jCheckBox4.isSelected() == true)
                    to.println("<Resize>True</Resize>");
                else
                    to.println("<Resize>False</Resize>");
                
                if (jCheckBox5.isSelected() == true)
                    to.println("<Border>True</Border>");
                else
                    to.println("<Border>False</Border>");
                
                if (jCheckBox6.isSelected() == true)
                    to.println("<Buttons>True</Buttons>");
                else
                    to.println("<Buttons>False</Buttons>");
                
                if (jCheckBox1.isSelected() == true)
                    to.println("<Mouse>True</Mouse>");
                else
                    to.println("<Mouse>False</Mouse>");
                
                if (jCheckBox2.isSelected() == true)
                    to.println("<FPS>True</FPS>");
                else
                    to.println("<FPS>False</FPS>");
                
                if (jCheckBox7.isSelected() == true)
                    to.println("<SetResolution>True</SetResolution>");
                else
                    to.println("<SetResolution>False</SetResolution>");
                
                to.println("<Cdepth>"+cdepth.getSelection().getActionCommand()+"</Cdepth>");
                to.println("<Resolution>"+resolution.getSelection().getActionCommand()+"</Resolution>");
                to.println("<Frequency>"+frequency.getSelection().getActionCommand()+"</Frequency>");
                
                if (jCheckBox8.isSelected() == true)
                    to.println("<ESC>True</ESC>");
                else
                    to.println("<ESC>False</ESC>");
                
                if (jCheckBox9.isSelected() == true)
                    to.println("<F4>True</F4>");
                else
                    to.println("<F4>False</F4>");
                
                if (jCheckBox10.isSelected() == true)
                    to.println("<F5F6>True</F5F6>");
                else
                    to.println("<F5F6>False</F5F6>");
                
                if (jCheckBox11.isSelected() == true)
                    to.println("<ShowImage>True</ShowImage>");
                else
                    to.println("<ShowImage>False</ShowImage>");
                
                to.println("<Image>"+jTextField2.getText()+"</Image>");
                to.println("<Icon>"+jTextField1.getText()+"</Icon>");
                
                to.println("<RoomOrder>");
                
                for(int i = 0; i < jList1.getModel().getSize(); i++)
                    to.println("<Room>"+((GMJRoomData)jList1.getModel().getElementAt(i)).path+"</Room>");
                
                
                to.println("</RoomOrder>");
                
            } catch (Exception e){}
            
            lock.releaseLock();
            to.close();
            
        }
    }
    
    public void openfile() {
        roomz.clear();
        BufferedReader from=null;
        try {
            from = new java.io.BufferedReader(new java.io.InputStreamReader(a.getPrimaryFile().getInputStream()));
            String line;
            while ((line=from.readLine()) != null) {
                
                if (line.contains("<FullScreen>") && line.contains("</FullScreen>")) {
                    if (line.contains("True") )
                        jCheckBox3.setSelected(true);
                    else
                        jCheckBox3.setSelected(false);
                }
                
                if (line.contains("<Resize>") && line.contains("</Resize>")) {
                    if (line.contains("True") )
                        jCheckBox4.setSelected(true);
                    else
                        jCheckBox4.setSelected(false);
                }
                
                if (line.contains("<Border>") && line.contains("</Border>")) {
                    if (line.contains("True") )
                        jCheckBox5.setSelected(true);
                    else
                        jCheckBox5.setSelected(false);
                }
                
                if (line.contains("<Buttons>") && line.contains("</Buttons>")) {
                    if (line.contains("True") )
                        jCheckBox6.setSelected(true);
                    else
                        jCheckBox6.setSelected(false);
                }
                
                if (line.contains("<Mouse>") && line.contains("</Mouse>")) {
                    if (line.contains("True") )
                        jCheckBox1.setSelected(true);
                    else
                        jCheckBox1.setSelected(false);
                }
                
                if (line.contains("<FPS>") && line.contains("</FPS>")) {
                    if (line.contains("True") )
                        jCheckBox2.setSelected(true);
                    else
                        jCheckBox2.setSelected(false);
                }
                
                if (line.contains("<SetResolution>") && line.contains("</SetResolution>")) {
                    if (line.contains("True") )
                        jCheckBox7.setSelected(true);
                    else
                        jCheckBox7.setSelected(false);
                }
                
                if (line.contains("<Cdepth>") && line.contains("</Cdepth>")) {
                    line.replaceAll("<Cdepth>", "");
                    line.replaceAll("</Cdepth>", "");
                    System.out.println("button:"+line);
                    //cdepth.setSelected(m, true);
                }
                
                if (line.contains("<ESC>") && line.contains("</ESC>")) {
                    if (line.contains("True") )
                        jCheckBox8.setSelected(true);
                    else
                        jCheckBox8.setSelected(false);
                }
                
                if (line.contains("<F4>") && line.contains("</F4>")) {
                    if (line.contains("True") )
                        jCheckBox9.setSelected(true);
                    else
                        jCheckBox9.setSelected(false);
                }
                
                if (line.contains("<F5F6>") && line.contains("</F5F6>")) {
                    if (line.contains("True") )
                        jCheckBox10.setSelected(true);
                    else
                        jCheckBox10.setSelected(false);
                }
                
                if (line.contains("<ShowImage>") && line.contains("</ShowImage>")) {
                    if (line.contains("True") )
                        jCheckBox11.setSelected(true);
                    else
                        jCheckBox11.setSelected(false);
                }
                
                if (line.contains("<RoomOrder>")) {
                    line=from.readLine();
                    while (!line.equals("</RoomOrder>")) {
                    GMJRoomData gr = new GMJRoomData();
                    if (line.contains("<Room>") && line.contains("</Room>")) {
                    gr.path = line.replaceAll("<Room>", "").replaceAll("</Room>", "");
                    roomz.addElement(gr);
                    }
                    line=from.readLine();
                    }
                    
                    
                }
            }
            
            
            
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        } finally {
            try {
                from.close();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdepth = new javax.swing.ButtonGroup();
        resolution = new javax.swing.ButtonGroup();
        frequency = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox1, "Display Mouse");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setEnabled(false);
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox2, "Display FPS in window caption");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setEnabled(false);
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox3, "Start in full-screen mode");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setEnabled(false);
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox4, "Allow the player to resize the room window");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox4.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox5, "Don't draw a border in windowed mode");
        jCheckBox5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox5.setEnabled(false);
        jCheckBox5.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox6, "Don't show the buttons in the window caption");
        jCheckBox6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox6.setEnabled(false);
        jCheckBox6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jCheckBox3)
                    .add(jCheckBox4)
                    .add(jCheckBox5)
                    .add(jCheckBox6)
                    .add(jCheckBox1)
                    .add(jCheckBox2))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jCheckBox3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBox4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBox5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBox6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBox1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jCheckBox2)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Graphics", jPanel1);

        jCheckBox7.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox7, "Set the resolution of the screen");
        jCheckBox7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Colour Depth"));

        cdepth.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton1, "No Change");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        cdepth.add(jRadioButton2);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton2, "16-bit");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        cdepth.add(jRadioButton3);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton3, "32-bit");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButton1)
                    .add(jRadioButton2)
                    .add(jRadioButton3))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jRadioButton1)
                .add(4, 4, 4)
                .add(jRadioButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton3))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolution"));

        resolution.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton4, "No Change");
        jRadioButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton5);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton5, "320x240");
        jRadioButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton6);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton6, "640x480");
        jRadioButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton7);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton7, "800x600");
        jRadioButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton8);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton8, "1024x768");
        jRadioButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton9);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton9, "1280x1024");
        jRadioButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));

        resolution.add(jRadioButton10);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton10, "1600x1200");
        jRadioButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButton4)
                    .add(jRadioButton5)
                    .add(jRadioButton6)
                    .add(jRadioButton7)
                    .add(jRadioButton8)
                    .add(jRadioButton9)
                    .add(jRadioButton10))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jRadioButton4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton10))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Frequency"));

        frequency.add(jRadioButton11);
        jRadioButton11.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton11, "No Change");
        jRadioButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));

        frequency.add(jRadioButton12);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton12, "60");
        jRadioButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));

        frequency.add(jRadioButton13);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton13, "70");
        jRadioButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));

        frequency.add(jRadioButton14);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton14, "85");
        jRadioButton14.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));

        frequency.add(jRadioButton15);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton15, "100");
        jRadioButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));

        frequency.add(jRadioButton16);
        org.openide.awt.Mnemonics.setLocalizedText(jRadioButton16, "120");
        jRadioButton16.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButton11)
                    .add(jRadioButton12)
                    .add(jRadioButton13)
                    .add(jRadioButton14)
                    .add(jRadioButton15)
                    .add(jRadioButton16))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jRadioButton11)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton12)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton13)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton15)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jRadioButton16))
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jCheckBox7))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jCheckBox7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(147, 147, 147))
        );

        jTabbedPane1.addTab("Resolution", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Default Keys"));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox8, "Let <Esc> end the game");
        jCheckBox8.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox8.setEnabled(false);
        jCheckBox8.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox9, "Let <F4> switch between screen modes");
        jCheckBox9.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox9.setEnabled(false);
        jCheckBox9.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox10, "Let <F5> and <F6> save and load the game");
        jCheckBox10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox10.setEnabled(false);
        jCheckBox10.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel8Layout = new org.jdesktop.layout.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .add(jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jCheckBox8)
                    .add(jCheckBox9)
                    .add(jCheckBox10))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel8Layout.createSequentialGroup()
                .add(jCheckBox8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox10))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Loading"));
        jPanel9.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(jCheckBox11, "Show image while loading");
        jCheckBox11.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox11.setEnabled(false);
        jCheckBox11.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, "Image:");

        jTextField2.setText("image location");
        jTextField2.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel9Layout = new org.jdesktop.layout.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .add(jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jCheckBox11)
                    .add(jPanel9Layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel9Layout.createSequentialGroup()
                .add(jCheckBox11)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 14, Short.MAX_VALUE)
                .add(jPanel9Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, "Icon:");

        jTextField1.setText("icon location");
        jTextField1.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Other", jPanel7);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "<html>Here you can set the order of the game. The first item in the list will be displayed first. Just drag and drop the .room files onto the list.</html>");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "room0", "room1", "room2", "room4" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jList1MouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Game  Order", jPanel3);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, "Page title: ");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, "Text color:");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, "Background color: ");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, "Applet width: ");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, "Applet height: ");

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, "Instructions: ");

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setEditable(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setEditable(false);
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout jPanel10Layout = new org.jdesktop.layout.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel10Layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 217, Short.MAX_VALUE)
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel9)
                    .add(jPanel10Layout.createSequentialGroup()
                        .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 275, Short.MAX_VALUE)
                        .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextField6)
                            .add(jTextField7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                    .add(jPanel10Layout.createSequentialGroup()
                        .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(jLabel8))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 270, Short.MAX_VALUE)
                        .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextField5)
                            .add(jTextField4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel10Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("HTML Settings", jPanel10);

        org.openide.awt.Mnemonics.setLocalizedText(jButton1, "Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .add(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
    // TODO add your handling code here:
    if(jTextField5.getText().matches("^[0-9]+$")&&
            !jTextField5.getText().matches("^0+$")){ //Why should the applet have 0 as width?
        jTextField5.setBackground(Color.WHITE);
    }
    else{
        jTextField5.setBackground(Color.RED);
    }
}//GEN-LAST:event_jTextField5FocusLost

private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
    if(jTextField4.getText().matches("^[0-9]+$")&&
            !jTextField5.getText().matches("^0+$")){ //Why should the applet have 0 as width?
        jTextField4.setBackground(Color.WHITE);
    }
    else{
        jTextField4.setBackground(Color.RED);
    }
}//GEN-LAST:event_jTextField4FocusLost

private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
    Color newColor = JColorChooser.showDialog(
                     null,
                     "Choose Background Color",
                     jTextField7.getBackground());
    
    if (newColor != null)
        jTextField7.setBackground(newColor);
}//GEN-LAST:event_jTextField7MouseClicked

private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
    Color newColor = JColorChooser.showDialog(
                     null,
                     "Choose Text Color",
                     jTextField6.getBackground());
    
    if (newColor != null)
        jTextField6.setBackground(newColor);
}//GEN-LAST:event_jTextField6MouseClicked

private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseClicked
    // TODO add your handling code here:
    if(jCheckBox7.isSelected()){
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton5.setEnabled(true);
        jRadioButton6.setEnabled(true);
        jRadioButton7.setEnabled(true);
        jRadioButton8.setEnabled(true);
        jRadioButton9.setEnabled(true);
        jRadioButton10.setEnabled(true);
        jRadioButton11.setEnabled(true);
        jRadioButton12.setEnabled(true);
        jRadioButton13.setEnabled(true);
        jRadioButton14.setEnabled(true);
        jRadioButton15.setEnabled(true);
        jRadioButton16.setEnabled(true);
    } else{
        jRadioButton1.setEnabled(false);
        jRadioButton1.setSelected(true);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton4.setSelected(true);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jRadioButton8.setEnabled(false);
        jRadioButton9.setEnabled(false);
        jRadioButton10.setEnabled(false);
        jRadioButton11.setEnabled(false);
        jRadioButton11.setSelected(true);
        jRadioButton12.setEnabled(false);
        jRadioButton13.setEnabled(false);
        jRadioButton14.setEnabled(false);
        jRadioButton15.setEnabled(false);
        jRadioButton16.setEnabled(false);
    }
}//GEN-LAST:event_jCheckBox7MouseClicked

private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
    from = jList1.locationToIndex(evt.getPoint());
    
    if (evt.getButton() == evt.BUTTON3) {
        jList1.setSelectedIndex(jList1.locationToIndex(evt.getPoint()));
        final Point p = evt.getPoint();
        JPopupMenu popup = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Delete");
        menuItem.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Delete"))
                    roomz.remove(jList1.locationToIndex(p));
            }
            
            
        });
        popup.add(menuItem);
        popup.setVisible(true);
        popup.show(jList1, evt.getX(), evt.getY());
        //popup.setLocation(evt.getPoint());
    }
}//GEN-LAST:event_jList1MousePressed

private void jList1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseDragged
    int to  = jList1.locationToIndex(evt.getPoint());
    if (to == from) return;
    GMJRoomData s = (GMJRoomData)roomz.remove(from);
    roomz.add(to,s);
    from = to;
}//GEN-LAST:event_jList1MouseDragged

private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
    a.setModified(true);
}//GEN-LAST:event_jTabbedPane1MouseClicked
    
private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    savefile();
}//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup cdepth;
    private javax.swing.ButtonGroup frequency;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.ButtonGroup resolution;
    // End of variables declaration//GEN-END:variables
    
    
    public static SettingseditorTopComponent getInstance(String name,SettingsDataObject a) {
        //this.a = a;
        // look for an open instance containing this feed
        Iterator opened = TopComponent.getRegistry().getOpened().iterator();
        while (opened.hasNext()) {
            Object tc = opened.next();
            if (tc instanceof SettingseditorTopComponent) {
                SettingseditorTopComponent elc = (SettingseditorTopComponent)tc;
                System.out.println(name+" "+elc.path);
                if (name.equals(elc.path)) {
                    //elc.requestActive();
                    return elc;
                }
            }
        }
        
        // none found, make a new one
        return new SettingseditorTopComponent(a);
    }
    
    
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }
    
    public void componentOpened() {
        // TODO add custom code on component opening
    }
    
    public void componentClosed() {
        // TODO add custom code on component closing
    }
    
    //    /** replaces this in object stream */
    //    public Object writeReplace() {
    //        return new ResolvableHelper();
    //    }
    
    protected String preferredID() {
        return PREFERRED_ID;
    }
    
    //    final static class ResolvableHelper implements Serializable {
    //        private static final long serialVersionUID = 1L;
    //        public Object readResolve() {
    //            return SettingseditorTopComponent.getInstance(, a);
    //        }
    //    }
    
}

class SimpleCellRenderer extends JLabel implements ListCellRenderer {
    public SimpleCellRenderer() {
        setOpaque(true);
    }
    
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        GMJRoomData val = (GMJRoomData)value;
        setText(val.path);
        //setIcon(val.image);
        
        setBackground(isSelected ? Color.black : (index & 1) == 0 ? Color.white : Color.LIGHT_GRAY);
        setForeground(isSelected ? Color.white : Color.black);
        return this;
    }
    
    
}
