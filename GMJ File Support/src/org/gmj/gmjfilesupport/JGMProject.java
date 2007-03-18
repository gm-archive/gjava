/*
 * GMJProject.java
 *
 * Created on 22 February 2007, 19:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gmj.gmjfilesupport;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.ErrorManager;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;
import org.openide.util.Utilities;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author ali1
 */
public final class JGMProject implements Project {
    public static final String ROOMS_DIR = "rooms";
    public static final String IMAGES_DIR = "images";
     public static final String ACTORS_DIR = "actors";
    
    private final FileObject projectDir;
    LogicalViewProvider logicalView = new JGMLogicalView(this);
    private final ProjectState state;
    
    public JGMProject(FileObject projectDir, ProjectState state) {
        this.projectDir = projectDir;
        this.state = state;
    }
    
    public FileObject getProjectDirectory() {
        return projectDir;
    }
    
    FileObject getRoomsFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(ROOMS_DIR);
        
        if (result == null && create) {
            try {
                result = projectDir.createFolder(ROOMS_DIR);
            } catch (IOException ioe) {
                ErrorManager.getDefault().notify(ioe);
            }
        }
        return result;
    }
    
    FileObject getImagesFolder(boolean create) {
        FileObject result =
                projectDir.getFileObject(IMAGES_DIR);
        if (result == null && create) {
            try {
                result = projectDir.createFolder(IMAGES_DIR);
            } catch (IOException ioe) {
                ErrorManager.getDefault().notify(ioe);
            }
        }
        return result;
    }
    
    private Lookup lkp;
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[] {
                this,  //project spec requires a project be in its own lookup
                state, //allow outside code to mark the project as needing saving
                new ActionProviderImpl(), //Provides standard actions like Build and Clean
                loadProperties(), //The project properties
                new Info(), //Project information implementation
                logicalView, //Logical view of project implementation
            });
           
        } else {
            ErrorManager.getDefault().log("Error: Didn't load Lookup!");
        }
         return lkp;
    }
    
    private Properties loadProperties() {
        FileObject fob = projectDir.getFileObject(JGMProjectFactory.PROJECT_DIR +
                "/" + JGMProjectFactory.PROJECT_PROPFILE);
        Properties properties = new NotifyProperties(state);
        if (fob != null) {
            try {
                properties.load(fob.getInputStream());
            } catch (Exception e) {
                ErrorManager.getDefault().notify(e);
            }
        }
        return properties;
    }
    
    private static class NotifyProperties extends Properties {
        private final ProjectState state;
        NotifyProperties(ProjectState state) {
            this.state = state;
        }
        
        public Object put(Object key, Object val) {
            Object result = super.put(key, val);
            if (((result == null) != (val == null)) || (result != null &&
                    val != null && !val.equals(result))) {
                state.markModified();
            }
            return result;
        }
    }
    
    private final class ActionProviderImpl implements ActionProvider {
        public String[] getSupportedActions() {
            return new String[0];
        }
        
        public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
            //do nothing
        }
        
        public boolean isActionEnabled(String string, Lookup lookup) throws IllegalArgumentException {
            return false;
        }
    }
    
    /** Implementation of project system's ProjectInformation class */
    private final class Info implements ProjectInformation {
        public Icon getIcon() {
            return new ImageIcon(Utilities.loadImage(
                     "org/gmj/gmjfilesupport/room.png"));
        }
        
        public String getName() {
            return getProjectDirectory().getName();
        }
        
        public String getDisplayName() {
            return getName();
        }
        
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
            //do nothing, won't change
        }
        
        public Project getProject() {
            return JGMProject.this;
        }
    }
    
    
}



