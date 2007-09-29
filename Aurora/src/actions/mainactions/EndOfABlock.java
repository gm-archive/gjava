/*
 * StartOfABlock.java
 * 
 * Created on 26/Set/2007, 16:44:23
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions.mainactions;

import actions.*;
import editors.*;
import javax.swing.*;

/**
 *
 * @author Luís
 */
public class EndOfABlock extends ActionPattern{
    public EndOfABlock(ActorEditor context){
        super(context);
        setStandardImage(new ImageIcon(getClass().getResource("/actions/images/End_Block.png")));
    }
    
    @Override
    public String getStandardText(JComponent panel){
        return "End block";
    }
    
    @Override
    public String generateEGML(JComponent panel){
        return "}";
    }
}
