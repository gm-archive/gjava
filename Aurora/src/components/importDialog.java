/*
 * importDialog.java
 *
 * Created on 5 de Outubro de 2007, 16:23
 */

package components;

import interaction.ImportGM6;
import javax.swing.AbstractListModel;

/**
 *
 * @author  Luís
 */
public class importDialog extends javax.swing.JDialog {
    
    static AbstractListModel gpffile = new AbstractListModel() {
            String[] strings = { "Old Game Maker Project (*.gmd)"
                    , "Game Maker 6 Project (*.gm6)"
                    , "Game Maker 7 Project (*.gmk)"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
   };
    
   static AbstractListModel epffile = new AbstractListModel() {
            String[] strings = { "Game Maker Library (*.lib)"
                    , "Game Maker 7 Extension (*.gmp, *.ged)"
                    , "Lateral Game Maker Library (*.lgl)"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
   };
        
   static AbstractListModel pffolder = new AbstractListModel() {
            String[] strings = { "Old-style G-Creator Project (NetBeans project)" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
   };
   
   static AbstractListModel res = new AbstractListModel() {
            String[] strings = { "Image (*.png)"
                    , "Sprite (*.sprite)"
                    , "Actor (*.actor)"
                    , "Scene (*.scene)"};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
   };
    
    /** Creates new form importDialog */
    public importDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Import...");
        setResizable(false);

        jLabel1.setText("Import");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Game Project from file", "Extension Project from file", "Project from folder", "Resource from file" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jList1.setModel(gpffile);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 424, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().toString().equals("Game Project from file"))
            jList1.setModel(gpffile);
        if(jComboBox1.getSelectedItem().toString().equals("Extension Project from file"))
            jList1.setModel(epffile);
        if(jComboBox1.getSelectedItem().toString().equals("Project from folder"))
            jList1.setModel(pffolder);
        if(jComboBox1.getSelectedItem().toString().equals("Resource from file"))
            jList1.setModel(res);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selection = (String) jList1.getSelectedValue();
        if(selection.equals("Game Maker 6 Project (*.gm6)")){
            importGM6File();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void importGM6File(){
        try{
            ImportGM6 gm6 = interaction.ImportGM6.callDialog(this);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
