package org.gmj.gmjproject.toolbaractions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.netbeans.api.project.Project;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.netbeans.api.project.ui.OpenProjects;


public final class AddSound extends CallableSystemAction
{
    
    public void performAction()
    {
             org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
                     //check if a project is open
            if (pro == null)
           {
                JOptionPane.showMessageDialog(null, "No project open!");
            return;   
           }
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        JFileFilter filter = new JFileFilter(".*\\.wav|.*\\.mid|.*\\.midi","Audio Files  (*.wav *.midi)");
        
        
        fc.addChoosableFileFilter(filter);
        fc.setFileFilter(filter);
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File f = fc.getSelectedFile();
            if (!f.exists())
            {
                JOptionPane.showMessageDialog(null,"File not found","G-Java",0);
                return;
            }
            else
            {
                try
                {
               
                    copyFile(f, new java.io.File(pro.getProjectDirectory().getPath()+"/sounds/"+f.getName()));
                }
                catch (Exception ex)
                {
                    Exceptions.printStackTrace(ex);
                }
            }
        }
        
        
        
    }
    
    public void copyFile(File in, File out) throws Exception
    {
        FileInputStream fis  = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out);
        byte[] buf = new byte[1024];
        int i = 0;
        while((i=fis.read(buf))!=-1)
        {
            fos.write(buf, 0, i);
        }
        fis.close();
        fos.close();
    }
    
    public String getName()
    {
        return NbBundle.getMessage(AddSound.class, "CTL_AddSound");
    }
    
    protected String iconResource()
    {
        return "org/gmj/gmjproject/toolbaractions/Add_Sound_1.png";
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

