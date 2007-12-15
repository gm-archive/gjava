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
            throw new IOException("Buffer end");
        return res[pos++];
    }
    
    public void reset() throws IOException{
        if(pos>=markinvalid)
            pos = 0;
        else
            pos = markpos;
    }
    
    public void mark(int readlimit){
        markpos = pos;
        markinvalid = markpos + readlimit;
    }
    
    public boolean markSupported(){
        return true;
    }
    
    public void skip(int len) throws IOException{
        pos += len;
        if(res==null)
            throw new IOException("Null buffer");
        if(pos>=res.length)
            throw new IOException("Buffer end");
    }
    
    public void close(){
        res = null;
    }
}
