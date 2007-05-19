package org.gjava.settingseditor;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;
import org.openide.windows.TopComponent;

/**
 * Action which shows Settingseditor component.
 */
public class SettingseditorAction extends AbstractAction {
    
    public SettingseditorAction() {
        super(NbBundle.getMessage(SettingseditorAction.class, "CTL_SettingseditorAction"));
        //        putValue(SMALL_ICON, new ImageIcon(Utilities.loadImage(SettingseditorTopComponent.ICON_PATH, true)));
    }
    
    public void actionPerformed(ActionEvent evt) {
        TopComponent win = SettingseditorTopComponent.findInstance();
        win.open();
        win.requestActive();
    }
    
}
