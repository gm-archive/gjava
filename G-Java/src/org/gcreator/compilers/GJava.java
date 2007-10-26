/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore {

    public static String projectname,  FileFolder;

    public GJava() {

    }

    public void createFolders() {
        try {
            FileFolder = "Projects" + File.separator + projectname + File.separator + "Java"+ File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava";
            File f1 = new File(FileFolder);
            f1.mkdirs();
            File f2 = new File("plugins" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava");
            copyDirectory(f2, f1);
        } catch (IOException ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    @Override
    public void onSplashDispose() {
        init();
    }

    public void init() {
        utilities.addStringMessage("Installed G-Java!");
        // add toolbar button
        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);

        run.addActionListener(new ActionListener() {

                    @Override
            public void actionPerformed(ActionEvent evt) {
                        run(gcreator.window.getMainProject());
                    }
                });
        gcreator.window.tool.add(run);
    }
    
    public void createJavaFiles() throws IOException
    {
       FileWriter gameFW = new FileWriter(GJava.FileFolder + "gjava" + File.separator + "runner" + File.separator
					+ "Game.java");
       BufferedWriter game = new BufferedWriter(gameFW);
       
       print(game,"public class game extends basicgame {");
       print(game,"}");
       game.close();
    }

    public void run(Project project) {
        projectname = project.name;
        if (project == null) {
            return;
        }
        utilities.addStringMessage("Building/running using G-Java");
        utilities.addStringMessage("Creating java files...");
        createFolders();
        super.run(project);
        try {
        createJavaFiles();
        } catch (Exception e){
        }
    }
}
