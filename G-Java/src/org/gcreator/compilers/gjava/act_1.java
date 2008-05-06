/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava;

import org.gcreator.compilers.gjava.api.Actor;

/**
 *
 * @author TGMG
 */
public class act_1 extends Actor {

    act_1(int X,int Y,double instance_id) {
        super("act_1", Game.sprite1, true, true, 0, false);
        xstart = X;
        ystart = Y;
        x = X;
        y = Y;
        this.instance_id = instance_id;
    }
    
}
