/*
 * Action.java
 * 
 * Created on 26/Set/2007, 15:58:46
 * 
 * An ActionPattern owns NO VALUES.
 */

package actions;

import editors.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Luís
 */
public class ActionPattern {
    private ImageIcon icon;
    public ActionPattern(ActorEditor editorcontext){
        icon = new ImageIcon();
    }
    
    public JPanel createNewPanel(Action action){
        return new JPanel();
    }
    
    public void setStandardImage(ImageIcon icon){
        this.icon = icon;
    }
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public String getStandardText(JPanel panel){
        return "";
    }
    
    public String generateEGML(JPanel panel){
        return "";
    }
    
    public Color getBackground(){
        return Color.WHITE;
    }
    
    public Color getSelectedBackground(){
        return Color.BLUE;
    }
    
    public Color getForeground(){
        return Color.BLACK;
    }
    
    public Color getSelectedForeground(){
        return Color.WHITE;
    }
    
    public String writeXml(JPanel panel){
        return "";
    }
}
