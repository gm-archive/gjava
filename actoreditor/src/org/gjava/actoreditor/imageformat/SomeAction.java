package org.gjava.actoreditor.imageformat;

import org.gjava.actoreditor.imageformat.ImageDataObject;
import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CookieAction;

public final class SomeAction extends CookieAction {
    
    protected void performAction(Node[] activatedNodes) {
        ImageDataObject imageDataObject = (ImageDataObject) activatedNodes[0].getLookup().lookup(ImageDataObject.class);
        // TODO use imageDataObject
    }
    
    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }
    
    public String getName() {
        return NbBundle.getMessage(SomeAction.class, "CTL_SomeAction");
    }
    
    protected Class[] cookieClasses() {
        return new Class[] {
            ImageDataObject.class
        };
    }
    
    protected void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }
    
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
}

