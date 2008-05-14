package org.gcreator.core;

//<editor-fold defaultstate="collapsed" desc="import">
import java.awt.*;
import javax.swing.*;
//</editor-fold>

/**
 * Aurwindow is G-Creator main frame.<br/>
 * It contains several functions essential in G-Creator, including an important
 * part of the user interface.
 * @author Luís Reis
 * @author TGMG
 */
public class Aurwindow extends JFrame implements ICore{

    //<editor-fold defaultstate="collapsed" desc="Aurwindow">
    protected Aurwindow(String[] settings) {
       gcreator.panel = new GPanel(this, settings);
       gcreator.panel.setVisible(true);
       setLayout(new BorderLayout());
       add(gcreator.panel, BorderLayout.CENTER);
       //setContentPane(gcreator.panel);
    }
    //</editor-fold>

    public void updateUI() {
        ((JPanel) this.getContentPane()).updateUI();
    }
    
    //<editor-fold defaultstate="collapsed" desc="dispose">
    @Override
    public void dispose() {
        System.exit(0);
        super.dispose();
    }
    //</editor-fold>
    
    public Window getParentWindow(){
        return this;
    }
}
