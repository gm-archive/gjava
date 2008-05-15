/*
 * ActorEditor2.java
 *
 * Created on 12 September 2007, 22:43
 */
package org.gcreator.editors;

import org.gcreator.components.popupmenus.*;
import org.gcreator.components.TabPanel;
import org.gcreator.components.impl.*;
import org.gcreator.components.resource.*;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.gcreator.exceptions.*;
import org.gcreator.events.*;
import org.gcreator.actions.*;
import org.gcreator.managers.LangSupporter;

public class ActorEditor extends TabPanel {

    public boolean changed = false;
    public EventListModel elist;
    Actor actor;
    int from;
    /*static {
        jList1 = new javax.swing.JList();
    }*/
    
    DefaultComboBoxModel actmodel = new DefaultComboBoxModel();
    
    ResourceChooser spriteres, extendres, maskres;

    public void updateNavigator(){
        System.out.println("Update navigator");
        Component c = org.gcreator.core.gcreator.panel.getNavigatorPanel();
        if(c instanceof JPanel){
            System.out.println("Update c JPanel");
            ((JPanel) c).updateUI();
        }
        else if(c instanceof JScrollPane){
            ((JScrollPane) c).updateUI();
            Component d = ((JScrollPane) c).getViewport().getView();
            if(d instanceof JPanel){
                System.out.println("Update d JPanel");
                ((JPanel) d).updateUI();
            }
            else if(d instanceof JEditorPane){
                System.out.println("Update d editor pane");
                ((JEditorPane) d).updateUI();
            }
            else
                d.repaint();
        }
        else
            if(c!=null)
                c.repaint();
    }
    
    public void spriteChanged() {
        ((Actor) file.value).sprite = spriteres.getFile();
        updateNavigator();
    }

    //You may think this is a stupid function, but I needed it.
    protected ActorEditor getThis(){
        return this;
    }
    
    /** Creates new form ActorEditor2 */
    public ActorEditor(org.gcreator.fileclass.GFile file, Project project) throws WrongResourceException {
        this.project = project;
        if (file.value == null) {
            this.actor = new Actor(/*file.name*/);
            actor.readXml(file.xml);
            file.value = actor;
            actor.events = new Vector<org.gcreator.events.Event>();
        } else if (file.value instanceof Actor) {
            this.actor = (Actor) file.value;
        } else {
            throw new WrongResourceException();
        }
        this.file = file;
        elist = new EventListModel(file);
        initComponents();
        //PopupListener a = new PopupListener(jList2, new ActionPopupMenu(this));
        jList2.addMouseListener(new MouseListener(){
            public void mousePressed(java.awt.event.MouseEvent evt){}
            public void mouseReleased(java.awt.event.MouseEvent evt){
                if(evt.isPopupTrigger()){
                ActionPopupMenu p = new ActionPopupMenu(getThis());
                p.show(jList2, evt.getX(), evt.getY());
                }
            }
            public void mouseClicked(java.awt.event.MouseEvent evt){}
            public void mouseExited(java.awt.event.MouseEvent evt){}
            public void mouseEntered(java.awt.event.MouseEvent evt){}
        });
        jList1.addMouseListener(new PopupListener(jList1, new EventPopupMenu(this)));
        //a.update = true;
        //jList2.addMouseListener(a);
        jComboBox2.setModel(new DefaultComboBoxModel(ActionContainer.actionCats));
        jComboBox2.setRenderer(new ActionListCellRenderer());
        try {
            jTextField1.setText(file.name);
        } catch (NullPointerException e) {
        }
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent evt){
                updateName();
            }
            public void insertUpdate(DocumentEvent evt){
                updateName();
            }
            public void removeUpdate(DocumentEvent evt){
                updateName();
            }
        });
        
        jList1.setCellRenderer(new EventCellRenderer());
        jList3.setModel(new DefaultComboBoxModel(ActionContainer.actionCats.get(0).patterns));
        jList3.setCellRenderer(new ActionListCellRenderer());
        jList2.setCellRenderer(new ActionsCellRenderer());
        jList2.setModel(actmodel);

        //setup resource menu's
        jPanel13.setLayout(new FlowLayout());
        jPanel13.add(spriteres = new ResourceChooser(project, "sprite"));
        if (actor.sprite != null) {
            spriteres.setFile(actor.sprite);
        }
        spriteres.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        spriteChanged();
                    }
                });
        jPanel11.setLayout(new FlowLayout());
        jPanel11.add(extendres = new ResourceChooser(project, "actor"));
        jPanel12.setLayout(new FlowLayout());
        jPanel12.add(maskres = new ResourceChooser(project, "sprite"));

        //load variables
        Load();

        jList1.addMouseListener(new PopupListener(jList1, new EventPopupMenu(this)));
        jList2.addMouseListener(new PopupListener(jList2, new ActionPopupMenu(this)));
        jSpinner1.setValue((Integer) actor.depth);
    }

    public boolean wasModified() {
        return changed;
    }

    public boolean Load() {
        jCheckBox1.setSelected(actor.visible);
        jCheckBox2.setSelected(actor.solid);
        jCheckBox3.setSelected(actor.persistant);
        return true;
    }

    public boolean Save() {
        this.jList2.updateUI();
        actor.visible = jCheckBox1.isSelected();
        actor.solid = jCheckBox2.isSelected();
        actor.persistant = jCheckBox3.isSelected();
        file.value = actor;

        return true;
    }
    
    public void updateName() {
        file.name = jTextField1.getText();
        //actor.name = file.name;
        org.gcreator.core.gcreator.panel.workspace.updateUI();
    }
    
    public static void setupActions() {
        //JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        //addAction(p,"test");
        //addAction(p,"test2");
        //addActionCat(p,"Move");
        //p = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        //addAction(p,"OtherCat");
        //addAction(p,"2");
        //addActionCat(p,"Main");
        //addActionCat(p,"Control");
        //addActionCat(p,"Draw");

//        jComboBox1.addActionListener(new ActionListener() {
//
//                    public void actionPerformed(ActionEvent e) {
//                        JComboBox cb = (JComboBox) e.getSource();
//                        String name = (String) cb.getSelectedItem();
//
//                        for (Enumeration en = actionCats.elements(); en.hasMoreElements();) {
//                            ActionCategory a = ((ActionCategory) en.nextElement());
//                            if (a.name.equals(name)) {
//                            //jScrollPane3.setViewportView(a.j); 
//                            }
//
//                        }
//
//
//                    }
//                });
    }

    /*public static void addAction(JPanel p, String name) {
        JLabel b = new JLabel(name);

        b.setHorizontalAlignment(JLabel.LEFT);
        b.setVerticalAlignment(JLabel.TOP);
        b.setPreferredSize(new Dimension(32, 32));
        p.add(b);
    }*/

    /*public static void addActionCat(JPanel p, String name)
    {
        jComboBox1.addItem(name);
        actionCats.add(new actionCat(name,p));
    }*/
    /*static class actionCat {

        String name;
        JPanel j;

        actionCat(String name, JPanel j) {
            this.name = name;
            this.j = j;
        }
    }*/

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();

        jSplitPane1.setDividerLocation(140);
        jSplitPane1.setDividerSize(3);

        jSplitPane2.setDividerLocation(260);
        jSplitPane2.setDividerSize(3);

        jSplitPane3.setDividerLocation(100);
        jSplitPane3.setDividerSize(3);

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setMaximumSize(new java.awt.Dimension(250, 0));
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList2MousePressed(evt);
            }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jList2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jList2MouseDragged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jSplitPane3.setRightComponent(jScrollPane2);

        jList1.setModel(elist);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jList1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jList1MouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton5.setText(LangSupporter.activeLang.getEntry(145));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton5))
        );

        jSplitPane3.setLeftComponent(jPanel6);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane3)
        );

        jSplitPane2.setLeftComponent(jPanel4);

        jPanel5.setMinimumSize(new java.awt.Dimension(100, 0));

        jButton1.setText(LangSupporter.activeLang.getEntry(146));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList3);

        jPanel7.setLayout(new java.awt.BorderLayout());

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jComboBox2, 0, 212, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButton1))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
            .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(11, 11, 11)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel1);

        jLabel1.setText(LangSupporter.activeLang.getEntry(136));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(LangSupporter.activeLang.getEntry(137)));

        jButton2.setText(LangSupporter.activeLang.getEntry(138));

        org.jdesktop.layout.GroupLayout jPanel13Layout = new org.jdesktop.layout.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 135, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 23, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
            .add(jPanel13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2))
        );

        jCheckBox1.setSelected(true);
        jCheckBox1.setText(LangSupporter.activeLang.getEntry(139));
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(true);
        jCheckBox2.setText(LangSupporter.activeLang.getEntry(140));
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText(LangSupporter.activeLang.getEntry(141));
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jLabel2.setText(LangSupporter.activeLang.getEntry(142));

        jLabel3.setText(LangSupporter.activeLang.getEntry(143));

        jLabel4.setText(LangSupporter.activeLang.getEntry(144));

        org.jdesktop.layout.GroupLayout jPanel11Layout = new org.jdesktop.layout.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 34, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 15, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel12Layout = new org.jdesktop.layout.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 34, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 15, Short.MAX_VALUE)
        );

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(10)));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jCheckBox2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(jCheckBox1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                            .add(jCheckBox3)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSpinner1))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel12, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBox3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(jPanel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jPanel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSplitPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void event(int type,String name) {
        System.out.println("Actor editor:event:type"+type);
        if (type == EventSelectListener.CREATE) {
            elist.add(new CreateEvent());
        } else if (type == EventSelectListener.DESTROY) {
            elist.add(new DestroyEvent());
        } else if (type == EventSelectListener.DRAW) {
            elist.add(new DrawEvent());
        } else if (type == EventSelectListener.BEGINSTEP) {
            elist.add(new BeginStepEvent());
        } else if (type == EventSelectListener.STEP) {
            elist.add(new StepEvent());
        } else if (type == EventSelectListener.ENDSTEP) {
            elist.add(new EndStepEvent());
        } else if (type >= EventSelectListener.MOUSELEFTCLICKED && type <= EventSelectListener.MOUSEOUT) {
            elist.add(new org.gcreator.events.MouseEvent(type));
        } else if (type >= EventSelectListener.ALARM && type <= EventSelectListener.ALARM + 11){
            elist.add(new org.gcreator.events.AlarmEvent(type-EventSelectListener.ALARM));
        }
        else if (type >= EventSelectListener.Keyboard && type <= EventSelectListener.Keyboard + 999){
            elist.add(new org.gcreator.events.KeyboardEvent(type-EventSelectListener.Keyboard,name));
        }
        else if (type >= EventSelectListener.Keypress && type <= EventSelectListener.Keypress + 999){
            elist.add(new org.gcreator.events.KeyPress(type-EventSelectListener.Keypress,name));
        }
        else if (type >= EventSelectListener.Keyrelease && type <= EventSelectListener.Keyrelease + 999){
            elist.add(new org.gcreator.events.KeyReleased(type-EventSelectListener.Keyrelease,name));
        }
        jScrollPane1.updateUI();
        jList1.updateUI();
        updateActionList();
    }

    public void updateActionList() {
        actmodel.removeAllElements();
        if (jList1.getSelectedValue() == null) {
            return;
        }
        Vector<org.gcreator.actions.Action> actions = 
                ((org.gcreator.events.Event) jList1.getSelectedValue()).actions;
        for (int i = 0; i < actions.size(); i++) {
            actmodel.addElement(actions.get(i));
        }
    }

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        EventSelectListener listener = new EventSelectListener() {

                    public void eventSelected(int type,String name) {
                        event(type,name);
                    }
                    
                    public void eventSelected(int type) {
                        event(type,"");
                    }
                };
        EventSelect selector = new EventSelect(this,gcreator.window, true, evt.getX(), evt.getY(), listener); //java 6 uses OnScreen()
        changed = true;
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        file.name = jTextField1.getText();
        //actor.name = file.name;
        org.gcreator.core.gcreator.panel.workspace.updateUI();
        updateNavigator();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
    // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        changed = true;
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
        changed = true;
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        changed = true;
    }//GEN-LAST:event_jCheckBox3MouseClicked

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        jButton5MouseClicked(evt);
    }//GEN-LAST:event_jButton5MouseReleased

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        updateActionList();
        jPanel7.removeAll();
        updateUI();
    }//GEN-LAST:event_jList1ValueChanged

    org.gcreator.actions.Action a = null;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(a!=null)
            a.pattern.save(a.getPanel());
        jPanel7.removeAll();
        
        //add button            
        if (jList1.getSelectedValue() == null) {
                return;
            }
            if (jList3.getSelectedValue() == null) {
                return;
            }
            ActionPattern ap = (org.gcreator.actions.ActionPattern)
                    ((org.gcreator.actions.ActionPattern) jList3.getSelectedValue()).clone();
            
            org.gcreator.actions.Action a = new org.gcreator.actions.Action(this, ap);
            ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.add(a);
            
            updateActionList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        jPanel7.removeAll();
        a = (org.gcreator.actions.Action) jList2.getSelectedValue();
        
        if (a == null) {
            return;
        }
        
        jPanel7.add(a.getPanel(), BorderLayout.CENTER);
        updateUI();
    }//GEN-LAST:event_jList2ValueChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        actor.visible = jCheckBox1.isSelected();
        updateNavigator();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        actor.solid = jCheckBox2.isSelected();
        updateNavigator();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        actor.persistant = jCheckBox3.isSelected();
        updateNavigator();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jList3.setModel(new DefaultComboBoxModel(((ActionCategory) jComboBox2.getSelectedItem()).patterns));
        jList3.updateUI();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseDragged
        int to  = jList2.locationToIndex(evt.getPoint());
     if (to == from) return;
       org.gcreator.actions.Action remove = ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.remove(from);
      ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.add(to,remove);
      from = to;
      updateActionList();
    }//GEN-LAST:event_jList2MouseDragged

    private void jList2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MousePressed
        from = jList2.locationToIndex(evt.getPoint());
        //jList2.updateUI();
    }//GEN-LAST:event_jList2MousePressed

    private void jList1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseDragged
         int to  = jList1.locationToIndex(evt.getPoint());
     if (to == from) return;
       org.gcreator.events.Event remove = (org.gcreator.events.Event) this.elist.getEvents().remove(from);
      (this.elist.getEvents()).add(to,remove);
      from = to;
      
    }//GEN-LAST:event_jList1MouseDragged

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        from = jList1.locationToIndex(evt.getPoint());
        updateUI();
    }//GEN-LAST:event_jList1MousePressed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        jList2.setSelectedIndex(jList2.locationToIndex(evt.getPoint()));
    }//GEN-LAST:event_jList2MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        actor.depth = ((Integer) jSpinner1.getValue()).intValue();
        updateNavigator();
    }//GEN-LAST:event_jSpinner1StateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JList jList1;
    public javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /*class Value
    {
    //value is the event name
        public String value,img;
        public ImageIcon image;
        public DefaultListModel actions = new DefaultListModel();
        public Value(String value, String img,DefaultListModel actions)
        {
            this.img = img;
            this.image = new ImageIcon(img);
            this.value = value;
            
        }
        
    }*/
    /*class SimpleCellRenderer extends JLabel implements ListCellRenderer
    {
        public SimpleCellRenderer()
        {
            setOpaque(true);
        }
        
        public Component getListCellRendererComponent(JList list, Object value, 
                        int index, boolean isSelected, boolean cellHasFocus)
        {
            Value val = (Value)value;
            setText(val.value);
            setIcon(val.image);
            
            setBackground(isSelected ? Color.black : (index & 1) == 0 ? Color.white : Color.LIGHT_GRAY);
            setForeground(isSelected ? Color.white : Color.black);
            return this;
        }
        
        
    }*/
}
    
