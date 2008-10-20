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
package org.gcreator.gui;

import javax.swing.JFrame;
import org.gcreator.plugins.DefaultEventTypes;
import org.gcreator.plugins.EventHandler;
import org.gcreator.plugins.EventManager;
import org.gcreator.plugins.EventPriority;
import org.gcreator.plugins.NotifyEvent;

/**
 * G-Creator's main window.
 * This is to be kept very simple, as modules will
 * handle the content of this frame.
 * 
 * @author Serge Humphrey
 */
public class MainFrame extends JFrame implements EventHandler {

    private static final long serialVersionUID = 1;

    /**
     * Sets up the frame for any modules to handle its content.
     */
    public void initialize() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);
        EventManager.addEventHandler(this, DefaultEventTypes.WINDOW_DISPOSED, EventPriority.LOW);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void dispose() {
        EventManager.fireEvent(this, DefaultEventTypes.WINDOW_DISPOSED);
    }

    /**
     * Handles an event. This may, for example, dispose the window,
     * if the event type is "window-dispose".
     * 
     * @param event The {@link NotifyEvent} That is to be handled.
     */
    public void handleEvent(NotifyEvent event) {
        if (event.getEventType().equals(DefaultEventTypes.WINDOW_DISPOSED)) {
            System.out.println("Performing final disposal");
            super.dispose();
            System.exit(0);
        }
    }
}
