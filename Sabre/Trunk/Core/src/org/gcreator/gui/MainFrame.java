

package org.gcreator.gui;

import javax.swing.JFrame;
import org.gcreator.plugins.EventHandler;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.EventType;
import org.gcreator.plugins.NotifyEvent;

/**
 * G-Creator's main window.
 * This is to be kept very simple, as modules will
 * handle the content of this frame.
 * 
 * @author Serge Humphrey
 */
public class MainFrame extends JFrame implements EventHandler{
    private static final long serialVersionUID = 1;

    public void initialize() {
        setSize(320, 240);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        EventManager.addEventHandler(this, EventType.WINDOW_DISPOSE, EventPriority.LOW);
    }
    
    @Override
    public void dispose(){
        EventManager.throwEvent(this, EventType.WINDOW_DISPOSE);
    }
    
    public void handleEvent(NotifyEvent event){
        if(event.getEventType()==EventType.WINDOW_DISPOSE){
            super.dispose();
        }
    }
}
