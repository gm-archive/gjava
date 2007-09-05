/*
 * TabPanel.java
 * 
 * Created on 24/Ago/2007, 17:37:01
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import core.Aurwindow;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class TabPanel extends JPanel{
    public Aurwindow parent;
    public ExtendedFrame frame;
    public String title;
    
    public void dispose(){
        parent.remove(this, frame);
    }
    
    public boolean canSave(){
        return false;
    }
    
    public boolean Save(String file){
        return true; //Sucessfully saved
    }
    
    public boolean wasModified(){
        return false; //Allows the application to exit without prompting the user
    }
    
    public boolean canFind(){
        return false;
    }
    
    public boolean canReplace(){
        return false;
    }
    
    public boolean Find(String str){
        return false; //Could not find string
    }
    
    public boolean Replace(String match, String replace){
        return false; //Could not replace
    }
    
    public boolean ReplaceAll(String match, String replace){
        return false; //Could not replace
    }
}
