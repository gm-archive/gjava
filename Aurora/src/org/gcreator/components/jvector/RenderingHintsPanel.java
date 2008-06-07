/*
 * RenderingHintsPanel.java
 *
 * Created on May 16, 2008, 9:45 AM
 */

package org.gcreator.components.jvector;

import java.awt.RenderingHints;
import java.awt.Window;
import java.util.Map;

/**
 *
 * @author  bob
 */
public class RenderingHintsPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1;
    private Map<RenderingHints.Key, Object> renderingHints;
    private Window window;
    
    /** Creates new form RenderingHintsPanel
     * @param map The map on RenderingHints
     * @param w The Window the panel this panel belongs to.
     */
    public RenderingHintsPanel(Map<RenderingHints.Key, Object> map, Window w) {
        this.renderingHints = map;
        initComponents(); 
        correctComponents();
        this.window = w;
    }
    /**
     * @deprecated
     */
    public RenderingHintsPanel() {
        throw new UnsupportedOperationException(
                "Use RenderingHintsPanel(Map<?, ?> map, Window w) constructor instead.");         
    }
    
    public Map<RenderingHints.Key, Object> getMap() {
        return renderingHints;
    }
    
    public void setMap(Map<RenderingHints.Key, Object> map) {
        this.renderingHints = map;
        correctComponents();
    }
    
    private void correctComponents() {
        if (renderingHints == null)
            return;
        Object o;
        o = renderingHints.get(RenderingHints.KEY_ALPHA_INTERPOLATION);
        if (o == RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT)
            jComboBox1.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY)
            jComboBox1.setSelectedIndex(1);
        else
            jComboBox1.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_ANTIALIASING);
        if (o == RenderingHints.VALUE_ANTIALIAS_DEFAULT)
            jComboBox2.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_ANTIALIAS_OFF)
            jComboBox2.setSelectedIndex(1);
        else
            jComboBox2.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_COLOR_RENDERING);
        if (o == RenderingHints.VALUE_COLOR_RENDER_DEFAULT)
            jComboBox3.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_COLOR_RENDER_QUALITY)
            jComboBox3.setSelectedIndex(1);
        else
            jComboBox3.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_DITHERING);
        if (o == RenderingHints.VALUE_DITHER_DEFAULT)
            jComboBox4.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_DITHER_DISABLE)
            jComboBox4.setSelectedIndex(1);
        else
            jComboBox4.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_FRACTIONALMETRICS);
        if (o == RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT)
            jComboBox5.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_FRACTIONALMETRICS_OFF)
            jComboBox5.setSelectedIndex(1);
        else
            jComboBox5.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_INTERPOLATION);
        if (o == RenderingHints.VALUE_INTERPOLATION_BICUBIC)
            jComboBox6.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_INTERPOLATION_BILINEAR)
            jComboBox6.setSelectedIndex(1);
        else
            jComboBox6.setSelectedIndex(2);
        o = renderingHints.get(RenderingHints.KEY_RENDERING);
        if (o == RenderingHints.VALUE_RENDER_DEFAULT)
            jComboBox7.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_RENDER_QUALITY)
            jComboBox7.setSelectedIndex(1);
        else
            jComboBox7.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_STROKE_CONTROL);
        if (o == RenderingHints.VALUE_STROKE_DEFAULT)
            jComboBox8.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_STROKE_NORMALIZE)
            jComboBox8.setSelectedIndex(1);
        else
            jComboBox8.setSelectedIndex(2);
        
        o = renderingHints.get(RenderingHints.KEY_TEXT_ANTIALIASING);
        if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT)
            jComboBox9.setSelectedIndex(0);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_GASP)
            jComboBox9.setSelectedIndex(1);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR)
            jComboBox9.setSelectedIndex(2);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB)
            jComboBox9.setSelectedIndex(3);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VBGR)
            jComboBox9.setSelectedIndex(4);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB)
            jComboBox9.setSelectedIndex(5);
        else if (o == RenderingHints.VALUE_TEXT_ANTIALIAS_OFF)
            jComboBox9.setSelectedIndex(6);
        else 
            jComboBox9.setSelectedIndex(7);
        
        jSlider1.setValue(((Integer)renderingHints.get(RenderingHints.KEY_TEXT_LCD_CONTRAST)).intValue());
    }
    
    private void save() {
        Object o;
        int i;
        
        i = jComboBox1.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY;
        else
            o = RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED;
        renderingHints.put(RenderingHints.KEY_ALPHA_INTERPOLATION, o);
        
        
        i = jComboBox2.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_ANTIALIAS_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_ANTIALIAS_OFF;
        else
            o = RenderingHints.VALUE_ANTIALIAS_ON;
        renderingHints.put(RenderingHints.KEY_ANTIALIASING, o);
        
        i = jComboBox3.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_COLOR_RENDER_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_COLOR_RENDER_QUALITY;
        else
            o = RenderingHints.VALUE_COLOR_RENDER_SPEED;
        renderingHints.put(RenderingHints.KEY_COLOR_RENDERING, o);
        
        i = jComboBox4.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_DITHER_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_DITHER_DISABLE;
        else
            o = RenderingHints.VALUE_DITHER_ENABLE;
        renderingHints.put(RenderingHints.KEY_DITHERING, o);

        i = jComboBox5.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
        else
            o = RenderingHints.VALUE_FRACTIONALMETRICS_ON;
        renderingHints.put(RenderingHints.KEY_FRACTIONALMETRICS, o);
        
        i = jComboBox6.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_INTERPOLATION_BICUBIC;
        else if (i == 1)
            o = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        else
            o = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        renderingHints.put(RenderingHints.KEY_INTERPOLATION, o);
        
        i = jComboBox7.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_RENDER_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_RENDER_QUALITY;
        else
            o = RenderingHints.VALUE_RENDER_SPEED;
        renderingHints.put(RenderingHints.KEY_RENDERING, o);
        
        i = jComboBox8.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_STROKE_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_STROKE_NORMALIZE;
        else
            o = RenderingHints.VALUE_STROKE_PURE;
        renderingHints.put(RenderingHints.KEY_STROKE_CONTROL, o);
        
        i = jComboBox9.getSelectedIndex();
        if (i == 0)
            o = RenderingHints.VALUE_ANTIALIAS_DEFAULT;
        else if (i == 1)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_GASP;
        else if (i == 2)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;
        else if (i == 3)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
        else if (i == 4)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VBGR;
        else if (i == 5)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_VRGB;
        else if (i == 6)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_OFF;
        else if (i == 7)
            o = RenderingHints.VALUE_TEXT_ANTIALIAS_ON;
        
        renderingHints.put(RenderingHints.KEY_TEXT_ANTIALIASING, o);

       renderingHints.put(RenderingHints.KEY_TEXT_LCD_CONTRAST, new Integer(jSlider1.getValue()));
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Alpha Interpolation:");

        jLabel2.setText("Antialiasing:");

        jLabel3.setText("Color Rendering:");

        jLabel4.setText("Dithering:");

        jLabel5.setText("Fractional Metrics:");

        jLabel6.setText("Interpolation:");

        jLabel7.setText("Rendering:");

        jLabel8.setText("Stroke Control:");

        jLabel9.setText("Text Antialiasing:");

        jLabel10.setText("LCD Contrast:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Quality", "Speed" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Off", "On" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Quality", "Speed" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Disable", "Enable" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Off", "On" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bicubic", "Bilinear", "Nearest Neighbor" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Speed", "Quality" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "Normalize", "Pure" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "GASP", "LCD HBGR", "LCD HRGR", "LCD VBGR", "LCD VRGR", "Off", "On" }));

        jSlider1.setMajorTickSpacing(50);
        jSlider1.setMaximum(250);
        jSlider1.setMinimum(100);
        jSlider1.setMinorTickSpacing(25);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(150);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox2, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox9, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox8, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox7, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox6, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox5, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox4, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox3, 0, 154, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 154, Short.MAX_VALUE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        window.setVisible(false);
        window.dispose();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save();
        window.setVisible(false);
        window.dispose();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        save();
        JVectorWindow.getInstance().shapePanel.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
    
}
