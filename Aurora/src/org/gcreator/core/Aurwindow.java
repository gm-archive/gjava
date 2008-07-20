/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.core;

import java.awt.BorderLayout;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Aurwindow is G-Creator main frame.<br/>
 * It contains several functions essential in G-Creator, including an important
 * part of the user interface.
 * @author Luís Reis
 * @author TGMG
 */
public class Aurwindow extends JFrame implements ICore {

    private static final long serialVersionUID = 1;

    //<editor-fold defaultstate="expanded" desc="Aurwindow">
    protected Aurwindow() {
        setLocationByPlatform(true);
        gcreator.panel = new GPanel(this);
        gcreator.panel.setVisible(true);
        setLayout(new BorderLayout());
        add(gcreator.panel, BorderLayout.CENTER);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    //</editor-fold>
    public void updateUI() {
        ((JPanel) this.getContentPane()).updateUI();
    }

    @Override
    public void dispose() {
        gcreator.panel.dispose();
    }

    //<editor-fold defaultstate="collapsed" desc="disposeIt">
    @Override
    public void disposeIt() {
        System.exit(0);
        super.dispose();
    }
    //</editor-fold>
    public Window getParentWindow() {
        return this;
    }
}
