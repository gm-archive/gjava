// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2007-11-05 03:08:04

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "WORD", "NEGINTEGER", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'static'", "'()'", "'class'", "'begin'", "'end'", "','", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&\\\\'", "'^='", "'['", "']'"
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

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[141+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g"; }

    
    public PlatformCore pc;
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    



    // $ANTLR start program
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:52:1: program returns [String value] : ( ( field | method | innerclass ) ( ';' )* )* ;
    public final String program() throws RecognitionException {
        String value = null;
        int program_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:1: ( ( ( field | method | innerclass ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:3: ( ( field | method | innerclass ) ( ';' )* )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:3: ( ( field | method | innerclass ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=39)||LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:4: ( field | method | innerclass ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:4: ( field | method | innerclass )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==39) ) {
            	            int LA1_6 = input.LA(3);

            	            if ( (LA1_6==WORD) ) {
            	                int LA1_13 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 13, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 6, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( (LA1_1==WORD) ) {
            	            int LA1_7 = input.LA(3);

            	            if ( (LA1_7==WORD) ) {
            	                int LA1_14 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 14, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_7>=OIVAR && LA1_7<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 7, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:4: ( field | method | innerclass )", 1, 1, input);

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

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 16, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 8, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( (LA1_2==WORD) ) {
            	            int LA1_9 = input.LA(3);

            	            if ( (LA1_9==WORD) ) {
            	                int LA1_17 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 17, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_9>=OIVAR && LA1_9<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 9, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:4: ( field | method | innerclass )", 1, 2, input);

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

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 19, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_10>=OIVAR && LA1_10<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 10, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:4: ( field | method | innerclass )", 1, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_4 = input.LA(2);

            	        if ( (LA1_4==WORD) ) {
            	            int LA1_11 = input.LA(3);

            	            if ( (LA1_11==EOF||LA1_11==EQUALS||LA1_11==WORD||(LA1_11>=36 && LA1_11<=39)||LA1_11==41||LA1_11==44||LA1_11==66||(LA1_11>=79 && LA1_11<=86)) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_11==40) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 11, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA1_4>=OIVAR && LA1_4<=GLOBALVAR)) ) {
            	            alt1=1;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:4: ( field | method | innerclass )", 1, 4, input);

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
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("53:4: ( field | method | innerclass )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:5: field
            	            {
            	            pushFollow(FOLLOW_field_in_program199);
            	            field();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:11: method
            	            {
            	            pushFollow(FOLLOW_method_in_program201);
            	            method();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:18: innerclass
            	            {
            	            pushFollow(FOLLOW_innerclass_in_program203);
            	            innerclass();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:30: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:31: ';'
            	    	    {
            	    	    match(input,36,FOLLOW_36_in_program207); if (failed) return value;
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

            if ( backtracking==0 ) {
              
              //write("hi");

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return value;
    }
    // $ANTLR end program


    // $ANTLR start code
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:58:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
              System.out.println("Start parsing code ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:48: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:49: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:49: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==42||(LA4_0>=45 && LA4_0<=47)||(LA4_0>=67 && LA4_0<=70)||(LA4_0>=72 && LA4_0<=74)||LA4_0==78) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:50: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code230);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return ;
            	    if ( backtracking==0 ) {
            	      pc.returncode += "\n " + s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

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
        return ;
    }
    // $ANTLR end code

    public static class statement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start statement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:62:1: statement returns [String value] : (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* ;
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


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:1: ( (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:3: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )*
            {
            if ( backtracking==0 ) {
              System.out.print("statement: "); retval.value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )
            int alt5=16;
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
                case LPAREN:
                    {
                    alt5=16;
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
                case 86:
                    {
                    alt5=15;
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
                        new NoViableAltException("63:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 2, input);

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

                if ( (LA5_14==LPAREN) ) {
                    alt5=14;
                }
                else if ( (LA5_14==EQUALS||LA5_14==66||(LA5_14>=79 && LA5_14<=86)) ) {
                    alt5=15;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 14, input);

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
                    new NoViableAltException("63:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:52: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement256);
                    b=bstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += b;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:86: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement261);
                    v=varstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += v.value;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:122: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement266);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += r;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:161: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement271);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += e;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:198: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement276);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += ifs;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:237: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement281);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += rep;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:280: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement286);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += dos;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:319: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement291);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += wh;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:359: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement296);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += con;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:404: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement301);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += br;
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:444: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement306);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fors;
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:486: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement311);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += sw;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:527: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement316);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += wit;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:568: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement321);
                    fun2=function2();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fun2;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:607: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement326);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += ass;
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:645: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement331);
                    fun=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fun;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:682: ( ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred21()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:683: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement336); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      System.out.println(";");
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
            if ( backtracking>0 ) { memoize(input, 3, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end statement


    // $ANTLR start field
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:1: field returns [String value] : ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:1: ( ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:3: ( 'public' | 'private' )? ( 'static' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:3: ( 'public' | 'private' )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_field354); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:34: 'private'
                    {
                    match(input,38,FOLLOW_38_in_field358); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:68: ( 'static' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:69: 'static'
                    {
                    match(input,39,FOLLOW_39_in_field365); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:102: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:103: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field373);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:1: method returns [String value] : ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token arg=null;
        Token name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:1: ( ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:4: ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:4: ( 'public' | 'private' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=37 && LA9_0<=38)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:
                    {
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_method390);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:26: ( 'static' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:27: 'static'
                    {
                    match(input,39,FOLLOW_39_in_method398); if (failed) return value;

                    }
                    break;

            }

            arg=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method404); if (failed) return value;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method408); if (failed) return value;
            match(input,40,FOLLOW_40_in_method410); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method412);
            bstatement();
            _fsp--;
            if (failed) return value;

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


    // $ANTLR start innerclass
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:1: innerclass returns [String value] : 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) ;
    public final String innerclass() throws RecognitionException {
        String value = null;
        int innerclass_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:2: ( 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:4: 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' )
            {
            match(input,41,FOLLOW_41_in_innerclass426); if (failed) return value;
            match(input,WORD,FOLLOW_WORD_in_innerclass428); if (failed) return value;
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass430);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:33: ( field | method )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==39) ) {
                        int LA11_6 = input.LA(3);

                        if ( (LA11_6==WORD) ) {
                            int LA11_13 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt11=1;
                            }
                            else if ( (synpred30()) ) {
                                alt11=2;
                            }


                        }


                    }
                    else if ( (LA11_2==WORD) ) {
                        int LA11_7 = input.LA(3);

                        if ( (LA11_7==WORD) ) {
                            int LA11_14 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt11=1;
                            }
                            else if ( (synpred30()) ) {
                                alt11=2;
                            }


                        }
                        else if ( ((LA11_7>=OIVAR && LA11_7<=GLOBALVAR)) ) {
                            alt11=1;
                        }


                    }


                    }
                    break;
                case 38:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (LA11_3==39) ) {
                        int LA11_8 = input.LA(3);

                        if ( (LA11_8==WORD) ) {
                            int LA11_16 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt11=1;
                            }
                            else if ( (synpred30()) ) {
                                alt11=2;
                            }


                        }


                    }
                    else if ( (LA11_3==WORD) ) {
                        int LA11_9 = input.LA(3);

                        if ( (LA11_9==WORD) ) {
                            int LA11_17 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt11=1;
                            }
                            else if ( (synpred30()) ) {
                                alt11=2;
                            }


                        }
                        else if ( ((LA11_9>=OIVAR && LA11_9<=GLOBALVAR)) ) {
                            alt11=1;
                        }


                    }


                    }
                    break;
                case 39:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (LA11_4==WORD) ) {
                        int LA11_10 = input.LA(3);

                        if ( (LA11_10==WORD) ) {
                            int LA11_19 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt11=1;
                            }
                            else if ( (synpred30()) ) {
                                alt11=2;
                            }


                        }
                        else if ( ((LA11_10>=OIVAR && LA11_10<=GLOBALVAR)) ) {
                            alt11=1;
                        }


                    }


                    }
                    break;
                case WORD:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (LA11_5==WORD) ) {
                        int LA11_11 = input.LA(3);

                        if ( ((LA11_11>=RBRAC && LA11_11<=EQUALS)||LA11_11==WORD||(LA11_11>=37 && LA11_11<=39)||(LA11_11>=43 && LA11_11<=44)||LA11_11==66||(LA11_11>=79 && LA11_11<=86)) ) {
                            alt11=1;
                        }
                        else if ( (LA11_11==40) ) {
                            alt11=2;
                        }


                    }
                    else if ( ((LA11_5>=OIVAR && LA11_5<=GLOBALVAR)) ) {
                        alt11=1;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: field
            	    {
            	    pushFollow(FOLLOW_field_in_innerclass437);
            	    field();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: method
            	    {
            	    pushFollow(FOLLOW_method_in_innerclass439);
            	    method();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop11;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass443);    throw mse;
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
        return value;
    }
    // $ANTLR end innerclass


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            if ( backtracking==0 ) {
              System.out.println("bstatement ");
            }
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement463);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:56: (s= statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LBRAC||LA12_0==WORD||(LA12_0>=OIVAR && LA12_0<=GLOBALVAR)||LA12_0==42||(LA12_0>=45 && LA12_0<=47)||(LA12_0>=67 && LA12_0<=70)||(LA12_0>=72 && LA12_0<=74)||LA12_0==78) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:57: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement472);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement477);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:1: varstatement returns [String value] : type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        Token type=null;
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:1: (type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:3: type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            if ( backtracking==0 ) {
              System.out.println("var statement ");
            }
            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_varstatement505); if (failed) return retval;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:53: (vari= variable | ass= assignment )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WORD||(LA13_0>=OIVAR && LA13_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 86:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA13_39 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA13_40 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA13_41 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA13_42 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA13_43 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA13_44 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA13_45 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 45, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA13_46 = input.LA(4);

                        if ( (synpred35()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 2, input);

                        throw nvae;
                    }

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
                    alt13=2;
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
                    alt13=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement510);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+vari.value;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:90: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement516);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:127: ( ',' (varii= variable | ass= assignment ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:128: ',' (varii= variable | ass= assignment )
            	    {
            	    match(input,44,FOLLOW_44_in_varstatement522); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:132: (varii= variable | ass= assignment )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==WORD||(LA14_0>=OIVAR && LA14_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 86:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                int LA14_39 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 39, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA14_40 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA14_41 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 41, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA14_42 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 42, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA14_43 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 43, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA14_44 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 44, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA14_45 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 45, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 51:
            	            case 52:
            	                {
            	                int LA14_46 = input.LA(4);

            	                if ( (synpred36()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 46, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 2, input);

            	                throw nvae;
            	            }

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
            	            alt14=2;
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
            	            alt14=1;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement527);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              s += ", "+varii.value;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:174: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement533);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              s += ","+ ass;
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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
        return retval;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:86:1: returnstatement returns [String value] : 'return' (e= expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:1: ( 'return' (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:3: 'return' (e= expression )
            {
            match(input,45,FOLLOW_45_in_returnstatement555); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("return statement ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:55: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:56: e= expression
            {
            pushFollow(FOLLOW_expression_in_returnstatement562);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =input.toString(e.start,e.stop);
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
            if ( backtracking>0 ) { memoize(input, 9, returnstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:90:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:91:2: 'exit'
            {
            match(input,46,FOLLOW_46_in_exitstatement578); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("exit statement");
            }
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
        return value;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:3: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              System.out.println("if statement ");
            }
            match(input,47,FOLLOW_47_in_ifstatement597); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement601);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:60: ( 'then' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:61: 'then'
                    {
                    match(input,48,FOLLOW_48_in_ifstatement604); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:70: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:71: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement611);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:84: (el= elsestatement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49) ) {
                    int LA17_19 = input.LA(2);

                    if ( (synpred39()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==50) ) {
                    int LA17_20 = input.LA(2);

                    if ( (synpred39()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:85: el= elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement617);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

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
        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:98:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:3: ( 'else' | ( 'elsif' e= expression ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            else if ( (LA18_0==50) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("99:3: ( 'else' | ( 'elsif' e= expression ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:4: 'else'
                    {
                    match(input,49,FOLLOW_49_in_elsestatement637); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:11: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:11: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:12: 'elsif' e= expression
                    {
                    match(input,50,FOLLOW_50_in_elsestatement640); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement644);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="if "+input.toString(e.start,e.stop);
                    }

                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:60: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:61: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement653);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value +=" "+input.toString(s.start,s.stop);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:1: expression returns [String value] : (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
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
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:1: ( (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:4: (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:4: (p= pexpression | r= relationalExpression | n= notexpression )
            int alt19=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt19=1;
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
                alt19=2;
                }
                break;
            case 51:
            case 52:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("104:4: (p= pexpression | r= relationalExpression | n= notexpression )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:5: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression681);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:38: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression686);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:80: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression691);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:116: (aa= aexpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=PLUS && LA20_0<=DIV)||LA20_0==NEGINTEGER||(LA20_0>=53 && LA20_0<=59)) ) {
                    int LA20_35 = input.LA(2);

                    if ( (synpred43()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:117: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression698);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:161: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 60:
                case 61:
                    {
                    int LA22_32 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 62:
                case 63:
                    {
                    int LA22_33 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA22_34 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:162: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:162: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	    case 61:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 62:
            	    case 63:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("104:162: (an= andexpression | orr= orexpression | x= xorexpression )", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:163: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression708);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:205: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression713);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:248: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression718);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:289: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:290: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression725);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value =" "+e.value;
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:107:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:108:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression744);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression752);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:1: aexpression returns [String value] : a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:1: (a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:3: a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=53 && input.LA(1)<=59) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression769);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:68: ( expression )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA23_391 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_392 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_393 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_394 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_395 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_396 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_397 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_398 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_399 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 86:
                                    {
                                    int LA23_400 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_401 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_402 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_403 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_404 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_405 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_406 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_407 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_408 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_409 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_410 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_411 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_412 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_413 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_414 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_415 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_416 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_417 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_418 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_419 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_420 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_421 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_422 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_423 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_424 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_425 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_426 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_427 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_428 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_429 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_430 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_431 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_432 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_433 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_434 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_435 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_436 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_437 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                                    int LA23_438 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_439 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_440 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_441 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_442 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_443 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_444 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_445 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                    int LA23_2 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA23_7 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
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
                                    int LA23_446 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_447 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_448 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_449 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_450 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_451 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_452 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_453 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            int LA23_335 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA23_336 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA23_337 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA23_338 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA23_339 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA23_340 = input.LA(3);

                            if ( (synpred59()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case 51:
                        case 52:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA23_732 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_733 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_734 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_735 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_736 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_737 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_738 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_739 = input.LA(4);

                                    if ( (synpred59()) ) {
                                        alt23=1;
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
                    int LA23_26 = input.LA(2);

                    if ( (synpred59()) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:69: expression
                    {
                    pushFollow(FOLLOW_expression_in_aexpression796);
                    expression();
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
            if ( backtracking>0 ) { memoize(input, 15, aexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end aexpression


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt24=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt24=1;
                }
                break;
            case HEXNUMBER:
                {
                alt24=2;
                }
                break;
            case STRING:
                {
                alt24=3;
                }
                break;
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt24=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("115:34: ( NUMBER | HEXNUMBER | STRING | variable )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value817); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value819); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value821); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:115:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value823);
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
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression839); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression843);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression845); if (failed) return value;
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
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression862);    throw mse;
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
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression883);    throw mse;
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
            if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression904);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:1: relationalExpression returns [String value] : ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
    public final String relationalExpression() throws RecognitionException {
        String value = null;
        int relationalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:3: ( ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
            int alt25=7;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
                    alt25=1;
                }
                else if ( (synpred70()) ) {
                    alt25=5;
                }
                else if ( (true) ) {
                    alt25=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("136:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt25=2;
                }
                break;
            case STRING:
                {
                alt25=3;
                }
                break;
            case NUMBER:
                {
                alt25=4;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt25=5;
                }
                break;
            case DECIMAL:
                {
                alt25=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("136:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:4: function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression928);
                    function();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:13: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression930); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:23: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression932); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:30: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression934); if (failed) return value;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:37: variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression936);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:46: DECIMAL
                    {
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression938); if (failed) return value;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:54: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression940); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:60: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA27_46 = input.LA(3);

                        if ( (synpred85()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_47 = input.LA(3);

                        if ( (synpred85()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case STRING:
                        {
                        int LA27_48 = input.LA(3);

                        if ( (synpred85()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case NUMBER:
                        {
                        int LA27_49 = input.LA(3);

                        if ( (synpred85()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_50 = input.LA(3);

                        if ( (synpred85()) ) {
                            alt27=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA27_0>=EQUALS && LA27_0<=LTE)||LA27_0==66) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression945);    throw mse;
            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt26=6;
            	    switch ( input.LA(1) ) {
            	    case WORD:
            	        {
            	        int LA26_1 = input.LA(2);

            	        if ( (LA26_1==LPAREN) ) {
            	            alt26=1;
            	        }
            	        else if ( (synpred84()) ) {
            	            alt26=5;
            	        }
            	        else if ( (true) ) {
            	            alt26=6;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 26, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case HEXNUMBER:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case STRING:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case NUMBER:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case OIVAR:
            	    case GLOBALVAR:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:114: function
            	            {
            	            pushFollow(FOLLOW_function_in_relationalExpression966);
            	            function();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:123: HEXNUMBER
            	            {
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression968); if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:133: STRING
            	            {
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression970); if (failed) return value;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:140: NUMBER
            	            {
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression972); if (failed) return value;

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:147: variable
            	            {
            	            pushFollow(FOLLOW_variable_in_relationalExpression974);
            	            variable();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:156: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression976); if (failed) return value;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

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
            if ( backtracking>0 ) { memoize(input, 21, relationalExpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:1: repeatstatement returns [String value] : 'repeat' e= expression (s= statement ) ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:1: ( 'repeat' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:3: 'repeat' e= expression (s= statement )
            {
            match(input,67,FOLLOW_67_in_repeatstatement997); if (failed) return value;
            pushFollow(FOLLOW_expression_in_repeatstatement1001);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:25: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:140:26: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1006);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

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
            match(input,68,FOLLOW_68_in_breakstatement1022); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("break;");
            }
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
            match(input,69,FOLLOW_69_in_continuestatement1039); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("continue;");
            }
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
        statement_return s = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:151:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:151:3: 'do' s= statement 'until' e= expression
            {
            match(input,70,FOLLOW_70_in_dostatement1056); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1060);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,71,FOLLOW_71_in_dostatement1062); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1066);
            e=expression();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:3: 'while' e= expression (s= statement )
            {
            match(input,72,FOLLOW_72_in_whilestatement1081); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1085);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:155:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1090);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

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
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:158:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        statement_return s1 = null;

        expression_return e = null;

        statement_return s2 = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:1: ( 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:159:3: 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement
            {
            match(input,73,FOLLOW_73_in_forstatement1106); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1108); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1112);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1116);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,36,FOLLOW_36_in_forstatement1118); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1122);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1124); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1128);
            s=statement();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            match(input,74,FOLLOW_74_in_switchstatement1143); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1146);
            expression();
            _fsp--;
            if (failed) return value;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1149); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=75 && LA29_0<=76)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1152);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expression_in_switchstatement1158);
            	    expression();
            	    _fsp--;
            	    if (failed) return value;
            	    match(input,77,FOLLOW_77_in_switchstatement1160); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:64: ( statement )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==LBRAC||LA28_0==WORD||(LA28_0>=OIVAR && LA28_0<=GLOBALVAR)||LA28_0==42||(LA28_0>=45 && LA28_0<=47)||(LA28_0>=67 && LA28_0<=70)||(LA28_0>=72 && LA28_0<=74)||LA28_0==78) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:163:65: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1163);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1169); if (failed) return value;
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

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:167:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:167:3: 'with' e= expression s= statement
            {
            match(input,78,FOLLOW_78_in_withstatement1185); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1190);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1195);
            s=statement();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:170:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:171:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:171:3: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression
            {
            if ( backtracking==0 ) {
              System.out.println("assignment ");
            }
            pushFollow(FOLLOW_variable_in_assignment1214);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==66||(input.LA(1)>=79 && input.LA(1)<=85) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1218);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1241);
            e=expression();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:3: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            {
            if ( backtracking==0 ) {
              System.out.println("variable ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==WORD||(LA30_0>=OIVAR && LA30_0<=GLOBALVAR)) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==86) ) {
                    alt30=1;
                }
                else if ( (LA30_1==EOF||(LA30_1>=PLUS && LA30_1<=LTE)||(LA30_1>=WORD && LA30_1<=GLOBALVAR)||(LA30_1>=36 && LA30_1<=39)||(LA30_1>=41 && LA30_1<=85)||LA30_1==87) ) {
                    alt30=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("175:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("175:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:39: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1261);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = a;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:175:67: valuee= ( WORD | OIVAR | GLOBALVAR )
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1266);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      retval.value = valuee.getText();
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
            match(input,WORD,FOLLOW_WORD_in_function1290); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1292); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LPAREN||LA33_0==WORD||(LA33_0>=NUMBER && LA33_0<=GLOBALVAR)||(LA33_0>=51 && LA33_0<=52)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1297);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:48: ( ( ',' ) (e= expression )? )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==44) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:49: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:49: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:50: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function1303); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:55: (e= expression )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==LPAREN||LA31_0==WORD||(LA31_0>=NUMBER && LA31_0<=GLOBALVAR)||(LA31_0>=51 && LA31_0<=52)) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:179:56: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1309);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function1318); if (failed) return value;
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
            match(input,OIVAR,FOLLOW_OIVAR_in_function21336); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21338); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN||LA36_0==WORD||(LA36_0>=NUMBER && LA36_0<=GLOBALVAR)||(LA36_0>=51 && LA36_0<=52)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21343);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:49: ( ( ',' ) (e= expression )? )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==44) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:51: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function21348); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:56: (e= expression )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==LPAREN||LA34_0==WORD||(LA34_0>=NUMBER && LA34_0<=GLOBALVAR)||(LA34_0>=51 && LA34_0<=52)) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:183:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21354);
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
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21363); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:186:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:187:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']'
            {
            if ( backtracking==0 ) {
              System.out.println("array");
            }
            valuee=(Token)input.LT(1);
            if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1385);    throw mse;
            }

            match(input,86,FOLLOW_86_in_array1393); if (failed) return value;
            pushFollow(FOLLOW_expression_in_array1397);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,87,FOLLOW_87_in_array1399); if (failed) return value;
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
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:5: ( field )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:5: field
        {
        pushFollow(FOLLOW_field_in_synpred1199);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:11: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:11: method
        {
        pushFollow(FOLLOW_method_in_synpred2201);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:683: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:683: ';'
        {
        match(input,36,FOLLOW_36_in_synpred21336); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: ( field )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: field
        {
        pushFollow(FOLLOW_field_in_synpred29437);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: method
        {
        pushFollow(FOLLOW_method_in_synpred30439);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: variable
        {
        pushFollow(FOLLOW_variable_in_synpred35510);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: variable
        {
        pushFollow(FOLLOW_variable_in_synpred36527);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:85: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:85: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred39617);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:117: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:117: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred43698);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:162: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:162: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:162: ( andexpression | orexpression | xorexpression )
        int alt40=3;
        switch ( input.LA(1) ) {
        case 60:
        case 61:
            {
            alt40=1;
            }
            break;
        case 62:
        case 63:
            {
            alt40=2;
            }
            break;
        case 64:
        case 65:
            {
            alt40=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("104:162: ( andexpression | orexpression | xorexpression )", 40, 0, input);

            throw nvae;
        }

        switch (alt40) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:163: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred46708);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:205: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred46713);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:248: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred46718);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:289: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:104:290: expression
        {
        pushFollow(FOLLOW_expression_in_synpred46725);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:69: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:112:69: expression
        {
        pushFollow(FOLLOW_expression_in_synpred59796);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:37: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:37: variable
        {
        pushFollow(FOLLOW_variable_in_synpred70936);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:147: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:147: variable
        {
        pushFollow(FOLLOW_variable_in_synpred84974);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred84

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:62: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred85945);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt41=6;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA41_1 = input.LA(2);

            if ( (LA41_1==LPAREN) ) {
                alt41=1;
            }
            else if ( (synpred84()) ) {
                alt41=5;
            }
            else if ( (true) ) {
                alt41=6;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 41, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt41=2;
            }
            break;
        case STRING:
            {
            alt41=3;
            }
            break;
        case NUMBER:
            {
            alt41=4;
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            alt41=5;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("136:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 41, 0, input);

            throw nvae;
        }

        switch (alt41) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:114: function
                {
                pushFollow(FOLLOW_function_in_synpred85966);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:123: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred85968); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:133: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred85970); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:140: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred85972); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:147: variable
                {
                pushFollow(FOLLOW_variable_in_synpred85974);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:136:156: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred85976); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred85

    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred70() {
        backtracking++;
        int start = input.mark();
        try {
            synpred70_fragment(); // can never throw exception
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
    public final boolean synpred46() {
        backtracking++;
        int start = input.mark();
        try {
            synpred46_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred84() {
        backtracking++;
        int start = input.mark();
        try {
            synpred84_fragment(); // can never throw exception
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
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
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
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_field_in_program199 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_method_in_program201 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_innerclass_in_program203 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_36_in_program207 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_statement_in_code230 = new BitSet(new long[]{0x0000E40018200402L,0x0000000000004778L});
    public static final BitSet FOLLOW_bstatement_in_statement256 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement261 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement266 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement271 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement276 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement281 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement286 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement291 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement296 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement301 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement306 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement311 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement316 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement321 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement326 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement331 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement336 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_field354 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_38_in_field358 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_field365 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varstatement_in_field373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_method390 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method398 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method404 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method408 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_method410 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_innerclass426 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_innerclass428 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_innerclass430 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_field_in_innerclass437 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_method_in_innerclass439 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_set_in_innerclass443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement463 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_bstatement472 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_set_in_bstatement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_varstatement505 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement510 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement516 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_varstatement522 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement527 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement533 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement555 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_returnstatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement597 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_ifstatement601 = new BitSet(new long[]{0x0001E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_48_in_ifstatement604 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_ifstatement611 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement617 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement637 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_50_in_elsestatement640 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_elsestatement644 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_elsestatement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression681 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_relationalExpression_in_expression686 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_notexpression_in_expression691 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_aexpression_in_expression698 = new BitSet(new long[]{0xFFE00000004000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_andexpression_in_expression708 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_expression713 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_expression718 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_expression725 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_notexpression744 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_notexpression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression769 = new BitSet(new long[]{0x001800001FA00102L});
    public static final BitSet FOLLOW_expression_in_aexpression796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression839 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_pexpression843 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression928 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression930 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression932 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression934 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression936 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression938 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression940 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_relationalExpression945 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_relationalExpression966 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression968 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression970 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression972 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression974 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression976 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_repeatstatement997 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1001 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_breakstatement1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_continuestatement1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_dostatement1056 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_dostatement1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_dostatement1062 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_dostatement1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_whilestatement1081 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_whilestatement1085 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_whilestatement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_forstatement1106 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1108 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1112 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_forstatement1116 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement1118 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1122 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1124 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_switchstatement1143 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1146 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1149 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_switchstatement1152 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_switchstatement1160 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_statement_in_switchstatement1163 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_withstatement1185 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_withstatement1190 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_withstatement1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1214 = new BitSet(new long[]{0x0000000000001000L,0x00000000003F8004L});
    public static final BitSet FOLLOW_set_in_assignment1218 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_assignment1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1290 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1292 = new BitSet(new long[]{0x001800001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1297 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function1303 = new BitSet(new long[]{0x001810001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1309 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21336 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21338 = new BitSet(new long[]{0x001800001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21343 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function21348 = new BitSet(new long[]{0x001810001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21354 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array1393 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_array1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_array1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred21336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred29437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred30439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred35510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred36527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred39617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred43698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred46708 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_synpred46713 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred46718 = new BitSet(new long[]{0x001800001FA00100L});
    public static final BitSet FOLLOW_expression_in_synpred46725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred59796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred70936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred84974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred85945 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_synpred85966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred85968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred85970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred85972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred85974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred85976 = new BitSet(new long[]{0x0000000000000002L});

}