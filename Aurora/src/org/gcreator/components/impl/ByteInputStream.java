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

import java.io.*;

/**
 *
 * @author luis
 */
public class ByteInputStream extends InputStream{
    private byte[] res;
    private int pos = 0;
    private int markpos = 0;
    private int markinvalid = 0;
    
    public ByteInputStream(byte[] bytearray){
        res = bytearray;
    }
    
    public int read() throws IOException{
        if(res==null)
            throw new IOException("Null buffer");
        if(pos>=res.length)
            return -1;
        return res[pos++];
    }
    
    public void skip(int len) throws IOException{
        if(res==null)
            throw new IOException("Null buffer");
        if(len<=0)
            return;
        pos += len;
        if(pos>=res.length)
            throw new IOException("Buffer end");
    }
    
    public void close(){
        res = null;
    }
}
