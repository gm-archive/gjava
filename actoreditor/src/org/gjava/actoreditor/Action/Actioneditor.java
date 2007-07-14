// Copyright (C) 2006, 2007 tgmg <tgmg@g-java.com>
//  This file is part of G-Java.
//  G-Java is free software and comes with ABSOLUTELY NO WARRANTY.
//  See LICENSE for details.
/*
 * Actioneditor.java
 *
 * Created on 21 April 2007, 20:30
 */

package org.gjava.actoreditor.Action;

import java.awt.Container;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Properties;
import javax.swing.text.EditorKit;
import org.openide.filesystems.FileAlreadyLockedException;
import org.openide.filesystems.FileLock;
import org.openide.text.CloneableEditorSupport;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;

/**
 *
 * @author  ali1
 */
public class Actioneditor extends TopComponent {
    private static Actioneditor instance;
    
    /**
     * props is the Properties file of the action
     */
    public Properties props;
    
    /**
     *
     */
    public String path;
    ActionDataObject a;
    
    Actioneditor() {
        
    }
    
    /** Creates new form Actioneditor
     * @param a
     */
    public Actioneditor(ActionDataObject a) {
        instance = this;
        this.a = a;
        this.path = a.getPrimaryFile().getPath();
        try     {
            initComponents();
            EditorKit kit = CloneableEditorSupport.getEditorKit("text/x-java");
            //jEditorPane1.setEditorKit(kit);
            jEditorPane2.setEditorKit(kit);
            openfile();
            
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    
    /**
     * Loads the action file.
     * @throws java.lang.Exception
     */
    public void openfile()
            throws Exception {
        InputStream input = a.getPrimaryFile().getInputStream();
        props = new Properties();
        props.load( input );
        input.close();
        this.jTextField1.setText(props.getProperty( "displayName" ));
        this.jTextField2.setText(props.getProperty( "comment" ));
        this.jTextField3.setText(props.getProperty( "icon16" ));
        this.jTextField4.setText(props.getProperty( "icon32" ));
        this.jTextField5.setText(props.getProperty( "caption0" ));
        this.jTextField6.setText(props.getProperty( "caption1" ));
        this.jTextField7.setText(props.getProperty( "caption2" ));
        this.jTextField8.setText(props.getProperty( "caption3" ));
        this.jTextField9.setText(props.getProperty( "caption4" ));
        this.jTextField10.setText(props.getProperty( "caption5" ));
        this.jTextField11.setText(props.getProperty( "caption6" ));
        this.jTextField12.setText(props.getProperty( "caption7" ));
        this.jTextField13.setText(props.getProperty( "arg0" ));
        this.jTextField14.setText(props.getProperty( "arg1" ));
        this.jTextField15.setText(props.getProperty( "arg2" ));
        this.jTextField16.setText(props.getProperty( "arg3" ));
        this.jTextField17.setText(props.getProperty( "arg4" ));
        this.jTextField18.setText(props.getProperty( "arg5" ));
        this.jTextField19.setText(props.getProperty( "arg6" ));
        this.jTextField20.setText(props.getProperty( "arg7" ));
        this.jEditorPane2.setText(props.getProperty( "code" ));
        this.jTextArea1.setText(props.getProperty("description"));
        jCheckBox1.setSelected(Boolean.parseBoolean(props.getProperty("applies")));
        jCheckBox4.setSelected(Boolean.parseBoolean(props.getProperty("showrelative")));
        
        
        // a.setModified(true);
    }
    
    /**
     * Saves the action file.
     */
    public void savefile() {
        try {
            FileLock lock = a.getPrimaryFile().lock();
            
            props.setProperty("displayName", jTextField1.getText());
            props.setProperty("comment", jTextField2.getText());
            props.setProperty("icon16", jTextField3.getText());
            props.setProperty("icon32", jTextField4.getText());
            props.setProperty("caption0", jTextField5.getText());
            props.setProperty("caption1", jTextField6.getText());
            props.setProperty("caption2", jTextField7.getText());
            props.setProperty("caption3", jTextField8.getText());
            props.setProperty("caption4", jTextField9.getText());
            props.setProperty("caption5", jTextField10.getText());
            props.setProperty("caption6", jTextField11.getText());
            props.setProperty("caption7", jTextField12.getText());
            props.setProperty("arg0", this.jTextField13.getText());
            props.setProperty("arg1", this.jTextField14.getText());
            props.setProperty("arg2", this.jTextField15.getText());
            props.setProperty("arg3", this.jTextField16.getText());
            props.setProperty("arg4", this.jTextField17.getText());
            props.setProperty("arg5", this.jTextField18.getText());
            props.setProperty("arg6", this.jTextField19.getText());
            props.setProperty("arg7", this.jTextField20.getText());
            props.setProperty("code", jEditorPane2.getText());
            props.setProperty("description", jTextArea1.getText());
            props.setProperty("showrelative",""+jCheckBox4.isSelected());
            props.setProperty("relative","false");
            props.setProperty("applies",""+jCheckBox1.isSelected());
            
            a.setModified(false);
            OutputStream out = a.getPrimaryFile().getOutputStream(lock);
            props.store(out, "");
            lock.releaseLock();
            out.close();
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
    
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized Actioneditor getDefault() {
        if (instance == null) {
            instance = new Actioneditor();
        }
        return instance;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jTextField1.text")); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel2.text")); // NOI18N

        jTextField2.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jTextField2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel4.text")); // NOI18N

        jEditorPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEditorPane2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jEditorPane2);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel5.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jLabel6.text")); // NOI18N

        jTextField3.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jTextField3.text")); // NOI18N

        jTextField4.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jTextField4.text")); // NOI18N

        jButton1.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jButton1.text")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "Actioneditor.jButton2.text")); // NOI18N

        jLabel17.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel17.text")); // NOI18N

        jLabel18.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel18.text")); // NOI18N

        jLabel19.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel19.text")); // NOI18N

        jLabel20.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel20.text")); // NOI18N

        jLabel21.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel21.text")); // NOI18N

        jLabel22.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel22.text")); // NOI18N

        jLabel23.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel23.text")); // NOI18N

        jTextField13.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField13.text")); // NOI18N

        jTextField14.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField14.text")); // NOI18N

        jTextField15.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField15.text")); // NOI18N

        jTextField16.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField16.text")); // NOI18N

        jTextField17.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField17.text")); // NOI18N

        jTextField18.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField18.text")); // NOI18N

        jTextField19.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField19.text")); // NOI18N

        jTextField20.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField20.text")); // NOI18N

        jCheckBox4.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jCheckBox4.text")); // NOI18N
        jCheckBox4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox4.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextArea1.text")); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jLabel24.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel24.text")); // NOI18N

        jLabel16.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel16.text")); // NOI18N

        jTextField12.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField21.text")); // NOI18N

        jLabel25.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel25.text")); // NOI18N

        jTextField11.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField22.text")); // NOI18N

        jLabel26.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel26.text")); // NOI18N

        jTextField10.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField23.text")); // NOI18N

        jLabel27.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel27.text")); // NOI18N

        jTextField9.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField24.text")); // NOI18N

        jLabel28.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel28.text")); // NOI18N

        jTextField8.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField25.text")); // NOI18N

        jLabel29.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel29.text")); // NOI18N

        jTextField7.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField26.text")); // NOI18N

        jLabel30.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel30.text")); // NOI18N

        jTextField6.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField27.text")); // NOI18N

        jLabel31.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jLabel31.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jTextField28.text")); // NOI18N

        jCheckBox1.setText(org.openide.util.NbBundle.getMessage(Actioneditor.class, "jCheckBox1.text")); // NOI18N
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel24)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField13))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel17)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField14))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel23)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField20))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel22)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField19))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel21)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField18))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel20)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField17))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel19)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField16))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel18)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 136, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jLabel16)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .add(jLabel25)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel4Layout.createSequentialGroup()
                                    .add(jLabel26)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(jLabel27)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(jLabel28)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(jLabel29)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(jLabel31)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel30)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 147, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jCheckBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jCheckBox1))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jCheckBox4)
                                .add(jCheckBox1))
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel24)
                                    .add(jTextField13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel17)
                                    .add(jTextField14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel18)
                                    .add(jTextField15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel19)
                                    .add(jTextField16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel20)
                                    .add(jTextField17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel21)
                                    .add(jTextField18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel22)
                                    .add(jTextField19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel23)
                                    .add(jTextField20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(14, 14, 14)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel31))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel30))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel29))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel28)
                            .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel27)
                            .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel26))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel25))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel16))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .add(jLabel2))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                            .add(layout.createSequentialGroup()
                                .add(jButton1)
                                .add(14, 14, 14)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton2)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .add(jTextField2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                        .add(4, 4, 4)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
                    .add(jLabel4)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                    .add(jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel5)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
    a.setModified(true);
}//GEN-LAST:event_jTextField1MouseClicked

private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    a.setModified(true);
}//GEN-LAST:event_formMouseClicked
    
private void jEditorPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEditorPane2KeyPressed
    a.setModified(true);
}//GEN-LAST:event_jEditorPane2KeyPressed

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    savefile();
}//GEN-LAST:event_jButton1MouseClicked
/**
 *
 */
public void pack() {
}

/**
 *
 * @return
 */
public Container getContentPane() {
    return this;
}

private void setDefaultCloseOperation(int i) {
    
}
/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // new Actioneditor().setVisible(true);
        }
    });
}

/**
 *
 * @param name
 * @param a
 * @return
 */
public static Actioneditor getInstance(String name,ActionDataObject a) {
    //this.a = a;
    // look for an open instance containing this feed
    Iterator opened = TopComponent.getRegistry().getOpened().iterator();
    while (opened.hasNext()) {
        Object tc = opened.next();
        if (tc instanceof Actioneditor) {
            Actioneditor elc = (Actioneditor)tc;
            
            if (name.equals(elc.path)) {
                //elc.requestActive();
                return elc;
            }
        }
    }
    
    // none found, make a new one
    return new Actioneditor(a);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
    /** replaces this in object stream */
    public Object writeReplace() {
        return new ResolvableHelper();
    }
    
    
    
    final static class ResolvableHelper implements Serializable {
        private static final long serialVersionUID = 1L;
        public Object readResolve() {
            return Actioneditor.getDefault();
        }
    }
}
