/*
Copyright (C) 2008 Luís Reis<luiscubal@gmail.com>
Copyright (C) 2008 BobSerge<serge_1994@hotmail.com>

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

import java.util.Vector;

/**
 * This class manages all G-Creator events.
 * These are called when something happens (like thw main windows closes) in order
 * to inform plug-ins about what is happening.
 * 
 * All events have a priority, and a category.
 * 
 * @see EventPriority
 * @see EventType
 * 
 * @author Luís Reis
 */
public class EventManager {

    private static Vector<EventObject> highPriority = new Vector<EventObject>();
    private static Vector<EventObject> mediumPriority = new Vector<EventObject>();
    private static Vector<EventObject> lowPriority = new Vector<EventObject>();

    /**
     * Adds an {@link EventHandler} to the event list with a priority of {@link EventPriority#MEDIUM}.
     * 
     * @param handler The {@link EventHendler} to add.
     * @param type The {@link EventType} (type) of event this is.
     * 
     * @see EventType
     * @see addEventHandler(EventHandler, EventType, EventPriority)
     */
    public static void addEventHandler(EventHandler handler, String type) {
        addEventHandler(handler, type, EventPriority.MEDIUM);
    }

    /**
     * Adds an {@link EventHandler} to the event list with a given priority.
     * 
     * @param handler The {@link EventHendler} to add.
     * @param type The {@link EventType} (type) of event this is.
     * @param priority The priority of the event.
     * 
     * @see EventType
     * @see addEventHandler(EventHandler, EventType)
     */
    public static void addEventHandler(EventHandler handler, String type, EventPriority priority) {
        if (type != null) {
            EventObject obj = new EventObject();
            obj.handler = handler;
            obj.type = type;
            if (priority == EventPriority.HIGH) {
                highPriority.add(obj);
            } else if (priority == EventPriority.MEDIUM) {
                mediumPriority.add(obj);
            } else if (priority == EventPriority.LOW) {
                lowPriority.add(obj);
            }
        }
    }

    /**
     * Throws a new Event
     * @param sender
     * @param type
     * @param arguments
     */
    public static void throwEvent(Object sender, String type, Object... arguments) {
        if (type != null && !type.equals("all")) { //ALL can not be thrown.
            NotifyEvent evt = new NotifyEvent(sender, type, arguments);
            for (EventObject o : highPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type.equals(type) || o.type.equals("all")) {
                    o.handler.handleEvent(evt);
                }
            }
            for (EventObject o : mediumPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type.equals(type) || o.type.equals("all")) {
                    o.handler.handleEvent(evt);
                }
            }
            for (EventObject o : lowPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type.equals(type) || o.type.equals("all")) {
                    o.handler.handleEvent(evt);
                }
            }
        }
    }

    private static class EventObject {

        EventHandler handler;
        String type;
    }
}
