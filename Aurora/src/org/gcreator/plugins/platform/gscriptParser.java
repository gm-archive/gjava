// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2007-11-05 00:19:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "DOC_COMMENT", "WORD", "NUMBER", "NEGINTEGER", "HEXNUMBER", "STRING", "DECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'static'", "'()'", "'class'", "'begin'", "'end'", "','", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&\\\\'", "'^='", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int LETTER=30;
    public static final int GTE=16;
    public static final int NUMBER=22;
    public static final int WHITESPACE=31;
    public static final int NEGINTEGER=23;
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
            ruleMemo = new HashMap[142+1];
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
            	    case 38:
            	        {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==39) ) {
            	            int LA1_5 = input.LA(3);

            	            if ( (LA1_5==WORD) ) {
            	                int LA1_9 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
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
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 5, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( (LA1_1==WORD) ) {
            	            int LA1_6 = input.LA(3);

            	            if ( (LA1_6==WORD) ) {
            	                int LA1_10 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
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
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 6, input);

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
            	    case 39:
            	        {
            	        int LA1_2 = input.LA(2);

            	        if ( (LA1_2==WORD) ) {
            	            int LA1_7 = input.LA(3);

            	            if ( (LA1_7==WORD) ) {
            	                int LA1_11 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (synpred2()) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:4: ( field | method | innerclass )", 1, 11, input);

            	                    throw nvae;
            	                }
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
            	                new NoViableAltException("53:4: ( field | method | innerclass )", 1, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_3 = input.LA(2);

            	        if ( (LA1_3==WORD) ) {
            	            int LA1_8 = input.LA(3);

            	            if ( (LA1_8==EQUALS) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_8==40) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return value;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:4: ( field | method | innerclass )", 1, 8, input);

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:58:1: code : ( ( statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:1: ( ( ( statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:3: ( ( statement )* )
            {
            if ( backtracking==0 ) {
              System.out.println("Start parsing value ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:49: ( ( statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:50: ( statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:50: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==42||(LA4_0>=45 && LA4_0<=47)||(LA4_0>=67 && LA4_0<=70)||(LA4_0>=72 && LA4_0<=74)||LA4_0==78) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:51: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code227);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

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


    // $ANTLR start statement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:62:1: statement returns [String value] : ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )* ;
    public final String statement() throws RecognitionException {
        String value = null;
        int statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:1: ( ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )*
            {
            if ( backtracking==0 ) {
              System.out.print("statement: ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:38: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )
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
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:38: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 5, 2, input);

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
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:38: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 5, 14, input);

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
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("63:38: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:39: bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement250);
                    bstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:50: varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement252);
                    varstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:63: returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement254);
                    returnstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:79: exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement256);
                    exitstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:93: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement258);
                    ifstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:105: repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement260);
                    repeatstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:121: dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement262);
                    dostatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:133: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement264);
                    whilestatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:148: continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement266);
                    continuestatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:166: breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement268);
                    breakstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:181: forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement270);
                    forstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:194: switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement272);
                    switchstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:210: withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement274);
                    withstatement();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:224: function2
                    {
                    pushFollow(FOLLOW_function2_in_statement276);
                    function2();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:234: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement278);
                    assignment();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:245: function
                    {
                    pushFollow(FOLLOW_function_in_statement280);
                    function();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:255: ( ';' )*
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
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:256: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement284); if (failed) return value;
            	    if ( backtracking==0 ) {
            	      System.out.println(";");
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( backtracking==0 ) {
              System.out.print("statement ");
            }

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:1: field returns [String value] : ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        Token type=null;
        Token name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:1: ( ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:3: ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:3: ( 'public' | 'private' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=37 && LA7_0<=38)) ) {
                alt7=1;
            }
            switch (alt7) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field302);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:25: ( 'static' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:26: 'static'
                    {
                    match(input,39,FOLLOW_39_in_field310); if (failed) return value;

                    }
                    break;

            }

            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_field316); if (failed) return value;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_field320); if (failed) return value;
            match(input,EQUALS,FOLLOW_EQUALS_in_field322); if (failed) return value;
            if ( (input.LA(1)>=WORD && input.LA(1)<=NUMBER) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field324);    throw mse;
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_method343);    throw mse;
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
                    match(input,39,FOLLOW_39_in_method351); if (failed) return value;

                    }
                    break;

            }

            arg=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method357); if (failed) return value;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method361); if (failed) return value;
            match(input,40,FOLLOW_40_in_method363); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method365);
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
            match(input,41,FOLLOW_41_in_innerclass379); if (failed) return value;
            match(input,WORD,FOLLOW_WORD_in_innerclass381); if (failed) return value;
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass383);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:33: ( field | method )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 37:
                case 38:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==39) ) {
                        int LA11_5 = input.LA(3);

                        if ( (LA11_5==WORD) ) {
                            int LA11_9 = input.LA(4);

                            if ( (synpred30()) ) {
                                alt11=1;
                            }
                            else if ( (synpred31()) ) {
                                alt11=2;
                            }


                        }


                    }
                    else if ( (LA11_2==WORD) ) {
                        int LA11_6 = input.LA(3);

                        if ( (LA11_6==WORD) ) {
                            int LA11_10 = input.LA(4);

                            if ( (synpred30()) ) {
                                alt11=1;
                            }
                            else if ( (synpred31()) ) {
                                alt11=2;
                            }


                        }


                    }


                    }
                    break;
                case 39:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (LA11_3==WORD) ) {
                        int LA11_7 = input.LA(3);

                        if ( (LA11_7==WORD) ) {
                            int LA11_11 = input.LA(4);

                            if ( (synpred30()) ) {
                                alt11=1;
                            }
                            else if ( (synpred31()) ) {
                                alt11=2;
                            }


                        }


                    }


                    }
                    break;
                case WORD:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (LA11_4==WORD) ) {
                        int LA11_8 = input.LA(3);

                        if ( (LA11_8==EQUALS) ) {
                            alt11=1;
                        }
                        else if ( (LA11_8==40) ) {
                            alt11=2;
                        }


                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: field
            	    {
            	    pushFollow(FOLLOW_field_in_innerclass390);
            	    field();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: method
            	    {
            	    pushFollow(FOLLOW_method_in_innerclass392);
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass396);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:78:1: bstatement returns [String value] : ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:1: ( ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:3: ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement416);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:56: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LBRAC||LA12_0==WORD||(LA12_0>=OIVAR && LA12_0<=GLOBALVAR)||LA12_0==42||(LA12_0>=45 && LA12_0<=47)||(LA12_0>=67 && LA12_0<=70)||(LA12_0>=72 && LA12_0<=74)||LA12_0==78) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:79:57: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement423);
            	    statement();
            	    _fsp--;
            	    if (failed) return value;

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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement427);    throw mse;
            }

            if ( backtracking==0 ) {
              System.out.print("bstatement ");
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


    // $ANTLR start varstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:82:1: varstatement returns [String value] : type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final String varstatement() throws RecognitionException {
        String value = null;
        int varstatement_StartIndex = input.index();
        Token type=null;
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:1: (type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:3: type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            if ( backtracking==0 ) {
              System.out.println("var statement ");
            }
            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_varstatement455); if (failed) return value;
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
                        int LA13_35 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 35, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA13_36 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 36, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA13_37 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 37, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA13_38 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA13_39 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA13_40 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA13_41 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                    case 52:
                        {
                        int LA13_42 = input.LA(4);

                        if ( (synpred36()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
                            alt13=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 2, input);

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
                default:
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("83:53: (vari= variable | ass= assignment )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement460);
                    vari=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      s = ""+vari.value;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:90: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement466);
                    ass=assignment();
                    _fsp--;
                    if (failed) return value;
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
            	    match(input,44,FOLLOW_44_in_varstatement472); if (failed) return value;
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
            	                int LA14_35 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 35, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA14_36 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 36, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA14_37 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 37, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA14_38 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 38, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA14_39 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 39, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA14_40 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA14_41 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 41, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 51:
            	            case 52:
            	                {
            	                int LA14_42 = input.LA(4);

            	                if ( (synpred37()) ) {
            	                    alt14=1;
            	                }
            	                else if ( (true) ) {
            	                    alt14=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return value;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 42, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return value;}
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
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("83:132: (varii= variable | ass= assignment )", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement477);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return value;
            	            if ( backtracking==0 ) {
            	              s += ", "+varii.value;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:174: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement483);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return value;
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
              System.out.println(" endvar statement ");
            }
            if ( backtracking==0 ) {
              pc.varstatement(type.getText(),s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, varstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:86:1: returnstatement returns [String value] : 'return' ( expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:1: ( 'return' ( expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:3: 'return' ( expression )
            {
            match(input,45,FOLLOW_45_in_returnstatement506); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.print("return ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:43: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:87:44: expression
            {
            pushFollow(FOLLOW_expression_in_returnstatement511);
            expression();
            _fsp--;
            if (failed) return value;

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
            match(input,46,FOLLOW_46_in_exitstatement526); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:94:1: ifstatement returns [String value] : 'if' expression ( 'then' )? ( statement ) ( elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:1: ( 'if' expression ( 'then' )? ( statement ) ( elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:3: 'if' expression ( 'then' )? ( statement ) ( elsestatement )*
            {
            if ( backtracking==0 ) {
              System.out.println("if statement ");
            }
            match(input,47,FOLLOW_47_in_ifstatement545); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement547);
            expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:58: ( 'then' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:59: 'then'
                    {
                    match(input,48,FOLLOW_48_in_ifstatement550); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:68: ( statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:69: statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement555);
            statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:80: ( elsestatement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49) ) {
                    int LA17_19 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==50) ) {
                    int LA17_20 = input.LA(2);

                    if ( (synpred40()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:81: elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement559);
            	    elsestatement();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop17;
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
            if ( backtracking>0 ) { memoize(input, 11, ifstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:98:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' expression ) ) ( statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:1: ( ( 'else' | ( 'elsif' expression ) ) ( statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:3: ( 'else' | ( 'elsif' expression ) ) ( statement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:3: ( 'else' | ( 'elsif' expression ) )
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
                    new NoViableAltException("99:3: ( 'else' | ( 'elsif' expression ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:4: 'else'
                    {
                    match(input,49,FOLLOW_49_in_elsestatement578); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:11: ( 'elsif' expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:11: ( 'elsif' expression )
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:12: 'elsif' expression
                    {
                    match(input,50,FOLLOW_50_in_elsestatement581); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement583);
                    expression();
                    _fsp--;
                    if (failed) return value;

                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:33: ( statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:99:34: statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement588);
            statement();
            _fsp--;
            if (failed) return value;

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
            if ( backtracking>0 ) { memoize(input, 12, elsestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end elsestatement

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:1: expression returns [String value] : e= ( pexpression | relationalExpression | notexpression ) (aa= aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Token e=null;
        aexpression_return aa = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:1: (e= ( pexpression | relationalExpression | notexpression ) (aa= aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:4: e= ( pexpression | relationalExpression | notexpression ) (aa= aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:6: ( pexpression | relationalExpression | notexpression )
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
                    new NoViableAltException("103:6: ( pexpression | relationalExpression | notexpression )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:7: pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression613);
                    pexpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:19: relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression615);
                    relationalExpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:40: notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression617);
                    notexpression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:55: (aa= aexpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=PLUS && LA20_0<=DIV)||LA20_0==NEGINTEGER||(LA20_0>=53 && LA20_0<=59)) ) {
                    int LA20_35 = input.LA(2);

                    if ( (synpred44()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:56: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression623);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      a+= input.toString(aa.start,aa.stop);
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:89: ( ( andexpression | orexpression | xorexpression ) ( expression ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 60:
                case 61:
                    {
                    int LA22_32 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 62:
                case 63:
                    {
                    int LA22_33 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA22_34 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:90: ( andexpression | orexpression | xorexpression ) ( expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:90: ( andexpression | orexpression | xorexpression )
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
            	            new NoViableAltException("103:90: ( andexpression | orexpression | xorexpression )", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:91: andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression631);
            	            andexpression();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:105: orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression633);
            	            orexpression();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:118: xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression635);
            	            xorexpression();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:133: ( expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:134: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression639);
            	    expression();
            	    _fsp--;
            	    if (failed) return retval;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( backtracking==0 ) {
              retval.value ="";
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:106:1: notexpression returns [String value] : n= ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:107:1: (n= ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:107:3: n= ( 'not' | '!' ) e= expression
            {
            n=(Token)input.LT(1);
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression659);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression667);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =n.getText()+" "+input.toString(e.start,e.stop);
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

    public static class aexpression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:1: aexpression returns [String value] : a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final aexpression_return aexpression() throws RecognitionException {
        aexpression_return retval = new aexpression_return();
        retval.start = input.LT(1);
        int aexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:1: (a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:3: a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=53 && input.LA(1)<=59) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression684);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:68: ( expression )?
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
                                    int LA23_359 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_360 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_361 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_362 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_363 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_364 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_365 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_366 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_367 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 86:
                                    {
                                    int LA23_368 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_369 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_370 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_371 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_372 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_373 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_374 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_375 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_376 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_377 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_378 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_379 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_380 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_381 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_382 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_383 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_384 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_385 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_386 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_387 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_388 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_389 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_390 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_391 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_392 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_393 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_394 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_395 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_396 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_397 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_398 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_399 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_400 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_401 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA23_402 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA23_403 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA23_404 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA23_405 = input.LA(4);

                                    if ( (synpred60()) ) {
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
                                    int LA23_406 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_407 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_408 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_409 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_410 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_411 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_412 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_413 = input.LA(4);

                                    if ( (synpred60()) ) {
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

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA23_7 = input.LA(2);

                    if ( (synpred60()) ) {
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
                                    int LA23_414 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_415 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_416 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_417 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_418 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_419 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_420 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_421 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            int LA23_307 = input.LA(3);

                            if ( (synpred60()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA23_308 = input.LA(3);

                            if ( (synpred60()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA23_309 = input.LA(3);

                            if ( (synpred60()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA23_310 = input.LA(3);

                            if ( (synpred60()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA23_311 = input.LA(3);

                            if ( (synpred60()) ) {
                                alt23=1;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA23_312 = input.LA(3);

                            if ( (synpred60()) ) {
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
                                    int LA23_676 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA23_677 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA23_678 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA23_679 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA23_680 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA23_681 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA23_682 = input.LA(4);

                                    if ( (synpred60()) ) {
                                        alt23=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA23_683 = input.LA(4);

                                    if ( (synpred60()) ) {
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

                    if ( (synpred60()) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:69: expression
                    {
                    pushFollow(FOLLOW_expression_in_aexpression711);
                    expression();
                    _fsp--;
                    if (failed) return retval;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              retval.value =a.getText();
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, aexpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end aexpression


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:34: ( NUMBER | HEXNUMBER | STRING | variable )
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
                    new NoViableAltException("114:34: ( NUMBER | HEXNUMBER | STRING | variable )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value732); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value734); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value736); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:114:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value738);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:117:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:118:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:118:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression754); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression758);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression760); if (failed) return value;
            if ( backtracking==0 ) {
              value =input.toString(e.start,e.stop);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:121:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:122:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:122:3: a= ( '&&' | 'and' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression777);    throw mse;
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
            if ( backtracking>0 ) { memoize(input, 18, andexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:125:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:126:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:126:3: o= ( '||' | 'or' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression798);    throw mse;
            }

            if ( backtracking==0 ) {
              value =o.getText();
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:129:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:130:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:130:3: x= ( '^^' | 'xor' )
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression819);    throw mse;
            }

            if ( backtracking==0 ) {
              value =x.getText();
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:1: relationalExpression returns [String value] : ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
    public final String relationalExpression() throws RecognitionException {
        String value = null;
        int relationalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:3: ( ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
            int alt25=7;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
                    alt25=1;
                }
                else if ( (synpred71()) ) {
                    alt25=5;
                }
                else if ( (true) ) {
                    alt25=7;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("135:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 25, 1, input);

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
                    new NoViableAltException("135:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:4: function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression843);
                    function();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:13: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression845); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:23: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression847); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:30: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression849); if (failed) return value;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:37: variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression851);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:46: DECIMAL
                    {
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression853); if (failed) return value;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:54: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression855); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:60: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA27_42 = input.LA(3);

                        if ( (synpred86()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_43 = input.LA(3);

                        if ( (synpred86()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case STRING:
                        {
                        int LA27_44 = input.LA(3);

                        if ( (synpred86()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case NUMBER:
                        {
                        int LA27_45 = input.LA(3);

                        if ( (synpred86()) ) {
                            alt27=1;
                        }


                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_46 = input.LA(3);

                        if ( (synpred86()) ) {
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
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression860);    throw mse;
            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt26=6;
            	    switch ( input.LA(1) ) {
            	    case WORD:
            	        {
            	        int LA26_1 = input.LA(2);

            	        if ( (LA26_1==LPAREN) ) {
            	            alt26=1;
            	        }
            	        else if ( (synpred85()) ) {
            	            alt26=5;
            	        }
            	        else if ( (true) ) {
            	            alt26=6;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return value;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 26, 1, input);

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
            	            new NoViableAltException("135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:114: function
            	            {
            	            pushFollow(FOLLOW_function_in_relationalExpression881);
            	            function();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:123: HEXNUMBER
            	            {
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression883); if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:133: STRING
            	            {
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression885); if (failed) return value;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:140: NUMBER
            	            {
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression887); if (failed) return value;

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:147: variable
            	            {
            	            pushFollow(FOLLOW_variable_in_relationalExpression889);
            	            variable();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:156: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression891); if (failed) return value;

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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:138:1: repeatstatement returns [String value] : 'repeat' expression ( statement ) ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:1: ( 'repeat' expression ( statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:3: 'repeat' expression ( statement )
            {
            match(input,67,FOLLOW_67_in_repeatstatement912); if (failed) return value;
            pushFollow(FOLLOW_expression_in_repeatstatement914);
            expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:23: ( statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:139:24: statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement917);
            statement();
            _fsp--;
            if (failed) return value;

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
            if ( backtracking>0 ) { memoize(input, 22, repeatstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:142:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:143:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:143:3: 'break'
            {
            match(input,68,FOLLOW_68_in_breakstatement933); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("break;");
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
            if ( backtracking>0 ) { memoize(input, 23, breakstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:145:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:146:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:146:3: 'continue'
            {
            match(input,69,FOLLOW_69_in_continuestatement950); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("continue;");
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
            if ( backtracking>0 ) { memoize(input, 24, continuestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:149:1: dostatement returns [String value] : 'do' statement 'until' expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:150:1: ( 'do' statement 'until' expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:150:3: 'do' statement 'until' expression
            {
            match(input,70,FOLLOW_70_in_dostatement967); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement969);
            statement();
            _fsp--;
            if (failed) return value;
            match(input,71,FOLLOW_71_in_dostatement971); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement973);
            expression();
            _fsp--;
            if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 25, dostatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:153:1: whilestatement returns [String value] : 'while' expression ( statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:1: ( 'while' expression ( statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:3: 'while' expression ( statement )
            {
            match(input,72,FOLLOW_72_in_whilestatement988); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement990);
            expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:22: ( statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:154:23: statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement993);
            statement();
            _fsp--;
            if (failed) return value;

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
            if ( backtracking>0 ) { memoize(input, 26, whilestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:157:1: forstatement returns [String value] : 'for' '(' statement expression ';' statement ')' statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:158:1: ( 'for' '(' statement expression ';' statement ')' statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:158:3: 'for' '(' statement expression ';' statement ')' statement
            {
            match(input,73,FOLLOW_73_in_forstatement1009); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1011); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1013);
            statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1015);
            expression();
            _fsp--;
            if (failed) return value;
            match(input,36,FOLLOW_36_in_forstatement1017); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1019);
            statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1021); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1023);
            statement();
            _fsp--;
            if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 27, forstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            match(input,74,FOLLOW_74_in_switchstatement1038); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1041);
            expression();
            _fsp--;
            if (failed) return value;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1044); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=75 && LA29_0<=76)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1047);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expression_in_switchstatement1053);
            	    expression();
            	    _fsp--;
            	    if (failed) return value;
            	    match(input,77,FOLLOW_77_in_switchstatement1055); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:64: ( statement )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==LBRAC||LA28_0==WORD||(LA28_0>=OIVAR && LA28_0<=GLOBALVAR)||LA28_0==42||(LA28_0>=45 && LA28_0<=47)||(LA28_0>=67 && LA28_0<=70)||(LA28_0>=72 && LA28_0<=74)||LA28_0==78) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:162:65: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1058);
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

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1064); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:165:1: withstatement returns [String value] : 'with' expression statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:166:1: ( 'with' expression statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:166:3: 'with' expression statement
            {
            match(input,78,FOLLOW_78_in_withstatement1080); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1083);
            expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1086);
            statement();
            _fsp--;
            if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 29, withstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:169:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:170:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:170:3: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression
            {
            if ( backtracking==0 ) {
              System.out.println("assignment ");
            }
            pushFollow(FOLLOW_variable_in_assignment1105);
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1109);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1132);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = input.toString(valuee.start,valuee.stop)+op.getText()+input.toString(e.start,e.stop);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:3: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            {
            if ( backtracking==0 ) {
              System.out.println("variable ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==WORD||(LA30_0>=OIVAR && LA30_0<=GLOBALVAR)) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==86) ) {
                    alt30=1;
                }
                else if ( (LA30_1==EOF||(LA30_1>=PLUS && LA30_1<=LTE)||(LA30_1>=WORD && LA30_1<=GLOBALVAR)||LA30_1==36||(LA30_1>=42 && LA30_1<=85)||LA30_1==87) ) {
                    alt30=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("174:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:39: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1152);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = a;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:174:67: valuee= ( WORD | OIVAR | GLOBALVAR )
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1157);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:1: function returns [String value] : WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:1: ( WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:3: WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')'
            {
            match(input,WORD,FOLLOW_WORD_in_function1179); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1181); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:12: ( expression ( ( ',' ) ( expression )? )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LPAREN||(LA33_0>=WORD && LA33_0<=NUMBER)||(LA33_0>=HEXNUMBER && LA33_0<=GLOBALVAR)||(LA33_0>=51 && LA33_0<=52)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:13: expression ( ( ',' ) ( expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1184);
                    expression();
                    _fsp--;
                    if (failed) return value;
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:24: ( ( ',' ) ( expression )? )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==44) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:25: ( ',' ) ( expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:25: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:26: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function1188); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:31: ( expression )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==LPAREN||(LA31_0>=WORD && LA31_0<=NUMBER)||(LA31_0>=HEXNUMBER && LA31_0<=GLOBALVAR)||(LA31_0>=51 && LA31_0<=52)) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:178:32: expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1192);
                    	            expression();
                    	            _fsp--;
                    	            if (failed) return value;

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

            match(input,RPAREN,FOLLOW_RPAREN_in_function1200); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 32, function_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:1: function2 returns [String value] : OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:2: ( OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:4: OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')'
            {
            match(input,OIVAR,FOLLOW_OIVAR_in_function21216); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21218); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:14: ( expression ( ( ',' ) ( expression )? )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN||(LA36_0>=WORD && LA36_0<=NUMBER)||(LA36_0>=HEXNUMBER && LA36_0<=GLOBALVAR)||(LA36_0>=51 && LA36_0<=52)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:15: expression ( ( ',' ) ( expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21221);
                    expression();
                    _fsp--;
                    if (failed) return value;
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:26: ( ( ',' ) ( expression )? )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==44) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:27: ( ',' ) ( expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:27: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:28: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function21225); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:33: ( expression )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==LPAREN||(LA34_0>=WORD && LA34_0<=NUMBER)||(LA34_0>=HEXNUMBER && LA34_0<=GLOBALVAR)||(LA34_0>=51 && LA34_0<=52)) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:182:34: expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21229);
                    	            expression();
                    	            _fsp--;
                    	            if (failed) return value;

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

            match(input,RPAREN,FOLLOW_RPAREN_in_function21237); if (failed) return value;
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
            if ( backtracking>0 ) { memoize(input, 33, function2_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:185:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' expression ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:186:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' expression ']' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:186:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' expression ']'
            {
            if ( backtracking==0 ) {
              System.out.println("array ");
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1259);    throw mse;
            }

            match(input,86,FOLLOW_86_in_array1267); if (failed) return value;
            pushFollow(FOLLOW_expression_in_array1269);
            expression();
            _fsp--;
            if (failed) return value;
            match(input,87,FOLLOW_87_in_array1271); if (failed) return value;
            if ( backtracking==0 ) {
              value = valuee.getText();
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
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:256: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:256: ';'
        {
        match(input,36,FOLLOW_36_in_synpred21284); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: ( field )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:34: field
        {
        pushFollow(FOLLOW_field_in_synpred30390);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:40: method
        {
        pushFollow(FOLLOW_method_in_synpred31392);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:54: variable
        {
        pushFollow(FOLLOW_variable_in_synpred36460);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:83:133: variable
        {
        pushFollow(FOLLOW_variable_in_synpred37477);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:81: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:95:81: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred40559);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:56: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:56: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred44623);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:90: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:90: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:90: ( andexpression | orexpression | xorexpression )
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
                new NoViableAltException("103:90: ( andexpression | orexpression | xorexpression )", 40, 0, input);

            throw nvae;
        }

        switch (alt40) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:91: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred47631);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:105: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred47633);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:118: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred47635);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:133: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:103:134: expression
        {
        pushFollow(FOLLOW_expression_in_synpred47639);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:69: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:111:69: expression
        {
        pushFollow(FOLLOW_expression_in_synpred60711);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:37: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:37: variable
        {
        pushFollow(FOLLOW_variable_in_synpred71851);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:147: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:147: variable
        {
        pushFollow(FOLLOW_variable_in_synpred85889);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:62: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred86860);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt41=6;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA41_1 = input.LA(2);

            if ( (LA41_1==LPAREN) ) {
                alt41=1;
            }
            else if ( (synpred85()) ) {
                alt41=5;
            }
            else if ( (true) ) {
                alt41=6;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 41, 1, input);

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
                new NoViableAltException("135:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 41, 0, input);

            throw nvae;
        }

        switch (alt41) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:114: function
                {
                pushFollow(FOLLOW_function_in_synpred86881);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:123: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred86883); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:133: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred86885); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:140: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred86887); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:147: variable
                {
                pushFollow(FOLLOW_variable_in_synpred86889);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:135:156: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred86891); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred86

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred71() {
        backtracking++;
        int start = input.mark();
        try {
            synpred71_fragment(); // can never throw exception
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
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
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
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
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
    public final boolean synpred60() {
        backtracking++;
        int start = input.mark();
        try {
            synpred60_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_statement_in_code227 = new BitSet(new long[]{0x0000E40018200402L,0x0000000000004778L});
    public static final BitSet FOLLOW_bstatement_in_statement250 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement252 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement254 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement256 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement258 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement260 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement262 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement264 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement266 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement268 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement270 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement272 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement274 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement276 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement278 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement280 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement284 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_set_in_field302 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_field310 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_field316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_field320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_field322 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_field324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_method343 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method351 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method357 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method361 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_method363 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_innerclass379 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_innerclass381 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_innerclass383 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_field_in_innerclass390 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_method_in_innerclass392 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_set_in_innerclass396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement416 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_bstatement423 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_set_in_bstatement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_varstatement455 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement460 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement466 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_varstatement472 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement477 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement483 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement506 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_returnstatement511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement545 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_ifstatement547 = new BitSet(new long[]{0x0001E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_48_in_ifstatement550 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_ifstatement555 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement559 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement578 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_50_in_elsestatement581 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_elsestatement583 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_elsestatement588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression613 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_relationalExpression_in_expression615 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_notexpression_in_expression617 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_aexpression_in_expression623 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_andexpression_in_expression631 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_orexpression_in_expression633 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_xorexpression_in_expression635 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_expression639 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_notexpression659 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_notexpression667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression684 = new BitSet(new long[]{0x001800001F600102L});
    public static final BitSet FOLLOW_expression_in_aexpression711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression754 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_pexpression758 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression843 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression845 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression847 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression849 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression851 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression853 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression855 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_relationalExpression860 = new BitSet(new long[]{0x000000001B600000L});
    public static final BitSet FOLLOW_function_in_relationalExpression881 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression883 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression885 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression887 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression889 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression891 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_repeatstatement912 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement914 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_repeatstatement917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_breakstatement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_continuestatement950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_dostatement967 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_dostatement969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_dostatement971 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_dostatement973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_whilestatement988 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_whilestatement990 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_whilestatement993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_forstatement1009 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1011 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1013 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_forstatement1015 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement1017 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1019 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1021 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_switchstatement1038 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1041 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1044 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_switchstatement1047 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_switchstatement1055 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_statement_in_switchstatement1058 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_withstatement1080 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_withstatement1083 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_withstatement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1105 = new BitSet(new long[]{0x0000000000001000L,0x00000000003F8004L});
    public static final BitSet FOLLOW_set_in_assignment1109 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_assignment1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1179 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1181 = new BitSet(new long[]{0x001800001F600300L});
    public static final BitSet FOLLOW_expression_in_function1184 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function1188 = new BitSet(new long[]{0x001810001F600300L});
    public static final BitSet FOLLOW_expression_in_function1192 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21216 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21218 = new BitSet(new long[]{0x001800001F600300L});
    public static final BitSet FOLLOW_expression_in_function21221 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function21225 = new BitSet(new long[]{0x001810001F600300L});
    public static final BitSet FOLLOW_expression_in_function21229 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array1267 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_array1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_array1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred21284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred30390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred31392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred36460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred37477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred40559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred44623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred47631 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_orexpression_in_synpred47633 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred47635 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_synpred47639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred60711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred71851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred85889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred86860 = new BitSet(new long[]{0x000000001B600000L});
    public static final BitSet FOLLOW_function_in_synpred86881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred86883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred86885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred86887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred86889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred86891 = new BitSet(new long[]{0x0000000000000002L});

}