// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g 2008-01-07 00:10:07

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
public class gclParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "WORD", "NEGINTEGER", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'static'", "','", "'class'", "'begin'", "'end'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&\\\\'", "'^='", "'['", "']'"
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
        "innerclass", "bstatement", "varstatement", "returnstatement", "exitstatement", 
        "ifstatement", "elsestatement", "expression", "notexpression", "aexpression", 
        "value", "pexpression", "andexpression", "orexpression", "xorexpression", 
        "relationalExpression", "repeatstatement", "breakstatement", "continuestatement", 
        "dostatement", "whilestatement", "forstatement", "switchstatement", 
        "withstatement", "assignment", "variable", "function", "function2", 
        "array", "synpred1", "synpred2", "synpred21", "synpred32", "synpred33", 
        "synpred38", "synpred39", "synpred42", "synpred46", "synpred49", 
        "synpred62", "synpred73", "synpred87", "synpred88"
    };

    public int ruleLevel = 0;
    public gclParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }

            ruleMemo = new Map[144+1];
    }
    public gclParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT);
    }
    public gclParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g"; }

    
    public PlatformCore pc;
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    



    // $ANTLR start classes
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:52:1: classes : ( (f= method | m= field | i= innerclass ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;

        String i = null;


        try { dbg.enterRule("classes");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(52, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:1: ( ( (f= method | m= field | i= innerclass ) ( ';' )* )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:3: ( (f= method | m= field | i= innerclass ) ( ';' )* )*
            {
            dbg.location(53,3);
            if ( backtracking==0 ) {
              System.out.println("start parsing class "); pc.returncode ="";
            }
            dbg.location(53,68);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:68: ( (f= method | m= field | i= innerclass ) ( ';' )* )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=39)||LA3_0==41) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:69: (f= method | m= field | i= innerclass ) ( ';' )*
            	    {
            	    dbg.location(53,69);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:69: (f= method | m= field | i= innerclass )
            	    int alt1=3;
            	    try { dbg.enterSubRule(1);
            	    try { dbg.enterDecision(1);

            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==39) ) {
            	            int LA1_6 = input.LA(3);

            	            if ( (LA1_6==WORD) ) {
            	                int LA1_13 = input.LA(4);

            	                if ( (LA1_13==WORD) ) {
            	                    int LA1_32 = input.LA(5);

            	                    if ( (synpred1()) ) {
            	                        alt1=1;
            	                    }
            	                    else if ( (synpred2()) ) {
            	                        alt1=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return ;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 32, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                }
            	                else if ( ((LA1_13>=OIVAR && LA1_13<=GLOBALVAR)) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 13, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 6, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else if ( (LA1_1==WORD) ) {
            	            int LA1_7 = input.LA(3);

            	            if ( (LA1_7==WORD) ) {
            	                int LA1_14 = input.LA(4);

            	                if ( (LA1_14==EOF||LA1_14==EQUALS||LA1_14==WORD||(LA1_14>=36 && LA1_14<=41)||LA1_14==65||(LA1_14>=78 && LA1_14<=85)) ) {
            	                    alt1=2;
            	                }
            	                else if ( (LA1_14==LPAREN) ) {
            	                    alt1=1;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 14, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_7>=OIVAR && LA1_7<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 7, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 38:
            	        {
            	        int LA1_2 = input.LA(2);

            	        if ( (LA1_2==39) ) {
            	            int LA1_8 = input.LA(3);

            	            if ( (LA1_8==WORD) ) {
            	                int LA1_16 = input.LA(4);

            	                if ( (LA1_16==WORD) ) {
            	                    int LA1_45 = input.LA(5);

            	                    if ( (synpred1()) ) {
            	                        alt1=1;
            	                    }
            	                    else if ( (synpred2()) ) {
            	                        alt1=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return ;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 45, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                }
            	                else if ( ((LA1_16>=OIVAR && LA1_16<=GLOBALVAR)) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 16, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 8, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else if ( (LA1_2==WORD) ) {
            	            int LA1_9 = input.LA(3);

            	            if ( (LA1_9==WORD) ) {
            	                int LA1_17 = input.LA(4);

            	                if ( (LA1_17==EOF||LA1_17==EQUALS||LA1_17==WORD||(LA1_17>=36 && LA1_17<=41)||LA1_17==65||(LA1_17>=78 && LA1_17<=85)) ) {
            	                    alt1=2;
            	                }
            	                else if ( (LA1_17==LPAREN) ) {
            	                    alt1=1;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 17, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_9>=OIVAR && LA1_9<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 9, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 2, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 39:
            	        {
            	        int LA1_3 = input.LA(2);

            	        if ( (LA1_3==WORD) ) {
            	            int LA1_10 = input.LA(3);

            	            if ( (LA1_10==WORD) ) {
            	                int LA1_19 = input.LA(4);

            	                if ( (LA1_19==EOF||LA1_19==EQUALS||LA1_19==WORD||(LA1_19>=36 && LA1_19<=41)||LA1_19==65||(LA1_19>=78 && LA1_19<=85)) ) {
            	                    alt1=2;
            	                }
            	                else if ( (LA1_19==LPAREN) ) {
            	                    alt1=1;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 19, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_10>=OIVAR && LA1_10<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 10, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 3, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_4 = input.LA(2);

            	        if ( (LA1_4==WORD) ) {
            	            int LA1_11 = input.LA(3);

            	            if ( (LA1_11==EOF||LA1_11==EQUALS||LA1_11==WORD||(LA1_11>=36 && LA1_11<=41)||LA1_11==65||(LA1_11>=78 && LA1_11<=85)) ) {
            	                alt1=2;
            	            }
            	            else if ( (LA1_11==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 11, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA1_4>=OIVAR && LA1_4<=GLOBALVAR)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 4, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("53:69: (f= method | m= field | i= innerclass )", 1, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(1);}

            	    switch (alt1) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:70: f= method
            	            {
            	            dbg.location(53,71);
            	            pushFollow(FOLLOW_method_in_classes199);
            	            f=method();
            	            _fsp--;
            	            if (failed) return ;
            	            dbg.location(53,78);
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:115: m= field
            	            {
            	            dbg.location(53,116);
            	            pushFollow(FOLLOW_field_in_classes204);
            	            m=field();
            	            _fsp--;
            	            if (failed) return ;
            	            dbg.location(53,122);
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:159: i= innerclass
            	            {
            	            dbg.location(53,160);
            	            pushFollow(FOLLOW_innerclass_in_classes209);
            	            i=innerclass();
            	            _fsp--;
            	            if (failed) return ;
            	            dbg.location(53,171);
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + i;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(53,209);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:209: ( ';' )*
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

            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:210: ';'
            	    	    {
            	    	    dbg.location(53,210);
            	    	    match(input,36,FOLLOW_36_in_classes214); if (failed) return ;
            	    	    dbg.location(53,213);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:56:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        statement_return s = null;


        try { dbg.enterRule("code");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(56, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:1: ( ( (s= statement )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:3: ( (s= statement )* )
            {
            dbg.location(57,3);
            if ( backtracking==0 ) {
              System.out.println("Start parsing code "); pc.returncode ="";
            }
            dbg.location(57,67);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:67: ( (s= statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:68: (s= statement )*
            {
            dbg.location(57,68);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:68: (s= statement )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==42||(LA4_0>=44 && LA4_0<=46)||(LA4_0>=66 && LA4_0<=69)||(LA4_0>=71 && LA4_0<=73)||LA4_0==77) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:57:69: s= statement
            	    {
            	    dbg.location(57,70);
            	    pushFollow(FOLLOW_statement_in_code235);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return ;
            	    dbg.location(57,80);
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

            dbg.location(57,120);
            if ( backtracking==0 ) {
              System.out.println("Parsed code in antlr!");
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
        dbg.location(58, 2);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:60:1: statement returns [String value] : (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* ;
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
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:1: ( (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:3: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )*
            {
            dbg.location(61,3);
            if ( backtracking==0 ) {
              System.out.print("statement: "); retval.value = "";
            }
            dbg.location(61,51);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )
            int alt5=16;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case LBRAC:
            case 42:
                {
                alt5=1;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case EQUALS:
                case 65:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                    {
                    alt5=15;
                    }
                    break;
                case LPAREN:
                    {
                    alt5=16;
                    }
                    break;
                case WORD:
                case OIVAR:
                case GLOBALVAR:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            case 45:
                {
                alt5=4;
                }
                break;
            case 46:
                {
                alt5=5;
                }
                break;
            case 66:
                {
                alt5=6;
                }
                break;
            case 69:
                {
                alt5=7;
                }
                break;
            case 71:
                {
                alt5=8;
                }
                break;
            case 68:
                {
                alt5=9;
                }
                break;
            case 67:
                {
                alt5=10;
                }
                break;
            case 72:
                {
                alt5=11;
                }
                break;
            case 73:
                {
                alt5=12;
                }
                break;
            case 77:
                {
                alt5=13;
                }
                break;
            case OIVAR:
                {
                int LA5_14 = input.LA(2);

                if ( (LA5_14==LPAREN) ) {
                    alt5=14;
                }
                else if ( (LA5_14==EQUALS||LA5_14==65||(LA5_14>=78 && LA5_14<=85)) ) {
                    alt5=15;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 14, input);

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
                    new NoViableAltException("61:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:52: b= bstatement
                    {
                    dbg.location(61,53);
                    pushFollow(FOLLOW_bstatement_in_statement261);
                    b=bstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,64);
                    if ( backtracking==0 ) {
                      retval.value += b;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:86: v= varstatement
                    {
                    dbg.location(61,87);
                    pushFollow(FOLLOW_varstatement_in_statement266);
                    v=varstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,100);
                    if ( backtracking==0 ) {
                      retval.value += v.value+";";
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:126: r= returnstatement
                    {
                    dbg.location(61,127);
                    pushFollow(FOLLOW_returnstatement_in_statement271);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,143);
                    if ( backtracking==0 ) {
                      retval.value += r+";";
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:169: e= exitstatement
                    {
                    dbg.location(61,170);
                    pushFollow(FOLLOW_exitstatement_in_statement276);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,184);
                    if ( backtracking==0 ) {
                      retval.value += e+";";
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:210: ifs= ifstatement
                    {
                    dbg.location(61,213);
                    pushFollow(FOLLOW_ifstatement_in_statement281);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,225);
                    if ( backtracking==0 ) {
                      retval.value += ifs;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:249: rep= repeatstatement
                    {
                    dbg.location(61,252);
                    pushFollow(FOLLOW_repeatstatement_in_statement286);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,268);
                    if ( backtracking==0 ) {
                      retval.value += rep;
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:292: dos= dostatement
                    {
                    dbg.location(61,295);
                    pushFollow(FOLLOW_dostatement_in_statement291);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,307);
                    if ( backtracking==0 ) {
                      retval.value += dos;
                    }

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:331: wh= whilestatement
                    {
                    dbg.location(61,333);
                    pushFollow(FOLLOW_whilestatement_in_statement296);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,348);
                    if ( backtracking==0 ) {
                      retval.value += wh;
                    }

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:371: con= continuestatement
                    {
                    dbg.location(61,374);
                    pushFollow(FOLLOW_continuestatement_in_statement301);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,392);
                    if ( backtracking==0 ) {
                      retval.value += con+";";
                    }

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:420: br= breakstatement
                    {
                    dbg.location(61,422);
                    pushFollow(FOLLOW_breakstatement_in_statement306);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,437);
                    if ( backtracking==0 ) {
                      retval.value += br+";";
                    }

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:464: fors= forstatement
                    {
                    dbg.location(61,468);
                    pushFollow(FOLLOW_forstatement_in_statement311);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,481);
                    if ( backtracking==0 ) {
                      retval.value += fors;
                    }

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:506: sw= switchstatement
                    {
                    dbg.location(61,508);
                    pushFollow(FOLLOW_switchstatement_in_statement316);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,524);
                    if ( backtracking==0 ) {
                      retval.value += sw;
                    }

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:547: wit= withstatement
                    {
                    dbg.location(61,550);
                    pushFollow(FOLLOW_withstatement_in_statement321);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,564);
                    if ( backtracking==0 ) {
                      retval.value += wit;
                    }

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:588: fun2= function2
                    {
                    dbg.location(61,592);
                    pushFollow(FOLLOW_function2_in_statement326);
                    fun2=function2();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,602);
                    if ( backtracking==0 ) {
                      retval.value += fun2+";";
                    }

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:631: ass= assignment
                    {
                    dbg.location(61,634);
                    pushFollow(FOLLOW_assignment_in_statement331);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,645);
                    if ( backtracking==0 ) {
                      retval.value += ass+";";
                    }

                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:673: fun= function
                    {
                    dbg.location(61,676);
                    pushFollow(FOLLOW_function_in_statement336);
                    fun=function();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(61,685);
                    if ( backtracking==0 ) {
                      retval.value += fun+";";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(61,714);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:714: ( ';' )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred21()) ) {
                        alt6=1;
                    }


                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:715: ';'
            	    {
            	    dbg.location(61,715);
            	    match(input,36,FOLLOW_36_in_statement341); if (failed) return retval;
            	    dbg.location(61,718);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:64:1: field returns [String value] : ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try { dbg.enterRule("field");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(64, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:1: ( ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:3: ( 'public' | 'private' )? ( 'static' )? (v= varstatement )
            {
            dbg.location(65,3);
            if ( backtracking==0 ) {
              System.out.println("Field "); 
            }
            dbg.location(65,35);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:35: ( 'public' | 'private' )?
            int alt7=3;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:36: 'public'
                    {
                    dbg.location(65,36);
                    match(input,37,FOLLOW_37_in_field360); if (failed) return value;
                    dbg.location(65,45);
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:66: 'private'
                    {
                    dbg.location(65,66);
                    match(input,38,FOLLOW_38_in_field364); if (failed) return value;
                    dbg.location(65,76);
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(65,100);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:100: ( 'static' )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:101: 'static'
                    {
                    dbg.location(65,101);
                    match(input,39,FOLLOW_39_in_field371); if (failed) return value;
                    dbg.location(65,109);
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(65,134);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:134: (v= varstatement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:65:135: v= varstatement
            {
            dbg.location(65,136);
            pushFollow(FOLLOW_varstatement_in_field379);
            v=varstatement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(65,151);
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
        dbg.location(66, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:68:1: method returns [String value] : ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token arg=null;
        Token name=null;
        expression_return e = null;

        String b = null;


        String s = "";
        try { dbg.enterRule("method");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(68, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:1: ( ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:3: ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement
            {
            dbg.location(69,3);
            if ( backtracking==0 ) {
              System.out.println("method ");
            }
            dbg.location(69,36);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:36: ( 'public' | 'private' )?
            int alt9=3;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==38) ) {
                alt9=2;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:37: 'public'
                    {
                    dbg.location(69,37);
                    match(input,37,FOLLOW_37_in_method403); if (failed) return value;
                    dbg.location(69,45);
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:66: 'private'
                    {
                    dbg.location(69,66);
                    match(input,38,FOLLOW_38_in_method406); if (failed) return value;
                    dbg.location(69,75);
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(69,99);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:99: ( 'static' )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:100: 'static'
                    {
                    dbg.location(69,100);
                    match(input,39,FOLLOW_39_in_method412); if (failed) return value;
                    dbg.location(69,108);
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(69,136);
            arg=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method419); if (failed) return value;
            dbg.location(69,146);
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method423); if (failed) return value;
            dbg.location(69,152);
            match(input,LPAREN,FOLLOW_LPAREN_in_method425); if (failed) return value;
            dbg.location(69,156);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:156: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN||LA13_0==WORD||(LA13_0>=NUMBER && LA13_0<=GLOBALVAR)||(LA13_0>=50 && LA13_0<=51)) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:157: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    dbg.location(69,158);
                    pushFollow(FOLLOW_expression_in_method430);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(69,170);
                    if ( backtracking==0 ) {
                      s = input.toString(e.start,e.stop);
                    }
                    dbg.location(69,185);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:185: ( ( ',' ) (e= expression )? )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==40) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:186: ( ',' ) (e= expression )?
                    	    {
                    	    dbg.location(69,186);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:186: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:187: ','
                    	    {
                    	    dbg.location(69,187);
                    	    match(input,40,FOLLOW_40_in_method436); if (failed) return value;

                    	    }

                    	    dbg.location(69,192);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:192: (e= expression )?
                    	    int alt11=2;
                    	    try { dbg.enterSubRule(11);
                    	    try { dbg.enterDecision(11);

                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==LPAREN||LA11_0==WORD||(LA11_0>=NUMBER && LA11_0<=GLOBALVAR)||(LA11_0>=50 && LA11_0<=51)) ) {
                    	        alt11=1;
                    	    }
                    	    } finally {dbg.exitDecision(11);}

                    	    switch (alt11) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:69:193: e= expression
                    	            {
                    	            dbg.location(69,194);
                    	            pushFollow(FOLLOW_expression_in_method442);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            dbg.location(69,205);
                    	            if ( backtracking==0 ) {
                    	              s += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(11);}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(69,232);
            match(input,RPAREN,FOLLOW_RPAREN_in_method451); if (failed) return value;
            dbg.location(69,237);
            pushFollow(FOLLOW_bstatement_in_method455);
            b=bstatement();
            _fsp--;
            if (failed) return value;
            dbg.location(69,249);
            if ( backtracking==0 ) {
              value = pc.methodstatement(value,arg.getText(),name.getText(),b,s);
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
        dbg.location(70, 1);

        }
        finally {
            dbg.exitRule("method");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end method


    // $ANTLR start innerclass
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:72:1: innerclass returns [String value] : 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) ;
    public final String innerclass() throws RecognitionException {
        String value = null;
        int innerclass_StartIndex = input.index();
        try { dbg.enterRule("innerclass");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(72, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:2: ( 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:4: 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' )
            {
            dbg.location(73,4);
            match(input,41,FOLLOW_41_in_innerclass471); if (failed) return value;
            dbg.location(73,12);
            match(input,WORD,FOLLOW_WORD_in_innerclass473); if (failed) return value;
            dbg.location(73,17);
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass475);    throw mse;
            }

            dbg.location(73,33);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:33: ( field | method )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=3;
                try { dbg.enterDecision(14);

                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==39) ) {
                        int LA14_6 = input.LA(3);

                        if ( (LA14_6==WORD) ) {
                            int LA14_13 = input.LA(4);

                            if ( (LA14_13==WORD) ) {
                                int LA14_30 = input.LA(5);

                                if ( (synpred32()) ) {
                                    alt14=1;
                                }
                                else if ( (synpred33()) ) {
                                    alt14=2;
                                }


                            }
                            else if ( ((LA14_13>=OIVAR && LA14_13<=GLOBALVAR)) ) {
                                alt14=1;
                            }


                        }


                    }
                    else if ( (LA14_2==WORD) ) {
                        int LA14_7 = input.LA(3);

                        if ( (LA14_7==WORD) ) {
                            int LA14_14 = input.LA(4);

                            if ( ((LA14_14>=RBRAC && LA14_14<=EQUALS)||LA14_14==WORD||(LA14_14>=37 && LA14_14<=40)||LA14_14==43||LA14_14==65||(LA14_14>=78 && LA14_14<=85)) ) {
                                alt14=1;
                            }
                            else if ( (LA14_14==LPAREN) ) {
                                alt14=2;
                            }


                        }
                        else if ( ((LA14_7>=OIVAR && LA14_7<=GLOBALVAR)) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case 38:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==39) ) {
                        int LA14_8 = input.LA(3);

                        if ( (LA14_8==WORD) ) {
                            int LA14_16 = input.LA(4);

                            if ( (LA14_16==WORD) ) {
                                int LA14_41 = input.LA(5);

                                if ( (synpred32()) ) {
                                    alt14=1;
                                }
                                else if ( (synpred33()) ) {
                                    alt14=2;
                                }


                            }
                            else if ( ((LA14_16>=OIVAR && LA14_16<=GLOBALVAR)) ) {
                                alt14=1;
                            }


                        }


                    }
                    else if ( (LA14_3==WORD) ) {
                        int LA14_9 = input.LA(3);

                        if ( (LA14_9==WORD) ) {
                            int LA14_17 = input.LA(4);

                            if ( ((LA14_17>=RBRAC && LA14_17<=EQUALS)||LA14_17==WORD||(LA14_17>=37 && LA14_17<=40)||LA14_17==43||LA14_17==65||(LA14_17>=78 && LA14_17<=85)) ) {
                                alt14=1;
                            }
                            else if ( (LA14_17==LPAREN) ) {
                                alt14=2;
                            }


                        }
                        else if ( ((LA14_9>=OIVAR && LA14_9<=GLOBALVAR)) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case 39:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==WORD) ) {
                        int LA14_10 = input.LA(3);

                        if ( (LA14_10==WORD) ) {
                            int LA14_19 = input.LA(4);

                            if ( ((LA14_19>=RBRAC && LA14_19<=EQUALS)||LA14_19==WORD||(LA14_19>=37 && LA14_19<=40)||LA14_19==43||LA14_19==65||(LA14_19>=78 && LA14_19<=85)) ) {
                                alt14=1;
                            }
                            else if ( (LA14_19==LPAREN) ) {
                                alt14=2;
                            }


                        }
                        else if ( ((LA14_10>=OIVAR && LA14_10<=GLOBALVAR)) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case WORD:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (LA14_5==WORD) ) {
                        int LA14_11 = input.LA(3);

                        if ( ((LA14_11>=RBRAC && LA14_11<=EQUALS)||LA14_11==WORD||(LA14_11>=37 && LA14_11<=40)||LA14_11==43||LA14_11==65||(LA14_11>=78 && LA14_11<=85)) ) {
                            alt14=1;
                        }
                        else if ( (LA14_11==LPAREN) ) {
                            alt14=2;
                        }


                    }
                    else if ( ((LA14_5>=OIVAR && LA14_5<=GLOBALVAR)) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:34: field
            	    {
            	    dbg.location(73,34);
            	    pushFollow(FOLLOW_field_in_innerclass482);
            	    field();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:40: method
            	    {
            	    dbg.location(73,40);
            	    pushFollow(FOLLOW_method_in_innerclass484);
            	    method();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(73,49);
            if ( input.LA(1)==RBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass488);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, innerclass_StartIndex); }
        }
        dbg.location(74, 2);

        }
        finally {
            dbg.exitRule("innerclass");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end innerclass


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:76:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        statement_return s = null;


        try { dbg.enterRule("bstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(76, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:77:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:77:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            dbg.location(77,3);
            if ( backtracking==0 ) {
              System.out.println("bstatement "); value = "";
            }
            dbg.location(77,53);
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement508);    throw mse;
            }

            dbg.location(77,69);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:77:69: (s= statement )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==LBRAC||LA15_0==WORD||(LA15_0>=OIVAR && LA15_0<=GLOBALVAR)||LA15_0==42||(LA15_0>=44 && LA15_0<=46)||(LA15_0>=66 && LA15_0<=69)||(LA15_0>=71 && LA15_0<=73)||LA15_0==77) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:77:70: s= statement
            	    {
            	    dbg.location(77,71);
            	    pushFollow(FOLLOW_statement_in_bstatement517);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(77,81);
            	    if ( backtracking==0 ) {
            	      value +=s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(77,104);
            if ( input.LA(1)==RBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement522);    throw mse;
            }

            dbg.location(77,118);
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
            if ( backtracking>0 ) { memoize(input, 7, bstatement_StartIndex); }
        }
        dbg.location(78, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:80:1: varstatement returns [String value] : type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        Token type=null;
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try { dbg.enterRule("varstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(80, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:1: (type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:3: type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            dbg.location(81,3);
            if ( backtracking==0 ) {
              System.out.println("var statement ");
            }
            dbg.location(81,47);
            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_varstatement550); if (failed) return retval;
            dbg.location(81,53);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:53: (vari= variable | ass= assignment )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==WORD||(LA16_0>=OIVAR && LA16_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 85:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        switch ( input.LA(4) ) {
                        case LPAREN:
                            {
                            int LA16_47 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 47, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case WORD:
                            {
                            int LA16_48 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 48, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA16_49 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 49, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA16_50 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 50, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA16_51 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 51, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA16_52 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 52, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA16_53 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 53, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 50:
                        case 51:
                            {
                            int LA16_54 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 54, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 39, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(4) ) {
                        case LPAREN:
                            {
                            int LA16_55 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 55, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 85:
                            {
                            int LA16_56 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 56, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
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
                        case 51:
                        case 65:
                            {
                            int LA16_57 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 57, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_58 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 58, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_59 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 59, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_60 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 60, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_61 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 61, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_62 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 62, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 40, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case HEXNUMBER:
                        {
                        switch ( input.LA(4) ) {
                        case EQUALS:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case 51:
                        case 65:
                            {
                            int LA16_63 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 63, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_64 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 64, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_65 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 65, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_66 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 66, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_67 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 67, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_68 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 68, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 41, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case STRING:
                        {
                        switch ( input.LA(4) ) {
                        case EQUALS:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case 51:
                        case 65:
                            {
                            int LA16_69 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 69, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_70 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 70, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_71 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 71, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_72 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 72, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_73 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 73, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_74 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 74, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 42, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case NUMBER:
                        {
                        switch ( input.LA(4) ) {
                        case EQUALS:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case 51:
                        case 65:
                            {
                            int LA16_75 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 75, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_76 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 76, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_77 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 77, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_78 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 78, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_79 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 79, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_80 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 80, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 43, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        switch ( input.LA(4) ) {
                        case 85:
                            {
                            int LA16_81 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 81, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
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
                        case 51:
                        case 65:
                            {
                            int LA16_82 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 82, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_83 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 83, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_84 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 84, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_85 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 85, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_86 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 86, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_87 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 87, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 44, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case DECIMAL:
                        {
                        switch ( input.LA(4) ) {
                        case EQUALS:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case 51:
                        case 65:
                            {
                            int LA16_88 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 88, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case NEGINTEGER:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            {
                            int LA16_89 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 89, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 59:
                        case 60:
                            {
                            int LA16_90 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 90, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 61:
                        case 62:
                            {
                            int LA16_91 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 91, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 63:
                        case 64:
                            {
                            int LA16_92 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 92, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA16_93 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 93, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 45, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    case 50:
                    case 51:
                        {
                        switch ( input.LA(4) ) {
                        case LPAREN:
                            {
                            int LA16_94 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 94, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case WORD:
                            {
                            int LA16_95 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 95, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA16_96 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 96, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA16_97 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 97, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA16_98 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 98, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA16_99 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 99, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA16_100 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 100, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        case 50:
                        case 51:
                            {
                            int LA16_101 = input.LA(5);

                            if ( (synpred38()) ) {
                                alt16=1;
                            }
                            else if ( (true) ) {
                                alt16=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 101, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 46, input);

                            dbg.recognitionException(nvae);
                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    }
                    break;
                case EQUALS:
                case 65:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                    {
                    alt16=2;
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
                case 48:
                case 49:
                case 50:
                case 51:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 77:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:54: vari= variable
                    {
                    dbg.location(81,58);
                    pushFollow(FOLLOW_variable_in_varstatement555);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(81,67);
                    if ( backtracking==0 ) {
                      s = ""+vari.value;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:90: ass= assignment
                    {
                    dbg.location(81,93);
                    pushFollow(FOLLOW_assignment_in_varstatement561);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(81,104);
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(81,127);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:127: ( ',' (varii= variable | ass= assignment ) )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:128: ',' (varii= variable | ass= assignment )
            	    {
            	    dbg.location(81,128);
            	    match(input,40,FOLLOW_40_in_varstatement567); if (failed) return retval;
            	    dbg.location(81,132);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:132: (varii= variable | ass= assignment )
            	    int alt17=2;
            	    try { dbg.enterSubRule(17);
            	    try { dbg.enterDecision(17);

            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==WORD||(LA17_0>=OIVAR && LA17_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 85:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                switch ( input.LA(4) ) {
            	                case LPAREN:
            	                    {
            	                    int LA17_47 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 47, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case WORD:
            	                    {
            	                    int LA17_48 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 48, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case HEXNUMBER:
            	                    {
            	                    int LA17_49 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 49, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case STRING:
            	                    {
            	                    int LA17_50 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 50, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case NUMBER:
            	                    {
            	                    int LA17_51 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 51, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case OIVAR:
            	                case GLOBALVAR:
            	                    {
            	                    int LA17_52 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 52, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case DECIMAL:
            	                    {
            	                    int LA17_53 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 53, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 50:
            	                case 51:
            	                    {
            	                    int LA17_54 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 54, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 39, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case WORD:
            	                {
            	                switch ( input.LA(4) ) {
            	                case 85:
            	                    {
            	                    int LA17_55 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 55, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case LPAREN:
            	                    {
            	                    int LA17_56 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 56, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
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
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_57 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 57, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_58 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 58, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_59 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 59, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_60 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 60, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_61 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 61, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_62 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 62, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 40, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                switch ( input.LA(4) ) {
            	                case EQUALS:
            	                case EQUALS2:
            	                case NOT_EQUALS:
            	                case GT:
            	                case GTE:
            	                case LT:
            	                case LTE:
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_63 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 63, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_64 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 64, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_65 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 65, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_66 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 66, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_67 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 67, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_68 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 68, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 41, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case STRING:
            	                {
            	                switch ( input.LA(4) ) {
            	                case EQUALS:
            	                case EQUALS2:
            	                case NOT_EQUALS:
            	                case GT:
            	                case GTE:
            	                case LT:
            	                case LTE:
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_69 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 69, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_70 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 70, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_71 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 71, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_72 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 72, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_73 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 73, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_74 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 74, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 42, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                switch ( input.LA(4) ) {
            	                case EQUALS:
            	                case EQUALS2:
            	                case NOT_EQUALS:
            	                case GT:
            	                case GTE:
            	                case LT:
            	                case LTE:
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_75 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 75, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_76 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 76, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_77 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 77, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_78 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 78, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_79 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 79, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_80 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 80, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 43, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                switch ( input.LA(4) ) {
            	                case 85:
            	                    {
            	                    int LA17_81 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 81, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
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
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_82 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 82, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_83 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 83, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_84 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 84, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_85 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 85, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_86 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 86, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_87 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 87, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 44, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                switch ( input.LA(4) ) {
            	                case EQUALS:
            	                case EQUALS2:
            	                case NOT_EQUALS:
            	                case GT:
            	                case GTE:
            	                case LT:
            	                case LTE:
            	                case 51:
            	                case 65:
            	                    {
            	                    int LA17_88 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 88, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case PLUS:
            	                case MINUS:
            	                case MULT:
            	                case DIV:
            	                case NEGINTEGER:
            	                case 52:
            	                case 53:
            	                case 54:
            	                case 55:
            	                case 56:
            	                case 57:
            	                case 58:
            	                    {
            	                    int LA17_89 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 89, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 59:
            	                case 60:
            	                    {
            	                    int LA17_90 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 90, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 61:
            	                case 62:
            	                    {
            	                    int LA17_91 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 91, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 63:
            	                case 64:
            	                    {
            	                    int LA17_92 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 92, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 86:
            	                    {
            	                    int LA17_93 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 93, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 45, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            case 50:
            	            case 51:
            	                {
            	                switch ( input.LA(4) ) {
            	                case LPAREN:
            	                    {
            	                    int LA17_94 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 94, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case WORD:
            	                    {
            	                    int LA17_95 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 95, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case HEXNUMBER:
            	                    {
            	                    int LA17_96 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 96, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case STRING:
            	                    {
            	                    int LA17_97 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 97, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case NUMBER:
            	                    {
            	                    int LA17_98 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 98, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case OIVAR:
            	                case GLOBALVAR:
            	                    {
            	                    int LA17_99 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 99, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case DECIMAL:
            	                    {
            	                    int LA17_100 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 100, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                case 50:
            	                case 51:
            	                    {
            	                    int LA17_101 = input.LA(5);

            	                    if ( (synpred39()) ) {
            	                        alt17=1;
            	                    }
            	                    else if ( (true) ) {
            	                        alt17=2;
            	                    }
            	                    else {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 101, input);

            	                        dbg.recognitionException(nvae);
            	                        throw nvae;
            	                    }
            	                    }
            	                    break;
            	                default:
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 46, input);

            	                    dbg.recognitionException(nvae);
            	                    throw nvae;
            	                }

            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 2, input);

            	                dbg.recognitionException(nvae);
            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case EQUALS:
            	        case 65:
            	        case 78:
            	        case 79:
            	        case 80:
            	        case 81:
            	        case 82:
            	        case 83:
            	        case 84:
            	            {
            	            alt17=2;
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
            	        case 48:
            	        case 49:
            	        case 50:
            	        case 51:
            	        case 66:
            	        case 67:
            	        case 68:
            	        case 69:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 77:
            	            {
            	            alt17=1;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(17);}

            	    switch (alt17) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:133: varii= variable
            	            {
            	            dbg.location(81,138);
            	            pushFollow(FOLLOW_variable_in_varstatement572);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(81,147);
            	            if ( backtracking==0 ) {
            	              s += ", "+varii.value;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:174: ass= assignment
            	            {
            	            dbg.location(81,177);
            	            pushFollow(FOLLOW_assignment_in_varstatement578);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(81,188);
            	            if ( backtracking==0 ) {
            	              s += ","+ ass;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(17);}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(81,217);
            if ( backtracking==0 ) {
              retval.value =pc.varstatement(type.getText(),s);
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, varstatement_StartIndex); }
        }
        dbg.location(82, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:84:1: returnstatement returns [String value] : 'return' (e= expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("returnstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(84, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:85:1: ( 'return' (e= expression ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:85:3: 'return' (e= expression )
            {
            dbg.location(85,3);
            match(input,44,FOLLOW_44_in_returnstatement600); if (failed) return value;
            dbg.location(85,12);
            if ( backtracking==0 ) {
              System.out.println("return statement ");
            }
            dbg.location(85,55);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:85:55: (e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:85:56: e= expression
            {
            dbg.location(85,57);
            pushFollow(FOLLOW_expression_in_returnstatement607);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(85,68);
            if ( backtracking==0 ) {
              value =input.toString(e.start,e.stop);
            }

            }

            dbg.location(85,87);
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
            if ( backtracking>0 ) { memoize(input, 9, returnstatement_StartIndex); }
        }
        dbg.location(86, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:88:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try { dbg.enterRule("exitstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(88, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:89:1: ( 'exit' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:89:2: 'exit'
            {
            dbg.location(89,2);
            match(input,45,FOLLOW_45_in_exitstatement623); if (failed) return value;
            dbg.location(89,9);
            if ( backtracking==0 ) {
              System.out.println("exit statement");
            }
            dbg.location(89,49);
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
            if ( backtracking>0 ) { memoize(input, 10, exitstatement_StartIndex); }
        }
        dbg.location(90, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:92:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;

        String el = null;


        try { dbg.enterRule("ifstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(92, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:3: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            dbg.location(93,3);
            if ( backtracking==0 ) {
              System.out.println("if statement ");
            }
            dbg.location(93,42);
            match(input,46,FOLLOW_46_in_ifstatement642); if (failed) return value;
            dbg.location(93,48);
            pushFollow(FOLLOW_expression_in_ifstatement646);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(93,60);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:60: ( 'then' )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:61: 'then'
                    {
                    dbg.location(93,61);
                    match(input,47,FOLLOW_47_in_ifstatement649); if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(93,70);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:70: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:71: s= statement
            {
            dbg.location(93,72);
            pushFollow(FOLLOW_statement_in_ifstatement656);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(93,84);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:84: (el= elsestatement )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    int LA20_19 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==49) ) {
                    int LA20_20 = input.LA(2);

                    if ( (synpred42()) ) {
                        alt20=1;
                    }


                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:85: el= elsestatement
            	    {
            	    dbg.location(93,87);
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement662);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(93,101);
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}

            dbg.location(93,126);
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
            if ( backtracking>0 ) { memoize(input, 11, ifstatement_StartIndex); }
        }
        dbg.location(94, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:96:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("elsestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(96, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            dbg.location(97,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:3: ( 'else' | ( 'elsif' e= expression ) )
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            else if ( (LA21_0==49) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("97:3: ( 'else' | ( 'elsif' e= expression ) )", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:4: 'else'
                    {
                    dbg.location(97,4);
                    match(input,48,FOLLOW_48_in_elsestatement682); if (failed) return value;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:11: ( 'elsif' e= expression )
                    {
                    dbg.location(97,11);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:11: ( 'elsif' e= expression )
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:12: 'elsif' e= expression
                    {
                    dbg.location(97,12);
                    match(input,49,FOLLOW_49_in_elsestatement685); if (failed) return value;
                    dbg.location(97,21);
                    pushFollow(FOLLOW_expression_in_elsestatement689);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(97,33);
                    if ( backtracking==0 ) {
                      value ="if "+input.toString(e.start,e.stop);
                    }

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(97,60);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:60: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:97:61: s= statement
            {
            dbg.location(97,62);
            pushFollow(FOLLOW_statement_in_elsestatement698);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(97,73);
            if ( backtracking==0 ) {
              value +=" "+input.toString(s.start,s.stop);
            }

            }

            dbg.location(97,98);
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
            if ( backtracking>0 ) { memoize(input, 12, elsestatement_StartIndex); }
        }
        dbg.location(98, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:101:1: expression returns [String value] : (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
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
        dbg.location(101, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:1: ( (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:4: (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            dbg.location(102,4);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:4: (p= pexpression | r= relationalExpression | n= notexpression )
            int alt22=3;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22);

            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt22=1;
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
                alt22=2;
                }
                break;
            case 50:
            case 51:
                {
                alt22=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("102:4: (p= pexpression | r= relationalExpression | n= notexpression )", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:5: p= pexpression
                    {
                    dbg.location(102,6);
                    pushFollow(FOLLOW_pexpression_in_expression726);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(102,18);
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:38: r= relationalExpression
                    {
                    dbg.location(102,39);
                    pushFollow(FOLLOW_relationalExpression_in_expression731);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(102,60);
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:80: n= notexpression
                    {
                    dbg.location(102,81);
                    pushFollow(FOLLOW_notexpression_in_expression736);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(102,95);
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(102,116);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:116: (aa= aexpression )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS && LA23_0<=DIV)||LA23_0==NEGINTEGER||(LA23_0>=52 && LA23_0<=58)) ) {
                    int LA23_36 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt23=1;
                    }


                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:117: aa= aexpression
            	    {
            	    dbg.location(102,119);
            	    pushFollow(FOLLOW_aexpression_in_expression743);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    dbg.location(102,132);
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}

            dbg.location(102,161);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:161: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                switch ( input.LA(1) ) {
                case 59:
                case 60:
                    {
                    int LA25_33 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 61:
                case 62:
                    {
                    int LA25_34 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 63:
                case 64:
                    {
                    int LA25_35 = input.LA(2);

                    if ( (synpred49()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:162: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    dbg.location(102,162);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:162: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt24=3;
            	    try { dbg.enterSubRule(24);
            	    try { dbg.enterDecision(24);

            	    switch ( input.LA(1) ) {
            	    case 59:
            	    case 60:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 61:
            	    case 62:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 63:
            	    case 64:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("102:162: (an= andexpression | orr= orexpression | x= xorexpression )", 24, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(24);}

            	    switch (alt24) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:163: an= andexpression
            	            {
            	            dbg.location(102,165);
            	            pushFollow(FOLLOW_andexpression_in_expression753);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(102,179);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:205: orr= orexpression
            	            {
            	            dbg.location(102,208);
            	            pushFollow(FOLLOW_orexpression_in_expression758);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(102,221);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:248: x= xorexpression
            	            {
            	            dbg.location(102,249);
            	            pushFollow(FOLLOW_xorexpression_in_expression763);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            dbg.location(102,263);
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(24);}

            	    dbg.location(102,289);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:289: (e= expression )
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:290: e= expression
            	    {
            	    dbg.location(102,291);
            	    pushFollow(FOLLOW_expression_in_expression770);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    dbg.location(102,302);
            	    if ( backtracking==0 ) {
            	      retval.value =" "+e.value;
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}

            dbg.location(102,329);
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
            if ( backtracking>0 ) { memoize(input, 13, expression_StartIndex); }
        }
        dbg.location(103, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:105:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("notexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(105, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:106:1: ( ( 'not' | '!' ) e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:106:3: ( 'not' | '!' ) e= expression
            {
            dbg.location(106,3);
            if ( (input.LA(1)>=50 && input.LA(1)<=51) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression789);    throw mse;
            }

            dbg.location(106,16);
            pushFollow(FOLLOW_expression_in_notexpression797);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(106,28);
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
            if ( backtracking>0 ) { memoize(input, 14, notexpression_StartIndex); }
        }
        dbg.location(107, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:109:1: aexpression returns [String value] : a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("aexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(109, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:1: (a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:3: a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            dbg.location(110,4);
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=52 && input.LA(1)<=58) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression814);    throw mse;
            }

            dbg.location(110,68);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:68: ( expression )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26);

            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    int LA26_1 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case WORD:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA26_6 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA26_7 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case 50:
                case 51:
                    {
                    int LA26_8 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA26_28 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
            }

            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:69: expression
                    {
                    dbg.location(110,69);
                    pushFollow(FOLLOW_expression_in_aexpression841);
                    expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}

            dbg.location(110,82);
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
            if ( backtracking>0 ) { memoize(input, 15, aexpression_StartIndex); }
        }
        dbg.location(111, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("value");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(113, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            dbg.location(113,33);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt27=4;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt27=1;
                }
                break;
            case HEXNUMBER:
                {
                alt27=2;
                }
                break;
            case STRING:
                {
                alt27=3;
                }
                break;
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt27=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("113:34: ( NUMBER | HEXNUMBER | STRING | variable )", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:35: NUMBER
                    {
                    dbg.location(113,35);
                    match(input,NUMBER,FOLLOW_NUMBER_in_value862); if (failed) return value;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:42: HEXNUMBER
                    {
                    dbg.location(113,42);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value864); if (failed) return value;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:52: STRING
                    {
                    dbg.location(113,52);
                    match(input,STRING,FOLLOW_STRING_in_value866); if (failed) return value;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:113:59: variable
                    {
                    dbg.location(113,59);
                    pushFollow(FOLLOW_variable_in_value868);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(113,69);
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
            if ( backtracking>0 ) { memoize(input, 16, value_StartIndex); }
        }
        dbg.location(114, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:116:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try { dbg.enterRule("pexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(116, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:117:1: ( LPAREN e= expression RPAREN )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:117:3: LPAREN e= expression RPAREN
            {
            dbg.location(117,3);
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression884); if (failed) return value;
            dbg.location(117,11);
            pushFollow(FOLLOW_expression_in_pexpression888);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(117,23);
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression890); if (failed) return value;
            dbg.location(117,30);
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
            if ( backtracking>0 ) { memoize(input, 17, pexpression_StartIndex); }
        }
        dbg.location(118, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:120:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try { dbg.enterRule("andexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(120, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:121:1: (a= ( '&&' | 'and' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:121:3: a= ( '&&' | 'and' )
            {
            dbg.location(121,4);
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=59 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression907);    throw mse;
            }

            dbg.location(121,18);
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
            if ( backtracking>0 ) { memoize(input, 18, andexpression_StartIndex); }
        }
        dbg.location(122, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:124:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try { dbg.enterRule("orexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(124, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:125:1: (o= ( '||' | 'or' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:125:3: o= ( '||' | 'or' )
            {
            dbg.location(125,4);
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression928);    throw mse;
            }

            dbg.location(125,17);
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
            if ( backtracking>0 ) { memoize(input, 19, orexpression_StartIndex); }
        }
        dbg.location(126, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:128:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try { dbg.enterRule("xorexpression");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(128, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:129:1: (x= ( '^^' | 'xor' ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:129:3: x= ( '^^' | 'xor' )
            {
            dbg.location(129,4);
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression949);    throw mse;
            }

            dbg.location(129,18);
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
            if ( backtracking>0 ) { memoize(input, 20, xorexpression_StartIndex); }
        }
        dbg.location(130, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:132:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
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
        dbg.location(132, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:133:3: ( (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            dbg.location(134,3);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
            int alt28=7;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPAREN) ) {
                    alt28=1;
                }
                else if ( (synpred73()) ) {
                    alt28=5;
                }
                else if ( (true) ) {
                    alt28=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("134:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 28, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt28=2;
                }
                break;
            case STRING:
                {
                alt28=3;
                }
                break;
            case NUMBER:
                {
                alt28=4;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt28=5;
                }
                break;
            case DECIMAL:
                {
                alt28=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("134:3: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:4: f= function
                    {
                    dbg.location(134,5);
                    pushFollow(FOLLOW_function_in_relationalExpression975);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(134,14);
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:35: h= HEXNUMBER
                    {
                    dbg.location(134,36);
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression980); if (failed) return value;
                    dbg.location(134,46);
                    if ( backtracking==0 ) {
                      value = h.getText();
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:66: s= STRING
                    {
                    dbg.location(134,67);
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression985); if (failed) return value;
                    dbg.location(134,74);
                    if ( backtracking==0 ) {
                      value = s.getText();
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:94: n= NUMBER
                    {
                    dbg.location(134,95);
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression990); if (failed) return value;
                    dbg.location(134,102);
                    if ( backtracking==0 ) {
                      value = n.getText();
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:122: v= variable
                    {
                    dbg.location(134,123);
                    pushFollow(FOLLOW_variable_in_relationalExpression995);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(134,132);
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:153: d= DECIMAL
                    {
                    dbg.location(134,154);
                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1000); if (failed) return value;
                    dbg.location(134,162);
                    if ( backtracking==0 ) {
                      value = d.getText();
                    }

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:182: w= WORD
                    {
                    dbg.location(134,183);
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1005); if (failed) return value;
                    dbg.location(134,188);
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}

            dbg.location(134,209);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:209: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA30_46 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt30=1;
                        }


                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA30_47 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt30=1;
                        }


                        }
                        break;
                    case STRING:
                        {
                        int LA30_48 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt30=1;
                        }


                        }
                        break;
                    case NUMBER:
                        {
                        int LA30_49 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt30=1;
                        }


                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA30_50 = input.LA(3);

                        if ( (synpred88()) ) {
                            alt30=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA30_0>=EQUALS && LA30_0<=LTE)||LA30_0==65) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:211: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    dbg.location(134,213);
            	    op=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||input.LA(1)==65 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1013);    throw mse;
            	    }

            	    dbg.location(134,265);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt29=6;
            	    try { dbg.enterSubRule(29);
            	    try { dbg.enterDecision(29);

            	    switch ( input.LA(1) ) {
            	    case WORD:
            	        {
            	        int LA29_1 = input.LA(2);

            	        if ( (LA29_1==LPAREN) ) {
            	            alt29=1;
            	        }
            	        else if ( (synpred87()) ) {
            	            alt29=5;
            	        }
            	        else if ( (true) ) {
            	            alt29=6;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 29, 1, input);

            	            dbg.recognitionException(nvae);
            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case HEXNUMBER:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case STRING:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case NUMBER:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    case OIVAR:
            	    case GLOBALVAR:
            	        {
            	        alt29=5;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 29, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(29);}

            	    switch (alt29) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:266: function
            	            {
            	            dbg.location(134,266);
            	            pushFollow(FOLLOW_function_in_relationalExpression1034);
            	            function();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:275: HEXNUMBER
            	            {
            	            dbg.location(134,275);
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1036); if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:285: STRING
            	            {
            	            dbg.location(134,285);
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression1038); if (failed) return value;

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:292: NUMBER
            	            {
            	            dbg.location(134,292);
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1040); if (failed) return value;

            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:299: variable
            	            {
            	            dbg.location(134,299);
            	            pushFollow(FOLLOW_variable_in_relationalExpression1042);
            	            variable();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:308: WORD
            	            {
            	            dbg.location(134,308);
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression1044); if (failed) return value;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(29);}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}

            dbg.location(134,316);
            if ( backtracking==0 ) {
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, relationalExpression_StartIndex); }
        }
        dbg.location(135, 3);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:137:1: repeatstatement returns [String value] : 'repeat' e= expression (s= statement ) ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("repeatstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(137, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:138:1: ( 'repeat' e= expression (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:138:3: 'repeat' e= expression (s= statement )
            {
            dbg.location(138,3);
            match(input,66,FOLLOW_66_in_repeatstatement1065); if (failed) return value;
            dbg.location(138,13);
            pushFollow(FOLLOW_expression_in_repeatstatement1069);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(138,25);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:138:25: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:138:26: s= statement
            {
            dbg.location(138,27);
            pushFollow(FOLLOW_statement_in_repeatstatement1074);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(138,39);
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
            if ( backtracking>0 ) { memoize(input, 22, repeatstatement_StartIndex); }
        }
        dbg.location(139, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:141:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try { dbg.enterRule("breakstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(141, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:142:1: ( 'break' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:142:3: 'break'
            {
            dbg.location(142,3);
            match(input,67,FOLLOW_67_in_breakstatement1090); if (failed) return value;
            dbg.location(142,12);
            if ( backtracking==0 ) {
              System.out.println("break;");
            }
            dbg.location(142,44);
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
            if ( backtracking>0 ) { memoize(input, 23, breakstatement_StartIndex); }
        }
        dbg.location(143, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:144:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try { dbg.enterRule("continuestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(144, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:145:1: ( 'continue' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:145:3: 'continue'
            {
            dbg.location(145,3);
            match(input,68,FOLLOW_68_in_continuestatement1107); if (failed) return value;
            dbg.location(145,14);
            if ( backtracking==0 ) {
              System.out.println("continue;");
            }
            dbg.location(145,49);
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
            if ( backtracking>0 ) { memoize(input, 24, continuestatement_StartIndex); }
        }
        dbg.location(146, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:148:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        statement_return s = null;

        expression_return e = null;


        try { dbg.enterRule("dostatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(148, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:149:1: ( 'do' s= statement 'until' e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:149:3: 'do' s= statement 'until' e= expression
            {
            dbg.location(149,3);
            match(input,69,FOLLOW_69_in_dostatement1124); if (failed) return value;
            dbg.location(149,9);
            pushFollow(FOLLOW_statement_in_dostatement1128);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(149,20);
            match(input,70,FOLLOW_70_in_dostatement1130); if (failed) return value;
            dbg.location(149,29);
            pushFollow(FOLLOW_expression_in_dostatement1134);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(149,41);
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
            if ( backtracking>0 ) { memoize(input, 25, dostatement_StartIndex); }
        }
        dbg.location(150, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:152:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("whilestatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(152, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:153:1: ( 'while' e= expression (s= statement ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:153:3: 'while' e= expression (s= statement )
            {
            dbg.location(153,3);
            match(input,71,FOLLOW_71_in_whilestatement1149); if (failed) return value;
            dbg.location(153,12);
            pushFollow(FOLLOW_expression_in_whilestatement1153);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(153,24);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:153:24: (s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:153:25: s= statement
            {
            dbg.location(153,26);
            pushFollow(FOLLOW_statement_in_whilestatement1158);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(153,38);
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
            if ( backtracking>0 ) { memoize(input, 26, whilestatement_StartIndex); }
        }
        dbg.location(154, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:156:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement ;
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
        dbg.location(156, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:157:1: ( 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:157:3: 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement
            {
            dbg.location(157,3);
            match(input,72,FOLLOW_72_in_forstatement1174); if (failed) return value;
            dbg.location(157,9);
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1176); if (failed) return value;
            dbg.location(157,15);
            pushFollow(FOLLOW_statement_in_forstatement1180);
            s1=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(157,27);
            pushFollow(FOLLOW_expression_in_forstatement1184);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(157,39);
            match(input,36,FOLLOW_36_in_forstatement1186); if (failed) return value;
            dbg.location(157,45);
            pushFollow(FOLLOW_statement_in_forstatement1190);
            s2=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(157,56);
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1192); if (failed) return value;
            dbg.location(157,61);
            pushFollow(FOLLOW_statement_in_forstatement1196);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(157,72);
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
            if ( backtracking>0 ) { memoize(input, 27, forstatement_StartIndex); }
        }
        dbg.location(158, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:160:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try { dbg.enterRule("switchstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(160, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            dbg.location(161,3);
            match(input,73,FOLLOW_73_in_switchstatement1211); if (failed) return value;
            dbg.location(161,12);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:12: ( expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:13: expression
            {
            dbg.location(161,13);
            pushFollow(FOLLOW_expression_in_switchstatement1214);
            expression();
            _fsp--;
            if (failed) return value;

            }

            dbg.location(161,25);
            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1217); if (failed) return value;
            dbg.location(161,29);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=74 && LA32_0<=75)) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    dbg.location(161,30);
            	    if ( (input.LA(1)>=74 && input.LA(1)<=75) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1220);    throw mse;
            	    }

            	    dbg.location(161,49);
            	    pushFollow(FOLLOW_expression_in_switchstatement1226);
            	    expression();
            	    _fsp--;
            	    if (failed) return value;
            	    dbg.location(161,60);
            	    match(input,76,FOLLOW_76_in_switchstatement1228); if (failed) return value;
            	    dbg.location(161,64);
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:64: ( statement )*
            	    try { dbg.enterSubRule(31);

            	    loop31:
            	    do {
            	        int alt31=2;
            	        try { dbg.enterDecision(31);

            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==LBRAC||LA31_0==WORD||(LA31_0>=OIVAR && LA31_0<=GLOBALVAR)||LA31_0==42||(LA31_0>=44 && LA31_0<=46)||(LA31_0>=66 && LA31_0<=69)||(LA31_0>=71 && LA31_0<=73)||LA31_0==77) ) {
            	            alt31=1;
            	        }


            	        } finally {dbg.exitDecision(31);}

            	        switch (alt31) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:161:65: statement
            	    	    {
            	    	    dbg.location(161,65);
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1231);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);
            	    } finally {dbg.exitSubRule(31);}


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}

            dbg.location(161,79);
            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1237); if (failed) return value;
            dbg.location(161,83);
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
            if ( backtracking>0 ) { memoize(input, 28, switchstatement_StartIndex); }
        }
        dbg.location(162, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:164:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try { dbg.enterRule("withstatement");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(164, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:165:1: ( 'with' e= expression s= statement )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:165:3: 'with' e= expression s= statement
            {
            dbg.location(165,3);
            match(input,77,FOLLOW_77_in_withstatement1253); if (failed) return value;
            dbg.location(165,12);
            pushFollow(FOLLOW_expression_in_withstatement1258);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(165,26);
            pushFollow(FOLLOW_statement_in_withstatement1263);
            s=statement();
            _fsp--;
            if (failed) return value;
            dbg.location(165,37);
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
            if ( backtracking>0 ) { memoize(input, 29, withstatement_StartIndex); }
        }
        dbg.location(166, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:168:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try { dbg.enterRule("assignment");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(168, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:169:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:169:3: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression
            {
            dbg.location(169,3);
            if ( backtracking==0 ) {
              System.out.println("assignment ");
            }
            dbg.location(169,46);
            pushFollow(FOLLOW_variable_in_assignment1282);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            dbg.location(169,58);
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==65||(input.LA(1)>=78 && input.LA(1)<=84) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1286);    throw mse;
            }

            dbg.location(169,108);
            pushFollow(FOLLOW_expression_in_assignment1309);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(169,120);
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
            if ( backtracking>0 ) { memoize(input, 30, assignment_StartIndex); }
        }
        dbg.location(170, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:172:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try { dbg.enterRule("variable");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(172, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:173:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:173:3: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            {
            dbg.location(173,3);
            if ( backtracking==0 ) {
              System.out.println("variable ");
            }
            dbg.location(173,38);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:173:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==WORD||(LA33_0>=OIVAR && LA33_0<=GLOBALVAR)) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==85) ) {
                    alt33=1;
                }
                else if ( (LA33_1==EOF||(LA33_1>=PLUS && LA33_1<=LTE)||(LA33_1>=WORD && LA33_1<=GLOBALVAR)||(LA33_1>=36 && LA33_1<=84)||LA33_1==86) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("173:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 33, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("173:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:173:39: a= array
                    {
                    dbg.location(173,40);
                    pushFollow(FOLLOW_array_in_variable1329);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    dbg.location(173,46);
                    if ( backtracking==0 ) {
                      retval.value = a;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:173:67: valuee= ( WORD | OIVAR | GLOBALVAR )
                    {
                    dbg.location(173,73);
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1334);    throw mse;
                    }

                    dbg.location(173,96);
                    if ( backtracking==0 ) {
                      retval.value = valuee.getText();
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, variable_StartIndex); }
        }
        dbg.location(174, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:176:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try { dbg.enterRule("function");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(176, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            dbg.location(177,4);
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1358); if (failed) return value;
            dbg.location(177,10);
            match(input,LPAREN,FOLLOW_LPAREN_in_function1360); if (failed) return value;
            dbg.location(177,14);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN||LA36_0==WORD||(LA36_0>=NUMBER && LA36_0<=GLOBALVAR)||(LA36_0>=50 && LA36_0<=51)) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    dbg.location(177,16);
                    pushFollow(FOLLOW_expression_in_function1365);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(177,28);
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    dbg.location(177,48);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:48: ( ( ',' ) (e= expression )? )*
                    try { dbg.enterSubRule(35);

                    loop35:
                    do {
                        int alt35=2;
                        try { dbg.enterDecision(35);

                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==40) ) {
                            alt35=1;
                        }


                        } finally {dbg.exitDecision(35);}

                        switch (alt35) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:49: ( ',' ) (e= expression )?
                    	    {
                    	    dbg.location(177,49);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:49: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:50: ','
                    	    {
                    	    dbg.location(177,50);
                    	    match(input,40,FOLLOW_40_in_function1371); if (failed) return value;

                    	    }

                    	    dbg.location(177,55);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:55: (e= expression )?
                    	    int alt34=2;
                    	    try { dbg.enterSubRule(34);
                    	    try { dbg.enterDecision(34);

                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==LPAREN||LA34_0==WORD||(LA34_0>=NUMBER && LA34_0<=GLOBALVAR)||(LA34_0>=50 && LA34_0<=51)) ) {
                    	        alt34=1;
                    	    }
                    	    } finally {dbg.exitDecision(34);}

                    	    switch (alt34) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:177:56: e= expression
                    	            {
                    	            dbg.location(177,57);
                    	            pushFollow(FOLLOW_expression_in_function1377);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            dbg.location(177,68);
                    	            if ( backtracking==0 ) {
                    	              value += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(34);}


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(35);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(177,100);
            match(input,RPAREN,FOLLOW_RPAREN_in_function1386); if (failed) return value;
            dbg.location(177,104);
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
            if ( backtracking>0 ) { memoize(input, 32, function_StartIndex); }
        }
        dbg.location(178, 1);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:180:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try { dbg.enterRule("function2");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(180, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            dbg.location(181,5);
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21404); if (failed) return value;
            dbg.location(181,12);
            match(input,LPAREN,FOLLOW_LPAREN_in_function21406); if (failed) return value;
            dbg.location(181,16);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt39=2;
            try { dbg.enterSubRule(39);
            try { dbg.enterDecision(39);

            int LA39_0 = input.LA(1);

            if ( (LA39_0==LPAREN||LA39_0==WORD||(LA39_0>=NUMBER && LA39_0<=GLOBALVAR)||(LA39_0>=50 && LA39_0<=51)) ) {
                alt39=1;
            }
            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    dbg.location(181,18);
                    pushFollow(FOLLOW_expression_in_function21411);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    dbg.location(181,30);
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    dbg.location(181,49);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:49: ( ( ',' ) (e= expression )? )*
                    try { dbg.enterSubRule(38);

                    loop38:
                    do {
                        int alt38=2;
                        try { dbg.enterDecision(38);

                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==40) ) {
                            alt38=1;
                        }


                        } finally {dbg.exitDecision(38);}

                        switch (alt38) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:50: ( ',' ) (e= expression )?
                    	    {
                    	    dbg.location(181,50);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:50: ( ',' )
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:51: ','
                    	    {
                    	    dbg.location(181,51);
                    	    match(input,40,FOLLOW_40_in_function21416); if (failed) return value;

                    	    }

                    	    dbg.location(181,56);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:56: (e= expression )?
                    	    int alt37=2;
                    	    try { dbg.enterSubRule(37);
                    	    try { dbg.enterDecision(37);

                    	    int LA37_0 = input.LA(1);

                    	    if ( (LA37_0==LPAREN||LA37_0==WORD||(LA37_0>=NUMBER && LA37_0<=GLOBALVAR)||(LA37_0>=50 && LA37_0<=51)) ) {
                    	        alt37=1;
                    	    }
                    	    } finally {dbg.exitDecision(37);}

                    	    switch (alt37) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:181:57: e= expression
                    	            {
                    	            dbg.location(181,58);
                    	            pushFollow(FOLLOW_expression_in_function21422);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            dbg.location(181,69);
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

            dbg.location(181,101);
            match(input,RPAREN,FOLLOW_RPAREN_in_function21431); if (failed) return value;
            dbg.location(181,105);
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
            if ( backtracking>0 ) { memoize(input, 33, function2_StartIndex); }
        }
        dbg.location(182, 2);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:184:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;


        try { dbg.enterRule("array");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(184, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:185:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:185:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']'
            {
            dbg.location(185,5);
            if ( backtracking==0 ) {
              System.out.println("array");
            }
            dbg.location(185,42);
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1453);    throw mse;
            }

            dbg.location(185,66);
            match(input,85,FOLLOW_85_in_array1461); if (failed) return value;
            dbg.location(185,71);
            pushFollow(FOLLOW_expression_in_array1465);
            e=expression();
            _fsp--;
            if (failed) return value;
            dbg.location(185,83);
            match(input,86,FOLLOW_86_in_array1467); if (failed) return value;
            dbg.location(185,87);
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
            if ( backtracking>0 ) { memoize(input, 34, array_StartIndex); }
        }
        dbg.location(186, 1);

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
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:70: ( method )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:70: method
        {
        dbg.location(53,72);
        pushFollow(FOLLOW_method_in_synpred1199);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:115: ( field )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:53:115: field
        {
        dbg.location(53,117);
        pushFollow(FOLLOW_field_in_synpred2204);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:715: ( ';' )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:61:715: ';'
        {
        dbg.location(61,715);
        match(input,36,FOLLOW_36_in_synpred21341); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:34: ( field )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:34: field
        {
        dbg.location(73,34);
        pushFollow(FOLLOW_field_in_synpred32482);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:40: ( method )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:73:40: method
        {
        dbg.location(73,40);
        pushFollow(FOLLOW_method_in_synpred33484);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:54: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:54: variable
        {
        dbg.location(81,59);
        pushFollow(FOLLOW_variable_in_synpred38555);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:133: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:81:133: variable
        {
        dbg.location(81,139);
        pushFollow(FOLLOW_variable_in_synpred39572);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:85: ( elsestatement )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:93:85: elsestatement
        {
        dbg.location(93,88);
        pushFollow(FOLLOW_elsestatement_in_synpred42662);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:117: ( aexpression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:117: aexpression
        {
        dbg.location(102,120);
        pushFollow(FOLLOW_aexpression_in_synpred46743);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:162: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:162: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        dbg.location(102,162);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:162: ( andexpression | orexpression | xorexpression )
        int alt46=3;
        try { dbg.enterSubRule(46);
        try { dbg.enterDecision(46);

        switch ( input.LA(1) ) {
        case 59:
        case 60:
            {
            alt46=1;
            }
            break;
        case 61:
        case 62:
            {
            alt46=2;
            }
            break;
        case 63:
        case 64:
            {
            alt46=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("102:162: ( andexpression | orexpression | xorexpression )", 46, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;
        }

        } finally {dbg.exitDecision(46);}

        switch (alt46) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:163: andexpression
                {
                dbg.location(102,166);
                pushFollow(FOLLOW_andexpression_in_synpred49753);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:205: orexpression
                {
                dbg.location(102,209);
                pushFollow(FOLLOW_orexpression_in_synpred49758);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:248: xorexpression
                {
                dbg.location(102,250);
                pushFollow(FOLLOW_xorexpression_in_synpred49763);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(46);}

        dbg.location(102,289);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:289: ( expression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:102:290: expression
        {
        dbg.location(102,292);
        pushFollow(FOLLOW_expression_in_synpred49770);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:69: ( expression )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:110:69: expression
        {
        dbg.location(110,69);
        pushFollow(FOLLOW_expression_in_synpred62841);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:122: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:122: variable
        {
        dbg.location(134,124);
        pushFollow(FOLLOW_variable_in_synpred73995);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:299: ( variable )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:299: variable
        {
        dbg.location(134,299);
        pushFollow(FOLLOW_variable_in_synpred871042);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:211: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        dbg.enterAlt(1);

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:211: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        dbg.location(134,214);
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||input.LA(1)==65 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred881013);    throw mse;
        }

        dbg.location(134,265);
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt47=6;
        try { dbg.enterSubRule(47);
        try { dbg.enterDecision(47);

        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA47_1 = input.LA(2);

            if ( (LA47_1==LPAREN) ) {
                alt47=1;
            }
            else if ( (synpred87()) ) {
                alt47=5;
            }
            else if ( (true) ) {
                alt47=6;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 47, 1, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt47=2;
            }
            break;
        case STRING:
            {
            alt47=3;
            }
            break;
        case NUMBER:
            {
            alt47=4;
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            alt47=5;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("134:265: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 47, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;
        }

        } finally {dbg.exitDecision(47);}

        switch (alt47) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:266: function
                {
                dbg.location(134,266);
                pushFollow(FOLLOW_function_in_synpred881034);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:275: HEXNUMBER
                {
                dbg.location(134,275);
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred881036); if (failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:285: STRING
                {
                dbg.location(134,285);
                match(input,STRING,FOLLOW_STRING_in_synpred881038); if (failed) return ;

                }
                break;
            case 4 :
                dbg.enterAlt(4);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:292: NUMBER
                {
                dbg.location(134,292);
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred881040); if (failed) return ;

                }
                break;
            case 5 :
                dbg.enterAlt(5);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:299: variable
                {
                dbg.location(134,299);
                pushFollow(FOLLOW_variable_in_synpred881042);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                dbg.enterAlt(6);

                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gcl.g:134:308: WORD
                {
                dbg.location(134,308);
                match(input,WORD,FOLLOW_WORD_in_synpred881044); if (failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(47);}


        }
    }
    // $ANTLR end synpred88

    public final boolean synpred33() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
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
    public final boolean synpred32() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
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
    public final boolean synpred2() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
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
    public final boolean synpred21() {
        backtracking++;
        dbg.beginBacktrack(backtracking);
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_method_in_classes199 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_field_in_classes204 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_innerclass_in_classes209 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_36_in_classes214 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_statement_in_code235 = new BitSet(new long[]{0x0000740018200402L,0x00000000000023BCL});
    public static final BitSet FOLLOW_bstatement_in_statement261 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement266 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement271 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement276 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement281 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement286 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement291 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement296 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement301 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement306 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement311 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement316 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement321 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement326 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement331 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement336 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement341 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_field360 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_38_in_field364 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_field371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varstatement_in_field379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_method403 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_38_in_method406 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method419 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method425 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_method430 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_method436 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_method442 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method451 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_innerclass471 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_innerclass473 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_innerclass475 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_field_in_innerclass482 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_method_in_innerclass484 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_set_in_innerclass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement508 = new BitSet(new long[]{0x00007C0018200C00L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_bstatement517 = new BitSet(new long[]{0x00007C0018200C00L,0x00000000000023BCL});
    public static final BitSet FOLLOW_set_in_bstatement522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_varstatement550 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement555 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement561 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_varstatement567 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement572 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement578 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_44_in_returnstatement600 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_returnstatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exitstatement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ifstatement642 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_ifstatement646 = new BitSet(new long[]{0x0000F40018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_47_in_ifstatement649 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_ifstatement656 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement662 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_elsestatement682 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_49_in_elsestatement685 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_elsestatement689 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_elsestatement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression726 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_expression731 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_notexpression_in_expression736 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_aexpression_in_expression743 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_andexpression_in_expression753 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_expression758 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_expression763 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_expression770 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_notexpression789 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_notexpression797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression814 = new BitSet(new long[]{0x000C00001FA00102L});
    public static final BitSet FOLLOW_expression_in_aexpression841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression884 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_pexpression888 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression975 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression980 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression985 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression990 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression995 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1000 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1005 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExpression1013 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_relationalExpression1034 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1036 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1038 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1040 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1042 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1044 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_repeatstatement1065 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1069 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_repeatstatement1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_breakstatement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_continuestatement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_dostatement1124 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_dostatement1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_dostatement1130 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_dostatement1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_whilestatement1149 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_whilestatement1153 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_whilestatement1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_forstatement1174 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1176 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1180 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_forstatement1184 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement1186 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1190 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1192 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_switchstatement1211 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1214 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1217 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_switchstatement1220 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_switchstatement1228 = new BitSet(new long[]{0x0000740018200C00L,0x0000000000002FBCL});
    public static final BitSet FOLLOW_statement_in_switchstatement1231 = new BitSet(new long[]{0x0000740018200C00L,0x0000000000002FBCL});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_withstatement1253 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_withstatement1258 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_withstatement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1282 = new BitSet(new long[]{0x0000000000001000L,0x00000000001FC002L});
    public static final BitSet FOLLOW_set_in_assignment1286 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_assignment1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1358 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1360 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1365 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function1371 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1377 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21404 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21406 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21411 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function21416 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21422 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_array1461 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_array1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred21341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred32482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred33484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred38555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred39572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred42662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred46743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred49753 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_synpred49758 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred49763 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_synpred49770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred62841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred73995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred871042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred881013 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_synpred881034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred881036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred881038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred881040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred881042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred881044 = new BitSet(new long[]{0x0000000000000002L});

}