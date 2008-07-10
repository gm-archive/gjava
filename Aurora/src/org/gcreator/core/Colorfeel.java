/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.core;

import java.awt.*;

/**
 *
 * @author Luís
 */
public class Colorfeel {
    /*
     * Don't allow instantation.
     * Of course this is also useful if you're using
     * the factory pattern.
     */
    private Colorfeel(){}
    
    public static Color GridDarkColor = Color.BLACK;
    public static Color GridLightColor = Color.WHITE;
    public static Color ConsoleBGColor = Color.WHITE;//LIGHT_GRAY light gray is unbearably ugly
    public static Color ConsoleFGColor = Color.BLACK;
    public static Color GoWindow = new Color(0, 0, 255);
}
