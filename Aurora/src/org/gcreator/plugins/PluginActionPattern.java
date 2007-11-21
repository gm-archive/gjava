/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

import org.gcreator.actions.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class PluginActionPattern extends ActionPattern{
    public ImageIcon img;
    
    public String generateGCL(JComponent comp){
        return "";
    }
    
    public ImageIcon getStandardImage(){
        return img;
    }
    
    public void setStandardImage(ImageIcon img){
        this.img = img;
    }
}
