/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.macro;

import org.gcreator.core.*;
import org.gcreator.fileclass.*;
import org.gcreator.managers.*;

/**
 *
 * @author luis
 */
public class NewProjectAction implements MacroAction{
    private String name;
    public NewProjectAction(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        Project project = GameProject.balance();
        project.name = name;
        project.location = "";
        Aurwindow.setMainProject(project);
        if(project!=null)
            ProjectTree.importFolderToTree(project, org.gcreator.core.gcreator.window.top);
        try{
                Aurwindow.workspace.updateUI();
        }
         catch(Exception e){}
    }
}
