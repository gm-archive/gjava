// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g 2009-06-19 13:30:32

package org.dolphin.parser;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class gscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "JAVACODE", "WORD", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "STUPIDDECIMAL", "GLOBALVAR", "DIGIT", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'globalvar'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'div'", "'%'", "'mod'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'~'", "'.'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'<>'", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&='", "'^='", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int GTE=16;
    public static final int STUPIDDECIMAL=26;
    public static final int NUMBER=22;
    public static final int WHITESPACE=29;
    public static final int EQUALS=12;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int LBRAC=10;
    public static final int LPAREN=8;
    public static final int WORD=21;
    public static final int ML_COMMENT=31;
    public static final int RPAREN=9;
    public static final int DECIMAL=25;
    public static final int RBRAC=11;
    public static final int GT=15;
    public static final int STRING_DOUBLE=32;
    public static final int GLOBALVAR=27;
    public static final int PLUS=4;
    public static final int STRING_SINGLE=33;
    public static final int DIGIT=28;
    public static final int DIV=7;
    public static final int COMMENT=30;
    public static final int JAVACODE=20;
    public static final int STRING=24;
    public static final int HEXNUMBER=23;

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[171+1];
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

                if ( (LA3_0==WORD||(LA3_0>=35 && LA3_0<=39)||LA3_0==43) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 38:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 39:
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
            	            case 38:
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
            	            case 37:
            	            case 43:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
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
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 32, input);

            	                    throw nvae;
            	                }
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
            	        case 39:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 38:
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
            	            case 37:
            	            case 43:
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
            	        case WORD:
            	            {
            	            int LA1_10 = input.LA(3);

            	            if ( (LA1_10==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_10==WORD||LA1_10==GLOBALVAR) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 10, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 37:
            	        case 43:
            	            {
            	            alt1=2;
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
            	    case 36:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 38:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 39:
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
            	            case 38:
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
            	            case 37:
            	            case 43:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_43 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 43, input);

            	                    throw nvae;
            	                }
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
            	        case 39:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 38:
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
            	            case 37:
            	            case 43:
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
            	        case 37:
            	        case 43:
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
            	            else if ( (LA1_16==WORD||LA1_16==GLOBALVAR) ) {
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
            	    case 38:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 39:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 38:
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
            	            case 37:
            	            case 43:
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
            	        case 38:
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
            	            else if ( (LA1_19==37||LA1_19==43) ) {
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
            	        case 37:
            	        case 43:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_21 = input.LA(3);

            	            if ( (LA1_21==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_21==WORD||LA1_21==GLOBALVAR) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 21, input);

            	                throw nvae;
            	            }
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
            	    case 39:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 38:
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
            	            else if ( (LA1_23==37||LA1_23==43) ) {
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
            	        case 37:
            	        case 43:
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
            	            else if ( (LA1_25==WORD||LA1_25==GLOBALVAR) ) {
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
            	        else if ( (LA1_5==WORD||LA1_5==GLOBALVAR) ) {
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
            	    case 37:
            	    case 43:
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

            	        if ( (LA2_0==34) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:117: ';'
            	    	    {
            	    	    match(input,34,FOLLOW_34_in_classes206); if (failed) return ;
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

                if ( (LA4_0==LPAREN||LA4_0==LBRAC||(LA4_0>=JAVACODE && LA4_0<=WORD)||LA4_0==GLOBALVAR||LA4_0==34||LA4_0==37||LA4_0==41||(LA4_0>=43 && LA4_0<=46)||(LA4_0>=70 && LA4_0<=73)||(LA4_0>=75 && LA4_0<=77)||LA4_0==81) ) {
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
            case 41:
                {
                alt5=2;
                }
                break;
            case 37:
            case 43:
                {
                alt5=3;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    int LA5_20 = input.LA(3);

                    if ( (LA5_20==WORD) ) {
                        int LA5_25 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt5=15;
                        }
                        else if ( (synpred20()) ) {
                            alt5=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 25, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_20==GLOBALVAR) ) {
                        alt5=16;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 20, input);

                        throw nvae;
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
                case 89:
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
            case 44:
                {
                alt5=4;
                }
                break;
            case 45:
                {
                alt5=5;
                }
                break;
            case 46:
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
            case LPAREN:
            case GLOBALVAR:
                {
                alt5=16;
                }
                break;
            case 34:
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
                    match(input,34,FOLLOW_34_in_statement335); if (failed) return value;
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

                if ( (LA6_0==34) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ';'
            	    {
            	    match(input,34,FOLLOW_34_in_statement340); if (failed) return value;

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
                case 35:
                    {
                    alt7=1;
                    }
                    break;
                case 37:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==WORD) ) {
                        int LA7_8 = input.LA(3);

                        if ( (LA7_8==WORD) ) {
                            int LA7_15 = input.LA(4);

                            if ( (synpred25()) ) {
                                alt7=2;
                            }
                        }
                        else if ( (LA7_8==GLOBALVAR) ) {
                            alt7=2;
                        }
                    }
                    else if ( ((LA7_2>=37 && LA7_2<=39)||LA7_2==43) ) {
                        alt7=2;
                    }
                    }
                    break;
                case 36:
                    {
                    alt7=2;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:4: 'public'
                    {
                    match(input,35,FOLLOW_35_in_field376); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( 'private' | 'var' )
                    {
                    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
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

            if ( (LA8_0==38) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred26()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:77: 'final'
                    {
                    match(input,38,FOLLOW_38_in_field391); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:108: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:109: 'static'
                    {
                    match(input,39,FOLLOW_39_in_field397); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:142: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:143: 'final'
                    {
                    match(input,38,FOLLOW_38_in_field403); if (failed) return value;
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

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:4: 'public'
                    {
                    match(input,35,FOLLOW_35_in_method433); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:33: 'private'
                    {
                    match(input,36,FOLLOW_36_in_method436); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:66: ( 'final' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred31()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: 'final'
                    {
                    match(input,38,FOLLOW_38_in_method442); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:98: ( 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:99: 'static'
                    {
                    match(input,39,FOLLOW_39_in_method448); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:132: ( 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:133: 'final'
                    {
                    match(input,38,FOLLOW_38_in_method454); if (failed) return value;
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

                        if ( (LA16_0==40) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:202: ( ',' ) (e= WORD )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:202: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:203: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_method474); if (failed) return value;

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
            if ( input.LA(1)==LBRAC||input.LA(1)==41 ) {
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

                if ( (LA18_0==LPAREN||LA18_0==LBRAC||(LA18_0>=JAVACODE && LA18_0<=WORD)||LA18_0==GLOBALVAR||LA18_0==34||LA18_0==37||LA18_0==41||(LA18_0>=43 && LA18_0<=46)||(LA18_0>=70 && LA18_0<=73)||(LA18_0>=75 && LA18_0<=77)||LA18_0==81) ) {
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

            if ( input.LA(1)==RBRAC||input.LA(1)==42 ) {
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
            case 37:
                {
                alt19=1;
                }
                break;
            case WORD:
                {
                alt19=2;
                }
                break;
            case 43:
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
                    match(input,37,FOLLOW_37_in_varstatement552); if (failed) return retval;

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
                    match(input,43,FOLLOW_43_in_varstatement560); if (failed) return retval;

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
              s = ""+input.toString(vari.start,vari.stop);
            }

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:71: ( ',' (varii= variable ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:72: ',' (varii= variable )
            	    {
            	    match(input,40,FOLLOW_40_in_varstatement572); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:76: (varii= variable )
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:77: varii= variable
            	    {
            	    pushFollow(FOLLOW_variable_in_varstatement577);
            	    varii=variable();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      s += ", "+input.toString(varii.start,varii.stop);
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
            match(input,44,FOLLOW_44_in_returnstatement600); if (failed) return value;
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
                case 60:
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
                case LPAREN:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case WORD:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA21_6 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA21_7 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA21_8 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA21_9 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA21_10 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case STUPIDDECIMAL:
                    {
                    int LA21_11 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 50:
                case 51:
                    {
                    int LA21_12 = input.LA(2);

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
            match(input,45,FOLLOW_45_in_exitstatement622); if (failed) return value;
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
            match(input,46,FOLLOW_46_in_ifstatement640); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement644);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:36: ( 'then' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:37: 'then'
                    {
                    match(input,47,FOLLOW_47_in_ifstatement647); if (failed) return value;

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

                if ( (LA23_0==48) ) {
                    int LA23_22 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==49) ) {
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

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
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
                    match(input,48,FOLLOW_48_in_elsestatement682); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:25: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:25: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:26: 'elsif' e= expression
                    {
                    match(input,49,FOLLOW_49_in_elsestatement685); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:104:1: expression returns [String value] : (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
    public final String expression() throws RecognitionException {
        String value = null;
        int expression_StartIndex = input.index();
        String neg = null;

        String p = null;

        String r = null;

        String n = null;

        String aa = null;

        String an = null;

        String orr = null;

        String x = null;

        String e = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:1: ( (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression | aa= bexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )
            int alt25=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred47()) ) {
                    alt25=1;
                }
                else if ( (synpred49()) ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 60:
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
                else if ( (synpred49()) ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 3, input);

                    throw nvae;
                }
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 50, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 60, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 37, input);

                        throw nvae;
                    }

                    }
                    break;
                case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 61, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 62, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 64, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 66, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 67, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 68, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 69, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 70, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 71, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 72, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 38, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 73, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 74, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 75, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 76, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 77, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 78, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 79, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 80, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 81, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 82, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 83, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 84, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 39, input);

                        throw nvae;
                    }

                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 85, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 86, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 87, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 88, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 89, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 90, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 91, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 93, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 94, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 95, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 96, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 40, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 97, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 98, input);

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
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 99, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 100, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 101, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 102, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 103, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 104, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 105, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 106, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 41, input);

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
                    case 51:
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 107, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 108, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 109, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 110, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 111, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 112, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 113, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 42, input);

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
                    case 51:
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 114, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 115, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 116, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 117, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 118, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 119, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 120, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 43, input);

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
                    case 51:
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 121, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 122, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 123, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 124, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 125, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 126, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 127, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 44, input);

                        throw nvae;
                    }

                    }
                    break;
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 128, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 129, input);

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
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 130, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 131, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 132, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 133, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 134, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 135, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 136, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 45, input);

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
                    case 51:
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 137, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 138, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 139, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 140, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 141, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 142, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 143, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 46, input);

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
                    case 51:
                    case 68:
                    case 69:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 144, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 52:
                    case 53:
                    case 54:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 145, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 146, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 147, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 148, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 149, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 150, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 47, input);

                        throw nvae;
                    }

                    }
                    break;
                case 50:
                case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 151, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 152, input);

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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 153, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 154, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 155, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 156, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 157, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 158, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 159, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 160, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 161, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
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
                                new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 162, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 48, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 4, input);

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
            case GLOBALVAR:
                {
                alt25=3;
                }
                break;
            case 50:
            case 51:
                {
                alt25=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("105:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 25, 0, input);

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
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression731);
                    p=pexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =p;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:71: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression736);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =r;
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
                case 52:
                case 53:
                case 54:
                    {
                    int LA26_41 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    {
                    int LA26_42 = input.LA(2);

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
                    int LA28_38 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA28_39 = input.LA(2);

                    if ( (synpred54()) ) {
                        alt28=1;
                    }


                    }
                    break;
                case 66:
                case 67:
                    {
                    int LA28_40 = input.LA(2);

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
            if ( (input.LA(1)>=50 && input.LA(1)<=51) ) {
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
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||(input.LA(1)>=52 && input.LA(1)<=54) ) {
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
            if ( (input.LA(1)>=55 && input.LA(1)<=59) ) {
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
            case 60:
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
                    match(input,60,FOLLOW_60_in_negate924); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:128:1: pexpression returns [String value] : LPAREN e= expression RPAREN ( '.' variable )? ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:1: ( LPAREN e= expression RPAREN ( '.' variable )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:3: LPAREN e= expression RPAREN ( '.' variable )?
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
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:66: ( '.' variable )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:67: '.' variable
                    {
                    match(input,61,FOLLOW_61_in_pexpression961); if (failed) return value;
                    pushFollow(FOLLOW_variable_in_pexpression963);
                    variable();
                    _fsp--;
                    if (failed) return value;

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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression980);    throw mse;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression1001);    throw mse;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression1022);    throw mse;
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
            int alt33=10;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LPAREN) ) {
                    alt33=1;
                }
                else if ( (synpred81()) ) {
                    alt33=6;
                }
                else if ( (synpred86()) ) {
                    alt33=9;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt33=2;
                }
                break;
            case STRING:
                {
                alt33=3;
                }
                break;
            case PLUS:
            case MINUS:
                {
                int LA33_4 = input.LA(2);

                if ( (LA33_4==NUMBER) ) {
                    alt33=4;
                }
                else if ( (LA33_4==DECIMAL) ) {
                    alt33=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
                {
                alt33=5;
                }
                break;
            case GLOBALVAR:
                {
                alt33=6;
                }
                break;
            case DECIMAL:
                {
                alt33=7;
                }
                break;
            case STUPIDDECIMAL:
                {
                alt33=8;
                }
                break;
            case LPAREN:
                {
                alt33=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("146:3: (f= function | h= HEXNUMBER | s= STRING | ( '-' | '+' ) n= NUMBER | n= NUMBER | v= variable | ( '-' | '+' )? d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:4: f= function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression1053);
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
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1058); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(h.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:81: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression1064); if (failed) return value;
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1067);    throw mse;
                    }

                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1075); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:206: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1081); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression1086);
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
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=PLUS && LA32_0<=MINUS)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
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
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1089);    throw mse;
                            }


                            }
                            break;

                    }

                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1098); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval(d.getText());
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:330: d= STUPIDDECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1103); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval("0"+d.getText());
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1108); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:409: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_relationalExpression1113);
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
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                switch ( input.LA(2) ) {
                    case MINUS:
                        {
                        switch ( input.LA(3) ) {
                            case NUMBER:
                                {
                                int LA35_60 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_61 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case MINUS:
                                {
                                int LA35_62 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA35_63 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA35_64 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_65 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_66 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_67 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_68 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case GLOBALVAR:
                                {
                                int LA35_69 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_70 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 50:
                            case 51:
                                {
                                int LA35_71 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case 60:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA35_72 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA35_73 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA35_74 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_75 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_76 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_77 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_78 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_79 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case GLOBALVAR:
                                {
                                int LA35_80 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_81 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_82 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 50:
                            case 51:
                                {
                                int LA35_83 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
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
                                int LA35_84 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_85 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case MINUS:
                                {
                                int LA35_86 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA35_87 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA35_88 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_89 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_90 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_91 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_92 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case GLOBALVAR:
                                {
                                int LA35_93 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_94 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 50:
                            case 51:
                                {
                                int LA35_95 = input.LA(4);

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
                                int LA35_96 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA35_97 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA35_98 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_99 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_100 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_101 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_102 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_103 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case GLOBALVAR:
                                {
                                int LA35_104 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_105 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_106 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 50:
                            case 51:
                                {
                                int LA35_107 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case WORD:
                        {
                        int LA35_52 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA35_53 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA35_54 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA35_55 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case GLOBALVAR:
                        {
                        int LA35_56 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA35_57 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA35_58 = input.LA(3);

                        if ( (synpred104()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case 50:
                    case 51:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA35_441 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA35_442 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case PLUS:
                                {
                                int LA35_443 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_444 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_445 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_446 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_447 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_448 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case GLOBALVAR:
                                {
                                int LA35_449 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_450 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_451 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 50:
                            case 51:
                                {
                                int LA35_452 = input.LA(4);

                                if ( (synpred104()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                }

            }
            else if ( ((LA35_0>=EQUALS && LA35_0<=LTE)||(LA35_0>=68 && LA35_0<=69)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    {
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||(input.LA(1)>=68 && input.LA(1)<=69) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1121);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    int alt34=9;
                    switch ( input.LA(1) ) {
                    case WORD:
                        {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==LPAREN) ) {
                            alt34=1;
                        }
                        else if ( (synpred100()) ) {
                            alt34=5;
                        }
                        else if ( (synpred103()) ) {
                            alt34=8;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA34_2 = input.LA(2);

                        if ( (synpred97()) ) {
                            alt34=2;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA34_3 = input.LA(2);

                        if ( (synpred98()) ) {
                            alt34=3;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA34_4 = input.LA(2);

                        if ( (synpred99()) ) {
                            alt34=4;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case GLOBALVAR:
                        {
                        int LA34_5 = input.LA(2);

                        if ( (synpred100()) ) {
                            alt34=5;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA34_6 = input.LA(2);

                        if ( (synpred101()) ) {
                            alt34=6;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA34_7 = input.LA(2);

                        if ( (synpred102()) ) {
                            alt34=7;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case LPAREN:
                    case 50:
                    case 51:
                    case 60:
                        {
                        alt34=9;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("146:505: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:506: f= function
                            {
                            pushFollow(FOLLOW_function_in_relationalExpression1146);
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
                            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1151); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = h.getText();
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: s= STRING
                            {
                            s=(Token)input.LT(1);
                            match(input,STRING,FOLLOW_STRING_in_relationalExpression1156); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: n= NUMBER
                            {
                            n=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1161); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.intval(n.getText());
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_relationalExpression1166);
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
                            match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1171); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double("+d.getText()+"))";
                            }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: d= STUPIDDECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1176); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double(0"+d.getText()+"))";
                            }

                            }
                            break;
                        case 8 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: w= WORD
                            {
                            w=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_relationalExpression1181); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = w.getText();
                            }

                            }
                            break;
                        case 9 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:804: exp= expression
                            {
                            pushFollow(FOLLOW_expression_in_relationalExpression1186);
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
            match(input,70,FOLLOW_70_in_repeatstatement1209); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:12: (e= expression )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case PLUS:
                case MINUS:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case STUPIDDECIMAL:
                case 50:
                case 51:
                case 60:
                    {
                    alt36=1;
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
                                    int LA36_99 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_100 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_101 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_102 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_103 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_104 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_105 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_106 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_107 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_108 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_109 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_110 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 60:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_111 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_112 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_113 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_114 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_115 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_116 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_117 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_118 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_119 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_120 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_121 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_122 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    int LA36_123 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_124 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_125 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_126 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_127 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_128 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_129 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_130 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_131 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_132 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_133 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_134 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    int LA36_135 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_136 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_137 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_138 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_139 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_140 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_141 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_142 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_143 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_144 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_145 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_146 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_147 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_148 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 68:
                                case 69:
                                    {
                                    int LA36_149 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_150 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_151 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_152 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_153 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_154 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_155 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_156 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 51:
                                case 68:
                                case 69:
                                    {
                                    int LA36_157 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_158 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_159 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_160 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_161 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_162 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_163 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 51:
                                case 68:
                                case 69:
                                    {
                                    int LA36_164 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_165 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_166 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_167 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_168 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_169 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_170 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 51:
                                case 68:
                                case 69:
                                    {
                                    int LA36_171 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_172 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_173 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_174 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_175 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_176 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_177 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_178 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_179 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 68:
                                case 69:
                                    {
                                    int LA36_180 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_181 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_182 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_183 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_184 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_185 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_186 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                case 51:
                                case 68:
                                case 69:
                                    {
                                    int LA36_187 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_188 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_189 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_190 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_191 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_192 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_193 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
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
                                case 51:
                                case 68:
                                case 69:
                                    {
                                    int LA36_194 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case 52:
                                case 53:
                                case 54:
                                    {
                                    int LA36_195 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    {
                                    int LA36_196 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA36_197 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA36_198 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 66:
                                case 67:
                                    {
                                    int LA36_199 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_200 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 50:
                        case 51:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_201 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_202 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_203 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_204 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_205 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_206 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_207 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_208 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_209 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_210 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_211 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_212 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_213 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_214 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_215 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_216 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_217 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_218 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_219 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_220 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_221 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_222 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_223 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_224 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_225 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 61:
                            {
                            int LA36_42 = input.LA(3);

                            if ( (LA36_42==WORD) ) {
                                int LA36_226 = input.LA(4);

                                if ( (synpred105()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( (LA36_42==GLOBALVAR) ) {
                                int LA36_227 = input.LA(4);

                                if ( (synpred105()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case 89:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_228 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_229 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_230 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_231 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_232 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_233 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_234 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_235 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_236 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_237 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_238 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_239 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 40:
                                    {
                                    int LA36_240 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 90:
                                    {
                                    int LA36_241 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    int LA36_242 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_243 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA36_244 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_245 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    alt36=1;
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_253 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    int LA36_282 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_283 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_284 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_285 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_286 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_287 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_288 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_289 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_290 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_291 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_292 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_293 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                        case 34:
                        case 37:
                        case 41:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
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
                            alt36=1;
                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_294 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_295 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                                    alt36=1;
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
                    switch ( input.LA(2) ) {
                        case 89:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_334 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_335 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_336 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_337 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_338 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_339 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_340 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_341 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_342 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_343 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_344 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_345 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 40:
                                    {
                                    int LA36_346 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 90:
                                    {
                                    int LA36_347 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 61:
                            {
                            int LA36_71 = input.LA(3);

                            if ( (LA36_71==WORD||LA36_71==GLOBALVAR) ) {
                                int LA36_348 = input.LA(4);

                                if ( (synpred105()) ) {
                                    alt36=1;
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
                                    int LA36_349 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_350 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_351 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_352 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_353 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_354 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_355 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_356 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA36_357 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                    {
                                    int LA36_358 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_359 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA36_360 = input.LA(4);

                                    if ( (synpred105()) ) {
                                        alt36=1;
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
                        case LPAREN:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case WORD:
                        case GLOBALVAR:
                        case 34:
                        case 37:
                        case 41:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
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
                            alt36=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_repeatstatement1214);
                    e=expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:28: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:29: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1221);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:42: ( ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    int LA37_1 = input.LA(2);

                    if ( (synpred106()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ';'
            	    {
            	    match(input,34,FOLLOW_34_in_repeatstatement1225); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop37;
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
            match(input,71,FOLLOW_71_in_breakstatement1243); if (failed) return value;
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
            match(input,72,FOLLOW_72_in_continuestatement1258); if (failed) return value;
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
            match(input,73,FOLLOW_73_in_dostatement1273); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1277);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,74,FOLLOW_74_in_dostatement1279); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1283);
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
            match(input,75,FOLLOW_75_in_whilestatement1298); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1302);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1307);
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
            match(input,76,FOLLOW_76_in_forstatement1323); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1325); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1329);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1333);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:39: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==LPAREN||LA38_1==LBRAC||(LA38_1>=JAVACODE && LA38_1<=WORD)||LA38_1==GLOBALVAR||LA38_1==37||LA38_1==41||(LA38_1>=43 && LA38_1<=46)||(LA38_1>=70 && LA38_1<=73)||(LA38_1>=75 && LA38_1<=77)||LA38_1==81) ) {
                    alt38=1;
                }
                else if ( (LA38_1==34) ) {
                    int LA38_38 = input.LA(3);

                    if ( (synpred107()) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ';'
                    {
                    match(input,34,FOLLOW_34_in_forstatement1336); if (failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_in_forstatement1342);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1344); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1348);
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
            match(input,77,FOLLOW_77_in_switchstatement1368); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:12: (ex= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:13: ex= expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1373);
            ex=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( input.LA(1)==LBRAC||input.LA(1)==41 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1376);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:42: ( ( 'case' ex2= expression | 'default' ) ':' (st= statement )* )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=78 && LA41_0<=79)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:43: ( 'case' ex2= expression | 'default' ) ':' (st= statement )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:43: ( 'case' ex2= expression | 'default' )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==78) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==79) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("173:43: ( 'case' ex2= expression | 'default' )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:44: 'case' ex2= expression
            	            {
            	            match(input,78,FOLLOW_78_in_switchstatement1384); if (failed) return value;
            	            pushFollow(FOLLOW_expression_in_switchstatement1388);
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
            	            match(input,79,FOLLOW_79_in_switchstatement1391); if (failed) return value;
            	            if ( backtracking==0 ) {
            	              value ="";
            	            }

            	            }
            	            break;

            	    }

            	    match(input,80,FOLLOW_80_in_switchstatement1396); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:122: (st= statement )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==LPAREN||LA40_0==LBRAC||(LA40_0>=JAVACODE && LA40_0<=WORD)||LA40_0==GLOBALVAR||LA40_0==34||LA40_0==37||LA40_0==41||(LA40_0>=43 && LA40_0<=46)||(LA40_0>=70 && LA40_0<=73)||(LA40_0>=75 && LA40_0<=77)||LA40_0==81) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:123: st= statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1401);
            	    	    st=statement();
            	    	    _fsp--;
            	    	    if (failed) return value;
            	    	    if ( backtracking==0 ) {
            	    	      statements+=st;
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    if ( backtracking==0 ) {
            	      casestatements+=pc.caseStatement(ex,value,statements);statements="";
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1410);    throw mse;
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
            match(input,81,FOLLOW_81_in_withstatement1430); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1435);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1440);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:180:1: assignment returns [String value] : (valuee= variable | e1= pexpression ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        String e1 = null;

        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:1: ( (valuee= variable | e1= pexpression ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:4: (valuee= variable | e1= pexpression ) op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:4: (valuee= variable | e1= pexpression )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==WORD||LA42_0==GLOBALVAR) ) {
                alt42=1;
            }
            else if ( (LA42_0==LPAREN) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("181:4: (valuee= variable | e1= pexpression )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:47: valuee= variable
                    {
                    pushFollow(FOLLOW_variable_in_assignment1460);
                    valuee=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =input.toString(valuee.start,valuee.stop);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:85: e1= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_assignment1465);
                    e1=pexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e1;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1472);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1495);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:184:1: variable returns [String value] : (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;

        variable_return valueee = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:1: ( (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:3: (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* )
            {
            if ( backtracking==0 ) {
              retval.value ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:16: (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==GLOBALVAR) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==89) ) {
                    alt45=1;
                }
                else if ( (LA45_1==EOF||(LA45_1>=PLUS && LA45_1<=LTE)||(LA45_1>=JAVACODE && LA45_1<=GLOBALVAR)||(LA45_1>=34 && LA45_1<=88)||LA45_1==90) ) {
                    alt45=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("185:16: (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* )", 45, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("185:16: (a= array ( '.' valueee= variable )* | valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )* )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:17: a= array ( '.' valueee= variable )*
                    {
                    pushFollow(FOLLOW_array_in_variable1515);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:26: ( '.' valueee= variable )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==61) ) {
                            int LA43_54 = input.LA(2);

                            if ( (synpred122()) ) {
                                alt43=1;
                            }


                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:27: '.' valueee= variable
                    	    {
                    	    match(input,61,FOLLOW_61_in_variable1519); if (failed) return retval;
                    	    pushFollow(FOLLOW_variable_in_variable1523);
                    	    valueee=variable();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	      retval.value+="."+input.toString(valueee.start,valueee.stop);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(a+retval.value);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:122: valuee= ( WORD | GLOBALVAR ) ( '.' valueee= variable )*
                    {
                    valuee=(Token)input.LT(1);
                    if ( input.LA(1)==WORD||input.LA(1)==GLOBALVAR ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1535);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:146: ( '.' valueee= variable )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==61) ) {
                            int LA44_54 = input.LA(2);

                            if ( (synpred125()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:147: '.' valueee= variable
                    	    {
                    	    match(input,61,FOLLOW_61_in_variable1542); if (failed) return retval;
                    	    pushFollow(FOLLOW_variable_in_variable1546);
                    	    valueee=variable();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	      retval.value+="."+input.toString(valueee.start,valueee.stop);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(valuee.getText()+retval.value);
                    }

                    }
                    break;

            }


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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:193:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )* ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ( '.' variable )*
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1574); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1576); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=PLUS && LA48_0<=MINUS)||LA48_0==LPAREN||(LA48_0>=WORD && LA48_0<=GLOBALVAR)||(LA48_0>=50 && LA48_0<=51)||LA48_0==60) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1581);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e;
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:49: ( ( ',' ) (e= expression )? )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==40) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:51: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_function1587); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:56: (e= expression )?
                    	    int alt46=2;
                    	    int LA46_0 = input.LA(1);

                    	    if ( ((LA46_0>=PLUS && LA46_0<=MINUS)||LA46_0==LPAREN||(LA46_0>=WORD && LA46_0<=GLOBALVAR)||(LA46_0>=50 && LA46_0<=51)||LA46_0==60) ) {
                    	        alt46=1;
                    	    }
                    	    switch (alt46) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1593);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function1602); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:106: ( '.' variable )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==61) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:107: '.' variable
            	    {
            	    match(input,61,FOLLOW_61_in_function1605); if (failed) return value;
            	    pushFollow(FOLLOW_variable_in_function1607);
            	    variable();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:197:1: function2 returns [String value] : n= WORD '.' WORD '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        String e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:2: (n= WORD '.' WORD '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:4: n= WORD '.' WORD '(' ( (e= expression ) ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function21628); if (failed) return value;
            match(input,61,FOLLOW_61_in_function21630); if (failed) return value;
            match(input,WORD,FOLLOW_WORD_in_function21631); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21633); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:23: ( (e= expression ) ( ( ',' ) (e= expression )? )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=PLUS && LA52_0<=MINUS)||LA52_0==LPAREN||(LA52_0>=WORD && LA52_0<=GLOBALVAR)||(LA52_0>=50 && LA52_0<=51)||LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:24: (e= expression ) ( ( ',' ) (e= expression )? )*
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:24: (e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:25: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_function21639);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e;
                    }

                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:61: ( ( ',' ) (e= expression )? )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==40) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:62: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:62: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:63: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_function21647); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:68: (e= expression )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==LPAREN||(LA50_0>=WORD && LA50_0<=GLOBALVAR)||(LA50_0>=50 && LA50_0<=51)||LA50_0==60) ) {
                    	        alt50=1;
                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:198:69: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21653);
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
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21662); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:200:1: array returns [String value] : valuee= ( WORD | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        String e = null;

        String e1 = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 36) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:3: (valuee= ( WORD | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:5: valuee= ( WORD | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']'
            {
            valuee=(Token)input.LT(1);
            if ( input.LA(1)==WORD||input.LA(1)==GLOBALVAR ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1681);    throw mse;
            }

            match(input,89,FOLLOW_89_in_array1687); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:33: (e= expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=PLUS && LA53_0<=MINUS)||LA53_0==LPAREN||(LA53_0>=WORD && LA53_0<=GLOBALVAR)||(LA53_0>=50 && LA53_0<=51)||LA53_0==60) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:34: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_array1692);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:67: ( ',' e1= expression )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:201:68: ',' e1= expression
                    {
                    match(input,40,FOLLOW_40_in_array1698); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_array1702);
                    e1=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e + ","+e1;
                    }

                    }
                    break;

            }

            match(input,90,FOLLOW_90_in_array1707); if (failed) return value;
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

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:586: ( function2 )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:586: function2
        {
        pushFollow(FOLLOW_function2_in_synpred19322);
        function2();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:629: ( assignment )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:629: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred20327);
        assignment();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:728: ';'
        {
        match(input,34,FOLLOW_34_in_synpred22340); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( ( 'private' | 'var' ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:34: ( 'private' | 'var' )
        {
        if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
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
        match(input,38,FOLLOW_38_in_synpred26391); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:67: 'final'
        {
        match(input,38,FOLLOW_38_in_synpred31442); if (failed) return ;

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
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: ( pexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:38: pexpression
        {
        pushFollow(FOLLOW_pexpression_in_synpred48731);
        pexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:71: ( relationalExpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:71: relationalExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred49736);
        relationalExpression();
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
        int alt60=3;
        switch ( input.LA(1) ) {
        case 62:
        case 63:
            {
            alt60=1;
            }
            break;
        case 64:
        case 65:
            {
            alt60=2;
            }
            break;
        case 66:
        case 67:
            {
            alt60=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("105:302: ( andexpression | orexpression | xorexpression )", 60, 0, input);

            throw nvae;
        }

        switch (alt60) {
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

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:245: variable
        {
        pushFollow(FOLLOW_variable_in_synpred811086);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:383: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred861108); if (failed) return ;

        }
    }
    // $ANTLR end synpred86

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: ( HEXNUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: HEXNUMBER
        {
        match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred971151); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: ( STRING )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: STRING
        {
        match(input,STRING,FOLLOW_STRING_in_synpred981156); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: ( NUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: NUMBER
        {
        match(input,NUMBER,FOLLOW_NUMBER_in_synpred991161); if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: variable
        {
        pushFollow(FOLLOW_variable_in_synpred1001166);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: ( DECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: DECIMAL
        {
        match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred1011171); if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: ( STUPIDDECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: STUPIDDECIMAL
        {
        match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred1021176); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred1031181); if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:446: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||(input.LA(1)>=68 && input.LA(1)<=69) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred1041121);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        int alt62=9;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA62_1 = input.LA(2);

            if ( (LA62_1==LPAREN) ) {
                alt62=1;
            }
            else if ( (synpred100()) ) {
                alt62=5;
            }
            else if ( (synpred103()) ) {
                alt62=8;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            int LA62_2 = input.LA(2);

            if ( (synpred97()) ) {
                alt62=2;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 2, input);

                throw nvae;
            }
            }
            break;
        case STRING:
            {
            int LA62_3 = input.LA(2);

            if ( (synpred98()) ) {
                alt62=3;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 3, input);

                throw nvae;
            }
            }
            break;
        case NUMBER:
            {
            int LA62_4 = input.LA(2);

            if ( (synpred99()) ) {
                alt62=4;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 4, input);

                throw nvae;
            }
            }
            break;
        case GLOBALVAR:
            {
            int LA62_5 = input.LA(2);

            if ( (synpred100()) ) {
                alt62=5;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 5, input);

                throw nvae;
            }
            }
            break;
        case DECIMAL:
            {
            int LA62_6 = input.LA(2);

            if ( (synpred101()) ) {
                alt62=6;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 6, input);

                throw nvae;
            }
            }
            break;
        case STUPIDDECIMAL:
            {
            int LA62_7 = input.LA(2);

            if ( (synpred102()) ) {
                alt62=7;
            }
            else if ( (true) ) {
                alt62=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 7, input);

                throw nvae;
            }
            }
            break;
        case PLUS:
        case MINUS:
        case LPAREN:
        case 50:
        case 51:
        case 60:
            {
            alt62=9;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("146:505: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 62, 0, input);

            throw nvae;
        }

        switch (alt62) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:506: function
                {
                pushFollow(FOLLOW_function_in_synpred1041146);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:532: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred1041151); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:558: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred1041156); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:628: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred1041161); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:662: variable
                {
                pushFollow(FOLLOW_variable_in_synpred1041166);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:688: DECIMAL
                {
                match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred1041171); if (failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:732: STUPIDDECIMAL
                {
                match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred1041176); if (failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:783: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred1041181); if (failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:804: expression
                {
                pushFollow(FOLLOW_expression_in_synpred1041186);
                expression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred105
    public final void synpred105_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred1051214);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred105

    // $ANTLR start synpred106
    public final void synpred106_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:43: ';'
        {
        match(input,34,FOLLOW_34_in_synpred1061225); if (failed) return ;

        }
    }
    // $ANTLR end synpred106

    // $ANTLR start synpred107
    public final void synpred107_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:40: ';'
        {
        match(input,34,FOLLOW_34_in_synpred1071336); if (failed) return ;

        }
    }
    // $ANTLR end synpred107

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:27: ( '.' variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:27: '.' variable
        {
        match(input,61,FOLLOW_61_in_synpred1221519); if (failed) return ;
        pushFollow(FOLLOW_variable_in_synpred1221523);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred125
    public final void synpred125_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:147: ( '.' variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:147: '.' variable
        {
        match(input,61,FOLLOW_61_in_synpred1251542); if (failed) return ;
        pushFollow(FOLLOW_variable_in_synpred1251546);
        variable();
        _fsp--;
        if (failed) return ;

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
    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
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
    public final boolean synpred122() {
        backtracking++;
        int start = input.mark();
        try {
            synpred122_fragment(); // can never throw exception
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
    public final boolean synpred86() {
        backtracking++;
        int start = input.mark();
        try {
            synpred86_fragment(); // can never throw exception
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
    public final boolean synpred107() {
        backtracking++;
        int start = input.mark();
        try {
            synpred107_fragment(); // can never throw exception
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
    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
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
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_method_in_classes196 = new BitSet(new long[]{0x000008FC00200002L});
    public static final BitSet FOLLOW_field_in_classes201 = new BitSet(new long[]{0x000008FC00200002L});
    public static final BitSet FOLLOW_34_in_classes206 = new BitSet(new long[]{0x000008FC00200002L});
    public static final BitSet FOLLOW_statement_in_code227 = new BitSet(new long[]{0x00007A2408300502L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_javacode_in_statement252 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_bstatement_in_statement257 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_varstatement_in_statement262 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement267 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement272 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement277 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement282 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_dostatement_in_statement287 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement292 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement297 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement302 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_forstatement_in_statement307 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement312 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_withstatement_in_statement317 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_function2_in_statement322 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_assignment_in_statement327 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_function_in_statement332 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_statement335 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_statement340 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_JAVACODE_in_javacode358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_field376 = new BitSet(new long[]{0x000008E000200000L});
    public static final BitSet FOLLOW_set_in_field380 = new BitSet(new long[]{0x000008E000200000L});
    public static final BitSet FOLLOW_38_in_field391 = new BitSet(new long[]{0x000008E000200000L});
    public static final BitSet FOLLOW_39_in_field397 = new BitSet(new long[]{0x0000086000200000L});
    public static final BitSet FOLLOW_38_in_field403 = new BitSet(new long[]{0x0000082000200000L});
    public static final BitSet FOLLOW_varstatement_in_field411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_method433 = new BitSet(new long[]{0x000000C000200000L});
    public static final BitSet FOLLOW_36_in_method436 = new BitSet(new long[]{0x000000C000200000L});
    public static final BitSet FOLLOW_38_in_method442 = new BitSet(new long[]{0x000000C000200000L});
    public static final BitSet FOLLOW_39_in_method448 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_38_in_method454 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method461 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method463 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_WORD_in_method468 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_method474 = new BitSet(new long[]{0x0000010000200200L});
    public static final BitSet FOLLOW_WORD_in_method480 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method489 = new BitSet(new long[]{0x0000020000000400L});
    public static final BitSet FOLLOW_bstatement_in_method493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement511 = new BitSet(new long[]{0x00007E2408300D00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_bstatement520 = new BitSet(new long[]{0x00007E2408300D00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_set_in_bstatement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_varstatement552 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_WORD_in_varstatement556 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_43_in_varstatement560 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_varstatement566 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_varstatement572 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_varstatement577 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_44_in_returnstatement600 = new BitSet(new long[]{0x100C00000FE00132L});
    public static final BitSet FOLLOW_expression_in_returnstatement605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exitstatement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ifstatement640 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_ifstatement644 = new BitSet(new long[]{0x0000FA2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_47_in_ifstatement647 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_ifstatement654 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement660 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_elsestatement682 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_49_in_elsestatement685 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_elsestatement689 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_elsestatement698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_expression726 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_pexpression_in_expression731 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_relationalExpression_in_expression736 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_notexpression_in_expression741 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_aexpression_in_expression748 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_bexpression_in_expression754 = new BitSet(new long[]{0xCFF00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_andexpression_in_expression763 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_orexpression_in_expression768 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_xorexpression_in_expression773 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_expression780 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_notexpression799 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_notexpression807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression825 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_aexpression844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bexpression863 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_bexpression878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negate921 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_60_in_negate924 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_PLUS_in_negate927 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_negate933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression950 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_pexpression954 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression956 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_pexpression961 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_pexpression963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression1053 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1058 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1064 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1067 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1075 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1081 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1086 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1089 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1098 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1103 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1108 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_pexpression_in_relationalExpression1113 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1121 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_function_in_relationalExpression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_relationalExpression1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_repeatstatement1209 = new BitSet(new long[]{0x100C7A240FF00530L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1214 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1221 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_repeatstatement1225 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_71_in_breakstatement1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_continuestatement1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_dostatement1273 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_dostatement1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_dostatement1279 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_dostatement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_whilestatement1298 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_whilestatement1302 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_whilestatement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_forstatement1323 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1325 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1329 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_forstatement1333 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_34_in_forstatement1336 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1342 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1344 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_switchstatement1368 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_switchstatement1373 = new BitSet(new long[]{0x0000020000000400L});
    public static final BitSet FOLLOW_set_in_switchstatement1376 = new BitSet(new long[]{0x0000040000000800L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_switchstatement1384 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_switchstatement1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_switchstatement1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_switchstatement1396 = new BitSet(new long[]{0x00007E2408300D00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_statement_in_switchstatement1401 = new BitSet(new long[]{0x00007E2408300D00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_set_in_switchstatement1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_withstatement1430 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_withstatement1435 = new BitSet(new long[]{0x00007A2408300500L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_withstatement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1460 = new BitSet(new long[]{0x0000000000001000L,0x0000000001FC0010L});
    public static final BitSet FOLLOW_pexpression_in_assignment1465 = new BitSet(new long[]{0x0000000000001000L,0x0000000001FC0010L});
    public static final BitSet FOLLOW_set_in_assignment1472 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_assignment1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1515 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_variable1519 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_variable1523 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1535 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_variable1542 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_variable1546 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1574 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1576 = new BitSet(new long[]{0x100C00000FE00330L});
    public static final BitSet FOLLOW_expression_in_function1581 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function1587 = new BitSet(new long[]{0x100C01000FE00330L});
    public static final BitSet FOLLOW_expression_in_function1593 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1602 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_function1605 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_function1607 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function21628 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_function21630 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_function21631 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21633 = new BitSet(new long[]{0x100C00000FE00330L});
    public static final BitSet FOLLOW_expression_in_function21639 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function21647 = new BitSet(new long[]{0x100C01000FE00330L});
    public static final BitSet FOLLOW_expression_in_function21653 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_array1687 = new BitSet(new long[]{0x100C01000FE00130L,0x0000000004000000L});
    public static final BitSet FOLLOW_expression_in_array1692 = new BitSet(new long[]{0x0000010000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_40_in_array1698 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_array1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_array1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function2_in_synpred19322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred20327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred22340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred25380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred26391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred31442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred43605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred45660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_synpred47726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_synpred48731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred49736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred50748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bexpression_in_synpred51754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred54763 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_orexpression_in_synpred54768 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_xorexpression_in_synpred54773 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_expression_in_synpred54780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred811086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred861108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred971151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred981156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred991161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred1001166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred1011171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred1021176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1031181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1041121 = new BitSet(new long[]{0x100C00000FE00130L});
    public static final BitSet FOLLOW_function_in_synpred1041146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred1041151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred1041156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred1041161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred1041166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred1041171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred1041176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1041181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1041186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1051214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred1061225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred1071336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred1221519 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_synpred1221523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred1251542 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_variable_in_synpred1251546 = new BitSet(new long[]{0x0000000000000002L});

}