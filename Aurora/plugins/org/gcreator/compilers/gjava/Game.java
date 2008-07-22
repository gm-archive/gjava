package org.gcreator.compilers.gjava;
import com.golden.gamedev.GameLoader;
import java.awt.*;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.gtge.Scene2D;
import java.awt.image.BufferedImage;
public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {
public static Sprite G_Creator_NULL_SPRITE;
    Game(){
//loading image code will go here
loadSprites();
        loadScenes();
        nextScene();
    }
   public void loadScenes(){
scenes = new Scene2D[]{
new newScene1()
    };
    }
public void loadSprites() { }
   public static void main(java.lang.String[] args){
       Runningas = "Application";
       game = new GameLoader();
       game.setup(new Game(), new Dimension(640,480), false);
       game.start();
   }
}
