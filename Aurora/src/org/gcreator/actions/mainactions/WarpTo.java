/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.actions.mainactions;

import org.gcreator.actions.*;
import javax.swing.*;
import org.gcreator.actions.components.HSpeedEditor;
import org.gcreator.actions.components.WarpToEditor;
import org.gcreator.fileclass.Project;

/**
 *
 * @author Luís
 */
public class WarpTo extends ActionPattern {
static final long serialVersionUID = 1L;
    //public PlainTextPanel panel = new PlainTextPanel();

    public String who = "", to_x = "", to_y = "";
    
    public static ImageIcon icon = new ImageIcon(WarpTo.class.getResource("/org/gcreator/actions/images/warp.png"));

    //ActorEditor context;

    public WarpTo() {
        super();
        //this.context = context;
    }
    
    @Override
    public void save(JComponent panel){
        who = ((WarpToEditor) panel).of.getText();
        to_x = ((WarpToEditor) panel).X.getText();
        to_y = ((WarpToEditor) panel).Y.getText();
    }
    
    @Override
    public void load(JComponent panel){
        ((WarpToEditor) panel).of.setText(who);
        ((WarpToEditor) panel).X.setText(to_x);
        ((WarpToEditor) panel).Y.setText(to_y);
    }
    
    public ImageIcon getStandardImage(){
        return icon;
    }
    
    public void setStandardImage(ImageIcon img){
        icon = img;
    }

    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
         return new WarpToEditor();
    }

    public String getStandardText(JComponent panel) {
        if(panel != null&& panel instanceof WarpToEditor){
            save(panel);
            WarpToEditor editor = (WarpToEditor) panel;
            String who = editor.of.getText();
            if(who==null)
                who = "null";
            String x = editor.X.getText();
            if(x==null)
                x = "0";
            String y = editor.Y.getText();
            if(y==null)
                y = "0";
            return "Warp " + who + " to (" + x + ", " + y + ")";
        }
        return "Warp to";
    }

    public String generateGCL(JComponent panel) {
        if(panel != null&& panel instanceof WarpToEditor){
            WarpToEditor editor = (WarpToEditor) panel;
            save(panel);
            String s = "";
            String who = editor.of.getText();
            s += "(" + who + ").setX(" + editor.X.getText() + ");\n";
            s += "(" + who + ").setY(" + editor.Y.getText() + ");\n";
            return s;
        }
        return "";
    }
}