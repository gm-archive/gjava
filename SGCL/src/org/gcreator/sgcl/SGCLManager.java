/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.sgcl;

import java.util.Vector;
import org.antlr.runtime.Token;

/**
 *
 * @author luis
 */
public interface SGCLManager {
    public void outputCode(Vector<Token> tokens);
    public boolean supportsExtension(String extension);
}
