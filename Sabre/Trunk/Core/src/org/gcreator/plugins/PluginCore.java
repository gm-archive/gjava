package org.gcreator.plugins;

/**
 * This is the base class that all plugins must extend.
 * 
 * @author Luís Reis
 */
public class PluginCore implements EventHandler {

    public String getName() {
        return "untitled";
    }

    public String getAuthor() {
        return "anonymous";
    }

    public String getDescription() {
        return "";
    }

    public void initialize() {
    }

    public void handleEvent(NotifyEvent event) {

    }
}
