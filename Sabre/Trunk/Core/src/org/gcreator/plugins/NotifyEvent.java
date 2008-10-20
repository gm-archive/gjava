/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package org.gcreator.plugins;

/**
 * Class for storing information about an event.
 * 
 * @author Luís Reis
 */
public class NotifyEvent {

    private String type;
    private boolean handled = false;
    private Object[] arguments = null;
    private Object sender = null;

    /**
     * Creates a new instance of NotifyEvent
     * @param sender The class that send the event: usually the keyword 'this'
     * is used
     * @param type The type of event
     * @param arguments The arguments. They can be of any type and in any number
     * 
     * @see EventHandler
     * @see EventManager
     */
    public NotifyEvent(Object sender, String type, Object... arguments) {
        this.arguments = arguments;
        this.type = type;
        this.sender = sender;
    }

    /**
     * Intercepts an event.
     * WARNING: This method's effect is IRREVERSIBLE.
     * 
     * @see #isHandled()
     */
    public void handleEvent() {
        handled = true;
    }

    /**
     * Whether or not this event is handled.
     * 
     * @return  <tt>true</tt> if this event has been handled. Otherwise <tt>false</tt>
     * @see #handleEvent()
     */
    public boolean isHandled() {
        return handled;
    }

    /**
     * Gets the sender of the event
     * @return The sender
     */
    public Object getSender() {
        return sender;
    }

    /**
     * Gets the type of the event in a {@link java.lang.String}.
     * Any String, except null and "all" are valid types.
     * 
     * @return The type of the event in a {@link java.lang.String}.
     */
    public String getEventType() {
        return type;
    }
    
    /**
     * Gets the event arguments.
     */
    public Object[] getArguments(){
        return arguments;
    }
}
