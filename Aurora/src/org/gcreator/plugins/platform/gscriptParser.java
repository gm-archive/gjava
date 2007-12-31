// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2007-12-31 03:00:11

package org.gcreator.plugins.platform;
import org.gcreator.plugins.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
public class gscriptParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "WORD", "NEGINTEGER", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&\\\\'", "'^='", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int LETTER=30;
    public static final int GTE=16;
    public static final int NUMBER=23;
    public static final int WHITESPACE=31;
    public static final int NEGINTEGER=22;
    public static final int EQUALS=12;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int LBRAC=10;
    public static final int LPAREN=8;
    public static final int WORD=21;
    public static final int ML_COMMENT=33;
    public static final int RPAREN=9;
    public static final int DECIMAL=26;
    public static final int RBRAC=11;
    public static final int DOC_COMMENT=20;
    public static final int GT=15;
    public static final int STRING_DOUBLE=34;
    public static final int GLOBALVAR=28;
    public static final int PLUS=4;
    public static final int STRING_SINGLE=35;
    public static final int DIGIT=29;
    public static final int DIV=7;
    public static final int COMMENT=32;
    public static final int OIVAR=27;
    public static final int STRING=25;
    public static final int HEXNUMBER=24;
    public static final String[] ruleNames = new String[] {
        "invalidRule", "classes", "code", "statement", "field", "method", 
        "bstatement", "varstatement", "returnstatement", "exitstatement", 
        "ifstatement", "elsestatement", "expression", "notexpression", "aexpression", 
        "value", "pexpression", "andexpression", "orexpression", "xorexpression", 
        "relationalExpression", "repeatstatement", "breakstatement", "continuestatement", 
        "dostatement", "whilestatement", "forstatement", "switchstatement", 
        "withstatement", "assignment", "variable", "function", "function2", 
        "array", "synpred1", "synpred20", "synpred24", "synpred29", "synpred38", 
        "synpred39", "synpred42", "synpred46", "synpred49", "synpred62", 
        "synpred73", "synpred87", "synpred88"
    };

    public int ruleLevel = 0;
    public gscriptParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }

            ruleMemo = new Map[143+1];
    }
    public gscriptParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT);
    }
    public gscriptParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g"; }

    
    public PlatformCore pc = new PlatformCore();
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    



    // $ANTLR start classes
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:52:1: classes : ( (f= method | m= field ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;


        try { dbg.enterRule("classes");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(52, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:1: ( ( (f= method | m= field ) ( ';' )* )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:3: ( (f= method | m= field ) ( ';' )* )*
            {
            dbg.location(53,3);
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            dbg.location(53,24);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:24: ( (f= method | m= field ) ( ';' )* )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=41)) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= method | m= field ) ( ';' )*
            	    {
            	    dbg.location(53,25);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= method | m= field )
            	    int alt1=2;
            	    try { dbg.enterSubRule(1);
            	    try { dbg.enterDecision(1);

            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case WORD:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case 39:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case 41:
            	                {
            	                int LA1_24 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 24, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 40:
            	                {
            	                int LA1_25 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 25, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 7, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_26 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 26, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case 39:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 8, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 39:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 38:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case WORD:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case 39:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case 41:
            	                {
            	                int LA1_31 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 31, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 40:
            	                {
            	                int LA1_32 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 32, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 11, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_33 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 33, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case 39:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 12, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case WORD:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        case 39:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 2, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 40:
            	        {
            	        switch ( input.LA(2) ) {
            	        case WORD:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        case 39:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_36 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 36, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case 39:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 17, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 40:
            	            {
            	            int LA1_18 = input.LA(3);

            	            if ( (LA1_18==WORD) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_18==39) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 18, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 3, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 41:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            int LA1_19 = input.LA(3);

            	            if ( (LA1_19==39) ) {
            	                alt1=2;
            	            }
            	            else if ( (LA1_19==WORD) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 19, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            alt1=1;
            	            }
            	            break;
            	        case 39:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 4, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case WORD:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("53:25: (f= method | m= field )", 1, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(1);}

            	    switch (alt1) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: f= method
            	            {
            	            dbg.location(53,27);
            	            pushFollow(FOLLOW_method_in_classes199);
            	            f=method();
            	            _fsp--;
            	            if (failed) return ;
            	            dbg.location(53,34);
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:71: m= field
            	            {
            	            dbg.location(53,72);
            	            pushFollow(FOLLOW_field_in_classes204);
            	            m=field();
            	            _fsp--;
            	            if (failed) return ;
            	            dbg.location(53,78);
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(53,116);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:116: ( ';' )*
            	    try { dbg.enterSubRule(2);

            	    loop2:
            	    do {
            	        int alt2=2;
            	        try { dbg.enterDecision(2);

            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        } finally {dbg.exitDecision(2);}

            	        switch (alt2) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:117: ';'
            	    	    {
            	    	    dbg.location(53,117);
            	    	    match(input,36,FOLLOW_36_in_classes209); if (failed) return ;
            	    	    dbg.location(53,120);
            	    	    if ( backtracking==0 ) {
            	    	      System.out.println(";");
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(2);}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, classes_StartIndex); }
        }
        dbg.location(54, 1);

        }
        finally {
            dbg.exitRule("classes");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end classes


    // $ANTLR start code
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:56:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        statement_return s = null;


        try { dbg.enterRule("code");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(56, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:1: ( ( (s= statement )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:3: ( (s= statement )* )
            {
            dbg.location(57,3);
            if ( backtracking==0 ) {
               pc.returncode ="";
            }
            dbg.location(57,25);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:25: ( (s= statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:26: (s= statement )*
            {
            dbg.location(57,26);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:26: (s= statement )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==39||LA4_0==43||(LA4_0>=45 && LA4_0<=47)||(LA4_0>=67 && LA4_0<=70)||(LA4_0>=72 && LA4_0<=74)||LA4_0==78) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:27: s= statement
            	    {
            	    dbg.location(57,28);
            	    pushFollow(FOLLOW_statement_in_code230);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return ;
            	    dbg.location(57,38);
            	    if ( backtracking==0 ) {
            	      pc.returncode += "\n " + s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, code_StartIndex); }
        }
        dbg.location(58, 1);

        }
        finally {
            dbg.exitRule("code");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end code

    public static class statement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start statement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:60:1: statement returns [String value] : (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* ;
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        String b = null;

        varstatement_return v = null;

        String r = null;

        String e = null;

        String ifs = null;

        String rep = null;

        String dos = null;

        String wh = null;

        String con = null;

        String br = null;

        String fors = null;

        String sw = null;

        String wit = null;

        String fun2 = null;

        String ass = null;

        String fun = null;


        try { dbg.enterRule("statement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(60, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:1: ( (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:3: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )*
            {
            dbg.location(61,3);
            if ( backtracking==0 ) {
              retval.value = "";
            }
            dbg.location(61,18);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:18: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )
            int alt5=16;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case LBRAC:
            case 43:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 45:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            case 67:
                {
                alt5=6;
                }
                break;
            case 70:
                {
                alt5=7;
                }
                break;
            case 72:
                {
                alt5=8;
                }
                break;
            case 69:
                {
                alt5=9;
                }
                break;
            case 68:
                {
                alt5=10;
                }
                break;
            case 73:
                {
                alt5=11;
                }
                break;
            case 74:
                {
                alt5=12;
                }
                break;
            case 78:
                {
                alt5=13;
                }
                break;
            case OIVAR:
                {
                int LA5_14 = input.LA(2);

                if ( (LA5_14==EQUALS||LA5_14==66||(LA5_14>=79 && LA5_14<=86)) ) {
                    alt5=15;
                }
                else if ( (LA5_14==LPAREN) ) {
                    alt5=14;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:18: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 14, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                int LA5_15 = input.LA(2);

                if ( (LA5_15==EQUALS||LA5_15==66||(LA5_15>=79 && LA5_15<=86)) ) {
                    alt5=15;
                }
                else if ( (LA5_15==LPAREN) ) {
                    alt5=16;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:18: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 15, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case GLOBALVAR:
                {
                alt5=15;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("61:18: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:19: b= bstatement
                    {
                    dbg.location(61,20);
                    pushFollow(FOLLOW_bstatement_in_statement253);
                    b=bstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,31);
                    if ( backtracking==0 ) {
                      retval.value += b;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:53: v= varstatement
                    {
                    dbg.location(61,54);
                    pushFollow(FOLLOW_varstatement_in_statement258);
                    v=varstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,67);
                    if ( backtracking==0 ) {
                      retval.value += v.value+";";
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:93: r= returnstatement
                    {
                    dbg.location(61,94);
                    pushFollow(FOLLOW_returnstatement_in_statement263);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,110);
                    if ( backtracking==0 ) {
                      retval.value += r+";";
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:136: e= exitstatement
                    {
                    dbg.location(61,137);
                    pushFollow(FOLLOW_exitstatement_in_statement268);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,151);
                    if ( backtracking==0 ) {
                      retval.value += e+";";
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:177: ifs= ifstatement
                    {
                    dbg.location(61,180);
                    pushFollow(FOLLOW_ifstatement_in_statement273);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,192);
                    if ( backtracking==0 ) {
                      retval.value += ifs;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:216: rep= repeatstatement
                    {
                    dbg.location(61,219);
                    pushFollow(FOLLOW_repeatstatement_in_statement278);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,235);
                    if ( backtracking==0 ) {
                      retval.value += rep;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:259: dos= dostatement
                    {
                    dbg.location(61,262);
                    pushFollow(FOLLOW_dostatement_in_statement283);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,274);
                    if ( backtracking==0 ) {
                      retval.value += dos;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:298: wh= whilestatement
                    {
                    dbg.location(61,300);
                    pushFollow(FOLLOW_whilestatement_in_statement288);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,315);
                    if ( backtracking==0 ) {
                      retval.value += wh;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:338: con= continuestatement
                    {
                    dbg.location(61,341);
                    pushFollow(FOLLOW_continuestatement_in_statement293);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,359);
                    if ( backtracking==0 ) {
                      retval.value += con+";";
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:387: br= breakstatement
                    {
                    dbg.location(61,389);
                    pushFollow(FOLLOW_breakstatement_in_statement298);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,404);
                    if ( backtracking==0 ) {
                      retval.value += br+";";
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:431: fors= forstatement
                    {
                    dbg.location(61,435);
                    pushFollow(FOLLOW_forstatement_in_statement303);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,448);
                    if ( backtracking==0 ) {
                      retval.value += fors;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:473: sw= switchstatement
                    {
                    dbg.location(61,475);
                    pushFollow(FOLLOW_switchstatement_in_statement308);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,491);
                    if ( backtracking==0 ) {
                      retval.value += sw;
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:514: wit= withstatement
                    {
                    dbg.location(61,517);
                    pushFollow(FOLLOW_withstatement_in_statement313);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,531);
                    if ( backtracking==0 ) {
                      retval.value += wit;
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:555: fun2= function2
                    {
                    dbg.location(61,559);
                    pushFollow(FOLLOW_function2_in_statement318);
                    fun2=function2();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,569);
                    if ( backtracking==0 ) {
                      retval.value += fun2+";";
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:598: ass= assignment
                    {
                    dbg.location(61,601);
                    pushFollow(FOLLOW_assignment_in_statement323);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,612);
                    if ( backtracking==0 ) {
                      retval.value += ass+";";
                    }

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:640: fun= function
                    {
                    dbg.location(61,643);
                    pushFollow(FOLLOW_function_in_statement328);
                    fun=function();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,652);
                    if ( backtracking==0 ) {
                      retval.value += fun+";";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(61,681);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:681: ( ';' )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    int LA6_21 = input.LA(2);

                    if ( (synpred20()) ) {
                        alt6=1;
                    }


                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:682: ';'
            	    {
            	    dbg.location(61,682);
            	    match(input,36,FOLLOW_36_in_statement333); if (failed) return retval;
            	    dbg.location(61,685);
            	    if ( backtracking==0 ) {
            	      System.out.println(";");
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, statement_StartIndex); }
        }
        dbg.location(62, 1);

        }
        finally {
            dbg.exitRule("statement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end statement


    // $ANTLR start field
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:1: field returns [String value] : ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try { dbg.enterRule("field");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(65, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:1: ( ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:3: ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement )
            {
            dbg.location(66,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:3: ( 'public' | ( 'private' | 'var' ) )?
            int alt7=3;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            switch ( input.LA(1) ) {
                case 37:
                    {
                    alt7=1;
                    }
                    break;
                case 39:
                    {
                    int LA7_2 = input.LA(2);

                    if ( ((LA7_2>=39 && LA7_2<=41)) ) {
                        alt7=2;
                    }
                    }
                    break;
                case 38:
                    {
                    alt7=2;
                    }
                    break;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:4: 'public'
                    {
                    dbg.location(66,4);
                    match(input,37,FOLLOW_37_in_field353); if (failed) return value;
                    dbg.location(66,13);
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:34: ( 'private' | 'var' )
                    {
                    dbg.location(66,34);
                    if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field357);    throw mse;
                    }

                    dbg.location(66,52);
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(66,76);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:76: ( 'final' )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred24()) ) {
                    alt8=1;
                }
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:77: 'final'
                    {
                    dbg.location(66,77);
                    match(input,40,FOLLOW_40_in_field368); if (failed) return value;
                    dbg.location(66,84);
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(66,108);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:108: ( 'static' )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:109: 'static'
                    {
                    dbg.location(66,109);
                    match(input,41,FOLLOW_41_in_field374); if (failed) return value;
                    dbg.location(66,117);
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(66,142);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:142: ( 'final' )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:143: 'final'
                    {
                    dbg.location(66,143);
                    match(input,40,FOLLOW_40_in_field380); if (failed) return value;
                    dbg.location(66,150);
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(66,174);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:174: (v= varstatement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:175: v= varstatement
            {
            dbg.location(66,176);
            pushFollow(FOLLOW_varstatement_in_field388);
            v=varstatement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(66,191);
            if ( backtracking==0 ) {
              value = pc.fieldstatement(value,input.toString(v.start,v.stop));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, field_StartIndex); }
        }
        dbg.location(67, 1);

        }
        finally {
            dbg.exitRule("field");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end field


    // $ANTLR start method
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:1: method returns [String value] : ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token name=null;
        Token e=null;
        String b = null;


        String s = "";
        try { dbg.enterRule("method");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(69, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:1: ( ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:3: ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement
            {
            dbg.location(70,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:3: ( 'public' | 'private' )?
            int alt11=3;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:4: 'public'
                    {
                    dbg.location(70,4);
                    match(input,37,FOLLOW_37_in_method410); if (failed) return value;
                    dbg.location(70,12);
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:33: 'private'
                    {
                    dbg.location(70,33);
                    match(input,38,FOLLOW_38_in_method413); if (failed) return value;
                    dbg.location(70,42);
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(70,66);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:66: ( 'final' )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred29()) ) {
                    alt12=1;
                }
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:67: 'final'
                    {
                    dbg.location(70,67);
                    match(input,40,FOLLOW_40_in_method419); if (failed) return value;
                    dbg.location(70,74);
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(70,98);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:98: ( 'static' )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:99: 'static'
                    {
                    dbg.location(70,99);
                    match(input,41,FOLLOW_41_in_method425); if (failed) return value;
                    dbg.location(70,107);
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(70,132);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:132: ( 'final' )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:133: 'final'
                    {
                    dbg.location(70,133);
                    match(input,40,FOLLOW_40_in_method431); if (failed) return value;
                    dbg.location(70,140);
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(70,168);
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method438); if (failed) return value;
            dbg.location(70,174);
            match(input,LPAREN,FOLLOW_LPAREN_in_method440); if (failed) return value;
            dbg.location(70,178);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:178: (e= WORD ( ( ',' ) (e= WORD )? )* )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:179: e= WORD ( ( ',' ) (e= WORD )? )*
                    {
                    dbg.location(70,180);
                    e=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_method445); if (failed) return value;
                    dbg.location(70,186);
                    if ( backtracking==0 ) {
                      s = e.getText();
                    }
                    dbg.location(70,201);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:201: ( ( ',' ) (e= WORD )? )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:202: ( ',' ) (e= WORD )?
                    	    {
                    	    dbg.location(70,202);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:202: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:203: ','
                    	    {
                    	    dbg.location(70,203);
                    	    match(input,42,FOLLOW_42_in_method451); if (failed) return value;

                    	    }

                    	    dbg.location(70,208);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:208: (e= WORD )?
                    	    int alt15=2;
                    	    try { dbg.enterSubRule(15);
                    	    try { dbg.enterDecision(15);

                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==WORD) ) {
                    	        alt15=1;
                    	    }
                    	    } finally {dbg.exitDecision(15);}

                    	    switch (alt15) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:209: e= WORD
                    	            {
                    	            dbg.location(70,210);
                    	            e=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_method457); if (failed) return value;
                    	            dbg.location(70,215);
                    	            if ( backtracking==0 ) {
                    	              s += ", "+e.getText();
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(15);}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}

            dbg.location(70,242);
            match(input,RPAREN,FOLLOW_RPAREN_in_method466); if (failed) return value;
            dbg.location(70,247);
            pushFollow(FOLLOW_bstatement_in_method470);
            b=bstatement();
            _fsp--;
            if (failed) return value;
            dbg.location(70,259);
            if ( backtracking==0 ) {
              value = pc.methodstatement(value,"",name.getText(),b,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, method_StartIndex); }
        }
        dbg.location(71, 1);

        }
        finally {
            dbg.exitRule("method");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end method


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        statement_return s = null;


        try { dbg.enterRule("bstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(74, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            dbg.location(75,3);
            if ( backtracking==0 ) {
              value = "";
            }
            dbg.location(75,18);
            if ( input.LA(1)==LBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement488);    throw mse;
            }

            dbg.location(75,34);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: (s= statement )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==LBRAC||LA18_0==WORD||(LA18_0>=OIVAR && LA18_0<=GLOBALVAR)||LA18_0==39||LA18_0==43||(LA18_0>=45 && LA18_0<=47)||(LA18_0>=67 && LA18_0<=70)||(LA18_0>=72 && LA18_0<=74)||LA18_0==78) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:35: s= statement
            	    {
            	    dbg.location(75,36);
            	    pushFollow(FOLLOW_statement_in_bstatement497);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(75,46);
            	    if ( backtracking==0 ) {
            	      value +=s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(75,69);
            if ( input.LA(1)==RBRAC||input.LA(1)==44 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement502);    throw mse;
            }

            dbg.location(75,83);
            if ( backtracking==0 ) {
              value =pc.bstatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, bstatement_StartIndex); }
        }
        dbg.location(76, 1);

        }
        finally {
            dbg.exitRule("bstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end bstatement

    public static class varstatement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start varstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:1: varstatement returns [String value] : 'var' (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try { dbg.enterRule("varstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(78, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:1: ( 'var' (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:3: 'var' (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            dbg.location(79,3);
            match(input,39,FOLLOW_39_in_varstatement526); if (failed) return retval;
            dbg.location(79,9);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:9: (vari= variable | ass= assignment )
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==WORD||(LA19_0>=OIVAR && LA19_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA19_40 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 40, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA19_41 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 41, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA19_42 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 42, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA19_43 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 43, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA19_44 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 44, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA19_45 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 45, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA19_46 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 46, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA19_47 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt19=1;
                        }
                        else if ( (true) ) {
                            alt19=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 47, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case LPAREN:
                case RPAREN:
                case LBRAC:
                case RBRAC:
                case WORD:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case OIVAR:
                case GLOBALVAR:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 49:
                case 50:
                case 51:
                case 52:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 78:
                    {
                    alt19=1;
                    }
                    break;
                case EQUALS:
                case 66:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt19=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("79:9: (vari= variable | ass= assignment )", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:10: vari= variable
                    {
                    dbg.location(79,14);
                    pushFollow(FOLLOW_variable_in_varstatement531);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(79,23);
                    if ( backtracking==0 ) {
                      s = ""+vari.value;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:46: ass= assignment
                    {
                    dbg.location(79,49);
                    pushFollow(FOLLOW_assignment_in_varstatement537);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(79,60);
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(79,83);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:83: ( ',' (varii= variable | ass= assignment ) )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:84: ',' (varii= variable | ass= assignment )
            	    {
            	    dbg.location(79,84);
            	    match(input,42,FOLLOW_42_in_varstatement543); if (failed) return retval;
            	    dbg.location(79,88);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:88: (varii= variable | ass= assignment )
            	    int alt20=2;
            	    try { dbg.enterSubRule(20);
            	    try { dbg.enterDecision(20);

            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==WORD||(LA20_0>=OIVAR && LA20_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 86:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                int LA20_40 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 40, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA20_41 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 41, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA20_42 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 42, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA20_43 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 43, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA20_44 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 44, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA20_45 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 45, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA20_46 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 46, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 51:
            	            case 52:
            	                {
            	                int LA20_47 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt20=1;
            	                }
            	                else if ( (true) ) {
            	                    alt20=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 47, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 2, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case EOF:
            	        case LPAREN:
            	        case RPAREN:
            	        case LBRAC:
            	        case RBRAC:
            	        case WORD:
            	        case NUMBER:
            	        case HEXNUMBER:
            	        case STRING:
            	        case DECIMAL:
            	        case OIVAR:
            	        case GLOBALVAR:
            	        case 36:
            	        case 37:
            	        case 38:
            	        case 39:
            	        case 40:
            	        case 41:
            	        case 42:
            	        case 43:
            	        case 44:
            	        case 45:
            	        case 46:
            	        case 47:
            	        case 49:
            	        case 50:
            	        case 51:
            	        case 52:
            	        case 67:
            	        case 68:
            	        case 69:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 76:
            	        case 78:
            	            {
            	            alt20=1;
            	            }
            	            break;
            	        case EQUALS:
            	        case 66:
            	        case 79:
            	        case 80:
            	        case 81:
            	        case 82:
            	        case 83:
            	        case 84:
            	        case 85:
            	            {
            	            alt20=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("79:88: (varii= variable | ass= assignment )", 20, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(20);}

            	    switch (alt20) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:89: varii= variable
            	            {
            	            dbg.location(79,94);
            	            pushFollow(FOLLOW_variable_in_varstatement548);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(79,103);
            	            if ( backtracking==0 ) {
            	              s += ", "+varii.value;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:130: ass= assignment
            	            {
            	            dbg.location(79,133);
            	            pushFollow(FOLLOW_assignment_in_varstatement554);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(79,144);
            	            if ( backtracking==0 ) {
            	              s += ","+ ass;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(20);}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(79,174);
            if ( backtracking==0 ) {
              retval.value =pc.varstatement("var",s);
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, varstatement_StartIndex); }
        }
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule("varstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:1: returnstatement returns [String value] : 'return' (e= expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("returnstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(82, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:1: ( 'return' (e= expression ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:3: 'return' (e= expression )
            {
            dbg.location(83,3);
            match(input,45,FOLLOW_45_in_returnstatement577); if (failed) return value;
            dbg.location(83,12);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:12: (e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:13: e= expression
            {
            dbg.location(83,14);
            pushFollow(FOLLOW_expression_in_returnstatement582);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(83,25);
            if ( backtracking==0 ) {
              value =input.toString(e.start,e.stop);
            }

            }

            dbg.location(83,44);
            if ( backtracking==0 ) {
              value =pc.returnstatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, returnstatement_StartIndex); }
        }
        dbg.location(84, 1);

        }
        finally {
            dbg.exitRule("returnstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:86:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try { dbg.enterRule("exitstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(86, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:1: ( 'exit' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:2: 'exit'
            {
            dbg.location(87,2);
            match(input,46,FOLLOW_46_in_exitstatement598); if (failed) return value;
            dbg.location(87,10);
            if ( backtracking==0 ) {
              value ="";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, exitstatement_StartIndex); }
        }
        dbg.location(88, 1);

        }
        finally {
            dbg.exitRule("exitstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;

        String el = null;


        try { dbg.enterRule("ifstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(90, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:4: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            dbg.location(91,4);
            match(input,47,FOLLOW_47_in_ifstatement615); if (failed) return value;
            dbg.location(91,10);
            pushFollow(FOLLOW_expression_in_ifstatement619);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(91,22);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:22: ( 'then' )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:23: 'then'
                    {
                    dbg.location(91,23);
                    match(input,48,FOLLOW_48_in_ifstatement622); if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(91,32);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:32: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:33: s= statement
            {
            dbg.location(91,34);
            pushFollow(FOLLOW_statement_in_ifstatement629);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(91,46);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:46: (el= elsestatement )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    int LA23_20 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==50) ) {
                    int LA23_21 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt23=1;
                    }


                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:47: el= elsestatement
            	    {
            	    dbg.location(91,49);
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement635);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(91,63);
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}

            dbg.location(91,88);
            if ( backtracking==0 ) {
              value =pc.ifstatement(e.value,s.value,value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ifstatement_StartIndex); }
        }
        dbg.location(92, 1);

        }
        finally {
            dbg.exitRule("ifstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("elsestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(94, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            dbg.location(95,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:3: ( 'else' | ( 'elsif' e= expression ) )
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            else if ( (LA24_0==50) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("95:3: ( 'else' | ( 'elsif' e= expression ) )", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:4: 'else'
                    {
                    dbg.location(95,4);
                    match(input,49,FOLLOW_49_in_elsestatement655); if (failed) return value;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:11: ( 'elsif' e= expression )
                    {
                    dbg.location(95,11);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:11: ( 'elsif' e= expression )
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:12: 'elsif' e= expression
                    {
                    dbg.location(95,12);
                    match(input,50,FOLLOW_50_in_elsestatement658); if (failed) return value;
                    dbg.location(95,21);
                    pushFollow(FOLLOW_expression_in_elsestatement662);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(95,33);
                    if ( backtracking==0 ) {
                      value ="if "+input.toString(e.start,e.stop);
                    }

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(95,60);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:60: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:61: s= statement
            {
            dbg.location(95,62);
            pushFollow(FOLLOW_statement_in_elsestatement671);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(95,73);
            if ( backtracking==0 ) {
              value +=" "+input.toString(s.start,s.stop);
            }

            }

            dbg.location(95,98);
            if ( backtracking==0 ) {
              value =pc.elsestatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, elsestatement_StartIndex); }
        }
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule("elsestatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end elsestatement

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:1: expression returns [String value] : (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        String p = null;

        String r = null;

        String n = null;

        String aa = null;

        String an = null;

        String orr = null;

        String x = null;

        expression_return e = null;


        String a = "";
        try { dbg.enterRule("expression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(99, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:1: ( (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:4: (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            dbg.location(100,4);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:4: (p= pexpression | r= relationalExpression | n= notexpression )
            int alt25=3;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt25=1;
                }
                break;
            case WORD:
            case NUMBER:
            case HEXNUMBER:
            case STRING:
            case DECIMAL:
            case OIVAR:
            case GLOBALVAR:
                {
                alt25=2;
                }
                break;
            case 51:
            case 52:
                {
                alt25=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("100:4: (p= pexpression | r= relationalExpression | n= notexpression )", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:5: p= pexpression
                    {
                    dbg.location(100,6);
                    pushFollow(FOLLOW_pexpression_in_expression699);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(100,18);
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:38: r= relationalExpression
                    {
                    dbg.location(100,39);
                    pushFollow(FOLLOW_relationalExpression_in_expression704);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(100,60);
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:80: n= notexpression
                    {
                    dbg.location(100,81);
                    pushFollow(FOLLOW_notexpression_in_expression709);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(100,95);
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(100,116);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:116: (aa= aexpression )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=PLUS && LA26_0<=DIV)||LA26_0==NEGINTEGER||(LA26_0>=53 && LA26_0<=59)) ) {
                    int LA26_36 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt26=1;
                    }


                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:117: aa= aexpression
            	    {
            	    dbg.location(100,119);
            	    pushFollow(FOLLOW_aexpression_in_expression716);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    dbg.location(100,132);
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}

            dbg.location(100,161);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:161: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                switch ( input.LA(1) ) {
                case 60:
                case 61:
                    {
                    int LA28_33 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 62:
                case 63:
                    {
                    int LA28_34 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA28_35 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:162: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    dbg.location(100,162);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:162: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt27=3;
            	    try { dbg.enterSubRule(27);
            	    try { dbg.enterDecision(27);

            	    switch ( input.LA(1) ) {
            	    case 60:
            	    case 61:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 62:
            	    case 63:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("100:162: (an= andexpression | orr= orexpression | x= xorexpression )", 27, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(27);}

            	    switch (alt27) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:163: an= andexpression
            	            {
            	            dbg.location(100,165);
            	            pushFollow(FOLLOW_andexpression_in_expression726);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(100,179);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:205: orr= orexpression
            	            {
            	            dbg.location(100,208);
            	            pushFollow(FOLLOW_orexpression_in_expression731);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(100,221);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:248: x= xorexpression
            	            {
            	            dbg.location(100,249);
            	            pushFollow(FOLLOW_xorexpression_in_expression736);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(100,263);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(27);}

            	    dbg.location(100,289);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:289: (e= expression )
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:290: e= expression
            	    {
            	    dbg.location(100,291);
            	    pushFollow(FOLLOW_expression_in_expression743);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    dbg.location(100,302);
            	    if ( backtracking==0 ) {
            	      retval.value =" "+e.value;
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}

            dbg.location(100,329);
            if ( backtracking==0 ) {
              retval.value =pc.expression(retval.value);
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, expression_StartIndex); }
        }
        dbg.location(101, 1);

        }
        finally {
            dbg.exitRule("expression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("notexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(103, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:1: ( ( 'not' | '!' ) e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:3: ( 'not' | '!' ) e= expression
            {
            dbg.location(104,3);
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression762);    throw mse;
            }

            dbg.location(104,16);
            pushFollow(FOLLOW_expression_in_notexpression770);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(104,28);
            if ( backtracking==0 ) {
              value =pc.notexpression(e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, notexpression_StartIndex); }
        }
        dbg.location(105, 1);

        }
        finally {
            dbg.exitRule("notexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:107:1: aexpression returns [String value] : a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("aexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(107, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:1: (a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:3: a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            dbg.location(108,4);
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=53 && input.LA(1)<=59) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression787);    throw mse;
            }

            dbg.location(108,68);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:68: ( expression )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29);

            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA29_399 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA29_400 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA29_401 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA29_402 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA29_403 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA29_404 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA29_405 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA29_406 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA29_407 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 86:
                                    {
                                    int LA29_408 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_409 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_410 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_411 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_412 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_413 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_414 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case HEXNUMBER:
                            {
                            switch ( input.LA(3) ) {
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_415 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_416 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_417 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_418 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_419 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_420 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case STRING:
                            {
                            switch ( input.LA(3) ) {
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_421 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_422 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_423 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_424 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_425 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_426 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case NUMBER:
                            {
                            switch ( input.LA(3) ) {
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_427 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_428 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_429 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_430 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_431 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_432 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 86:
                                    {
                                    int LA29_433 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_434 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_435 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_436 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_437 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_438 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_439 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case DECIMAL:
                            {
                            switch ( input.LA(3) ) {
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
                                case 52:
                                case 66:
                                    {
                                    int LA29_440 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case NEGINTEGER:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA29_441 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA29_442 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA29_443 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA29_444 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA29_445 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 51:
                        case 52:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA29_446 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA29_447 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA29_448 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA29_449 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA29_450 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA29_451 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA29_452 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA29_453 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    }
                    break;
                case WORD:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA29_5 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA29_6 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA29_7 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
                case 51:
                case 52:
                    {
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA29_454 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA29_455 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA29_456 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA29_457 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA29_458 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA29_459 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA29_460 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA29_461 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            int LA29_342 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA29_343 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA29_344 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA29_345 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA29_346 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA29_347 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt29=1;
                            }
                            }
                            break;
                        case 51:
                        case 52:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA29_746 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA29_747 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA29_748 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA29_749 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA29_750 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA29_751 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA29_752 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA29_753 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt29=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA29_27 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt29=1;
                    }
                    }
                    break;
            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:69: expression
                    {
                    dbg.location(108,69);
                    pushFollow(FOLLOW_expression_in_aexpression814);
                    expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(108,82);
            if ( backtracking==0 ) {
              value =a.getText();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, aexpression_StartIndex); }
        }
        dbg.location(109, 1);

        }
        finally {
            dbg.exitRule("aexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end aexpression


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(111, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            dbg.location(111,33);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt30=4;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30);

            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt30=1;
                }
                break;
            case HEXNUMBER:
                {
                alt30=2;
                }
                break;
            case STRING:
                {
                alt30=3;
                }
                break;
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt30=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("111:34: ( NUMBER | HEXNUMBER | STRING | variable )", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:35: NUMBER
                    {
                    dbg.location(111,35);
                    match(input,NUMBER,FOLLOW_NUMBER_in_value835); if (failed) return value;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:42: HEXNUMBER
                    {
                    dbg.location(111,42);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value837); if (failed) return value;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:52: STRING
                    {
                    dbg.location(111,52);
                    match(input,STRING,FOLLOW_STRING_in_value839); if (failed) return value;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:59: variable
                    {
                    dbg.location(111,59);
                    pushFollow(FOLLOW_variable_in_value841);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}

            dbg.location(111,69);
            if ( backtracking==0 ) {
              value =a.getText();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, value_StartIndex); }
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule("value");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end value


    // $ANTLR start pexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("pexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(115, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:116:1: ( LPAREN e= expression RPAREN )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:116:3: LPAREN e= expression RPAREN
            {
            dbg.location(116,3);
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression858); if (failed) return value;
            dbg.location(116,11);
            pushFollow(FOLLOW_expression_in_pexpression862);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(116,23);
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression864); if (failed) return value;
            dbg.location(116,30);
            if ( backtracking==0 ) {
              value =pc.pexpression(e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, pexpression_StartIndex); }
        }
        dbg.location(117, 1);

        }
        finally {
            dbg.exitRule("pexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:119:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("andexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(119, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:120:1: (a= ( '&&' | 'and' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:120:3: a= ( '&&' | 'and' )
            {
            dbg.location(120,4);
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression881);    throw mse;
            }

            dbg.location(120,18);
            if ( backtracking==0 ) {
              value =pc.andexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, andexpression_StartIndex); }
        }
        dbg.location(121, 1);

        }
        finally {
            dbg.exitRule("andexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:123:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try { dbg.enterRule("orexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(123, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:124:1: (o= ( '||' | 'or' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:124:3: o= ( '||' | 'or' )
            {
            dbg.location(124,4);
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression902);    throw mse;
            }

            dbg.location(124,17);
            if ( backtracking==0 ) {
              value =pc.orexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, orexpression_StartIndex); }
        }
        dbg.location(125, 1);

        }
        finally {
            dbg.exitRule("orexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:127:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try { dbg.enterRule("xorexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(127, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:128:1: (x= ( '^^' | 'xor' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:128:3: x= ( '^^' | 'xor' )
            {
            dbg.location(128,4);
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression923);    throw mse;
            }

            dbg.location(128,18);
            if ( backtracking==0 ) {
              value =pc.xorexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, xorexpression_StartIndex); }
        }
        dbg.location(129, 1);

        }
        finally {
            dbg.exitRule("xorexpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:131:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
    public final String relationalExpression() throws RecognitionException {
        String value = null;
        int relationalExpression_StartIndex = input.index();
        Token h=null;
        Token s=null;
        Token n=null;
        Token d=null;
        Token w=null;
        Token op=null;
        String f = null;

        variable_return v = null;


        try { dbg.enterRule("relationalExpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(131, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:132:3: ( (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            dbg.location(133,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
            int alt31=7;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31);

            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==LPAREN) ) {
                    alt31=1;
                }
                else if ( (synpred73()) ) {
                    alt31=5;
                }
                else if ( (true) ) {
                    alt31=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("133:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt31=2;
                }
                break;
            case STRING:
                {
                alt31=3;
                }
                break;
            case NUMBER:
                {
                alt31=4;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt31=5;
                }
                break;
            case DECIMAL:
                {
                alt31=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("133:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:4: f= function
                    {
                    dbg.location(133,5);
                    pushFollow(FOLLOW_function_in_relationalExpression949);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(133,14);
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:35: h= HEXNUMBER
                    {
                    dbg.location(133,36);
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression954); if (failed) return value;
                    dbg.location(133,46);
                    if ( backtracking==0 ) {
                      value = h.getText();
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:66: s= STRING
                    {
                    dbg.location(133,67);
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression959); if (failed) return value;
                    dbg.location(133,74);
                    if ( backtracking==0 ) {
                      value = s.getText();
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:94: n= NUMBER
                    {
                    dbg.location(133,95);
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression964); if (failed) return value;
                    dbg.location(133,102);
                    if ( backtracking==0 ) {
                      value = n.getText();
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:122: v= variable
                    {
                    dbg.location(133,123);
                    pushFollow(FOLLOW_variable_in_relationalExpression969);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(133,132);
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:153: d= DECIMAL
                    {
                    dbg.location(133,154);
                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression974); if (failed) return value;
                    dbg.location(133,162);
                    if ( backtracking==0 ) {
                      value = d.getText();
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:182: w= WORD
                    {
                    dbg.location(133,183);
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression979); if (failed) return value;
                    dbg.location(133,188);
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(133,209);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:209: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==52) ) {
                    switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA33_48 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt33=1;
                        }


                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA33_49 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt33=1;
                        }


                        }
                        break;
                    case STRING:
                        {
                        int LA33_50 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt33=1;
                        }


                        }
                        break;
                    case NUMBER:
                        {
                        int LA33_51 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt33=1;
                        }


                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA33_52 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt33=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA33_0>=EQUALS && LA33_0<=LTE)||LA33_0==66) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:211: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    dbg.location(133,213);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression987);    throw mse;
            	    }

            	    dbg.location(133,265);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt32=6;
            	    try { dbg.enterSubRule(32);
            	    try { dbg.enterDecision(32);

            	    switch ( input.LA(1) ) {
            	    case WORD:
            	        {
            	        int LA32_1 = input.LA(2);

            	        if ( (LA32_1==LPAREN) ) {
            	            alt32=1;
            	        }
            	        else if ( (synpred87()) ) {
            	            alt32=5;
            	        }
            	        else if ( (true) ) {
            	            alt32=6;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 32, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case HEXNUMBER:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case STRING:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    case NUMBER:
            	        {
            	        alt32=4;
            	        }
            	        break;
            	    case OIVAR:
            	    case GLOBALVAR:
            	        {
            	        alt32=5;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 32, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(32);}

            	    switch (alt32) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:266: function
            	            {
            	            dbg.location(133,266);
            	            pushFollow(FOLLOW_function_in_relationalExpression1008);
            	            function();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:275: HEXNUMBER
            	            {
            	            dbg.location(133,275);
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1010); if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:285: STRING
            	            {
            	            dbg.location(133,285);
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression1012); if (failed) return value;

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:292: NUMBER
            	            {
            	            dbg.location(133,292);
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1014); if (failed) return value;

            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:299: variable
            	            {
            	            dbg.location(133,299);
            	            pushFollow(FOLLOW_variable_in_relationalExpression1016);
            	            variable();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:308: WORD
            	            {
            	            dbg.location(133,308);
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression1018); if (failed) return value;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(32);}


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}

            dbg.location(133,316);
            if ( backtracking==0 ) {
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, relationalExpression_StartIndex); }
        }
        dbg.location(134, 3);

        }
        finally {
            dbg.exitRule("relationalExpression");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:1: repeatstatement returns [String value] : 'repeat' e= expression (s= statement ) ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("repeatstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(136, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:137:1: ( 'repeat' e= expression (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:137:3: 'repeat' e= expression (s= statement )
            {
            dbg.location(137,3);
            match(input,67,FOLLOW_67_in_repeatstatement1039); if (failed) return value;
            dbg.location(137,13);
            pushFollow(FOLLOW_expression_in_repeatstatement1043);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(137,25);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:137:25: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:137:26: s= statement
            {
            dbg.location(137,27);
            pushFollow(FOLLOW_statement_in_repeatstatement1048);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(137,39);
            if ( backtracking==0 ) {
              value =pc.repeatstatement(e.value,s.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, repeatstatement_StartIndex); }
        }
        dbg.location(138, 1);

        }
        finally {
            dbg.exitRule("repeatstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try { dbg.enterRule("breakstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(140, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:141:1: ( 'break' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:141:3: 'break'
            {
            dbg.location(141,3);
            match(input,68,FOLLOW_68_in_breakstatement1064); if (failed) return value;
            dbg.location(141,12);
            if ( backtracking==0 ) {
              System.out.println("break;");
            }
            dbg.location(141,44);
            if ( backtracking==0 ) {
              value =pc.breakstatement();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, breakstatement_StartIndex); }
        }
        dbg.location(142, 1);

        }
        finally {
            dbg.exitRule("breakstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:143:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try { dbg.enterRule("continuestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(143, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:144:1: ( 'continue' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:144:3: 'continue'
            {
            dbg.location(144,3);
            match(input,69,FOLLOW_69_in_continuestatement1081); if (failed) return value;
            dbg.location(144,14);
            if ( backtracking==0 ) {
              System.out.println("continue;");
            }
            dbg.location(144,49);
            if ( backtracking==0 ) {
              value =pc.continuestatement();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, continuestatement_StartIndex); }
        }
        dbg.location(145, 1);

        }
        finally {
            dbg.exitRule("continuestatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:147:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        statement_return s = null;

        expression_return e = null;


        try { dbg.enterRule("dostatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(147, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:148:1: ( 'do' s= statement 'until' e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:148:3: 'do' s= statement 'until' e= expression
            {
            dbg.location(148,3);
            match(input,70,FOLLOW_70_in_dostatement1098); if (failed) return value;
            dbg.location(148,9);
            pushFollow(FOLLOW_statement_in_dostatement1102);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(148,20);
            match(input,71,FOLLOW_71_in_dostatement1104); if (failed) return value;
            dbg.location(148,29);
            pushFollow(FOLLOW_expression_in_dostatement1108);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(148,41);
            if ( backtracking==0 ) {
              value =pc.dostatement(s.value,e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, dostatement_StartIndex); }
        }
        dbg.location(149, 1);

        }
        finally {
            dbg.exitRule("dostatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:151:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("whilestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(151, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:152:1: ( 'while' e= expression (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:152:3: 'while' e= expression (s= statement )
            {
            dbg.location(152,3);
            match(input,72,FOLLOW_72_in_whilestatement1123); if (failed) return value;
            dbg.location(152,12);
            pushFollow(FOLLOW_expression_in_whilestatement1127);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(152,24);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:152:24: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:152:25: s= statement
            {
            dbg.location(152,26);
            pushFollow(FOLLOW_statement_in_whilestatement1132);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(152,38);
            if ( backtracking==0 ) {
              value =pc.whilestatement(e.value,s.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, whilestatement_StartIndex); }
        }
        dbg.location(153, 1);

        }
        finally {
            dbg.exitRule("whilestatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        statement_return s1 = null;

        expression_return e = null;

        statement_return s2 = null;

        statement_return s = null;


        try { dbg.enterRule("forstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(155, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:156:1: ( 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:156:3: 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement
            {
            dbg.location(156,3);
            match(input,73,FOLLOW_73_in_forstatement1148); if (failed) return value;
            dbg.location(156,9);
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1150); if (failed) return value;
            dbg.location(156,15);
            pushFollow(FOLLOW_statement_in_forstatement1154);
            s1=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(156,27);
            pushFollow(FOLLOW_expression_in_forstatement1158);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(156,39);
            match(input,36,FOLLOW_36_in_forstatement1160); if (failed) return value;
            dbg.location(156,45);
            pushFollow(FOLLOW_statement_in_forstatement1164);
            s2=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(156,56);
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1166); if (failed) return value;
            dbg.location(156,61);
            pushFollow(FOLLOW_statement_in_forstatement1170);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(156,72);
            if ( backtracking==0 ) {
              value =pc.forstatement(s1.value,e.value,s2.value,s.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, forstatement_StartIndex); }
        }
        dbg.location(157, 1);

        }
        finally {
            dbg.exitRule("forstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try { dbg.enterRule("switchstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(159, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            dbg.location(160,3);
            match(input,74,FOLLOW_74_in_switchstatement1185); if (failed) return value;
            dbg.location(160,12);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:12: ( expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:13: expression
            {
            dbg.location(160,13);
            pushFollow(FOLLOW_expression_in_switchstatement1188);
            expression();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(160,25);
            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1191); if (failed) return value;
            dbg.location(160,29);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35);

                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=75 && LA35_0<=76)) ) {
                    alt35=1;
                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    dbg.location(160,30);
            	    if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1194);    throw mse;
            	    }

            	    dbg.location(160,49);
            	    pushFollow(FOLLOW_expression_in_switchstatement1200);
            	    expression();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(160,60);
            	    match(input,77,FOLLOW_77_in_switchstatement1202); if (failed) return value;
            	    dbg.location(160,64);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:64: ( statement )*
            	    try { dbg.enterSubRule(34);

            	    loop34:
            	    do {
            	        int alt34=2;
            	        try { dbg.enterDecision(34);

            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==LBRAC||LA34_0==WORD||(LA34_0>=OIVAR && LA34_0<=GLOBALVAR)||LA34_0==39||LA34_0==43||(LA34_0>=45 && LA34_0<=47)||(LA34_0>=67 && LA34_0<=70)||(LA34_0>=72 && LA34_0<=74)||LA34_0==78) ) {
            	            alt34=1;
            	        }


            	        } finally {dbg.exitDecision(34);}

            	        switch (alt34) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:65: statement
            	    	    {
            	    	    dbg.location(160,65);
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1205);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(34);}


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}

            dbg.location(160,79);
            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1211); if (failed) return value;
            dbg.location(160,83);
            if ( backtracking==0 ) {
              value ="";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, switchstatement_StartIndex); }
        }
        dbg.location(161, 1);

        }
        finally {
            dbg.exitRule("switchstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("withstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(163, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:164:1: ( 'with' e= expression s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:164:3: 'with' e= expression s= statement
            {
            dbg.location(164,3);
            match(input,78,FOLLOW_78_in_withstatement1227); if (failed) return value;
            dbg.location(164,12);
            pushFollow(FOLLOW_expression_in_withstatement1232);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(164,26);
            pushFollow(FOLLOW_statement_in_withstatement1237);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(164,37);
            if ( backtracking==0 ) {
              value =pc.withstatement(e.value,s.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, withstatement_StartIndex); }
        }
        dbg.location(165, 1);

        }
        finally {
            dbg.exitRule("withstatement");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:167:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try { dbg.enterRule("assignment");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(167, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:168:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:168:3: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression
            {
            dbg.location(168,3);
            if ( backtracking==0 ) {
              System.out.println("assignment ");
            }
            dbg.location(168,46);
            pushFollow(FOLLOW_variable_in_assignment1256);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            dbg.location(168,58);
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==66||(input.LA(1)>=79 && input.LA(1)<=85) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1260);    throw mse;
            }

            dbg.location(168,108);
            pushFollow(FOLLOW_expression_in_assignment1283);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(168,120);
            if ( backtracking==0 ) {
              value = pc.assignmentstatement(input.toString(valuee.start,valuee.stop),op.getText(),input.toString(e.start,e.stop));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, assignment_StartIndex); }
        }
        dbg.location(169, 1);

        }
        finally {
            dbg.exitRule("assignment");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:171:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try { dbg.enterRule("variable");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(171, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:3: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            {
            dbg.location(172,3);
            if ( backtracking==0 ) {
              System.out.println("variable ");
            }
            dbg.location(172,38);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==WORD||(LA36_0>=OIVAR && LA36_0<=GLOBALVAR)) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==86) ) {
                    alt36=1;
                }
                else if ( (LA36_1==EOF||(LA36_1>=PLUS && LA36_1<=LTE)||(LA36_1>=WORD && LA36_1<=GLOBALVAR)||(LA36_1>=36 && LA36_1<=85)||LA36_1==87) ) {
                    alt36=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("172:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 36, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("172:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:39: a= array
                    {
                    dbg.location(172,40);
                    pushFollow(FOLLOW_array_in_variable1303);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(172,46);
                    if ( backtracking==0 ) {
                      retval.value = a;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:67: valuee= ( WORD | OIVAR | GLOBALVAR )
                    {
                    dbg.location(172,73);
                    valuee=(Token)input.LT(1);
                    if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1308);    throw mse;
                    }

                    dbg.location(172,96);
                    if ( backtracking==0 ) {
                      retval.value = valuee.getText();
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, variable_StartIndex); }
        }
        dbg.location(173, 1);

        }
        finally {
            dbg.exitRule("variable");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try { dbg.enterRule("function");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(175, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            dbg.location(176,4);
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1332); if (failed) return value;
            dbg.location(176,10);
            match(input,LPAREN,FOLLOW_LPAREN_in_function1334); if (failed) return value;
            dbg.location(176,14);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt39=2;
            try { dbg.enterSubRule(39);
            try { dbg.enterDecision(39);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==LPAREN||LA39_0==WORD||(LA39_0>=NUMBER && LA39_0<=GLOBALVAR)||(LA39_0>=51 && LA39_0<=52)) ) {
                alt39=1;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    dbg.location(176,16);
                    pushFollow(FOLLOW_expression_in_function1339);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(176,28);
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    dbg.location(176,48);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:48: ( ( ',' ) (e= expression )? )*
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==42) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:49: ( ',' ) (e= expression )?
                    	    {
                    	    dbg.location(176,49);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:49: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:50: ','
                    	    {
                    	    dbg.location(176,50);
                    	    match(input,42,FOLLOW_42_in_function1345); if (failed) return value;

                    	    }

                    	    dbg.location(176,55);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:55: (e= expression )?
                    	    int alt37=2;
                    	    try { dbg.enterSubRule(37);
                    	    try { dbg.enterDecision(37);

                    	    int LA37_0 = input.LA(1);

                    	    if ( (LA37_0==LPAREN||LA37_0==WORD||(LA37_0>=NUMBER && LA37_0<=GLOBALVAR)||(LA37_0>=51 && LA37_0<=52)) ) {
                    	        alt37=1;
                    	    }
                    	    } finally {dbg.exitDecision(37);}

                    	    switch (alt37) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:56: e= expression
                    	            {
                    	            dbg.location(176,57);
                    	            pushFollow(FOLLOW_expression_in_function1351);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            dbg.location(176,68);
                    	            if ( backtracking==0 ) {
                    	              value += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(37);}


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(38);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(39);}

            dbg.location(176,100);
            match(input,RPAREN,FOLLOW_RPAREN_in_function1360); if (failed) return value;
            dbg.location(176,104);
            if ( backtracking==0 ) {
              value =pc.functionstatement(n.getText(), value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, function_StartIndex); }
        }
        dbg.location(177, 1);

        }
        finally {
            dbg.exitRule("function");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try { dbg.enterRule("function2");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(179, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            dbg.location(180,5);
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21378); if (failed) return value;
            dbg.location(180,12);
            match(input,LPAREN,FOLLOW_LPAREN_in_function21380); if (failed) return value;
            dbg.location(180,16);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==LPAREN||LA42_0==WORD||(LA42_0>=NUMBER && LA42_0<=GLOBALVAR)||(LA42_0>=51 && LA42_0<=52)) ) {
                alt42=1;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    dbg.location(180,18);
                    pushFollow(FOLLOW_expression_in_function21385);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(180,30);
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    dbg.location(180,49);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:49: ( ( ',' ) (e= expression )? )*
                    try { dbg.enterSubRule(41);

                    loop41:
                    do {
                        int alt41=2;
                        try { dbg.enterDecision(41);

                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==42) ) {
                            alt41=1;
                        }


                        } finally {dbg.exitDecision(41);}

                        switch (alt41) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:50: ( ',' ) (e= expression )?
                    	    {
                    	    dbg.location(180,50);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:50: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:51: ','
                    	    {
                    	    dbg.location(180,51);
                    	    match(input,42,FOLLOW_42_in_function21390); if (failed) return value;

                    	    }

                    	    dbg.location(180,56);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:56: (e= expression )?
                    	    int alt40=2;
                    	    try { dbg.enterSubRule(40);
                    	    try { dbg.enterDecision(40);

                    	    int LA40_0 = input.LA(1);

                    	    if ( (LA40_0==LPAREN||LA40_0==WORD||(LA40_0>=NUMBER && LA40_0<=GLOBALVAR)||(LA40_0>=51 && LA40_0<=52)) ) {
                    	        alt40=1;
                    	    }
                    	    } finally {dbg.exitDecision(40);}

                    	    switch (alt40) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:57: e= expression
                    	            {
                    	            dbg.location(180,58);
                    	            pushFollow(FOLLOW_expression_in_function21396);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            dbg.location(180,69);
                    	            if ( backtracking==0 ) {
                    	              value += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(40);}


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(41);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(42);}

            dbg.location(180,101);
            match(input,RPAREN,FOLLOW_RPAREN_in_function21405); if (failed) return value;
            dbg.location(180,105);
            if ( backtracking==0 ) {
              value =pc.otherclassfunctionstatement(n.getText(), value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, function2_StartIndex); }
        }
        dbg.location(181, 2);

        }
        finally {
            dbg.exitRule("function2");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;


        try { dbg.enterRule("array");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(183, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:184:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:184:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']'
            {
            dbg.location(184,5);
            if ( backtracking==0 ) {
              System.out.println("array");
            }
            dbg.location(184,42);
            valuee=(Token)input.LT(1);
            if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1427);    throw mse;
            }

            dbg.location(184,66);
            match(input,86,FOLLOW_86_in_array1435); if (failed) return value;
            dbg.location(184,71);
            pushFollow(FOLLOW_expression_in_array1439);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(184,83);
            match(input,87,FOLLOW_87_in_array1441); if (failed) return value;
            dbg.location(184,87);
            if ( backtracking==0 ) {
              value = pc.array(valuee.getText(),input.toString(e.start,e.stop));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, array_StartIndex); }
        }
        dbg.location(185, 1);

        }
        finally {
            dbg.exitRule("array");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: ( method )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: method
        {
        dbg.location(53,28);
        pushFollow(FOLLOW_method_in_synpred1199);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:682: ( ';' )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:682: ';'
        {
        dbg.location(61,682);
        match(input,36,FOLLOW_36_in_synpred20333); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:77: ( 'final' )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:77: 'final'
        {
        dbg.location(66,77);
        match(input,40,FOLLOW_40_in_synpred24368); if (failed) return ;

        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:67: ( 'final' )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:67: 'final'
        {
        dbg.location(70,67);
        match(input,40,FOLLOW_40_in_synpred29419); if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:10: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:10: variable
        {
        dbg.location(79,15);
        pushFollow(FOLLOW_variable_in_synpred38531);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:89: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:89: variable
        {
        dbg.location(79,95);
        pushFollow(FOLLOW_variable_in_synpred39548);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:47: ( elsestatement )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:47: elsestatement
        {
        dbg.location(91,50);
        pushFollow(FOLLOW_elsestatement_in_synpred42635);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:117: ( aexpression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:117: aexpression
        {
        dbg.location(100,120);
        pushFollow(FOLLOW_aexpression_in_synpred46716);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:162: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:162: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        dbg.location(100,162);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:162: ( andexpression | orexpression | xorexpression )
        int alt49=3;
        try { dbg.enterSubRule(49);
        try { dbg.enterDecision(49);

        switch ( input.LA(1) ) {
        case 60:
        case 61:
            {
            alt49=1;
            }
            break;
        case 62:
        case 63:
            {
            alt49=2;
            }
            break;
        case 64:
        case 65:
            {
            alt49=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("100:162: ( andexpression | orexpression | xorexpression )", 49, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;
        }

        } finally {dbg.exitDecision(49);}

        switch (alt49) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:163: andexpression
                {
                dbg.location(100,166);
                pushFollow(FOLLOW_andexpression_in_synpred49726);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:205: orexpression
                {
                dbg.location(100,209);
                pushFollow(FOLLOW_orexpression_in_synpred49731);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:248: xorexpression
                {
                dbg.location(100,250);
                pushFollow(FOLLOW_xorexpression_in_synpred49736);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(49);}

        dbg.location(100,289);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:289: ( expression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:100:290: expression
        {
        dbg.location(100,292);
        pushFollow(FOLLOW_expression_in_synpred49743);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:69: ( expression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:69: expression
        {
        dbg.location(108,69);
        pushFollow(FOLLOW_expression_in_synpred62814);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:122: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:122: variable
        {
        dbg.location(133,124);
        pushFollow(FOLLOW_variable_in_synpred73969);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:299: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:299: variable
        {
        dbg.location(133,299);
        pushFollow(FOLLOW_variable_in_synpred871016);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:211: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:211: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        dbg.location(133,214);
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred88987);    throw mse;
        }

        dbg.location(133,265);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt50=6;
        try { dbg.enterSubRule(50);
        try { dbg.enterDecision(50);

        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA50_1 = input.LA(2);

            if ( (LA50_1==LPAREN) ) {
                alt50=1;
            }
            else if ( (synpred87()) ) {
                alt50=5;
            }
            else if ( (true) ) {
                alt50=6;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 50, 1, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt50=2;
            }
            break;
        case STRING:
            {
            alt50=3;
            }
            break;
        case NUMBER:
            {
            alt50=4;
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            alt50=5;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("133:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 50, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;
        }

        } finally {dbg.exitDecision(50);}

        switch (alt50) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:266: function
                {
                dbg.location(133,266);
                pushFollow(FOLLOW_function_in_synpred881008);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:275: HEXNUMBER
                {
                dbg.location(133,275);
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred881010); if (failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:285: STRING
                {
                dbg.location(133,285);
                match(input,STRING,FOLLOW_STRING_in_synpred881012); if (failed) return ;

                }
                break;
            case 4 :
                dbg.enterAlt(4);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:292: NUMBER
                {
                dbg.location(133,292);
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred881014); if (failed) return ;

                }
                break;
            case 5 :
                dbg.enterAlt(5);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:299: variable
                {
                dbg.location(133,299);
                pushFollow(FOLLOW_variable_in_synpred881016);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                dbg.enterAlt(6);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:308: WORD
                {
                dbg.location(133,308);
                match(input,WORD,FOLLOW_WORD_in_synpred881018); if (failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(50);}


        }
    }
    // $ANTLR end synpred88

    public final boolean synpred46() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred73() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred73_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred88() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred88_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred20() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        dbg.endBacktrack(backtracking, success);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_method_in_classes199 = new BitSet(new long[]{0x000003F000200002L});
    public static final BitSet FOLLOW_field_in_classes204 = new BitSet(new long[]{0x000003F000200002L});
    public static final BitSet FOLLOW_36_in_classes209 = new BitSet(new long[]{0x000003F000200002L});
    public static final BitSet FOLLOW_statement_in_code230 = new BitSet(new long[]{0x0000E88018200402L,0x0000000000004778L});
    public static final BitSet FOLLOW_bstatement_in_statement253 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement258 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement263 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement268 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement273 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement278 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement283 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement288 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement293 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement298 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement303 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement308 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement313 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement318 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement323 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement328 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement333 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_field353 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_set_in_field357 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_40_in_field368 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_41_in_field374 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_40_in_field380 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_varstatement_in_field388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_method410 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_38_in_method413 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_40_in_method419 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_41_in_method425 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_40_in_method431 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method440 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_WORD_in_method445 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_method451 = new BitSet(new long[]{0x0000040000200200L});
    public static final BitSet FOLLOW_WORD_in_method457 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method466 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_bstatement_in_method470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement488 = new BitSet(new long[]{0x0000F88018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_bstatement497 = new BitSet(new long[]{0x0000F88018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_set_in_bstatement502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_varstatement526 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement531 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement537 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_varstatement543 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement548 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement554 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement577 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_returnstatement582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement615 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_ifstatement619 = new BitSet(new long[]{0x0001E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_48_in_ifstatement622 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_ifstatement629 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement635 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement655 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_50_in_elsestatement658 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_elsestatement662 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_elsestatement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression699 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_relationalExpression_in_expression704 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_notexpression_in_expression709 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_aexpression_in_expression716 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_andexpression_in_expression726 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_expression731 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_expression736 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_expression743 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_notexpression762 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_notexpression770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression787 = new BitSet(new long[]{0x001800001FA00102L});
    public static final BitSet FOLLOW_expression_in_aexpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression858 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_pexpression862 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression949 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression954 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression959 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression964 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression969 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression974 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression979 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_relationalExpression987 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_relationalExpression1008 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1010 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1012 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1014 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1016 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1018 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_repeatstatement1039 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1043 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_breakstatement1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_continuestatement1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_dostatement1098 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_dostatement1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_dostatement1104 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_dostatement1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_whilestatement1123 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_whilestatement1127 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_whilestatement1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_forstatement1148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1150 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1154 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_forstatement1158 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement1160 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1164 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1166 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_switchstatement1185 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1188 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1191 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_switchstatement1194 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_switchstatement1202 = new BitSet(new long[]{0x0000E88018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_statement_in_switchstatement1205 = new BitSet(new long[]{0x0000E88018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_withstatement1227 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_withstatement1232 = new BitSet(new long[]{0x0000E88018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_withstatement1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1256 = new BitSet(new long[]{0x0000000000001000L,0x00000000003F8004L});
    public static final BitSet FOLLOW_set_in_assignment1260 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_assignment1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1332 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1334 = new BitSet(new long[]{0x001800001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1339 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function1345 = new BitSet(new long[]{0x001804001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1351 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21380 = new BitSet(new long[]{0x001800001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21385 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function21390 = new BitSet(new long[]{0x001804001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21396 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array1435 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_array1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_array1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred20333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred24368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred29419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred38531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred39548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred42635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred46716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred49726 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_synpred49731 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred49736 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_synpred49743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred62814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred73969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred871016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred88987 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_synpred881008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred881010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred881012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred881014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred881016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred881018 = new BitSet(new long[]{0x0000000000000002L});

}