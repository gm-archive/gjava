/*
 * RoomEditor.java
 *
 * Created on 15 April 2007, 13:43
 */

package org.JGM.roomeditor;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.EditorKit;
import org.openide.filesystems.FileLock;
import org.openide.text.CloneableEditorSupport;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;

/**
 *
 * @author  ali1
 */
public class RoomEditor extends TopComponent {
    
    
public static RoomPanel canvas;

public String actor = "room";

public String creation_code="";

public String x;

public String y;

public String path;

public ImageIcon actorimg = new ImageIcon("");

public static GMJRoomDataObject data;

    public void paint(Graphics arg0) {
        super.paint(arg0);
        canvas.repaint();
    }

    protected void componentClosed() {
     
    }
    
    /** Creates new form RoomEditor */
    public RoomEditor(GMJRoomDataObject data) { {
        
       try         {
           canvas =  new RoomPanel(this);
           this.path = data.getPrimaryFile().getPath();
                this.data = data;
                initComponents();
                jScrollPane3.setViewportView(canvas);
                jScrollPane3.setBackground(java.awt.Color.black);
                openfile();
                setDropTarget(new java.awt.dnd.DropTarget(this,
                                                          new java.awt.dnd.DropTargetListener() {

                                                              public void dragEnter(java.awt.dnd.DropTargetDragEvent dropTargetDragEvent) {
                                                              }

                                                              public void dragExit(java.awt.dnd.DropTargetEvent dropTargetEvent) {
                                                              }

                                                              public void dragOver(java.awt.dnd.DropTargetDragEvent dtde) {
                                                                  if (dtde.isDataFlavorSupported(org.gjava.actoreditor.Utilz.ACTOR_DATA_FLAVOR)) {
                                                                      dtde.acceptDrag(java.awt.dnd.DnDConstants.ACTION_COPY_OR_MOVE);
                                                                  } else {
                                                                      dtde.rejectDrag();
                                                                  }
                                                              }

                                                              public void drop(java.awt.dnd.DropTargetDropEvent dtde) {
                                                                  if (!dtde.isDataFlavorSupported(org.gjava.actoreditor.Utilz.ACTOR_DATA_FLAVOR)) {
                                                                      dtde.rejectDrop();
                                                                  }
                                                                  dtde.acceptDrop(java.awt.dnd.DnDConstants.ACTION_COPY_OR_MOVE);
                                                                  org.gjava.actoreditor.actorData data = null;

                                                                  try {
                                                                      data = (org.gjava.actoreditor.actorData) dtde.getTransferable().getTransferData(org.gjava.actoreditor.Utilz.ACTOR_DATA_FLAVOR);
                                                                  }
                                                                  catch (java.io.IOException ex) {
                                                                      ex.printStackTrace();
                                                                  }
                                                                  catch (java.awt.datatransfer.UnsupportedFlavorException ex) {
                                                                      ex.printStackTrace();
                                                                  }
                                                                  dtde.dropComplete(null !=
                                                                                    data);
                                                                  if (null !=
                                                                      data) {
                                                                  }
                                                                  if (data.img ==
                                                                      null) {
                                                                      java.lang.System.out.println("obj.pmng");
                                                                      jLabel2.setText(data.name);
                                                                  } else {
                                                                      jLabel2.setIcon(new javax.swing.ImageIcon(data.img));
                                                                      jLabel2.setText(data.name);
                                                                      actor = data.name;
                                                                      actorimg = new javax.swing.ImageIcon(data.img);
                                                                      java.lang.System.out.println(data.img);
                                                                  }
                                                              }

                                                              public void dropActionChanged(java.awt.dnd.DropTargetDragEvent dropTargetDragEvent) {
                                                              }
                                                          }));
            }
            catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
}}
    
    public void openfile()
    throws IOException {
   
    BufferedReader from=new BufferedReader(new InputStreamReader(data.getPrimaryFile().getInputStream()));
    try
    {
        String line;
        while ((line=from.readLine()) != null)
        {
            
            if (line.contains("<Caption>") && line.contains("</Caption>"))
                {
                   this.jTextField1.setText(line.replaceAll("<Caption>", "").replaceAll("</Caption>", ""));
                }
            
            if (line.contains("<Width>") && line.contains("</Width>"))
                {
                  jTextField2.setText(line.replaceAll("<Width>", "").replaceAll("</Width>", ""));
                }
            
            if (line.contains("<Height>") && line.contains("</Height>"))
                {
                  jTextField3.setText(line.replaceAll("<Height>", "").replaceAll("</Height>", ""));
                }
            
            if (line.contains("<Speed>") && line.contains("</Speed>"))
                {
                  jTextField4.setText(line.replaceAll("<Speed>", "").replaceAll("</Speed>", ""));
                }
            
            if (line.contains("<BcolorR>") && line.contains("</BcolorR>"))
                {
                    jTextField7.setBackground(new Color(Integer.parseInt(line.replaceAll("<BcolorR>", "").replaceAll("</BcolorR>", "")),jTextField7.getBackground().getGreen(),jTextField7.getBackground().getBlue()));
                }
            
            if (line.contains("<BcolorG>") && line.contains("</BcolorG>"))
                {
                    jTextField7.setBackground(new Color(jTextField7.getBackground().getRed(),Integer.parseInt(line.replaceAll("<BcolorG>", "").replaceAll("</BcolorG>", "")),jTextField7.getBackground().getBlue()));
                }
            
            if (line.contains("<BcolorB>") && line.contains("</BcolorB>"))
                {
                    jTextField7.setBackground(new Color(jTextField7.getBackground().getRed(),jTextField7.getBackground().getGreen(),Integer.parseInt(line.replaceAll("<BcolorB>", "").replaceAll("</BcolorB>", ""))));
                }
            
            if (line.contains("<Drawbackgroundcolor>") && line.contains("</Drawbackgroundcolor>"))
            {
                if (line.contains("True") )
                    
                    jCheckBox3.setSelected(true);
                
                else
                    jCheckBox3.setSelected(false);
            }
            
            if (line.contains("<SnapX>") && line.contains("</SnapX>"))
            {
               line = line.replaceAll("<SnapX>", "").replaceAll("</SnapX>", "");
               if (!line.equals("null") )
                   jTextField5.setText(line);;
            }
            
            if (line.contains("<SnapY>") && line.contains("</SnapY>"))
            {
                line = line.replaceAll("<SnapY>", "").replaceAll("</SnapY>", "");
               if (!line.equals("null") )
                   jTextField6.setText(line);;
            }
            if (line.contains("<Showgrid>") && line.contains("</Showgrid>"))
            {
                if (line.contains("True") )
                    
                    jCheckBox2.setSelected(true);
                
                else
                    jCheckBox2.setSelected(false);
            }
            
            if (line.equals("<Instance>"))
            {
                line=from.readLine();
                String name="",img="",code="";
                if (line.contains("<Name>") && line.contains("</Name>"))
                {
                    name = line.replaceAll("<Name>", "").replaceAll("</Name>", "");
                }
                line=from.readLine();
                if (line.contains("<Image>") && line.contains("</Image>"))
                {
                    img = line.replaceAll("<Image>", "").replaceAll("</Image>", "");
                    
                }
                
                line=from.readLine();
                if (line.contains("<X>") && line.contains("</X>"))
                {
                    x = line.replaceAll("<X>", "").replaceAll("</X>", "");
                    
                }
                
                line=from.readLine();
                if (line.contains("<Y>") && line.contains("</Y>"))
                {
                    y = line.replaceAll("<Y>", "").replaceAll("</Y>", "");
                    
                }
                
                line=from.readLine();
                canvas.instances.add(new instance(Integer.parseInt(x),Integer.parseInt(y),name,new ImageIcon(img)));
   
                   
            }
           
        }
    }
    finally
    {
        from.close();
    }
}

    
    public void savefile()
    {
    FileLock lock;
    try
    {
        lock= data.getPrimaryFile().lock();
    }
    catch (Exception e)
    {
        return;
    }
    {
        java.io.PrintWriter to = null;
        
        try
        {
            to = new java.io.PrintWriter(data.getPrimaryFile().getOutputStream(lock));
            try
            {
                to.println("<?xml version=\"1.0\"?>");
                
                to.println("<Caption>"+this.jTextField1.getText()+"</Caption>");
                to.println("<Width>"+this.jTextField2.getText()+"</Width>");
                to.println("<Height>"+this.jTextField3.getText()+"</Height>");
                if (RoomPanel.isNumeric(this.jTextField4.getText()))
                to.println("<Speed>"+this.jTextField4.getText()+"</Speed>");
                else {
                    to.println("<Speed>30</Speed>");
                    JOptionPane.showMessageDialog(null, "Speed is not a number!");
                }
                to.println("<BcolorR>"+this.jTextField7.getBackground().getRed()+"</BcolorR>");
                to.println("<BcolorG>"+this.jTextField7.getBackground().getGreen()+"</BcolorG>");
                to.println("<BcolorB>"+this.jTextField7.getBackground().getBlue()+"</BcolorB>");
                
                if (jCheckBox3.isSelected() == true)
                    to.println("<Drawbackgroundcolor>True</Drawbackgroundcolor>");
                else
                    to.println("<Drawbackgroundcolor>False</Drawbackgroundcolor>");
                
                if (RoomPanel.isNumeric(jTextField5.getText()))
                    to.println("<SnapX>"+jTextField5.getText()+"</SnapX>");
                else
                {
                    JOptionPane.showMessageDialog(null, "Only numbers allowed in SnapX!");
                    to.println("<SnapX>16</SnapX>");
                }
                    
                 if (RoomPanel.isNumeric(jTextField6.getText()))
                    to.println("<SnapY>"+jTextField6.getText()+"</SnapY>");
                else
                {
                    JOptionPane.showMessageDialog(null, "Only numbers allowed in SnapY!");
                    to.println("<SnapY>16</SnapY>");
                }   
                
                if (jCheckBox2.isSelected() == true)
                    to.println("<Showgrid>True</Showgrid>");
                else
                    to.println("<Showgrid>False</Showgrid>");
                
                             
               
                
                //save events/actions
                for (Enumeration e = canvas.instances.elements() ; e.hasMoreElements() ;)
                {
                    instance v = (instance)e.nextElement();
                    to.println("<Instance>");
                    to.println("<Name>"+v.actor+"</Name>");
                    to.println("<Image>"+v.img+"</Image>");
                    to.println("<X>"+v.x+"</X>");
                    to.println("<Y>"+v.y+"</Y>");
                    to.println("</Instance>");
                }
            }
            finally
            {
                to.close();
            }
        }
        catch (IOException ex)
        {
            Exceptions.printStackTrace(ex);
        }
        finally
        {
            lock.releaseLock();
            to.close();
        }
    }
    
}

    
    /**
     * returns an instance of RoomEditor with the path specified.
     * @param name 
     * @param data 
     * @return 
     */
    public static RoomEditor getInstance(String name,GMJRoomDataObject data) {
        // look for an open instance containing this feed
        Iterator opened = TopComponent.getRegistry().getOpened().iterator();
        while (opened.hasNext()) {
            Object tc = opened.next();
            if (tc instanceof RoomEditor) {
                RoomEditor elc = (RoomEditor)tc;
                if (name.equals(elc.path)) {
                    elc.requestActive();
                    return elc;
                }
            }
        }
        // none found, make a new one
        return new RoomEditor(data);
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        topComponent1 = new org.openide.windows.TopComponent();
        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();

        jSplitPane1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jSplitPane1MouseWheelMoved(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel2.text")); // NOI18N
        jScrollPane2.setViewportView(jLabel2);

        jCheckBox1.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jCheckBox1.text")); // NOI18N
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel1.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel1.text")); // NOI18N

        jLabel9.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel9.text")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jCheckBox1)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .add(12, 12, 12))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel9)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 435, Short.MAX_VALUE)
                .add(jCheckBox1)
                .addContainerGap())
        );

        jTabbedPane2.addTab(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel3.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField1.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel4.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel5.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField2.text")); // NOI18N

        jTextField3.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField3.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel6.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField4.text")); // NOI18N

        jButton1.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jButton1.text")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .add(jLabel3)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jLabel4)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .add(jTextField3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .add(jTextField4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36)
                .add(jButton1)
                .addContainerGap(486, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        jCheckBox3.setSelected(true);
        jCheckBox3.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jCheckBox3.text")); // NOI18N
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel10.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel10.text")); // NOI18N

        jTextField7.setBackground(java.awt.Color.lightGray);
        jTextField7.setEditable(false);
        jTextField7.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField7.text")); // NOI18N
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jCheckBox3)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel10)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jCheckBox3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(659, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jSplitPane1.setLeftComponent(jTabbedPane2);
        jSplitPane1.setRightComponent(jScrollPane3);

        jTextField6.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField6.text")); // NOI18N

        jLabel8.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel8.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jTextField5.text")); // NOI18N

        jLabel7.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jLabel7.text")); // NOI18N

        jButton3.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jButton3.text")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton2.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jButton2.text")); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jCheckBox2.setText(org.openide.util.NbBundle.getMessage(RoomEditor.class, "RoomEditor.jCheckBox2.text")); // NOI18N
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton2)
                .add(14, 14, 14)
                .add(jButton3)
                .add(41, 41, 41)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(jCheckBox2)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jButton2)
                .add(jButton3)
                .add(jLabel7)
                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLabel8)
                .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jCheckBox2))
        );

        org.jdesktop.layout.GroupLayout topComponent1Layout = new org.jdesktop.layout.GroupLayout(topComponent1);
        topComponent1.setLayout(topComponent1Layout);
        topComponent1Layout.setHorizontalGroup(
            topComponent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topComponent1Layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(829, Short.MAX_VALUE))
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1517, Short.MAX_VALUE)
        );
        topComponent1Layout.setVerticalGroup(
            topComponent1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topComponent1Layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topComponent1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topComponent1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    EditorKit kit = CloneableEditorSupport.getEditorKit("text/x-java");

JEditorPane jep = new JEditorPane();
jep.setEditorKit(kit);
JFrame frame = new JFrame("Creation Code");
frame.add(jep);
frame.setSize(640, 480);
frame.setVisible(true);
creation_code = jep.getText();

}//GEN-LAST:event_jButton1MouseClicked

private void jSplitPane1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jSplitPane1MouseWheelMoved
    // TODO add your handling code here:
}//GEN-LAST:event_jSplitPane1MouseWheelMoved

private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
    // Show color chooser
    Color newColor = JColorChooser.showDialog(
                     null,
                     "Choose Background Color",
                     jTextField7.getBackground());
    
    if (newColor != null)
        jTextField7.setBackground(newColor);
}//GEN-LAST:event_jTextField7MouseClicked

private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    canvas.instances = new Vector();
}//GEN-LAST:event_jButton3MouseClicked

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    try     {
            savefile();
            data.setModified(false);
            data.writejava();
        }
        catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
}//GEN-LAST:event_jButton2MouseClicked


/**
 * Used to stop errors occuring from generated code, Don't use!
 */
public void pack()
    {     
    }
    
    public Container getContentPane()
    {
        return this;
    }
    
    private void setDefaultCloseOperation(int i)
    {
        
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new RoomEditor().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    private org.openide.windows.TopComponent topComponent1;
    // End of variables declaration//GEN-END:variables
    
}
