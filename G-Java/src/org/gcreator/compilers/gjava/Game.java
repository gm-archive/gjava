package org.gcreator.compilers.gjava;

import com.golden.gamedev.GameLoader;
import com.golden.gamedev.engine.graphics.WindowedMode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.gcreator.compilers.gjava.api.Clipboard;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.gtge.Scene2D;
//import org.gcreator.compilers.gjava.lwjgl.*;
//import org.gcreator.compilers.gjava.core.basicgame;
public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {

    public static Sprite G_Creator_NULL_SPRITE,  sprite1,wall,ball;
    public static PrintWriter debug;
//public static GameLoader game;
    Game() {
        try {
            debug = new PrintWriter("Game_errors");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadScenes() {
        //scenes = new Scene2D[1]; 
        //   scenes[0] = new newScene1();
        scenes = new Scene2D[]{new newScene1()};
    }

//    public void loadSprites() {
//        //BufferedImage[] b = {getImage("\\image.png"),getImage("\\screenshot.jpg")};
//        sprite1 = new Sprite("sprite1", 32, 34, 0, 47, 10, 2, 0, 0, new BufferedImage[]{getImage("image.png")/*,getImage("screenshot.jpg")*/});
//        System.out.println("load sprites");
//
//    }

    public void loadSprites() { wall = new Sprite("wall",24, 24, 0, 23, 23, 0, 0, 0, new BufferedImage[]{getImage("sprimg_wall_0.png")});ball = new Sprite("ball",24, 24, 2, 20, 20, 2, 0, 0, new BufferedImage[]{getImage("sprimg_ball_0.png")});}


    public static void main(java.lang.String[] args) {
        parameter_count = args.length;
        parameters = args;
        Runningas = "Application";
        //canvas=frame;
        //new Game();
        //frame.setVisible(true);
        try {
            game = new GameLoader();
            game.setup(new Game(), new Dimension(640, 480), false);
            frame = ((WindowedMode) Game.game.getGame().bsGraphics).getFrame();
            game.start();
        } catch (Exception e) {
            final Writer result = new StringWriter();
            final PrintWriter printWriter = new PrintWriter(result);
            e.printStackTrace(printWriter);
            Clipboard.setText(new org.gcreator.compilers.gjava.api.String("" + result.toString() + Clipboard.getText()));
            JOptionPane.showMessageDialog(null, "Error: " + e + ", " + e.getMessage() + ". \n Stack trace:" + result.toString() + "\n \n The Error has been added to clipboard, just before the previous contents of the clipboard. \n Please contact the G-Java development team for help. http://forums.g-java.com");
            System.exit(1);

        }

//       OpenGLGameLoader g = new OpenGLGameLoader();
//       g.setupLWJGL(new Game(), new Dimension(640,480), false);
//       g.start();
    }
}
