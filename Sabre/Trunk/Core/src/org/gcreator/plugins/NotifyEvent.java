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
    private EventType type;
    private boolean handled = false;
    private Object[] arguments = null;
    private Object sender = null;
    
    public NotifyEvent(Object sender, EventType type, Object... arguments){
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
    
    public EventType getEventType(){
        return type;
    }
}
