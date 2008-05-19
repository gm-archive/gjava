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
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       //setLocation(0, 0);
       //setSize(Toolkit.getDefaultToolkit().getScreenSize());
       //setExtendedState(MAXIMIZED_BOTH);
       if((getExtendedState()&MAXIMIZED_BOTH)!=0){
           System.out.println("MAXIMIZED");
       }
       else{
           System.out.println("NOT MAXIMIZED");
       }
       //setContentPane(gcreator.panel);
    }
    //</editor-fold>

    public void updateUI() {
        ((JPanel) this.getContentPane()).updateUI();
    }
    
    public void dispose(){
        gcreator.panel.dispose();
    }
    
    //<editor-fold defaultstate="collapsed" desc="disposeIt">
    @Override
    public void disposeIt() {
        System.exit(0);
        super.dispose();
    }
    //</editor-fold>
    
    public Window getParentWindow(){
        return this;
    }
}
