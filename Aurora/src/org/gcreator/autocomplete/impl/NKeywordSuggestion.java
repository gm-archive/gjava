/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.autocomplete.impl;

/**
 * @author Luís Reis
 */
public class NKeywordSuggestion extends KeywordSuggestion{
    public NKeywordSuggestion(){}
    
    public NKeywordSuggestion(String text){
        super(text);
    }
    
    public String confirm(String context, String prevWord){
        return (text + "(\"").substring(context.length());
    }
}
