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
public class Comment extends ActionPattern{
    public Comment(ActorEditor context){
        super(context);
        setStandardImage(new ImageIcon(getClass().getResource("/actions/images/comment.png")));
    }
    
    @Override
    public JPanel createNewPanel(actions.Action action){
        return new CommentPanel();
    }
    
    @Override
    public String getStandardText(JPanel panel){
        if(panel!=null)
            return ((CommentPanel) panel).comment.getText();
        else
            return "Comment";
    }
    
    @Override
    public String generateEGML(JPanel panel){
        return ""; //It could generate a comment, but why should it?
    }
}
