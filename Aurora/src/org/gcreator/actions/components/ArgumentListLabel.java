/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.actions.components;

import javax.swing.JLabel;

/**
 *
 * @author Luís
 */
class ArgumentListLabel extends JLabel {

    private static final long serialVersionUID = 1;
    public ArgumentListEditor a;

    ArgumentListLabel(ArgumentListEditor a) {
        this.a = a;
    }

    @Override
    public String getText() {
        if (a == null) {
            return "";
        }
        String s = a.getAsText();
        if (s == null) {
            return "null";
        }
        return s;
    }
}
