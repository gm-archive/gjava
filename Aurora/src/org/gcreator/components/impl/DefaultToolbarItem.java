/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.components.impl;

import javax.swing.*;
import org.gcreator.managers.*;

/**
 *
 * @author luis
 */
public class DefaultToolbarItem extends ToolbarButton{
    public DefaultToolbarItem(String id, ImageIcon img, int lang){
        super(id, LangSupporter.activeLang.getEntry(lang), img);
    }
}
