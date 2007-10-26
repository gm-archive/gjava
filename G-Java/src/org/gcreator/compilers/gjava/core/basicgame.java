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
import org.gcreator.compilers.gjava.components.Actor;
import org.gcreator.compilers.gjava.components.Scene;


// the main class
import org.gcreator.compilers.gjava.components.font;
import org.gcreator.compilers.gjava.components.sprite;
/**
 * The basics for a game, rewritten in G-Java for your game.
 * @author G-java
 */
public class basicgame extends JApplet {

//The Game Settings
GameSettings gs = new GameSettings();

public static JFrame f;
public static URL u;
public static String Runningas;
public static Scene Current_room;
public static JApplet applet = null;

    @Override
    public void init() {
        super.init();
        Runningas = "Applet";
        applet = this;
        new loadScenes(0,applet);
    }

public basicgame() {}

public static void main(String[] args){
Runningas = "Application";
new loadScenes(0);
}

public static void load_Sprites() {}
public static void load_Sounds() {}
public static void load_Fonts() {}
public static Actor load_Actors() {return null;}

}


