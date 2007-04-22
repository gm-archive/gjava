/*
 * OpenAction.java
 *
 * Created on 21 April 2007, 20:37
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.gjava.actoreditor.Action;

import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.actions.CookieAction;


/**
 *
 * @author ali1
 */
public class OpenAction extends CookieAction
{
    
    protected void performAction(Node[] activatedNodes)
    {
        ActionDataObject c = (ActionDataObject) activatedNodes[0].getLookup().lookup(ActionDataObject.class);
        Actioneditor re = Actioneditor.getInstance(c.getPrimaryFile().getPath(),c);
         re.path = c.getPrimaryFile().getPath();
        re.setName(c.getName());
        re.setHtmlDisplayName(c.getName());
        //re.setIcon(Utilities.loadImage("org/gjava/actoreditor/object.png"));
        re.open();
        re.requestActive();
    }
    
    protected int mode()
    {
        return CookieAction.MODE_EXACTLY_ONE;
    }
    
    public String getName()
    {
        return "Open";
    }
    
    protected Class[] cookieClasses()
    {
        return new Class[] {
            ActionDataObject.class
        };
    }
    
    protected void initialize()
    {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }
    
    public HelpCtx getHelpCtx()
    {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous()
    {
        return false;
    }
    
}
