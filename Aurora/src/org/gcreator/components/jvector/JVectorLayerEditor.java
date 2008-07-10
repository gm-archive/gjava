/*
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.jvector;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Window;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author  bob
 */
public class JVectorLayerEditor extends javax.swing.JPanel {
    private JVectorable shape;
    private  LayerEditorListModel listModel = new LayerEditorListModel();
    private PaintInfo[] avaliblePaint = new PaintInfo[] {
            new PaintInfo(Color.BLACK,"Black"),
            new PaintInfo(Color.BLUE,"Blue"),
            new PaintInfo(Color.CYAN,"Cyan"),
            new PaintInfo(Color.DARK_GRAY,"Dark Gray"),
            new PaintInfo(Color.GRAY,"Gray"),
            new PaintInfo(Color.GREEN,"Green"),
            new PaintInfo(Color.LIGHT_GRAY,"Light Gray"),
            new PaintInfo(Color.MAGENTA,"Magenta"),
            new PaintInfo(Color.ORANGE,"Orange"),
            new PaintInfo(Color.PINK,"Pink"), 
            new PaintInfo(Color.RED,"Red"),
            new PaintInfo(Color.WHITE,"White"),
            new PaintInfo(Color.YELLOW,"Yellow"),
            new PaintInfo(Color.BLACK,"Custom")};
    
    private CompositeInfo alphaComposites[] = new CompositeInfo[] {
        new CompositeInfo(AlphaComposite.SRC_OVER, "Source Over"),
        new CompositeInfo(AlphaComposite.SRC, "Source"),
        new CompositeInfo(AlphaComposite.SRC_IN, "Source In"),
        new CompositeInfo(AlphaComposite.SRC_OUT, "Source Out"),
        new CompositeInfo(AlphaComposite.DST_OVER, "Destination Over"),
        new CompositeInfo(AlphaComposite.DST, "Destination"),
        new CompositeInfo(AlphaComposite.DST_IN, "Destination In"),
        new CompositeInfo(AlphaComposite.DST_OUT, "Destination Out"),
        new CompositeInfo(AlphaComposite.DST_OVER, "Destination Over"),
        new CompositeInfo(AlphaComposite.XOR, "XOR"),
        new CompositeInfo(AlphaComposite.CLEAR, "Clear")
    };
    /** Creates new form JVectorLayerEditor */
    public JVectorLayerEditor() {
        initComponents();
        setEnabled(false);
    }
    
    public void setShape(JVectorable shape) {
        this.shape = shape;
        if (shape != null) {
            this.setEnabled(true);
        } else {
            this.setEnabled(false);
        }
        
        jList1.updateUI();
        jList1.setSelectedIndex(Math.max(jList1.getSelectedIndex()-1,0));
        
        if (shape != null) {
            BasicStroke s = (BasicStroke)(getCurrentLayer().stroke);
            jSpinner1.setValue(new Float(s.getLineWidth()));
            jComboBox2.setSelectedIndex(s.getEndCap());
            jComboBox3.setSelectedIndex(s.getLineJoin());
            jSpinner2.setValue(new Float(
                    ((AlphaComposite)getCurrentLayer().composite).getAlpha()));
            jSpinner3.setValue(new Float(s.getMiterLimit()));
            
            for (int i = 0; i < jComboBox4.getItemCount(); i++) {
                CompositeInfo c = (JVectorLayerEditor.CompositeInfo) jComboBox4.getItemAt(i);
                int wantedInt = ((AlphaComposite)getCurrentLayer().composite).getRule();
                if (c.numb == wantedInt) {
                    jComboBox4.setSelectedIndex(i);
                    break;
                }
            }
            if (shape.getLayers().size() <= 1)
                jButton3.setEnabled(false);
            else
                jButton3.setEnabled(true);
            jList1.updateUI();
            if (jComboBox1.getSelectedIndex() == jComboBox1.getItemCount()-1) {
            jButton1.setVisible(true);
            ((PaintInfo)jComboBox1.getSelectedItem()).setPaint(
                    getCurrentLayer().paint);
            ((SimpleMutableIcon)(jButton1.getIcon())).paint = 
                    getCurrentLayer().paint;
        } else {
            jButton1.setVisible(false);
        }
         jComboBox1.setSelectedItem(getCurrentLayer().paint);
        }
    }
    
    public JVectorable getShape() {
        return shape;
    }
    
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (Component c : getComponents()) {
            setEnabled(enabled, c);
        }
    }
    
    private void setEnabled(boolean b, Component comp) {
        comp.setEnabled(b);
        if (comp instanceof Container) {
            for (Component c : ((Container)comp).getComponents()) {
                setEnabled(b, c);
            }
        }
    }
    
    private ComboBoxModel getAvaliblePaint() {
        return new DefaultComboBoxModel(avaliblePaint);
    }
    private ComboBoxModel getAlphaComposites() {
        return new DefaultComboBoxModel(alphaComposites);
    }
    
    private JVectorLayer getCurrentLayer() {
        if (shape == null)
            return null;
        return shape.getLayers().get(jList1.getSelectedIndex());
    }
    
    private final class LayerEditorListModel extends AbstractListModel {
        
        public int getSize() {
            if (shape == null)
                return 0;
            return shape.getLayers().size();
        }
        
        public Object getElementAt(int index) {
                return shape.getLayers().elementAt(index);
        }        
    }
    
    private final class PaintInfo {
        private Paint paint;
        private final String description;
        
        public PaintInfo(Paint p, String s) {
            paint = p;
            description = s;
        }
        
        @Override
        public String toString() {
            return description;
        }
        
        public Paint getPaint() {
            return paint;
        }
        public String getDescription() {
            return description;
        }
        public void setPaint(Paint p) {
            this.paint = p;
        }
        @Override
        public boolean equals(Object o) {
            if (o == null)
                return false;
            if (!(o  instanceof PaintInfo || o instanceof Paint))
                return false;
            if (o instanceof PaintInfo) {
                return (this.hashCode() == o.hashCode());
            } else {
                if (o instanceof Color && this.paint instanceof Color) {
                    return o.equals((Color)this.paint);
                } else {
                    return false;
                }
            }
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 53 * hash + (this.paint != null ? this.paint.hashCode() : 0);
            hash = 53 * hash + (this.description != null ? this.description.hashCode() : 0);
            return hash;
        }
    }
    
    private final class LayerEditorComboBoxCellRenderer extends DefaultListCellRenderer {
        
        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index,boolean isSelected,boolean cellHasFocus) {
            JLabel l = (JLabel) super.getListCellRendererComponent
                        (list, value, index, isSelected, cellHasFocus);
            if (value instanceof PaintInfo) {
                l.setIcon(new SimpleMutableIcon(((PaintInfo)value).getPaint()));
            }
            return l;
        }
        
    }
    
    private final class SimpleMutableIcon implements Icon {
        private int width = 10, height = 10;
        public Paint paint;
        
        public SimpleMutableIcon(Paint p) {
            this.paint = p;
        }
        public SimpleMutableIcon(Paint p, int w, int h) {
            this.paint = p;
            this.width = w;
            this.height = h;
        }
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D)g.create();
            g2.setPaint(paint);
            g2.fillRect(x, y, width, height);
            g2.setColor(Color.BLACK);
            g2.drawRect(x, y, width, height);
        }
        public int getIconWidth() {
            return width; 
        }
        public int getIconHeight() {
            return height;
        }
    }
    
    private class CompositeInfo {
        public String description;
        public int numb;
        
        public CompositeInfo(int numb, String description) {
            this.numb = numb;
            this.description = description;
        }
        @Override
        public String toString() {
            return description;
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Integer) {
                return (((Integer)o).intValue() == numb);
            } else
                return (o != null && o.getClass() == this.getClass() && this.hashCode() == o.hashCode());
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 83 * hash + (this.description != null ? this.description.hashCode() : 0);
            hash = 83 * hash + this.numb;
            return hash;
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        jList1.setModel(listModel);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Type"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Filled");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Stroked");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new SimpleMutableIcon(Color.BLACK));
        jButton1.setText("Choose Color");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(getAvaliblePaint());
        jComboBox1.setRenderer(new LayerEditorComboBoxCellRenderer());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Paint:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Color", jPanel2);

        jLabel2.setText("Size:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(2.0f), Float.valueOf(0.0f), null, Float.valueOf(0.25f)));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Butt", "Round", "Square" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Miter", "Round", "Bevel" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Joint:");

        jLabel3.setText("Cap:");

        jLabel7.setText("Miter Limit:");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), null, Float.valueOf(0.5f)));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, 120, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, 118, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Stroke", jPanel3);

        jLabel5.setText("Alpha:");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.1f)));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jLabel6.setText("Blending:");

        jComboBox4.setModel(getAlphaComposites());
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton4.setText("Rendering Hints");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fancy", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == jComboBox1.getItemCount()-1) {
            jButton1.setVisible(true);
            ((PaintInfo)jComboBox1.getSelectedItem()).setPaint(
                    getCurrentLayer().paint);
            ((SimpleMutableIcon)(jButton1.getIcon())).paint = 
                    getCurrentLayer().paint;
        } else {
            jButton1.setVisible(false);
        }
        getCurrentLayer().paint = 
                (Color) ((PaintInfo)(jComboBox1.getSelectedItem())).getPaint();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (getCurrentLayer().type == JVectorLayer.PaintTypes.FILLED) {
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        }
        else {
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(true);
        }
                    
        jComboBox1.setSelectedItem(getCurrentLayer().paint);
        PaintInfo info = null;
        for (PaintInfo p : avaliblePaint) {
            if (((Color)p.getPaint()).equals(getCurrentLayer().paint)) {
                info = p;
                break;
            }
        }
        if (info != null) {
            jComboBox1.setSelectedItem(info);
            jButton1.setVisible(false);
        } else {
            jButton1.setVisible(true);
            jComboBox1.setSelectedIndex(jComboBox1.getItemCount()-1);
        }
        
        BasicStroke s = (BasicStroke)(getCurrentLayer().stroke);
        jSpinner1.setValue(new Float(s.getLineWidth()));
        jComboBox2.setSelectedIndex(s.getEndCap());
        jComboBox3.setSelectedIndex(s.getLineJoin());
        
        jSpinner2.setValue(new Float(
                    ((AlphaComposite)getCurrentLayer().composite).getAlpha()));
        jSpinner3.setValue(new Float(s.getMiterLimit()));
        int wantedInt = ((AlphaComposite)getCurrentLayer().composite).getRule();
        
        for (int i = 0; i < jComboBox4.getItemCount(); i++) {
            CompositeInfo c = (JVectorLayerEditor.CompositeInfo) jComboBox4.getItemAt(i);
            if (c.numb == wantedInt) {
                jComboBox4.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Color color = ((Color)((SimpleMutableIcon)(jButton1.getIcon())).paint);
        ((SimpleMutableIcon)(jButton1.getIcon())).paint =
                JColorChooser.showDialog(this, "Select a new color", color);
        ((JVectorLayer)jList1.getSelectedValue()).paint = (Color) ((SimpleMutableIcon)(jButton1.getIcon())).paint;
        ((PaintInfo)jComboBox1.getSelectedItem()).setPaint(((SimpleMutableIcon)(jButton1.getIcon())).paint);
        jComboBox1.updateUI();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JVectorLayer l = new JVectorLayer();
        l.n = shape.getLayers().size();
        shape.getLayers().add(l);
        jList1.updateUI();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jList1.getSelectedIndex() < 0)
            return;
        int option = JOptionPane.showConfirmDialog(this, "Do you really want to delete this layer?");
        if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.NO_OPTION)
            return;
        shape.getLayers().remove(jList1.getSelectedIndex());
        for (int i = 0; i < shape.getLayers().size(); i++) {
           shape.getLayers().get(i).n = i; 
        }
        if (jList1.getSelectedIndex() >= shape.getLayers().size())
            jList1.setSelectedIndex(jList1.getSelectedIndex()-1);
        if (shape.getLayers().size() <= 1)
            jButton3.setEnabled(false);
        else
            jButton3.setEnabled(true);
        jList1.updateUI();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        getCurrentLayer().type = JVectorLayer.PaintTypes.FILLED;
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        getCurrentLayer().type = JVectorLayer.PaintTypes.STROKED;
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        if (shape == null || jList1.getSelectedIndex() < 0)
            return;
        getCurrentLayer().stroke = 
                new BasicStroke(((Float)jSpinner1.getValue()).floatValue(), 
                        jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), 
                        ((Float)jSpinner3.getValue()).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        getCurrentLayer().stroke = 
                new BasicStroke(((Float)jSpinner1.getValue()).floatValue(), 
                        jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), 
                        ((Float)jSpinner3.getValue()).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        getCurrentLayer().stroke = 
                new BasicStroke(((Float)jSpinner1.getValue()).floatValue(), 
                        jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), 
                        ((Float)jSpinner3.getValue()).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        getCurrentLayer().composite = 
                AlphaComposite.getInstance(((CompositeInfo)
                            (jComboBox4.getSelectedItem())).numb, ((Float)(jSpinner2.getValue())).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        getCurrentLayer().composite = 
                AlphaComposite.getInstance(((CompositeInfo)
                            (jComboBox4.getSelectedItem())).numb, ((Float)(jSpinner2.getValue())).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
   
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Window w = new Window (JVectorWindow.getInstance());
        final RenderingHintsPanel p = new RenderingHintsPanel(getCurrentLayer().hints, w);
        w.add(p);
        w.pack();
        w.setLocationRelativeTo(null);
        w.setAlwaysOnTop(true);
        w.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        getCurrentLayer().stroke = 
                new BasicStroke(((Float)jSpinner1.getValue()).floatValue(), 
                        jComboBox2.getSelectedIndex(), jComboBox3.getSelectedIndex(), 
                        ((Float)jSpinner3.getValue()).floatValue());
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jSpinner3StateChanged
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    
}
