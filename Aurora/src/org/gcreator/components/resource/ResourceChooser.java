/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.resource;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import org.gcreator.fileclass.GFile;
import org.gcreator.fileclass.Project;

/**
 *
 * @author Luís
 */
public class ResourceChooser extends JComponent {

    private static final long serialVersionUID = 1;
    private FileLabel label;

    public ResourceChooser(Project p, String key) {
        label = new FileLabel(p, key);

        label.setVisible(true);

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }

    public void setFile(GFile file) {
        label.setFile(file);
    }

    public GFile getFile() {
        return label.getFile();
    }

    public boolean isSaveChecked() {
        return label.isSaveChecked();
    }

    public void addActionListener(ActionListener a) {
        label.addActionListener(a);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 30);
    }
}
