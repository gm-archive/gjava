/*
 * SelectFunctionDialog.java
 *
 * Created on August 31, 2008, 6:38 PM
 */
package org.gcreator.actions.components;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.gcreator.autocomplete.GSFunctions;
import org.gcreator.autocomplete.impl.FunctionSuggestion;
import org.gcreator.exceptions.NoSuchFolderException;
import org.gcreator.fileclass.Folder;
import org.gcreator.fileclass.GObject;
import org.gcreator.fileclass.Project;

/**
 *
 * @author  Serge Humphrey
 */
public final class SelectFunctionDialog extends javax.swing.JDialog {

    private static final long serialVersionUID = 2;
    protected FunctionNameEditor editor;
    protected Project project;
    private FunctionNameTextField field;
    private Vector<Thing> list;

    /** Creates new form SelectFunctionDialog
     * @param fnames The function fnames for the list.
     * @param owner The Dialog's owner
     * @param title The title for the dialog.
     * @param e The FunctionNameEditor
     * @param f The FunctionNameTextField.
     */
    SelectFunctionDialog(Frame owner, String title,
            FunctionNameEditor e, FunctionNameTextField field, Project p) {
        super(owner, true);

        this.editor = e;
        this.field = field;
        this.project = p;
        initComponents();
        this.setMinimumSize(new Dimension(getSize()));
        list = new Vector<Thing>(GSFunctions.functions.size() + 10);
        for (FunctionSuggestion f : GSFunctions.functions) {
            list.add(new Thing(f.name, "red", true));
        }

        try {
            findScripts(project.findFolder("$workspace-game-script"));
        } catch (NoSuchFolderException ex) {
            Logger.getLogger(SelectFunctionDialog.class.getName()).log(Level.SEVERE, 
                    "No folder $workspace-game-script", ex);
        }
        Object a[] = list.toArray();
        Arrays.sort(a);
        list.clear();

        for (Object o : a) {
            list.add((Thing) o);
        }

        jList1.setModel(new DefaultListModel() {

            private static final long serialVersionUID = 1;

            @Override
            public int getSize() {
                return list.size();
            }

            @Override
            public Object getElementAt(int index) {
                return list.get(index);
            }
        });
        setLocationRelativeTo(null);
        setTitle(title);
    }

    private void findScripts(Folder f) {
        for (GObject o : f.getChildren()) {
            if (o instanceof Folder) {
                findScripts((Folder) o);
            }
            list.add(new Thing(o.name, "blue", false));
        }
    }

    private static class Thing implements Comparable<Thing> {

        private String text;
        private String name;
        private boolean builtin;
        
        public Thing(String name, String color, boolean builtin) {
            this.name = name;
            this.text = "<html><span style=\"color: " + color + "\">" + name + "</span</html>";
            this.builtin = builtin;
        }

        @Override
        public String toString() {
            return text;
        }

        @Override
        public int compareTo(Thing o) {
            return name.compareToIgnoreCase(o.name);
        }
    }
    
   protected void loadDoc(final String id) {
        jEditorPane1.setText("Loading...");

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    URL url = new URL("http://wiki.g-creator.org/doku.php?id=" + id);
                    URLConnection connection = url.openConnection();
                    BufferedReader inStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine = "";
                    String txt = "";
                    boolean reading = false;
                    while (null != (inputLine = inStream.readLine())) {
                        if (inputLine.equals("    <!-- wikipage start -->")) {
                            reading = true;
                        } else if (inputLine.equals("    <!-- wikipage stop -->")) {
                            reading = false;
                        }
                        if (reading) {
                            txt += inputLine;
                        }
                    }
                    jEditorPane1.setText(txt);
                    inStream.close();
                } catch (Exception e) {
                    System.out.println(e.toString());
                    jEditorPane1.setText(e.toString());
                }
            }
        };
        t.start();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select A Function");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setResizeWeight(0.5);

        jLabel1.setText("Name:");

        jTextField1.setText(editor.getAsText());
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel2.setText("Description:");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jEditorPane1.setBackground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setEditable(false);
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        int i = 0;
        String text = jTextField1.getText();
        while (i < list.size() && list.get(i).name.compareToIgnoreCase(text) < 0) {
            i++;
        }
        jList1.setSelectedIndex(i);
        try {
            Point p = jList1.getUI().indexToLocation(jList1, i);
            p.y -= jList1.getUI().indexToLocation(jList1, 1).y;
            jScrollPane1.getViewport().setViewPosition(p);
        } catch (NullPointerException ex) {//Sometimes happens
            jList1.updateUI();
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((FunctionName) editor.getValue()).name = jTextField1.getText();
        field.setText(jTextField1.getText());
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() >= 2) {
            jTextField1.setText(((Thing) jList1.getSelectedValue()).name);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        Thing t = (Thing)jList1.getSelectedValue();
        if (t.builtin) {
            loadDoc(t.name);
        }
    }//GEN-LAST:event_jList1ValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
