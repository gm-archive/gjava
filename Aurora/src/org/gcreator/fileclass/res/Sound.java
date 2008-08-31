/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.fileclass.res;

import java.util.Arrays;

/**
 * The sound resource class
 * @author TGMG
 */
public class Sound implements Resource {

    private static final long serialVersionUID = 4;
    public byte[] data;

    @Override
    public Object clone() {
        Sound s = new Sound();
        s.data = Arrays.copyOf(this.data, this.data.length);
        return s;
    }
}
