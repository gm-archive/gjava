/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import java.awt.Component;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.metal.OceanTheme;
import org.gcreator.core.*;
import org.gcreator.managers.*;
import org.gcreator.themes.HappyTheme;
import sun.themes.AquaTheme;
import sun.themes.CharcoalTheme;
import sun.themes.ContrastTheme;
import sun.themes.EmeraldTheme;
import sun.themes.RubyTheme;

/**
 *
 * @author  Luís
 */
public class PreferencesTab extends OptionPanel {
    
    public static Vector<MetalTheme> themes;
    /** Creates new form PreferencesTab */
    public PreferencesTab() {
        initComponents();
        if (themes == null) {
            themes = new Vector<MetalTheme>(8);
            themes.add(new AquaTheme());
            themes.add(new CharcoalTheme());
            themes.add(new ContrastTheme());
            themes.add(new DefaultMetalTheme());
            themes.add(new EmeraldTheme());
            themes.add(new HappyTheme());
            themes.add(new OceanTheme());
            themes.add(new RubyTheme());
        }
        jComboBox3.setModel(new DefaultComboBoxModel() {
            private static final long serialVersionUID = 1;
            
            @Override
            public int getSize() {
                return themes.size();
            }

            @Override
            public Object getElementAt(int index) {
                return themes.get(index);
            }
        });
        jComboBox3.setRenderer(new DefaultListCellRenderer() {
            private static final long serialVersionUID = 1;
            
            @Override
            public Component getListCellRendererComponent(JList list, Object value,int index, boolean isSelected,boolean cellHasFocus) {
                JLabel l = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value != null) {
                    if (value instanceof MetalTheme) {
                        l.setText(((MetalTheme) value).getName());
                    } else {
                        l.setText(value.getClass().getSimpleName());
                    }
                }
                return l;
            }
        });
        //   According to TGMG this makes G-Creator crash.
        // jComboBox1.setSelectedIndex(0);
        // 
        try {
            if (Registry.get("Graphics.theme") == null) {
                throw new Exception();//Lazy way of going to the catch statement below.
            } else if (Registry.get("Graphics.theme").equals("Native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                jComboBox1.setSelectedIndex(0);
            } else {
                LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
                int i;
                for (i = 0; i < info.length; i++) {
                    if (info[i].getClassName().equals(Registry.get("Graphics.theme"))) {
                        i++;
                        break;
                    }
                }
                jComboBox1.setSelectedIndex(i);
            }

        } catch (Exception e) {
            jComboBox1.setSelectedIndex(0);
        }
        

        if (Registry.get("Window.desktop").equals("MDI")) {
            jComboBox2.setSelectedIndex(4);
        } else if (Registry.get("Window.desktop").equals("LEFT")) {
            jComboBox2.setSelectedIndex(1);
        } else if (Registry.get("Window.desktop").equals("BOTTOM")) {
            jComboBox2.setSelectedIndex(2);
        } else if (Registry.get("Window.desktop").equals("RIGHT")) {
            jComboBox2.setSelectedIndex(3);
        } else {
            jComboBox2.setSelectedIndex(0);
        }
        
        jCheckBox1.setSelected((Boolean)Registry.get("Graphics.antialiasing"));
        jComboBox2ActionPerformed(null);
        findMetalTheme();
    }
    public DefaultComboBoxModel lafmodel = new DefaultComboBoxModel() {

        public String[] vals = new String[UIManager.getInstalledLookAndFeels().length + 1];
        //public String[] vals = new String[]{getLang(17), getLang(18), getLang(19), getLang(132)};
        

        {
            vals[0] = "<Native>";
            int i = 1;
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                vals[i++] = info.getName();
            }
        }

        @Override
        public Object getElementAt(int pos) {
            return vals[pos];
        }

        @Override
        public int getSize() {
            return vals.length;
        }
    };
    public DefaultComboBoxModel displaymodes = new DefaultComboBoxModel() {

        public String[] vals = new String[]{getLang(20), getLang(90), getLang(91), getLang(92),
            getLang(21)
        };

        public Object getElementAt(int pos) {
            return vals[pos];
        }

        public int getSize() {
            return vals.length;
        }
    };

    public String getLang(int lang) {
        return LangSupporter.activeLang.getEntry(lang);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();

        jLabel1.setText(getLang(15));

        jComboBox1.setModel(lafmodel);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText(getLang(16));

        jComboBox2.setModel(displaymodes);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(LangSupporter.activeLang.getEntry(266)));

        jCheckBox1.setText("Antialiasing");
        jCheckBox1.setText(LangSupporter.activeLang.getEntry(259));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Spin Menu");
        jCheckBox2.setVisible(false);
        jCheckBox2.setEnabled(false);

        jCheckBox3.setText("High-Contrast");
        jCheckBox3.setVisible(false);
        jCheckBox3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText(LangSupporter.activeLang.getEntry(287));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 320, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, 320, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 320, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int sel = jComboBox1.getSelectedIndex();

        try {
            if (sel == 0) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else {
                try {
                    LookAndFeel look = (LookAndFeel) Class.forName(UIManager.getInstalledLookAndFeels()[sel - 1].getClassName()).newInstance();
                    UIManager.setLookAndFeel(look);
                } catch (ClassNotFoundException exc) {
                    //Was the lookAndFeel loaded from a JAR?
                    LookAndFeel look = (LookAndFeel) gcreator.lafLoader.loadClass(UIManager.getInstalledLookAndFeels()[sel - 1].getClassName()).newInstance();
                    UIManager.setLookAndFeel(look);
                }
            }
            if (UIManager.getLookAndFeel().getClass().getName().equals(MetalLookAndFeel.class.getName())) {
                jComboBox3.setEnabled(true);
                findMetalTheme();
            }
            else {
                jComboBox3.setEnabled(false);
            }
            SwingUtilities.updateComponentTreeUI(gcreator.window);
            SwingUtilities.updateComponentTreeUI(SystemOutputReader.instance);
            if (gcreator.panel.istabs) {
                SwingUtilities.updateComponentTreeUI(gcreator.panel.mdi);
            } else {
                SwingUtilities.updateComponentTreeUI(gcreator.panel.tabs);
            }
            SwingUtilities.updateComponentTreeUI(gcreator.panel.consolepopup);
            SwingUtilities.updateComponentTreeUI(gcreator.panel.about);
            //gcreator.window.look = sel;
            gcreator.panel.workspace.updateUI();
        } catch (Exception e) {
            System.err.println("[PreferencesTab]Exception: "+e);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    private void findMetalTheme() {
        for (int i = 0; i < jComboBox3.getItemCount(); i++) {
            if (((MetalTheme)jComboBox3.getItemAt(i)).getName().equals(MetalLookAndFeel.getCurrentTheme().getName())) {
                jComboBox3.setSelectedIndex(i);
                break;
            }
        }
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int sel = jComboBox2.getSelectedIndex();

        if (sel < 4) {
            if (!gcreator.panel.istabs) {
                int k = gcreator.panel.splitter2.getDividerLocation();
                gcreator.panel.tabs.setVisible(true);
                gcreator.panel.mdi.setVisible(false);
                if (gcreator.panel.isWorkspaceLeft()) {
                    gcreator.panel.splitter2.setRightComponent(gcreator.panel.tabs);
                    if (gcreator.panel.splitter2.getRightComponent().isVisible()) {
                        gcreator.panel.splitter2.setDividerLocation(k);
                    }
                } else {
                    gcreator.panel.splitter2.setLeftComponent(gcreator.panel.tabs);
                    if (gcreator.panel.splitter2.getLeftComponent().isVisible()) {
                        gcreator.panel.splitter2.setDividerLocation(k);
                    }
                }
                gcreator.panel.istabs = true;
                for (int i = 0; i < gcreator.panel.mdi.getDesktop().getComponents().length; i++) {
                    if (!(gcreator.panel.mdi.getDesktop().getComponent(i) instanceof ExtendedFrame)) {
                        continue;
                    }
                    try {
                        TabPanel panel = ((ExtendedFrame) gcreator.panel.mdi.getDesktop().getComponent(i)).getPanel();
                        gcreator.panel.tabs.addTab(panel.title, panel);
                        int ver = Integer.parseInt(org.gcreator.core.gcreator.getJavaVersion().replaceAll("1\\.([0-9])\\..*", "$1"));
                        if (ver >= 6) {
                            gcreator.panel.tabs.setTabComponentAt(gcreator.panel.tabs.indexOfComponent(panel), new ButtonTabComponent(gcreator.panel.tabs));
                        }
                    } catch (ClassCastException e) {
                    }
                }
            }
        }

        try {
            switch (sel) {
                case 0:
                    gcreator.panel.tabs.setTabPlacement(JTabbedPane.TOP);
                    Registry.set("Window.desktop", "TOP");
                    break;
                case 1:
                    gcreator.panel.tabs.setTabPlacement(JTabbedPane.LEFT);
                    Registry.set("Window.desktop", "LEFT");
                    break;
                case 2:
                    gcreator.panel.tabs.setTabPlacement(JTabbedPane.BOTTOM);
                    Registry.set("Window.desktop", "BOTTOM");
                    break;
                case 3:
                    gcreator.panel.tabs.setTabPlacement(JTabbedPane.RIGHT);
                    Registry.set("Window.desktop", "RIGHT");
                    break;
            }
        } catch (Exception e) {
        }

        if (sel == 4) {
            if (gcreator.panel.istabs) {
                int k = gcreator.panel.splitter2.getDividerLocation();
                gcreator.panel.tabs.setVisible(false);
                gcreator.panel.mdi.setVisible(true);
                if (gcreator.panel.isWorkspaceLeft()) {
                    gcreator.panel.splitter2.setRightComponent(gcreator.panel.mdi);
                    if (gcreator.panel.splitter2.getRightComponent().isVisible()) {
                        gcreator.panel.splitter2.setDividerLocation(k);
                    }
                } else {
                    gcreator.panel.splitter2.setLeftComponent(gcreator.panel.mdi);
                    if (gcreator.panel.splitter2.getLeftComponent().isVisible()) {
                        gcreator.panel.splitter2.setDividerLocation(k);
                    }
                }

                gcreator.panel.istabs = false;
                Component[] panels = gcreator.panel.tabs.getComponents();
                for (int i = 0; i < panels.length; i++) {
                    if (panels[i] instanceof TabPanel) {
                        TabPanel panel = (TabPanel) panels[i];
                        GroupLayout jInternalFrame1Layout = (GroupLayout) panel.frame.getContentPane().getLayout();
                        jInternalFrame1Layout.setHorizontalGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                        jInternalFrame1Layout.setVerticalGroup(jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                    }
                }
            }
            Registry.set("Window.desktop", "MDI");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        Registry.set("Graphics.antialiasing", jCheckBox1.isSelected());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        MetalLookAndFeel.setCurrentTheme((MetalTheme)jComboBox3.getSelectedItem());
        if (UIManager.getLookAndFeel().getClass().getName().equals(MetalLookAndFeel.class.getName())) {
            try {
                UIManager.setLookAndFeel(MetalLookAndFeel.class.getName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PreferencesTab.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(PreferencesTab.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PreferencesTab.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(PreferencesTab.class.getName()).log(Level.SEVERE, null, ex);
            }
            SwingUtilities.updateComponentTreeUI(gcreator.window);
            SwingUtilities.updateComponentTreeUI(gcreator.panel);
            SwingUtilities.updateComponentTreeUI(gcreator.panel.chooseImage);
            SwingUtilities.updateComponentTreeUI(SystemOutputReader.instance);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
