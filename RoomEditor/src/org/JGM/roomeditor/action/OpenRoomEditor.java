package org.JGM.roomeditor.action;

import org.JGM.roomeditor.RoomEditorTopComponent2;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class OpenRoomEditor extends CallableSystemAction {
    
    public void performAction() {
        RoomEditorTopComponent2 re = new RoomEditorTopComponent2();
        re.open();
        re.requestActive();
    }
    
    public String getName() {
        return NbBundle.getMessage(OpenRoomEditor.class, "CTL_OpenRoomEditor");
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
