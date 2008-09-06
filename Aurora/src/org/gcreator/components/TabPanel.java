/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.gcreator.core.GPanel;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Project;



/**
 * This abstract class contains basic methods for Resource management.
 * @author Luís
 */
public abstract class TabPanel extends JPanel {

    /**
     * The GPanel to which this {@see TabPanel} belongs to.
     */
    public GPanel parent;
    /**
     * The {@see ExtendedFrame} which this {@see TabPanel} belongs to.
     * This will be <tt>null</tt> if you are not using the MDI view.
     */
    public ExtendedFrame frame;
    /**
     * The title for the tab.
     */
    public String title = "<none>";
    /**
     * The {@see Project} to which this tab belongs to.
     */
    public Project project;
    /**
     * The {@see GFile} that this tab's {@see Resource} belongs to, or
     * <tt>null</tt> if it doesn't belong to any.
     */
    public GFile file = null;

    /**
     * {@inheritDoc}
     */
    public void dispose() {

        if (!wasModified()) {
            parent.remove(this, frame);
            if (file != null) {
                file.tabPanel = null;
            }
        } else {
            java.lang.Object[] options = {"Yes",
                "No",
                "Cancel"
            };
            int n = JOptionPane.showOptionDialog(frame,
                    "You have unsaved changes in your document.\n" +
                    "Do you want to save it?",
                    "Save document?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            if (n == JOptionPane.YES_OPTION) {
                if (Save()) {
                    parent.remove(this, frame);
                    file.tabPanel = null;
                }
            } else {
                parent.remove(this, frame);
                if (file != null) {
                    file.tabPanel = null;
                }
            }
        }
    }

    /**
     * Whether or not this tab's {@see Resource} can be saved.
     * Usually if this returns <tt>false</tt> this means that the
     * it's resource has not been modified.
     * @return Whether or not this tab's {@see Resource} can be saved.
     */
    public boolean canSave() {
        return false;
    }
    
    /**
     * Saves this tab's resources, and returns whether successful.
     * @return <tt>true</tt> if the tab's resources were successfuly saved.
     */
    public boolean Save() {
        return false;
    }
    
    /**
     * I have no sweet clue.
     * @return 
     */
    public boolean Load() {
        return true;
    }

    /**
     * Whether the resource was modified.
     * @return Whether the resource was modified.
     */
    public boolean wasModified() {
        return false; //Allows the application to exit without prompting the user
    }

    public boolean canFind() {
        return false;
    }

    public boolean canReplace() {
        return false;
    }

    public boolean Find(String str, boolean useRegex) {
        //Case insensitive should be generated previously
        return false; //Could not find string
    }

    public boolean Replace(String match, String replace, boolean useRegex) {
        return false; //Could not replace
    }

    public boolean ReplaceAll(String match, String replace, boolean useRegex) {
        return false; //Could not replace
    }

    @Override
    public String toString() {
        return title;
    }
    
    public boolean setModified(boolean modified) {
        return false;
    }
}
