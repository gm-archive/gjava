// basicgame.java
// by TGMG

// import the required classes
package org.gcreator.compilers.gjava.core;
import java.awt.*;
import javax.swing.*;
import java.

// the main class
net.*;


// the main class
import org.gcreator.compilers.gjava.components.GameFrame;
import org.gcreator.compilers.gjava.components.Scene;


// the main class
import org.gcreator.core.gcreator;
/**
 * The basics for a game, rewritten in G-Java for your game.
 * @author G-java
 */
public class basicgame extends JApplet {

//The Game Settings
GameSettings gs = new GameSettings();

public static JFrame frame = new GameFrame(100,200,Color.BLACK);
public static URL u;
public static String Runningas;
public static Scene Current;
public static JApplet applet = null;
public static int firstroom,lastroom,currentscene=-1;
public static Container canvas;

public static Scene scenes[];// = new Scene[0];

    @Override
    public void init() {
        super.init();
        Runningas = "Applet";
        applet = this;
        canvas = applet.getContentPane(); 
        canvas.add(scenes[0]);
    }

public basicgame() {}



public void loadSprites() {}
public void loadSounds() {}
public void loadFonts() {}
public void loadActors() {}
public void loadScenes(){}

public static boolean ifPrevScene() {return false;}

public static boolean ifNextScene() {return false;}

public static void prevScene() {}

public void nextScene() {
    System.out.println("Next scene");
removeScene();
Current = scenes[currentscene+1];
Current.setVisible(true);
canvas.add(Current );
}

public static void changeScene(int id){

}

public static void restartScene() {}

public static void removeScene() {}

}


