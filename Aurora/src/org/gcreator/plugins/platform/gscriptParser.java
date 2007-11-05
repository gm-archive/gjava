// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2007-11-05 16:47:30

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

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[144+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g"; }

    
    public PlatformCore pc;
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    



    // $ANTLR start classes
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:52:1: classes : ( (f= field | m= method | i= innerclass ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;

        String i = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:1: ( ( (f= field | m= method | i= innerclass ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:3: ( (f= field | m= method | i= innerclass ) ( ';' )* )*
            {
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:24: ( (f= field | m= method | i= innerclass ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=39)||LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= field | m= method | i= innerclass ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:25: (f= field | m= method | i= innerclass )
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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 13, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 6, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 14, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_7>=OIVAR && LA1_7<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 7, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 1, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 16, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 8, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 17, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_9>=OIVAR && LA1_9<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 9, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 2, input);

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
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 19, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA1_10>=OIVAR && LA1_10<=GLOBALVAR)) ) {
            	                alt1=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 10, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 3, input);

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
            	                alt1=1;
            	            }
            	            else if ( (LA1_11==LPAREN) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 11, input);

            	                throw nvae;
            	            }
            	        }
            	        else if ( ((LA1_4>=OIVAR && LA1_4<=GLOBALVAR)) ) {
            	            alt1=1;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 4, input);

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
            	            new NoViableAltException("53:25: (f= field | m= method | i= innerclass )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: f= field
            	            {
            	            pushFollow(FOLLOW_field_in_classes199);
            	            f=field();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:70: m= method
            	            {
            	            pushFollow(FOLLOW_method_in_classes204);
            	            m=method();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:115: i= innerclass
            	            {
            	            pushFollow(FOLLOW_innerclass_in_classes209);
            	            i=innerclass();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + i;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:165: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:166: ';'
            	    	    {
            	    	    match(input,36,FOLLOW_36_in_classes214); if (failed) return ;
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
        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
              System.out.println("Start parsing code ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:48: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:49: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:49: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||LA4_0==WORD||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==42||(LA4_0>=44 && LA4_0<=46)||(LA4_0>=66 && LA4_0<=69)||(LA4_0>=71 && LA4_0<=73)||LA4_0==77) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:50: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code235);
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


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:1: ( (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:3: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function ) ( ';' )*
            {
            if ( backtracking==0 ) {
              System.out.print("statement: "); retval.value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:51: (b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function )
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

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:52: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement261);
                    b=bstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += b;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:86: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement266);
                    v=varstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += v.value;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:122: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement271);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += r;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:161: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement276);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += e;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:198: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement281);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += ifs;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:237: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement286);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += rep;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:280: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement291);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += dos;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:319: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement296);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += wh;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:359: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement301);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += con;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:404: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement306);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += br;
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:444: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement311);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fors;
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:486: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement316);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += sw;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:527: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement321);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += wit;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:568: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement326);
                    fun2=function2();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fun2;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:607: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement331);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += ass+";";
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:649: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement336);
                    fun=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value += fun;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:686: ( ';' )*
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
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:687: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement341); if (failed) return retval;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:64:1: field returns [String value] : ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:1: ( ( 'public' | 'private' )? ( 'static' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:3: ( 'public' | 'private' )? ( 'static' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:3: ( 'public' | 'private' )?
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
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_field359); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:34: 'private'
                    {
                    match(input,38,FOLLOW_38_in_field363); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:68: ( 'static' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:69: 'static'
                    {
                    match(input,39,FOLLOW_39_in_field370); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:102: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:103: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field378);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:68:1: method returns [String value] : ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token arg=null;
        Token name=null;
        expression_return e = null;

        String b = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:1: ( ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:4: ( 'public' | 'private' )? ( 'static' )? arg= WORD name= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' b= bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:4: ( 'public' | 'private' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==38) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:5: 'public'
                    {
                    match(input,37,FOLLOW_37_in_method401); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:34: 'private'
                    {
                    match(input,38,FOLLOW_38_in_method404); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:67: ( 'static' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:68: 'static'
                    {
                    match(input,39,FOLLOW_39_in_method410); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            arg=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method417); if (failed) return value;
            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method421); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_method423); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:124: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN||LA13_0==WORD||(LA13_0>=NUMBER && LA13_0<=GLOBALVAR)||(LA13_0>=50 && LA13_0<=51)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:125: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_method428);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      s = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:153: ( ( ',' ) (e= expression )? )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==40) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:154: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:154: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:155: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_method434); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:160: (e= expression )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==LPAREN||LA11_0==WORD||(LA11_0>=NUMBER && LA11_0<=GLOBALVAR)||(LA11_0>=50 && LA11_0<=51)) ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:161: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_method440);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              s += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_method449); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method453);
            b=bstatement();
            _fsp--;
            if (failed) return value;
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
        return value;
    }
    // $ANTLR end method


    // $ANTLR start innerclass
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:72:1: innerclass returns [String value] : 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) ;
    public final String innerclass() throws RecognitionException {
        String value = null;
        int innerclass_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:2: ( 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:4: 'class' WORD ( LBRAC | 'begin' ) ( field | method )* ( RBRAC | 'end' )
            {
            match(input,41,FOLLOW_41_in_innerclass469); if (failed) return value;
            match(input,WORD,FOLLOW_WORD_in_innerclass471); if (failed) return value;
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass473);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:33: ( field | method )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==39) ) {
                        int LA14_6 = input.LA(3);

                        if ( (LA14_6==WORD) ) {
                            int LA14_13 = input.LA(4);

                            if ( (synpred32()) ) {
                                alt14=1;
                            }
                            else if ( (synpred33()) ) {
                                alt14=2;
                            }


                        }


                    }
                    else if ( (LA14_2==WORD) ) {
                        int LA14_7 = input.LA(3);

                        if ( (LA14_7==WORD) ) {
                            int LA14_14 = input.LA(4);

                            if ( (synpred32()) ) {
                                alt14=1;
                            }
                            else if ( (synpred33()) ) {
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

                            if ( (synpred32()) ) {
                                alt14=1;
                            }
                            else if ( (synpred33()) ) {
                                alt14=2;
                            }


                        }


                    }
                    else if ( (LA14_3==WORD) ) {
                        int LA14_9 = input.LA(3);

                        if ( (LA14_9==WORD) ) {
                            int LA14_17 = input.LA(4);

                            if ( (synpred32()) ) {
                                alt14=1;
                            }
                            else if ( (synpred33()) ) {
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

                            if ( (synpred32()) ) {
                                alt14=1;
                            }
                            else if ( (synpred33()) ) {
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

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:34: field
            	    {
            	    pushFollow(FOLLOW_field_in_innerclass480);
            	    field();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:40: method
            	    {
            	    pushFollow(FOLLOW_method_in_innerclass482);
            	    method();
            	    _fsp--;
            	    if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop14;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_innerclass486);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:76:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:77:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:77:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            if ( backtracking==0 ) {
              System.out.println("bstatement "); value = "";
            }
            if ( input.LA(1)==LBRAC||input.LA(1)==42 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement506);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:77:69: (s= statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LBRAC||LA15_0==WORD||(LA15_0>=OIVAR && LA15_0<=GLOBALVAR)||LA15_0==42||(LA15_0>=44 && LA15_0<=46)||(LA15_0>=66 && LA15_0<=69)||(LA15_0>=71 && LA15_0<=73)||LA15_0==77) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:77:70: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement515);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=s.value;
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement520);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:80:1: varstatement returns [String value] : type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
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
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:1: (type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:3: type= WORD (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            if ( backtracking==0 ) {
              System.out.println("var statement ");
            }
            type=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_varstatement548); if (failed) return retval;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:53: (vari= variable | ass= assignment )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==WORD||(LA16_0>=OIVAR && LA16_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 85:
                    {
                    switch ( input.LA(3) ) {
                    case LPAREN:
                        {
                        int LA16_39 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 39, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA16_40 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 40, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA16_41 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA16_42 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 42, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA16_43 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA16_44 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA16_45 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 45, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 50:
                    case 51:
                        {
                        int LA16_46 = input.LA(4);

                        if ( (synpred38()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 2, input);

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

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("81:53: (vari= variable | ass= assignment )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:54: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement553);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+vari.value;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:90: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement559);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:127: ( ',' (varii= variable | ass= assignment ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:128: ',' (varii= variable | ass= assignment )
            	    {
            	    match(input,40,FOLLOW_40_in_varstatement565); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:132: (varii= variable | ass= assignment )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==WORD||(LA17_0>=OIVAR && LA17_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 85:
            	            {
            	            switch ( input.LA(3) ) {
            	            case LPAREN:
            	                {
            	                int LA17_39 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 39, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA17_40 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA17_41 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 41, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA17_42 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 42, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA17_43 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 43, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA17_44 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 44, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA17_45 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 45, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 50:
            	            case 51:
            	                {
            	                int LA17_46 = input.LA(4);

            	                if ( (synpred39()) ) {
            	                    alt17=1;
            	                }
            	                else if ( (true) ) {
            	                    alt17=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 46, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 2, input);

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

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("81:132: (varii= variable | ass= assignment )", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:133: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement570);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              s += ", "+varii.value;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:174: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement576);
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
            	    break loop18;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:84:1: returnstatement returns [String value] : 'return' (e= expression ) ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:85:1: ( 'return' (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:85:3: 'return' (e= expression )
            {
            match(input,44,FOLLOW_44_in_returnstatement598); if (failed) return value;
            if ( backtracking==0 ) {
              System.out.println("return statement ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:85:55: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:85:56: e= expression
            {
            pushFollow(FOLLOW_expression_in_returnstatement605);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:88:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:89:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:89:2: 'exit'
            {
            match(input,45,FOLLOW_45_in_exitstatement621); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:92:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:3: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              System.out.println("if statement ");
            }
            match(input,46,FOLLOW_46_in_ifstatement640); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement644);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:60: ( 'then' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:61: 'then'
                    {
                    match(input,47,FOLLOW_47_in_ifstatement647); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:70: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:71: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement654);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:84: (el= elsestatement )*
            loop20:
            do {
                int alt20=2;
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


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:85: el= elsestatement
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
            	    break loop20;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:96:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:3: ( 'else' | ( 'elsif' e= expression ) )
            int alt21=2;
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

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:4: 'else'
                    {
                    match(input,48,FOLLOW_48_in_elsestatement680); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:11: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:11: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:12: 'elsif' e= expression
                    {
                    match(input,49,FOLLOW_49_in_elsestatement683); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement687);
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

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:60: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:97:61: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement696);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:101:1: expression returns [String value] : (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
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
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:1: ( (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:4: (p= pexpression | r= relationalExpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:4: (p= pexpression | r= relationalExpression | n= notexpression )
            int alt22=3;
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

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:5: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression724);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:38: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression729);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:80: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression734);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:116: (aa= aexpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=PLUS && LA23_0<=DIV)||LA23_0==NEGINTEGER||(LA23_0>=52 && LA23_0<=58)) ) {
                    int LA23_36 = input.LA(2);

                    if ( (synpred46()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:117: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression741);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:161: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop25:
            do {
                int alt25=2;
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

                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:162: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:162: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt24=3;
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

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:163: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression751);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:205: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression756);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:248: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression761);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:289: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:290: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression768);
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
            	    break loop25;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:105:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:106:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:106:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=50 && input.LA(1)<=51) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression787);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression795);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:109:1: aexpression returns [String value] : a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:1: (a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:3: a= ( '+' | '-' | NEGINTEGER | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) ( expression )?
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||input.LA(1)==NEGINTEGER||(input.LA(1)>=52 && input.LA(1)<=58) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression812);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:68: ( expression )?
            int alt26=2;
            switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA26_391 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA26_392 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA26_393 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA26_394 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA26_395 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA26_396 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA26_397 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA26_398 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 85:
                                    {
                                    int LA26_399 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA26_400 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_401 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_402 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_403 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_404 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_405 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_406 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case 65:
                                    {
                                    int LA26_407 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_408 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_409 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_410 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_411 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_412 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case 65:
                                    {
                                    int LA26_413 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_414 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_415 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_416 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_417 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_418 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case 65:
                                    {
                                    int LA26_419 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_420 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_421 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_422 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_423 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_424 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case 85:
                                    {
                                    int LA26_425 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_426 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_427 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_428 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_429 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_430 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_431 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case 65:
                                    {
                                    int LA26_432 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                    int LA26_433 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 59:
                                case 60:
                                    {
                                    int LA26_434 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 61:
                                case 62:
                                    {
                                    int LA26_435 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 63:
                                case 64:
                                    {
                                    int LA26_436 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA26_437 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                                case LPAREN:
                                    {
                                    int LA26_438 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA26_439 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA26_440 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA26_441 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA26_442 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA26_443 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA26_444 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA26_445 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                    switch ( input.LA(2) ) {
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA26_446 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA26_447 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA26_448 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA26_449 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA26_450 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA26_451 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA26_452 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA26_453 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case WORD:
                            {
                            int LA26_335 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case HEXNUMBER:
                            {
                            int LA26_336 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA26_337 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case NUMBER:
                            {
                            int LA26_338 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case OIVAR:
                        case GLOBALVAR:
                            {
                            int LA26_339 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case DECIMAL:
                            {
                            int LA26_340 = input.LA(3);

                            if ( (synpred62()) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case 50:
                        case 51:
                            {
                            switch ( input.LA(3) ) {
                                case LPAREN:
                                    {
                                    int LA26_732 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA26_733 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA26_734 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA26_735 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA26_736 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA26_737 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA26_738 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
                                    }
                                    }
                                    break;
                                case 50:
                                case 51:
                                    {
                                    int LA26_739 = input.LA(4);

                                    if ( (synpred62()) ) {
                                        alt26=1;
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
                    int LA26_28 = input.LA(2);

                    if ( (synpred62()) ) {
                        alt26=1;
                    }
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:69: expression
                    {
                    pushFollow(FOLLOW_expression_in_aexpression839);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt27=4;
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

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value860); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value862); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value864); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:113:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value866);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:116:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:117:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:117:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression882); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression886);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression888); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:120:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:121:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:121:3: a= ( '&&' | 'and' )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=59 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression905);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:124:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:125:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:125:3: o= ( '||' | 'or' )
            {
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=61 && input.LA(1)<=62) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression926);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:128:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:129:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:129:3: x= ( '^^' | 'xor' )
            {
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=63 && input.LA(1)<=64) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression947);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:132:1: relationalExpression returns [String value] : ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* ;
    public final String relationalExpression() throws RecognitionException {
        String value = null;
        int relationalExpression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:133:3: ( ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD ) ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )
            int alt28=7;
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
                        new NoViableAltException("134:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 28, 1, input);

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
                    new NoViableAltException("134:3: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | WORD )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:4: function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression971);
                    function();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:13: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression973); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:23: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression975); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:30: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression977); if (failed) return value;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:37: variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression979);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:46: DECIMAL
                    {
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression981); if (failed) return value;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:54: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression983); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:60: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )*
            loop30:
            do {
                int alt30=2;
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


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    {
            	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||input.LA(1)==65 ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression988);    throw mse;
            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
            	    int alt29=6;
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
            	                new NoViableAltException("134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 29, 1, input);

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
            	            new NoViableAltException("134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:114: function
            	            {
            	            pushFollow(FOLLOW_function_in_relationalExpression1009);
            	            function();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:123: HEXNUMBER
            	            {
            	            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1011); if (failed) return value;

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:133: STRING
            	            {
            	            match(input,STRING,FOLLOW_STRING_in_relationalExpression1013); if (failed) return value;

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:140: NUMBER
            	            {
            	            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1015); if (failed) return value;

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:147: variable
            	            {
            	            pushFollow(FOLLOW_variable_in_relationalExpression1017);
            	            variable();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:156: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_relationalExpression1019); if (failed) return value;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:137:1: repeatstatement returns [String value] : 'repeat' e= expression (s= statement ) ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:138:1: ( 'repeat' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:138:3: 'repeat' e= expression (s= statement )
            {
            match(input,66,FOLLOW_66_in_repeatstatement1040); if (failed) return value;
            pushFollow(FOLLOW_expression_in_repeatstatement1044);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:138:25: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:138:26: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1049);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:141:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:142:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:142:3: 'break'
            {
            match(input,67,FOLLOW_67_in_breakstatement1065); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:144:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:145:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:145:3: 'continue'
            {
            match(input,68,FOLLOW_68_in_continuestatement1082); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:148:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        statement_return s = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:149:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:149:3: 'do' s= statement 'until' e= expression
            {
            match(input,69,FOLLOW_69_in_dostatement1099); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1103);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,70,FOLLOW_70_in_dostatement1105); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1109);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:152:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:153:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:153:3: 'while' e= expression (s= statement )
            {
            match(input,71,FOLLOW_71_in_whilestatement1124); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1128);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:153:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:153:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1133);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:156:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        statement_return s1 = null;

        expression_return e = null;

        statement_return s2 = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:157:1: ( 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:157:3: 'for' '(' s1= statement e= expression ';' s2= statement ')' s= statement
            {
            match(input,72,FOLLOW_72_in_forstatement1149); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1151); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1155);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1159);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,36,FOLLOW_36_in_forstatement1161); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1165);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1167); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1171);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:160:1: switchstatement returns [String value] : 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:1: ( 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:3: 'switch' ( expression ) '{' ( ( 'case' | 'default' ) expression ':' ( statement )* )* '}'
            {
            match(input,73,FOLLOW_73_in_switchstatement1186); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1189);
            expression();
            _fsp--;
            if (failed) return value;

            }

            match(input,LBRAC,FOLLOW_LBRAC_in_switchstatement1192); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:29: ( ( 'case' | 'default' ) expression ':' ( statement )* )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=74 && LA32_0<=75)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:30: ( 'case' | 'default' ) expression ':' ( statement )*
            	    {
            	    if ( (input.LA(1)>=74 && input.LA(1)<=75) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1195);    throw mse;
            	    }

            	    pushFollow(FOLLOW_expression_in_switchstatement1201);
            	    expression();
            	    _fsp--;
            	    if (failed) return value;
            	    match(input,76,FOLLOW_76_in_switchstatement1203); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:64: ( statement )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==LBRAC||LA31_0==WORD||(LA31_0>=OIVAR && LA31_0<=GLOBALVAR)||LA31_0==42||(LA31_0>=44 && LA31_0<=46)||(LA31_0>=66 && LA31_0<=69)||(LA31_0>=71 && LA31_0<=73)||LA31_0==77) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:161:65: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1206);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,RBRAC,FOLLOW_RBRAC_in_switchstatement1212); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:164:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        statement_return s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:165:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:165:3: 'with' e= expression s= statement
            {
            match(input,77,FOLLOW_77_in_withstatement1228); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1233);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1238);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:168:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:169:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:169:3: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&\\\\' | '^=' ) e= expression
            {
            if ( backtracking==0 ) {
              System.out.println("assignment ");
            }
            pushFollow(FOLLOW_variable_in_assignment1257);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==65||(input.LA(1)>=78 && input.LA(1)<=84) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1261);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1284);
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:172:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:3: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            {
            if ( backtracking==0 ) {
              System.out.println("variable ");
            }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt33=2;
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

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("173:38: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:39: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1304);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = a;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:173:67: valuee= ( WORD | OIVAR | GLOBALVAR )
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1309);    throw mse;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:176:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1333); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1335); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LPAREN||LA36_0==WORD||(LA36_0>=NUMBER && LA36_0<=GLOBALVAR)||(LA36_0>=50 && LA36_0<=51)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1340);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:48: ( ( ',' ) (e= expression )? )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==40) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:49: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:49: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:50: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_function1346); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:55: (e= expression )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==LPAREN||LA34_0==WORD||(LA34_0>=NUMBER && LA34_0<=GLOBALVAR)||(LA34_0>=50 && LA34_0<=51)) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:177:56: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1352);
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

            match(input,RPAREN,FOLLOW_RPAREN_in_function1361); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:180:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21379); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21381); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==LPAREN||LA39_0==WORD||(LA39_0>=NUMBER && LA39_0<=GLOBALVAR)||(LA39_0>=50 && LA39_0<=51)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21386);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:49: ( ( ',' ) (e= expression )? )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==40) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:51: ','
                    	    {
                    	    match(input,40,FOLLOW_40_in_function21391); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:56: (e= expression )?
                    	    int alt37=2;
                    	    int LA37_0 = input.LA(1);

                    	    if ( (LA37_0==LPAREN||LA37_0==WORD||(LA37_0>=NUMBER && LA37_0<=GLOBALVAR)||(LA37_0>=50 && LA37_0<=51)) ) {
                    	        alt37=1;
                    	    }
                    	    switch (alt37) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:181:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21397);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21406); if (failed) return value;
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
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:184:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:185:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:185:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' e= expression ']'
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1428);    throw mse;
            }

            match(input,85,FOLLOW_85_in_array1436); if (failed) return value;
            pushFollow(FOLLOW_expression_in_array1440);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,86,FOLLOW_86_in_array1442); if (failed) return value;
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
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: ( field )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:26: field
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
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:70: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:70: method
        {
        pushFollow(FOLLOW_method_in_synpred2204);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:687: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:687: ';'
        {
        match(input,36,FOLLOW_36_in_synpred21341); if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:34: ( field )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:34: field
        {
        pushFollow(FOLLOW_field_in_synpred32480);
        field();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:40: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:40: method
        {
        pushFollow(FOLLOW_method_in_synpred33482);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:54: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:54: variable
        {
        pushFollow(FOLLOW_variable_in_synpred38553);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:133: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:81:133: variable
        {
        pushFollow(FOLLOW_variable_in_synpred39570);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:85: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:93:85: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred42660);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred46
    public final void synpred46_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:117: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:117: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred46741);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred46

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:162: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:162: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:162: ( andexpression | orexpression | xorexpression )
        int alt46=3;
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

            throw nvae;
        }

        switch (alt46) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:163: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred49751);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:205: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred49756);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:248: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred49761);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:289: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:102:290: expression
        {
        pushFollow(FOLLOW_expression_in_synpred49768);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:69: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:110:69: expression
        {
        pushFollow(FOLLOW_expression_in_synpred62839);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:37: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:37: variable
        {
        pushFollow(FOLLOW_variable_in_synpred73979);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:147: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:147: variable
        {
        pushFollow(FOLLOW_variable_in_synpred871017);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred88
    public final void synpred88_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:62: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD ) )
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:62: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==51||input.LA(1)==65 ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred88988);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )
        int alt47=6;
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
                    new NoViableAltException("134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 47, 1, input);

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
                new NoViableAltException("134:113: ( function | HEXNUMBER | STRING | NUMBER | variable | WORD )", 47, 0, input);

            throw nvae;
        }

        switch (alt47) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:114: function
                {
                pushFollow(FOLLOW_function_in_synpred881009);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:123: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred881011); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:133: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred881013); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:140: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred881015); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:147: variable
                {
                pushFollow(FOLLOW_variable_in_synpred881017);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:134:156: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred881019); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred88

    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
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
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
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
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
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
    public final boolean synpred73() {
        backtracking++;
        int start = input.mark();
        try {
            synpred73_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred88() {
        backtracking++;
        int start = input.mark();
        try {
            synpred88_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_field_in_classes199 = new BitSet(new long[]{0x000002F000200002L});
    public static final BitSet FOLLOW_method_in_classes204 = new BitSet(new long[]{0x000002F000200002L});
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
    public static final BitSet FOLLOW_37_in_field359 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_38_in_field363 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_field370 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varstatement_in_field378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_method401 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_38_in_method404 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_39_in_method410 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method417 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method421 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method423 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_method428 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_method434 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_method440 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method449 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_bstatement_in_method453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_innerclass469 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_innerclass471 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_set_in_innerclass473 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_field_in_innerclass480 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_method_in_innerclass482 = new BitSet(new long[]{0x000008E000200800L});
    public static final BitSet FOLLOW_set_in_innerclass486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement506 = new BitSet(new long[]{0x00007C0018200C00L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_bstatement515 = new BitSet(new long[]{0x00007C0018200C00L,0x00000000000023BCL});
    public static final BitSet FOLLOW_set_in_bstatement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_varstatement548 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement553 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement559 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_varstatement565 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement570 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement576 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_44_in_returnstatement598 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_returnstatement605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exitstatement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ifstatement640 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_ifstatement644 = new BitSet(new long[]{0x0000F40018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_47_in_ifstatement647 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_ifstatement654 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement660 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_elsestatement680 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_49_in_elsestatement683 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_elsestatement687 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_elsestatement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_expression724 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_relationalExpression_in_expression729 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_notexpression_in_expression734 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_aexpression_in_expression741 = new BitSet(new long[]{0xFFF00000004000F2L,0x0000000000000001L});
    public static final BitSet FOLLOW_andexpression_in_expression751 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_expression756 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_expression761 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_expression768 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_notexpression787 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_notexpression795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression812 = new BitSet(new long[]{0x000C00001FA00102L});
    public static final BitSet FOLLOW_expression_in_aexpression839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression882 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_pexpression886 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression971 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression973 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression975 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression977 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression979 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression981 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression983 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExpression988 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_relationalExpression1009 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1011 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1013 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1015 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1017 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1019 = new BitSet(new long[]{0x000800000007F002L,0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_repeatstatement1040 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1044 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_repeatstatement1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_breakstatement1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_continuestatement1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_dostatement1099 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_dostatement1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_dostatement1105 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_dostatement1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_whilestatement1124 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_whilestatement1128 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_whilestatement1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_forstatement1149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1151 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1155 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_forstatement1159 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_forstatement1161 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1167 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_forstatement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_switchstatement1186 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1189 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_LBRAC_in_switchstatement1192 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_switchstatement1195 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_switchstatement1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_switchstatement1203 = new BitSet(new long[]{0x0000740018200C00L,0x0000000000002FBCL});
    public static final BitSet FOLLOW_statement_in_switchstatement1206 = new BitSet(new long[]{0x0000740018200C00L,0x0000000000002FBCL});
    public static final BitSet FOLLOW_RBRAC_in_switchstatement1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_withstatement1228 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_withstatement1233 = new BitSet(new long[]{0x0000740018200400L,0x00000000000023BCL});
    public static final BitSet FOLLOW_statement_in_withstatement1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1257 = new BitSet(new long[]{0x0000000000001000L,0x00000000001FC002L});
    public static final BitSet FOLLOW_set_in_assignment1261 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_assignment1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_variable1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_function1333 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1335 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1340 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function1346 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_function1352 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21379 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21381 = new BitSet(new long[]{0x000C00001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21386 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_40_in_function21391 = new BitSet(new long[]{0x000C01001FA00300L});
    public static final BitSet FOLLOW_expression_in_function21397 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_array1436 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_array1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_array1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred21341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_synpred32480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred33482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred38553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred39570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred42660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred46741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred49751 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_orexpression_in_synpred49756 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_xorexpression_in_synpred49761 = new BitSet(new long[]{0x000C00001FA00100L});
    public static final BitSet FOLLOW_expression_in_synpred49768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred62839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred73979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred871017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred88988 = new BitSet(new long[]{0x000000001BA00000L});
    public static final BitSet FOLLOW_function_in_synpred881009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred881011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred881013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred881015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred881017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred881019 = new BitSet(new long[]{0x0000000000000002L});

}