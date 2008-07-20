/*
 * SoundEditor.java
 *
 * Created on 20 de Julho de 2008, 13:45
 */

package org.gcreator.editors;

import java.io.File;
import javax.swing.JFileChooser;
import org.gcreator.components.JFileFilter;
import org.gcreator.components.TabPanel;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Project;
import com.golden.gamedev.engine.BaseAudio;
import com.golden.gamedev.engine.BaseAudioRenderer;
import com.golden.gamedev.engine.audio.MidiRenderer;
import com.golden.gamedev.engine.audio.WaveRenderer;
import java.awt.Color;
import java.net.URL;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 *
 * @author  luis
 */
public class SoundEditor extends TabPanel {

    public File efile = null;
    public boolean changed = false;
    public WaveRenderer wave = new WaveRenderer();
    public MidiRenderer midi = new MidiRenderer();
    
    /** Creates new form SoundEditor
     */
    public SoundEditor(GFile f, Project unused) {
        this.file = f;
        if(f.value!=null){
            efile = (File) f.value;
        }
        initComponents();
        updateComponents();
        jTextField1.setText(file.name);
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent evt){
                perform();
            }
            public void removeUpdate(DocumentEvent evt){
                perform();
            }
            public void insertUpdate(DocumentEvent evt){
                perform();
            }
        });
        perform();
    }
    
    public void perform(){
        String name = jTextField1.getText();
        if(name.matches("[a-zA-Z_][a-zA-Z_0-9]*")){
            jTextField1.setBackground(Color.WHITE);
            file.name = name;
            org.gcreator.core.gcreator.panel.workspace.updateUI();
        }
        else{
            jTextField1.setBackground(Color.RED);
        }
    }
    
    public void dispose(){
        wave.stop();
        midi.stop();
        super.dispose();
    }
    
    public void updateComponents(){
        if(efile==null){
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
        else{
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
        }
    }
    
    public boolean Save(){
        file.value = efile;
        changed = false;
        return true;
    }
    
    public boolean canSave(){
        return changed;
    }
    
    public boolean wasModified(){
        return changed;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setText("Sound: ");

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 13), new java.awt.Color(0, 19, 255))); // NOI18N

        jButton2.setText("Play");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser fc = new JFileChooser();
    if(efile!=null)
        fc.setCurrentDirectory(efile.getParentFile());
    fc.addChoosableFileFilter(new JFileFilter(".*\\.(wav|mid|ogg)", "Sound file"));
    fc.addChoosableFileFilter(new JFileFilter(".*\\..*", "Any file"));
    fc.setApproveButtonText("OK");
    fc.setDialogTitle("Select sound file");
    int res = fc.showDialog(this, null);
    if(res==JFileChooser.APPROVE_OPTION){
        wave.stop();
        midi.stop();
        efile = fc.getSelectedFile();
        try{
        String cp = efile.getCanonicalPath();
        String type = cp.substring(cp.lastIndexOf(".")+1);
        if(type.equals("mid")){
            file.type = "mid";
            midi.setVolume(1.0f);
            midi.play(efile.toURI().toURL());
        }
        else if(type.equals("wav")){
            file.type = "wav";
            System.out.println("Got here");
            wave.setVolume(1.0f);
            wave.play(efile.toURI().toURL());
        }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        changed = true;
        updateComponents();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    wave.stop();
    midi.stop();
    
    if(efile!=null){
        try{
        String cp = efile.getCanonicalPath();
        String type = cp.substring(cp.lastIndexOf(".")+1);
        if(type.equals("mid")){
            midi.setVolume(1.0f);
            midi.play(efile.toURI().toURL());
        }
        else if(type.equals("wav")){
            System.out.println("Got here");
            wave.setVolume(1.0f);
            wave.play(efile.toURI().toURL());
        }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    wave.stop();
    midi.stop();
}//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
