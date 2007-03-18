package org.gjava.actoreditor;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows ActorEditor component.
 */
public class ActorEditorAction extends AbstractAction {
    
    public ActorEditorAction() {
        super(NbBundle.getMessage(ActorEditorAction.class, "CTL_ActorEditorAction"));
        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(ActorEditorTopComponent.ICON_PATH, true)));
    }
    
    public void actionPerformed(ActionEvent evt) {
        TopComponent win = ActorEditorTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
    
}
