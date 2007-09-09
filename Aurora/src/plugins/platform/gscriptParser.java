package plugins.platform;

// $ANTLR 3.0.1 C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g 2007-09-09 02:42:11

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
            ruleMemo = new HashMap[138+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g"; }



    // $ANTLR start program
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:35:1: program : ( ( field | method | innerclass ) ( ';' )* )* ;
    public final void program() throws RecognitionException {
        int program_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:1: ( ( ( field | method | innerclass ) ( ';' )* )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:3: ( ( field | method | innerclass ) ( ';' )* )*
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:3: ( ( field | method | innerclass ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=39)||LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:4: ( field | method | innerclass ) ( ';' )*
            	    {
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:4: ( field | method | innerclass )
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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("37:4: ( field | method | innerclass )", 1, 9, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("37:4: ( field | method | innerclass )", 1, 5, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("37:4: ( field | method | innerclass )", 1, 10, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("37:4: ( field | method | innerclass )", 1, 6, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("37:4: ( field | method | innerclass )", 1, 1, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("37:4: ( field | method | innerclass )", 1, 11, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("37:4: ( field | method | innerclass )", 1, 7, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("37:4: ( field | method | innerclass )", 1, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_3 = input.LA(2);

            	        if ( (LA1_3==WORD) ) {
            	            int LA1_8 = input.LA(3);

            	            if ( (LA1_8==40) ) {
            	                alt1=2;
            	            }
            	            else if ( (LA1_8==EQUALS) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("37:4: ( field | method | innerclass )", 1, 8, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("37:4: ( field | method | innerclass )", 1, 3, input);

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
            	            new NoViableAltException("37:4: ( field | method | innerclass )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:5: field
            	            {
            	            pushFollow(FOLLOW_field_in_program177);
            	            field();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:11: method
            	            {
            	            pushFollow(FOLLOW_method_in_program179);
            	            method();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:18: innerclass
            	            {
            	            pushFollow(FOLLOW_innerclass_in_program181);
            	            innerclass();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:30: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:31: ';'
            	    	    {
            	    	    match(input,36,FOLLOW_36_in_program185); if (failed) return ;
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
        return ;
    }
    // $ANTLR end program


    // $ANTLR start statement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:41:1: statement : ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )* ;
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:1: ( ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function ) ( ';' )*
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )
            int alt4=16;
            switch ( input.LA(1) ) {
            case LBRAC:
            case 42:
                {
                alt4=1;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    alt4=16;
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
                    alt4=15;
                    }
                    break;
                case WORD:
                case OIVAR:
                case GLOBALVAR:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("42:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 47:
                {
                alt4=5;
                }
                break;
            case 67:
                {
                alt4=6;
                }
                break;
            case 70:
                {
                alt4=7;
                }
                break;
            case 72:
                {
                alt4=8;
                }
                break;
            case 69:
                {
                alt4=9;
                }
                break;
            case 68:
                {
                alt4=10;
                }
                break;
            case 73:
                {
                alt4=11;
                }
                break;
            case 74:
                {
                alt4=12;
                }
                break;
            case 78:
                {
                alt4=13;
                }
                break;
            case OIVAR:
                {
                int LA4_14 = input.LA(2);

                if ( (LA4_14==EQUALS||LA4_14==66||(LA4_14>=79 && LA4_14<=86)) ) {
                    alt4=15;
                }
                else if ( (LA4_14==LPAREN) ) {
                    alt4=14;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("42:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 4, 14, input);

                    throw nvae;
                }
                }
                break;
            case GLOBALVAR:
                {
                alt4=15;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("42:3: ( bstatement | varstatement | returnstatement | exitstatement | ifstatement | repeatstatement | dostatement | whilestatement | continuestatement | breakstatement | forstatement | switchstatement | withstatement | function2 | assignment | function )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:4: bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement202);
                    bstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:15: varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement204);
                    varstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:28: returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement206);
                    returnstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:44: exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement208);
                    exitstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:58: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement210);
                    ifstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:70: repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement212);
                    repeatstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:86: dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement214);
                    dostatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:98: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement216);
                    whilestatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:113: continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement218);
                    continuestatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:131: breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement220);
                    breakstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:146: forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement222);
                    forstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:159: switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement224);
                    switchstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:175: withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement226);
                    withstatement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:189: function2
                    {
                    pushFollow(FOLLOW_function2_in_statement228);
                    function2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 15 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:199: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement230);
                    assignment();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 16 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:210: function
                    {
                    pushFollow(FOLLOW_function_in_statement232);
                    function();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:220: ( ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==36) ) {
                    int LA5_19 = input.LA(2);

                    if ( (synpred20()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:221: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement236); if (failed) return ;
            	    if ( backtracking==0 ) {
            	      System.out.println(";");
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start field
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:45:1: field : ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER ) ;
    public final void field() throws RecognitionException {
        int field_StartIndex = input.index();
        Token type=null;
        Token name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:46:1: ( ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:46:3: ( 'public' | 'private' )? ( 'static' )? type= WORD name= WORD '=' ( WORD | NUMBER )
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:46:3: ( 'public' | 'private' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:
                    {
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field249);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:46:25: ( 'static' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:46:26: 'static'
                    {
                    match(input,39,FOLLOW_39_in_field257); if (failed) return ;

                    }
                    break;

            }

            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_field263); if (failed) return ;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_field267); if (failed) return ;
            match(input,EQUALS,FOLLOW_EQUALS_in_field269); if (failed) return ;
            if ( (input.LA(1)>=WORD && input.LA(1)<=NUMBER) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field271);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, field_StartIndex); }
        }
        return ;
    }
    // $ANTLR end field


    // $ANTLR start method
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:49:1: method : ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement ;
    public final void method() throws RecognitionException {
        int method_StartIndex = input.index();
        Token arg=null;
        Token name=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:50:1: ( ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:50:4: ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '()' bstatement
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:50:4: ( 'public' | 'private' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=37 && LA8_0<=38)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:
                    {
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_method287);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:50:26: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:50:27: 'static'
                    {
                    match(input,39,FOLLOW_39_in_method295); if (failed) return ;

                    }
                    break;

            }

            arg=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method301); if (failed) return ;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method305); if (failed) return ;
            match(input,40,FOLLOW_40_in_method307); if (failed) return ;
            pushFollow(FOLLOW_bstatement_in_method309);
            bstatement();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, method_StartIndex); }
        }
        return ;
    }
    // $ANTLR end method


    // $ANTLR start innerclass
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:53:1: innerclass : 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) ;
    public final void innerclass() throws RecognitionException {
        int innerclass_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:2: ( 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:4: 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' )
            {
            match(input,41,FOLLOW_41_in_innerclass319); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_innerclass321); if (failed) return ;
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass323);    throw mse;
            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:33: ( field | method )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 37:
                case 38:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==39) ) {
                        int LA10_5 = input.LA(3);

                        if ( (LA10_5==WORD) ) {
                            int LA10_9 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt10=1;
                            }
                            else if ( (synpred30()) ) {
                                alt10=2;
                            }


                        }


                    }
                    else if ( (LA10_2==WORD) ) {
                        int LA10_6 = input.LA(3);

                        if ( (LA10_6==WORD) ) {
                            int LA10_10 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt10=1;
                            }
                            else if ( (synpred30()) ) {
                                alt10=2;
                            }


                        }


                    }


                    }
                    break;
                case 39:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (LA10_3==WORD) ) {
                        int LA10_7 = input.LA(3);

                        if ( (LA10_7==WORD) ) {
                            int LA10_11 = input.LA(4);

                            if ( (synpred29()) ) {
                                alt10=1;
                            }
                            else if ( (synpred30()) ) {
                                alt10=2;
                            }


                        }


                    }


                    }
                    break;
                case WORD:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (LA10_4==WORD) ) {
                        int LA10_8 = input.LA(3);

                        if ( (LA10_8==EQUALS) ) {
                            alt10=1;
                        }
                        else if ( (LA10_8==40) ) {
                            alt10=2;
                        }


                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:34: field
            	    {
            	    pushFollow(FOLLOW_field_in_innerclass330);
            	    field();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:40: method
            	    {
            	    pushFollow(FOLLOW_method_in_innerclass332);
            	    method();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass336);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, innerclass_StartIndex); }
        }
        return ;
    }
    // $ANTLR end innerclass


    // $ANTLR start bstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:57:1: bstatement : ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' ) ;
    public final void bstatement() throws RecognitionException {
        int bstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:58:1: ( ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:58:3: ( LBRAC | 'begin' ) ( statement )* ( RBRAC | 'end' )
            {
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement350);    throw mse;
            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:58:19: ( statement )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LBRAC||LA11_0==WORD||(LA11_0>=OIVAR && LA11_0<=GLOBALVAR)||LA11_0==42||(LA11_0>=45 && LA11_0<=47)||(LA11_0>=67 && LA11_0<=70)||(LA11_0>=72 && LA11_0<=74)||LA11_0==78) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:58:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement357);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

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
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement361);    throw mse;
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
        return ;
    }
    // $ANTLR end bstatement


    // $ANTLR start varstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:61:1: varstatement : type= WORD variable ( ',' variable )* ;
    public final void varstatement() throws RecognitionException {
        int varstatement_StartIndex = input.index();
        Token type=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:62:1: (type= WORD variable ( ',' variable )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:62:3: type= WORD variable ( ',' variable )*
            {
            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_varstatement376); if (failed) return ;
            pushFollow(FOLLOW_variable_in_varstatement378);
            variable();
            _fsp--;
            if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:62:22: ( ',' variable )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:62:23: ',' variable
            	    {
            	    match(input,44,FOLLOW_44_in_varstatement381); if (failed) return ;
            	    pushFollow(FOLLOW_variable_in_varstatement383);
            	    variable();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, varstatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:65:1: returnstatement : 'return' ( expression ) ;
    public final void returnstatement() throws RecognitionException {
        int returnstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:66:1: ( 'return' ( expression ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:66:3: 'return' ( expression )
            {
            match(input,45,FOLLOW_45_in_returnstatement394); if (failed) return ;
            if ( backtracking==0 ) {
              System.out.print("return ");
            }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:66:43: ( expression )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:66:44: expression
            {
            pushFollow(FOLLOW_expression_in_returnstatement399);
            expression();
            _fsp--;
            if (failed) return ;

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
        return ;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:69:1: exitstatement : 'exit' ;
    public final void exitstatement() throws RecognitionException {
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:70:1: ( 'exit' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:70:2: 'exit'
            {
            match(input,46,FOLLOW_46_in_exitstatement408); if (failed) return ;
            if ( backtracking==0 ) {
              System.out.println("return ;");
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
        return ;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:73:1: ifstatement : 'if' expression ( 'then' )? ( statement ) ( elsestatement )* ;
    public final void ifstatement() throws RecognitionException {
        int ifstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:1: ( 'if' expression ( 'then' )? ( statement ) ( elsestatement )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:3: 'if' expression ( 'then' )? ( statement ) ( elsestatement )*
            {
            match(input,47,FOLLOW_47_in_ifstatement419); if (failed) return ;
            pushFollow(FOLLOW_expression_in_ifstatement421);
            expression();
            _fsp--;
            if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:19: ( 'then' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:20: 'then'
                    {
                    match(input,48,FOLLOW_48_in_ifstatement424); if (failed) return ;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:29: ( statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:30: statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement429);
            statement();
            _fsp--;
            if (failed) return ;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:41: ( elsestatement )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==49) ) {
                    int LA14_18 = input.LA(2);

                    if ( (synpred37()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==50) ) {
                    int LA14_19 = input.LA(2);

                    if ( (synpred37()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:42: elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement433);
            	    elsestatement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ifstatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:77:1: elsestatement : ( 'else' | ( 'elsif' expression ) ) ( statement ) ;
    public final void elsestatement() throws RecognitionException {
        int elsestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:1: ( ( 'else' | ( 'elsif' expression ) ) ( statement ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:3: ( 'else' | ( 'elsif' expression ) ) ( statement )
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:3: ( 'else' | ( 'elsif' expression ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            else if ( (LA15_0==50) ) {
                alt15=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("78:3: ( 'else' | ( 'elsif' expression ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:4: 'else'
                    {
                    match(input,49,FOLLOW_49_in_elsestatement445); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:11: ( 'elsif' expression )
                    {
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:11: ( 'elsif' expression )
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:12: 'elsif' expression
                    {
                    match(input,50,FOLLOW_50_in_elsestatement448); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_elsestatement450);
                    expression();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:33: ( statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:78:34: statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement455);
            statement();
            _fsp--;
            if (failed) return ;

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
        return ;
    }
    // $ANTLR end elsestatement


    // $ANTLR start expression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:81:1: expression : ( pexpression | relationalExpression | notexpression ) ( aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )* ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:1: ( ( pexpression | relationalExpression | notexpression ) ( aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:4: ( pexpression | relationalExpression | notexpression ) ( aexpression )* ( ( andexpression | orexpression | xorexpression ) ( expression ) )*
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:4: ( pexpression | relationalExpression | notexpression )
            int alt16=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt16=1;
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
                alt16=2;
                }
                break;
            case 51:
            case 52:
                {
                alt16=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("82:4: ( pexpression | relationalExpression | notexpression )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:5: pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression467);
                    pexpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:17: relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression469);
                    relationalExpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:38: notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression471);
                    notexpression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:53: ( aexpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=PLUS && LA17_0<=DIV)||LA17_0==NEGINTEGER||(LA17_0>=53 && LA17_0<=59)) ) {
                    int LA17_35 = input.LA(2);

                    if ( (synpred41()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:54: aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression475);
            	    aexpression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:68: ( ( andexpression | orexpression | xorexpression ) ( expression ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 60:
                case 61:
                    {
                    int LA19_32 = input.LA(2);

                    if ( (synpred44()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 62:
                case 63:
                    {
                    int LA19_33 = input.LA(2);

                    if ( (synpred44()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA19_34 = input.LA(2);

                    if ( (synpred44()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:69: ( andexpression | orexpression | xorexpression ) ( expression )
            	    {
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:69: ( andexpression | orexpression | xorexpression )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	    case 61:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 62:
            	    case 63:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("82:69: ( andexpression | orexpression | xorexpression )", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:70: andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression481);
            	            andexpression();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:84: orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression483);
            	            orexpression();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:97: xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression485);
            	            xorexpression();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:112: ( expression )
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:113: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression489);
            	    expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:85:1: notexpression : ( 'not' | '!' ) expression ;
    public final void notexpression() throws RecognitionException {
        int notexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:86:1: ( ( 'not' | '!' ) expression )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:86:3: ( 'not' | '!' ) expression
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression501);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression507);
            expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, notexpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:89:1: aexpression : ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final void aexpression() throws RecognitionException {
        int aexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:1: ( ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:3: ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=53 && input.LA(1)<=59) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression516);    throw mse;
            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:66: ( expression )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA20_361 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA20_362 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA20_363 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA20_364 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA20_365 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA20_366 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA20_367 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA20_368 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA20_369 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_370 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 86:
                                    {
                                    int LA20_371 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_372 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_373 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_374 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_375 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_376 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_377 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_378 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_379 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_380 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_381 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_382 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_383 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_384 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_385 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_386 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_387 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_388 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_389 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_390 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_391 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_392 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_393 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_394 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_395 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 86:
                                    {
                                    int LA20_396 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_397 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_398 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_399 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_400 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_401 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_402 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 86:
                                    {
                                    int LA20_403 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_404 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_405 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_406 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_407 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_408 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_409 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_410 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_411 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 60:
                                case 61:
                                    {
                                    int LA20_412 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 62:
                                case 63:
                                    {
                                    int LA20_413 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 64:
                                case 65:
                                    {
                                    int LA20_414 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA20_415 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                                    int LA20_416 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA20_417 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA20_418 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA20_419 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA20_420 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA20_421 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA20_422 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA20_423 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA20_424 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
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
                    int LA20_2 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA20_6 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA20_7 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA20_8 = input.LA(2);

                    if ( (synpred57()) ) {
                        alt20=1;
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
                                    int LA20_425 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA20_426 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA20_427 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA20_428 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA20_429 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA20_430 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA20_431 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA20_432 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA20_433 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            int LA20_353 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA20_354 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA20_355 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA20_356 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case OIVAR:
                            {
                            int LA20_357 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case GLOBALVAR:
                            {
                            int LA20_358 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA20_359 = input.LA(3);

                            if ( (synpred57()) ) {
                                alt20=1;
                            }
                            }
                            break;
                        case 51:
                        case 52:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA20_731 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA20_732 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA20_733 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA20_734 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA20_735 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA20_736 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA20_737 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA20_738 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                                case 51:
                                case 52:
                                    {
                                    int LA20_739 = input.LA(4);

                                    if ( (synpred57()) ) {
                                        alt20=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:67: expression
                    {
                    pushFollow(FOLLOW_expression_in_aexpression543);
                    expression();
                    _fsp--;
                    if (failed) return ;

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
            if ( backtracking>0 ) { memoize(input, 14, aexpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end aexpression


    // $ANTLR start value
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:1: value : ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final void value() throws RecognitionException {
        int value_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:7: ( ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:9: ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:9: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt21=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt21=1;
                }
                break;
            case HEXNUMBER:
                {
                alt21=2;
                }
                break;
            case STRING:
                {
                alt21=3;
                }
                break;
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt21=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("93:9: ( NUMBER | HEXNUMBER | STRING | variable )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:10: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value556); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:17: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value558); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:27: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value560); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:93:34: variable
                    {
                    pushFollow(FOLLOW_variable_in_value562);
                    variable();
                    _fsp--;
                    if (failed) return ;

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
            if ( backtracking>0 ) { memoize(input, 15, value_StartIndex); }
        }
        return ;
    }
    // $ANTLR end value


    // $ANTLR start pexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:96:1: pexpression : LPAREN expression RPAREN ;
    public final void pexpression() throws RecognitionException {
        int pexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:97:1: ( LPAREN expression RPAREN )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:97:3: LPAREN expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression572); if (failed) return ;
            pushFollow(FOLLOW_expression_in_pexpression574);
            expression();
            _fsp--;
            if (failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression576); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, pexpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:100:1: andexpression : ( '&&' | 'and' ) ;
    public final void andexpression() throws RecognitionException {
        int andexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:101:1: ( ( '&&' | 'and' ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:101:3: ( '&&' | 'and' )
            {
            if ( (input.LA(1)>=60 && input.LA(1)<=61) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression585);    throw mse;
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
        return ;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:104:1: orexpression : ( '||' | 'or' ) ;
    public final void orexpression() throws RecognitionException {
        int orexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:105:1: ( ( '||' | 'or' ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:105:3: ( '||' | 'or' )
            {
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression598);    throw mse;
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
        return ;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:108:1: xorexpression : ( '^^' | 'xor' ) ;
    public final void xorexpression() throws RecognitionException {
        int xorexpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:109:1: ( ( '^^' | 'xor' ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:109:3: ( '^^' | 'xor' )
            {
            if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression611);    throw mse;
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
        return ;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:112:1: relationalExpression : ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
    public final void relationalExpression() throws RecognitionException {
        int relationalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:113:3: ( ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
            int alt22=7;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==LPAREN) ) {
                    alt22=1;
                }
                else if ( (synpred68()) ) {
                    alt22=5;
                }
                else if ( (true) ) {
                    alt22=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("114:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt22=2;
                }
                break;
            case STRING:
                {
                alt22=3;
                }
                break;
            case NUMBER:
                {
                alt22=4;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt22=5;
                }
                break;
            case DECIMAL:
                {
                alt22=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:4: function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression629);
                    function();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:13: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression631); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:23: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression633); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:30: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression635); if (failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:37: variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression637);
                    variable();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:46: DECIMAL
                    {
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression639); if (failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:54: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression641); if (failed) return ;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:60: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==52) ) {
                    switch ( input.LA(2) ) {
                    case WORD:
                        {
                        int LA24_42 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA24_43 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;
                    case STRING:
                        {
                        int LA24_44 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;
                    case NUMBER:
                        {
                        int LA24_45 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;
                    case OIVAR:
                        {
                        int LA24_46 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;
                    case GLOBALVAR:
                        {
                        int LA24_47 = input.LA(3);

                        if ( (synpred83()) ) {
                            alt24=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA24_0>=EQUALS && LA24_0<=LTE)||LA24_0==66) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression646);    throw mse;
            	    }

            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt23=6;
            	    switch ( input.LA(1) ) {
            	    case WORD:
            	        {
            	        int LA23_1 = input.LA(2);

            	        if ( (LA23_1==LPAREN) ) {
            	            alt23=1;
            	        }
            	        else if ( (synpred82()) ) {
            	            alt23=5;
            	        }
            	        else if ( (true) ) {
            	            alt23=6;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 23, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case HEXNUMBER:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case STRING:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case NUMBER:
            	        {
            	        alt23=4;
            	        }
            	        break;
            	    case OIVAR:
            	    case GLOBALVAR:
            	        {
            	        alt23=5;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:114: function
            	            {
            	            pushFollow(FOLLOW_function_in_relationalExpression667);
            	            function();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:123: HEXNUMBER
            	            {
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression669); if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:133: STRING
            	            {
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression671); if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:140: NUMBER
            	            {
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression673); if (failed) return ;

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:147: variable
            	            {
            	            pushFollow(FOLLOW_variable_in_relationalExpression675);
            	            variable();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:156: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression677); if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, relationalExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:117:1: repeatstatement : 'repeat' expression ( statement ) ;
    public final void repeatstatement() throws RecognitionException {
        int repeatstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:118:1: ( 'repeat' expression ( statement ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:118:3: 'repeat' expression ( statement )
            {
            match(input,67,FOLLOW_67_in_repeatstatement692); if (failed) return ;
            pushFollow(FOLLOW_expression_in_repeatstatement694);
            expression();
            _fsp--;
            if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:118:23: ( statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:118:24: statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement697);
            statement();
            _fsp--;
            if (failed) return ;

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
        return ;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:121:1: breakstatement : 'break' ;
    public final void breakstatement() throws RecognitionException {
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:122:1: ( 'break' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:122:3: 'break'
            {
            match(input,68,FOLLOW_68_in_breakstatement707); if (failed) return ;
            if ( backtracking==0 ) {
              System.out.println("break;");
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
        return ;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:124:1: continuestatement : 'continue' ;
    public final void continuestatement() throws RecognitionException {
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:125:1: ( 'continue' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:125:3: 'continue'
            {
            match(input,69,FOLLOW_69_in_continuestatement718); if (failed) return ;
            if ( backtracking==0 ) {
              System.out.println("continue;");
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
        return ;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:128:1: dostatement : 'do' statement 'until' expression ;
    public final void dostatement() throws RecognitionException {
        int dostatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:129:1: ( 'do' statement 'until' expression )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:129:3: 'do' statement 'until' expression
            {
            match(input,70,FOLLOW_70_in_dostatement729); if (failed) return ;
            pushFollow(FOLLOW_statement_in_dostatement731);
            statement();
            _fsp--;
            if (failed) return ;
            match(input,71,FOLLOW_71_in_dostatement733); if (failed) return ;
            pushFollow(FOLLOW_expression_in_dostatement735);
            expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, dostatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:132:1: whilestatement : 'while' expression ( statement ) ;
    public final void whilestatement() throws RecognitionException {
        int whilestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:133:1: ( 'while' expression ( statement ) )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:133:3: 'while' expression ( statement )
            {
            match(input,72,FOLLOW_72_in_whilestatement744); if (failed) return ;
            pushFollow(FOLLOW_expression_in_whilestatement746);
            expression();
            _fsp--;
            if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:133:22: ( statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:133:23: statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement749);
            statement();
            _fsp--;
            if (failed) return ;

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
        return ;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:136:1: forstatement : 'for' '(' statement expression ';' statement ')' statement ;
    public final void forstatement() throws RecognitionException {
        int forstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:137:1: ( 'for' '(' statement expression ';' statement ')' statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:137:3: 'for' '(' statement expression ';' statement ')' statement
            {
            match(input,73,FOLLOW_73_in_forstatement759); if (failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement761); if (failed) return ;
            pushFollow(FOLLOW_statement_in_forstatement763);
            statement();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_expression_in_forstatement765);
            expression();
            _fsp--;
            if (failed) return ;
            match(input,36,FOLLOW_36_in_forstatement767); if (failed) return ;
            pushFollow(FOLLOW_statement_in_forstatement769);
            statement();
            _fsp--;
            if (failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement771); if (failed) return ;
            pushFollow(FOLLOW_statement_in_forstatement773);
            statement();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, forstatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:140:1: switchstatement : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final void switchstatement() throws RecognitionException {
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            match(input,74,FOLLOW_74_in_switchstatement782); if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:12: ( expression )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement785);
            expression();
            _fsp--;
            if (failed) return ;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement788); if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=75 && LA26_0<=76)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement791);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expression_in_switchstatement797);
            	    expression();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,77,FOLLOW_77_in_switchstatement799); if (failed) return ;
            	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:64: ( statement )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==LBRAC||LA25_0==WORD||(LA25_0>=OIVAR && LA25_0<=GLOBALVAR)||LA25_0==42||(LA25_0>=45 && LA25_0<=47)||(LA25_0>=67 && LA25_0<=70)||(LA25_0>=72 && LA25_0<=74)||LA25_0==78) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:141:65: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement802);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return ;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement808); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, switchstatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:144:1: withstatement : 'with' expression statement ;
    public final void withstatement() throws RecognitionException {
        int withstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:145:1: ( 'with' expression statement )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:145:3: 'with' expression statement
            {
            match(input,78,FOLLOW_78_in_withstatement817); if (failed) return ;
            pushFollow(FOLLOW_expression_in_withstatement820);
            expression();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_statement_in_withstatement823);
            statement();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, withstatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:148:1: assignment : variable ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) expression ;
    public final void assignment() throws RecognitionException {
        int assignment_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:149:1: ( variable ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) expression )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:149:3: variable ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) expression
            {
            pushFollow(FOLLOW_variable_in_assignment832);
            variable();
            _fsp--;
            if (failed) return ;
            if ( input.LA(1)==EQUALS||input.LA(1)==66||(input.LA(1)>=79 && input.LA(1)<=85) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment834);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment855);
            expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, assignment_StartIndex); }
        }
        return ;
    }
    // $ANTLR end assignment


    // $ANTLR start variable
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:152:1: variable : ( array | WORD | OIVAR | GLOBALVAR );
    public final void variable() throws RecognitionException {
        int variable_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:153:1: ( array | WORD | OIVAR | GLOBALVAR )
            int alt27=4;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==86) ) {
                    alt27=1;
                }
                else if ( (LA27_1==EOF||(LA27_1>=PLUS && LA27_1<=LTE)||(LA27_1>=WORD && LA27_1<=GLOBALVAR)||LA27_1==36||(LA27_1>=42 && LA27_1<=85)||LA27_1==87) ) {
                    alt27=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("152:1: variable : ( array | WORD | OIVAR | GLOBALVAR );", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case OIVAR:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==86) ) {
                    alt27=1;
                }
                else if ( (LA27_2==EOF||(LA27_2>=PLUS && LA27_2<=LTE)||(LA27_2>=WORD && LA27_2<=GLOBALVAR)||LA27_2==36||(LA27_2>=42 && LA27_2<=85)||LA27_2==87) ) {
                    alt27=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("152:1: variable : ( array | WORD | OIVAR | GLOBALVAR );", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case GLOBALVAR:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==86) ) {
                    alt27=1;
                }
                else if ( (LA27_3==EOF||(LA27_3>=PLUS && LA27_3<=LTE)||(LA27_3>=WORD && LA27_3<=GLOBALVAR)||LA27_3==36||(LA27_3>=42 && LA27_3<=85)||LA27_3==87) ) {
                    alt27=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("152:1: variable : ( array | WORD | OIVAR | GLOBALVAR );", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("152:1: variable : ( array | WORD | OIVAR | GLOBALVAR );", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:153:3: array
                    {
                    pushFollow(FOLLOW_array_in_variable864);
                    array();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:153:9: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_variable866); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:153:14: OIVAR
                    {
                    match(input,OIVAR,FOLLOW_OIVAR_in_variable868); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:153:20: GLOBALVAR
                    {
                    match(input,GLOBALVAR,FOLLOW_GLOBALVAR_in_variable870); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, variable_StartIndex); }
        }
        return ;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:1: function : WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')' ;
    public final void function() throws RecognitionException {
        int function_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:9: ( WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:11: WORD '(' ( expression ( ( ',' ) ( expression )? )* )? ')'
            {
            match(input,WORD,FOLLOW_WORD_in_function878); if (failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_function880); if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:20: ( expression ( ( ',' ) ( expression )? )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LPAREN||(LA30_0>=WORD && LA30_0<=NUMBER)||(LA30_0>=HEXNUMBER && LA30_0<=GLOBALVAR)||(LA30_0>=51 && LA30_0<=52)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:21: expression ( ( ',' ) ( expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function883);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:32: ( ( ',' ) ( expression )? )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==44) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:33: ( ',' ) ( expression )?
                    	    {
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:33: ( ',' )
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:34: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function887); if (failed) return ;

                    	    }

                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:39: ( expression )?
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==LPAREN||(LA28_0>=WORD && LA28_0<=NUMBER)||(LA28_0>=HEXNUMBER && LA28_0<=GLOBALVAR)||(LA28_0>=51 && LA28_0<=52)) ) {
                    	        alt28=1;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:156:40: expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function891);
                    	            expression();
                    	            _fsp--;
                    	            if (failed) return ;

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function899); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, function_StartIndex); }
        }
        return ;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:159:1: function2 : OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')' ;
    public final void function2() throws RecognitionException {
        int function2_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:2: ( OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:4: OIVAR '(' ( expression ( ( ',' ) ( expression )? )* )? ')'
            {
            match(input,OIVAR,FOLLOW_OIVAR_in_function2909); if (failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_function2911); if (failed) return ;
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:14: ( expression ( ( ',' ) ( expression )? )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LPAREN||(LA33_0>=WORD && LA33_0<=NUMBER)||(LA33_0>=HEXNUMBER && LA33_0<=GLOBALVAR)||(LA33_0>=51 && LA33_0<=52)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:15: expression ( ( ',' ) ( expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function2914);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:26: ( ( ',' ) ( expression )? )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==44) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:27: ( ',' ) ( expression )?
                    	    {
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:27: ( ',' )
                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:28: ','
                    	    {
                    	    match(input,44,FOLLOW_44_in_function2918); if (failed) return ;

                    	    }

                    	    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:33: ( expression )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==LPAREN||(LA31_0>=WORD && LA31_0<=NUMBER)||(LA31_0>=HEXNUMBER && LA31_0<=GLOBALVAR)||(LA31_0>=51 && LA31_0<=52)) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:160:34: expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function2922);
                    	            expression();
                    	            _fsp--;
                    	            if (failed) return ;

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

            match(input,RPAREN,FOLLOW_RPAREN_in_function2930); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, function2_StartIndex); }
        }
        return ;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:163:1: array : ( WORD | OIVAR | GLOBALVAR ) '[' expression ']' ;
    public final void array() throws RecognitionException {
        int array_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:163:8: ( ( WORD | OIVAR | GLOBALVAR ) '[' expression ']' )
            // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:163:10: ( WORD | OIVAR | GLOBALVAR ) '[' expression ']'
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array941);    throw mse;
            }

            match(input,86,FOLLOW_86_in_array949); if (failed) return ;
            pushFollow(FOLLOW_expression_in_array951);
            expression();
            _fsp--;
            if (failed) return ;
            match(input,87,FOLLOW_87_in_array953); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, array_StartIndex); }
        }
        return ;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:5: ( field )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:5: field
        {
        pushFollow(FOLLOW_field_in_synpred1177);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:11: ( method )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:37:11: method
        {
        pushFollow(FOLLOW_method_in_synpred2179);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:221: ( ';' )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:42:221: ';'
        {
        match(input,36,FOLLOW_36_in_synpred20236); if (failed) return ;

        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:34: ( field )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:34: field
        {
        pushFollow(FOLLOW_field_in_synpred29330);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:40: ( method )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:54:40: method
        {
        pushFollow(FOLLOW_method_in_synpred30332);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:42: ( elsestatement )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:74:42: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred37433);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:54: ( aexpression )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:54: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred41475);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:69: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:69: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:69: ( andexpression | orexpression | xorexpression )
        int alt36=3;
        switch ( input.LA(1) ) {
        case 60:
        case 61:
            {
            alt36=1;
            }
            break;
        case 62:
        case 63:
            {
            alt36=2;
            }
            break;
        case 64:
        case 65:
            {
            alt36=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("82:69: ( andexpression | orexpression | xorexpression )", 36, 0, input);

            throw nvae;
        }

        switch (alt36) {
            case 1 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:70: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred44481);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:84: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred44483);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:97: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred44485);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:112: ( expression )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:82:113: expression
        {
        pushFollow(FOLLOW_expression_in_synpred44489);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:67: ( expression )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:90:67: expression
        {
        pushFollow(FOLLOW_expression_in_synpred57543);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:37: ( variable )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:37: variable
        {
        pushFollow(FOLLOW_variable_in_synpred68637);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:147: ( variable )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:147: variable
        {
        pushFollow(FOLLOW_variable_in_synpred82675);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:62: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==52||input.LA(1)==66 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred83646);    throw mse;
        }

        // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt37=6;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA37_1 = input.LA(2);

            if ( (LA37_1==LPAREN) ) {
                alt37=1;
            }
            else if ( (synpred82()) ) {
                alt37=5;
            }
            else if ( (true) ) {
                alt37=6;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 37, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            alt37=2;
            }
            break;
        case STRING:
            {
            alt37=3;
            }
            break;
        case NUMBER:
            {
            alt37=4;
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            alt37=5;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("114:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 37, 0, input);

            throw nvae;
        }

        switch (alt37) {
            case 1 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:114: function
                {
                pushFollow(FOLLOW_function_in_synpred83667);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:123: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred83669); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:133: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred83671); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:140: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred83673); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:147: variable
                {
                pushFollow(FOLLOW_variable_in_synpred83675);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Ali1\\My Documents\\Aurora\\src\\plugins\\platform\\gscript.g:114:156: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred83677); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred83

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
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred83() {
        backtracking++;
        int start = input.mark();
        try {
            synpred83_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_field_in_program177 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_method_in_program179 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_innerclass_in_program181 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_36_in_program185 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_bstatement_in_statement202 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement204 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement206 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement208 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement210 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement212 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement214 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement216 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement218 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement220 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement222 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement224 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement226 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement228 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement230 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement232 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement236 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_set_in_field249 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_field257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_field263 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_field267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQUALS_in_field269 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_field271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_method287 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method301 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method305 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_method307 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_innerclass319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_innerclass321 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_innerclass323 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_field_in_innerclass330 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_method_in_innerclass332 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_set_in_innerclass336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement350 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_bstatement357 = new BitSet(new long[]{0x0000EC0018200C00L,0x0000000000004778L});
    public static final BitSet FOLLOW_set_in_bstatement361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_varstatement376 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement378 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_varstatement381 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement383 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_45_in_returnstatement394 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_returnstatement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exitstatement408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ifstatement419 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_ifstatement421 = new BitSet(new long[]{0x0001E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_48_in_ifstatement424 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_ifstatement429 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement433 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_elsestatement445 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_50_in_elsestatement448 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_elsestatement450 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_elsestatement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression467 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_relationalExpression_in_expression469 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_notexpression_in_expression471 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_aexpression_in_expression475 = new BitSet(new long[]{0xFFE00000008000F2L,0x0000000000000003L});
    public static final BitSet FOLLOW_andexpression_in_expression481 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_orexpression_in_expression483 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_xorexpression_in_expression485 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_expression489 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_notexpression501 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_notexpression507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression516 = new BitSet(new long[]{0x001800001F600102L});
    public static final BitSet FOLLOW_expression_in_aexpression543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression572 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_pexpression574 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression629 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression631 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression633 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression635 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression637 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression639 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression641 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_relationalExpression646 = new BitSet(new long[]{0x000000001B600000L});
    public static final BitSet FOLLOW_function_in_relationalExpression667 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression669 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression671 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression673 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_relationalExpression675 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression677 = new BitSet(new long[]{0x001000000007F002L,0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_repeatstatement692 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement694 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_repeatstatement697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_breakstatement707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_continuestatement718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_dostatement729 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_dostatement731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_dostatement733 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_dostatement735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_whilestatement744 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_whilestatement746 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_whilestatement749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_forstatement759 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement761 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement763 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_forstatement765 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement767 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement769 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement771 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_forstatement773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_switchstatement782 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_switchstatement785 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement788 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_switchstatement791 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_switchstatement797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_switchstatement799 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_statement_in_switchstatement802 = new BitSet(new long[]{0x0000E40018200C00L,0x0000000000005F78L});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_withstatement817 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_withstatement820 = new BitSet(new long[]{0x0000E40018200400L,0x0000000000004778L});
    public static final BitSet FOLLOW_statement_in_withstatement823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment832 = new BitSet(new long[]{0x0000000000001000L,0x00000000003F8004L});
    public static final BitSet FOLLOW_set_in_assignment834 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_assignment855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_variable866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_variable868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBALVAR_in_variable870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function878 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function880 = new BitSet(new long[]{0x001800001F600300L});
    public static final BitSet FOLLOW_expression_in_function883 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function887 = new BitSet(new long[]{0x001810001F600300L});
    public static final BitSet FOLLOW_expression_in_function891 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function2909 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function2911 = new BitSet(new long[]{0x001800001F600300L});
    public static final BitSet FOLLOW_expression_in_function2914 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_44_in_function2918 = new BitSet(new long[]{0x001810001F600300L});
    public static final BitSet FOLLOW_expression_in_function2922 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array949 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_array951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_array953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred20236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred29330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred30332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred37433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred41475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred44481 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_orexpression_in_synpred44483 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred44485 = new BitSet(new long[]{0x001800001F600100L});
    public static final BitSet FOLLOW_expression_in_synpred44489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred57543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred68637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred82675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred83646 = new BitSet(new long[]{0x000000001B600000L});
    public static final BitSet FOLLOW_function_in_synpred83667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred83669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred83671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred83673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred83675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred83677 = new BitSet(new long[]{0x0000000000000002L});

}