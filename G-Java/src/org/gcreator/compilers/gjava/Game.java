/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.components.Actor;
import org.gcreator.compilers.gjava.components.Scene;
import org.gcreator.compilers.gjava.components.Scene;
import org.gcreator.compilers.gjava.components.Sprite;
import org.gcreator.compilers.gjava.core.basicgame;

/**
 *
 * @author Ali
 */
public class Game extends basicgame {
    public static Sprite G_Creator_NULL_SPRITE;
    private Sprite newSprite1;
    Game(){
       // Sprite Sprite = new Sprite();
      loadScenes();
        nextScene();
    }
    
    public void loadSprites() { newSprite1 = new Sprite("newSprite1",106, 416, 0, 0, 0, 0, 0, 0, new String[] {});}
    
    public static void main(String[] args){
        Runningas = "Application";
        canvas=frame;
        frame.setVisible(true);
        new Game();
    }
    
        
}
