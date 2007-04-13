package org.JGM.roomeditor;

import org.openide.nodes.Node;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.util.actions.CookieAction;
import org.gmj.gmjfilesupport.GMJRoomDataObject;

public final class RoomOpen extends CookieAction {
    
    protected void performAction(Node[] activatedNodes) {
          GMJRoomDataObject c = (GMJRoomDataObject) activatedNodes[0].getCookie(GMJRoomDataObject.class);
        RoomEditorTopComponent2 re = RoomEditorTopComponent2.getInstance(c.getName());
        re.setName(c.getName());
        re.setHtmlDisplayName(c.getName());
        re.setIcon(Utilities.loadImage("org/gmj/gmjfilesupport/room.png"));
        re.open();
        re.requestActive();
    }
    
    protected int mode() {
        return CookieAction.MODE_EXACTLY_ONE;
    }
    
    public String getName() {
        return NbBundle.getMessage(RoomOpen.class, "CTL_RoomOpen");
    }
    
    protected Class[] cookieClasses() {
        return new Class[] {
            GMJRoomDataObject.class
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

