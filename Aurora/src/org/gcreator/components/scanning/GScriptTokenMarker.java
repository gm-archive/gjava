/*
 * JavaScriptTokenMarker.java - JavaScript token marker
 * Copyright (C) 1999 Slava Pestov
 * Copyright (C) 2008 Luís Reis
 *
 * You may use and modify this package for any purpose. Redistribution is
 * permitted, in both source and binary form, provided that this notice
 * remains intact in all source distributions of this package.
 */
package org.gcreator.components.scanning;

import org.gcreator.autocomplete.AutocompleteFrame;
import org.gcreator.autocomplete.GSAutocomplete;
import org.gcreator.components.JEditTextArea;
import org.gcreator.fileclass.Project;
import publicdomain.*;

/**
 * G-Script token marker.
 *
 * @author Slava Pestov, modified by Luís Reis
 * @version $Id: GScriptTokenMarker.java,v 1.3 1999/12/13 03:40:29 sp Exp $
 */
public class GScriptTokenMarker extends CTokenMarker {
    public GSAutocomplete autoFrame;
    
    @Override
    public AutocompleteFrame callAutocomplete(int selectionStart, int selectionEnd, JEditTextArea editor, Project project){
        if (autoFrame == null)
            autoFrame = new GSAutocomplete(selectionStart, selectionEnd, editor, project);
        else {
            autoFrame.resetAutocomplete(selectionStart, selectionEnd, editor, project);
        }
        return autoFrame;
    }

    
    public GScriptTokenMarker() {
        super(false, getKeywords());
    }

    public static KeywordMap getKeywords() {
        if (gscriptKeywords == null) {
            gscriptKeywords = new KeywordMap(false);
            lookup(Token.KEYWORD1, "if");
            lookup(Token.KEYWORD1, "else");
            lookup(Token.KEYWORD1, "while");
            lookup(Token.KEYWORD1, "repeat");
            lookup(Token.KEYWORD1, "do");
            lookup(Token.KEYWORD1, "until");
            lookup(Token.KEYWORD1, "for");
            lookup(Token.KEYWORD1, "switch");
            lookup(Token.KEYWORD1, "case");
            lookup(Token.KEYWORD1, "default");
            lookup(Token.KEYWORD1, "break");
            lookup(Token.KEYWORD1, "break");
            lookup(Token.KEYWORD1, "continue");
            lookup(Token.KEYWORD1, "exit");
            lookup(Token.KEYWORD1, "with");
            lookup(Token.KEYWORD1, "var");
            lookup(Token.KEYWORD1, "global");
            lookup(Token.KEYWORD1, "return");

            lookup(Token.LITERAL2, "true");
            lookup(Token.LITERAL2, "false");
            lookup(Token.LITERAL2, "pi");
            lookup(Token.LITERAL2, "null");

            lookup(Token.KEYWORD2, "score");
            lookup(Token.KEYWORD2, "lives");
            lookup(Token.KEYWORD2, "health");
            lookup(Token.KEYWORD2, "self");
            lookup(Token.KEYWORD2, "other");
        }
        return gscriptKeywords;
    }

    private static void lookup(byte type, String keyword) {
        gscriptKeywords.add(keyword, type);
    }

    // private members
    private static KeywordMap gscriptKeywords;
}
