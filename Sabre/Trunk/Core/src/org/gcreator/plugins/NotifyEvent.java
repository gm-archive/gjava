/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.plugins;

/**
 *
 * @author luis
 */
public class NotifyEvent {
    private Object type;
    private boolean handled = false;
    private Object[] arguments = null;
    private Object sender = null;
    
    public NotifyEvent(Object sender, Object type, Object... arguments){
        this.arguments = arguments;
        this.type = type;
        this.sender = sender;
    }
    
    public void handleEvent(){
        handled = true;
    }
    
    public boolean isHandled(){
        return handled;
    }
    
    public Object getSender(){
        return sender;
    }
    
    public Object getEventType(){
        return type;
    }
}
