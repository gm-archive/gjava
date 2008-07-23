/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.sgcl;

import java.io.InputStream;
import java.util.Vector;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

/**
 *
 * @author luis
 */
public class SGCLTranslator {

    private String code = null;
    private InputStream stream = null;
    private SGCLManager manager;

    public SGCLTranslator(String code, SGCLManager manager) {
        this.code = code;
        this.manager = manager;
    }
    public SGCLTranslator(InputStream codestream, SGCLManager manager) {
        stream = codestream;
        this.manager = manager;
    }
    

    public void parse() throws Exception {
        sgclLexer lex;
        if(code!=null)
            lex = new sgclLexer(new ANTLRStringStream(code));
        else
            lex = new sgclLexer(new ANTLRInputStream(stream));
        CommonTokenStream tokenstream = new CommonTokenStream(lex);
        sgclParser p = new sgclParser(tokenstream);
        p.doc();
        TokenStream tost = p.getTokenStream();
        String[] names = p.getTokenNames();
        int size = tost.size();
        Vector<Token> tokens = new Vector<Token>();
        for (int i = 0; i < size; i++) {
            Token t = tost.get(i);
            int type = t.getType();
            if (type == sgclLexer.WHITESPACE) {
                continue;
            }
            if (type == sgclLexer.SLCOMMENT) {
                continue;
            }
            if (type == sgclLexer.MLCOMMENT) {
                continue;
            }
            if (type == sgclLexer.DCOMMENT) {
                continue;
            }
            tokens.add(t);
        }
    }
}
