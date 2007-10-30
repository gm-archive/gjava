package org.gcreator.compilers.gjava.components;
import java.awt.*;
import javax.swing.*;
import java.awt.event.
        ////////////////////////////////////////
        *;
import org.gcreator.compilers.gjava.core.GameSettings;
import org.gcreator.compilers.gjava.core.basicgame;


/**
 * An extended JFrame used for adding rooms
 * @author G-Java development team
 * @version 1.0
 */
public class GameFrame extends JFrame implements WindowListener {
    String next_room, caption;
    boolean persistent;
    
    /**
     * The width of the Room
     */
    public static int width;
    
    /**
     * The height of the Room
     */
    public static int height;
    Color backcolor;
    
    /**
     * Crate a new Room object
     * @param width
     * @param height
     * @param decorated
     * @param backcolor
     */
    public GameFrame(int width, int height, Color backcolor) {
        GameFrame.width = width;
        GameFrame.height = height;
        this.backcolor = backcolor;
        setBackground(backcolor);
        this.setTitle("Loading...");
        
            setResizable(GameSettings.ResizeFrame);
        this.addWindowListener(this);
        
        //TODO below
//        if (decorated == false) {
//            
//            setUndecorated(true);
//        } else {
//            setUndecorated(false);
//        }
        // execute the creation code
        //	basicgame.get_room_creation_code(this);
        
        pack();
        
        //reshape(50,50,width+insets().left+insets().right,height+insets().top+insets().bottom);
        
        this.setBounds(50,50,width,height);
        //setLocationRelativeTo(null);
    }
    
    
    /**
     * Close the room
     */
//    public void exitroom() {
//        dispose();
//    }
    
    /**
     * Centre a JFrame on the screen
     * @param frame 
     */
    public static void center(JFrame frame) {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height)
            frameSize.height = screenSize.height;
        if (frameSize.width > screenSize.width)
            frameSize.width = screenSize.width;
        frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        //frame.setVisible(true);
        
    }
    
    
    public void windowClosing(WindowEvent e) {
      //  JOptionPane.showMessageDialog(null,"Closing :(");
       //        basicgame.Running = false;
        //        room0.end();
        dispose();
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent e) {
        JOptionPane.showMessageDialog(null,"Closed :)");
        System.out.println("closed");
        //room0.end();
        System.exit(0);
    }
    
    public void windowOpened(WindowEvent e) {
        //
    }
    
    public void windowIconified(WindowEvent e) {
        //
    }
    
    public void windowDeiconified(WindowEvent e) {
        //JOptionPane.showMessageDialog(null,"Closing :)");
    }
    
    public void windowActivated(WindowEvent e) {
        //JOptionPane.showMessageDialog(null,"Activated!");
    }
    
    public void windowDeactivated(WindowEvent e) {
        //
    }
}