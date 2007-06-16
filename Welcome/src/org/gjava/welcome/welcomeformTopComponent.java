package org.gjava.welcome;

import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.logging.Logger;
import javax.swing.text.html.HTMLEditorKit;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
//import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
final class welcomeformTopComponent extends TopComponent {
    
    private static welcomeformTopComponent instance;
    /** path to the icon used by the component and its open action */
    //    static final String ICON_PATH = "SET/PATH/TO/ICON/HERE";
    
    private static final String PREFERRED_ID = "welcomeformTopComponent";
    
    private welcomeformTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(welcomeformTopComponent.class, "CTL_welcomeformTopComponent"));
        setToolTipText(NbBundle.getMessage(welcomeformTopComponent.class, "HINT_welcomeformTopComponent"));
        //        setIcon(Utilities.loadImage(ICON_PATH, true
        MainTextArea.setEditorKit(new HTMLEditorKit());
    try {
       // String s = NbBundle.getMessage(welcomeformTopComponent.class, "WelcomeDocument");
        URL demoDetailsURL = new URL("http://www.g-java.com/");
        
        MainTextArea.setPage(demoDetailsURL);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTextArea = new javax.swing.JEditorPane();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, "<html>Welcome to G-Java! Module still in development</b> For now just goto <a href=\"http://www.g-java.com\">G-Java.com</a></html");

        jScrollPane1.setViewportView(MainTextArea);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane MainTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link findInstance}.
     */
    public static synchronized welcomeformTopComponent getDefault() {
        if (instance == null) {
            instance = new welcomeformTopComponent();
        }
        return instance;
    }
    
    /**
     * Obtain the welcomeformTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized welcomeformTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(welcomeformTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof welcomeformTopComponent) {
            return (welcomeformTopComponent)win;
        }
        Logger.getLogger(welcomeformTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID +
                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }
    
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }
    
    public void componentOpened() {
        // TODO add custom code on component opening
    }
    
    public void componentClosed() {
        // TODO add custom code on component closing
    }
    
    /** replaces this in object stream */
    public Object writeReplace() {
        return new ResolvableHelper();
    }
    
    protected String preferredID() {
        return PREFERRED_ID;
    }
    
    final static class ResolvableHelper implements Serializable {
        private static final long serialVersionUID = 1L;
        public Object readResolve() {
            return welcomeformTopComponent.getDefault();
        }
    }
    
}
