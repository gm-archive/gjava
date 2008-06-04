/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.actions.mainactions;

import com.l2fprod.common.propertysheet.DefaultProperty;
import com.l2fprod.common.propertysheet.Property;
import com.l2fprod.common.propertysheet.PropertySheetPanel;
import org.gcreator.actions.*;
import org.gcreator.actions.components.*;
import javax.swing.*;
import org.gcreator.components.PropertyManager;
import org.gcreator.fileclass.Project;
import org.gcreator.managers.LangSupporter;

/**
 *
 * @author Luís
 */
public class AddImageToSprite extends ActionPattern {

    static final long serialVersionUID = 1L;
    public static ImageIcon img = new ImageIcon(Comment.class.getResource("/org/gcreator/actions/images/Add_Image_To_Sprite.png"));
    public String URL = "",  Sprite = "";
    public FailureBehavior fails_1 = new FailureBehavior(0),
            fails_2 = new FailureBehavior(0);

    public AddImageToSprite() {
        super();
    }

    @Override
    public void save(JComponent panel) {
        //URL = ((AddImageToSpritePanel) panel).URL.getText();
        //Sprite = ((AddImageToSpritePanel) panel).Sprite.getText();
        //fails_1 = ((AddImageToSpritePanel) panel).fails1.getSelectedIndex();
        //fails_2 = ((AddImageToSpritePanel) panel).fails2.getSelectedIndex();
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("URL")) {
                URL = (String) p.getValue();
            } else if (p.getName().equals("Sprite")) {
                Sprite = (String) p.getValue();
            } else if (p.getName().equals("fails1")) {
                fails_1 = (FailureBehavior) p.getValue();
            } else if (p.getName().equals("fails2")) {
                fails_2 = (FailureBehavior) p.getValue();
            }
        }
    }

    @Override
    public void load(JComponent panel) {
        //((AddImageToSpritePanel) panel).URL.setText(URL);
        //((AddImageToSpritePanel) panel).Sprite.setText(Sprite);
        //((AddImageToSpritePanel) panel).fails1.setSelectedIndex(fails_1);
        //((AddImageToSpritePanel) panel).fails2.setSelectedIndex(fails_2);
        Property[] plist = ((PropertySheetPanel) panel).getProperties();
        for (int i = 0; i < plist.length; i++) {
            Property p = plist[i];
            if (p.getName().equals("URL")) {
                p.setValue(URL);
            } else if (p.getName().equals("Sprite")) {
                p.setValue(Sprite);
            } else if (p.getName().equals("fails1")) {
                p.setValue(fails_1);
            } else if (p.getName().equals("fails2")) {
                p.setValue(fails_2);
            }
        }
    }

    @Override
    public void setStandardImage(ImageIcon img) {
        AddImageToSprite.img = img;
    }

    @Override
    public ImageIcon getStandardImage() {
        return img;
    }

    @Override
    public JComponent createNewPanel(org.gcreator.actions.Action action, Project project) {
        //AddImageToSpritePanel panel = new AddImageToSpritePanel();
        PropertyManager panel = new PropertyManager();
        DefaultProperty p;

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("URL");
        p.setDisplayName(LangSupporter.activeLang.getEntry(232));
        p.setType(String.class);
        p.setValue("\"\"");
        p.setEditable(true);
        p.setShortDescription("Sets the URL to retrieve the image from.<br>" +
                "Please note that retrieving an image from the Web may not be a good idea.");
        panel.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Main");
        p.setName("Sprite");
        p.setDisplayName(LangSupporter.activeLang.getEntry(234));
        p.setType(String.class);
        p.setValue("this.getSprite()");
        p.setEditable(true);
        p.setShortDescription("The sprite that should receive the image.");
        panel.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Failure");
        p.setName("fails1");
        p.setDisplayName(LangSupporter.activeLang.getEntry(235));
        p.setType(FailureBehavior.class);
        p.setValue(new FailureBehavior(0));
        p.setEditable(true);
        p.setShortDescription("Expected behavior if, for some reason, the image can't be loader.<br>" +
                "If you're loading from the Web, this <i>could</i> mean that the user is disconnected.");
        panel.addProperty(p);

        p = new DefaultProperty();
        p.setCategory("<html><b>Failure");
        p.setName("fails2");
        p.setDisplayName(LangSupporter.activeLang.getEntry(236));
        p.setType(FailureBehavior.class);
        p.setValue(new FailureBehavior(0));
        p.setEditable(true);
        p.setShortDescription("Expected behavior if, for some reason, the image can't be added to the sprite.<br/>" +
                "The size may be invalid.");
        panel.addProperty(p);

        return panel;
    }

    @Override
    public String getStandardText(JComponent panel) {
        if (panel != null) {
            save(panel);
        }
        return LangSupporter.activeLang.getEntry(229);
    }

    @Override
    public String generateGCL(JComponent cmp) {
        if (cmp != null) {
            save(cmp);
        }
        return "";
    }
}
