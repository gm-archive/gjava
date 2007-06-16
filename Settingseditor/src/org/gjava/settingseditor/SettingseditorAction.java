package org.gjava.settingseditor;

import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.actions.CookieAction;

/**
 * Action which shows Settingseditor component.
 */
public class SettingseditorAction extends CookieAction {
    
        
    protected void performAction(Node[] activatedNodes)
    {
       SettingsDataObject c = (SettingsDataObject) activatedNodes[0].getLookup().lookup(SettingsDataObject.class);

       
        SettingseditorTopComponent win = SettingseditorTopComponent.getInstance(c.getName(), c);
        
        win.setName("Settings");
        win.setHtmlDisplayName("Settings");
        //win.setIcon(Utilities.loadImage("org/gjava/actoreditor/object.png"));
        win.open();
        win.requestActive();
    }

    protected int mode() {
         return CookieAction.MODE_EXACTLY_ONE;
    }

    protected Class[] cookieClasses() {
        return new Class[] {
            SettingsDataObject.class
        };
    }

    public String getName() {
        return "Open";
    }

    public HelpCtx getHelpCtx() {
      return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous()
    {
        return false;
    }
    
}
