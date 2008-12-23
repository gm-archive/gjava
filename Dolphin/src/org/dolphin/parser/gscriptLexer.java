// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g 2008-12-23 19:23:02

package org.dolphin.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gscriptLexer extends Lexer {
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int LETTER=30;
    public static final int EQUALS=12;
    public static final int EOF=-1;
    public static final int WORD=21;
    public static final int RPAREN=9;
    public static final int RBRAC=11;
    public static final int GLOBALVAR=28;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int COMMENT=32;
    public static final int T36=36;
    public static final int OIVAR=27;
    public static final int HEXNUMBER=23;
    public static final int NUMBER=22;
    public static final int WHITESPACE=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int MULT=6;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T50=50;
    public static final int T59=59;
    public static final int GT=15;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int GTE=16;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int T72=72;
    public static final int LPAREN=8;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int ML_COMMENT=33;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int PLUS=4;
    public static final int DIGIT=29;
    public static final int T61=61;
    public static final int T60=60;
    public static final int EQUALS2=13;
    public static final int STUPIDDECIMAL=26;
    public static final int MINUS=5;
    public static final int Tokens=92;
    public static final int T91=91;
    public static final int LBRAC=10;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int DECIMAL=25;
    public static final int T87=87;
    public static final int STRING_DOUBLE=34;
    public static final int STRING_SINGLE=35;
    public static final int DIV=7;
    public static final int T81=81;
    public static final int T80=80;
    public static final int JAVACODE=20;
    public static final int T83=83;
    public static final int T82=82;
    public static final int STRING=24;
    public gscriptLexer() {;} 
    public gscriptLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g"; }

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:6:6: ( '+' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:6:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:7:7: ( '-' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:7:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start MULT
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:8:6: ( '*' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:8:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:9:5: ( '/' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:9:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:10:8: ( '(' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:10:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:11:8: ( ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:11:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LBRAC
    public final void mLBRAC() throws RecognitionException {
        try {
            int _type = LBRAC;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:12:7: ( '{' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:12:9: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRAC

    // $ANTLR start RBRAC
    public final void mRBRAC() throws RecognitionException {
        try {
            int _type = RBRAC;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:13:7: ( '}' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:13:9: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRAC

    // $ANTLR start EQUALS
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:14:8: ( '=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:14:10: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS

    // $ANTLR start EQUALS2
    public final void mEQUALS2() throws RecognitionException {
        try {
            int _type = EQUALS2;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:15:9: ( '==' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:15:11: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS2

    // $ANTLR start NOT_EQUALS
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:16:12: ( '!=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:16:14: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUALS

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:17:4: ( '>' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:17:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start GTE
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:18:5: ( '>=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:18:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:19:4: ( '<' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:19:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start LTE
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:20:5: ( '<=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:20:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTE

    // $ANTLR start COMMENT1
    public final void mCOMMENT1() throws RecognitionException {
        try {
            int _type = COMMENT1;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:21:10: ( '//' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:21:12: '//'
            {
            match("//"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT1

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:22:5: ( ';' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:22:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:23:5: ( 'public' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:23:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:24:5: ( 'private' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:24:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:25:5: ( 'var' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:25:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:26:5: ( 'final' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:26:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:27:5: ( 'static' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:27:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:28:5: ( ',' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:28:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:29:5: ( 'begin' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:29:7: 'begin'
            {
            match("begin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:30:5: ( 'end' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:30:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:31:5: ( 'globalvar' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:31:7: 'globalvar'
            {
            match("globalvar"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:32:5: ( 'return' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:32:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:33:5: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:33:7: 'exit'
            {
            match("exit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:34:5: ( 'if' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:34:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:35:5: ( 'then' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:35:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:36:5: ( 'else' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:36:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:37:5: ( 'elsif' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:37:7: 'elsif'
            {
            match("elsif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:38:5: ( 'not' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:38:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:39:5: ( '!' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:39:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:40:5: ( '|' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:40:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:41:5: ( '&' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:41:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:42:5: ( '^' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:42:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:43:5: ( '<<' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:43:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:44:5: ( '>>' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:44:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:45:5: ( 'div' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:45:7: 'div'
            {
            match("div"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:46:5: ( 'mod' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:46:7: 'mod'
            {
            match("mod"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:47:5: ( '~' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:47:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:48:5: ( '&&' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:48:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:49:5: ( 'and' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:49:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:50:5: ( '||' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:50:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:51:5: ( 'or' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:51:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:52:5: ( '^^' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:52:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:53:5: ( 'xor' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:53:7: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:54:5: ( ':=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:54:7: ':='
            {
            match(":="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:55:5: ( '<>' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:55:7: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:5: ( 'repeat' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:7: 'repeat'
            {
            match("repeat"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:5: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:57:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:58:5: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:58:7: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:59:5: ( 'do' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:59:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:5: ( 'until' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:7: 'until'
            {
            match("until"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:5: ( 'while' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:61:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:62:5: ( 'for' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:62:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:63:5: ( 'switch' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:63:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:5: ( 'case' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:5: ( 'default' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:65:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:66:5: ( ':' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:66:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:67:5: ( 'with' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:67:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:68:5: ( '+=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:68:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:69:5: ( '-=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:69:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:70:5: ( '*=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:70:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:5: ( '/=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:5: ( '|=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:7: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:5: ( '&=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:73:7: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:74:5: ( '^=' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:74:7: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:5: ( '.' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:5: ( '[' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:5: ( ']' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:77:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:210:8: ( ( DIGIT )+ )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:210:10: ( DIGIT )+
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:210:10: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:210:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start HEXNUMBER
    public final void mHEXNUMBER() throws RecognitionException {
        try {
            int _type = HEXNUMBER;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:213:1: ( '$' ( DIGIT | LETTER )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:213:3: '$' ( DIGIT | LETTER )*
            {
            match('$'); 
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:213:7: ( DIGIT | LETTER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEXNUMBER

    // $ANTLR start GLOBALVAR
    public final void mGLOBALVAR() throws RecognitionException {
        try {
            int _type = GLOBALVAR;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:217:1: ( 'global' '.' WORD )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:217:3: 'global' '.' WORD
            {
            match("global"); 

            match('.'); 
            mWORD(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GLOBALVAR

    // $ANTLR start OIVAR
    public final void mOIVAR() throws RecognitionException {
        try {
            int _type = OIVAR;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:219:7: ( WORD '.' WORD )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:219:9: WORD '.' WORD
            {
            mWORD(); 
            match('.'); 
            mWORD(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OIVAR

    // $ANTLR start DECIMAL
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:221:9: ( NUMBER '.' NUMBER )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:221:11: NUMBER '.' NUMBER
            {
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DECIMAL

    // $ANTLR start STUPIDDECIMAL
    public final void mSTUPIDDECIMAL() throws RecognitionException {
        try {
            int _type = STUPIDDECIMAL;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:224:2: ( '.' NUMBER )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:224:4: '.' NUMBER
            {
            match('.'); 
            mNUMBER(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STUPIDDECIMAL

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+ )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
                switch ( input.LA(1) ) {
                case '\t':
                    {
                    alt3=1;
                    }
                    break;
                case ' ':
                    {
                    alt3=2;
                    }
                    break;
                case '\r':
                    {
                    alt3=3;
                    }
                    break;
                case '\n':
                    {
                    alt3=4;
                    }
                    break;
                case '\f':
                    {
                    alt3=5;
                    }
                    break;
                case '#':
                    {
                    alt3=6;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:16: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:23: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:29: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:36: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:42: '\\u000C'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:227:52: '#define' WORD
            	    {
            	    match("#define"); 

            	    mWORD(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:229:16: ( '0' .. '9' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:229:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:232:1: ( ( '_' | LETTER ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:232:3: ( '_' | LETTER ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:232:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:235:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:235:10: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:240:3: ( '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:240:5: '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:240:10: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:240:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:245:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:245:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:245:14: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFE')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:245:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:248:8: ( STRING_DOUBLE | STRING_SINGLE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("248:1: STRING : ( STRING_DOUBLE | STRING_SINGLE );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:248:10: STRING_DOUBLE
                    {
                    mSTRING_DOUBLE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:248:24: STRING_SINGLE
                    {
                    mSTRING_SINGLE(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start JAVACODE
    public final void mJAVACODE() throws RecognitionException {
        try {
            int _type = JAVACODE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:252:2: ( '@@java_Begin' ( options {greedy=false; } : . )* '@@java_End' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:252:5: '@@java_Begin' ( options {greedy=false; } : . )* '@@java_End'
            {
            match("@@java_Begin"); 

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:252:20: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='@') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='@') ) {
                        int LA8_3 = input.LA(3);

                        if ( ((LA8_3>='\u0000' && LA8_3<='i')||(LA8_3>='k' && LA8_3<='\uFFFE')) ) {
                            alt8=1;
                        }
                        else if ( (LA8_3=='j') ) {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4=='a') ) {
                                int LA8_5 = input.LA(5);

                                if ( (LA8_5=='v') ) {
                                    int LA8_6 = input.LA(6);

                                    if ( (LA8_6=='a') ) {
                                        int LA8_7 = input.LA(7);

                                        if ( (LA8_7=='_') ) {
                                            int LA8_8 = input.LA(8);

                                            if ( (LA8_8=='E') ) {
                                                int LA8_9 = input.LA(9);

                                                if ( (LA8_9=='n') ) {
                                                    int LA8_10 = input.LA(10);

                                                    if ( (LA8_10=='d') ) {
                                                        alt8=2;
                                                    }
                                                    else if ( ((LA8_10>='\u0000' && LA8_10<='c')||(LA8_10>='e' && LA8_10<='\uFFFE')) ) {
                                                        alt8=1;
                                                    }


                                                }
                                                else if ( ((LA8_9>='\u0000' && LA8_9<='m')||(LA8_9>='o' && LA8_9<='\uFFFE')) ) {
                                                    alt8=1;
                                                }


                                            }
                                            else if ( ((LA8_8>='\u0000' && LA8_8<='D')||(LA8_8>='F' && LA8_8<='\uFFFE')) ) {
                                                alt8=1;
                                            }


                                        }
                                        else if ( ((LA8_7>='\u0000' && LA8_7<='^')||(LA8_7>='`' && LA8_7<='\uFFFE')) ) {
                                            alt8=1;
                                        }


                                    }
                                    else if ( ((LA8_6>='\u0000' && LA8_6<='`')||(LA8_6>='b' && LA8_6<='\uFFFE')) ) {
                                        alt8=1;
                                    }


                                }
                                else if ( ((LA8_5>='\u0000' && LA8_5<='u')||(LA8_5>='w' && LA8_5<='\uFFFE')) ) {
                                    alt8=1;
                                }


                            }
                            else if ( ((LA8_4>='\u0000' && LA8_4<='`')||(LA8_4>='b' && LA8_4<='\uFFFE')) ) {
                                alt8=1;
                            }


                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='?')||(LA8_1>='A' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='?')||(LA8_0>='A' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:252:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("@@java_End"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JAVACODE

    // $ANTLR start STRING_DOUBLE
    public final void mSTRING_DOUBLE() throws RecognitionException {
        try {
            int _type = STRING_DOUBLE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:256:3: ( '\"' ( '\"' '\"' | ~ ( '\"' ) )* ( '\"' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:256:5: '\"' ( '\"' '\"' | ~ ( '\"' ) )* ( '\"' )
            {
            match('\"'); 
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:257:5: ( '\"' '\"' | ~ ( '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\"') ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFE')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:257:7: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:258:7: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:260:5: ( '\"' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:260:7: '\"'
            {
            match('\"'); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_DOUBLE

    // $ANTLR start STRING_SINGLE
    public final void mSTRING_SINGLE() throws RecognitionException {
        try {
            int _type = STRING_SINGLE;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:265:5: ( '\\'' ( '\\'' '\\'' | ~ ( '\\'' ) )* ( '\\'' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:265:7: '\\'' ( '\\'' '\\'' | ~ ( '\\'' ) )* ( '\\'' )
            {
            match('\''); 
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:266:5: ( '\\'' '\\'' | ~ ( '\\'' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\'') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='\'') ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='\uFFFE')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:266:7: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:267:7: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:269:5: ( '\\'' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:269:7: '\\''
            {
            match('\''); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_SINGLE

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:8: ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | LBRAC | RBRAC | EQUALS | EQUALS2 | NOT_EQUALS | GT | GTE | LT | LTE | COMMENT1 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | NUMBER | HEXNUMBER | GLOBALVAR | OIVAR | DECIMAL | STUPIDDECIMAL | WHITESPACE | WORD | LETTER | COMMENT | ML_COMMENT | STRING | JAVACODE | STRING_DOUBLE | STRING_SINGLE )
        int alt11=87;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:30: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:37: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:44: LBRAC
                {
                mLBRAC(); 

                }
                break;
            case 8 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:50: RBRAC
                {
                mRBRAC(); 

                }
                break;
            case 9 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:56: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 10 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:63: EQUALS2
                {
                mEQUALS2(); 

                }
                break;
            case 11 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:71: NOT_EQUALS
                {
                mNOT_EQUALS(); 

                }
                break;
            case 12 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:82: GT
                {
                mGT(); 

                }
                break;
            case 13 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:85: GTE
                {
                mGTE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:89: LT
                {
                mLT(); 

                }
                break;
            case 15 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:92: LTE
                {
                mLTE(); 

                }
                break;
            case 16 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:96: COMMENT1
                {
                mCOMMENT1(); 

                }
                break;
            case 17 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:105: T36
                {
                mT36(); 

                }
                break;
            case 18 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:109: T37
                {
                mT37(); 

                }
                break;
            case 19 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:113: T38
                {
                mT38(); 

                }
                break;
            case 20 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:117: T39
                {
                mT39(); 

                }
                break;
            case 21 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:121: T40
                {
                mT40(); 

                }
                break;
            case 22 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:125: T41
                {
                mT41(); 

                }
                break;
            case 23 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:129: T42
                {
                mT42(); 

                }
                break;
            case 24 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:133: T43
                {
                mT43(); 

                }
                break;
            case 25 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:137: T44
                {
                mT44(); 

                }
                break;
            case 26 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:141: T45
                {
                mT45(); 

                }
                break;
            case 27 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:145: T46
                {
                mT46(); 

                }
                break;
            case 28 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:149: T47
                {
                mT47(); 

                }
                break;
            case 29 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:153: T48
                {
                mT48(); 

                }
                break;
            case 30 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:157: T49
                {
                mT49(); 

                }
                break;
            case 31 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:161: T50
                {
                mT50(); 

                }
                break;
            case 32 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:165: T51
                {
                mT51(); 

                }
                break;
            case 33 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:169: T52
                {
                mT52(); 

                }
                break;
            case 34 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:173: T53
                {
                mT53(); 

                }
                break;
            case 35 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:177: T54
                {
                mT54(); 

                }
                break;
            case 36 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:181: T55
                {
                mT55(); 

                }
                break;
            case 37 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:185: T56
                {
                mT56(); 

                }
                break;
            case 38 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:189: T57
                {
                mT57(); 

                }
                break;
            case 39 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:193: T58
                {
                mT58(); 

                }
                break;
            case 40 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:197: T59
                {
                mT59(); 

                }
                break;
            case 41 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:201: T60
                {
                mT60(); 

                }
                break;
            case 42 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:205: T61
                {
                mT61(); 

                }
                break;
            case 43 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:209: T62
                {
                mT62(); 

                }
                break;
            case 44 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:213: T63
                {
                mT63(); 

                }
                break;
            case 45 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:217: T64
                {
                mT64(); 

                }
                break;
            case 46 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:221: T65
                {
                mT65(); 

                }
                break;
            case 47 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:225: T66
                {
                mT66(); 

                }
                break;
            case 48 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:229: T67
                {
                mT67(); 

                }
                break;
            case 49 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:233: T68
                {
                mT68(); 

                }
                break;
            case 50 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:237: T69
                {
                mT69(); 

                }
                break;
            case 51 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:241: T70
                {
                mT70(); 

                }
                break;
            case 52 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:245: T71
                {
                mT71(); 

                }
                break;
            case 53 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:249: T72
                {
                mT72(); 

                }
                break;
            case 54 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:253: T73
                {
                mT73(); 

                }
                break;
            case 55 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:257: T74
                {
                mT74(); 

                }
                break;
            case 56 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:261: T75
                {
                mT75(); 

                }
                break;
            case 57 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:265: T76
                {
                mT76(); 

                }
                break;
            case 58 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:269: T77
                {
                mT77(); 

                }
                break;
            case 59 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:273: T78
                {
                mT78(); 

                }
                break;
            case 60 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:277: T79
                {
                mT79(); 

                }
                break;
            case 61 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:281: T80
                {
                mT80(); 

                }
                break;
            case 62 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:285: T81
                {
                mT81(); 

                }
                break;
            case 63 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:289: T82
                {
                mT82(); 

                }
                break;
            case 64 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:293: T83
                {
                mT83(); 

                }
                break;
            case 65 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:297: T84
                {
                mT84(); 

                }
                break;
            case 66 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:301: T85
                {
                mT85(); 

                }
                break;
            case 67 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:305: T86
                {
                mT86(); 

                }
                break;
            case 68 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:309: T87
                {
                mT87(); 

                }
                break;
            case 69 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:313: T88
                {
                mT88(); 

                }
                break;
            case 70 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:317: T89
                {
                mT89(); 

                }
                break;
            case 71 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:321: T90
                {
                mT90(); 

                }
                break;
            case 72 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:325: T91
                {
                mT91(); 

                }
                break;
            case 73 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:329: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 74 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:336: HEXNUMBER
                {
                mHEXNUMBER(); 

                }
                break;
            case 75 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:346: GLOBALVAR
                {
                mGLOBALVAR(); 

                }
                break;
            case 76 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:356: OIVAR
                {
                mOIVAR(); 

                }
                break;
            case 77 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:362: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 78 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:370: STUPIDDECIMAL
                {
                mSTUPIDDECIMAL(); 

                }
                break;
            case 79 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:384: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 80 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:395: WORD
                {
                mWORD(); 

                }
                break;
            case 81 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:400: LETTER
                {
                mLETTER(); 

                }
                break;
            case 82 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:407: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 83 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:415: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 84 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:426: STRING
                {
                mSTRING(); 

                }
                break;
            case 85 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:433: JAVACODE
                {
                mJAVACODE(); 

                }
                break;
            case 86 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:442: STRING_DOUBLE
                {
                mSTRING_DOUBLE(); 

                }
                break;
            case 87 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:1:456: STRING_SINGLE
                {
                mSTRING_SINGLE(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\63\1\65\1\67\1\73\4\uffff\1\75\1\77\1\102\1\106\1\uffff"+
        "\4\112\1\uffff\7\112\1\135\1\140\1\143\2\112\1\uffff\3\112\1\154"+
        "\3\112\1\163\2\uffff\1\164\1\uffff\1\112\1\uffff\1\112\11\uffff"+
        "\1\172\16\uffff\3\112\2\uffff\14\112\1\u008b\2\112\11\uffff\2\112"+
        "\1\u0090\2\112\1\u0093\1\112\2\uffff\5\112\4\uffff\1\u009b\1\uffff"+
        "\1\u009b\3\uffff\2\112\1\u009f\1\112\1\u00a1\6\112\1\u00a9\3\112"+
        "\1\uffff\1\112\1\u00ae\1\u00af\1\112\1\uffff\1\u00b1\1\u00b2\1\uffff"+
        "\1\u00b3\5\112\3\uffff\2\112\1\uffff\1\112\1\uffff\4\112\1\u00c0"+
        "\1\u00c1\1\112\1\uffff\3\112\1\u00c6\2\uffff\1\112\3\uffff\1\u00c8"+
        "\2\112\1\u00cb\3\112\1\u00cf\2\112\1\u00d2\1\u00d3\2\uffff\1\u00d4"+
        "\3\112\1\uffff\1\112\1\uffff\1\112\1\u00da\1\uffff\1\u00db\1\112"+
        "\1\u00dd\1\uffff\1\u00de\1\u00df\3\uffff\1\112\1\u00e2\1\u00e3\2"+
        "\112\2\uffff\1\u00e6\4\uffff\1\112\2\uffff\1\u00e9\1\112\1\uffff"+
        "\1\u00ec\1\112\1\uffff\1\u00ee\1\u00ec\1\uffff\1\u00ef\2\uffff";
    static final String DFA11_eofS =
        "\u00f0\uffff";
    static final String DFA11_minS =
        "\1\11\3\75\1\52\4\uffff\3\75\1\74\1\uffff\4\56\1\uffff\7\56\1\75"+
        "\1\46\1\75\2\56\1\uffff\3\56\1\75\3\56\1\60\2\uffff\1\56\1\uffff"+
        "\1\56\1\uffff\1\56\2\0\7\uffff\1\0\16\uffff\3\56\2\uffff\17\56\11"+
        "\uffff\7\56\2\uffff\5\56\4\uffff\1\42\1\0\1\47\1\0\2\uffff\17\56"+
        "\1\uffff\4\56\1\uffff\2\56\1\uffff\6\56\1\0\1\uffff\1\0\2\56\1\uffff"+
        "\1\56\1\uffff\7\56\1\uffff\4\56\2\uffff\1\56\3\uffff\14\56\2\uffff"+
        "\4\56\1\uffff\1\56\1\uffff\2\56\1\uffff\3\56\1\uffff\2\56\3\uffff"+
        "\5\56\2\uffff\1\56\3\uffff\1\101\1\56\2\uffff\2\56\1\uffff\1\60"+
        "\1\56\1\uffff\1\56\1\60\1\uffff\1\56\2\uffff";
    static final String DFA11_maxS =
        "\1\176\4\75\4\uffff\2\75\2\76\1\uffff\4\172\1\uffff\7\172\1\174"+
        "\1\75\1\136\2\172\1\uffff\3\172\1\75\3\172\1\71\2\uffff\1\71\1\uffff"+
        "\1\172\1\uffff\1\172\2\ufffe\7\uffff\1\ufffe\16\uffff\3\172\2\uffff"+
        "\17\172\11\uffff\7\172\2\uffff\5\172\4\uffff\1\42\1\ufffe\1\47\1"+
        "\ufffe\2\uffff\17\172\1\uffff\4\172\1\uffff\2\172\1\uffff\6\172"+
        "\1\ufffe\1\uffff\1\ufffe\2\172\1\uffff\1\172\1\uffff\7\172\1\uffff"+
        "\4\172\2\uffff\1\172\3\uffff\14\172\2\uffff\4\172\1\uffff\1\172"+
        "\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\3\uffff\5\172\2\uffff"+
        "\1\172\3\uffff\2\172\2\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1"+
        "\uffff\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\4\uffff\1\21\4\uffff\1\27\14\uffff\1\52"+
        "\10\uffff\1\107\1\110\1\uffff\1\112\1\uffff\1\117\3\uffff\1\125"+
        "\1\77\1\1\1\100\1\2\1\101\1\3\1\uffff\1\123\1\102\1\4\1\12\1\11"+
        "\1\13\1\42\1\47\1\15\1\14\1\62\1\46\1\17\1\16\3\uffff\1\120\1\114"+
        "\17\uffff\1\55\1\103\1\43\1\53\1\104\1\44\1\57\1\105\1\45\7\uffff"+
        "\1\61\1\75\5\uffff\1\116\1\106\1\111\1\115\4\uffff\1\20\1\122\17"+
        "\uffff\1\35\4\uffff\1\66\2\uffff\1\56\7\uffff\1\124\3\uffff\1\24"+
        "\1\uffff\1\71\7\uffff\1\31\4\uffff\1\41\1\50\1\uffff\1\51\1\54\1"+
        "\60\14\uffff\1\34\1\37\4\uffff\1\36\1\uffff\1\73\2\uffff\1\76\3"+
        "\uffff\1\25\2\uffff\1\30\1\64\1\40\5\uffff\1\67\1\70\1\uffff\1\22"+
        "\1\26\1\72\2\uffff\1\33\1\63\2\uffff\1\23\2\uffff\1\74\2\uffff\1"+
        "\113\1\uffff\1\65\1\32";
    static final String DFA11_specialS =
        "\u00f0\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\55\1\uffff\2\55\22\uffff\1\55\1\12\1\57\1\55\1\53\1\uffff"+
            "\1\33\1\60\1\5\1\6\1\3\1\1\1\22\1\2\1\47\1\4\12\52\1\43\1\15"+
            "\1\14\1\11\1\13\1\uffff\1\61\32\54\1\50\1\uffff\1\51\1\34\1"+
            "\56\1\uffff\1\40\1\23\1\44\1\35\1\24\1\20\1\25\1\54\1\27\3\54"+
            "\1\36\1\31\1\41\1\16\1\54\1\26\1\21\1\30\1\45\1\17\1\46\1\42"+
            "\2\54\1\7\1\32\1\10\1\37",
            "\1\62",
            "\1\64",
            "\1\66",
            "\1\71\4\uffff\1\70\15\uffff\1\72",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\76",
            "\1\101\1\100",
            "\1\104\1\105\1\103",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\107\2\111\1\110\5\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\114\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\115\5\111\1\116\13\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\117\2\111\1\120\3\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\121\14\111\1\122\10\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\124\1\111\1\125\11\111\1\123\2\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\126\16\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\127\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\5"+
            "\111\1\130\24\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\7"+
            "\111\1\131\22\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\16"+
            "\111\1\132\13\111",
            "\1\134\76\uffff\1\133",
            "\1\136\26\uffff\1\137",
            "\1\142\40\uffff\1\141",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\145\3\111\1\144\5\111\1\146\13\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\16"+
            "\111\1\147\13\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\150\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\151\10\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\16"+
            "\111\1\152\13\111",
            "\1\153",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\155\15\111\1\156\13\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\157\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\7"+
            "\111\1\161\1\160\21\111",
            "\12\162",
            "",
            "",
            "\1\165\1\uffff\12\52",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\42\167\1\166\uffdc\167",
            "\47\171\1\170\uffd7\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\uffff\173",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\174\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\111\1\175\30\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\176\10\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\177\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\u0080\10\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u0081\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u0082\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\6"+
            "\111\1\u0083\23\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u0084\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u0085\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\22"+
            "\111\1\u0086\7\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\3"+
            "\111\1\u0087\26\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\16"+
            "\111\1\u0088\13\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\17"+
            "\111\1\u008a\3\111\1\u0089\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u008c\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u008d\6\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\25"+
            "\111\1\u008e\4\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\5"+
            "\111\1\u008f\24\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\3"+
            "\111\1\u0091\26\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\3"+
            "\111\1\u0092\26\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\u0094\10\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\22"+
            "\111\1\u0095\7\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\u0096\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u0097\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u0098\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u0099\21\111",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\42\167\1\166\uffdc\167",
            "\1\u009c",
            "\47\171\1\170\uffd7\171",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\25"+
            "\111\1\u009d\4\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u009e\16\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00a0\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00a2\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00a3\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u00a4\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00a5\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00a6\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00a7\3\111\1\u00a8\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\111\1\u00aa\30\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\24"+
            "\111\1\u00ab\5\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00ac\25\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\u00ad\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00b0\31\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00b4\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00b5\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u00b6\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\7"+
            "\111\1\u00b7\22\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u00b8\16\111",
            "\42\167\1\166\uffdc\167",
            "",
            "\47\171\1\170\uffd7\171",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00b9\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u00ba\21\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u00bb\16\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u00bc\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\2"+
            "\111\1\u00bd\27\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\u00be\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\12"+
            "\111\1\u00bf\17\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\5"+
            "\111\1\u00c2\24\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00c3\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\u00c4\10\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00c5\31\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\24"+
            "\111\1\u00c7\5\111",
            "",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\10"+
            "\111\1\u00c9\21\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u00ca\16\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00cc\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00cd\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\2"+
            "\111\1\u00ce\27\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\2"+
            "\111\1\u00d0\27\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\7"+
            "\111\1\u00d1\22\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u00d5\16\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\u00d6\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00d7\6\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\13"+
            "\111\1\u00d8\16\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\15"+
            "\111\1\u00d9\14\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00dc\25\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "",
            "",
            "\1\u00e0\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff"+
            "\25\111\1\u00e1\4\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\23"+
            "\111\1\u00e4\6\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\24"+
            "\111\1\u00e5\5\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            "",
            "",
            "\32\u00e7\4\uffff\1\u00e7\1\uffff\32\u00e7",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\1"+
            "\u00e8\31\111",
            "",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\4"+
            "\111\1\u00ea\25\111",
            "",
            "\12\u00eb\7\uffff\32\u00eb\4\uffff\1\u00eb\1\uffff\32\u00eb",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\21"+
            "\111\1\u00ed\10\111",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "\12\u00eb\7\uffff\32\u00eb\4\uffff\1\u00eb\1\uffff\32\u00eb",
            "",
            "\1\113\1\uffff\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32"+
            "\111",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | LBRAC | RBRAC | EQUALS | EQUALS2 | NOT_EQUALS | GT | GTE | LT | LTE | COMMENT1 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | NUMBER | HEXNUMBER | GLOBALVAR | OIVAR | DECIMAL | STUPIDDECIMAL | WHITESPACE | WORD | LETTER | COMMENT | ML_COMMENT | STRING | JAVACODE | STRING_DOUBLE | STRING_SINGLE );";
        }
    }
 

}