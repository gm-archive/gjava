package org.gmj.gmjproject.toolbaractions;

import java.io.File;
import java.io.IOException;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class AddActor extends CallableSystemAction
{
    
    public static int actors = 0;
    
    public void performAction()
    {
        try     {
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            //check if a project is open
            if (pro == null)
           {
            return;   
           }
            
            File f =  new File(pro.getProjectDirectory().getPath()+"\\actors\\NewActor"+actors+".actor");
             while (f.exists()) {
                 actors++;
           f =  new File(pro.getProjectDirectory().getPath()+"\\actors\\NewActor"+actors+".actor");  
            
            };
             pro.getProjectDirectory().getFileObject("actors").createData("NewActor"+actors+".actor");
        }
        catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
}
    
    public String getName()
    {
        return NbBundle.getMessage(AddActor.class, "CTL_AddActor");
    }
    
    protected String iconResource()
    {
        return "org/gmj/gmjproject/toolbaractions/object.png";
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
