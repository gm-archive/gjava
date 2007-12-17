/*
 * Emulates input stream based on a byte array
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
        if(pos+1>=res.length)
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
