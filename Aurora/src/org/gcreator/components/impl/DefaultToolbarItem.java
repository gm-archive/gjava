/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import javax.swing.*;
import org.gcreator.units.Dictionary;

/**
 *
 * @author luis
 */
public class DefaultToolbarItem extends ToolbarButton{
    public DefaultToolbarItem(String id, ImageIcon img, String lang){
        super(id, Dictionary.getEntry(lang), img);
    }
}
