package org.gmj.gmjproject;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.spi.options.OptionsCategory;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;

public final class GmjprojectOptionsCategory extends OptionsCategory {
    
    public Icon getIcon() {
        return new ImageIcon(Utilities.loadImage("org/gmj/gmjproject/g-java32x32.png"));
    }
    
    public String getCategoryName() {
        return NbBundle.getMessage(GmjprojectOptionsCategory.class, "OptionsCategory_Name_Gmjproject");
    }
    
    public String getTitle() {
        return NbBundle.getMessage(GmjprojectOptionsCategory.class, "OptionsCategory_Title_Gmjproject");
    }
    
    public OptionsPanelController create() {
        return new GmjprojectOptionsPanelController();
    }
    
}
