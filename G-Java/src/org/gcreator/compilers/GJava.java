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
import org.gcreator.core.Aurwindow;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.*;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore {

    public static String projectname,  FileFolder;
    public static int sprites=0,  actors=0,  scenes=0,  fonts=0;
    String loadscene = "";

    public GJava() {

    }

    @Override
    public void parseSprite(Sprite s) {
        super.parseSprite(s);
    }

    @Override
    public void parseActor(Actor a) {

    }

    @Override
    public void parseClass() {

    }

    @Override
    public void parseScene(Scene s) throws IOException {
        loadscene +="    scenes["+scenes+"] = new "+s.name+"();";
        scenes++;
        FileWriter sceneFW = new FileWriter(FileFolder + File.separator+ s.name + ".java");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "package org.gcreator.compilers.gjava;");
        print(scene, "");
        print(scene, "import org.gcreator.compilers.gjava.components.Scene;");
        print(scene, "import org.gcreator.compilers.gjava.core.*;");
        print(scene, "import java.awt.Color;");
        print(scene, "");
        print(scene, "public class " + s.name + " extends Scene {");
        print(scene, "");
        print(scene, "    "+s.name+"() {");
        print(scene, "        super(basicgame.frame,"+s.caption+","+s.speed+","+s.width+","+s.height+","+"Color.BLUE)");
        print(scene, "    }");
        print(scene, "");
        print(scene, "}");
    }

    public void createFolders() {
        try {
            FileFolder = "Projects" + File.separator + projectname + File.separator + "Java" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava";
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
        Aurwindow.tool.add(run);
    }

    public void createJavaFiles() throws IOException {
        FileWriter gameFW = new FileWriter(FileFolder + File.separator + "Game.java");
        BufferedWriter game = new BufferedWriter(gameFW);

        print(game, "public class Game extends basicgame {");
        print(game, "    public void loadScenes(){ scenes[] = new Scene["+scenes+"];");
        print(game, ""+loadscene);
        print(game, "    }");
        print(game, "}");
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
        } catch (Exception e) {
        }
        GJavaCompiler compiler = new GJavaCompiler();
    }
}
