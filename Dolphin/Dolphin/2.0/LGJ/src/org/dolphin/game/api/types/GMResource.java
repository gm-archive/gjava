/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.types;

import org.dolphin.game.api.components.Actor;

/**
 *
 * @author Ali
 */
public class GMResource extends Variable {

    public Class theclass;
    public Actor theactor;

    public GMResource(Class c){
    theclass=c;
    }
    
    public GMResource(Actor a){
    	theactor=a;
        theclass=a.getClass();
        }
    
    public Actor getActor(){
    	return theactor;
    }

}
