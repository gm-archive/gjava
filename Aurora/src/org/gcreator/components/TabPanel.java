/*
 * TabPanel.java
 * 
 * Created on 24/Ago/2007, 17:37:01
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.components;

import org.gcreator.core.Aurwindow;
import org.gcreator.fileclass.Project;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class TabPanel extends JPanel{
    public Aurwindow parent;
    public ExtendedFrame frame;
    public String title = "<none>";
    public Project project;
    
    public void dispose(){
       
        if (!wasModified()) {
             parent.remove(this, frame);
        } else {
            java.lang.Object[] options = {"Yes",
                    "No",
                    "Cancel"};
            int n = JOptionPane.showOptionDialog(frame,
                    "You have unsaved changes in your document.\n" +
                    "Do you want to save it?",
                    "Save document?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (Save()) {
                     parent.remove(this, frame);
                }
            }
            if (n == JOptionPane.NO_OPTION) {
                 parent.remove(this, frame);
            }
        }
    }
    
    public boolean canSave(){
        return false;
    }
    
    public boolean Save(){
        return true; //Sucessfully saved
    }
    
    public boolean Load()
    {
        return true;
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
    
    public boolean Find(String str, boolean useRegex){
        //Case insensitive should be generated previously
        return false; //Could not find string
    }
    
    public boolean Replace(String match, String replace, boolean useRegex){
        return false; //Could not replace
    }
    
    public boolean ReplaceAll(String match, String replace, boolean useRegex){
        return false; //Could not replace
    }
    
    public String toString(){
        return title;
    }
}
