// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 15:11:11

package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class sgclLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int DEC=31;
    public static final int T74=74;
    public static final int LT=14;
    public static final int T79=79;
    public static final int T77=77;
    public static final int MOEQUAL=20;
    public static final int T78=78;
    public static final int DCOMMENT=46;
    public static final int MOD=8;
    public static final int STRCONTENT=40;
    public static final int DCMTB=28;
    public static final int BLKEND=24;
    public static final int DCMTE=29;
    public static final int GTE=11;
    public static final int CHAR=37;
    public static final int PLEQUAL=16;
    public static final int SLCOMMENT=44;
    public static final int FLOAT=35;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int WORD=32;
    public static final int T63=63;
    public static final int T64=64;
    public static final int INC=30;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=34;
    public static final int PLUS=4;
    public static final int DIGIT=39;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=45;
    public static final int T61=61;
    public static final int T60=60;
    public static final int INTEGER=33;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=41;
    public static final int T49=49;
    public static final int WHITESPACE=42;
    public static final int T48=48;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int Tokens=81;
    public static final int LINE=43;
    public static final int T47=47;
    public static final int ALPHA=38;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int T50=50;
    public static final int OR=21;
    public static final int T59=59;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int T52=52;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int STRING=36;
    public static final int T57=57;
    public sgclLexer() {;} 
    public sgclLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:6:6: ( '+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:6:8: '+'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:7:7: ( '-' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:7:9: '-'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:8:6: ( '*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:8:8: '*'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:9:5: ( '/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:9:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:10:5: ( '%' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:10:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:11:7: ( '=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:11:9: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start EQUAL2
    public final void mEQUAL2() throws RecognitionException {
        try {
            int _type = EQUAL2;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:12:8: ( '==' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:12:10: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL2

    // $ANTLR start GTE
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:13:5: ( '>=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:13:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTE

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:14:4: ( '>' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:14:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LTE
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:5: ( '<=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:4: ( '<' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start NEQUAL
    public final void mNEQUAL() throws RecognitionException {
        try {
            int _type = NEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:8: ( '!=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:10: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEQUAL

    // $ANTLR start PLEQUAL
    public final void mPLEQUAL() throws RecognitionException {
        try {
            int _type = PLEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:9: ( '+=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:11: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLEQUAL

    // $ANTLR start MIEQUAL
    public final void mMIEQUAL() throws RecognitionException {
        try {
            int _type = MIEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:9: ( '-=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:11: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MIEQUAL

    // $ANTLR start MUEQUAL
    public final void mMUEQUAL() throws RecognitionException {
        try {
            int _type = MUEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:9: ( '*=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:11: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MUEQUAL

    // $ANTLR start DIEQUAL
    public final void mDIEQUAL() throws RecognitionException {
        try {
            int _type = DIEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:9: ( '/=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:11: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIEQUAL

    // $ANTLR start MOEQUAL
    public final void mMOEQUAL() throws RecognitionException {
        try {
            int _type = MOEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:9: ( '%=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:11: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOEQUAL

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:4: ( '||' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:6: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:5: ( '&&' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start BLKBEG
    public final void mBLKBEG() throws RecognitionException {
        try {
            int _type = BLKBEG;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:8: ( '{' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BLKBEG

    // $ANTLR start BLKEND
    public final void mBLKEND() throws RecognitionException {
        try {
            int _type = BLKEND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:8: ( '}' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BLKEND

    // $ANTLR start CMTSL
    public final void mCMTSL() throws RecognitionException {
        try {
            int _type = CMTSL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:7: ( '//' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:9: '//'
            {
            match("//"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTSL

    // $ANTLR start CMTBEG
    public final void mCMTBEG() throws RecognitionException {
        try {
            int _type = CMTBEG;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:8: ( '/*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:10: '/*'
            {
            match("/*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTBEG

    // $ANTLR start CMTEND
    public final void mCMTEND() throws RecognitionException {
        try {
            int _type = CMTEND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:8: ( '*/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:10: '*/'
            {
            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTEND

    // $ANTLR start DCMTB
    public final void mDCMTB() throws RecognitionException {
        try {
            int _type = DCMTB;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:7: ( '/+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:9: '/+'
            {
            match("/+"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCMTB

    // $ANTLR start DCMTE
    public final void mDCMTE() throws RecognitionException {
        try {
            int _type = DCMTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:7: ( '+/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:9: '+/'
            {
            match("+/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCMTE

    // $ANTLR start INC
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:5: ( '++' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INC

    // $ANTLR start DEC
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:5: ( '--' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEC

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:5: ( 'partial' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:7: 'partial'
            {
            match("partial"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:5: ( 'class' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:7: 'class'
            {
            match("class"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:5: ( 'extends' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:7: 'extends'
            {
            match("extends"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:5: ( 'static' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:7: 'static'
            {
            match("static"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:5: ( 'final' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:7: 'final'
            {
            match("final"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:5: ( ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:7: ';'
            {
            match(';'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:5: ( 'this' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:7: 'this'
            {
            match("this"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:5: ( '(' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:7: '('
            {
            match('('); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:5: ( ',' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:7: ','
            {
            match(','); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:5: ( ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:7: ')'
            {
            match(')'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:5: ( '.' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:7: '.'
            {
            match('.'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:5: ( 'null' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:7: 'null'
            {
            match("null"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:5: ( 'continue' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:7: 'continue'
            {
            match("continue"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:5: ( 'break' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:7: 'break'
            {
            match("break"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:5: ( 'return' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:7: 'return'
            {
            match("return"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:5: ( 'if' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:7: 'if'
            {
            match("if"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:5: ( 'else' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:7: 'else'
            {
            match("else"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:5: ( 'while' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:7: 'while'
            {
            match("while"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:5: ( 'for' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:7: 'for'
            {
            match("for"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:5: ( 'switch' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:7: 'switch'
            {
            match("switch"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:5: ( 'case' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:7: 'case'
            {
            match("case"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:5: ( ':' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:7: ':'
            {
            match(':'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:5: ( 'default' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:7: 'default'
            {
            match("default"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:5: ( 'int' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:7: 'int'
            {
            match("int"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:5: ( 'float' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:7: 'float'
            {
            match("float"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:5: ( 'double' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:7: 'double'
            {
            match("double"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:5: ( 'boolean' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:7: 'boolean'
            {
            match("boolean"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:5: ( 'char' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:7: 'char'
            {
            match("char"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:5: ( 'string' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:7: 'string'
            {
            match("string"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:5: ( 'true' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:7: 'true'
            {
            match("true"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:5: ( 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:7: 'false'
            {
            match("false"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:5: ( 'public' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:7: 'public'
            {
            match("public"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:5: ( 'protected' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:7: 'protected'
            {
            match("protected"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: ( 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:6: ( ALPHA ( ALPHA | DIGIT )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:8: ALPHA ( ALPHA | DIGIT )*
            {
            mALPHA(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:14: ( ALPHA | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
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
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start INTEGER
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( ( '-' )? ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:11: ( '-' )? ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:11: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:16: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:17: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start DOUBLE
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:9: ( ( '-' )? ( DIGIT )* '.' ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:11: ( '-' )? ( DIGIT )* '.' ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:11: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:16: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('.'); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:29: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:30: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:7: ( ( INTEGER | DOUBLE ) ( 'f' | 'F' ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( INTEGER | DOUBLE ) ( 'f' | 'F' )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( INTEGER | DOUBLE )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:10: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:18: DOUBLE
                    {
                    mDOUBLE(); 

                    }
                    break;

            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
    // $ANTLR end FLOAT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:8: ( '\"' ( STRCONTENT )* '\"' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:10: '\"' ( STRCONTENT )* '\"'
            {
            match('\"'); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:14: ( STRCONTENT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:14: STRCONTENT
            	    {
            	    mSTRCONTENT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:6: ( '\\'' ( CHRCONTENT )* '\\'' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:8: '\\'' ( CHRCONTENT )* '\\''
            {
            match('\''); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:13: ( CHRCONTENT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:13: CHRCONTENT
            	    {
            	    mCHRCONTENT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||(LA10_0>='\f' && LA10_0<='\r')||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start SLCOMMENT
    public final void mSLCOMMENT() throws RecognitionException {
        try {
            int _type = SLCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:2: ( CMTSL (~ LINE )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: CMTSL (~ LINE )*
            {
            mCMTSL(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:10: (~ LINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:11: ~ LINE
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='*')||(input.LA(1)>=',' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop11;
                }
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SLCOMMENT

    // $ANTLR start MLCOMMENT
    public final void mMLCOMMENT() throws RecognitionException {
        try {
            int _type = MLCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:2: ( CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND
            {
            mCMTBEG(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:11: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:36: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:36: ( . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFE')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFE')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            mCMTEND(); 
             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MLCOMMENT

    // $ANTLR start DCOMMENT
    public final void mDCOMMENT() throws RecognitionException {
        try {
            int _type = DCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:9: ( DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:11: DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE
            {
            mDCMTB(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:3: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:28: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:28: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='/') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='+') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='*')||(LA13_1>=',' && LA13_1<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0=='+') ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_2>='\u0000' && LA13_2<='.')||(LA13_2>='0' && LA13_2<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='*')||(LA13_0>=',' && LA13_0<='.')||(LA13_0>='0' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:28: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:3: ( DCOMMENT ( options {greedy=false; } : ( . )* ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='/') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:4: DCOMMENT ( options {greedy=false; } : ( . )* )
            	    {
            	    mDCOMMENT(); 
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:3: ( options {greedy=false; } : ( . )* )
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:28: ( . )*
            	    {
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:28: ( . )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0=='+') ) {
            	            int LA14_1 = input.LA(2);

            	            if ( (LA14_1=='/') ) {
            	                alt14=2;
            	            }
            	            else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
            	                alt14=1;
            	            }


            	        }
            	        else if ( (LA14_0=='/') ) {
            	            int LA14_2 = input.LA(2);

            	            if ( (LA14_2=='+') ) {
            	                alt14=2;
            	            }
            	            else if ( ((LA14_2>='\u0000' && LA14_2<='*')||(LA14_2>=',' && LA14_2<='\uFFFE')) ) {
            	                alt14=1;
            	            }


            	        }
            	        else if ( ((LA14_0>='\u0000' && LA14_0<='*')||(LA14_0>=',' && LA14_0<='.')||(LA14_0>='0' && LA14_0<='\uFFFE')) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:28: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mDCMTE(); 
             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCOMMENT

    // $ANTLR start LINE
    public final void mLINE() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:15: ( '\\r' | '\\n' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LINE

    // $ANTLR start STRCONTENT
    public final void mSTRCONTENT() throws RecognitionException {
        try {
            int _type = STRCONTENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:2: ( (~ ( '\"' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt16=5;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFE')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt16=4;
                    }
                    break;
                case 't':
                    {
                    alt16=5;
                    }
                    break;
                case '\\':
                    {
                    alt16=2;
                    }
                    break;
                case '\"':
                    {
                    alt16=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("118:1: STRCONTENT : ( (~ ( '\"' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 16, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("118:1: STRCONTENT : ( (~ ( '\"' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:4: (~ ( '\"' | '\\\\' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:4: (~ ( '\"' | '\\\\' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:5: ~ ( '\"' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:18: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:25: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:31: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:37: '\\\\t'
                    {
                    match("\\t"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRCONTENT

    // $ANTLR start CHRCONTENT
    public final void mCHRCONTENT() throws RecognitionException {
        try {
            int _type = CHRCONTENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:2: ( (~ ( '\\'' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt17=5;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFE')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    alt17=5;
                    }
                    break;
                case 'n':
                    {
                    alt17=4;
                    }
                    break;
                case '\\':
                    {
                    alt17=2;
                    }
                    break;
                case '\"':
                    {
                    alt17=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("120:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 17, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("120:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:4: (~ ( '\\'' | '\\\\' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:4: (~ ( '\\'' | '\\\\' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:5: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:19: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:26: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:32: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:38: '\\\\t'
                    {
                    match("\\t"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHRCONTENT

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:2: ( '0' .. '9' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start ALPHA
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:127:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ALPHA

    public void mTokens() throws RecognitionException {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | WORD | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT )
        int alt18=74;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:30: MOD
                {
                mMOD(); 

                }
                break;
            case 6 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:34: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 7 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:40: EQUAL2
                {
                mEQUAL2(); 

                }
                break;
            case 8 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:47: GTE
                {
                mGTE(); 

                }
                break;
            case 9 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:51: GT
                {
                mGT(); 

                }
                break;
            case 10 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:54: LTE
                {
                mLTE(); 

                }
                break;
            case 11 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:58: LT
                {
                mLT(); 

                }
                break;
            case 12 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:61: NEQUAL
                {
                mNEQUAL(); 

                }
                break;
            case 13 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:68: PLEQUAL
                {
                mPLEQUAL(); 

                }
                break;
            case 14 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:76: MIEQUAL
                {
                mMIEQUAL(); 

                }
                break;
            case 15 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:84: MUEQUAL
                {
                mMUEQUAL(); 

                }
                break;
            case 16 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:92: DIEQUAL
                {
                mDIEQUAL(); 

                }
                break;
            case 17 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:100: MOEQUAL
                {
                mMOEQUAL(); 

                }
                break;
            case 18 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:108: OR
                {
                mOR(); 

                }
                break;
            case 19 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:111: AND
                {
                mAND(); 

                }
                break;
            case 20 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:115: BLKBEG
                {
                mBLKBEG(); 

                }
                break;
            case 21 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:122: BLKEND
                {
                mBLKEND(); 

                }
                break;
            case 22 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:129: CMTSL
                {
                mCMTSL(); 

                }
                break;
            case 23 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:135: CMTBEG
                {
                mCMTBEG(); 

                }
                break;
            case 24 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:142: CMTEND
                {
                mCMTEND(); 

                }
                break;
            case 25 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:149: DCMTB
                {
                mDCMTB(); 

                }
                break;
            case 26 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:155: DCMTE
                {
                mDCMTE(); 

                }
                break;
            case 27 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:161: INC
                {
                mINC(); 

                }
                break;
            case 28 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:165: DEC
                {
                mDEC(); 

                }
                break;
            case 29 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:169: T47
                {
                mT47(); 

                }
                break;
            case 30 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:173: T48
                {
                mT48(); 

                }
                break;
            case 31 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:177: T49
                {
                mT49(); 

                }
                break;
            case 32 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:181: T50
                {
                mT50(); 

                }
                break;
            case 33 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:185: T51
                {
                mT51(); 

                }
                break;
            case 34 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:189: T52
                {
                mT52(); 

                }
                break;
            case 35 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:193: T53
                {
                mT53(); 

                }
                break;
            case 36 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:197: T54
                {
                mT54(); 

                }
                break;
            case 37 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:201: T55
                {
                mT55(); 

                }
                break;
            case 38 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:205: T56
                {
                mT56(); 

                }
                break;
            case 39 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:209: T57
                {
                mT57(); 

                }
                break;
            case 40 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:213: T58
                {
                mT58(); 

                }
                break;
            case 41 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:217: T59
                {
                mT59(); 

                }
                break;
            case 42 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:221: T60
                {
                mT60(); 

                }
                break;
            case 43 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:225: T61
                {
                mT61(); 

                }
                break;
            case 44 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:229: T62
                {
                mT62(); 

                }
                break;
            case 45 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:233: T63
                {
                mT63(); 

                }
                break;
            case 46 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:237: T64
                {
                mT64(); 

                }
                break;
            case 47 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:241: T65
                {
                mT65(); 

                }
                break;
            case 48 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:245: T66
                {
                mT66(); 

                }
                break;
            case 49 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:249: T67
                {
                mT67(); 

                }
                break;
            case 50 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:253: T68
                {
                mT68(); 

                }
                break;
            case 51 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:257: T69
                {
                mT69(); 

                }
                break;
            case 52 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:261: T70
                {
                mT70(); 

                }
                break;
            case 53 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:265: T71
                {
                mT71(); 

                }
                break;
            case 54 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:269: T72
                {
                mT72(); 

                }
                break;
            case 55 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:273: T73
                {
                mT73(); 

                }
                break;
            case 56 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:277: T74
                {
                mT74(); 

                }
                break;
            case 57 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:281: T75
                {
                mT75(); 

                }
                break;
            case 58 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:285: T76
                {
                mT76(); 

                }
                break;
            case 59 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:289: T77
                {
                mT77(); 

                }
                break;
            case 60 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:293: T78
                {
                mT78(); 

                }
                break;
            case 61 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:297: T79
                {
                mT79(); 

                }
                break;
            case 62 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:301: T80
                {
                mT80(); 

                }
                break;
            case 63 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:305: WORD
                {
                mWORD(); 

                }
                break;
            case 64 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:310: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 65 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:318: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 66 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:325: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 67 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:331: STRING
                {
                mSTRING(); 

                }
                break;
            case 68 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:338: CHAR
                {
                mCHAR(); 

                }
                break;
            case 69 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:343: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 70 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:354: SLCOMMENT
                {
                mSLCOMMENT(); 

                }
                break;
            case 71 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:364: MLCOMMENT
                {
                mMLCOMMENT(); 

                }
                break;
            case 72 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:374: DCOMMENT
                {
                mDCOMMENT(); 

                }
                break;
            case 73 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:383: STRCONTENT
                {
                mSTRCONTENT(); 

                }
                break;
            case 74 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:394: CHRCONTENT
                {
                mCHRCONTENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA7_eotS =
        "\5\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\1\55\2\56\2\uffff";
    static final String DFA7_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2\14\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "102:9: ( INTEGER | DOUBLE )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\52\1\57\1\62\1\67\1\71\1\73\1\75\1\77\3\101\2\uffff\5"+
        "\111\1\uffff\1\111\3\uffff\1\134\5\111\1\uffff\1\111\1\uffff\1\150"+
        "\1\152\1\101\11\uffff\1\150\5\uffff\1\162\1\164\1\166\20\uffff\3"+
        "\111\1\uffff\14\111\1\uffff\2\111\4\uffff\1\u008b\4\111\1\u0090"+
        "\2\111\1\uffff\2\111\20\uffff\17\111\1\u00a4\3\111\1\uffff\4\111"+
        "\1\uffff\1\u00ac\10\111\1\u00b5\1\u00b6\1\111\1\u00b8\6\111\1\uffff"+
        "\1\111\1\u00c0\1\u00c1\1\u00c2\3\111\1\uffff\10\111\2\uffff\1\u00ce"+
        "\1\uffff\4\111\1\u00d3\1\u00d4\1\u00d5\3\uffff\1\u00d6\2\111\1\u00d9"+
        "\4\111\1\u00de\2\111\1\uffff\1\111\1\u00e2\1\u00e3\1\u00e4\4\uffff"+
        "\1\111\1\u00e6\1\uffff\1\u00e7\2\111\1\u00ea\1\uffff\1\u00eb\1\111"+
        "\1\u00ed\3\uffff\1\u00ee\2\uffff\1\u00ef\1\111\2\uffff\1\u00f1\3"+
        "\uffff\1\u00f2\2\uffff";
    static final String DFA18_eofS =
        "\u00f3\uffff";
    static final String DFA18_minS =
        "\1\0\1\53\1\55\1\57\1\52\5\75\1\174\1\46\2\uffff\2\141\1\154\1\164"+
        "\1\141\1\uffff\1\150\3\uffff\1\60\1\165\1\157\1\145\1\146\1\150"+
        "\1\uffff\1\145\1\uffff\1\56\2\0\2\uffff\1\42\6\uffff\1\56\1\60\4"+
        "\uffff\3\0\20\uffff\1\151\1\142\1\162\1\uffff\1\156\1\141\1\163"+
        "\1\141\1\163\1\164\1\141\1\151\1\156\1\157\1\162\1\154\1\uffff\1"+
        "\151\1\165\4\uffff\1\60\1\154\1\145\1\157\1\164\1\60\1\164\1\151"+
        "\1\uffff\1\165\1\146\20\uffff\1\164\1\166\1\154\2\164\1\162\1\145"+
        "\1\163\2\145\1\164\1\151\1\164\2\141\1\60\2\163\1\145\1\uffff\1"+
        "\154\1\141\1\154\1\165\1\uffff\1\60\1\154\1\142\1\141\1\145\1\141"+
        "\3\151\2\60\1\163\1\60\1\156\1\151\1\156\1\143\1\154\1\164\1\uffff"+
        "\1\145\3\60\1\153\1\145\1\162\1\uffff\1\145\1\154\1\165\1\143\1"+
        "\164\1\143\1\141\1\156\2\uffff\1\60\1\uffff\1\144\1\143\1\147\1"+
        "\150\3\60\3\uffff\1\60\1\141\1\156\1\60\1\145\1\154\1\164\1\145"+
        "\1\60\1\154\1\165\1\uffff\1\163\3\60\4\uffff\1\156\1\60\1\uffff"+
        "\1\60\1\164\1\145\1\60\1\uffff\1\60\1\145\1\60\3\uffff\1\60\2\uffff"+
        "\1\60\1\144\2\uffff\1\60\3\uffff\1\60\2\uffff";
    static final String DFA18_maxS =
        "\1\ufffe\11\75\1\174\1\46\2\uffff\1\165\1\157\1\170\1\167\1\157"+
        "\1\uffff\1\162\3\uffff\1\71\1\165\1\162\1\145\1\156\1\150\1\uffff"+
        "\1\157\1\uffff\1\146\2\ufffe\2\uffff\1\164\6\uffff\1\146\1\71\4"+
        "\uffff\3\ufffe\20\uffff\1\157\1\142\1\162\1\uffff\1\156\1\141\1"+
        "\163\1\141\1\163\1\164\1\162\1\151\1\156\1\157\1\162\1\154\1\uffff"+
        "\1\151\1\165\4\uffff\1\146\1\154\1\145\1\157\1\164\1\172\1\164\1"+
        "\151\1\uffff\1\165\1\146\20\uffff\1\164\1\166\1\154\2\164\1\162"+
        "\1\145\1\163\2\145\1\164\1\151\1\164\2\141\1\172\2\163\1\145\1\uffff"+
        "\1\154\1\141\1\154\1\165\1\uffff\1\172\1\154\1\142\1\141\1\145\1"+
        "\141\3\151\2\172\1\163\1\172\1\156\1\151\1\156\1\143\1\154\1\164"+
        "\1\uffff\1\145\3\172\1\153\1\145\1\162\1\uffff\1\145\1\154\1\165"+
        "\1\143\1\164\1\143\1\141\1\156\2\uffff\1\172\1\uffff\1\144\1\143"+
        "\1\147\1\150\3\172\3\uffff\1\172\1\141\1\156\1\172\1\145\1\154\1"+
        "\164\1\145\1\172\1\154\1\165\1\uffff\1\163\3\172\4\uffff\1\156\1"+
        "\172\1\uffff\1\172\1\164\1\145\1\172\1\uffff\1\172\1\145\1\172\3"+
        "\uffff\1\172\2\uffff\1\172\1\144\2\uffff\1\172\3\uffff\1\172\2\uffff";
    static final String DFA18_acceptS =
        "\14\uffff\1\24\1\25\5\uffff\1\42\1\uffff\1\44\1\45\1\46\6\uffff"+
        "\1\62\1\uffff\1\77\3\uffff\1\105\1\111\1\uffff\1\15\1\33\1\32\1"+
        "\1\1\16\1\34\2\uffff\1\2\1\17\1\30\1\3\3\uffff\1\20\1\4\1\21\1\5"+
        "\1\7\1\6\1\10\1\11\1\12\1\13\1\14\1\111\1\22\1\23\1\24\1\25\3\uffff"+
        "\1\77\14\uffff\1\42\2\uffff\1\44\1\45\1\46\1\47\10\uffff\1\62\2"+
        "\uffff\1\100\1\102\1\112\1\103\1\104\1\105\4\111\1\26\1\106\1\31"+
        "\1\110\1\27\1\107\23\uffff\1\101\4\uffff\1\54\23\uffff\1\57\7\uffff"+
        "\1\64\10\uffff\1\70\1\61\1\uffff\1\55\7\uffff\1\43\1\72\1\50\13"+
        "\uffff\1\36\4\uffff\1\41\1\65\1\73\1\52\2\uffff\1\56\4\uffff\1\74"+
        "\3\uffff\1\40\1\71\1\60\1\uffff\1\53\1\66\2\uffff\1\76\1\35\1\uffff"+
        "\1\37\1\67\1\63\1\uffff\1\51\1\75";
    static final String DFA18_specialS =
        "\u00f3\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\45\2\44\1\45\2\44\22\45\1\44\1\11\1\42\2\45\1\5\1\13\1\43"+
            "\1\25\1\27\1\3\1\1\1\26\1\2\1\30\1\4\12\41\1\36\1\23\1\10\1"+
            "\6\1\7\2\45\32\40\1\45\1\46\2\45\1\40\1\45\1\40\1\32\1\17\1"+
            "\37\1\20\1\22\2\40\1\34\4\40\1\31\1\40\1\16\1\40\1\33\1\21\1"+
            "\24\2\40\1\35\3\40\1\14\1\12\1\15\uff81\45",
            "\1\50\3\uffff\1\51\15\uffff\1\47",
            "\1\54\1\56\1\uffff\12\55\3\uffff\1\53",
            "\1\61\15\uffff\1\60",
            "\1\65\1\64\3\uffff\1\63\15\uffff\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\103",
            "",
            "",
            "\1\110\20\uffff\1\106\2\uffff\1\107",
            "\1\114\6\uffff\1\113\3\uffff\1\115\2\uffff\1\112",
            "\1\116\13\uffff\1\117",
            "\1\120\2\uffff\1\121",
            "\1\125\7\uffff\1\122\2\uffff\1\123\2\uffff\1\124",
            "",
            "\1\127\11\uffff\1\130",
            "",
            "",
            "",
            "\12\135",
            "\1\136",
            "\1\140\2\uffff\1\137",
            "\1\141",
            "\1\142\7\uffff\1\143",
            "\1\144",
            "",
            "\1\147\11\uffff\1\146",
            "",
            "\1\56\1\uffff\12\55\14\uffff\1\151\37\uffff\1\151",
            "\uffff\153",
            "\uffff\154",
            "",
            "",
            "\1\156\71\uffff\1\157\21\uffff\1\161\5\uffff\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\1\uffff\12\55\14\uffff\1\151\37\uffff\1\151",
            "\12\135",
            "",
            "",
            "",
            "",
            "\12\163\1\uffff\2\163\1\uffff\ufff1\163",
            "\uffff\165",
            "\uffff\167",
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
            "",
            "",
            "\1\171\5\uffff\1\170",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\20\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "\12\135\14\uffff\1\151\37\uffff\1\151",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
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
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00b7",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00d7",
            "\1\u00d8",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "",
            "\1\u00e5",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00e8",
            "\1\u00e9",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00ec",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "\1\u00f0",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "",
            "\12\111\7\uffff\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | WORD | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT );";
        }
    }
 

}