/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.components.Actor;
import org.gcreator.compilers.gjava.components.Scene;
import org.gcreator.compilers.gjava.components.Scene;
import org.gcreator.compilers.gjava.components.sprite;
import org.gcreator.compilers.gjava.core.basicgame;

/**
 *
 * @author Ali
 */
public class Game extends basicgame {
    
    Game(){
       // Sprite Sprite = new Sprite();
      loadScenes();
        nextScene();
    }
    
    public static void main(String[] args){
        Runningas = "Application";
        canvas=frame;
        frame.setVisible(true);
        new Game();
    }
    
        
}
