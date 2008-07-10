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

import java.util.*;

/**
 *
 * @author Luís Reis
 */
public class ClassLoading {
    public static ClassLoading classLoader = new ClassLoading();
    private Vector<ClassLoader> loaders;
    private ClassLoading(){
        loaders = new Vector<ClassLoader>();
        this.add(this.getClass().getClassLoader());
    }
    public void add(ClassLoader loader){
        if(loader!=null) {
            loaders.add(loader);
        }
    }
    public void remove(ClassLoader loader){
        loaders.remove(loader);
    }
    public boolean contains(ClassLoader loader){
        return loaders.contains(loader);
    }
    public Enumeration<ClassLoader> elements(){
        return loaders.elements();
    }
    public Class loadClass(String x){
        Class cls = null;
        for(ClassLoader loader : loaders){
            try{
                cls = loader.loadClass(x);
                //System.out.println("class "+x+" was successfully loaded.");
                break;
            }
            catch(ClassNotFoundException e){
                //System.out.println("class "+x+" not found in ClassLoader "+loader);
                cls = null;
            }
        }
        return cls;
    }
}
