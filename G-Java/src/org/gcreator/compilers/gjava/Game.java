package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.components.*;

import org.gcreator.compilers.gjava.lwjgl.Basicgame;
import org.gcreator.compilers.gjava.lwjgl.Scene2D;
import org.lwjgl.util.applet.LWJGLInstaller;




public class Game extends Basicgame {
public static Sprite newSprite1,G_Creator_NULL_SPRITE;
public static String Runningas;
    Game(){
        super();
        loadSprites();
       // loadScenes();
       // nextScene();
    }
   public void loadScenes(){
  scenes = new Scene2D[1]; 
    //scenes[0] = new newScene1();
    }
public void loadSprites() { newSprite1 = new Sprite("newSprite1",106, 416, 0, 0, 0, 0, 0, 0, new String[] {"newImage1.png",""});}
//   public static void main(String[] args){
//       Runningas = "Application";
//       
//       new Game();
//   }
   
   //required values for rotating the sphere
 
 
  /**
   * Entry point for the test,
   * @param args
   */
  public static void main(String[] args) {
   //install LWJGL
      try {
  LWJGLInstaller.tempInstall();
} catch (Exception le) {
 /* handle exception */
}
      
    
//    app.setDialogBehaviour(ALWAYS_SHOW_PROPS_DIALOG);
//    
//    app.start();
//    System.out.println("got here");
//   try {
//			AppGameContainer container = new AppGameContainer(new GradientTest());
//			container.setDisplayMode(800,600,false);
//                        container.setForceExit(false);
//                                //container.setFullscreen(true);
//			container.start();
//		} catch (SlickException e) {
//			e.printStackTrace();
//		}
//    System.out.println("got here");
//    app = new Game();
//    app.setDialogBehaviour(NEVER_SHOW_PROPS_DIALOG);
//    app.start();
//    System.out.println("got here");
  }

    
}