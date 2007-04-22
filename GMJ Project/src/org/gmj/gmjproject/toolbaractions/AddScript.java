package org.gmj.gmjproject.toolbaractions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class AddScript extends CallableSystemAction
{
    public static int scripts;
    
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
                                              "\\scripts\\NewScript" + scripts +
                                              ".java");
            

            while (f.exists()) {
                scripts++;
                f = new java.io.File(pro.getProjectDirectory().getPath() +
                                     "\\scripts\\NewScript" + scripts + ".java");
            }
            ;
            
            pro.getProjectDirectory().getFileObject("scripts").createData("NewScript" +
                                                                         scripts +
                                                                         ".java");
            
            //write to file
            PrintWriter to = new PrintWriter(pro.getProjectDirectory().getFileObject("scripts").getFileObject("NewScript" +
                                                                         scripts +
                                                                         ".java").getOutputStream());
            to.println("package Scripts;" );
            to.println("import org.gjava.runner;" );
            to.println("class "+"NewScript" + scripts +" {" );
            to.println(" // To use gml use gml.<functionname>" );
            to.println(" Functions gml = new Functions();" );
            to.println("    public static void performScript() {");
            to.println("       //TODO add script code here");
            to.println("    }");
            to.println("}");
            to.close();
        }
        catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
}
    
    public String getName()
    {
        return NbBundle.getMessage(AddScript.class, "CTL_AddScript");
    }
    
    protected String iconResource()
    {
        return "org/gmj/gmjproject/toolbaractions/script.png";
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
