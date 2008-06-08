/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.events;

import javax.swing.ImageIcon;

/**
 *
 * @author Luís
 */
public class SnippetEvent extends Event{
    private Event childEvent = null;
    private boolean after = false;
    
    public SnippetEvent(Event e, boolean after){
        PRIORITY = e.PRIORITY + (after?1:0);
        childEvent = e;
        this.after = after;
    }
    
    @Override
    public ImageIcon getImage(){
        return childEvent.getImage();
    }
    
    @Override
    public String toString(){
        if(after)
            return "After " + childEvent.toString();
        return "Before " + childEvent.toString();
    }
}
