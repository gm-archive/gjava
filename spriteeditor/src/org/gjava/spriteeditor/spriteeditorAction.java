package org.gjava.spriteeditor;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows spriteeditor component.
 */
public class spriteeditorAction extends AbstractAction {
    
    public spriteeditorAction() {
        super(NbBundle.getMessage(spriteeditorAction.class, "CTL_spriteeditorAction"));
        //        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(spriteeditorTopComponent.ICON_PATH, true)));
    }
    
    public void actionPerformed(ActionEvent evt) {
        TopComponent win = spriteeditorTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
    
}
