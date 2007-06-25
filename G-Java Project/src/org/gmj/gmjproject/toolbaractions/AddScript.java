package org.gmj.gmjproject.toolbaractions;


import java.io.IOException;
import java.io.PrintWriter;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.openide.loaders.DataFolder;
import org.openide.nodes.Node;
import org.openide.nodes.*;

public final class AddScript extends CallableSystemAction {
    public static int scripts;
    
   public static NodeOperation n = NodeOperation.getDefault();
    
    public void performAction() {
        
        
        
        
        try     {
            org.netbeans.api.project.Project pro = org.netbeans.api.project.ui.OpenProjects.getDefault().getMainProject();
            //check if a project is open
            if (pro == null) {
                return;
            }
            java.io.File f = new java.io.File(pro.getProjectDirectory().getPath() +
                    "\\org\\gjava\\runner\\scripts\\NewScript" + scripts +
                    ".java");
            
            
            while (f.exists()) {
                scripts++;
                f = new java.io.File(pro.getProjectDirectory().getPath() +
                        "\\org\\gjava\\runner\\scripts\\NewScript" + scripts + ".java");
            }
            ;
            
            pro.getProjectDirectory().getFileObject("org").getFileObject("gjava").getFileObject("runner").getFileObject("scripts").createData("NewScript" +
                    scripts +
                    ".java");
//            pro.getProjectDirectory().getFileObject("Scripts").createData("NewScript" +
//                    scripts +
//                    ".java");
            //write to file
            PrintWriter to = new PrintWriter(pro.getProjectDirectory().getFileObject("org").getFileObject("gjava").getFileObject("runner").getFileObject("scripts").getFileObject("NewScript" +
                    scripts +
                    ".java").getOutputStream());
            to.println("package org.gjava.runner.scripts;" );
            to.println("import org.gjava.runner.*;" );
            to.println("class "+"NewScript" + scripts +" {" );
            //to.println(" // To use gml/gjl use g.<functionname>" );
            //to.println(" Functions g = new Functions();" );
            to.println("    public static void performScript() {");
            to.println("       //TODO add script code here");
            to.println("    }");
            to.println("}");
            to.close();
            //            pro.getProjectDirectory().getFileObject("org").getFileObject("gjava").getFileObject("runner").getFileObject("scripts").getFileObject("NewScript" +
            //                                                                         scripts +
            //                                                                         ".java")
            
            DataFolder theDataObject =
                    DataFolder.findFolder(pro.getProjectDirectory().getFileObject("org").getFileObject("gjava").getFileObject("runner").getFileObject("scripts"));
            
            
            
            //Get its default node - we'll wrap our node around it to change the
            //display name, icon, etc.
            Node realScriptsFolderNode = theDataObject.getNodeDelegate();
            //realScriptsFolderNode.getPreferredAction().actionPerformed(new ActionEvent(this,0,""));
            //DataObject datao = (DataObject)realScriptsFolderNode.getCookie(DataObject.class);
           // datao.getFolder()
//            realScriptsFolderNode = new Node(realScriptsFolderNode.getChildren()){
//
//                
//public Node.Cookie getCookie(Class clazz) {
//        if (clazz.isAssignableFrom(DataFolder.Index.class)) {
//            DataFolder folder = (DataFolder)super.getCookie(DataFolder.class);
//            if (folder != null) {
//                return new DataFolder.Index(folder, this);
//            }
//        }
//        return super.getCookie(clazz);
//    }
//        
//                public Node cloneNode() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Image getIcon(int arg0) {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Image getOpenedIcon(int arg0) {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public HelpCtx getHelpCtx() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public boolean canRename() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public boolean canDestroy() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public PropertySet[] getPropertySets() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Transferable clipboardCopy() throws IOException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Transferable clipboardCut() throws IOException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Transferable drag() throws IOException {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public boolean canCopy() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public boolean canCut() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public PasteType[] getPasteTypes(Transferable arg0) {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public PasteType getDropType(Transferable arg0, int arg1, int arg2) {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public NewType[] getNewTypes() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public boolean hasCustomizer() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Component getCustomizer() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//
//                public Handle getHandle() {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                }
//};
            n.explore(realScriptsFolderNode);
            
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public AddScript() {
    }
    
    public String getName() {
        return NbBundle.getMessage(AddScript.class, "CTL_AddScript");
    }
    
    protected String iconResource() {
        return "org/gmj/gmjproject/toolbaractions/Add_Script_1.png";
    }
    
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
}
