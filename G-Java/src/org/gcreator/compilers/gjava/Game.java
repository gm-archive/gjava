package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.components.*;
import org.gcreator.compilers.gjava.core.basicgame;
public class Game extends basicgame {
public static Sprite newSprite1,G_Creator_NULL_SPRITE;
    Game(){
        loadScenes();
        nextScene();
    }
   public void loadScenes(){
  scenes = new Scene[1]; 
    scenes[0] = new newScene1();
    }
public void loadSprites() { newSprite1 = new Sprite("newSprite1",106, 416, 0, 0, 0, 0, 0, 0, new String[] {"newImage1.png",""});}
   public static void main(String[] args){
       Runningas = "Application";
       canvas=frame;
       frame.setVisible(true);
       new Game();
   }
}