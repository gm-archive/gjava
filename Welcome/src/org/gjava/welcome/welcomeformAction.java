package org.gjava.welcome;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows welcomeform component.
 */
public class welcomeformAction extends AbstractAction {
    
    public welcomeformAction() {
        super(NbBundle.getMessage(welcomeformAction.class, "CTL_welcomeformAction"));
        //        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(welcomeformTopComponent.ICON_PATH, true)));
    }
    
    public void actionPerformed(ActionEvent evt) {
        TopComponent win = welcomeformTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
    
}
