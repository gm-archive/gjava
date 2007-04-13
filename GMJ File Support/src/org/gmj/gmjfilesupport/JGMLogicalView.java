/*
 * JGMLogicalView.java
 *
 * Created on 22 February 2007, 19:42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gmj.gmjfilesupport;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.ErrorManager;
import org.openide.actions.FileSystemAction;
import org.openide.actions.NewTemplateAction;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;

/**
 *
 * @author ali1
 */
public class JGMLogicalView implements LogicalViewProvider {
    
    private final JGMProject project;
    
    public JGMLogicalView(JGMProject project) {
        this.project = project;
    }
    
    
    
    public org.openide.nodes.Node createLogicalView() {
        try {
            //Get the rooms directory, creating if deleted
            FileObject dir = project.getProjectDirectory();//.getRoomsFolder(true);
            
            //Get the DataObject that represents it
            DataFolder theDataObject =
                    DataFolder.findFolder(dir);
            
            //Get its default node - we'll wrap our node around it to change the
            //display name, icon, etc.
            Node realRoomsFolderNode = theDataObject.getNodeDelegate();
            
            //This FilterNode will be our project node
            return new RoomsNode(realRoomsFolderNode, project);
        } catch (DataObjectNotFoundException donfe) {
            ErrorManager.getDefault().notify(donfe);
            //Fallback - the directory couldn't be created -
            //read-only filesystem or something evil happened
            return new AbstractNode(Children.LEAF);
        }
    }
    
    /** This is the node you actually see in the project tab for the project */
    private static final class RoomsNode extends FilterNode {
        final JGMProject project;
        public RoomsNode(Node node, JGMProject project) throws DataObjectNotFoundException {
            super(node, new FilterNode.Children(node),
                    //The projects system wants the project in the Node's lookup.
                    //NewAction and friends want the original Node's lookup.
                    //Make a merge of both
                    new ProxyLookup(new Lookup[] { Lookups.singleton(project),
                    node.getLookup() }));
            this.project = project;
        }
        
        public Image getIcon(int type) {
            return Utilities.loadImage(
                    "org/gmj/gmjfilesupport/room.png");
        }
        
        public Image getOpenedIcon(int type) {
            return getIcon(type);
        }
        
        public String getDisplayName() {
            return project.getProjectDirectory().getName();
        }
            /**
     * 
     * @param popup 
     * @return 
     */
    public Action[] getActions(boolean popup) {
        Action[] result = new Action[] {
           /* new ProjectAction(ActionProvider.COMMAND_BUILD,
                    NbBundle.getMessage(JGMLogicalView.class, "LBL_Build"),
                    project),
                    new ProjectAction(ActionProvider.COMMAND_CLEAN,
                    NbBundle.getMessage(JGMLogicalView.class, "LBL_Clean"),
                    project),*/
                    new OtherProjectAction(project, false),
                    SystemAction.get(NewTemplateAction.class),
                    SystemAction.get(FileSystemAction.class),
                    new OtherProjectAction(project, true),
        };
        return result;
    }
    }
    
    

    
    private static class ProjectAction extends AbstractAction {
        private final JGMProject project;
        private final String command;
        public ProjectAction(String cmd, String displayName, JGMProject prj) {
            this.project = prj;
            putValue(NAME, displayName);
            this.command = cmd;
        }
        
        public void actionPerformed(ActionEvent actionEvent) {
            ActionProvider prov = (ActionProvider)
                    project.getLookup().lookup(ActionProvider.class);
            prov.invokeAction(command, null);
        }
        
        public boolean isEnabled() {
            ActionProvider prov = (ActionProvider)
                    project.getLookup().lookup(ActionProvider.class);
            return prov.isActionEnabled(command, null);
        }
    }
    
    private static class OtherProjectAction extends AbstractAction {
        private final JGMProject project;
        private final boolean isClose;
        OtherProjectAction(JGMProject project, boolean isClose) {
            putValue(NAME, NbBundle.getMessage(JGMLogicalView.class,
                    isClose ? "LBL_CloseProject" : "LBL_SetMainProject"));
            this.project = project;
            this.isClose = isClose;
        }
        
        public void actionPerformed(ActionEvent actionEvent) {
            if (isClose) {
                OpenProjects.getDefault().close(new Project[] { project });
            } else {
                OpenProjects.getDefault().setMainProject(project);
            }
        }
        
        
    }
    
    public Node findPath(Node root, Object target) {
        //leave unimplemented for now
        return null;
    }
}

