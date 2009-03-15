// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g 2009-03-14 19:46:51

package org.dolphin.parser;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class gscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "JAVACODE", "WORD", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "STUPIDDECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'globalvar'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'div'", "'%'", "'mod'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'~'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'<>'", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&='", "'^='", "'.'", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int GTE=16;
    public static final int STUPIDDECIMAL=26;
    public static final int NUMBER=22;
    public static final int WHITESPACE=30;
    public static final int EQUALS=12;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int LBRAC=10;
    public static final int LPAREN=8;
    public static final int WORD=21;
    public static final int ML_COMMENT=32;
    public static final int RPAREN=9;
    public static final int DECIMAL=25;
    public static final int RBRAC=11;
    public static final int GT=15;
    public static final int STRING_DOUBLE=33;
    public static final int GLOBALVAR=28;
    public static final int PLUS=4;
    public static final int STRING_SINGLE=34;
    public static final int DIGIT=29;
    public static final int DIV=7;
    public static final int COMMENT=31;
    public static final int OIVAR=27;
    public static final int JAVACODE=20;
    public static final int STRING=24;
    public static final int HEXNUMBER=23;

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[172+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g"; }

    
    public org.dolphin.parser.PlatformCore pc = new org.dolphin.parser.PlatformCore();
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    
    public void emitErrorMessage(String msg) {
            pc.showError(msg);
    	}
    



    // $ANTLR start classes
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:55:1: classes : ( (f= method | m= field ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:1: ( ( (f= method | m= field ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:3: ( (f= method | m= field ) ( ';' )* )*
            {
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:24: ( (f= method | m= field ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=36 && LA3_0<=40)||LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 39:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_29 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 29, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	                {
            	                int LA1_30 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 30, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
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
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 31, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 38:
            	            case 44:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 8, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 39:
            	                {
            	                int LA1_34 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 34, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 38:
            	            case 44:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
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
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 36, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 9, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 38:
            	        case 44:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_11 = input.LA(3);

            	            if ( (LA1_11==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_11==WORD||(LA1_11>=OIVAR && LA1_11<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 11, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 1, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 37:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 39:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_40 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	                {
            	                int LA1_41 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 41, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_42 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 42, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 38:
            	            case 44:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 13, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 39:
            	                {
            	                int LA1_45 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 45, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 38:
            	            case 44:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_47 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 47, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 14, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 38:
            	        case 44:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_16 = input.LA(3);

            	            if ( (LA1_16==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_16==WORD||(LA1_16>=OIVAR && LA1_16<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 16, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 2, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 39:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 39:
            	                {
            	                int LA1_51 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 51, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 38:
            	            case 44:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_53 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 18, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 39:
            	            {
            	            int LA1_19 = input.LA(3);

            	            if ( (LA1_19==WORD) ) {
            	                int LA1_55 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 55, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_19==38||LA1_19==44) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 19, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_20 = input.LA(3);

            	            if ( (LA1_20==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_20==WORD||(LA1_20>=OIVAR && LA1_20<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 20, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 38:
            	        case 44:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 3, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 40:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 39:
            	            {
            	            int LA1_23 = input.LA(3);

            	            if ( (LA1_23==WORD) ) {
            	                int LA1_60 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_23==38||LA1_23==44) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 23, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 38:
            	        case 44:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_25 = input.LA(3);

            	            if ( (LA1_25==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_25==WORD||(LA1_25>=OIVAR && LA1_25<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 25, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_5 = input.LA(2);

            	        if ( (LA1_5==LPAREN) ) {
            	            alt1=1;
            	        }
            	        else if ( (LA1_5==WORD||(LA1_5>=OIVAR && LA1_5<=GLOBALVAR)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 5, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 38:
            	    case 44:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("56:25: (f= method | m= field )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: f= method
            	            {
            	            pushFollow(FOLLOW_method_in_classes196);
            	            f=method();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:71: m= field
            	            {
            	            pushFollow(FOLLOW_field_in_classes201);
            	            m=field();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:116: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==35) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:117: ';'
            	    	    {
            	    	    match(input,35,FOLLOW_35_in_classes206); if (failed) return ;
            	    	    if ( backtracking==0 ) {
            	    	      System.out.println(";");
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, classes_StartIndex); }
        }
        return ;
    }
    // $ANTLR end classes


    // $ANTLR start code
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:59:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
               pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:25: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:26: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:26: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||(LA4_0>=JAVACODE && LA4_0<=WORD)||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==35||LA4_0==38||LA4_0==42||(LA4_0>=44 && LA4_0<=47)||(LA4_0>=70 && LA4_0<=73)||(LA4_0>=75 && LA4_0<=77)||LA4_0==81) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:27: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code227);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return ;
            	    if ( backtracking==0 ) {
            	      pc.returncode += "\n " + s;
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
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
        return ;
    }
    // $ANTLR end code


    // $ANTLR start statement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:63:1: statement returns [String value] : (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* ;
    public final String statement() throws RecognitionException {
        String value = null;
        int statement_StartIndex = input.index();
        String java = null;

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


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:1: ( (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:3: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )
            int alt5=18;
            switch ( input.LA(1) ) {
            case JAVACODE:
                {
                alt5=1;
                }
                break;
            case LBRAC:
            case 42:
                {
                alt5=2;
                }
                break;
            case 38:
            case 44:
                {
                alt5=3;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case EQUALS:
                case 68:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                    {
                    alt5=16;
                    }
                    break;
                case LPAREN:
                    {
                    alt5=17;
                    }
                    break;
                case WORD:
                case OIVAR:
                case GLOBALVAR:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 4, input);

                    throw nvae;
                }

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
            case 47:
                {
                alt5=6;
                }
                break;
            case 70:
                {
                alt5=7;
                }
                break;
            case 73:
                {
                alt5=8;
                }
                break;
            case 75:
                {
                alt5=9;
                }
                break;
            case 72:
                {
                alt5=10;
                }
                break;
            case 71:
                {
                alt5=11;
                }
                break;
            case 76:
                {
                alt5=12;
                }
                break;
            case 77:
                {
                alt5=13;
                }
                break;
            case 81:
                {
                alt5=14;
                }
                break;
            case OIVAR:
                {
                int LA5_17 = input.LA(2);

                if ( (LA5_17==LPAREN) ) {
                    alt5=15;
                }
                else if ( (LA5_17==EQUALS||LA5_17==68||(LA5_17>=82 && LA5_17<=90)) ) {
                    alt5=16;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 17, input);

                    throw nvae;
                }
                }
                break;
            case GLOBALVAR:
                {
                alt5=16;
                }
                break;
            case 35:
                {
                alt5=18;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:20: java= javacode
                    {
                    pushFollow(FOLLOW_javacode_in_statement252);
                    java=javacode();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += java;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:58: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement257);
                    b=bstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += b;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:92: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement262);
                    v=varstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += v.value+";";
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:132: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement267);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += r;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:171: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement272);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += e;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:208: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement277);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ifs;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:247: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement282);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += rep;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:290: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement287);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += dos;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:329: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement292);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wh;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:369: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement297);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += con+";";
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:418: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement302);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += br+";";
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:462: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement307);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fors;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:504: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement312);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += sw;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:545: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement317);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wit;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:586: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement322);
                    fun2=function2();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun2+";";
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:629: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement327);
                    ass=assignment();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ass;
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:667: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement332);
                    fun=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun+";";
                    }

                    }
                    break;
                case 18 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:707: ';'
                    {
                    match(input,35,FOLLOW_35_in_statement335); if (failed) return value;
                    if ( backtracking==0 ) {
                      value +=";";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:727: ( ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ';'
            	    {
            	    match(input,35,FOLLOW_35_in_statement340); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, statement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end statement


    // $ANTLR start javacode
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:66:1: javacode returns [String value] : jcode= JAVACODE ;
    public final String javacode() throws RecognitionException {
        String value = null;
        int javacode_StartIndex = input.index();
        Token jcode=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:67:1: (jcode= JAVACODE )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:67:3: jcode= JAVACODE
            {
            jcode=(Token)input.LT(1);
            match(input,JAVACODE,FOLLOW_JAVACODE_in_javacode358); if (failed) return value;
            if ( backtracking==0 ) {
              value =jcode.getText().replaceAll("@@java_Begin", "{").replaceAll("@@java_End", "}");;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, javacode_StartIndex); }
        }
        return value;
    }
    // $ANTLR end javacode


    // $ANTLR start field
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:70:1: field returns [String value] : ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:1: ( ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:3: ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:3: ( 'public' | ( 'private' | 'var' ) )?
            int alt7=3;
            switch ( input.LA(1) ) {
                case 36:
                    {
                    alt7=1;
                    }
                    break;
                case 38:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==WORD) ) {
                        int LA7_8 = input.LA(3);

                        if ( (LA7_8==WORD) ) {
                            int LA7_23 = input.LA(4);

                            if ( (synpred25()) ) {
                                alt7=2;
                            }
                        }
                        else if ( ((LA7_8>=OIVAR && LA7_8<=GLOBALVAR)) ) {
                            alt7=2;
                        }
                    }
                    else if ( ((LA7_2>=38 && LA7_2<=40)||LA7_2==44) ) {
                        alt7=2;
                    }
                    }
                    break;
                case 37:
                    {
                    alt7=2;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:4: 'public'
                    {
                    match(input,36,FOLLOW_36_in_field376); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( 'private' | 'var' )
                    {
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field380);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:76: ( 'final' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred26()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:77: 'final'
                    {
                    match(input,39,FOLLOW_39_in_field391); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:108: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:109: 'static'
                    {
                    match(input,40,FOLLOW_40_in_field397); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:142: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:143: 'final'
                    {
                    match(input,39,FOLLOW_39_in_field403); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:174: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:175: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field411);
            v=varstatement();
            _fsp--;
            if (failed) return value;

            }

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
            if ( backtracking>0 ) { memoize(input, 5, field_StartIndex); }
        }
        return value;
    }
    // $ANTLR end field


    // $ANTLR start method
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:74:1: method returns [String value] : ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token name=null;
        Token e=null;
        String b = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:1: ( ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:3: ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:3: ( 'public' | 'private' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:4: 'public'
                    {
                    match(input,36,FOLLOW_36_in_method433); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:33: 'private'
                    {
                    match(input,37,FOLLOW_37_in_method436); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:66: ( 'final' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred31()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: 'final'
                    {
                    match(input,39,FOLLOW_39_in_method442); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:98: ( 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:99: 'static'
                    {
                    match(input,40,FOLLOW_40_in_method448); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:132: ( 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:133: 'final'
                    {
                    match(input,39,FOLLOW_39_in_method454); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method461); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_method463); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:178: (e= WORD ( ( ',' ) (e= WORD )? )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:179: e= WORD ( ( ',' ) (e= WORD )? )*
                    {
                    e=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_method468); if (failed) return value;
                    if ( backtracking==0 ) {
                      s = e.getText();
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:201: ( ( ',' ) (e= WORD )? )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==41) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:202: ( ',' ) (e= WORD )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:202: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:203: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_method474); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:208: (e= WORD )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==WORD) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:209: e= WORD
                    	            {
                    	            e=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_method480); if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              s += ", "+e.getText();
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_method489); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method493);
            b=bstatement();
            _fsp--;
            if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 6, method_StartIndex); }
        }
        return value;
    }
    // $ANTLR end method


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:79:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:80:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:80:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            if ( backtracking==0 ) {
              value = "";
            }
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement511);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:80:34: (s= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LBRAC||(LA18_0>=JAVACODE && LA18_0<=WORD)||(LA18_0>=OIVAR && LA18_0<=GLOBALVAR)||LA18_0==35||LA18_0==38||LA18_0==42||(LA18_0>=44 && LA18_0<=47)||(LA18_0>=70 && LA18_0<=73)||(LA18_0>=75 && LA18_0<=77)||LA18_0==81) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:80:35: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement520);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=s+"\n";
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement525);    throw mse;
            }

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
        return value;
    }
    // $ANTLR end bstatement

    public static class varstatement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start varstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:83:1: varstatement returns [String value] : (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable ) ( ',' (varii= variable ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        Token w=null;
        variable_return vari = null;

        variable_return varii = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:1: ( (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable ) ( ',' (varii= variable ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:3: (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable ) ( ',' (varii= variable ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:3: (w= 'var' | w= WORD | w= 'globalvar' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case WORD:
                {
                alt19=2;
                }
                break;
            case 44:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("84:3: (w= 'var' | w= WORD | w= 'globalvar' )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:4: w= 'var'
                    {
                    w=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_varstatement552); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:12: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_varstatement556); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:19: w= 'globalvar'
                    {
                    w=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_varstatement560); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:34: (vari= variable )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:35: vari= variable
            {
            pushFollow(FOLLOW_variable_in_varstatement566);
            vari=variable();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) {
              s = ""+vari.value;
            }

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:72: ( ',' (varii= variable ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:73: ',' (varii= variable )
            	    {
            	    match(input,41,FOLLOW_41_in_varstatement572); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:77: (varii= variable )
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:78: varii= variable
            	    {
            	    pushFollow(FOLLOW_variable_in_varstatement577);
            	    varii=variable();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      s += ", "+varii.value;
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( backtracking==0 ) {
              retval.value =pc.varstatement(w.getText(),s);
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
        return retval;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:87:1: returnstatement returns [String value] : 'return' (e= expression )? ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:1: ( 'return' (e= expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:3: 'return' (e= expression )?
            {
            match(input,45,FOLLOW_45_in_returnstatement600); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:12: (e= expression )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case MINUS:
                    {
                    int LA21_1 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case PLUS:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case WORD:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA21_6 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA21_7 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA21_8 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA21_9 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case STUPIDDECIMAL:
                    {
                    int LA21_10 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case LPAREN:
                    {
                    int LA21_11 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 51:
                case 52:
                    {
                    int LA21_12 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA21_30 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_returnstatement605);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e;
                    }

                    }
                    break;

            }

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
        return value;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:91:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:92:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:92:2: 'exit'
            {
            match(input,46,FOLLOW_46_in_exitstatement622); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.exitstatement();
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
        return value;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:95:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        String e = null;

        String s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:4: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            match(input,47,FOLLOW_47_in_ifstatement640); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement644);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:36: ( 'then' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:37: 'then'
                    {
                    match(input,48,FOLLOW_48_in_ifstatement647); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:46: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:47: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement654);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:60: (el= elsestatement )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    int LA23_22 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==50) ) {
                    int LA23_23 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:61: el= elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement660);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.ifstatement(e,s,value);
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
        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:99:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        String e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            if ( backtracking==0 ) {
              value ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:17: ( 'else' | ( 'elsif' e= expression ) )
            int alt24=2;
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
                    new NoViableAltException("100:17: ( 'else' | ( 'elsif' e= expression ) )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:18: 'else'
                    {
                    match(input,49,FOLLOW_49_in_elsestatement682); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:25: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:25: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:26: 'elsif' e= expression
                    {
                    match(input,50,FOLLOW_50_in_elsestatement685); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement689);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =" else if "+e;
                    }

                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:81: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:82: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement698);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value +=" "+s;
            }

            }

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
        return value;
    }
    // $ANTLR end elsestatement


    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:104:1: expression returns [String value] : (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
    public final String expression() throws RecognitionException {
        String value = null;
        int expression_StartIndex = input.index();
        String neg = null;

        String r = null;

        String p = null;

        String n = null;

        String aa = null;

        String an = null;

        String orr = null;

        String x = null;

        String e = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:1: ( (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )
            int alt25=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred47()) ) {
                    alt25=1;
                }
                else if ( (synpred48()) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt25=1;
                }
                break;
            case PLUS:
                {
                int LA25_3 = input.LA(2);

                if ( (synpred47()) ) {
                    alt25=1;
                }
                else if ( (synpred48()) ) {
                    alt25=2;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
            case NUMBER:
            case HEXNUMBER:
            case STRING:
            case DECIMAL:
            case STUPIDDECIMAL:
            case OIVAR:
            case GLOBALVAR:
                {
                alt25=2;
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case MINUS:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA25_49 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        int LA25_50 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 50, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA25_51 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA25_52 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA25_53 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA25_54 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA25_55 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA25_56 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA25_57 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA25_58 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA25_59 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA25_60 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 60, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 37, input);

                        throw nvae;
                    }

                    }
                    break;
                case 61:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA25_61 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 61, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA25_62 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 62, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA25_63 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA25_64 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 64, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA25_65 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA25_66 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 66, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA25_67 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 67, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA25_68 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 68, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA25_69 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 69, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA25_70 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 70, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA25_71 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 71, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA25_72 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 72, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 38, input);

                        throw nvae;
                    }

                    }
                    break;
                case PLUS:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA25_73 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 73, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA25_74 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 74, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        int LA25_75 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 75, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA25_76 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 76, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA25_77 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 77, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA25_78 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 78, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA25_79 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 79, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA25_80 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 80, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA25_81 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 81, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA25_82 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 82, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA25_83 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 83, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA25_84 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 84, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 39, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA25_85 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 85, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 90:
                        {
                        int LA25_86 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 86, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA25_87 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 87, input);

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
                    case 52:
                    case 68:
                    case 69:
                        {
                        int LA25_88 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 88, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_89 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 89, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_90 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 90, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_91 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 91, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_92 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_93 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 93, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_94 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 94, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 40, input);

                        throw nvae;
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
                    case 68:
                    case 69:
                        {
                        int LA25_95 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 95, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_96 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 96, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_97 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 97, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_98 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 98, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_99 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 99, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_100 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 100, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_101 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 101, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 41, input);

                        throw nvae;
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
                    case 68:
                    case 69:
                        {
                        int LA25_102 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 102, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_103 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 103, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_104 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 104, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_105 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 105, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_106 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 106, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_107 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 107, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_108 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 108, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 42, input);

                        throw nvae;
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
                    case 68:
                    case 69:
                        {
                        int LA25_109 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 109, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_110 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 110, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_111 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 111, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_112 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 112, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_113 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 113, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_114 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 114, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_115 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 115, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 43, input);

                        throw nvae;
                    }

                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 90:
                        {
                        int LA25_116 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 116, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA25_117 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 117, input);

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
                    case 52:
                    case 68:
                    case 69:
                        {
                        int LA25_118 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 118, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_119 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 119, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_120 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 120, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_121 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 121, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_122 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 122, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_123 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 123, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_124 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 124, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 44, input);

                        throw nvae;
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
                    case 68:
                    case 69:
                        {
                        int LA25_125 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 125, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_126 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 126, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_127 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 127, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_128 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 128, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_129 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 129, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_130 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 130, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_131 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 131, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 45, input);

                        throw nvae;
                    }

                    }
                    break;
                case STUPIDDECIMAL:
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
                    case 68:
                    case 69:
                        {
                        int LA25_132 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 132, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 53:
                    case 54:
                    case 55:
                        {
                        int LA25_133 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 133, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA25_134 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 134, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA25_135 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 135, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA25_136 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 136, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA25_137 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 137, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA25_138 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 138, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 46, input);

                        throw nvae;
                    }

                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA25_139 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 139, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA25_140 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 140, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA25_141 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 141, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA25_142 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 142, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA25_143 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 143, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA25_144 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 144, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA25_145 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 145, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA25_146 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 146, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA25_147 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 147, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA25_148 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 148, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA25_149 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 149, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA25_150 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 150, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 47, input);

                        throw nvae;
                    }

                    }
                    break;
                case 51:
                case 52:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA25_151 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 151, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA25_152 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 152, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA25_153 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 153, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA25_154 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 154, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA25_155 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 155, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA25_156 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 156, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA25_157 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 157, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA25_158 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 158, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA25_159 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 159, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA25_160 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 160, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA25_161 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 161, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA25_162 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt25=2;
                        }
                        else if ( (synpred49()) ) {
                            alt25=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 162, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 48, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 11, input);

                    throw nvae;
                }

                }
                break;
            case 51:
            case 52:
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("105:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:5: neg= negate
                    {
                    pushFollow(FOLLOW_negate_in_expression726);
                    neg=negate();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = neg;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression731);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =r;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:80: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression736);
                    p=pexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =p;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:113: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression741);
                    n=notexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:149: (aa= aexpression | aa= bexpression )*
            loop26:
            do {
                int alt26=3;
                switch ( input.LA(1) ) {
                case MINUS:
                    {
                    int LA26_28 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case PLUS:
                    {
                    int LA26_30 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case MULT:
                case DIV:
                case 53:
                case 54:
                case 55:
                    {
                    int LA26_42 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                    {
                    int LA26_43 = input.LA(2);

                    if ( (synpred51()) ) {
                        alt26=2;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:150: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression748);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value = aa.replaceAll("GJAVA_VALUE",value);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:219: aa= bexpression
            	    {
            	    pushFollow(FOLLOW_bexpression_in_expression754);
            	    aa=bexpression();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value = "(((Integer)"+ value+")"+ aa+").doubleValue()";
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:301: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case 62:
                case 63:
                    {
                    int LA28_39 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA28_40 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 66:
                case 67:
                    {
                    int LA28_41 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt28=1;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:302: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:302: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt27=3;
            	    switch ( input.LA(1) ) {
            	    case 62:
            	    case 63:
            	        {
            	        alt27=1;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt27=2;
            	        }
            	        break;
            	    case 66:
            	    case 67:
            	        {
            	        alt27=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("105:302: (an= andexpression | orr= orexpression | x= xorexpression )", 27, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:303: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression763);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:345: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression768);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:388: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression773);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:429: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:430: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression780);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=" ((Boolean)"+e+")";
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.expression(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, expression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:108:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:109:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:109:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression799);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression807);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.notexpression(e);
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
        return value;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:113:1: aexpression returns [String value] : a= ( '+' | '-' | '*' | '/' | 'div' | '%' | 'mod' ) (e= expression ) ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:114:1: (a= ( '+' | '-' | '*' | '/' | 'div' | '%' | 'mod' ) (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:114:3: a= ( '+' | '-' | '*' | '/' | 'div' | '%' | 'mod' ) (e= expression )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||(input.LA(1)>=53 && input.LA(1)<=55) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression825);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:114:39: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:114:40: e= expression
            {
            pushFollow(FOLLOW_expression_in_aexpression844);
            e=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.aexpression(a.getText(),e);
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
        return value;
    }
    // $ANTLR end aexpression


    // $ANTLR start bexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:117:1: bexpression returns [String value] : a= ( '|' | '&' | '^' | '<<' | '>>' ) (e= expression ) ;
    public final String bexpression() throws RecognitionException {
        String value = null;
        int bexpression_StartIndex = input.index();
        Token a=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:1: (a= ( '|' | '&' | '^' | '<<' | '>>' ) (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:3: a= ( '|' | '&' | '^' | '<<' | '>>' ) (e= expression )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=56 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bexpression863);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:29: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:30: e= expression
            {
            pushFollow(FOLLOW_expression_in_bexpression878);
            e=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.aexpression(a.getText(),e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, bexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end bexpression


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt29=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt29=1;
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
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt29=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("121:34: ( NUMBER | HEXNUMBER | STRING | variable )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value898); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value900); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value902); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value904);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

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
            if ( backtracking>0 ) { memoize(input, 17, value_StartIndex); }
        }
        return value;
    }
    // $ANTLR end value


    // $ANTLR start negate
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:1: negate returns [String value] : ( '-' | '~' | '+' ) e= expression ;
    public final String negate() throws RecognitionException {
        String value = null;
        int negate_StartIndex = input.index();
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:31: ( ( '-' | '~' | '+' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:33: ( '-' | '~' | '+' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:33: ( '-' | '~' | '+' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                alt30=1;
                }
                break;
            case 61:
                {
                alt30=2;
                }
                break;
            case PLUS:
                {
                alt30=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("124:33: ( '-' | '~' | '+' )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:34: '-'
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_negate921); if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="-";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:51: '~'
                    {
                    match(input,61,FOLLOW_61_in_negate924); if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="~";
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:124:68: '+'
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_negate927); if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="+";
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_negate933);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = value+"((Double)"+e+")";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, negate_StartIndex); }
        }
        return value;
    }
    // $ANTLR end negate


    // $ANTLR start pexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:128:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression950); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression954);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression956); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.pexpression(e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, pexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:132:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:133:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:133:3: a= ( '&&' | 'and' )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression973);    throw mse;
            }

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
            if ( backtracking>0 ) { memoize(input, 20, andexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:136:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:137:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:137:3: o= ( '||' | 'or' )
            {
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression994);    throw mse;
            }

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
            if ( backtracking>0 ) { memoize(input, 21, orexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:140:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:141:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:141:3: x= ( '^^' | 'xor' )
            {
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=66 && input.LA(1)<=67) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression1015);    throw mse;
            }

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
            if ( backtracking>0 ) { memoize(input, 22, xorexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )? ;
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

        String p = null;

        String exp = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:145:3: ( (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )?
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )
            int alt32=10;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAREN) ) {
                    alt32=1;
                }
                else if ( (synpred80()) ) {
                    alt32=6;
                }
                else if ( (synpred85()) ) {
                    alt32=9;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 32, 1, input);

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
            case PLUS:
            case MINUS:
                {
                int LA32_4 = input.LA(2);

                if ( (LA32_4==NUMBER) ) {
                    alt32=4;
                }
                else if ( (LA32_4==DECIMAL) ) {
                    alt32=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 32, 4, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
                {
                alt32=5;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt32=6;
                }
                break;
            case DECIMAL:
                {
                alt32=7;
                }
                break;
            case STUPIDDECIMAL:
                {
                alt32=8;
                }
                break;
            case LPAREN:
                {
                alt32=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:4: f= function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression1046);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:35: h= HEXNUMBER
                    {
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1051); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(h.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:81: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression1057); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:156: ( '-' | '+' ) n= NUMBER
                    {
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1060);    throw mse;
                    }

                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1068); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:206: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1074); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression1079);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:276: ( '-' | '+' )? d= DECIMAL
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:276: ( '-' | '+' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=PLUS && LA31_0<=MINUS)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return value;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1082);    throw mse;
                            }


                            }
                            break;

                    }

                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1091); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval(d.getText());
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:330: d= STUPIDDECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1096); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval("0"+d.getText());
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1101); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:409: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_relationalExpression1106);
                    p=pexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = p;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:444: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA34_49 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA34_50 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA34_51 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA34_52 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA34_53 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA34_54 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA34_55 = input.LA(3);

                        if ( (synpred103()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        switch ( input.LA(3) ) {
                            case NUMBER:
                                {
                                int LA34_401 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case MINUS:
                                {
                                int LA34_402 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA34_403 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA34_404 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_405 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA34_406 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA34_407 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_408 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA34_409 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA34_410 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA34_411 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 51:
                            case 52:
                                {
                                int LA34_412 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case 61:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA34_413 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA34_414 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA34_415 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_416 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA34_417 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA34_418 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA34_419 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_420 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA34_421 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA34_422 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA34_423 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 51:
                            case 52:
                                {
                                int LA34_424 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case PLUS:
                        {
                        switch ( input.LA(3) ) {
                            case NUMBER:
                                {
                                int LA34_425 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA34_426 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case MINUS:
                                {
                                int LA34_427 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA34_428 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA34_429 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_430 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA34_431 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA34_432 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_433 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA34_434 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA34_435 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 51:
                            case 52:
                                {
                                int LA34_436 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case LPAREN:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA34_437 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA34_438 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA34_439 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_440 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA34_441 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA34_442 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA34_443 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_444 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA34_445 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA34_446 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA34_447 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 51:
                            case 52:
                                {
                                int LA34_448 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
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
                            case MINUS:
                                {
                                int LA34_449 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA34_450 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA34_451 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_452 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA34_453 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA34_454 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA34_455 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_456 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA34_457 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA34_458 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA34_459 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case 51:
                            case 52:
                                {
                                int LA34_460 = input.LA(4);

                                if ( (synpred103()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                }

            }
            else if ( ((LA34_0>=EQUALS && LA34_0<=LTE)||(LA34_0>=68 && LA34_0<=69)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    {
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||(input.LA(1)>=68 && input.LA(1)<=69) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1114);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    int alt33=9;
                    switch ( input.LA(1) ) {
                    case WORD:
                        {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==LPAREN) ) {
                            alt33=1;
                        }
                        else if ( (synpred99()) ) {
                            alt33=5;
                        }
                        else if ( (synpred102()) ) {
                            alt33=8;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA33_2 = input.LA(2);

                        if ( (synpred96()) ) {
                            alt33=2;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA33_3 = input.LA(2);

                        if ( (synpred97()) ) {
                            alt33=3;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA33_4 = input.LA(2);

                        if ( (synpred98()) ) {
                            alt33=4;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA33_5 = input.LA(2);

                        if ( (synpred99()) ) {
                            alt33=5;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA33_6 = input.LA(2);

                        if ( (synpred100()) ) {
                            alt33=6;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA33_7 = input.LA(2);

                        if ( (synpred101()) ) {
                            alt33=7;
                        }
                        else if ( (true) ) {
                            alt33=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case LPAREN:
                    case 51:
                    case 52:
                    case 61:
                        {
                        alt33=9;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:506: f= function
                            {
                            pushFollow(FOLLOW_function_in_relationalExpression1139);
                            f=function();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = f;
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: h= HEXNUMBER
                            {
                            h=(Token)input.LT(1);
                            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1144); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = h.getText();
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: s= STRING
                            {
                            s=(Token)input.LT(1);
                            match(input,STRING,FOLLOW_STRING_in_relationalExpression1149); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: n= NUMBER
                            {
                            n=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1154); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.intval(n.getText());
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_relationalExpression1159);
                            v=variable();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = v.value;
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: d= DECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1164); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double("+d.getText()+"))";
                            }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: d= STUPIDDECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1169); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double(0"+d.getText()+"))";
                            }

                            }
                            break;
                        case 8 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: w= WORD
                            {
                            w=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_relationalExpression1174); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = w.getText();
                            }

                            }
                            break;
                        case 9 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:804: exp= expression
                            {
                            pushFollow(FOLLOW_expression_in_relationalExpression1179);
                            exp=expression();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = exp;
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      value =pc.relationalExpression(value,op.getText(),a);
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, relationalExpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:149:1: repeatstatement returns [String value] : 'repeat' (e= expression )? (s= statement ) ( ';' )* ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        String e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:1: ( 'repeat' (e= expression )? (s= statement ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:3: 'repeat' (e= expression )? (s= statement ) ( ';' )*
            {
            match(input,70,FOLLOW_70_in_repeatstatement1202); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:12: (e= expression )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case PLUS:
                case MINUS:
                case LPAREN:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case STUPIDDECIMAL:
                case 51:
                case 52:
                case 61:
                    {
                    alt35=1;
                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_119 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_120 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_121 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_122 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_123 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_124 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_125 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_126 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_127 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_128 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_129 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_130 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 41:
                                    {
                                    int LA35_131 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA35_132 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_133 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_134 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_135 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_136 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_137 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_138 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_139 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_140 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_141 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_142 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_143 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_144 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA35_145 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_146 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_147 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_148 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_149 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_150 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_151 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_152 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA35_153 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_154 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_155 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_156 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_157 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case 35:
                        case 38:
                        case 42:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt35=1;
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA35_158 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_159 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_160 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA35_161 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA35_168 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA35_181 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    alt35=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA35_199 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_200 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA35_201 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    alt35=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA35_240 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA35_241 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    alt35=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA35_57 = input.LA(3);

                            if ( (LA35_57==WORD) ) {
                                int LA35_281 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_57>=OIVAR && LA35_57<=GLOBALVAR)) ) {
                                int LA35_282 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                    }

                    }
                    break;
                case OIVAR:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_283 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_284 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_285 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_286 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_287 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_288 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_289 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_290 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_291 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_292 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_293 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_294 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 41:
                                    {
                                    int LA35_295 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA35_296 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA35_62 = input.LA(3);

                            if ( (LA35_62==WORD) ) {
                                int LA35_297 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_62>=OIVAR && LA35_62<=GLOBALVAR)) ) {
                                int LA35_298 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_299 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_300 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_301 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_302 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_303 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_304 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_305 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA35_306 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_307 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_308 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_309 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_310 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case WORD:
                        case OIVAR:
                        case GLOBALVAR:
                        case 35:
                        case 38:
                        case 42:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    }
                    break;
                case GLOBALVAR:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_311 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_312 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_313 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_314 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_315 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_316 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_317 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_318 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_319 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_320 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_321 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_322 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 41:
                                    {
                                    int LA35_323 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA35_324 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA35_91 = input.LA(3);

                            if ( (LA35_91==WORD) ) {
                                int LA35_325 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_91>=OIVAR && LA35_91<=GLOBALVAR)) ) {
                                int LA35_326 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_327 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_328 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_329 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_330 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_331 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_332 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA35_333 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA35_334 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA35_335 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA35_336 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_337 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_338 = input.LA(4);

                                    if ( (synpred104()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case WORD:
                        case OIVAR:
                        case GLOBALVAR:
                        case 35:
                        case 38:
                        case 42:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_repeatstatement1207);
                    e=expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:28: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:29: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1214);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:42: ( ';' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    int LA36_1 = input.LA(2);

                    if ( (synpred105()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ';'
            	    {
            	    match(input,35,FOLLOW_35_in_repeatstatement1218); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.repeatstatement(e,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, repeatstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:153:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:154:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:154:3: 'break'
            {
            match(input,71,FOLLOW_71_in_breakstatement1236); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 25, breakstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:156:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:157:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:157:3: 'continue'
            {
            match(input,72,FOLLOW_72_in_continuestatement1251); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 26, continuestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:160:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        String s = null;

        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:161:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:161:3: 'do' s= statement 'until' e= expression
            {
            match(input,73,FOLLOW_73_in_dostatement1266); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1270);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,74,FOLLOW_74_in_dostatement1272); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1276);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.dostatement(s,e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, dostatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:164:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        String e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:3: 'while' e= expression (s= statement )
            {
            match(input,75,FOLLOW_75_in_whilestatement1291); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1295);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1300);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.whilestatement(e,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, whilestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:168:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        String s1 = null;

        String e = null;

        String s2 = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:1: ( 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:3: 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement
            {
            match(input,76,FOLLOW_76_in_forstatement1316); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1318); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1322);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1326);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:39: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==35) ) {
                    int LA37_20 = input.LA(3);

                    if ( (synpred106()) ) {
                        alt37=1;
                    }
                }
                else if ( (LA37_1==LBRAC||(LA37_1>=JAVACODE && LA37_1<=WORD)||(LA37_1>=OIVAR && LA37_1<=GLOBALVAR)||LA37_1==38||LA37_1==42||(LA37_1>=44 && LA37_1<=47)||(LA37_1>=70 && LA37_1<=73)||(LA37_1>=75 && LA37_1<=77)||LA37_1==81) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ';'
                    {
                    match(input,35,FOLLOW_35_in_forstatement1329); if (failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_in_forstatement1335);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1337); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1341);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.forstatement(s1,e,s2,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, forstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:172:1: switchstatement returns [String value] : 'switch' (ex= expression ) ( '{' | 'begin' ) ( ( 'case' ex2= expression | 'default' ) ':' (st= statement )* )* ( '}' | 'end' ) ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        String ex = null;

        String ex2 = null;

        String st = null;


        String statements="",casestatements="";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:1: ( 'switch' (ex= expression ) ( '{' | 'begin' ) ( ( 'case' ex2= expression | 'default' ) ':' (st= statement )* )* ( '}' | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:3: 'switch' (ex= expression ) ( '{' | 'begin' ) ( ( 'case' ex2= expression | 'default' ) ':' (st= statement )* )* ( '}' | 'end' )
            {
            match(input,77,FOLLOW_77_in_switchstatement1361); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:12: (ex= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:13: ex= expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1366);
            ex=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1369);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:42: ( ( 'case' ex2= expression | 'default' ) ':' (st= statement )* )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=78 && LA40_0<=79)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:43: ( 'case' ex2= expression | 'default' ) ':' (st= statement )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:43: ( 'case' ex2= expression | 'default' )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==78) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==79) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("173:43: ( 'case' ex2= expression | 'default' )", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:44: 'case' ex2= expression
            	            {
            	            match(input,78,FOLLOW_78_in_switchstatement1377); if (failed) return value;
            	            pushFollow(FOLLOW_expression_in_switchstatement1381);
            	            ex2=expression();
            	            _fsp--;
            	            if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value ="("+ex2+")";
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:94: 'default'
            	            {
            	            match(input,79,FOLLOW_79_in_switchstatement1384); if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value ="";
            	            }

            	            }
            	            break;

            	    }

            	    match(input,80,FOLLOW_80_in_switchstatement1389); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:122: (st= statement )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==LBRAC||(LA39_0>=JAVACODE && LA39_0<=WORD)||(LA39_0>=OIVAR && LA39_0<=GLOBALVAR)||LA39_0==35||LA39_0==38||LA39_0==42||(LA39_0>=44 && LA39_0<=47)||(LA39_0>=70 && LA39_0<=73)||(LA39_0>=75 && LA39_0<=77)||LA39_0==81) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:123: st= statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1394);
            	    	    st=statement();
            	    	    _fsp--;
            	    	    if (failed) return value;
            	    	    if ( backtracking==0 ) {
            	    	      statements+=st;
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    if ( backtracking==0 ) {
            	      casestatements+=pc.caseStatement(ex,value,statements);statements="";
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1403);    throw mse;
            }

            if ( backtracking==0 ) {
              value =pc.switchstatement(casestatements);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, switchstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:176:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        String e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:177:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:177:3: 'with' e= expression s= statement
            {
            match(input,81,FOLLOW_81_in_withstatement1423); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1428);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1433);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.withstatement(e,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, withstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:180:1: assignment returns [String value] : (valueee= array | valuee= variable ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        String valueee = null;

        variable_return valuee = null;

        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:1: ( (valueee= array | valuee= variable ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:4: (valueee= array | valuee= variable ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:4: (valueee= array | valuee= variable )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WORD||(LA41_0>=OIVAR && LA41_0<=GLOBALVAR)) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==90) ) {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA41_5 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA41_6 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                        {
                        int LA41_7 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA41_8 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA41_9 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA41_10 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA41_11 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA41_12 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA41_13 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA41_14 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA41_15 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 15, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA41_16 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 41:
                        {
                        int LA41_17 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 17, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 91:
                        {
                        int LA41_18 = input.LA(4);

                        if ( (synpred112()) ) {
                            alt41=1;
                        }
                        else if ( (true) ) {
                            alt41=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 18, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA41_1==EQUALS||LA41_1==68||(LA41_1>=82 && LA41_1<=89)) ) {
                    alt41=2;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("181:4: (valueee= array | valuee= variable )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:5: valueee= array
                    {
                    pushFollow(FOLLOW_array_in_assignment1452);
                    valueee=array();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =valueee;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:43: valuee= variable
                    {
                    pushFollow(FOLLOW_variable_in_assignment1457);
                    valuee=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =input.toString(valuee.start,valuee.stop);
                    }

                    }
                    break;

            }

            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==68||(input.LA(1)>=82 && input.LA(1)<=88) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1464);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1487);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.assignmentstatement(value,op.getText(),e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, assignment_StartIndex); }
        }
        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:184:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )* ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==WORD||(LA42_0>=OIVAR && LA42_0<=GLOBALVAR)) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==90) ) {
                    alt42=1;
                }
                else if ( (LA42_1==EOF||(LA42_1>=PLUS && LA42_1<=LTE)||(LA42_1>=JAVACODE && LA42_1<=GLOBALVAR)||(LA42_1>=35 && LA42_1<=89)||LA42_1==91) ) {
                    alt42=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("185:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("185:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:5: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1506);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = pc.variable(a);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:46: valuee= ( WORD | OIVAR | GLOBALVAR )
                    {
                    valuee=(Token)input.LT(1);
                    if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1511);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(valuee.getText());
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:115: ( '.' ( array | ( WORD ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==89) ) {
                    int LA44_55 = input.LA(2);

                    if ( (LA44_55==WORD) ) {
                        int LA44_56 = input.LA(3);

                        if ( (synpred125()) ) {
                            alt44=1;
                        }


                    }
                    else if ( ((LA44_55>=OIVAR && LA44_55<=GLOBALVAR)) ) {
                        int LA44_57 = input.LA(3);

                        if ( (LA44_57==90) ) {
                            int LA44_115 = input.LA(4);

                            if ( (synpred125()) ) {
                                alt44=1;
                            }


                        }


                    }


                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:116: '.' ( array | ( WORD ) )
            	    {
            	    match(input,89,FOLLOW_89_in_variable1523); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:120: ( array | ( WORD ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==WORD) ) {
            	        int LA43_1 = input.LA(2);

            	        if ( (LA43_1==90) ) {
            	            alt43=1;
            	        }
            	        else if ( (LA43_1==EOF||(LA43_1>=PLUS && LA43_1<=LTE)||(LA43_1>=JAVACODE && LA43_1<=GLOBALVAR)||(LA43_1>=35 && LA43_1<=89)||LA43_1==91) ) {
            	            alt43=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("185:120: ( array | ( WORD ) )", 43, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA43_0>=OIVAR && LA43_0<=GLOBALVAR)) ) {
            	        alt43=1;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("185:120: ( array | ( WORD ) )", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:121: array
            	            {
            	            pushFollow(FOLLOW_array_in_variable1526);
            	            array();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:127: ( WORD )
            	            {
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:127: ( WORD )
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:128: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_variable1529); if (failed) return retval;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )* ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )*
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1551); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1553); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=PLUS && LA47_0<=MINUS)||LA47_0==LPAREN||(LA47_0>=WORD && LA47_0<=GLOBALVAR)||(LA47_0>=51 && LA47_0<=52)||LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1558);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e;
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:49: ( ( ',' ) (e= expression )? )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==41) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:51: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_function1564); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:56: (e= expression )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( ((LA45_0>=PLUS && LA45_0<=MINUS)||LA45_0==LPAREN||(LA45_0>=WORD && LA45_0<=GLOBALVAR)||(LA45_0>=51 && LA45_0<=52)||LA45_0==61) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1570);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+e;
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function1579); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:106: ( '.' variable )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==89) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:107: '.' variable
            	    {
            	    match(input,89,FOLLOW_89_in_function1582); if (failed) return value;
            	    pushFollow(FOLLOW_variable_in_function1584);
            	    variable();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

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
            if ( backtracking>0 ) { memoize(input, 34, function_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:1: function2 returns [String value] : n= OIVAR '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:2: (n= OIVAR '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:4: n= OIVAR '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21605); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21607); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:16: ( (e= expression ) ( ( ',' ) (e= expression )? )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=PLUS && LA51_0<=MINUS)||LA51_0==LPAREN||(LA51_0>=WORD && LA51_0<=GLOBALVAR)||(LA51_0>=51 && LA51_0<=52)||LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:17: (e= expression ) ( ( ',' ) (e= expression )? )*
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:17: (e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:18: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_function21613);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e;
                    }

                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:54: ( ( ',' ) (e= expression )? )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==41) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:55: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:55: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:56: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_function21621); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:61: (e= expression )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( ((LA49_0>=PLUS && LA49_0<=MINUS)||LA49_0==LPAREN||(LA49_0>=WORD && LA49_0<=GLOBALVAR)||(LA49_0>=51 && LA49_0<=52)||LA49_0==61) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:62: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21627);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+e;
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21636); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 35, function2_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:197:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        String e = null;

        String e1 = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 36) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']'
            {
            valuee=(Token)input.LT(1);
            if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1655);    throw mse;
            }

            match(input,90,FOLLOW_90_in_array1663); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:39: (e= expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=PLUS && LA52_0<=MINUS)||LA52_0==LPAREN||(LA52_0>=WORD && LA52_0<=GLOBALVAR)||(LA52_0>=51 && LA52_0<=52)||LA52_0==61) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:40: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_array1668);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:73: ( ',' e1= expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:74: ',' e1= expression
                    {
                    match(input,41,FOLLOW_41_in_array1674); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_array1678);
                    e1=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e + ","+e1;
                    }

                    }
                    break;

            }

            match(input,91,FOLLOW_91_in_array1683); if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.array(valuee.getText(),value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 36, array_StartIndex); }
        }
        return value;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: method
        {
        pushFollow(FOLLOW_method_in_synpred1196);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ';'
        {
        match(input,35,FOLLOW_35_in_synpred22340); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( ( 'private' | 'var' ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( 'private' | 'var' )
        {
        if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred25380);    throw mse;
        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:77: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:77: 'final'
        {
        match(input,39,FOLLOW_39_in_synpred26391); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: 'final'
        {
        match(input,39,FOLLOW_39_in_synpred31442); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred43605);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:61: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:61: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred45660);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:5: ( negate )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:5: negate
        {
        pushFollow(FOLLOW_negate_in_synpred47726);
        negate();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: ( relationalExpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: relationalExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred48731);
        relationalExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:80: ( pexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:80: pexpression
        {
        pushFollow(FOLLOW_pexpression_in_synpred49736);
        pexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:150: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:150: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred50748);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:219: ( bexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:219: bexpression
        {
        pushFollow(FOLLOW_bexpression_in_synpred51754);
        bexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:302: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:302: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:302: ( andexpression | orexpression | xorexpression )
        int alt59=3;
        switch ( input.LA(1) ) {
        case 62:
        case 63:
            {
            alt59=1;
            }
            break;
        case 64:
        case 65:
            {
            alt59=2;
            }
            break;
        case 66:
        case 67:
            {
            alt59=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("105:302: ( andexpression | orexpression | xorexpression )", 59, 0, input);

            throw nvae;
        }

        switch (alt59) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:303: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred54763);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:345: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred54768);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:388: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred54773);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:429: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:430: expression
        {
        pushFollow(FOLLOW_expression_in_synpred54780);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: variable
        {
        pushFollow(FOLLOW_variable_in_synpred801079);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred851101); if (failed) return ;

        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: ( HEXNUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: HEXNUMBER
        {
        match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred961144); if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: ( STRING )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: STRING
        {
        match(input,STRING,FOLLOW_STRING_in_synpred971149); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: ( NUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: NUMBER
        {
        match(input,NUMBER,FOLLOW_NUMBER_in_synpred981154); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: variable
        {
        pushFollow(FOLLOW_variable_in_synpred991159);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: ( DECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: DECIMAL
        {
        match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred1001164); if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: ( STUPIDDECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: STUPIDDECIMAL
        {
        match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred1011169); if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred1021174); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||(input.LA(1)>=68 && input.LA(1)<=69) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred1031114);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        int alt61=9;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA61_1 = input.LA(2);

            if ( (LA61_1==LPAREN) ) {
                alt61=1;
            }
            else if ( (synpred99()) ) {
                alt61=5;
            }
            else if ( (synpred102()) ) {
                alt61=8;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            int LA61_2 = input.LA(2);

            if ( (synpred96()) ) {
                alt61=2;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 2, input);

                throw nvae;
            }
            }
            break;
        case STRING:
            {
            int LA61_3 = input.LA(2);

            if ( (synpred97()) ) {
                alt61=3;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 3, input);

                throw nvae;
            }
            }
            break;
        case NUMBER:
            {
            int LA61_4 = input.LA(2);

            if ( (synpred98()) ) {
                alt61=4;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 4, input);

                throw nvae;
            }
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            int LA61_5 = input.LA(2);

            if ( (synpred99()) ) {
                alt61=5;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 5, input);

                throw nvae;
            }
            }
            break;
        case DECIMAL:
            {
            int LA61_6 = input.LA(2);

            if ( (synpred100()) ) {
                alt61=6;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 6, input);

                throw nvae;
            }
            }
            break;
        case STUPIDDECIMAL:
            {
            int LA61_7 = input.LA(2);

            if ( (synpred101()) ) {
                alt61=7;
            }
            else if ( (true) ) {
                alt61=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 7, input);

                throw nvae;
            }
            }
            break;
        case PLUS:
        case MINUS:
        case LPAREN:
        case 51:
        case 52:
        case 61:
            {
            alt61=9;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 61, 0, input);

            throw nvae;
        }

        switch (alt61) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:506: function
                {
                pushFollow(FOLLOW_function_in_synpred1031139);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred1031144); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred1031149); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred1031154); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: variable
                {
                pushFollow(FOLLOW_variable_in_synpred1031159);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: DECIMAL
                {
                match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred1031164); if (failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: STUPIDDECIMAL
                {
                match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred1031169); if (failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred1031174); if (failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:804: expression
                {
                pushFollow(FOLLOW_expression_in_synpred1031179);
                expression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred1041207);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred105
    public final void synpred105_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ';'
        {
        match(input,35,FOLLOW_35_in_synpred1051218); if (failed) return ;

        }
    }
    // $ANTLR end synpred105

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ';'
        {
        match(input,35,FOLLOW_35_in_synpred1061329); if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred112
    public final void synpred112_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:5: ( array )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:5: array
        {
        pushFollow(FOLLOW_array_in_synpred1121452);
        array();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred112

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:116: ( '.' ( array | ( WORD ) ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:116: '.' ( array | ( WORD ) )
        {
        match(input,89,FOLLOW_89_in_synpred1251523); if (failed) return ;
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:120: ( array | ( WORD ) )
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( (LA64_0==WORD) ) {
            int LA64_1 = input.LA(2);

            if ( (LA64_1==90) ) {
                alt64=1;
            }
            else if ( (LA64_1==EOF) ) {
                alt64=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("185:120: ( array | ( WORD ) )", 64, 1, input);

                throw nvae;
            }
        }
        else if ( ((LA64_0>=OIVAR && LA64_0<=GLOBALVAR)) ) {
            alt64=1;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("185:120: ( array | ( WORD ) )", 64, 0, input);

            throw nvae;
        }
        switch (alt64) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:121: array
                {
                pushFollow(FOLLOW_array_in_synpred1251526);
                array();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:127: ( WORD )
                {
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:127: ( WORD )
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:128: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred1251529); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred125

    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred85() {
        backtracking++;
        int start = input.mark();
        try {
            synpred85_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred125() {
        backtracking++;
        int start = input.mark();
        try {
            synpred125_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred101() {
        backtracking++;
        int start = input.mark();
        try {
            synpred101_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred102() {
        backtracking++;
        int start = input.mark();
        try {
            synpred102_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred105() {
        backtracking++;
        int start = input.mark();
        try {
            synpred105_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred106() {
        backtracking++;
        int start = input.mark();
        try {
            synpred106_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred97() {
        backtracking++;
        int start = input.mark();
        try {
            synpred97_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred112() {
        backtracking++;
        int start = input.mark();
        try {
            synpred112_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_method_in_classes196 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_field_in_classes201 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_35_in_classes206 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_statement_in_code227 = new BitSet(new long[]{0x0000F44818300402L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_javacode_in_statement252 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_bstatement_in_statement257 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_varstatement_in_statement262 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement267 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement272 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement277 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement282 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_dostatement_in_statement287 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement292 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement297 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement302 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_forstatement_in_statement307 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement312 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_withstatement_in_statement317 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_function2_in_statement322 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_assignment_in_statement327 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_function_in_statement332 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement335 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement340 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_JAVACODE_in_javacode358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_field376 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_set_in_field380 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_39_in_field391 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_40_in_field397 = new BitSet(new long[]{0x000010C000200000L});
    public static final BitSet FOLLOW_39_in_field403 = new BitSet(new long[]{0x0000104000200000L});
    public static final BitSet FOLLOW_varstatement_in_field411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_method433 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_37_in_method436 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_39_in_method442 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_40_in_method448 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method461 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method463 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_WORD_in_method468 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_method474 = new BitSet(new long[]{0x0000020000200200L});
    public static final BitSet FOLLOW_WORD_in_method480 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method489 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement511 = new BitSet(new long[]{0x0000FC4818300C00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_bstatement520 = new BitSet(new long[]{0x0000FC4818300C00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_set_in_bstatement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_varstatement552 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_WORD_in_varstatement556 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_44_in_varstatement560 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement566 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_varstatement572 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement577 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement600 = new BitSet(new long[]{0x201800001FE00132L});
    public static final BitSet FOLLOW_expression_in_returnstatement605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement640 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_ifstatement644 = new BitSet(new long[]{0x0001F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_48_in_ifstatement647 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_ifstatement654 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement660 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement682 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_50_in_elsestatement685 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_elsestatement689 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_elsestatement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_expression726 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_relationalExpression_in_expression731 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_pexpression_in_expression736 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_notexpression_in_expression741 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_aexpression_in_expression748 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_bexpression_in_expression754 = new BitSet(new long[]{0xDFE00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_andexpression_in_expression763 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_orexpression_in_expression768 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_xorexpression_in_expression773 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_notexpression799 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_notexpression807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression825 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_aexpression844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bexpression863 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_bexpression878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negate921 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_61_in_negate924 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_PLUS_in_negate927 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_negate933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression950 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_pexpression954 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression1046 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1051 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1057 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1060 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1068 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1074 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1079 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1091 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1096 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1101 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_pexpression_in_relationalExpression1106 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1114 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_function_in_relationalExpression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_relationalExpression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_repeatstatement1202 = new BitSet(new long[]{0x2018F4481FF00530L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1207 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1214 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_repeatstatement1218 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_71_in_breakstatement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_continuestatement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_dostatement1266 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_dostatement1270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_dostatement1272 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_dostatement1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_whilestatement1291 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_whilestatement1295 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_whilestatement1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_forstatement1316 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1318 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1322 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_forstatement1326 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_35_in_forstatement1329 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1335 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1337 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_switchstatement1361 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_switchstatement1366 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_switchstatement1369 = new BitSet(new long[]{0x0000080000000800L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_switchstatement1377 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_switchstatement1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_switchstatement1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_switchstatement1389 = new BitSet(new long[]{0x0000FC4818300C00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_statement_in_switchstatement1394 = new BitSet(new long[]{0x0000FC4818300C00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_set_in_switchstatement1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_withstatement1423 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_withstatement1428 = new BitSet(new long[]{0x0000F44818300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_withstatement1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_assignment1452 = new BitSet(new long[]{0x0000000000001000L,0x0000000001FC0010L});
    public static final BitSet FOLLOW_variable_in_assignment1457 = new BitSet(new long[]{0x0000000000001000L,0x0000000001FC0010L});
    public static final BitSet FOLLOW_set_in_assignment1464 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_assignment1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1506 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_set_in_variable1511 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_variable1523 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_array_in_variable1526 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_variable1529 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_function1551 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1553 = new BitSet(new long[]{0x201800001FE00330L});
    public static final BitSet FOLLOW_expression_in_function1558 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_function1564 = new BitSet(new long[]{0x201802001FE00330L});
    public static final BitSet FOLLOW_expression_in_function1570 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1579 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_function1582 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_function1584 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_OIVAR_in_function21605 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21607 = new BitSet(new long[]{0x201800001FE00330L});
    public static final BitSet FOLLOW_expression_in_function21613 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_function21621 = new BitSet(new long[]{0x201802001FE00330L});
    public static final BitSet FOLLOW_expression_in_function21627 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_array1663 = new BitSet(new long[]{0x201802001FE00130L,0x0000000008000000L});
    public static final BitSet FOLLOW_expression_in_array1668 = new BitSet(new long[]{0x0000020000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_41_in_array1674 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_array1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_array1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred22340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred25380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred26391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred31442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred43605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred45660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_synpred47726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred48731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_synpred49736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred50748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bexpression_in_synpred51754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred54763 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_orexpression_in_synpred54768 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_xorexpression_in_synpred54773 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_expression_in_synpred54780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred801079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred851101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred961144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred971149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred981154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred991159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred1001164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred1011169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1021174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1031114 = new BitSet(new long[]{0x201800001FE00130L});
    public static final BitSet FOLLOW_function_in_synpred1031139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred1031144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred1031149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred1031154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred1031159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred1031164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred1031169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1031174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1031179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1041207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred1051218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred1061329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_synpred1121452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred1251523 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_array_in_synpred1251526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1251529 = new BitSet(new long[]{0x0000000000000002L});

}