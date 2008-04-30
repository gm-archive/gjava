// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2008-04-30 20:16:49

package org.gcreator.plugins.platform;
import org.gcreator.plugins.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class gscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "WORD", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'globalvar'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'~'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&='", "'^='", "'.'", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int LETTER=29;
    public static final int GTE=16;
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
    public static final int DOC_COMMENT=20;
    public static final int GT=15;
    public static final int STRING_DOUBLE=33;
    public static final int GLOBALVAR=27;
    public static final int PLUS=4;
    public static final int STRING_SINGLE=34;
    public static final int DIGIT=28;
    public static final int DIV=7;
    public static final int COMMENT=31;
    public static final int OIVAR=26;
    public static final int STRING=24;
    public static final int HEXNUMBER=23;

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[158+1];
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


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:1: ( ( (f= method | m= field ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:3: ( (f= method | m= field ) ( ';' )* )*
            {
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:24: ( (f= method | m= field ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=36 && LA3_0<=40)||LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= method | m= field ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= method | m= field )
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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 29, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 30, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 31, input);

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
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 8, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 34, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 36, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 9, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_10 = input.LA(3);

            	            if ( (LA1_10==LPAREN) ) {
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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 38, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_10==WORD||(LA1_10>=OIVAR && LA1_10<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 10, input);

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
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 1, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 40, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 41, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 42, input);

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
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 13, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 45, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 47, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 14, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 49, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_16==WORD||(LA1_16>=OIVAR && LA1_16<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 16, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 2, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 51, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 18, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 55, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_19==38||LA1_19==44) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 19, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_20 = input.LA(3);

            	            if ( (LA1_20==LPAREN) ) {
            	                int LA1_58 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 58, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_20==WORD||(LA1_20>=OIVAR && LA1_20<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 20, input);

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
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 3, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_23==38||LA1_23==44) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 23, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 63, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_25==WORD||(LA1_25>=OIVAR && LA1_25<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 25, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 4, input);

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
            	                        new NoViableAltException("53:25: (f= method | m= field )", 1, 65, input);

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
            	                    new NoViableAltException("53:25: (f= method | m= field )", 1, 27, input);

            	                throw nvae;
            	            }

            	        }
            	        else if ( (LA1_5==WORD||(LA1_5>=OIVAR && LA1_5<=GLOBALVAR)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= method | m= field )", 1, 5, input);

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
            	            new NoViableAltException("53:25: (f= method | m= field )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: f= method
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
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:71: m= field
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

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:116: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==35) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:117: ';'
            	    	    {
            	    	    match(input,35,FOLLOW_35_in_classes209); if (failed) return ;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:56:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
               pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:25: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:26: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:26: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LPAREN||LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==35||LA4_0==38||LA4_0==42||(LA4_0>=44 && LA4_0<=47)||(LA4_0>=68 && LA4_0<=71)||(LA4_0>=73 && LA4_0<=75)||LA4_0==79) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:27: s= statement
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
              System.out.println(""+pc.returncode);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:60:1: statement returns [String value] : (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* ;
    public final String statement() throws RecognitionException {
        String value = null;
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


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:1: ( (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:3: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )
            int alt5=17;
            switch ( input.LA(1) ) {
            case LBRAC:
            case 42:
                {
                alt5=1;
                }
                break;
            case 38:
            case 44:
                {
                alt5=2;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case EQUALS:
                case 67:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt5=15;
                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA5_29 = input.LA(4);

                        if ( (synpred6()) ) {
                            alt5=2;
                        }
                        else if ( (synpred20()) ) {
                            alt5=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA5_30 = input.LA(4);

                        if ( (synpred6()) ) {
                            alt5=2;
                        }
                        else if ( (synpred20()) ) {
                            alt5=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 30, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA5_31 = input.LA(4);

                        if ( (synpred6()) ) {
                            alt5=2;
                        }
                        else if ( (synpred20()) ) {
                            alt5=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 31, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA5_32 = input.LA(4);

                        if ( (synpred6()) ) {
                            alt5=2;
                        }
                        else if ( (synpred20()) ) {
                            alt5=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                    case RPAREN:
                    case HEXNUMBER:
                    case STRING:
                    case DECIMAL:
                    case 51:
                    case 52:
                    case 60:
                        {
                        alt5=16;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 21, input);

                        throw nvae;
                    }

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
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 3, input);

                    throw nvae;
                }

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
            case 68:
                {
                alt5=6;
                }
                break;
            case 71:
                {
                alt5=7;
                }
                break;
            case 73:
                {
                alt5=8;
                }
                break;
            case 70:
                {
                alt5=9;
                }
                break;
            case 69:
                {
                alt5=10;
                }
                break;
            case 74:
                {
                alt5=11;
                }
                break;
            case 75:
                {
                alt5=12;
                }
                break;
            case 79:
                {
                alt5=13;
                }
                break;
            case OIVAR:
                {
                int LA5_16 = input.LA(2);

                if ( (LA5_16==EQUALS||LA5_16==67||(LA5_16>=80 && LA5_16<=88)) ) {
                    alt5=15;
                }
                else if ( (LA5_16==LPAREN) ) {
                    alt5=14;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 16, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
            case GLOBALVAR:
                {
                alt5=15;
                }
                break;
            case 35:
                {
                alt5=17;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("61:19: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:20: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement255);
                    b=bstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += b;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:54: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement260);
                    v=varstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += v.value+";";
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:94: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement265);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += r;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:133: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement270);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += e;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:170: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement275);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ifs;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:209: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement280);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += rep;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:252: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement285);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += dos;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:291: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement290);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wh;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:331: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement295);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += con+";";
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:380: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement300);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += br+";";
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:424: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement305);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fors;
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:466: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement310);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += sw;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:507: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement315);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wit;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:548: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement320);
                    fun2=function2();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun2+";";
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:591: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement325);
                    ass=assignment();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ass+";";
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:633: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement330);
                    fun=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun+";";
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:673: ';'
                    {
                    match(input,35,FOLLOW_35_in_statement333); if (failed) return value;
                    if ( backtracking==0 ) {
                      value +=";";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:693: ( ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred21()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:694: ';'
            	    {
            	    match(input,35,FOLLOW_35_in_statement338); if (failed) return value;

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


    // $ANTLR start field
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:64:1: field returns [String value] : ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:1: ( ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:3: ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:3: ( 'public' | ( 'private' | 'var' ) )?
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

                    if ( ((LA7_2>=38 && LA7_2<=40)||LA7_2==44) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==WORD) ) {
                        int LA7_11 = input.LA(3);

                        if ( (LA7_11==WORD) ) {
                            int LA7_16 = input.LA(4);

                            if ( (synpred24()) ) {
                                alt7=2;
                            }
                        }
                        else if ( (LA7_11==LPAREN||(LA7_11>=OIVAR && LA7_11<=GLOBALVAR)) ) {
                            alt7=2;
                        }
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
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:4: 'public'
                    {
                    match(input,36,FOLLOW_36_in_field357); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:34: ( 'private' | 'var' )
                    {
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field361);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:76: ( 'final' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred25()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:77: 'final'
                    {
                    match(input,39,FOLLOW_39_in_field372); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:108: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:109: 'static'
                    {
                    match(input,40,FOLLOW_40_in_field378); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:142: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:143: 'final'
                    {
                    match(input,39,FOLLOW_39_in_field384); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:174: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:175: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field392);
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
            if ( backtracking>0 ) { memoize(input, 4, field_StartIndex); }
        }
        return value;
    }
    // $ANTLR end field


    // $ANTLR start method
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:68:1: method returns [String value] : ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token name=null;
        Token e=null;
        String b = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:1: ( ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:3: ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:3: ( 'public' | 'private' )?
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
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:4: 'public'
                    {
                    match(input,36,FOLLOW_36_in_method414); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:33: 'private'
                    {
                    match(input,37,FOLLOW_37_in_method417); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:66: ( 'final' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred30()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:67: 'final'
                    {
                    match(input,39,FOLLOW_39_in_method423); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:98: ( 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:99: 'static'
                    {
                    match(input,40,FOLLOW_40_in_method429); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:132: ( 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:133: 'final'
                    {
                    match(input,39,FOLLOW_39_in_method435); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method442); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_method444); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:178: (e= WORD ( ( ',' ) (e= WORD )? )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:179: e= WORD ( ( ',' ) (e= WORD )? )*
                    {
                    e=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_method449); if (failed) return value;
                    if ( backtracking==0 ) {
                      s = e.getText();
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:201: ( ( ',' ) (e= WORD )? )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==41) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:202: ( ',' ) (e= WORD )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:202: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:203: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_method455); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:208: (e= WORD )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==WORD) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:209: e= WORD
                    	            {
                    	            e=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_method461); if (failed) return value;
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

            match(input,RPAREN,FOLLOW_RPAREN_in_method470); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method474);
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
            if ( backtracking>0 ) { memoize(input, 5, method_StartIndex); }
        }
        return value;
    }
    // $ANTLR end method


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement492);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:34: (s= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LPAREN||LA18_0==LBRAC||LA18_0==WORD||(LA18_0>=OIVAR && LA18_0<=GLOBALVAR)||LA18_0==35||LA18_0==38||LA18_0==42||(LA18_0>=44 && LA18_0<=47)||(LA18_0>=68 && LA18_0<=71)||(LA18_0>=73 && LA18_0<=75)||LA18_0==79) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:35: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement501);
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement506);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 6, bstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end bstatement

    public static class varstatement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start varstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:77:1: varstatement returns [String value] : (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
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
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:1: ( (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:3: (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:3: (w= 'var' | w= WORD | w= 'globalvar' )
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
                    new NoViableAltException("78:3: (w= 'var' | w= WORD | w= 'globalvar' )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:4: w= 'var'
                    {
                    w=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_varstatement533); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:12: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_varstatement537); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:19: w= 'globalvar'
                    {
                    w=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_varstatement541); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:34: (vari= variable | ass= assignment )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||(LA20_0>=OIVAR && LA20_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA20_50 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 50, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 60:
                        {
                        int LA20_51 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_52 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA20_53 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA20_54 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA20_55 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA20_56 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA20_57 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA20_58 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA20_59 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 59, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 87:
                    {
                    int LA20_4 = input.LA(3);

                    if ( (LA20_4==WORD) ) {
                        int LA20_60 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 60, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA20_4>=OIVAR && LA20_4<=GLOBALVAR)) ) {
                        int LA20_61 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 61, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case MINUS:
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
                case 35:
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
                case 60:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 79:
                    {
                    alt20=1;
                    }
                    break;
                case EQUALS:
                case 67:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                    {
                    alt20=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA20_0==LPAREN) ) {
                switch ( input.LA(2) ) {
                case NUMBER:
                    {
                    int LA20_46 = input.LA(3);

                    if ( (LA20_46==RPAREN) ) {
                        int LA20_62 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 62, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 46, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA20_63 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 63, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_64 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 64, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                        {
                        int LA20_65 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 65, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA20_66 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 66, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 47, input);

                        throw nvae;
                    }

                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA20_67 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 67, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA20_68 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 68, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_69 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 69, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA20_70 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 70, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 48, input);

                        throw nvae;
                    }

                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA20_71 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 71, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                        {
                        int LA20_72 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 72, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA20_73 = input.LA(4);

                        if ( (synpred41()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 73, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 49, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 2, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("78:34: (vari= variable | ass= assignment )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:35: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement547);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      /*s = ""+vari.value;*/
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:75: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement553);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:112: ( ',' (varii= variable | ass= assignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:113: ',' (varii= variable | ass= assignment )
            	    {
            	    match(input,41,FOLLOW_41_in_varstatement559); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:117: (varii= variable | ass= assignment )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==WORD||(LA21_0>=OIVAR && LA21_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 88:
            	            {
            	            switch ( input.LA(3) ) {
            	            case MINUS:
            	                {
            	                int LA21_50 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 50, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 60:
            	                {
            	                int LA21_51 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 51, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case LPAREN:
            	                {
            	                int LA21_52 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 52, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA21_53 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA21_54 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 54, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA21_55 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 55, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA21_56 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 56, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA21_57 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 57, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA21_58 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 58, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 51:
            	            case 52:
            	                {
            	                int LA21_59 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 59, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 3, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 87:
            	            {
            	            int LA21_4 = input.LA(3);

            	            if ( (LA21_4==WORD) ) {
            	                int LA21_60 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA21_4>=OIVAR && LA21_4<=GLOBALVAR)) ) {
            	                int LA21_61 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 61, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 4, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case EOF:
            	        case MINUS:
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
            	        case 35:
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
            	        case 60:
            	        case 68:
            	        case 69:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 76:
            	        case 77:
            	        case 79:
            	            {
            	            alt21=1;
            	            }
            	            break;
            	        case EQUALS:
            	        case 67:
            	        case 80:
            	        case 81:
            	        case 82:
            	        case 83:
            	        case 84:
            	        case 85:
            	        case 86:
            	            {
            	            alt21=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA21_0==LPAREN) ) {
            	        switch ( input.LA(2) ) {
            	        case NUMBER:
            	            {
            	            int LA21_46 = input.LA(3);

            	            if ( (LA21_46==RPAREN) ) {
            	                int LA21_62 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 62, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 46, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                int LA21_63 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 63, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 88:
            	                {
            	                int LA21_64 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 64, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 87:
            	                {
            	                int LA21_65 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 65, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case RPAREN:
            	                {
            	                int LA21_66 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 66, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 47, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case LPAREN:
            	            {
            	            switch ( input.LA(3) ) {
            	            case NUMBER:
            	                {
            	                int LA21_67 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 67, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA21_68 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 68, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case LPAREN:
            	                {
            	                int LA21_69 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 69, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA21_70 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 70, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 48, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case OIVAR:
            	        case GLOBALVAR:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 88:
            	                {
            	                int LA21_71 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 71, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 87:
            	                {
            	                int LA21_72 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 72, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case RPAREN:
            	                {
            	                int LA21_73 = input.LA(4);

            	                if ( (synpred42()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 73, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 49, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 2, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("78:117: (varii= variable | ass= assignment )", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:118: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement564);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              /*s += ", "+varii.value;*/
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:163: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement570);
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
            if ( backtracking>0 ) { memoize(input, 7, varstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:1: returnstatement returns [String value] : 'return' (e= expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:1: ( 'return' (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:3: 'return' (e= expression )
            {
            match(input,45,FOLLOW_45_in_returnstatement593); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:12: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:13: e= expression
            {
            pushFollow(FOLLOW_expression_in_returnstatement598);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =e.value;
            }

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
            if ( backtracking>0 ) { memoize(input, 8, returnstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:85:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:86:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:86:2: 'exit'
            {
            match(input,46,FOLLOW_46_in_exitstatement614); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 9, exitstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:89:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:4: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            match(input,47,FOLLOW_47_in_ifstatement632); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement636);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:36: ( 'then' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:37: 'then'
                    {
                    match(input,48,FOLLOW_48_in_ifstatement639); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:46: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:47: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement646);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:60: (el= elsestatement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==49) ) {
                    int LA24_22 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==50) ) {
                    int LA24_23 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:61: el= elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement652);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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
            if ( backtracking>0 ) { memoize(input, 10, ifstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            if ( backtracking==0 ) {
              value ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:17: ( 'else' | ( 'elsif' e= expression ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            else if ( (LA25_0==50) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("94:17: ( 'else' | ( 'elsif' e= expression ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:18: 'else'
                    {
                    match(input,49,FOLLOW_49_in_elsestatement674); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:25: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:25: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:26: 'elsif' e= expression
                    {
                    match(input,50,FOLLOW_50_in_elsestatement677); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement681);
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

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:75: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:76: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement690);
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
            if ( backtracking>0 ) { memoize(input, 11, elsestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end elsestatement

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:98:1: expression returns [String value] : (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
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
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:1: ( (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )
            int alt26=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==NUMBER) ) {
                    int LA26_11 = input.LA(3);

                    if ( (synpred47()) ) {
                        alt26=1;
                    }
                    else if ( (synpred49()) ) {
                        alt26=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 11, input);

                        throw nvae;
                    }
                }
                else if ( (LA26_1==MINUS||LA26_1==LPAREN||LA26_1==WORD||(LA26_1>=HEXNUMBER && LA26_1<=GLOBALVAR)||(LA26_1>=51 && LA26_1<=52)||LA26_1==60) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt26=1;
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case MINUS:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case 51:
                case 52:
                case 60:
                    {
                    alt26=2;
                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA26_81 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 81, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA26_82 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 82, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA26_83 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 83, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA26_84 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 84, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                    case HEXNUMBER:
                    case STRING:
                    case DECIMAL:
                    case 51:
                    case 52:
                    case 60:
                        {
                        alt26=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 23, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA26_91 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 91, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA26_92 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                        {
                        int LA26_93 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 93, input);

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
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        {
                        alt26=2;
                        }
                        break;
                    case RPAREN:
                        {
                        int LA26_99 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 99, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 24, input);

                        throw nvae;
                    }

                    }
                    break;
                case NUMBER:
                    {
                    int LA26_27 = input.LA(3);

                    if ( (LA26_27==RPAREN) ) {
                        int LA26_100 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 100, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA26_27>=PLUS && LA26_27<=DIV)||(LA26_27>=EQUALS && LA26_27<=LTE)||(LA26_27>=52 && LA26_27<=59)||(LA26_27>=61 && LA26_27<=67)) ) {
                        alt26=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        int LA26_106 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 106, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 87:
                        {
                        int LA26_107 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 107, input);

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
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        {
                        alt26=2;
                        }
                        break;
                    case RPAREN:
                        {
                        int LA26_113 = input.LA(4);

                        if ( (synpred48()) ) {
                            alt26=2;
                        }
                        else if ( (synpred49()) ) {
                            alt26=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 113, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 28, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 3, input);

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
                alt26=3;
                }
                break;
            case 51:
            case 52:
                {
                alt26=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("99:4: (neg= negate | p= pexpression | r= relationalExpression | n= notexpression )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:5: neg= negate
                    {
                    pushFollow(FOLLOW_negate_in_expression718);
                    neg=negate();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = neg;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:38: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression723);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:71: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression728);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:113: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression733);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:149: (aa= aexpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==MINUS) ) {
                    int LA27_28 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==PLUS||(LA27_0>=MULT && LA27_0<=DIV)||(LA27_0>=53 && LA27_0<=59)) ) {
                    int LA27_40 = input.LA(2);

                    if ( (synpred50()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:150: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression740);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:194: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 61:
                case 62:
                    {
                    int LA29_37 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 63:
                case 64:
                    {
                    int LA29_38 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 65:
                case 66:
                    {
                    int LA29_39 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt29=1;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:195: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:195: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt28=3;
            	    switch ( input.LA(1) ) {
            	    case 61:
            	    case 62:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 63:
            	    case 64:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 65:
            	    case 66:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("99:195: (an= andexpression | orr= orexpression | x= xorexpression )", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:196: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression750);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:238: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression755);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:281: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression760);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:322: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:323: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression767);
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
            	    break loop29;
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
            if ( backtracking>0 ) { memoize(input, 12, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression786);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression794);
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
            if ( backtracking>0 ) { memoize(input, 13, notexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:107:1: aexpression returns [String value] : a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:1: (a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:3: a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||(input.LA(1)>=53 && input.LA(1)<=59) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression812);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:57: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:58: e= expression
            {
            pushFollow(FOLLOW_expression_in_aexpression839);
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
            if ( backtracking>0 ) { memoize(input, 14, aexpression_StartIndex); }
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

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt30=4;
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
            case LPAREN:
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

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value859); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value861); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value863); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value865);
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
            if ( backtracking>0 ) { memoize(input, 15, value_StartIndex); }
        }
        return value;
    }
    // $ANTLR end value


    // $ANTLR start negate
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:1: negate returns [String value] : ( '-' | '~' ) e= expression ;
    public final String negate() throws RecognitionException {
        String value = null;
        int negate_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:31: ( ( '-' | '~' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:33: ( '-' | '~' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:33: ( '-' | '~' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==MINUS) ) {
                alt31=1;
            }
            else if ( (LA31_0==60) ) {
                alt31=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("114:33: ( '-' | '~' )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:34: '-'
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_negate882); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".negate()";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:59: '~'
                    {
                    match(input,60,FOLLOW_60_in_negate885); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".bnegate()";
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_negate891);
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
            if ( backtracking>0 ) { memoize(input, 16, negate_StartIndex); }
        }
        return value;
    }
    // $ANTLR end negate


    // $ANTLR start pexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:118:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:119:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:119:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression908); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression912);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression914); if (failed) return value;
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
        return value;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:122:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:123:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:123:3: a= ( '&&' | 'and' )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression931);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 18, andexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:126:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:127:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:127:3: o= ( '||' | 'or' )
            {
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression952);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 19, orexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:130:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:131:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:131:3: x= ( '^^' | 'xor' )
            {
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=65 && input.LA(1)<=66) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression973);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 20, xorexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )? ;
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
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:3: ( (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )? )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )?
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
            int alt32=8;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==LPAREN) ) {
                    alt32=1;
                }
                else if ( (synpred77()) ) {
                    alt32=6;
                }
                else if ( (true) ) {
                    alt32=8;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("136:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 32, 1, input);

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
            case MINUS:
                {
                alt32=4;
                }
                break;
            case NUMBER:
                {
                alt32=5;
                }
                break;
            case LPAREN:
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
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("136:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:4: f= function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression1004);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:35: h= HEXNUMBER
                    {
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1009); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "(new String(\""+h.getText()+"\"))";
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:90: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression1014); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "(new String(\""+s.getText().substring(1, s.getText().length()-1)+"\"))";
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:175: '-' n= NUMBER
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_relationalExpression1017); if (failed) return value;
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1021); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "(new Integer("+n.getText()+"))";
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:229: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1027); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "(new Integer("+n.getText()+"))";
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:278: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression1032);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:309: d= DECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1037); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "(new Double("+d.getText()+"))";
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:358: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1042); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:385: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                switch ( input.LA(2) ) {
                    case LPAREN:
                        {
                        switch ( input.LA(3) ) {
                            case LPAREN:
                                {
                                int LA34_63 = input.LA(4);

                                if ( (synpred93()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA34_64 = input.LA(4);

                                if ( (synpred93()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA34_67 = input.LA(4);

                                if ( (synpred93()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA34_68 = input.LA(4);

                                if ( (synpred93()) ) {
                                    alt34=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case WORD:
                        {
                        int LA34_54 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA34_55 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA34_56 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA34_57 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA34_58 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA34_59 = input.LA(3);

                        if ( (synpred93()) ) {
                            alt34=1;
                        }
                        }
                        break;
                }

            }
            else if ( ((LA34_0>=EQUALS && LA34_0<=LTE)||LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:387: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
                    {
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==67 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1050);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:441: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )
                    int alt33=7;
                    switch ( input.LA(1) ) {
                    case WORD:
                        {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==LPAREN) ) {
                            alt33=1;
                        }
                        else if ( (synpred91()) ) {
                            alt33=5;
                        }
                        else if ( (true) ) {
                            alt33=7;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("136:441: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 33, 1, input);

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
                    case NUMBER:
                        {
                        alt33=4;
                        }
                        break;
                    case LPAREN:
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        alt33=5;
                        }
                        break;
                    case DECIMAL:
                        {
                        alt33=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("136:441: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | w= WORD )", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:442: f= function
                            {
                            pushFollow(FOLLOW_function_in_relationalExpression1073);
                            f=function();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = f;
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:468: h= HEXNUMBER
                            {
                            h=(Token)input.LT(1);
                            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1078); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = h.getText();
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:494: s= STRING
                            {
                            s=(Token)input.LT(1);
                            match(input,STRING,FOLLOW_STRING_in_relationalExpression1083); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new String("+s.getText()+"))";
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:537: n= NUMBER
                            {
                            n=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1088); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Integer("+n.getText()+"))";
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:581: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_relationalExpression1093);
                            v=variable();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = v.value;
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:607: d= DECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1098); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double("+d.getText()+"))";
                            }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:651: w= WORD
                            {
                            w=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_relationalExpression1103); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 21, relationalExpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:1: repeatstatement returns [String value] : 'repeat' (e= expression )? (s= statement ) ( ';' )* ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:1: ( 'repeat' (e= expression )? (s= statement ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:3: 'repeat' (e= expression )? (s= statement ) ( ';' )*
            {
            match(input,68,FOLLOW_68_in_repeatstatement1126); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:12: (e= expression )?
            int alt35=2;
            switch ( input.LA(1) ) {
                case MINUS:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case 51:
                case 52:
                case 60:
                    {
                    alt35=1;
                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case NUMBER:
                            {
                            int LA35_27 = input.LA(3);

                            if ( (LA35_27==RPAREN) ) {
                                int LA35_121 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_27>=PLUS && LA35_27<=DIV)||(LA35_27>=EQUALS && LA35_27<=LTE)||(LA35_27>=52 && LA35_27<=59)||(LA35_27>=61 && LA35_27<=67)) ) {
                                alt35=1;
                            }
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA35_127 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 88:
                                    {
                                    int LA35_128 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 87:
                                    {
                                    int LA35_129 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA35_130 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
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
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                    {
                                    alt35=1;
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
                                    int LA35_136 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_137 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_138 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_139 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                case HEXNUMBER:
                                case STRING:
                                case DECIMAL:
                                case 51:
                                case 52:
                                case 60:
                                    {
                                    alt35=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 88:
                                    {
                                    int LA35_146 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 87:
                                    {
                                    int LA35_147 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA35_148 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
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
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                    {
                                    alt35=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case MINUS:
                        case HEXNUMBER:
                        case STRING:
                        case DECIMAL:
                        case 51:
                        case 52:
                        case 60:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(2) ) {
                        case 88:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_154 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA35_155 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_156 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_157 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_158 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_159 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_160 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_161 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_162 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_163 = input.LA(4);

                                    if ( (synpred94()) ) {
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
                                case NUMBER:
                                    {
                                    int LA35_164 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_165 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_166 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_167 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA35_168 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA35_169 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_170 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_171 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_172 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_173 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA35_174 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 87:
                            {
                            int LA35_39 = input.LA(3);

                            if ( (LA35_39==WORD) ) {
                                int LA35_175 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_39>=OIVAR && LA35_39<=GLOBALVAR)) ) {
                                int LA35_176 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 67:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_177 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_178 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_179 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_180 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_181 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_182 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_183 = input.LA(4);

                                    if ( (synpred94()) ) {
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
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 73:
                        case 74:
                        case 75:
                        case 79:
                            {
                            alt35=1;
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 88:
                                    {
                                    int LA35_187 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_188 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 87:
                                    {
                                    int LA35_189 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_195 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA35_208 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA35_209 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 67:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                    {
                                    int LA35_225 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 88:
                                    {
                                    int LA35_226 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_227 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 87:
                                    {
                                    int LA35_228 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 67:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                    {
                                    int LA35_264 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 88:
                                    {
                                    int LA35_265 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 87:
                                    {
                                    int LA35_266 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 67:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                    {
                                    int LA35_303 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
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
                        case 88:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_304 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA35_305 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_306 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_307 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_308 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_309 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_310 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_311 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_312 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_313 = input.LA(4);

                                    if ( (synpred94()) ) {
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
                                case NUMBER:
                                    {
                                    int LA35_314 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_315 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_316 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_317 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 87:
                            {
                            int LA35_67 = input.LA(3);

                            if ( (LA35_67==WORD) ) {
                                int LA35_325 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_67>=OIVAR && LA35_67<=GLOBALVAR)) ) {
                                int LA35_326 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 67:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_327 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_328 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_329 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_330 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_331 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_332 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_333 = input.LA(4);

                                    if ( (synpred94()) ) {
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
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 73:
                        case 74:
                        case 75:
                        case 79:
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
                        case 88:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA35_337 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA35_338 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_339 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA35_340 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_341 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_342 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_343 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_344 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_345 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA35_346 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 87:
                            {
                            int LA35_94 = input.LA(3);

                            if ( (LA35_94==WORD) ) {
                                int LA35_347 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            else if ( ((LA35_94>=OIVAR && LA35_94<=GLOBALVAR)) ) {
                                int LA35_348 = input.LA(4);

                                if ( (synpred94()) ) {
                                    alt35=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 67:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA35_349 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA35_350 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA35_351 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA35_352 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA35_353 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA35_354 = input.LA(4);

                                    if ( (synpred94()) ) {
                                        alt35=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA35_355 = input.LA(4);

                                    if ( (synpred94()) ) {
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
                        case LPAREN:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
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
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 73:
                        case 74:
                        case 75:
                        case 79:
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
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_repeatstatement1131);
                    e=expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:28: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:29: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1138);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:42: ( ';' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    int LA36_1 = input.LA(2);

                    if ( (synpred95()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:43: ';'
            	    {
            	    match(input,35,FOLLOW_35_in_repeatstatement1142); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop36;
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
            if ( backtracking>0 ) { memoize(input, 22, repeatstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:143:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:144:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:144:3: 'break'
            {
            match(input,69,FOLLOW_69_in_breakstatement1160); if (failed) return value;
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
        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:146:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:147:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:147:3: 'continue'
            {
            match(input,70,FOLLOW_70_in_continuestatement1175); if (failed) return value;
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
        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:150:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        String s = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:151:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:151:3: 'do' s= statement 'until' e= expression
            {
            match(input,71,FOLLOW_71_in_dostatement1190); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1194);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,72,FOLLOW_72_in_dostatement1196); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1200);
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
            if ( backtracking>0 ) { memoize(input, 25, dostatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:3: 'while' e= expression (s= statement )
            {
            match(input,73,FOLLOW_73_in_whilestatement1215); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1219);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1224);
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
            if ( backtracking>0 ) { memoize(input, 26, whilestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:158:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        String s1 = null;

        expression_return e = null;

        String s2 = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:1: ( 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:3: 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement
            {
            match(input,74,FOLLOW_74_in_forstatement1240); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1242); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1246);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1250);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:39: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==LPAREN||LA37_1==LBRAC||LA37_1==WORD||(LA37_1>=OIVAR && LA37_1<=GLOBALVAR)||LA37_1==38||LA37_1==42||(LA37_1>=44 && LA37_1<=47)||(LA37_1>=68 && LA37_1<=71)||(LA37_1>=73 && LA37_1<=75)||LA37_1==79) ) {
                    alt37=1;
                }
                else if ( (LA37_1==35) ) {
                    int LA37_38 = input.LA(3);

                    if ( (synpred96()) ) {
                        alt37=1;
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:40: ';'
                    {
                    match(input,35,FOLLOW_35_in_forstatement1253); if (failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_in_forstatement1259);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1261); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1265);
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
            if ( backtracking>0 ) { memoize(input, 27, forstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:1: ( 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:3: 'switch' ( expression ) '{' ( ( 'case' expression | 'default' ) ':' ( statement )* )* '}'
            {
            match(input,75,FOLLOW_75_in_switchstatement1280); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1283);
            expression();
            _fsp--;
            if (failed) return value;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1286); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:29: ( ( 'case' expression | 'default' ) ':' ( statement )* )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=76 && LA40_0<=77)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:30: ( 'case' expression | 'default' ) ':' ( statement )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:30: ( 'case' expression | 'default' )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==76) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==77) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("163:30: ( 'case' expression | 'default' )", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:31: 'case' expression
            	            {
            	            match(input,76,FOLLOW_76_in_switchstatement1290); if (failed) return value;
            	            pushFollow(FOLLOW_expression_in_switchstatement1292);
            	            expression();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:49: 'default'
            	            {
            	            match(input,77,FOLLOW_77_in_switchstatement1294); if (failed) return value;

            	            }
            	            break;

            	    }

            	    match(input,78,FOLLOW_78_in_switchstatement1298); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:65: ( statement )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==LPAREN||LA39_0==LBRAC||LA39_0==WORD||(LA39_0>=OIVAR && LA39_0<=GLOBALVAR)||LA39_0==35||LA39_0==38||LA39_0==42||(LA39_0>=44 && LA39_0<=47)||(LA39_0>=68 && LA39_0<=71)||(LA39_0>=73 && LA39_0<=75)||LA39_0==79) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:66: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1301);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1307); if (failed) return value;
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
        return value;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:166:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:167:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:167:3: 'with' e= expression s= statement
            {
            match(input,79,FOLLOW_79_in_withstatement1323); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1328);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1333);
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
            if ( backtracking>0 ) { memoize(input, 29, withstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:170:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:171:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:171:4: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression
            {
            pushFollow(FOLLOW_variable_in_assignment1351);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==67||(input.LA(1)>=80 && input.LA(1)<=86) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1355);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1378);
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
            if ( backtracking>0 ) { memoize(input, 30, assignment_StartIndex); }
        }
        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )* ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD ) ( '.' ( array | ( WORD ) ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==WORD||(LA42_0>=OIVAR && LA42_0<=GLOBALVAR)) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==88) ) {
                    alt42=1;
                }
                else if ( (LA42_1==EOF||(LA42_1>=PLUS && LA42_1<=LTE)||(LA42_1>=WORD && LA42_1<=GLOBALVAR)||(LA42_1>=35 && LA42_1<=87)||LA42_1==89) ) {
                    alt42=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("175:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==LPAREN) ) {
                alt42=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("175:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) | '(' ( NUMBER | variable | function ) ')' '.' WORD )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:5: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1397);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = pc.variable(a);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:46: valuee= ( WORD | OIVAR | GLOBALVAR )
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1402);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(valuee.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:114: '(' ( NUMBER | variable | function ) ')' '.' WORD
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_variable1412); if (failed) return retval;
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:118: ( NUMBER | variable | function )
                    int alt41=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                        {
                        alt41=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA41_2 = input.LA(2);

                        if ( (LA41_2==RPAREN||(LA41_2>=87 && LA41_2<=88)) ) {
                            alt41=2;
                        }
                        else if ( (LA41_2==LPAREN) ) {
                            alt41=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("175:118: ( NUMBER | variable | function )", 41, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        alt41=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("175:118: ( NUMBER | variable | function )", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:119: NUMBER
                            {
                            match(input,NUMBER,FOLLOW_NUMBER_in_variable1415); if (failed) return retval;

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:126: variable
                            {
                            pushFollow(FOLLOW_variable_in_variable1417);
                            variable();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:135: function
                            {
                            pushFollow(FOLLOW_function_in_variable1419);
                            function();
                            _fsp--;
                            if (failed) return retval;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_variable1422); if (failed) return retval;
                    match(input,87,FOLLOW_87_in_variable1424); if (failed) return retval;
                    match(input,WORD,FOLLOW_WORD_in_variable1426); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:159: ( '.' ( array | ( WORD ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==87) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:160: '.' ( array | ( WORD ) )
            	    {
            	    match(input,87,FOLLOW_87_in_variable1430); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:164: ( array | ( WORD ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==WORD) ) {
            	        int LA43_1 = input.LA(2);

            	        if ( (LA43_1==88) ) {
            	            alt43=1;
            	        }
            	        else if ( (LA43_1==EOF||(LA43_1>=PLUS && LA43_1<=LTE)||(LA43_1>=WORD && LA43_1<=GLOBALVAR)||(LA43_1>=35 && LA43_1<=87)||LA43_1==89) ) {
            	            alt43=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("175:164: ( array | ( WORD ) )", 43, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA43_0>=OIVAR && LA43_0<=GLOBALVAR)) ) {
            	        alt43=1;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("175:164: ( array | ( WORD ) )", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:165: array
            	            {
            	            pushFollow(FOLLOW_array_in_variable1433);
            	            array();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:171: ( WORD )
            	            {
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:171: ( WORD )
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:172: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_variable1436); if (failed) return retval;

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
            if ( backtracking>0 ) { memoize(input, 31, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1456); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1458); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==MINUS||LA47_0==LPAREN||(LA47_0>=WORD && LA47_0<=GLOBALVAR)||(LA47_0>=51 && LA47_0<=52)||LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1463);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value;
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:49: ( ( ',' ) (e= expression )? )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==41) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:51: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_function1469); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:56: (e= expression )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==MINUS||LA45_0==LPAREN||(LA45_0>=WORD && LA45_0<=GLOBALVAR)||(LA45_0>=51 && LA45_0<=52)||LA45_0==60) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1475);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function1484); if (failed) return value;
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
        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21502); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21504); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==MINUS||LA50_0==LPAREN||(LA50_0>=WORD && LA50_0<=GLOBALVAR)||(LA50_0>=51 && LA50_0<=52)||LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21509);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:49: ( ( ',' ) (e= expression )? )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==41) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:51: ','
                    	    {
                    	    match(input,41,FOLLOW_41_in_function21514); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:56: (e= expression )?
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( (LA48_0==MINUS||LA48_0==LPAREN||(LA48_0>=WORD && LA48_0<=GLOBALVAR)||(LA48_0>=51 && LA48_0<=52)||LA48_0==60) ) {
                    	        alt48=1;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21520);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21529); if (failed) return value;
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
        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:186:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;

        expression_return e1 = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ( ',' e1= expression )? ']'
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1549);    throw mse;
            }

            match(input,88,FOLLOW_88_in_array1557); if (failed) return value;
            pushFollow(FOLLOW_expression_in_array1561);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:52: ( ',' e1= expression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==41) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:53: ',' e1= expression
                    {
                    match(input,41,FOLLOW_41_in_array1564); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_array1568);
                    e1=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value + ","+e1.value;
                    }

                    }
                    break;

            }

            match(input,89,FOLLOW_89_in_array1573); if (failed) return value;
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
        return value;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: method
        {
        pushFollow(FOLLOW_method_in_synpred1199);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:54: ( varstatement )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:54: varstatement
        {
        pushFollow(FOLLOW_varstatement_in_synpred6260);
        varstatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:633: ( function )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:633: function
        {
        pushFollow(FOLLOW_function_in_synpred20330);
        function();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:694: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:694: ';'
        {
        match(input,35,FOLLOW_35_in_synpred21338); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:34: ( ( 'private' | 'var' ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:34: ( 'private' | 'var' )
        {
        if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred24361);    throw mse;
        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:77: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:77: 'final'
        {
        match(input,39,FOLLOW_39_in_synpred25372); if (failed) return ;

        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:67: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:67: 'final'
        {
        match(input,39,FOLLOW_39_in_synpred30423); if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:35: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:35: variable
        {
        pushFollow(FOLLOW_variable_in_synpred41547);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:118: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:118: variable
        {
        pushFollow(FOLLOW_variable_in_synpred42564);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:61: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:61: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred45652);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:5: ( negate )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:5: negate
        {
        pushFollow(FOLLOW_negate_in_synpred47718);
        negate();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:38: ( pexpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:38: pexpression
        {
        pushFollow(FOLLOW_pexpression_in_synpred48723);
        pexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:71: ( relationalExpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:71: relationalExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred49728);
        relationalExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:150: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:150: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred50740);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:195: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:195: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:195: ( andexpression | orexpression | xorexpression )
        int alt58=3;
        switch ( input.LA(1) ) {
        case 61:
        case 62:
            {
            alt58=1;
            }
            break;
        case 63:
        case 64:
            {
            alt58=2;
            }
            break;
        case 65:
        case 66:
            {
            alt58=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("99:195: ( andexpression | orexpression | xorexpression )", 58, 0, input);

            throw nvae;
        }

        switch (alt58) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:196: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred53750);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:238: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred53755);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:281: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred53760);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:322: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:323: expression
        {
        pushFollow(FOLLOW_expression_in_synpred53767);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:278: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:278: variable
        {
        pushFollow(FOLLOW_variable_in_synpred771032);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred91
    public final void synpred91_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:581: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:581: variable
        {
        pushFollow(FOLLOW_variable_in_synpred911093);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred91

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:387: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:387: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==67 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred931050);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:441: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
        int alt59=7;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA59_1 = input.LA(2);

            if ( (LA59_1==LPAREN) ) {
                alt59=1;
            }
            else if ( (synpred91()) ) {
                alt59=5;
            }
            else if ( (true) ) {
                alt59=7;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("136:441: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 59, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt59=2;
            }
            break;
        case STRING:
            {
            alt59=3;
            }
            break;
        case NUMBER:
            {
            alt59=4;
            }
            break;
        case LPAREN:
        case OIVAR:
        case GLOBALVAR:
            {
            alt59=5;
            }
            break;
        case DECIMAL:
            {
            alt59=6;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("136:441: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 59, 0, input);

            throw nvae;
        }

        switch (alt59) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:442: function
                {
                pushFollow(FOLLOW_function_in_synpred931073);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:468: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred931078); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:494: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred931083); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:537: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred931088); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:581: variable
                {
                pushFollow(FOLLOW_variable_in_synpred931093);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:607: DECIMAL
                {
                match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred931098); if (failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:651: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred931103); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred941131);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:43: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:43: ';'
        {
        match(input,35,FOLLOW_35_in_synpred951142); if (failed) return ;

        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:40: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:40: ';'
        {
        match(input,35,FOLLOW_35_in_synpred961253); if (failed) return ;

        }
    }
    // $ANTLR end synpred96

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
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
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
    public final boolean synpred91() {
        backtracking++;
        int start = input.mark();
        try {
            synpred91_fragment(); // can never throw exception
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
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
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
    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
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
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
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
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_method_in_classes199 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_field_in_classes204 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_35_in_classes209 = new BitSet(new long[]{0x000011F800200002L});
    public static final BitSet FOLLOW_statement_in_code230 = new BitSet(new long[]{0x0000F4480C200502L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_bstatement_in_statement255 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_varstatement_in_statement260 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement265 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement270 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement275 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement280 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_dostatement_in_statement285 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement290 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement295 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement300 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_forstatement_in_statement305 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement310 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_withstatement_in_statement315 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_function2_in_statement320 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_assignment_in_statement325 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_function_in_statement330 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement333 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement338 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36_in_field357 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_set_in_field361 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_39_in_field372 = new BitSet(new long[]{0x000011C000200000L});
    public static final BitSet FOLLOW_40_in_field378 = new BitSet(new long[]{0x000010C000200000L});
    public static final BitSet FOLLOW_39_in_field384 = new BitSet(new long[]{0x0000104000200000L});
    public static final BitSet FOLLOW_varstatement_in_field392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_method414 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_37_in_method417 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_39_in_method423 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_40_in_method429 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method442 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method444 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_WORD_in_method449 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_method455 = new BitSet(new long[]{0x0000020000200200L});
    public static final BitSet FOLLOW_WORD_in_method461 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method470 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement492 = new BitSet(new long[]{0x0000FC480C200D00L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_bstatement501 = new BitSet(new long[]{0x0000FC480C200D00L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_set_in_bstatement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_varstatement533 = new BitSet(new long[]{0x000000000C200100L});
    public static final BitSet FOLLOW_WORD_in_varstatement537 = new BitSet(new long[]{0x000000000C200100L});
    public static final BitSet FOLLOW_44_in_varstatement541 = new BitSet(new long[]{0x000000000C200100L});
    public static final BitSet FOLLOW_variable_in_varstatement547 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement553 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_varstatement559 = new BitSet(new long[]{0x000000000C200100L});
    public static final BitSet FOLLOW_variable_in_varstatement564 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement570 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement593 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_returnstatement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement632 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_ifstatement636 = new BitSet(new long[]{0x0001F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_48_in_ifstatement639 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_ifstatement646 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement652 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement674 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_50_in_elsestatement677 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_elsestatement681 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_elsestatement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_expression718 = new BitSet(new long[]{0xEFE00000000000F2L,0x0000000000000007L});
    public static final BitSet FOLLOW_pexpression_in_expression723 = new BitSet(new long[]{0xEFE00000000000F2L,0x0000000000000007L});
    public static final BitSet FOLLOW_relationalExpression_in_expression728 = new BitSet(new long[]{0xEFE00000000000F2L,0x0000000000000007L});
    public static final BitSet FOLLOW_notexpression_in_expression733 = new BitSet(new long[]{0xEFE00000000000F2L,0x0000000000000007L});
    public static final BitSet FOLLOW_aexpression_in_expression740 = new BitSet(new long[]{0xEFE00000000000F2L,0x0000000000000007L});
    public static final BitSet FOLLOW_andexpression_in_expression750 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_orexpression_in_expression755 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_xorexpression_in_expression760 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_expression767 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_set_in_notexpression786 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_notexpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression812 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_aexpression839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negate882 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_60_in_negate885 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_negate891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression908 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_pexpression912 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression1004 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1009 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1014 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_relationalExpression1017 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1021 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1027 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1032 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1037 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1042 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_relationalExpression1050 = new BitSet(new long[]{0x000000000FE00100L});
    public static final BitSet FOLLOW_function_in_relationalExpression1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_repeatstatement1126 = new BitSet(new long[]{0x1018F4480FE00520L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1131 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1138 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_repeatstatement1142 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_69_in_breakstatement1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_continuestatement1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_dostatement1190 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_dostatement1194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_dostatement1196 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_dostatement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_whilestatement1215 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_whilestatement1219 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_whilestatement1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_forstatement1240 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1242 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_forstatement1246 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_forstatement1250 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_35_in_forstatement1253 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_forstatement1259 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1261 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_forstatement1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_switchstatement1280 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1283 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1286 = new BitSet(new long[]{0x0000000000000800L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_switchstatement1290 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77_in_switchstatement1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_switchstatement1298 = new BitSet(new long[]{0x0000F4480C200D00L,0x000000000000BEF0L});
    public static final BitSet FOLLOW_statement_in_switchstatement1301 = new BitSet(new long[]{0x0000F4480C200D00L,0x000000000000BEF0L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_withstatement1323 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_withstatement1328 = new BitSet(new long[]{0x0000F4480C200500L,0x0000000000008EF0L});
    public static final BitSet FOLLOW_statement_in_withstatement1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1351 = new BitSet(new long[]{0x0000000000001000L,0x00000000007F0008L});
    public static final BitSet FOLLOW_set_in_assignment1355 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_assignment1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_set_in_variable1402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_variable1412 = new BitSet(new long[]{0x000000000C600100L});
    public static final BitSet FOLLOW_NUMBER_in_variable1415 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_variable_in_variable1417 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_function_in_variable1419 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_variable1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_variable1424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_variable1426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_variable1430 = new BitSet(new long[]{0x000000000C200000L});
    public static final BitSet FOLLOW_array_in_variable1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_WORD_in_variable1436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_WORD_in_function1456 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1458 = new BitSet(new long[]{0x101800000FE00320L});
    public static final BitSet FOLLOW_expression_in_function1463 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_function1469 = new BitSet(new long[]{0x101802000FE00320L});
    public static final BitSet FOLLOW_expression_in_function1475 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21502 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21504 = new BitSet(new long[]{0x101800000FE00320L});
    public static final BitSet FOLLOW_expression_in_function21509 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_41_in_function21514 = new BitSet(new long[]{0x101802000FE00320L});
    public static final BitSet FOLLOW_expression_in_function21520 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_array1557 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_array1561 = new BitSet(new long[]{0x0000020000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_41_in_array1564 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_array1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_array1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varstatement_in_synpred6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_synpred20330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred21338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred24361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred25372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred30423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred41547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred42564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred45652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_synpred47718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_synpred48723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred49728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred50740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred53750 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_orexpression_in_synpred53755 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_xorexpression_in_synpred53760 = new BitSet(new long[]{0x101800000FE00120L});
    public static final BitSet FOLLOW_expression_in_synpred53767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred771032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred911093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred931050 = new BitSet(new long[]{0x000000000FE00100L});
    public static final BitSet FOLLOW_function_in_synpred931073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred931078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred931083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred931088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred931093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred931098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred931103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred941131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred951142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred961253 = new BitSet(new long[]{0x0000000000000002L});

}