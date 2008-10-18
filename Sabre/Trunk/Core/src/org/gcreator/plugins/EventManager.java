
package org.gcreator.plugins;
import java.util.Vector;
import org.gcreator.plugins.EventHandler;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.EventType;
import org.gcreator.plugins.NotifyEvent;

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
    public static void addEventHandler(EventHandler handler, EventType type) {
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
    public static void addEventHandler(EventHandler handler, EventType type, EventPriority priority) {
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
    public static void throwEvent(Object sender, EventType type, Object... arguments) {
        if (type != null && type != EventType.ALL) { //ALL can not be thrown.
            NotifyEvent evt = new NotifyEvent(sender, type, arguments);
            for (EventObject o : highPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type == type || o.type == EventType.ALL) {
                    o.handler.handleEvent(evt);
                }
            }
            for (EventObject o : mediumPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type == type || o.type == EventType.ALL) {
                    o.handler.handleEvent(evt);
                }
            }
            for (EventObject o : lowPriority) {
                if (evt.isHandled()) {
                    return;
                }
                if (o.type == type || o.type == EventType.ALL) {
                    o.handler.handleEvent(evt);
                }
            }
        }
    }

    private static class EventObject {

        EventHandler handler;
        EventType type;
    }
}
