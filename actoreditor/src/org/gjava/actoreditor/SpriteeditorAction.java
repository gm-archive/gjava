package org.gjava.actoreditor;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows Spriteeditor component.
 */
public class SpriteeditorAction extends AbstractAction {
    
    public SpriteeditorAction() {
        super(NbBundle.getMessage(SpriteeditorAction.class, "CTL_SpriteeditorAction"));
        //        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(SpriteeditorTopComponent.ICON_PATH, true)));
    }
    
    public void actionPerformed(ActionEvent evt) {
        TopComponent win = SpriteeditorTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
    
}
