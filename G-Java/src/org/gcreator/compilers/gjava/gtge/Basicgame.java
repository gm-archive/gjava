/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers.gjava.gtge;


import com.golden.gamedev.Game;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.JApplet;
import org.gcreator.compilers.gjava.api.components.GameFrame;
import org.gcreator.compilers.gjava.core.GameSettings;
//import org.lwjgl.util.applet.LWJGLInstaller;

/**
 *
 * @author TGMG
 */
public class Basicgame extends Game {

//The Game Settings
    GameSettings gs = new GameSettings();
    public static Frame frame = new GameFrame(100, 200, Color.BLACK);
    public static URL u;
    public static String Runningas = "Applet";
    public static Scene2D Current;
    public static JApplet applet = null;
    public static int firstroom,  lastroom,  currentscene = -1;
    public static Container canvas;
    public static Scene2D scenes[];

    public Basicgame() {
        
    }

    public void loadSprites() {
    }

    public void loadSounds() {
    }

    public void loadFonts() {
    }

    public void loadActors() {
    }

    public void loadScenes() {
    }

    public static boolean ifPrevScene() {
        return false;
    }

    public static boolean ifNextScene() {
        return false;
    }

    public static void prevScene() {
        try {
            if (currentscene != -1) {
                removeScene();
            }
            Current = scenes[currentscene - 1];
            System.out.println("add canvas to frame");
            //canvas.add(Current.getCanvas());
        //canvas.add(new CanvasGameContainer(new GradientTest()));
        //new CanvasGameContainer(new GradientTest())
        } catch (Exception ex) {
            System.out.println("GTGEex" + ex);
        }
    }

    public static void nextScene() {
        try {
            if (currentscene != -1) {
                removeScene();
            }
            Current = scenes[currentscene + 1];
            System.out.println("add canvas to frame");
            //canvas.add(Current.getCanvas());
        //canvas.add(new CanvasGameContainer(new GradientTest()));
        //new CanvasGameContainer(new GradientTest())
        } catch (Exception ex) {
            System.out.println("GTGEex" + ex);
        }
    }

    public static void changeScene(int id) {

    }

    public static void restartScene() {
    }

    public static void removeScene() {
        Current.disposeScene();
        //canvas.remove(Current.getCanvas());
    }

    @Override
    public void initResources() {
        loadSprites();
        loadScenes();
        nextScene();
        setFPS(900);
        
    }

    @Override
    public void update(long arg0) {
        Current.update();
    }

    @Override
    public void render(Graphics2D arg0) {
        Current.render(arg0);
    }
}
