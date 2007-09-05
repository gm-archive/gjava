/*
 * NewProject.java
 *
 * Created on 4 de Setembro de 2007, 23:55
 */


//I had to made this a normal class because NetBeans designer didn't allow me to do what I wanted to.
package components;

import core.Aurwindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import managers.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import fileclass.*;

/**
 *
 * @author  Luís
 */
public class NewProject extends TabPanel {

    /** Creates new form NewProject */


    public NewProject() {
        initComponents(core.aurora.window);
        //jLabel1.setText(LangSupporter.activeLang.getEntry(54));
        //jLabel2.setText(LangSupporter.activeLang.getEntry(60));
        //jLabel3.setVisible(false);
    }

    private void initComponents(final Aurwindow wind) {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jTextField1 = new JTextField();
        ptypes = new ProjectTypes(this);
        jLabel3 = new JLabel();

        jLabel1.setText(LangSupporter.activeLang.getEntry(54));

        jLabel2.setText(LangSupporter.activeLang.getEntry(60));

        jLabel3.setVisible(false);

        jButton1.setText(LangSupporter.activeLang.getEntry(94));
        jButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("create new project");
                Project project = new GameProject(jTextField1.getText(), "");

                project.add(new Group(project, "Sprites"));
                project.add(new Group(project, "Sounds"));
                project.add(new ActorGroup(project, "Actors"));
                project.add(new SceneGroup(project, "Scenes"));
                project.add(new Group(project, "Extensions"));
                project.add(new fileclass.File(project, "Settings", "settings", ""));
                
                ProjectTree.importFolderToTree(project, wind.top);
                
                wind.workspace.updateUI();
            }
        });
        jTextField1.setText("");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(ptypes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(jLabel2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1)).addComponent(jLabel3)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(ptypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jButton1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));
    } // </editor-fold>

    // Variables declaration
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private ProjectTypes ptypes;
    public JTextField jTextField1;
    // End of variables declaration
}
