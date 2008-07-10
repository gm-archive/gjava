/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (c) 2008 BobSerge or Bobistaken <serge_1994@hotmail.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete.impl;

/**
 * @author Luís Reis
 */
public class CKeywordSuggestion extends KeywordSuggestion{
    public CKeywordSuggestion(){}
    
    public CKeywordSuggestion(String text){
        super(text);
    }
    
    public String confirm(String context, String prevWord){
        return (text + "(").substring(context.length());
    }
}
