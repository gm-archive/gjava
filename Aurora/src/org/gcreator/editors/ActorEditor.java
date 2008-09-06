/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.editors;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.gcreator.components.TabPanel;
import org.gcreator.core.gcreator;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.gcreator.actions.ActionCategory;
import org.gcreator.actions.ActionContainer;
import org.gcreator.actions.ActionPattern;
import org.gcreator.components.impl.ActionListCellRenderer;
import org.gcreator.components.impl.ActionsCellRenderer;
import org.gcreator.components.impl.EventCellRenderer;
import org.gcreator.components.impl.EventSelectListener;
import org.gcreator.components.popupmenus.ActionPopupMenu;
import org.gcreator.components.popupmenus.EventListModel;
import org.gcreator.components.popupmenus.EventPopupMenu;
import org.gcreator.components.popupmenus.EventSelect;
import org.gcreator.components.resource.ResourceChooser;
import org.gcreator.events.BeginStepEvent;
import org.gcreator.events.CreateEvent;
import org.gcreator.events.DestroyEvent;
import org.gcreator.events.DrawEvent;
import org.gcreator.events.EndStepEvent;
import org.gcreator.events.StepEvent;
import org.gcreator.exceptions.WrongResourceException;
import org.gcreator.units.Dictionary;

public class ActorEditor extends TabPanel {

    public static final long serialVersionUID = 1;
    public boolean changed = false;
    public EventListModel elist;
    public Actor actor;
    int from;
    /*static {
    jList1 = new javax.swing.JList();
    }*/
    DefaultComboBoxModel actmodel = new DefaultComboBoxModel();
    ResourceChooser spriteres, extendres, maskres;

    public void updateNavigator() {
        System.out.println("Update navigator");
        Component c = org.gcreator.core.gcreator.panel.getNavigatorPanel();
        if (c instanceof JPanel) {
            System.out.println("Update c JPanel");
            ((JPanel) c).updateUI();
        } else if (c instanceof JScrollPane) {
            ((JScrollPane) c).updateUI();
            Component d = ((JScrollPane) c).getViewport().getView();
            if (d instanceof JPanel) {
                System.out.println("Update d JPanel");
                ((JPanel) d).updateUI();
            } else if (d instanceof JEditorPane) {
                System.out.println("Update d editor pane");
                ((JEditorPane) d).updateUI();
            } else {
                d.repaint();
            }
        } else if (c != null) {
            c.repaint();
        }
    }

    public void spriteChanged() {
        if (spriteres.getFile() == null) {
            return;
        }
        //System.out.println("Sprite changed to " + spriteres.getFile());
        actor.sprite = spriteres.getFile().getID();
        changed = true;
        updateNavigator();
    }
    
    /** Creates new form ActorEditor2
     * @param file The File
     * @param project The Project
     * @throws org.gcreator.exceptions.WrongResourceException Thrown if file.value isn't an Actor.
     */
    public ActorEditor(org.gcreator.fileclass.GFile file, Project project) throws WrongResourceException {
        this.project = project;
        if (file.value == null) {
            this.actor = new Actor();
            actor.events = new Vector<org.gcreator.events.Event>();
            changed = true;
        } else if (file.value instanceof Actor) {
            this.actor = (Actor) ((Actor) file.value).clone();
        } else {
            throw new WrongResourceException();
        }
        this.file = file;
        elist = new EventListModel(file, actor);
        initComponents();
        jList2.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseReleased(evt);
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    ActionPopupMenu p = new ActionPopupMenu(ActorEditor.this);
                    p.show(jList2, evt.getXOnScreen(), evt.getYOnScreen());
                }
                
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }
        });
        jList1.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                if (evt.isPopupTrigger()) {
                    EventPopupMenu p = new EventPopupMenu(ActorEditor.this);
                    p.show(jList2, evt.getXOnScreen(), evt.getYOnScreen());
                }
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            }
        });
        //a.update = true;
        //jList2.addMouseListener(a);
        jComboBox2.setModel(new DefaultComboBoxModel(ActionContainer.actionCats));
        jComboBox2.setRenderer(new ActionListCellRenderer());
        try {
            jTextField1.setText(file.name);
        } catch (NullPointerException e) {
        }
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void changedUpdate(DocumentEvent evt) {
                updateName();
            }

            @Override
            public void insertUpdate(DocumentEvent evt) {
                updateName();
            }

            @Override
            public void removeUpdate(DocumentEvent evt) {
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
        if (actor.sprite != -1) {
            spriteres.setFile(file.getProject().getFileFor(actor.sprite));
        }
        spriteres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                spriteChanged();
            }
        });
        jPanel11.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel11.add(extendres = new ResourceChooser(project, "actor"));
        jPanel12.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel12.add(maskres = new ResourceChooser(project, "sprite"));

        //load variables
        Load();

        //jList1.addMouseListener(new PopupListener(jList1, new EventPopupMenu(this)));
        //jList2.addMouseListener(new PopupListener(jList2, new ActionPopupMenu(this)));
        jSpinner1.setValue((Integer) actor.depth);
    }

    @Override
    public boolean wasModified() {
        return changed;
    }

    @Override
    public boolean canSave() {
        return changed;
    }

    @Override
    public boolean Load() {
        System.out.println("load actor");
        jCheckBox1.setSelected(actor.visible);
        jCheckBox2.setSelected(actor.solid);
        jCheckBox3.setSelected(actor.persistent);
        return true;
    }

    @Override
    public boolean Save() {
        System.out.println("save actor");
        this.jList2.updateUI();
        actor.visible = jCheckBox1.isSelected();
        actor.solid = jCheckBox2.isSelected();
        actor.persistent = jCheckBox3.isSelected();
        file.value = actor;
        changed = false;
        field.save();
        
        return true;
    }

    public void updateName() {
        file.name = jTextField1.getText();
        //actor.name = file.name;
        org.gcreator.core.gcreator.panel.workspace.updateUI();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        field = new org.gcreator.components.ActorFieldPane(this);

        jLabel1.setText(Dictionary.getEntry("editors-actor-name"));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(Dictionary.getEntry("editors-actors-sprite")));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jButton2.setText(Dictionary.getEntry("editors-actor-edit"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jCheckBox1.setSelected(true);
        jCheckBox1.setText(Dictionary.getEntry("editors-actor-visible"));
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
        jCheckBox2.setText(Dictionary.getEntry("editors-actor-solid"));
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

        jCheckBox3.setText(Dictionary.getEntry("editors-actor-persistent"));
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

        jLabel2.setText(Dictionary.getEntry("editors-actor-depth"));

        jLabel3.setText(Dictionary.getEntry("editors-actors-extends"));

        jLabel4.setText(Dictionary.getEntry("editors-actor-mask"));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(10)));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jCheckBox3)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane3.setDividerLocation(120);
        jSplitPane3.setDividerSize(3);
        jSplitPane3.setResizeWeight(0.4);

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
        jScrollPane1.setViewportView(jList1);

        jButton5.setText(Dictionary.getEntry("editors-actor-addevent"));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5))
        );

        jSplitPane3.setLeftComponent(jPanel6);

        jPanel5.setMinimumSize(new java.awt.Dimension(100, 0));

        jButton1.setText(Dictionary.getEntry("editors-actor-addaction"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList3);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .addComponent(jComboBox2, 0, 196, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Actions", null, jPanel1, "Actions");

        jPanel7.setLayout(new java.awt.BorderLayout());
        jTabbedPane2.addTab("Properties", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actions", jPanel4);
        jTabbedPane1.addTab("Fields", field);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void event(int type, String name) {
        //System.out.println("Actor editor:event:type" + type);
        org.gcreator.events.Event e = null;
        if (type == EventSelectListener.CREATE) {
            elist.add(e = new CreateEvent());
        } else if (type == EventSelectListener.DESTROY) {
            elist.add(e = new DestroyEvent());
        } else if (type == EventSelectListener.DRAW) {
            elist.add(e = new DrawEvent());
        } else if (type == EventSelectListener.BEGINSTEP) {
            elist.add(e = new BeginStepEvent());
        } else if (type == EventSelectListener.STEP) {
            elist.add(e = new StepEvent());
        } else if (type == EventSelectListener.ENDSTEP) {
            elist.add(e = new EndStepEvent());
        } else if (type >= EventSelectListener.MOUSELEFTCLICKED && type <= EventSelectListener.MOUSEOUT) {
            elist.add(e = new org.gcreator.events.MouseEvent(type));
        } else if (type >= EventSelectListener.ALARM && type <= EventSelectListener.ALARM + 11) {
            elist.add(e = new org.gcreator.events.AlarmEvent(type - EventSelectListener.ALARM));
        } else if (type >= EventSelectListener.Keyboard && type <= EventSelectListener.Keyboard + 999) {
            elist.add(e = new org.gcreator.events.KeyboardEvent(type - EventSelectListener.Keyboard, name));
        } else if (type >= EventSelectListener.Keypress && type <= EventSelectListener.Keypress + 999) {
            elist.add(e = new org.gcreator.events.KeyPress(type - EventSelectListener.Keypress, name));
        } else if (type >= EventSelectListener.Keyrelease && type <= EventSelectListener.Keyrelease + 999) {
            elist.add(e = new org.gcreator.events.KeyReleased(type - EventSelectListener.Keyrelease, name));
        }
       
        jScrollPane1.updateUI();
        jList1.updateUI();
        updateActionList();
        jList1.setSelectedValue(e, true);
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

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        updateActionList();
        jPanel7.removeAll();
        updateUI();
    }//GEN-LAST:event_jList1ValueChanged
    org.gcreator.actions.Action a = null;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (a != null) {
            a.pattern.save(a.getPanel());
        }
        jPanel7.removeAll();

        //add button            
        if (jList1.getSelectedValue() == null) {
            return;
        }
        if (jList3.getSelectedValue() == null) {
            return;
        }
        ActionPattern ap = (org.gcreator.actions.ActionPattern) ((org.gcreator.actions.ActionPattern) jList3.getSelectedValue()).clone();

        org.gcreator.actions.Action a = new org.gcreator.actions.Action(this, ap);
        ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.add(a);
        changed = true;

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
        actor.persistent = jCheckBox3.isSelected();
        updateNavigator();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jList3.setModel(new DefaultComboBoxModel(((ActionCategory) jComboBox2.getSelectedItem()).patterns));
        jList3.updateUI();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseDragged
        int to = jList2.locationToIndex(evt.getPoint());
        if (to == from) {
            return;
        }
        org.gcreator.actions.Action remove = ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.remove(from);
        ((org.gcreator.events.Event) jList1.getSelectedValue()).actions.add(to, remove);
        from = to;
        updateActionList();
    }//GEN-LAST:event_jList2MouseDragged

    private void jList2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MousePressed
        from = jList2.locationToIndex(evt.getPoint());
    //jList2.updateUI();
    }//GEN-LAST:event_jList2MousePressed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        from = jList1.locationToIndex(evt.getPoint());
        updateUI();
    }//GEN-LAST:event_jList1MousePressed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        jList2.setSelectedIndex(jList2.locationToIndex(evt.getPoint()));
    }//GEN-LAST:event_jList2MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        actor.depth = ((Integer) jSpinner1.getValue()).intValue();
        changed = true;
        updateNavigator();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         EventSelectListener listener = new EventSelectListener() {

            @Override
            public void eventSelected(int type, String name) {
                event(type, name);
                changed = true;
            }

            @Override
            public void eventSelected(int type) {
                event(type, "");
                changed = true;
            }
        };
        EventSelect selector = new EventSelect(this, gcreator.window, true, Toolkit.getDefaultToolkit().getScreenSize().width/2, 
                Toolkit.getDefaultToolkit().getScreenSize().height/2, listener);
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.gcreator.components.ActorFieldPane field;
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
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
    
