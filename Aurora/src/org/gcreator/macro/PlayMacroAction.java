/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.macro;

/**
 *
 * @author luis
 */
public class PlayMacroAction implements MacroAction{
    private Macro macro;
    public PlayMacroAction(Macro macro){
        this.macro = macro;
    }
    public Macro getMacro(){
        return macro;
    }
    public void play(){
        macro.play();
    }
}
