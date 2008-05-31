/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.units;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
/**
 * An abstract class used for 'censoring'
 * the contet of a PrintStream. (Like China 
 * or the USA does.)
 * 
 * @author Serge Humphrey
 */
public abstract class PrintStreamCensor extends PrintStream {
    public static PrintStream instance;
    
    public PrintStreamCensor(OutputStream out) {
	super(out, false);
    }
    
    public PrintStreamCensor(OutputStream out, boolean autoFlush) {
	super(out, autoFlush);
    }
    
    public PrintStreamCensor(OutputStream out, boolean autoFlush, String encoding)
        throws UnsupportedEncodingException
    {
	super(out, autoFlush, encoding);
    }
    
    public PrintStreamCensor(String fileName) throws FileNotFoundException {
	super(fileName);
    }
    
    public PrintStreamCensor(String fileName, String csn)
	throws FileNotFoundException, UnsupportedEncodingException
    {
	super(fileName, csn);
    }
    
    public PrintStreamCensor(File file) throws FileNotFoundException {
	super(file);
    }

    public PrintStreamCensor(File file, String csn)
	throws FileNotFoundException, UnsupportedEncodingException
    {
	super(file, csn);
    }
    
    @Override
    public void write(int b) {
	super.write(b);
        alert(b);
    }
    @Override
    public void write(byte buf[], int off, int len) {
	super.write(buf, off, len);
    }
    @Override
    public void print(boolean b) {
	super.print(b);
        alert(b);
    }
    @Override
    public void print(char c) {
	super.print(c);
        alert(c);
    }
    @Override
    public void print(int i) {
	super.print(i);
        alert(i);
    }
    @Override
    public void print(long l) {
	super.print(l);
        alert(l);
    }
    @Override
    public void print(float f) {
	super.print(f);
        alert(f);
    }
    @Override
    public void print(double d) {
	super.print(d);
        alert(d);
    }
    @Override
    public void print(char s[]) {
	super.print(s);
        alert(s);
    }
    @Override
    public void print(String s) {
	super.print(s);
        alert(s);
    }
    @Override
    public void print(Object obj) {
	super.print(obj);
        alert(obj);
    }
    @Override
    public void println() {
	super.println();
        alertln();
    }
    @Override
    public void println(boolean x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(char x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(int x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(long x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(float x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(double x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(char x[]) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(String x) {
	super.println(x);
        alertln();
    }
    @Override
    public void println(Object x) {
        super.println(x);
        alertln();
    }
    
    protected abstract void alert(Object o);
    protected abstract void alertln();
}
