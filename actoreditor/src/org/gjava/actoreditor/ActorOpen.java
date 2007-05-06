package org.gjava.actoreditor;

import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.actions.CookieAction;

public final class ActorOpen extends CookieAction
{
    
    protected void performAction(Node[] activatedNodes)
    {
        actorDataObject c = (actorDataObject) activatedNodes[0].getLookup().lookup(actorDataObject.class);
        Actoreditor re = Actoreditor.getInstance(c.getPrimaryFile().getPath(),c);
         re.path = c.getPrimaryFile().getPath();
         re.ado = c;
          try     {
            re.openfile();
            }
           catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
        re.setName(c.getName());
        re.setHtmlDisplayName(c.getName());
        re.setIcon(Utilities.loadImage("org/gjava/actoreditor/object.png"));
        re.open();
        re.requestActive();
    }
    
    protected int mode()
    {
        return CookieAction.MODE_EXACTLY_ONE;
    }
    
    public String getName()
    {
        return NbBundle.getMessage(ActorOpen.class, "CTL_ActorOpen");
    }
    
    protected Class[] cookieClasses()
    {
        return new Class[] {
            actorDataObject.class
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

