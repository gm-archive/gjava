/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete.impl;

/**
 * @author Luís Reis
 */
public class NKeywordSuggestion extends KeywordSuggestion {

    public NKeywordSuggestion() {
    }

    public NKeywordSuggestion(String text) {
        super(text);
    }

    @Override
    public String confirm(String context, String prevWord) {
        return (text + "(\"\")").substring(context.length());
    }

    @Override
    public int retreat() {
        return 2;
    }
}
