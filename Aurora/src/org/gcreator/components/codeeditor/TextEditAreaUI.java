/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.codeeditor;

import java.beans.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.*;

/**
 * @author Serge Humphrey
 */
public class TextEditAreaUI extends BasicTextAreaUI {
    
    /**
     * Creates a UI for a JEditTextArea.
     *
     * @param ta a text area
     * @return the UI
     */
    public static ComponentUI createUI(JComponent ta) {
        return new TextEditAreaUI();
    }

    /**
     * Constructs a new EditTextAreaUI object.
     */
    public TextEditAreaUI() {
	super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public View create(Element elem) {
	Document doc = elem.getDocument();
        JTextComponent c = getComponent();
        return new ColorCodedView(elem, (ColorCodedTextArea) c);
    }
}