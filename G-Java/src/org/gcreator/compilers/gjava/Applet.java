/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import com.golden.gamedev.GameLoader;
//import org.gcreator.compilers.gjava.java2d.basicgame;

/**
 *
 * @author Ali
 */
public class Applet extends GameLoader {

    protected Game createAppletGame() {
        
        return new Game();
    }

}
