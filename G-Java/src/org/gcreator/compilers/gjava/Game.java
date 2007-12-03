package org.gcreator.compilers.gjava;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.gcreator.compilers.gjava.components.*;
import org.gcreator.compilers.gjava.lwjgl.*;
//import org.gcreator.compilers.gjava.core.basicgame;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.CanvasGameContainer;
import org.newdawn.slick.tests.GradientTest;
public class Game extends org.gcreator.compilers.gjava.lwjgl.Basicgame {
public static Sprite G_Creator_NULL_SPRITE;
    Game(){
super();
loadSprites();
        loadScenes();
        nextScene();
    }
   public void loadScenes(){
  scenes = new Scene2D[1]; 
    scenes[0] = new newScene1();
    }
public void loadSprites() { }

   public static void main(String[] args){
       
       
       Runningas = "Application";
       canvas=frame;
       frame.setLayout(new BorderLayout());
       frame.setVisible(true);
       new Game();
       frame.setVisible(true);
       
   }
}
