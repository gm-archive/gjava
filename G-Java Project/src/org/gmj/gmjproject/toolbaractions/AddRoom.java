package org.gmj.gmjproject.toolbaractions;

import java.io.File;
import java.io.IOException;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class AddRoom extends CallableSystemAction
{
     public static int rooms = 0;
    
    public void performAction()
    {
                 try     {
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
             //check if a project is open
            if (pro == null)
           {
            return;   
           }
            
            java.io.File f = new java.io.File(pro.getProjectDirectory().getPath() +
                                              "\\rooms\\NewRoom" + rooms +
                                              ".room");

            while (f.exists()) {
                rooms++;
                f = new java.io.File(pro.getProjectDirectory().getPath() +
                                     "\\rooms\\NewRoom" + rooms + ".room");
            }            ;
            
            pro.getProjectDirectory().getFileObject("rooms").createData("NewRoom" +
                                                                  rooms +
                                                                  ".room");
        }
        catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
}
    
    public String getName()
    {
        return NbBundle.getMessage(AddRoom.class, "CTL_AddRoom");
    }
    
    protected String iconResource()
    {
        return "org/gmj/gmjproject/toolbaractions/Add_Room_1.png";
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
