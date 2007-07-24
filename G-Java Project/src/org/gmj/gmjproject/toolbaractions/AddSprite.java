/*
 * AddSprite.java
 * 
 * Created on 23-Jul-2007, 16:47:32
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gmj.gmjproject.toolbaractions;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

/**
 *
 * @author Administrator
 */
public class AddSprite extends CallableSystemAction
{
    
    public static int sprites = 0;
    
    public void performAction()
    {
        try     {
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            //check if a project is open
            if (pro == null)
           {
                JOptionPane.showMessageDialog(null, "No project open!");
            return;   
           }

            
            File f =  new File(pro.getProjectDirectory().getPath()+"\\Sprites\\NewSprite"+sprites+".sprite");
             while (f.exists()) {
                 sprites++;
           f =  new File(pro.getProjectDirectory().getPath()+"\\Sprites\\NewSprite"+sprites+".sprite");  
            
            };
             pro.getProjectDirectory().getFileObject("Sprites").createData("NewSprite"+sprites+".sprite");
        }
        catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
}
    
    public String getName()
    {
        return "Add Sprite";
    }
    
    protected String iconResource()
    {
        return "org/gmj/gmjproject/toolbaractions/Add_Sprite_1.png";
    }
    
    public HelpCtx getHelpCtx()
    {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous()
    {
        return false;
    }
    
}

