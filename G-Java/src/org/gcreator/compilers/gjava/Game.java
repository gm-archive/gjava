package org.gcreator.compilers.gjava;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.BinaryFile;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.lwjgl.*;
//import org.gcreator.compilers.gjava.core.basicgame;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.CanvasGameContainer;
import org.newdawn.slick.tests.GradientTest;
public class Game extends org.gcreator.compilers.gjava.lwjgl.Basicgame {
public static Sprite G_Creator_NULL_SPRITE;
    Game(){
      //  super();
      //  org.gcreator.compilers.gjava.api.lang.String str = new org.gcreator.compilers.gjava.api.lang.String("");
    //  org.gcreator.compilers.gjava.api.Object o;
    //  org.gcreator.compilers.gjava.api.Object o = (org.gcreator.compilers.gjava.api.Object) str;
    //  this.getClass().getMethod("", null).invoke(this, null);
      org.gcreator.compilers.gjava.api.Object varname1 = new org.gcreator.compilers.gjava.api.Object(), varname2;
      varname1=((new org.gcreator.compilers.gjava.api.Integer(3)) .sub((new org.gcreator.compilers.gjava.api.Integer(4))));
// x.setValue( ((new Integer(5)).equals((new Integer(4)))));
      varname1.sub((new org.gcreator.compilers.gjava.api.Integer(5)) .sub((new org.gcreator.compilers.gjava.api.Integer(4))));
System.out.println(""+varname1.getDouble());
/*loadSprites();
        loadScenes();
        nextScene();*/
    }
    
    public void test()
    {
        System.out.println("it worked!");
    }
    
   public void loadScenes(){
  scenes = new Scene2D[1]; 
    scenes[0] = new newScene1();
    }
public void loadSprites() { }

   public static void main(java.lang.String[] args){
       
       
       Runningas = "Application";
       canvas=frame;
       frame.setLayout(new BorderLayout());
       frame.setVisible(true);
       new Game();
       frame.setVisible(true);
       
   }
}
