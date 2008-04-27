// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g 2008-01-08 03:35:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
public class parsegmlfunctionlistParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WORD", "WHITESPACE", "LETTER", "COMMENT", "ML_COMMENT", "'#'", "'*'", "'('", "','", "'...'", "')'"
    };
    public static final int WORD=4;
    public static final int ML_COMMENT=8;
    public static final int LETTER=6;
    public static final int WHITESPACE=5;
    public static final int COMMENT=7;
    public static final int EOF=-1;
    public static final String[] ruleNames = new String[] {
        "invalidRule", "start", "variable", "function"
    };

    public int ruleLevel = 0;
    public parsegmlfunctionlistParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }

            ruleMemo = new Map[10+1];
    }
    public parsegmlfunctionlistParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT);
    }
    public parsegmlfunctionlistParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g"; }



    // $ANTLR start start
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:1: start : ( variable | function )* ;
    public final void start() throws RecognitionException {
        int start_StartIndex = input.index();
        try { dbg.enterRule("start");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(9, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:7: ( ( variable | function )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:9: ( variable | function )*
            {
            dbg.location(9,9);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:9: ( variable | function )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==WORD) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==11) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==EOF||LA1_2==WORD||(LA1_2>=9 && LA1_2<=10)) ) {
                        alt1=1;
                    }


                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:10: variable
            	    {
            	    dbg.location(9,10);
            	    pushFollow(FOLLOW_variable_in_start35);
            	    variable();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:9:19: function
            	    {
            	    dbg.location(9,19);
            	    pushFollow(FOLLOW_function_in_start37);
            	    function();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        dbg.location(10, 2);

        }
        finally {
            dbg.exitRule("start");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end start


    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:1: variable : WORD ( '#' )? ( '*' )* ;
    public final void variable() throws RecognitionException {
        int variable_StartIndex = input.index();
        try { dbg.enterRule("variable");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(11, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:10: ( WORD ( '#' )? ( '*' )* )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:12: WORD ( '#' )? ( '*' )*
            {
            dbg.location(11,12);
            match(input,WORD,FOLLOW_WORD_in_variable48); if (failed) return ;
            dbg.location(11,17);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:17: ( '#' )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:18: '#'
                    {
                    dbg.location(11,18);
                    match(input,9,FOLLOW_9_in_variable51); if (failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(11,24);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:24: ( '*' )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:11:25: '*'
            	    {
            	    dbg.location(11,25);
            	    match(input,10,FOLLOW_10_in_variable56); if (failed) return ;

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
            if ( backtracking>0 ) { memoize(input, 2, variable_StartIndex); }
        }
        dbg.location(12, 2);

        }
        finally {
            dbg.exitRule("variable");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:14:1: function : w= WORD '(' (ww= WORD ( ',' (www= WORD | '...' ) )* )? ')' ;
    public final void function() throws RecognitionException {
        int function_StartIndex = input.index();
        Token w=null;
        Token ww=null;
        Token www=null;

        try { dbg.enterRule("function");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(14, 1);

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:2: (w= WORD '(' (ww= WORD ( ',' (www= WORD | '...' ) )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:4: w= WORD '(' (ww= WORD ( ',' (www= WORD | '...' ) )* )? ')'
            {
            dbg.location(15,5);
            w=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function73); if (failed) return ;
            dbg.location(15,11);
            if ( backtracking==0 ) {
              System.out.print("public static Object "+w.getText()+"(");
            }
            dbg.location(15,67);
            match(input,11,FOLLOW_11_in_function76); if (failed) return ;
            dbg.location(15,70);
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:70: (ww= WORD ( ',' (www= WORD | '...' ) )* )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==WORD) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:71: ww= WORD ( ',' (www= WORD | '...' ) )*
                    {
                    dbg.location(15,73);
                    ww=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_function80); if (failed) return ;
                    dbg.location(15,79);
                    if ( backtracking==0 ) {
                      System.out.print("Object "+ww.getText());
                    }
                    dbg.location(15,119);
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:119: ( ',' (www= WORD | '...' ) )*
                    try { dbg.enterSubRule(5);

                    loop5:
                    do {
                        int alt5=2;
                        try { dbg.enterDecision(5);

                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        } finally {dbg.exitDecision(5);}

                        switch (alt5) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:120: ',' (www= WORD | '...' )
                    	    {
                    	    dbg.location(15,120);
                    	    match(input,12,FOLLOW_12_in_function85); if (failed) return ;
                    	    dbg.location(15,124);
                    	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:124: (www= WORD | '...' )
                    	    int alt4=2;
                    	    try { dbg.enterSubRule(4);
                    	    try { dbg.enterDecision(4);

                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==WORD) ) {
                    	        alt4=1;
                    	    }
                    	    else if ( (LA4_0==13) ) {
                    	        alt4=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("15:124: (www= WORD | '...' )", 4, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;
                    	    }
                    	    } finally {dbg.exitDecision(4);}

                    	    switch (alt4) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:125: www= WORD
                    	            {
                    	            dbg.location(15,128);
                    	            www=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_function90); if (failed) return ;
                    	            dbg.location(15,133);
                    	            if ( backtracking==0 ) {
                    	              System.out.print(", Object "+www.getText());
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\parsegmlfunctionlist.g:15:176: '...'
                    	            {
                    	            dbg.location(15,176);
                    	            match(input,13,FOLLOW_13_in_function93); if (failed) return ;

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(4);}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(15,186);
            match(input,14,FOLLOW_14_in_function99); if (failed) return ;
            dbg.location(15,189);
            if ( backtracking==0 ) {
              System.out.println(")\n{\nreturn new Object();\n}\n");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, function_StartIndex); }
        }
        dbg.location(16, 2);

        }
        finally {
            dbg.exitRule("function");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end function


 

    public static final BitSet FOLLOW_variable_in_start35 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_function_in_start37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_WORD_in_variable48 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_9_in_variable51 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_variable56 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WORD_in_function73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_function76 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_WORD_in_function80 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_function85 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_WORD_in_function90 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_13_in_function93 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_function99 = new BitSet(new long[]{0x0000000000000002L});

}