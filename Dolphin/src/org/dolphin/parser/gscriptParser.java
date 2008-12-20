// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g 2008-12-20 22:33:06

package org.dolphin.parser;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class gscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "JAVACODE", "WORD", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'globalvar'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'~'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&='", "'^='", "'.'", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int LETTER=30;
    public static final int GTE=16;
    public static final int NUMBER=23;
    public static final int WHITESPACE=31;
    public static final int EQUALS=12;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int LBRAC=10;
    public static final int LPAREN=8;
    public static final int WORD=22;
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
    public static final int JAVACODE=21;
    public static final int STRING=25;
    public static final int HEXNUMBER=24;

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[161+1];
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:1: classes : ( (f= method | m= field ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:1: ( ( (f= method | m= field ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:3: ( (f= method | m= field ) ( ';' )* )*
            {
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:24: ( (f= method | m= field ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=41)||LA3_0==45) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:25: (f= method | m= field ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:25: (f= method | m= field )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case WORD:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 29, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case 41:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 32, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 33, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 8, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 34, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 36, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 9, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_11 = input.LA(3);

            	            if ( (LA1_11==LPAREN) ) {
            	                int LA1_38 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 38, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_11==WORD||(LA1_11>=OIVAR && LA1_11<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 11, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("57:25: (f= method | m= field )", 1, 1, input);

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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case 41:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 43, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 40:
            	                {
            	                int LA1_44 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 44, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 13, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 45, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 47, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 14, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_15 = input.LA(3);

            	            if ( (LA1_15==LPAREN) ) {
            	                int LA1_49 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 49, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_15==WORD||(LA1_15>=OIVAR && LA1_15<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 15, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("57:25: (f= method | m= field )", 1, 2, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 40:
            	        {
            	        switch ( input.LA(2) ) {
            	        case WORD:
            	            {
            	            int LA1_18 = input.LA(3);

            	            if ( (LA1_18==LPAREN) ) {
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 51, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_18==WORD||(LA1_18>=OIVAR && LA1_18<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 18, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 55, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 21, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 40:
            	            {
            	            int LA1_22 = input.LA(3);

            	            if ( (LA1_22==WORD) ) {
            	                int LA1_57 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 57, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_22==39||LA1_22==45) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 22, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("57:25: (f= method | m= field )", 1, 3, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 41:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
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
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_23==39||LA1_23==45) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 23, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_25 = input.LA(3);

            	            if ( (LA1_25==LPAREN) ) {
            	                int LA1_63 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 63, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_25==WORD||(LA1_25>=OIVAR && LA1_25<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 25, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("57:25: (f= method | m= field )", 1, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_5 = input.LA(2);

            	        if ( (LA1_5==LPAREN) ) {
            	            switch ( input.LA(3) ) {
            	            case WORD:
            	                {
            	                int LA1_65 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("57:25: (f= method | m= field )", 1, 65, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case RPAREN:
            	                {
            	                alt1=1;
            	                }
            	                break;
            	            case LPAREN:
            	            case NUMBER:
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("57:25: (f= method | m= field )", 1, 27, input);

            	                throw nvae;
            	            }

            	        }
            	        else if ( (LA1_5==WORD||(LA1_5>=OIVAR && LA1_5<=GLOBALVAR)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("57:25: (f= method | m= field )", 1, 5, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 39:
            	    case 45:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("57:25: (f= method | m= field )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:26: f= method
            	            {
            	            pushFollow(FOLLOW_method_in_classes199);
            	            f=method();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:71: m= field
            	            {
            	            pushFollow(FOLLOW_field_in_classes204);
            	            m=field();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:116: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:117: ';'
            	    	    {
            	    	    match(input,36,FOLLOW_36_in_classes209); if (failed) return ;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
               pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:25: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:26: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:26: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LPAREN||LA4_0==LBRAC||(LA4_0>=JAVACODE && LA4_0<=WORD)||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==36||LA4_0==39||LA4_0==43||(LA4_0>=45 && LA4_0<=48)||(LA4_0>=69 && LA4_0<=72)||(LA4_0>=74 && LA4_0<=76)||LA4_0==80) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:27: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code230);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:1: statement returns [String value] : (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* ;
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
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:1: ( (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:3: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )
            int alt5=18;
            switch ( input.LA(1) ) {
            case JAVACODE:
                {
                alt5=1;
                }
                break;
            case LBRAC:
            case 43:
                {
                alt5=2;
                }
                break;
            case 39:
            case 45:
                {
                alt5=3;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA5_30 = input.LA(4);

                        if ( (synpred7()) ) {
                            alt5=3;
                        }
                        else if ( (synpred21()) ) {
                            alt5=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA5_31 = input.LA(4);

                        if ( (synpred7()) ) {
                            alt5=3;
                        }
                        else if ( (synpred21()) ) {
                            alt5=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 31, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA5_32 = input.LA(4);

                        if ( (synpred7()) ) {
                            alt5=3;
                        }
                        else if ( (synpred21()) ) {
                            alt5=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA5_33 = input.LA(4);

                        if ( (synpred7()) ) {
                            alt5=3;
                        }
                        else if ( (synpred21()) ) {
                            alt5=17;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 33, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                    case RPAREN:
                    case HEXNUMBER:
                    case STRING:
                    case DECIMAL:
                    case 52:
                    case 53:
                    case 61:
                        {
                        alt5=17;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 21, input);

                        throw nvae;
                    }

                    }
                    break;
                case EQUALS:
                case 68:
                case 81:
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
                        new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 4, input);

                    throw nvae;
                }

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
            case 48:
                {
                alt5=6;
                }
                break;
            case 69:
                {
                alt5=7;
                }
                break;
            case 72:
                {
                alt5=8;
                }
                break;
            case 74:
                {
                alt5=9;
                }
                break;
            case 71:
                {
                alt5=10;
                }
                break;
            case 70:
                {
                alt5=11;
                }
                break;
            case 75:
                {
                alt5=12;
                }
                break;
            case 76:
                {
                alt5=13;
                }
                break;
            case 80:
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
                else if ( (LA5_17==EQUALS||LA5_17==68||(LA5_17>=81 && LA5_17<=89)) ) {
                    alt5=16;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 17, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case GLOBALVAR:
                {
                alt5=16;
                }
                break;
            case 36:
                {
                alt5=18;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("65:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:20: java= javacode
                    {
                    pushFollow(FOLLOW_javacode_in_statement255);
                    java=javacode();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += java;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:58: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement260);
                    b=bstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += b;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:92: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement265);
                    v=varstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += v.value+";";
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:132: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement270);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += r;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:171: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement275);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += e;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:208: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement280);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ifs;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:247: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement285);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += rep;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:290: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement290);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += dos;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:329: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement295);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wh;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:369: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement300);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += con+";";
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:418: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement305);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += br+";";
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:462: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement310);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fors;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:504: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement315);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += sw;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:545: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement320);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wit;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:586: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement325);
                    fun2=function2();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun2+";";
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:629: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement330);
                    ass=assignment();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ass+";";
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:671: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement335);
                    fun=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun+";";
                    }

                    }
                    break;
                case 18 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:711: ';'
                    {
                    match(input,36,FOLLOW_36_in_statement338); if (failed) return value;
                    if ( backtracking==0 ) {
                      value +=";";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:731: ( ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    int LA6_21 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:732: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement343); if (failed) return value;

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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:68:1: javacode returns [String value] : jcode= JAVACODE ;
    public final String javacode() throws RecognitionException {
        String value = null;
        int javacode_StartIndex = input.index();
        Token jcode=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:69:1: (jcode= JAVACODE )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:69:3: jcode= JAVACODE
            {
            jcode=(Token)input.LT(1);
            match(input,JAVACODE,FOLLOW_JAVACODE_in_javacode362); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:1: field returns [String value] : ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:1: ( ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:3: ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:3: ( 'public' | ( 'private' | 'var' ) )?
            int alt7=3;
            switch ( input.LA(1) ) {
                case 37:
                    {
                    alt7=1;
                    }
                    break;
                case 39:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==WORD) ) {
                        int LA7_8 = input.LA(3);

                        if ( (LA7_8==WORD) ) {
                            int LA7_18 = input.LA(4);

                            if ( (synpred25()) ) {
                                alt7=2;
                            }
                        }
                        else if ( (LA7_8==LPAREN||(LA7_8>=OIVAR && LA7_8<=GLOBALVAR)) ) {
                            alt7=2;
                        }
                    }
                    else if ( ((LA7_2>=39 && LA7_2<=41)||LA7_2==45) ) {
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

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_field380); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:34: ( 'private' | 'var' )
                    {
                    if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field384);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:76: ( 'final' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred26()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:77: 'final'
                    {
                    match(input,40,FOLLOW_40_in_field395); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:108: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:109: 'static'
                    {
                    match(input,41,FOLLOW_41_in_field401); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:142: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:143: 'final'
                    {
                    match(input,40,FOLLOW_40_in_field407); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:174: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:175: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field415);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:1: method returns [String value] : ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token name=null;
        Token e=null;
        String b = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:1: ( ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:3: ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:3: ( 'public' | 'private' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_method437); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:33: 'private'
                    {
                    match(input,38,FOLLOW_38_in_method440); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:66: ( 'final' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred31()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:67: 'final'
                    {
                    match(input,40,FOLLOW_40_in_method446); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:98: ( 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:99: 'static'
                    {
                    match(input,41,FOLLOW_41_in_method452); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:132: ( 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:133: 'final'
                    {
                    match(input,40,FOLLOW_40_in_method458); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method465); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_method467); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:178: (e= WORD ( ( ',' ) (e= WORD )? )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:179: e= WORD ( ( ',' ) (e= WORD )? )*
                    {
                    e=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_method472); if (failed) return value;
                    if ( backtracking==0 ) {
                      s = e.getText();
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:201: ( ( ',' ) (e= WORD )? )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:202: ( ',' ) (e= WORD )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:202: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:203: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_method478); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:208: (e= WORD )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==WORD) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:209: e= WORD
                    	            {
                    	            e=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_method484); if (failed) return value;
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

            match(input,RPAREN,FOLLOW_RPAREN_in_method493); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method497);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:81:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:82:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:82:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            if ( backtracking==0 ) {
              value = "";
            }
            if ( input.LA(1)==LBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement515);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:82:34: (s= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LPAREN||LA18_0==LBRAC||(LA18_0>=JAVACODE && LA18_0<=WORD)||(LA18_0>=OIVAR && LA18_0<=GLOBALVAR)||LA18_0==36||LA18_0==39||LA18_0==43||(LA18_0>=45 && LA18_0<=48)||(LA18_0>=69 && LA18_0<=72)||(LA18_0>=74 && LA18_0<=76)||LA18_0==80) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:82:35: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement524);
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

            if ( input.LA(1)==RBRAC||input.LA(1)==44 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement529);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:1: varstatement returns [String value] : (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        Token w=null;
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:1: ( (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:3: (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:3: (w= 'var' | w= WORD | w= 'globalvar' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case WORD:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("86:3: (w= 'var' | w= WORD | w= 'globalvar' )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:4: w= 'var'
                    {
                    w=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_varstatement556); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:12: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_varstatement560); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:19: w= 'globalvar'
                    {
                    w=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_varstatement564); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:34: (vari= variable | ass= assignment )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||(LA20_0>=OIVAR && LA20_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA20_51 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA20_52 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_53 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA20_54 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA20_55 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA20_56 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA20_57 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA20_58 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA20_59 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA20_60 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 60, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    int LA20_4 = input.LA(3);

                    if ( (LA20_4==WORD) ) {
                        int LA20_61 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 61, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA20_4>=OIVAR && LA20_4<=GLOBALVAR)) ) {
                        int LA20_62 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 62, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EQUALS:
                case 68:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                    {
                    alt20=2;
                    }
                    break;
                case EOF:
                case MINUS:
                case LPAREN:
                case RPAREN:
                case LBRAC:
                case RBRAC:
                case JAVACODE:
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
                case 48:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 80:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA20_0==LPAREN) ) {
                switch ( input.LA(2) ) {
                case NUMBER:
                    {
                    int LA20_47 = input.LA(3);

                    if ( (LA20_47==RPAREN) ) {
                        int LA20_63 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 63, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 47, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA20_64 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 64, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA20_65 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                        {
                        int LA20_66 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 66, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA20_67 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 67, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 48, input);

                        throw nvae;
                    }

                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA20_68 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 68, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA20_69 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 69, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_70 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 70, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA20_71 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 71, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 49, input);

                        throw nvae;
                    }

                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA20_72 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 72, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                        {
                        int LA20_73 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 73, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA20_74 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 74, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 50, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 2, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("86:34: (vari= variable | ass= assignment )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:35: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement570);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      /*s = ""+vari.value;*/
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:75: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement576);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:112: ( ',' (varii= variable | ass= assignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:113: ',' (varii= variable | ass= assignment )
            	    {
            	    match(input,42,FOLLOW_42_in_varstatement582); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:117: (varii= variable | ass= assignment )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==WORD||(LA21_0>=OIVAR && LA21_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 89:
            	            {
            	            switch ( input.LA(3) ) {
            	            case MINUS:
            	                {
            	                int LA21_51 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 51, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 61:
            	                {
            	                int LA21_52 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 52, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case LPAREN:
            	                {
            	                int LA21_53 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA21_54 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 54, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA21_55 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 55, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA21_56 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 56, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA21_57 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 57, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA21_58 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 58, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA21_59 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 59, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 52:
            	            case 53:
            	                {
            	                int LA21_60 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 60, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 3, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 88:
            	            {
            	            int LA21_4 = input.LA(3);

            	            if ( (LA21_4==WORD) ) {
            	                int LA21_61 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 61, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA21_4>=OIVAR && LA21_4<=GLOBALVAR)) ) {
            	                int LA21_62 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 62, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 4, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case EQUALS:
            	        case 68:
            	        case 81:
            	        case 82:
            	        case 83:
            	        case 84:
            	        case 85:
            	        case 86:
            	        case 87:
            	            {
            	            alt21=2;
            	            }
            	            break;
            	        case EOF:
            	        case MINUS:
            	        case LPAREN:
            	        case RPAREN:
            	        case LBRAC:
            	        case RBRAC:
            	        case JAVACODE:
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
            	        case 48:
            	        case 50:
            	        case 51:
            	        case 52:
            	        case 53:
            	        case 61:
            	        case 69:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 76:
            	        case 77:
            	        case 78:
            	        case 80:
            	            {
            	            alt21=1;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA21_0==LPAREN) ) {
            	        switch ( input.LA(2) ) {
            	        case NUMBER:
            	            {
            	            int LA21_47 = input.LA(3);

            	            if ( (LA21_47==RPAREN) ) {
            	                int LA21_63 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 63, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 47, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                int LA21_64 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 64, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 89:
            	                {
            	                int LA21_65 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 65, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 88:
            	                {
            	                int LA21_66 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 66, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case RPAREN:
            	                {
            	                int LA21_67 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 67, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 48, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case LPAREN:
            	            {
            	            switch ( input.LA(3) ) {
            	            case NUMBER:
            	                {
            	                int LA21_68 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 68, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA21_69 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 69, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case LPAREN:
            	                {
            	                int LA21_70 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 70, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA21_71 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 71, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 49, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case OIVAR:
            	        case GLOBALVAR:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 89:
            	                {
            	                int LA21_72 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 72, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 88:
            	                {
            	                int LA21_73 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 73, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case RPAREN:
            	                {
            	                int LA21_74 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 74, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 50, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 2, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("86:117: (varii= variable | ass= assignment )", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:118: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement587);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              /*s += ", "+varii.value;*/
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:163: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement593);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              s += "; "+ ass;
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:1: returnstatement returns [String value] : 'return' (e= expression )? ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:1: ( 'return' (e= expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:3: 'return' (e= expression )?
            {
            match(input,46,FOLLOW_46_in_returnstatement616); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:12: (e= expression )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case MINUS:
                    {
                    int LA23_1 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case LPAREN:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case WORD:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA23_7 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA23_8 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA23_9 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 52:
                case 53:
                    {
                    int LA23_10 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA23_28 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_returnstatement621);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e.value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:93:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:94:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:94:2: 'exit'
            {
            match(input,47,FOLLOW_47_in_exitstatement638); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:4: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            match(input,48,FOLLOW_48_in_ifstatement656); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement660);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:36: ( 'then' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:37: 'then'
                    {
                    match(input,49,FOLLOW_49_in_ifstatement663); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:46: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:47: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement670);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:60: (el= elsestatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50) ) {
                    int LA25_23 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0==51) ) {
                    int LA25_24 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:61: el= elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement676);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.ifstatement(e.value,s,value);
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
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            if ( backtracking==0 ) {
              value ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:17: ( 'else' | ( 'elsif' e= expression ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==51) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("102:17: ( 'else' | ( 'elsif' e= expression ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:18: 'else'
                    {
                    match(input,50,FOLLOW_50_in_elsestatement698); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:25: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:25: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:26: 'elsif' e= expression
                    {
                    match(input,51,FOLLOW_51_in_elsestatement701); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement705);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="if "+e.value;
                    }

                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:75: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:102:76: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement714);
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

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:1: expression returns [String value] : (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        String neg = null;

        String p = null;

        String r = null;

        String n = null;

        String aa = null;

        String an = null;

        String orr = null;

        String x = null;

        expression_return e = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:1: ( (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )
            int alt27=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==NUMBER) ) {
                    int LA27_11 = input.LA(3);

                    if ( (synpred49()) ) {
                        alt27=1;
                    }
                    else if ( (synpred51()) ) {
                        alt27=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 11, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==MINUS||LA27_1==LPAREN||LA27_1==WORD||(LA27_1>=HEXNUMBER && LA27_1<=GLOBALVAR)||(LA27_1>=52 && LA27_1<=53)||LA27_1==61) ) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt27=1;
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case MINUS:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case 52:
                case 53:
                case 61:
                    {
                    alt27=2;
                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA27_82 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 82, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA27_83 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 83, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_84 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 84, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_85 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 85, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                    case HEXNUMBER:
                    case STRING:
                    case DECIMAL:
                    case 52:
                    case 53:
                    case 61:
                        {
                        alt27=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 23, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA27_92 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA27_93 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 93, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                        {
                        int LA27_94 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 94, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_95 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 95, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
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
                    case 68:
                        {
                        alt27=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 24, input);

                        throw nvae;
                    }

                    }
                    break;
                case NUMBER:
                    {
                    int LA27_27 = input.LA(3);

                    if ( (LA27_27==RPAREN) ) {
                        int LA27_101 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 101, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA27_27>=PLUS && LA27_27<=DIV)||(LA27_27>=EQUALS && LA27_27<=LTE)||(LA27_27>=53 && LA27_27<=60)||(LA27_27>=62 && LA27_27<=68)) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA27_107 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 107, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 88:
                        {
                        int LA27_108 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 108, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_109 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 109, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
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
                    case 68:
                        {
                        alt27=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 28, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 3, input);

                    throw nvae;
                }

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
                alt27=3;
                }
                break;
            case 52:
            case 53:
                {
                alt27=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("107:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:5: neg= negate
                    {
                    pushFollow(FOLLOW_negate_in_expression742);
                    neg=negate();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = neg;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:38: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression747);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:71: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression752);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:113: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression757);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:149: (aa= aexpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS) ) {
                    int LA28_29 = input.LA(2);

                    if ( (synpred52()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==PLUS||(LA28_0>=MULT && LA28_0<=DIV)||(LA28_0>=54 && LA28_0<=60)) ) {
                    int LA28_41 = input.LA(2);

                    if ( (synpred52()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:150: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression764);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:194: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 62:
                case 63:
                    {
                    int LA30_38 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA30_39 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 66:
                case 67:
                    {
                    int LA30_40 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:195: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:195: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 62:
            	    case 63:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 66:
            	    case 67:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("107:195: (an= andexpression | orr= orexpression | x= xorexpression )", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:196: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression774);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:238: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression779);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:281: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression784);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:322: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:323: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression791);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value +=" ("+e.value+")";
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

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
        return retval;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:110:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:111:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:111:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=52 && input.LA(1)<=53) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression810);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression818);
            e=expression();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:115:1: aexpression returns [String value] : a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:116:1: (a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:116:3: a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||(input.LA(1)>=54 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression836);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:116:57: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:116:58: e= expression
            {
            pushFollow(FOLLOW_expression_in_aexpression863);
            e=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.aexpression(a.getText(),e.value);
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


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt31=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt31=1;
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
            case LPAREN:
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("119:34: ( NUMBER | HEXNUMBER | STRING | variable )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value883); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value885); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value887); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:119:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value889);
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
            if ( backtracking>0 ) { memoize(input, 16, value_StartIndex); }
        }
        return value;
    }
    // $ANTLR end value


    // $ANTLR start negate
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:1: negate returns [String value] : ( '-' | '~' ) e= expression ;
    public final String negate() throws RecognitionException {
        String value = null;
        int negate_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:31: ( ( '-' | '~' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:33: ( '-' | '~' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:33: ( '-' | '~' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==MINUS) ) {
                alt32=1;
            }
            else if ( (LA32_0==61) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("122:33: ( '-' | '~' )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:34: '-'
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_negate906); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".negate()";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:122:59: '~'
                    {
                    match(input,61,FOLLOW_61_in_negate909); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".bnegate()";
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_negate915);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = e.value+value;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, negate_StartIndex); }
        }
        return value;
    }
    // $ANTLR end negate


    // $ANTLR start pexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:126:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:127:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:127:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression932); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression936);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression938); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 18, pexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:130:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:131:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:131:3: a= ( '&&' | 'and' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression955);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 19, andexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:134:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:135:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:135:3: o= ( '||' | 'or' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression976);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 20, orexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:138:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:139:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:139:3: x= ( '^^' | 'xor' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression997);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 21, xorexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:142:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )? ;
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


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:3: ( (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )?
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
            int alt33=8;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LPAREN) ) {
                    alt33=1;
                }
                else if ( (synpred79()) ) {
                    alt33=6;
                }
                else if ( (true) ) {
                    alt33=8;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("144:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 33, 1, input);

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
            case MINUS:
                {
                alt33=4;
                }
                break;
            case NUMBER:
                {
                alt33=5;
                }
                break;
            case LPAREN:
            case OIVAR:
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
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("144:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:4: f= function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression1028);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:35: h= HEXNUMBER
                    {
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1033); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(h.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:81: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression1039); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:156: '-' n= NUMBER
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_relationalExpression1042); if (failed) return value;
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1046); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:200: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1052); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:239: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression1057);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:270: d= DECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1062); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval(d.getText());
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:313: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1067); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:340: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                switch ( input.LA(2) ) {
                    case LPAREN:
                        {
                        switch ( input.LA(3) ) {
                            case NUMBER:
                                {
                                int LA35_62 = input.LA(4);

                                if ( (synpred95()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_63 = input.LA(4);

                                if ( (synpred95()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_64 = input.LA(4);

                                if ( (synpred95()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA35_65 = input.LA(4);

                                if ( (synpred95()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case WORD:
                        {
                        int LA35_55 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA35_56 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA35_57 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA35_58 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA35_59 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA35_60 = input.LA(3);

                        if ( (synpred95()) ) {
                            alt35=1;
                        }
                        }
                        break;
                }

            }
            else if ( ((LA35_0>=EQUALS && LA35_0<=LTE)||LA35_0==68) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:342: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
                    {
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==53||input.LA(1)==68 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1075);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:396: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
                    int alt34=7;
                    switch ( input.LA(1) ) {
                    case WORD:
                        {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==LPAREN) ) {
                            alt34=1;
                        }
                        else if ( (synpred93()) ) {
                            alt34=5;
                        }
                        else if ( (true) ) {
                            alt34=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("144:396: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 34, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        alt34=2;
                        }
                        break;
                    case STRING:
                        {
                        alt34=3;
                        }
                        break;
                    case NUMBER:
                        {
                        alt34=4;
                        }
                        break;
                    case LPAREN:
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        alt34=5;
                        }
                        break;
                    case DECIMAL:
                        {
                        alt34=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("144:396: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:397: f= function
                            {
                            pushFollow(FOLLOW_function_in_relationalExpression1098);
                            f=function();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = f;
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:423: h= HEXNUMBER
                            {
                            h=(Token)input.LT(1);
                            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1103); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = h.getText();
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:449: s= STRING
                            {
                            s=(Token)input.LT(1);
                            match(input,STRING,FOLLOW_STRING_in_relationalExpression1108); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.stringval(s.getText());
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:486: n= NUMBER
                            {
                            n=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1113); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.intval(n.getText());
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:520: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_relationalExpression1118);
                            v=variable();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = v.value;
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:546: d= DECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1123); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double("+d.getText()+"))";
                            }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:590: w= WORD
                            {
                            w=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_relationalExpression1128); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = w.getText();
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
            if ( backtracking>0 ) { memoize(input, 22, relationalExpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:1: repeatstatement returns [String value] : 'repeat' (e= expression )? (s= statement ) ( ';' )* ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:1: ( 'repeat' (e= expression )? (s= statement ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:3: 'repeat' (e= expression )? (s= statement ) ( ';' )*
            {
            match(input,69,FOLLOW_69_in_repeatstatement1151); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:12: (e= expression )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case MINUS:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case 52:
                case 53:
                case 61:
                    {
                    alt36=1;
                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case NUMBER:
                            {
                            int LA36_28 = input.LA(3);

                            if ( (LA36_28==RPAREN) ) {
                                int LA36_125 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_28>=PLUS && LA36_28<=DIV)||(LA36_28>=EQUALS && LA36_28<=LTE)||(LA36_28>=53 && LA36_28<=60)||(LA36_28>=62 && LA36_28<=68)) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_131 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_132 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_133 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_134 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
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
                                case 68:
                                    {
                                    alt36=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case NUMBER:
                                    {
                                    int LA36_140 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_141 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_142 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_143 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                case HEXNUMBER:
                                case STRING:
                                case DECIMAL:
                                case 52:
                                case 53:
                                case 61:
                                    {
                                    alt36=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_150 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_151 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_152 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case PLUS:
                                case MINUS:
                                case MULT:
                                case DIV:
                                case EQUALS:
                                case EQUALS2:
                                case NOT_EQUALS:
                                case GT:
                                case GTE:
                                case LT:
                                case LTE:
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
                                case 68:
                                    {
                                    alt36=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case MINUS:
                        case HEXNUMBER:
                        case STRING:
                        case DECIMAL:
                        case 52:
                        case 53:
                        case 61:
                            {
                            alt36=1;
                            }
                            break;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(2) ) {
                        case 89:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_158 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_159 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_160 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_161 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_162 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_163 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_164 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_165 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_166 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_167 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                                case NUMBER:
                                    {
                                    int LA36_168 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_169 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_170 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_171 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_172 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_173 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_174 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_175 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_176 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_177 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_178 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 88:
                            {
                            int LA36_40 = input.LA(3);

                            if ( (LA36_40==WORD) ) {
                                int LA36_179 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_40>=OIVAR && LA36_40<=GLOBALVAR)) ) {
                                int LA36_180 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA36_183 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_184 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_185 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_186 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_187 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_188 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_189 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
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
                        case 74:
                        case 75:
                        case 76:
                        case 80:
                            {
                            alt36=1;
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_191 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_192 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_193 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                    {
                                    int LA36_194 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_195 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA36_202 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_215 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 89:
                                    {
                                    int LA36_231 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_232 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_233 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                    {
                                    int LA36_234 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                                    int LA36_271 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_272 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                    {
                                    int LA36_273 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                case OIVAR:
                    {
                    switch ( input.LA(2) ) {
                        case 89:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_311 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_312 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_313 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_314 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_315 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_316 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_317 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_318 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_319 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_320 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                                case NUMBER:
                                    {
                                    int LA36_321 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_322 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_323 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_324 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 88:
                            {
                            int LA36_69 = input.LA(3);

                            if ( (LA36_69==WORD) ) {
                                int LA36_332 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_69>=OIVAR && LA36_69<=GLOBALVAR)) ) {
                                int LA36_333 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA36_336 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_337 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_338 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_339 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_340 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_341 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_342 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                        case WORD:
                        case OIVAR:
                        case GLOBALVAR:
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
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
                        case 74:
                        case 75:
                        case 76:
                        case 80:
                            {
                            alt36=1;
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
                                    int LA36_344 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_345 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_346 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_347 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_348 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_349 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_350 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_351 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_352 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_353 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 88:
                            {
                            int LA36_97 = input.LA(3);

                            if ( (LA36_97==WORD) ) {
                                int LA36_354 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_97>=OIVAR && LA36_97<=GLOBALVAR)) ) {
                                int LA36_355 = input.LA(4);

                                if ( (synpred96()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA36_358 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_359 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_360 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_361 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_362 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_363 = input.LA(4);

                                    if ( (synpred96()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_364 = input.LA(4);

                                    if ( (synpred96()) ) {
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
                        case OIVAR:
                        case GLOBALVAR:
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
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
                        case 74:
                        case 75:
                        case 76:
                        case 80:
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
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_repeatstatement1156);
                    e=expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:28: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:29: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1163);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:42: ( ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    int LA37_1 = input.LA(2);

                    if ( (synpred97()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:43: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_repeatstatement1167); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.repeatstatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, repeatstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:151:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:152:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:152:3: 'break'
            {
            match(input,70,FOLLOW_70_in_breakstatement1185); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 24, breakstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:154:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:155:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:155:3: 'continue'
            {
            match(input,71,FOLLOW_71_in_continuestatement1200); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 25, continuestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:158:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        String s = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:159:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:159:3: 'do' s= statement 'until' e= expression
            {
            match(input,72,FOLLOW_72_in_dostatement1215); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1219);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,73,FOLLOW_73_in_dostatement1221); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1225);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.dostatement(s,e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, dostatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:162:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:163:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:163:3: 'while' e= expression (s= statement )
            {
            match(input,74,FOLLOW_74_in_whilestatement1240); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1244);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:163:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:163:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1249);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.whilestatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, whilestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        String s1 = null;

        expression_return e = null;

        String s2 = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:1: ( 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:3: 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement
            {
            match(input,75,FOLLOW_75_in_forstatement1265); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1267); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1271);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1275);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:39: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==36) ) {
                    int LA38_21 = input.LA(3);

                    if ( (synpred98()) ) {
                        alt38=1;
                    }
                }
                else if ( (LA38_1==LPAREN||LA38_1==LBRAC||(LA38_1>=JAVACODE && LA38_1<=WORD)||(LA38_1>=OIVAR && LA38_1<=GLOBALVAR)||LA38_1==39||LA38_1==43||(LA38_1>=45 && LA38_1<=48)||(LA38_1>=69 && LA38_1<=72)||(LA38_1>=74 && LA38_1<=76)||LA38_1==80) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:40: ';'
                    {
                    match(input,36,FOLLOW_36_in_forstatement1278); if (failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_in_forstatement1284);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1286); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1290);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.forstatement(s1,e.value,s2,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, forstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:1: ( 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:3: 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}'
            {
            match(input,76,FOLLOW_76_in_switchstatement1305); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1308);
            expression();
            _fsp--;
            if (failed) return value;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1311); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:29: ( ( 'case' expression | 'default' ) ':' ( statement )* )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=77 && LA41_0<=78)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:30: ( 'case' expression | 'default' ) ':' ( statement )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:30: ( 'case' expression | 'default' )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==77) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==78) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("171:30: ( 'case' expression | 'default' )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:31: 'case' expression
            	            {
            	            match(input,77,FOLLOW_77_in_switchstatement1315); if (failed) return value;
            	            pushFollow(FOLLOW_expression_in_switchstatement1317);
            	            expression();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:49: 'default'
            	            {
            	            match(input,78,FOLLOW_78_in_switchstatement1319); if (failed) return value;

            	            }
            	            break;

            	    }

            	    match(input,79,FOLLOW_79_in_switchstatement1323); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:65: ( statement )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==LPAREN||LA40_0==LBRAC||(LA40_0>=JAVACODE && LA40_0<=WORD)||(LA40_0>=OIVAR && LA40_0<=GLOBALVAR)||LA40_0==36||LA40_0==39||LA40_0==43||(LA40_0>=45 && LA40_0<=48)||(LA40_0>=69 && LA40_0<=72)||(LA40_0>=74 && LA40_0<=76)||LA40_0==80) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:171:66: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1326);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1332); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 29, switchstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:174:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:175:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:175:3: 'with' e= expression s= statement
            {
            match(input,80,FOLLOW_80_in_withstatement1348); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1353);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1358);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.withstatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, withstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:178:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:179:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:179:4: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression
            {
            pushFollow(FOLLOW_variable_in_assignment1376);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==68||(input.LA(1)>=81 && input.LA(1)<=87) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1380);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1403);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.assignmentstatement(input.toString(valuee.start,valuee.stop),op.getText(),e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }
        }
        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )* ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==WORD||(LA43_0>=OIVAR && LA43_0<=GLOBALVAR)) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==89) ) {
                    alt43=1;
                }
                else if ( (LA43_1==EOF||(LA43_1>=PLUS && LA43_1<=LTE)||(LA43_1>=JAVACODE && LA43_1<=GLOBALVAR)||(LA43_1>=36 && LA43_1<=88)||LA43_1==90) ) {
                    alt43=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("183:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==LPAREN) ) {
                alt43=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("183:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:5: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1422);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = pc.variable(a);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:46: valuee= ( WORD | OIVAR | GLOBALVAR )
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1427);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(valuee.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:114: '(' ( NUMBER | variable | function ) ')' '.' WORD
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_variable1437); if (failed) return retval;
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:118: ( NUMBER | variable | function )
                    int alt42=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                        {
                        alt42=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA42_2 = input.LA(2);

                        if ( (LA42_2==RPAREN||(LA42_2>=88 && LA42_2<=89)) ) {
                            alt42=2;
                        }
                        else if ( (LA42_2==LPAREN) ) {
                            alt42=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("183:118: ( NUMBER | variable | function )", 42, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        alt42=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("183:118: ( NUMBER | variable | function )", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:119: NUMBER
                            {
                            match(input,NUMBER,FOLLOW_NUMBER_in_variable1440); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:126: variable
                            {
                            pushFollow(FOLLOW_variable_in_variable1442);
                            variable();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:135: function
                            {
                            pushFollow(FOLLOW_function_in_variable1444);
                            function();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_variable1447); if (failed) return retval;
                    match(input,88,FOLLOW_88_in_variable1449); if (failed) return retval;
                    match(input,WORD,FOLLOW_WORD_in_variable1451); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:159: ( '.' ( array | ( WORD ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==88) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:160: '.' ( array | ( WORD ) )
            	    {
            	    match(input,88,FOLLOW_88_in_variable1455); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:164: ( array | ( WORD ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==WORD) ) {
            	        int LA44_1 = input.LA(2);

            	        if ( (LA44_1==89) ) {
            	            alt44=1;
            	        }
            	        else if ( (LA44_1==EOF||(LA44_1>=PLUS && LA44_1<=LTE)||(LA44_1>=JAVACODE && LA44_1<=GLOBALVAR)||(LA44_1>=36 && LA44_1<=88)||LA44_1==90) ) {
            	            alt44=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("183:164: ( array | ( WORD ) )", 44, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA44_0>=OIVAR && LA44_0<=GLOBALVAR)) ) {
            	        alt44=1;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("183:164: ( array | ( WORD ) )", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:165: array
            	            {
            	            pushFollow(FOLLOW_array_in_variable1458);
            	            array();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:171: ( WORD )
            	            {
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:171: ( WORD )
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:183:172: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_variable1461); if (failed) return retval;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
            if ( backtracking>0 ) { memoize(input, 32, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1481); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1483); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==MINUS||LA48_0==LPAREN||(LA48_0>=WORD && LA48_0<=GLOBALVAR)||(LA48_0>=52 && LA48_0<=53)||LA48_0==61) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1488);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value;
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:49: ( ( ',' ) (e= expression )? )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==42) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:51: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_function1494); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:56: (e= expression )?
                    	    int alt46=2;
                    	    int LA46_0 = input.LA(1);

                    	    if ( (LA46_0==MINUS||LA46_0==LPAREN||(LA46_0>=WORD && LA46_0<=GLOBALVAR)||(LA46_0>=52 && LA46_0<=53)||LA46_0==61) ) {
                    	        alt46=1;
                    	    }
                    	    switch (alt46) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:187:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1500);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+e.value;
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

            match(input,RPAREN,FOLLOW_RPAREN_in_function1509); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 33, function_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21527); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21529); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MINUS||LA51_0==LPAREN||(LA51_0>=WORD && LA51_0<=GLOBALVAR)||(LA51_0>=52 && LA51_0<=53)||LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21534);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:49: ( ( ',' ) (e= expression )? )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==42) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:51: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_function21539); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:56: (e= expression )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==MINUS||LA49_0==LPAREN||(LA49_0>=WORD && LA49_0<=GLOBALVAR)||(LA49_0>=52 && LA49_0<=53)||LA49_0==61) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:191:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21545);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+input.toString(e.start,e.stop);
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

            match(input,RPAREN,FOLLOW_RPAREN_in_function21554); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 34, function2_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;

        expression_return e1 = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']'
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1574);    throw mse;
            }

            match(input,89,FOLLOW_89_in_array1582); if (failed) return value;
            pushFollow(FOLLOW_expression_in_array1586);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:52: ( ',' e1= expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:195:53: ',' e1= expression
                    {
                    match(input,42,FOLLOW_42_in_array1589); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_array1593);
                    e1=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value + ","+e1.value;
                    }

                    }
                    break;

            }

            match(input,90,FOLLOW_90_in_array1598); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 35, array_StartIndex); }
        }
        return value;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:26: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:26: method
        {
        pushFollow(FOLLOW_method_in_synpred1199);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:92: ( varstatement )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:92: varstatement
        {
        pushFollow(FOLLOW_varstatement_in_synpred7265);
        varstatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:671: ( function )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:671: function
        {
        pushFollow(FOLLOW_function_in_synpred21335);
        function();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:732: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:732: ';'
        {
        match(input,36,FOLLOW_36_in_synpred22343); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:34: ( ( 'private' | 'var' ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:34: ( 'private' | 'var' )
        {
        if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred25384);    throw mse;
        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:77: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:77: 'final'
        {
        match(input,40,FOLLOW_40_in_synpred26395); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:67: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:67: 'final'
        {
        match(input,40,FOLLOW_40_in_synpred31446); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:35: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:35: variable
        {
        pushFollow(FOLLOW_variable_in_synpred42570);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:118: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:86:118: variable
        {
        pushFollow(FOLLOW_variable_in_synpred43587);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:90:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred45621);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:61: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:98:61: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred47676);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:5: ( negate )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:5: negate
        {
        pushFollow(FOLLOW_negate_in_synpred49742);
        negate();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:38: ( pexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:38: pexpression
        {
        pushFollow(FOLLOW_pexpression_in_synpred50747);
        pexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:71: ( relationalExpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:71: relationalExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred51752);
        relationalExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:150: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:150: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred52764);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:195: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:195: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:195: ( andexpression | orexpression | xorexpression )
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
                new NoViableAltException("107:195: ( andexpression | orexpression | xorexpression )", 59, 0, input);

            throw nvae;
        }

        switch (alt59) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:196: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred55774);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:238: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred55779);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:281: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred55784);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:322: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:107:323: expression
        {
        pushFollow(FOLLOW_expression_in_synpred55791);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:239: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:239: variable
        {
        pushFollow(FOLLOW_variable_in_synpred791057);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:520: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:520: variable
        {
        pushFollow(FOLLOW_variable_in_synpred931118);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:342: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:342: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==53||input.LA(1)==68 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred951075);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:396: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
        int alt60=7;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA60_1 = input.LA(2);

            if ( (LA60_1==LPAREN) ) {
                alt60=1;
            }
            else if ( (synpred93()) ) {
                alt60=5;
            }
            else if ( (true) ) {
                alt60=7;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("144:396: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 60, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt60=2;
            }
            break;
        case STRING:
            {
            alt60=3;
            }
            break;
        case NUMBER:
            {
            alt60=4;
            }
            break;
        case LPAREN:
        case OIVAR:
        case GLOBALVAR:
            {
            alt60=5;
            }
            break;
        case DECIMAL:
            {
            alt60=6;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("144:396: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 60, 0, input);

            throw nvae;
        }

        switch (alt60) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:397: function
                {
                pushFollow(FOLLOW_function_in_synpred951098);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:423: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred951103); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:449: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred951108); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:486: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred951113); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:520: variable
                {
                pushFollow(FOLLOW_variable_in_synpred951118);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:546: DECIMAL
                {
                match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred951123); if (failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:144:590: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred951128); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred961156);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:43: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:148:43: ';'
        {
        match(input,36,FOLLOW_36_in_synpred971167); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:40: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:167:40: ';'
        {
        match(input,36,FOLLOW_36_in_synpred981278); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

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
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
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
    public final boolean synpred93() {
        backtracking++;
        int start = input.mark();
        try {
            synpred93_fragment(); // can never throw exception
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
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
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
    public final boolean synpred79() {
        backtracking++;
        int start = input.mark();
        try {
            synpred79_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
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
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
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
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_method_in_classes199 = new BitSet(new long[]{0x000023F000400002L});
    public static final BitSet FOLLOW_field_in_classes204 = new BitSet(new long[]{0x000023F000400002L});
    public static final BitSet FOLLOW_36_in_classes209 = new BitSet(new long[]{0x000023F000400002L});
    public static final BitSet FOLLOW_statement_in_code230 = new BitSet(new long[]{0x0001E89018600502L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_javacode_in_statement255 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_bstatement_in_statement260 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement265 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement270 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement275 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement280 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement285 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement290 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement295 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement300 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement305 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement310 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement315 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement320 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement325 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement330 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement335 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement338 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement343 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_JAVACODE_in_javacode362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_field380 = new BitSet(new long[]{0x0000238000400000L});
    public static final BitSet FOLLOW_set_in_field384 = new BitSet(new long[]{0x0000238000400000L});
    public static final BitSet FOLLOW_40_in_field395 = new BitSet(new long[]{0x0000238000400000L});
    public static final BitSet FOLLOW_41_in_field401 = new BitSet(new long[]{0x0000218000400000L});
    public static final BitSet FOLLOW_40_in_field407 = new BitSet(new long[]{0x0000208000400000L});
    public static final BitSet FOLLOW_varstatement_in_field415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_method437 = new BitSet(new long[]{0x0000030000400000L});
    public static final BitSet FOLLOW_38_in_method440 = new BitSet(new long[]{0x0000030000400000L});
    public static final BitSet FOLLOW_40_in_method446 = new BitSet(new long[]{0x0000030000400000L});
    public static final BitSet FOLLOW_41_in_method452 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_40_in_method458 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WORD_in_method465 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method467 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_WORD_in_method472 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_method478 = new BitSet(new long[]{0x0000040000400200L});
    public static final BitSet FOLLOW_WORD_in_method484 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method493 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_bstatement_in_method497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement515 = new BitSet(new long[]{0x0001F89018600D00L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_bstatement524 = new BitSet(new long[]{0x0001F89018600D00L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_set_in_bstatement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_varstatement556 = new BitSet(new long[]{0x0000000018400100L});
    public static final BitSet FOLLOW_WORD_in_varstatement560 = new BitSet(new long[]{0x0000000018400100L});
    public static final BitSet FOLLOW_45_in_varstatement564 = new BitSet(new long[]{0x0000000018400100L});
    public static final BitSet FOLLOW_variable_in_varstatement570 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement576 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_varstatement582 = new BitSet(new long[]{0x0000000018400100L});
    public static final BitSet FOLLOW_variable_in_varstatement587 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement593 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_46_in_returnstatement616 = new BitSet(new long[]{0x203000001FC00122L});
    public static final BitSet FOLLOW_expression_in_returnstatement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exitstatement638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ifstatement656 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_ifstatement660 = new BitSet(new long[]{0x0003E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_49_in_ifstatement663 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_ifstatement670 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement676 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_elsestatement698 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_51_in_elsestatement701 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_elsestatement705 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_elsestatement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_expression742 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_pexpression_in_expression747 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_relationalExpression_in_expression752 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_notexpression_in_expression757 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_aexpression_in_expression764 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_andexpression_in_expression774 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_orexpression_in_expression779 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_xorexpression_in_expression784 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_expression791 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_notexpression810 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_notexpression818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression836 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_aexpression863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negate906 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_61_in_negate909 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_negate915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression932 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_pexpression936 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression1028 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1033 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1039 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_relationalExpression1042 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1046 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1052 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1057 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1062 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1067 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_relationalExpression1075 = new BitSet(new long[]{0x000000001FC00100L});
    public static final BitSet FOLLOW_function_in_relationalExpression1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_repeatstatement1151 = new BitSet(new long[]{0x2031E8901FE00520L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1156 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1163 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_repeatstatement1167 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_70_in_breakstatement1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_continuestatement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_dostatement1215 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_dostatement1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_dostatement1221 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_dostatement1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_whilestatement1240 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_whilestatement1244 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_whilestatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_forstatement1265 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1267 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_forstatement1271 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_forstatement1275 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_36_in_forstatement1278 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_forstatement1284 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1286 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_forstatement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_switchstatement1305 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1308 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1311 = new BitSet(new long[]{0x0000000000000800L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_switchstatement1315 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_78_in_switchstatement1319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_switchstatement1323 = new BitSet(new long[]{0x0001E89018600D00L,0x0000000000017DE0L});
    public static final BitSet FOLLOW_statement_in_switchstatement1326 = new BitSet(new long[]{0x0001E89018600D00L,0x0000000000017DE0L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_withstatement1348 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_withstatement1353 = new BitSet(new long[]{0x0001E89018600500L,0x0000000000011DE0L});
    public static final BitSet FOLLOW_statement_in_withstatement1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1376 = new BitSet(new long[]{0x0000000000001000L,0x0000000000FE0010L});
    public static final BitSet FOLLOW_set_in_assignment1380 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_assignment1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1422 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_set_in_variable1427 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_variable1437 = new BitSet(new long[]{0x0000000018C00100L});
    public static final BitSet FOLLOW_NUMBER_in_variable1440 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variable_in_variable1442 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_function_in_variable1444 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_variable1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_variable1449 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WORD_in_variable1451 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_variable1455 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_array_in_variable1458 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_WORD_in_variable1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_WORD_in_function1481 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1483 = new BitSet(new long[]{0x203000001FC00320L});
    public static final BitSet FOLLOW_expression_in_function1488 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function1494 = new BitSet(new long[]{0x203004001FC00320L});
    public static final BitSet FOLLOW_expression_in_function1500 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21529 = new BitSet(new long[]{0x203000001FC00320L});
    public static final BitSet FOLLOW_expression_in_function21534 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function21539 = new BitSet(new long[]{0x203004001FC00320L});
    public static final BitSet FOLLOW_expression_in_function21545 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_array1582 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_array1586 = new BitSet(new long[]{0x0000040000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_42_in_array1589 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_array1593 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_array1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varstatement_in_synpred7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred21335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred22343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred25384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred26395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred31446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred42570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred43587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred45621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred47676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_synpred49742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_synpred50747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred51752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred52764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred55774 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_orexpression_in_synpred55779 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_xorexpression_in_synpred55784 = new BitSet(new long[]{0x203000001FC00120L});
    public static final BitSet FOLLOW_expression_in_synpred55791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred791057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred931118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred951075 = new BitSet(new long[]{0x000000001FC00100L});
    public static final BitSet FOLLOW_function_in_synpred951098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred951103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred951108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred951113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred951118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred951123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred951128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred961156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred971167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred981278 = new BitSet(new long[]{0x0000000000000002L});

}