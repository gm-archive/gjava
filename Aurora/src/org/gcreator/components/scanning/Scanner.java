/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.components.scanning;

import org.gcreator.components.impl.*;
import publicdomain.*;
import org.gcreator.components.SyntaxHighlighter;
import org.gcreator.autocomplete.*;
import org.gcreator.fileclass.Project;

/**
 * @author Luís Reis
 */
public abstract class Scanner implements TokenTypes{
    protected int position;
    protected boolean scanning;
    abstract protected int read();
    abstract public int size();
    abstract public int scan(char[] array, int offset, int length);
    abstract public int change(int start, int len, int newLen);
    public int position()
    {
        if (!scanning)
            return -1;
        else
            return position;
    }
    abstract public Token getToken(int n);
    public AutocompleteFrame callAutocomplete(int selectionStart, int selectionEnd, SyntaxHighlighter editor, Project project){
        return null;
    }
}
