/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.macro;

import java.util.*;

/**
 * Stores all the information about macros
 * @author Luís
 */
/*public class MacroLibrary{
    private static Vector<Macro> macros = new Vector<Macro>();
    
    public static boolean addMacro(Macro macro){
        if(findMacro(macro.getName())==null){
            macros.add(macro);
            return true;
        }
        return false;
    }
    
    public static Macro getMacroAt(int i){
        return macros.get(i);
    }
    
    public static Macro findMacro(String name){
        Enumeration<Macro> menum = macros.elements();
        Macro m;
        while(menum.hasMoreElements()){
            m = menum.nextElement();
            if(m.getName().equals(name))
                return m;
        }
        return null;
    }
    
    public static int getSize(){
        return macros.size();
    }
    
    public static String[] getMacroNames(){
        Vector<String> x = new Vector<String>();
        Enumeration<Macro> menum = macros.elements();
        Macro m;
        while(menum.hasMoreElements()){
            m = menum.nextElement();
            x.add(m.getName());
        }
        Object[] _ret = x.toArray();
        String[] ret = new String[_ret.length];
        for(int i = 0; i < _ret.length; i++){
            ret[i] = _ret[i].toString();
        }
        Arrays.sort(ret);
        return ret;
    }
    
    public static void playMacroWithName(String name){
        for(Macro macro : macros){
            if(macro.getName().equals(name)){
                macro.play();
                break;
            }
        }
    }
}*/
