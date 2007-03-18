/*
 * PovProjectFactory.java
 *
 * Created on 22 February 2007, 18:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gmj.gmjfilesupport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;


/**
 *
 * @author ali1
 */
public class JGMProjectFactory implements ProjectFactory {
    public static final String PROJECT_DIR = "JGMproject";
    public static final String PROJECT_PROPFILE = "project.settings";

    
    
    /** Creates a new instance of PovProjectFactory */
    public JGMProjectFactory() {
    }

    public boolean isProject(FileObject projectDirectory) {
        return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }

     public Project loadProject(FileObject dir, ProjectState state) throws IOException {
        return isProject (dir) ? new JGMProject (dir, state) : null;
    }

   public void saveProject(final Project project) throws IOException, ClassCastException {
    FileObject projectRoot = project.getProjectDirectory();
    if (projectRoot.getFileObject(PROJECT_DIR) == null) {
        throw new IOException ("Project dir " + projectRoot.getPath() + " deleted," +
                " cannot save project");
    }
    //Force creation of the rooms/ dir if it was deleted
    ((JGMProject) project).getRoomsFolder(true);

    //Find the properties file pvproject/project.properties,
    //creating it if necessary
    String propsPath = PROJECT_DIR + "/" + PROJECT_PROPFILE;
    FileObject propertiesFile = projectRoot.getFileObject(propsPath);
    if (propertiesFile == null) {
        //Recreate the properties file if needed
        propertiesFile = projectRoot.createData(propsPath);
    }

    Properties properties = (Properties) project.getLookup().lookup (Properties.class);

    File f = FileUtil.toFile(propertiesFile);
    properties.store(new FileOutputStream(f), "NetBeans JGM Project Properties");
}
    
}
