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
/*internal*/ class ArgumentListLabel extends JLabel{
    ArgumentListLabel(ArgumentList a){
        super(a==null?"":a.toString());
    }
}
