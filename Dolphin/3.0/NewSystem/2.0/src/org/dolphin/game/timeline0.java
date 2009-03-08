/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game;

import org.dolphin.game.api.components.Timeline;
import org.dolphin.game.api.types.String;

/**
 *
 * @author Ali
 */
public class timeline0 extends Timeline {
    public void checksteps(double step){
        System.out.println("step:"+step);
        if (step==5){
        show_message(new String("step1"));
        }
    }
}
