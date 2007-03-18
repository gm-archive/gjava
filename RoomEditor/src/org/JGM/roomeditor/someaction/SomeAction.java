package org.JGM.roomeditor.someaction;

import java.io.IOException;
import javax.swing.Action;
import org.netbeans.spi.palette.PaletteActions;
import org.netbeans.spi.palette.PaletteController;
import org.netbeans.spi.palette.PaletteFactory;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class SomeAction extends CallableSystemAction {
    
    public void performAction() {
        //initializePalette();
        System.out.println("Show event inserter");
    }
    
       private PaletteController initializePalette() {
        try {
            return PaletteFactory.createPalette( "ActorEditorPalette", new PaletteActions() {
                public Action[] getCustomCategoryActions(Lookup lookup) {
                    return new Action[0];
                }
                public Action[] getCustomItemActions(Lookup lookup) {
                    return new Action[0];
                }
                public Action[] getCustomPaletteActions() {
                    return new Action[0];
                }
                public Action[] getImportActions() {
                    return new Action[0];
                }
                public Action getPreferredAction(Lookup lookup) {
                    return null; //TODO
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }
    
    
    public String getName() {
        return NbBundle.getMessage(SomeAction.class, "CTL_SomeAction");
    }
    
    protected String iconResource() {
        return "org/JGM/roomeditor/someaction/room.png";
    }
    
    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }
    
    protected boolean asynchronous() {
        return false;
    }
    
}
