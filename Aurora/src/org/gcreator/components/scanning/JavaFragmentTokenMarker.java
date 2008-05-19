/*
 * JavaScriptTokenMarker.java - JavaScript token marker
 * Copyright (C) 1999 Slava Pestov
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
 * JavaScript token marker.
 *
 * @author Slava Pestov
 * @version $Id: JavaScriptTokenMarker.java,v 1.3 1999/12/13 03:40:29 sp Exp $
 */
public class JavaFragmentTokenMarker extends CTokenMarker {

    public AutocompleteFrame callAutocomplete(int selectionStart, int selectionEnd, JEditTextArea editor, Project project){
        //GSAutocomplete a = new GSAutocomplete(selectionStart, selectionEnd, editor, project);
        //return a;
        return null;
    }

    
    public JavaFragmentTokenMarker() {
        super(false, getKeywords());
    }

    public static KeywordMap getKeywords() {
        if (jfragKeywords == null) {
            jfragKeywords = new KeywordMap(false);
            
            lookup(Token.KEYWORD1, "this");
            lookup(Token.KEYWORD1, "true");
            lookup(Token.KEYWORD1, "false");
            lookup(Token.KEYWORD1, "value");
            lookup(Token.KEYWORD1, "null");
            
            lookup(Token.KEYWORD2, "new");
            lookup(Token.KEYWORD2, "return");
            lookup(Token.KEYWORD2, "if");
            lookup(Token.KEYWORD2, "else");
            lookup(Token.KEYWORD2, "do");
            lookup(Token.KEYWORD2, "while");
            lookup(Token.KEYWORD2, "for");
            lookup(Token.KEYWORD2, "instanceof");
            
            lookup(Token.KEYWORD3, "int");
            lookup(Token.KEYWORD3, "float");
            lookup(Token.KEYWORD3, "double");
            lookup(Token.KEYWORD3, "byte");
            lookup(Token.KEYWORD3, "char");
            lookup(Token.KEYWORD3, "short");
            lookup(Token.KEYWORD3, "long");
            lookup(Token.KEYWORD3, "String");
            lookup(Token.KEYWORD3, "Integer");
            lookup(Token.KEYWORD3, "Double");
            lookup(Token.KEYWORD3, "Float");
            lookup(Token.KEYWORD3, "Boolean");
            lookup(Token.KEYWORD3, "Byte");
            lookup(Token.KEYWORD3, "Character");
            lookup(Token.KEYWORD3, "Long");
            lookup(Token.KEYWORD3, "Short");
            lookup(Token.KEYWORD3, "Color");
        }
        return jfragKeywords;
    }

    private static void lookup(byte type, String keyword) {
        jfragKeywords.add(keyword, type);
    }

    // private members
    private static KeywordMap jfragKeywords;
}
