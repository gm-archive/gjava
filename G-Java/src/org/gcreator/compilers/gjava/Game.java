package org.gcreator.compilers.gjava;
import com.golden.gamedev.GameLoader;
import java.awt.*;
import java.awt.image.BufferedImage;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.gtge.Scene2D;
//import org.gcreator.compilers.gjava.lwjgl.*;
//import org.gcreator.compilers.gjava.core.basicgame;

public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {
public static Sprite G_Creator_NULL_SPRITE, sprite1;
//public static GameLoader game;

    Game(){   
        ;
    }
    
   public void loadScenes(){
  //scenes = new Scene2D[1]; 
 //   scenes[0] = new newScene1();
       scenes = new Scene2D[]{new newScene1(),new newScene1()};
    }
public void loadSprites() {
    BufferedImage[] b = {getImage("\\image.png"),getImage("\\screenshot.jpg")};
sprite1 = new Sprite("sprite1", 32, 34, 1, 2, 3, 4, 0, 0, b);
System.out.println("load sprites");

}

   public static void main(java.lang.String[] args){
       Runningas = "Application";
       //canvas=frame;
       //new Game();
       //frame.setVisible(true);
       game = new GameLoader();
        game.setup(new Game(), new Dimension(64,48), false);
        game.start();
//       OpenGLGameLoader g = new OpenGLGameLoader();
//       g.setupLWJGL(new Game(), new Dimension(640,480), false);
//       g.start();
   }
 
}
