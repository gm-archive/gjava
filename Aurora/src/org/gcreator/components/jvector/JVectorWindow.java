/*
 * JVectorWindow.java
 *
 * Created on May 10, 2008, 9:47 PM
 */

package org.gcreator.components.jvector;

import java.io.FileNotFoundException;
import org.gcreator.components.jvector.shapes.JRoundRectangle;
import org.gcreator.components.jvector.shapes.JRectangle;
import org.gcreator.components.jvector.shapes.JLine;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.AbstractListModel;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.TransferHandler;
import org.gcreator.components.jvector.shapes.JEllipse;
import org.gcreator.editors.ImageEditor2;

/**
 *
 * @author  bob
 */
public class JVectorWindow extends javax.swing.JFrame {
    
    public ArrayList<JVectorable> shapes = new ArrayList<JVectorable>(12);
    public JPanel shapePanel;
    public JVectorable selectedShape;
    public int selectedPointIndex = -1;
    public Point dragOffset;
    private static JVectorWindow currentInstance;
    public JVectorable creatingShape;
    private File saveFile = null;
    private ImageEditor2 editor;
    
    /** Creates new form JVectorWindow */
    public JVectorWindow(ImageEditor2 imgeditor) {
        currentInstance = this;
        this.editor = imgeditor;
        setEnabled(editor, false);
        initComponents();
        this.setAlwaysOnTop(true);
        shapeList.setDragEnabled(true);
        /*
         * This code has been 'borrowed' from the Java tutorial
         * P.S. I didn't read their lisence agreement.
         * (I didn't read the tutorial either.)
         */
        shapeList.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        shapeList.setDropMode(DropMode.ON_OR_INSERT);
        shapeList.setTransferHandler(new TransferHandler() {
            @Override
            public boolean canImport(TransferHandler.TransferSupport info) {
                // we only import Strings
                if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    return false;
                }

                JList.DropLocation dl = (JList.DropLocation)info.getDropLocation();
                if (dl.getIndex() == -1) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean importData(TransferHandler.TransferSupport info) {
                
                if (!info.isDrop()) {
                    System.out.println("!isdrop");
                    return false;
                }
                
                // Check for String flavor
                if (!info.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    return false;
                }
                
                JList.DropLocation dl = (JList.DropLocation)info.getDropLocation();
                
                int index = dl.getIndex();
                Transferable t = info.getTransferable();
                String data;
                try {
                    data = (String)t.getTransferData(DataFlavor.stringFlavor);
                } 
                catch (Exception e) { 
                    System.out.println("Exception!");
                    return false; 
                }
                JVectorable v = null;
                for (JVectorable s : shapes) {
                    if (s.toString().equals(data)) {
                        v = s;
                        break;
                    }
                }
                if (v != null) {
                    shapes.remove(v);
                    shapes.add(Math.min(shapes.size(),index), v);
                    shapePanel.repaint();
                    shapeList.updateUI();
                }
                return true;
            }
            
            @Override
            public int getSourceActions(JComponent c) {
                return COPY;
            }
            
            @Override
            protected Transferable createTransferable(JComponent c) {
                JList shapeList = (JList)c;
                Object[] values = shapeList.getSelectedValues();
        
                StringBuffer buff = new StringBuffer();

                for (int i = 0; i < values.length; i++) {
                    Object val = values[i];
                    buff.append(val == null ? "" : val.toString());
                    if (i != values.length - 1) {
                        buff.append("\n");
                    }
                }
                return new StringSelection(buff.toString());
            }
        });
        
        shapePanel = new JPanel(true) {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                super.paint(g);
                if (editor.i.image != null)
                    g2.drawImage(editor.i.image.getImage(), 0,0, editor.i.image.getImageObserver());
                
                g2.setColor(Color.BLACK);
                for (JVectorable s : shapes) {
                    s.paint(g2);
                    for (int i = 0; i < s.getPoints().length; i++) {
                        if (s == selectedShape && i == selectedPointIndex)
                            continue;
                        Point p = s.getPoints()[i];
                        g2.setColor(Color.black);
                        g2.fillOval(p.x-4, p.y-4, 8, 8);
                    }
                }
                if (selectedShape != null && selectedPointIndex >= 0) {
                     Point p = selectedShape.getPoints()[selectedPointIndex];
                        g2.setColor(Color.red);
                        g2.fillOval(p.x-4, p.y-4, 8, 8);
                }
                if (creatingShape != null) {
                    creatingShape.paint(g2);
                }
            }
        };
        shapePanel.setBackground(Color.white);
        shapePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (selectedShape != null)
                    selectedShape.callSelected(false);
                shapeList.setSelectedIndex(-1);
                selectedShape = null;
                dragOffset = null;
                for (int q = shapes.size()-1; q >= 0; q--) {
                    JVectorable v = shapes.get(q);
                   if (v.intersects(e.getPoint())) {
                       selectedShape = v;
                       selectedPointIndex = -1;
                       generalSettings.setShape(selectedShape);
                       layerEditor.setShape(selectedShape);
                       v.callSelected(true);
                       shapeList.setSelectedValue(v, true);
                       repaint();
                       return;
                   }
                   for (int i = 0; i < v.getPoints().length; i++) {
                       Point p = v.getPoints()[i];
                       if (Math.abs(e.getX()-p.x) <= 4 && Math.abs(e.getY()-p.y) <= 4) {
                           selectedShape = v;
                           selectedPointIndex = i;
                           generalSettings.setShape(selectedShape);
                           layerEditor.setShape(selectedShape);
                           v.callSelected(true);
                           shapeList.setSelectedValue(v, true);
                           repaint();
                           return;
                       }
                   }
                }
                
                creatingShape = ShapeTool.createShape(e.getX(), e.getY(), 2,2);
                generalSettings.setShape(creatingShape);
                layerEditor.setShape(creatingShape);
                repaint();
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (creatingShape != null) {
                    String css = creatingShape.toString().replaceAll("(\\w+)\\W*[0-9]+", "$1");
                    int occur = -1;
                    for (JVectorable v : shapes) {
                        if (v.toString().replaceAll("(\\w+)\\W*[0-9]+", "$1").equals(css))
                            occur++;
                    }
                    creatingShape.setN(++occur);
                    shapes.add(creatingShape);
                    generalSettings.setShape(creatingShape);
                    shapeList.updateUI();
                    creatingShape = null;
                }
            }
        });
        shapePanel.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                if (selectedShape == null && creatingShape == null)
                    return;
                if (creatingShape != null) {
                    creatingShape.setSize(e.getX()-creatingShape.getX(), e.getY()-creatingShape.getY());
                    creatingShape.ensureProperties();
                    shapePanel.repaint();
                    return;
                }
                if (selectedPointIndex >= 0) {
                    selectedShape.setPoint(selectedPointIndex, e.getPoint());
                    if (!selectedShape.allowsNegativeSize()) {
                        selectedShape.setWidth(
                            Math.max(0,selectedShape.getWidth()+Math.min(0, selectedShape.getX())));
                        selectedShape.setHeight(
                            Math.max(0,selectedShape.getHeight()+Math.min(0, selectedShape.getY())));
                    } else {
                        selectedShape.setWidth(
                           selectedShape.getWidth()+Math.min(0, selectedShape.getX()));
                        selectedShape.setHeight(
                            selectedShape.getHeight()+Math.min(0, selectedShape.getY()));
                    }
                } else {
                    if (dragOffset == null) {
                                dragOffset = new Point((int)(e.getX()-selectedShape.getX()),
                                (int)(e.getY()-selectedShape.getY()));
                    }
                    selectedShape.setLocation(e.getX()-dragOffset.x, e.getY()-dragOffset.y);
                }
                
                selectedShape.setLocation((int)Math.max(0, selectedShape.getX()),
                        (int)Math.max(0, selectedShape.getY()));
                shapeSizeChanged();
                repaint();
            }
        });
        jScrollPane1.setViewportView(shapePanel);
       
        /*
        shapes.add(new JRoundRectangle(10,10,250,250,30,30));
        shapes.add(new JRectangle(6,6,120,120));
        shapes.add(new JLine(6,6,120,120));
        shapes.add(new JEllipse(6,6,120,120));
        shapeList.updateUI();
        */
        this.setVisible(true);
    }
    
    private void setEnabled(Component c, boolean b) {
        c.setEnabled(b);
        if (c instanceof Container) {
            for (Component comp : ((Container)c).getComponents()) {
                comp.setEnabled(b);
                if (comp instanceof Container)
                    setEnabled(comp, b);
            }
        }
    }
    public static JVectorWindow getInstance() {
        return currentInstance;
    }
    
    public void shapeSizeChanged() {
        Dimension size = null;
        if (editor.i.image != null)
            size = new Dimension(editor.i.image.getIconWidth(), editor.i.image.getIconHeight());
        else
            size = new Dimension();
        for (JVectorable j : shapes) {
            size.width = (int) Math.max(size.width, j.getMaximumX()+25);// add 25 pixels of freedom space 
            size.height = (int) Math.max(size.height, j.getMaximumY()+25);//^for things like very fat strokes.
        }
        shapePanel.setSize(size);
        shapePanel.setMinimumSize(size);
        shapePanel.setPreferredSize(size);
        generalSettings.updateValues();
    }

    
    public void Save(File file) throws FileNotFoundException {   
       /* ObjectOutputStream os = null;
        ZipOutputStream zip = null;
        try {
            zip = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            zip.setLevel(Deflater.BEST_COMPRESSION);
            zip.putNextEntry(new ZipEntry("Bob the blueberry"));
            
            os = new ObjectOutputStream(zip);
        } catch (IOException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (os == null) {
            System.err.println("Save terminated!");
            return;
        }
        try {
            os.writeObject(this.shapes);
        } catch (IOException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           try {
                os.close();
           } catch (IOException ex) {
                Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
           }
        }*/
    }
    
    public void Load(File file) throws FileNotFoundException {
       /* if (file == null)
            throw new FileNotFoundException("Argument given is null!");
        ObjectInputStream os = null;
        try {
            os = new ObjectInputStream(new ZipInputStream(new BufferedInputStream(new FileInputStream(file))));
        } catch (IOException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
           try {
                os.close();
           } catch (IOException ex) {
                Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        if (os == null) {
            System.err.println("Load terminated!");
            return;
        }
        try {
            this.shapes = (ArrayList<JVectorable>) os.readObject();
        } catch (IOException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.validate();*/
    }
    
    private void resetShapeNumbers() {
        Hashtable<String, Integer> table = new Hashtable<String, Integer>(shapes.size()/2);
        for (JVectorable v : shapes) {
            String s = v.toString().replaceAll("(.+)\\W*[0-9]+","$1");
            if (table.containsKey(s)) {
                table.put(s, table.get(s).intValue()+1);
            } else {
                table.put(s, 0);
            }
            v.setN(table.get(s).intValue());
        }
    }
            
    private static final class ShapeTool {
        /**
        * Don't let anyone instantiate this class.
        */
        private ShapeTool() {}
        
        private static String toolName = "rec";
        
        public static void setTool(String name) {
            toolName = name;
        }
        public static String getTool() {
            return toolName;
        }
        
        public static JVectorable createShape(int x, int y, int width, int height) {
            JVectorable v = null;
            if (toolName.contains("round") && toolName.contains("rec"))
                v = new JRoundRectangle(x, y, width, height, 30, 30);
            else if (toolName.contains("rec"))
                v = new JRectangle(x, y, width, height);
            else if (toolName.contains("cir") || toolName.contains("elli"))
                v = new JEllipse(x, y, width, height);
            else if (toolName.contains("line"))
                v = new JLine(x, y, width, height);
            return v;
        }
    }
    
    private class ShapeListModel extends AbstractListModel {

        public int getSize() {
            return shapes.size();
        }

        public Object getElementAt(int index) {
            return shapes.get(index);
        }
        
    }
    @Override
    public void dispose() {
        setEnabled(editor.getRootPane(), true);
        super.dispose();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        generalSettings = new org.gcreator.components.jvector.GeneralShapeSettings();
        layerEditor = new org.gcreator.components.jvector.JVectorLayerEditor();
        jScrollPane2 = new javax.swing.JScrollPane();
        shapeList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JVector 0.6");
        setAlwaysOnTop(true);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("Rectangle");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Round Rectangle");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton2);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Line");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton3);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("Ellipse");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton4);

        jSplitPane1.setDividerLocation(244);
        jSplitPane1.setContinuousLayout(true);
        jSplitPane1.setRightComponent(jScrollPane1);

        jPanel1.setMinimumSize(new java.awt.Dimension(1, 1));

        jTabbedPane1.addTab("General", generalSettings);
        jTabbedPane1.addTab("Layers", layerEditor);

        shapeList.setModel(new ShapeListModel());
        shapeList.setDragEnabled(true);
        shapeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shapeListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(shapeList);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Load");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save As");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shapeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shapeListValueChanged
        if ((JVectorable) shapeList.getSelectedValue() == selectedShape)
            return;
        if (selectedShape != null) {
            selectedShape.callSelected(false);
        }
        selectedPointIndex = -1;
        selectedShape = (JVectorable) shapeList.getSelectedValue();
        selectedShape.callSelected(true);
        generalSettings.setShape(selectedShape);
        layerEditor.setShape(selectedShape);
}//GEN-LAST:event_shapeListValueChanged

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        ShapeTool.setTool("roundrec");
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        ShapeTool.setTool("rec");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        ShapeTool.setTool("line");
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        ShapeTool.setTool("ellipse");
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new AboutJVectorDialog(this, true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        /*sif (saveFile == null) {
            JFileChooser c = new JFileChooser();
            c.setFileFilter(new FileNameExtensionFilter("Crappy JVector File", "cjv"));
            c.showOpenDialog(this);
            saveFile = c.getSelectedFile();
            if (saveFile == null) {
                return;
            }
        }
        saveFile.renameTo(new File(saveFile.getPath()+saveFile.getName().replaceAll("(.+)\\.*", "$1")+".cjv"));
        try {
            if (!saveFile.exists())
                saveFile.createNewFile();
            Save(saveFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        /*
        if (saveFile == null) {
            JFileChooser c = new JFileChooser();
            c.setFileFilter(new FileNameExtensionFilter("Crappy JVector File", "cjv"));
            c.showOpenDialog(this);
            saveFile = c.getSelectedFile();
            if (saveFile == null) {
                return;
            }
        }
        try {
            Load(saveFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        /*JFileChooser c;
        if (saveFile == null) {
            c = new JFileChooser();
        } else {
            c = new JFileChooser(saveFile);
        }
        c.setFileFilter(new FileNameExtensionFilter("Crappy JVector File", "cjv"));
        c.showOpenDialog(this);
        saveFile = c.getSelectedFile();
        if (saveFile == null) {
            return;
        }
        saveFile.renameTo(new File(saveFile.getPath()+saveFile.getName().replaceAll("(.+)\\.*", "$1")+".cjv"));
        try {
            Save(saveFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JVectorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (shapeList.getSelectedIndex() < 0)
            return;
        int option = JOptionPane.showConfirmDialog(this, "Do you really want to delete this shape?");
        if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.NO_OPTION)
            return;
        shapes.remove(shapeList.getSelectedIndex());
        resetShapeNumbers();
        if (shapeList.getSelectedIndex() >= shapes.size())
            shapeList.setSelectedIndex(shapeList.getSelectedIndex()-1);
        shapeList.updateUI();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BufferedImage bufImg = new BufferedImage(shapePanel.getMinimumSize().width,
                 shapePanel.getMinimumSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bufImg.createGraphics();
        if (editor.i.image != null)
            g.drawImage(editor.i.image.getImage(), 0,0, editor.i.image.getImageObserver());
        g.setColor(Color.BLACK);
        for (JVectorable s : shapes) {
           s.paint(g);
        }
        editor.i.image = new ImageIcon(bufImg);
        editor.pane.updateUI();
        editor.pane.repaint();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /*//*
     * @param args the command line arguments
     *
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVectorWindow().setVisible(true);
            }
        });
    }
    */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.gcreator.components.jvector.GeneralShapeSettings generalSettings;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToolBar jToolBar1;
    private org.gcreator.components.jvector.JVectorLayerEditor layerEditor;
    public javax.swing.JList shapeList;
    // End of variables declaration//GEN-END:variables
    
}
