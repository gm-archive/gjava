// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-24 16:42:14

/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
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
    public static final int DCOMMENT=47;
    public static final int MOD=8;
    public static final int STRCONTENT=41;
    public static final int DCMTB=28;
    public static final int BLKEND=24;
    public static final int DCMTE=29;
    public static final int GTE=11;
    public static final int CHAR=37;
    public static final int PLEQUAL=16;
    public static final int SLCOMMENT=45;
    public static final int FLOAT=35;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int TYPE=38;
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
    public static final int DIGIT=40;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=46;
    public static final int T61=61;
    public static final int T60=60;
    public static final int INTEGER=33;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=42;
    public static final int T49=49;
    public static final int WHITESPACE=43;
    public static final int T48=48;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int Tokens=80;
    public static final int LINE=44;
    public static final int ALPHA=39;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int T50=50;
    public static final int OR=21;
    public static final int T59=59;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int T52=52;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:6: ( '+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:8: '+'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:7: ( '-' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:9: '-'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:6: ( '*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:8: '*'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:5: ( '/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:7: '/'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:5: ( '%' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:7: '%'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:7: ( '=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:9: '='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:8: ( '==' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:10: '=='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:5: ( '>=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:7: '>='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:4: ( '>' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:6: '>'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:5: ( '<=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:7: '<='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:4: ( '<' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:6: '<'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:8: ( '!=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:10: '!='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:9: ( '+=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:11: '+='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:9: ( '-=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:11: '-='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:9: ( '*=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:11: '*='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:9: ( '/=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:11: '/='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:9: ( '%=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:11: '%='
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:4: ( '||' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:6: '||'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:5: ( '&&' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:7: '&&'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:8: ( '{' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:10: '{'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:8: ( '}' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:10: '}'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:7: ( '//' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:9: '//'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:8: ( '/*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:10: '/*'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:8: ( '*/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:10: '*/'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:7: ( '/+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:9: '/+'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:7: ( '+/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:9: '+/'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:5: ( '++' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:7: '++'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:5: ( '--' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEC

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:5: ( 'using' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:7: 'using'
            {
            match("using"); 


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
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:5: ( ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:7: ';'
            {
            match(';'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:5: ( 'partial' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:7: 'partial'
            {
            match("partial"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:5: ( 'class' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:7: 'class'
            {
            match("class"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:5: ( 'extends' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:7: 'extends'
            {
            match("extends"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:5: ( 'static' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:7: 'static'
            {
            match("static"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:5: ( 'final' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:7: 'final'
            {
            match("final"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:5: ( 'this' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:7: 'this'
            {
            match("this"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:5: ( '(' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:7: '('
            {
            match('('); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:5: ( ',' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:7: ','
            {
            match(','); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:5: ( ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:7: ')'
            {
            match(')'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:5: ( 'super' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:7: 'super'
            {
            match("super"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:5: ( 'void' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:7: 'void'
            {
            match("void"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:5: ( 'null' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:7: 'null'
            {
            match("null"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:5: ( 'continue' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:7: 'continue'
            {
            match("continue"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:5: ( 'break' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:7: 'break'
            {
            match("break"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:5: ( 'return' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:7: 'return'
            {
            match("return"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:5: ( 'if' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:7: 'if'
            {
            match("if"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:5: ( 'else' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:7: 'else'
            {
            match("else"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:5: ( 'while' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:7: 'while'
            {
            match("while"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:5: ( 'do' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:7: 'do'
            {
            match("do"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:5: ( 'for' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:7: 'for'
            {
            match("for"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:5: ( 'switch' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:7: 'switch'
            {
            match("switch"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: ( 'case' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:7: 'case'
            {
            match("case"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:5: ( ':' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:7: ':'
            {
            match(':'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'default' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:7: 'default'
            {
            match("default"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:5: ( 'true' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:7: 'true'
            {
            match("true"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:7: 'false'
            {
            match("false"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( 'public' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:7: 'public'
            {
            match("public"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( 'protected' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: 'protected'
            {
            match("protected"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:5: ( 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='n') ) {
                    int LA2_8 = input.LA(3);

                    if ( (LA2_8=='t') ) {
                        int LA2_14 = input.LA(4);

                        if ( ((LA2_14>='0' && LA2_14<='9')||LA2_14=='<'||(LA2_14>='A' && LA2_14<='Z')||LA2_14=='_'||(LA2_14>='a' && LA2_14<='z')) ) {
                            alt2=7;
                        }
                        else {
                            alt2=1;}
                    }
                    else if ( ((LA2_8>='0' && LA2_8<='9')||LA2_8=='<'||(LA2_8>='A' && LA2_8<='Z')||LA2_8=='_'||(LA2_8>='a' && LA2_8<='s')||(LA2_8>='u' && LA2_8<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_1>='0' && LA2_1<='9')||LA2_1=='<'||(LA2_1>='A' && LA2_1<='Z')||LA2_1=='_'||(LA2_1>='a' && LA2_1<='m')||(LA2_1>='o' && LA2_1<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'f':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='l') ) {
                    int LA2_9 = input.LA(3);

                    if ( (LA2_9=='o') ) {
                        int LA2_15 = input.LA(4);

                        if ( (LA2_15=='a') ) {
                            int LA2_21 = input.LA(5);

                            if ( (LA2_21=='t') ) {
                                int LA2_26 = input.LA(6);

                                if ( ((LA2_26>='0' && LA2_26<='9')||LA2_26=='<'||(LA2_26>='A' && LA2_26<='Z')||LA2_26=='_'||(LA2_26>='a' && LA2_26<='z')) ) {
                                    alt2=7;
                                }
                                else {
                                    alt2=2;}
                            }
                            else if ( ((LA2_21>='0' && LA2_21<='9')||LA2_21=='<'||(LA2_21>='A' && LA2_21<='Z')||LA2_21=='_'||(LA2_21>='a' && LA2_21<='s')||(LA2_21>='u' && LA2_21<='z')) ) {
                                alt2=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 21, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA2_15>='0' && LA2_15<='9')||LA2_15=='<'||(LA2_15>='A' && LA2_15<='Z')||LA2_15=='_'||(LA2_15>='b' && LA2_15<='z')) ) {
                            alt2=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 15, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA2_9>='0' && LA2_9<='9')||LA2_9=='<'||(LA2_9>='A' && LA2_9<='Z')||LA2_9=='_'||(LA2_9>='a' && LA2_9<='n')||(LA2_9>='p' && LA2_9<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 9, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_2>='0' && LA2_2<='9')||LA2_2=='<'||(LA2_2>='A' && LA2_2<='Z')||LA2_2=='_'||(LA2_2>='a' && LA2_2<='k')||(LA2_2>='m' && LA2_2<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'd':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='o') ) {
                    int LA2_10 = input.LA(3);

                    if ( (LA2_10=='u') ) {
                        int LA2_16 = input.LA(4);

                        if ( (LA2_16=='b') ) {
                            int LA2_22 = input.LA(5);

                            if ( (LA2_22=='l') ) {
                                int LA2_27 = input.LA(6);

                                if ( (LA2_27=='e') ) {
                                    int LA2_32 = input.LA(7);

                                    if ( ((LA2_32>='0' && LA2_32<='9')||LA2_32=='<'||(LA2_32>='A' && LA2_32<='Z')||LA2_32=='_'||(LA2_32>='a' && LA2_32<='z')) ) {
                                        alt2=7;
                                    }
                                    else {
                                        alt2=3;}
                                }
                                else if ( ((LA2_27>='0' && LA2_27<='9')||LA2_27=='<'||(LA2_27>='A' && LA2_27<='Z')||LA2_27=='_'||(LA2_27>='a' && LA2_27<='d')||(LA2_27>='f' && LA2_27<='z')) ) {
                                    alt2=7;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 27, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA2_22>='0' && LA2_22<='9')||LA2_22=='<'||(LA2_22>='A' && LA2_22<='Z')||LA2_22=='_'||(LA2_22>='a' && LA2_22<='k')||(LA2_22>='m' && LA2_22<='z')) ) {
                                alt2=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 22, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA2_16>='0' && LA2_16<='9')||LA2_16=='<'||(LA2_16>='A' && LA2_16<='Z')||LA2_16=='_'||LA2_16=='a'||(LA2_16>='c' && LA2_16<='z')) ) {
                            alt2=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 16, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA2_10>='0' && LA2_10<='9')||LA2_10=='<'||(LA2_10>='A' && LA2_10<='Z')||LA2_10=='_'||(LA2_10>='a' && LA2_10<='t')||(LA2_10>='v' && LA2_10<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 10, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_3>='0' && LA2_3<='9')||LA2_3=='<'||(LA2_3>='A' && LA2_3<='Z')||LA2_3=='_'||(LA2_3>='a' && LA2_3<='n')||(LA2_3>='p' && LA2_3<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'b':
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4=='o') ) {
                    int LA2_11 = input.LA(3);

                    if ( (LA2_11=='o') ) {
                        int LA2_17 = input.LA(4);

                        if ( (LA2_17=='l') ) {
                            int LA2_23 = input.LA(5);

                            if ( (LA2_23=='e') ) {
                                int LA2_28 = input.LA(6);

                                if ( (LA2_28=='a') ) {
                                    int LA2_33 = input.LA(7);

                                    if ( (LA2_33=='n') ) {
                                        int LA2_36 = input.LA(8);

                                        if ( ((LA2_36>='0' && LA2_36<='9')||LA2_36=='<'||(LA2_36>='A' && LA2_36<='Z')||LA2_36=='_'||(LA2_36>='a' && LA2_36<='z')) ) {
                                            alt2=7;
                                        }
                                        else {
                                            alt2=4;}
                                    }
                                    else if ( ((LA2_33>='0' && LA2_33<='9')||LA2_33=='<'||(LA2_33>='A' && LA2_33<='Z')||LA2_33=='_'||(LA2_33>='a' && LA2_33<='m')||(LA2_33>='o' && LA2_33<='z')) ) {
                                        alt2=7;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 33, input);

                                        throw nvae;
                                    }
                                }
                                else if ( ((LA2_28>='0' && LA2_28<='9')||LA2_28=='<'||(LA2_28>='A' && LA2_28<='Z')||LA2_28=='_'||(LA2_28>='b' && LA2_28<='z')) ) {
                                    alt2=7;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 28, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA2_23>='0' && LA2_23<='9')||LA2_23=='<'||(LA2_23>='A' && LA2_23<='Z')||LA2_23=='_'||(LA2_23>='a' && LA2_23<='d')||(LA2_23>='f' && LA2_23<='z')) ) {
                                alt2=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 23, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA2_17>='0' && LA2_17<='9')||LA2_17=='<'||(LA2_17>='A' && LA2_17<='Z')||LA2_17=='_'||(LA2_17>='a' && LA2_17<='k')||(LA2_17>='m' && LA2_17<='z')) ) {
                            alt2=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 17, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA2_11>='0' && LA2_11<='9')||LA2_11=='<'||(LA2_11>='A' && LA2_11<='Z')||LA2_11=='_'||(LA2_11>='a' && LA2_11<='n')||(LA2_11>='p' && LA2_11<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 11, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_4>='0' && LA2_4<='9')||LA2_4=='<'||(LA2_4>='A' && LA2_4<='Z')||LA2_4=='_'||(LA2_4>='a' && LA2_4<='n')||(LA2_4>='p' && LA2_4<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 'c':
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5=='h') ) {
                    int LA2_12 = input.LA(3);

                    if ( (LA2_12=='a') ) {
                        int LA2_18 = input.LA(4);

                        if ( (LA2_18=='r') ) {
                            int LA2_24 = input.LA(5);

                            if ( ((LA2_24>='0' && LA2_24<='9')||LA2_24=='<'||(LA2_24>='A' && LA2_24<='Z')||LA2_24=='_'||(LA2_24>='a' && LA2_24<='z')) ) {
                                alt2=7;
                            }
                            else {
                                alt2=5;}
                        }
                        else if ( ((LA2_18>='0' && LA2_18<='9')||LA2_18=='<'||(LA2_18>='A' && LA2_18<='Z')||LA2_18=='_'||(LA2_18>='a' && LA2_18<='q')||(LA2_18>='s' && LA2_18<='z')) ) {
                            alt2=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 18, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA2_12>='0' && LA2_12<='9')||LA2_12=='<'||(LA2_12>='A' && LA2_12<='Z')||LA2_12=='_'||(LA2_12>='b' && LA2_12<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 12, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_5>='0' && LA2_5<='9')||LA2_5=='<'||(LA2_5>='A' && LA2_5<='Z')||LA2_5=='_'||(LA2_5>='a' && LA2_5<='g')||(LA2_5>='i' && LA2_5<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 's':
                {
                int LA2_6 = input.LA(2);

                if ( (LA2_6=='t') ) {
                    int LA2_13 = input.LA(3);

                    if ( (LA2_13=='r') ) {
                        int LA2_19 = input.LA(4);

                        if ( (LA2_19=='i') ) {
                            int LA2_25 = input.LA(5);

                            if ( (LA2_25=='n') ) {
                                int LA2_30 = input.LA(6);

                                if ( (LA2_30=='g') ) {
                                    int LA2_34 = input.LA(7);

                                    if ( ((LA2_34>='0' && LA2_34<='9')||LA2_34=='<'||(LA2_34>='A' && LA2_34<='Z')||LA2_34=='_'||(LA2_34>='a' && LA2_34<='z')) ) {
                                        alt2=7;
                                    }
                                    else {
                                        alt2=6;}
                                }
                                else if ( ((LA2_30>='0' && LA2_30<='9')||LA2_30=='<'||(LA2_30>='A' && LA2_30<='Z')||LA2_30=='_'||(LA2_30>='a' && LA2_30<='f')||(LA2_30>='h' && LA2_30<='z')) ) {
                                    alt2=7;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 30, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA2_25>='0' && LA2_25<='9')||LA2_25=='<'||(LA2_25>='A' && LA2_25<='Z')||LA2_25=='_'||(LA2_25>='a' && LA2_25<='m')||(LA2_25>='o' && LA2_25<='z')) ) {
                                alt2=7;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 25, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA2_19>='0' && LA2_19<='9')||LA2_19=='<'||(LA2_19>='A' && LA2_19<='Z')||LA2_19=='_'||(LA2_19>='a' && LA2_19<='h')||(LA2_19>='j' && LA2_19<='z')) ) {
                            alt2=7;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 19, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA2_13>='0' && LA2_13<='9')||LA2_13=='<'||(LA2_13>='A' && LA2_13<='Z')||LA2_13=='_'||(LA2_13>='a' && LA2_13<='q')||(LA2_13>='s' && LA2_13<='z')) ) {
                        alt2=7;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 13, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_6>='0' && LA2_6<='9')||LA2_6=='<'||(LA2_6>='A' && LA2_6<='Z')||LA2_6=='_'||(LA2_6>='a' && LA2_6<='s')||(LA2_6>='u' && LA2_6<='z')) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'e':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD '<' WORD ( ',' WORD )* '>' ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:16: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:26: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:37: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:49: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:58: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:69: ( WORD '<' WORD ( ',' WORD )* '>' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:69: ( WORD '<' WORD ( ',' WORD )* '>' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:70: WORD '<' WORD ( ',' WORD )* '>'
                    {
                    mWORD(); 
                    match('<'); 
                    mWORD(); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:84: ( ',' WORD )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==',') ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:85: ',' WORD
                    	    {
                    	    match(','); 
                    	    mWORD(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('>'); 

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:138:6: ( ALPHA ( ALPHA | DIGIT )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:138:8: ALPHA ( ALPHA | DIGIT )*
            {
            mALPHA(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:138:14: ( ALPHA | DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:9: ( ( '-' )? ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: ( '-' )? ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:16: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:9: ( ( '-' )? ( DIGIT )* '.' ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:11: ( '-' )? ( DIGIT )* '.' ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:11: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:16: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:29: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:30: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:7: ( ( INTEGER | DOUBLE ) ( 'f' | 'F' ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:9: ( INTEGER | DOUBLE ) ( 'f' | 'F' )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:9: ( INTEGER | DOUBLE )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:10: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:18: DOUBLE
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:8: ( ( '\"' ( STRCONTENT )* '\"' ) | ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='@') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("143:1: STRING : ( ( '\"' ( STRCONTENT )* '\"' ) | ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:10: ( '\"' ( STRCONTENT )* '\"' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:10: ( '\"' ( STRCONTENT )* '\"' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:11: '\"' ( STRCONTENT )* '\"'
                    {
                    match('\"'); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:15: ( STRCONTENT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='\uFFFE')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:15: STRCONTENT
                    	    {
                    	    mSTRCONTENT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:34: ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:34: ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:35: '@' '\"' ( options {greedy=false; } : ( . )* ) '\"'
                    {
                    match('@'); 
                    match('\"'); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:43: ( options {greedy=false; } : ( . )* )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:68: ( . )*
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:68: ( . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\"') ) {
                            alt11=2;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFE')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:68: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }

                    match('\"'); 

                    }


                    }
                    break;

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:144:6: ( '\\'' ( CHRCONTENT )* '\\'' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:144:8: '\\'' ( CHRCONTENT )* '\\''
            {
            match('\''); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:144:13: ( CHRCONTENT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:144:13: CHRCONTENT
            	    {
            	    mCHRCONTENT(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:147:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:147:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:147:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||(LA14_0>='\f' && LA14_0<='\r')||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:149:2: ( CMTSL (~ LINE )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:149:4: CMTSL (~ LINE )*
            {
            mCMTSL(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:149:10: (~ LINE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:149:11: ~ LINE
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop15;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:2: ( CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:4: CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND
            {
            mCMTBEG(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:11: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:36: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:36: ( . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFE')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:9: ( DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:11: DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE
            {
            mDCMTB(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:3: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:28: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:28: ( . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='/') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='+') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='*')||(LA17_1>=',' && LA17_1<='\uFFFE')) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0=='+') ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_2>='\u0000' && LA17_2<='.')||(LA17_2>='0' && LA17_2<='\uFFFE')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='*')||(LA17_0>=',' && LA17_0<='.')||(LA17_0>='0' && LA17_0<='\uFFFE')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:28: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:3: ( DCOMMENT ( options {greedy=false; } : ( . )* ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='/') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:4: DCOMMENT ( options {greedy=false; } : ( . )* )
            	    {
            	    mDCOMMENT(); 
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:155:3: ( options {greedy=false; } : ( . )* )
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:155:28: ( . )*
            	    {
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:155:28: ( . )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0=='+') ) {
            	            int LA18_1 = input.LA(2);

            	            if ( (LA18_1=='/') ) {
            	                alt18=2;
            	            }
            	            else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFE')) ) {
            	                alt18=1;
            	            }


            	        }
            	        else if ( (LA18_0=='/') ) {
            	            int LA18_2 = input.LA(2);

            	            if ( (LA18_2=='+') ) {
            	                alt18=2;
            	            }
            	            else if ( ((LA18_2>='\u0000' && LA18_2<='*')||(LA18_2>=',' && LA18_2<='\uFFFE')) ) {
            	                alt18=1;
            	            }


            	        }
            	        else if ( ((LA18_0>='\u0000' && LA18_0<='*')||(LA18_0>=',' && LA18_0<='.')||(LA18_0>='0' && LA18_0<='\uFFFE')) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:155:28: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:157:15: ( '\\r' | '\\n' )
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:2: ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt20=5;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFE')) ) {
                alt20=1;
            }
            else if ( (LA20_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 't':
                    {
                    alt20=5;
                    }
                    break;
                case 'n':
                    {
                    alt20=4;
                    }
                    break;
                case '\"':
                    {
                    alt20=3;
                    }
                    break;
                case '\\':
                    {
                    alt20=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("158:1: STRCONTENT : ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 20, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("158:1: STRCONTENT : ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:4: (~ ( '\"' | '\\\\' | '\\n' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:4: (~ ( '\"' | '\\\\' | '\\n' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:5: ~ ( '\"' | '\\\\' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:23: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:30: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:36: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:159:42: '\\\\t'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:2: ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFE')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                    {
                    alt21=3;
                    }
                    break;
                case '\\':
                    {
                    alt21=2;
                    }
                    break;
                case 'n':
                    {
                    alt21=4;
                    }
                    break;
                case 't':
                    {
                    alt21=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("160:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 21, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("160:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:4: (~ ( '\\'' | '\\\\' | '\\n' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:4: (~ ( '\\'' | '\\\\' | '\\n' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:5: ~ ( '\\'' | '\\\\' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:24: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:31: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:37: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:161:43: '\\\\t'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:164:2: ( '0' .. '9' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:164:4: '0' .. '9'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:167:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | TYPE | WORD | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT )
        int alt22=73;
        alt22 = dfa22.predict(input);
        switch (alt22) {
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
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:169: T48
                {
                mT48(); 

                }
                break;
            case 30 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:173: T49
                {
                mT49(); 

                }
                break;
            case 31 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:177: T50
                {
                mT50(); 

                }
                break;
            case 32 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:181: T51
                {
                mT51(); 

                }
                break;
            case 33 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:185: T52
                {
                mT52(); 

                }
                break;
            case 34 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:189: T53
                {
                mT53(); 

                }
                break;
            case 35 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:193: T54
                {
                mT54(); 

                }
                break;
            case 36 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:197: T55
                {
                mT55(); 

                }
                break;
            case 37 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:201: T56
                {
                mT56(); 

                }
                break;
            case 38 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:205: T57
                {
                mT57(); 

                }
                break;
            case 39 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:209: T58
                {
                mT58(); 

                }
                break;
            case 40 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:213: T59
                {
                mT59(); 

                }
                break;
            case 41 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:217: T60
                {
                mT60(); 

                }
                break;
            case 42 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:221: T61
                {
                mT61(); 

                }
                break;
            case 43 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:225: T62
                {
                mT62(); 

                }
                break;
            case 44 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:229: T63
                {
                mT63(); 

                }
                break;
            case 45 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:233: T64
                {
                mT64(); 

                }
                break;
            case 46 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:237: T65
                {
                mT65(); 

                }
                break;
            case 47 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:241: T66
                {
                mT66(); 

                }
                break;
            case 48 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:245: T67
                {
                mT67(); 

                }
                break;
            case 49 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:249: T68
                {
                mT68(); 

                }
                break;
            case 50 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:253: T69
                {
                mT69(); 

                }
                break;
            case 51 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:257: T70
                {
                mT70(); 

                }
                break;
            case 52 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:261: T71
                {
                mT71(); 

                }
                break;
            case 53 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:265: T72
                {
                mT72(); 

                }
                break;
            case 54 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:269: T73
                {
                mT73(); 

                }
                break;
            case 55 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:273: T74
                {
                mT74(); 

                }
                break;
            case 56 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:277: T75
                {
                mT75(); 

                }
                break;
            case 57 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:281: T76
                {
                mT76(); 

                }
                break;
            case 58 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:285: T77
                {
                mT77(); 

                }
                break;
            case 59 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:289: T78
                {
                mT78(); 

                }
                break;
            case 60 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:293: T79
                {
                mT79(); 

                }
                break;
            case 61 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:297: TYPE
                {
                mTYPE(); 

                }
                break;
            case 62 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:302: WORD
                {
                mWORD(); 

                }
                break;
            case 63 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:307: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 64 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:315: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 65 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:322: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 66 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:328: STRING
                {
                mSTRING(); 

                }
                break;
            case 67 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:335: CHAR
                {
                mCHAR(); 

                }
                break;
            case 68 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:340: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 69 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:351: SLCOMMENT
                {
                mSLCOMMENT(); 

                }
                break;
            case 70 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:361: MLCOMMENT
                {
                mMLCOMMENT(); 

                }
                break;
            case 71 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:371: DCOMMENT
                {
                mDCOMMENT(); 

                }
                break;
            case 72 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:380: STRCONTENT
                {
                mSTRCONTENT(); 

                }
                break;
            case 73 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:391: CHRCONTENT
                {
                mCHRCONTENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\1\55\2\56\2\uffff";
    static final String DFA9_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA9_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2\14\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "142:9: ( INTEGER | DOUBLE )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\56\1\61\1\66\1\73\1\75\1\77\1\101\1\103\3\105\2\uffff"+
        "\1\113\1\116\1\uffff\6\113\3\uffff\7\113\1\uffff\1\113\1\161\1\163"+
        "\2\105\13\uffff\1\161\4\uffff\1\172\1\174\1\176\20\uffff\1\113\1"+
        "\uffff\1\113\2\uffff\1\u0081\1\uffff\22\113\3\uffff\5\113\1\u009b"+
        "\2\113\1\u009f\1\113\20\uffff\1\113\1\uffff\17\113\1\u00b1\11\113"+
        "\1\uffff\1\115\2\113\1\uffff\7\113\1\u00c4\1\113\1\115\1\113\1\u00c7"+
        "\5\113\1\uffff\2\113\1\u00cf\1\u00d0\1\u00d1\1\u00d2\6\113\1\u00d9"+
        "\4\113\1\u00de\1\uffff\2\113\1\uffff\3\113\1\u00e4\1\u00e5\1\115"+
        "\1\u00e6\4\uffff\1\u00e7\2\113\1\u00ea\2\113\1\uffff\3\113\1\u00f0"+
        "\1\uffff\2\113\1\u00f3\1\115\1\u00f4\4\uffff\1\113\1\u00f6\1\uffff"+
        "\1\115\1\113\1\u00f8\1\u00f9\1\113\1\uffff\1\113\1\u00fc\2\uffff"+
        "\1\115\1\uffff\1\u00fd\2\uffff\1\113\1\u00ff\2\uffff\1\u0100\2\uffff";
    static final String DFA22_eofS =
        "\u0101\uffff";
    static final String DFA22_minS =
        "\1\0\1\53\1\55\1\57\1\52\5\75\1\174\1\46\2\uffff\2\60\1\uffff\6"+
        "\60\3\uffff\7\60\1\uffff\1\60\1\56\1\0\1\42\1\0\3\uffff\1\42\7\uffff"+
        "\1\56\1\60\3\uffff\3\0\20\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1"+
        "\uffff\22\60\3\uffff\12\60\20\uffff\1\60\1\uffff\31\60\1\uffff\3"+
        "\60\1\uffff\21\60\1\uffff\22\60\1\uffff\2\60\1\uffff\7\60\4\uffff"+
        "\6\60\1\uffff\4\60\1\uffff\5\60\4\uffff\2\60\1\uffff\5\60\1\uffff"+
        "\2\60\2\uffff\1\60\1\uffff\1\60\2\uffff\2\60\2\uffff\1\60\2\uffff";
    static final String DFA22_maxS =
        "\1\ufffe\11\75\1\174\1\46\2\uffff\1\172\1\71\1\uffff\6\172\3\uffff"+
        "\7\172\1\uffff\1\172\1\146\1\ufffe\1\42\1\ufffe\3\uffff\1\164\7"+
        "\uffff\1\146\1\71\3\uffff\3\ufffe\20\uffff\1\172\1\uffff\1\172\2"+
        "\uffff\1\146\1\uffff\22\172\3\uffff\12\172\20\uffff\1\172\1\uffff"+
        "\31\172\1\uffff\3\172\1\uffff\21\172\1\uffff\22\172\1\uffff\2\172"+
        "\1\uffff\7\172\4\uffff\6\172\1\uffff\4\172\1\uffff\5\172\4\uffff"+
        "\2\172\1\uffff\5\172\1\uffff\2\172\2\uffff\1\172\1\uffff\1\172\2"+
        "\uffff\2\172\2\uffff\1\172\2\uffff";
    static final String DFA22_acceptS =
        "\14\uffff\1\24\1\25\2\uffff\1\37\6\uffff\1\46\1\47\1\50\7\uffff"+
        "\1\66\5\uffff\2\104\1\110\1\uffff\1\32\1\33\1\15\1\1\1\34\1\16\1"+
        "\2\2\uffff\1\30\1\17\1\3\3\uffff\1\20\1\4\1\21\1\5\1\7\1\6\1\10"+
        "\1\11\1\12\1\13\1\14\1\110\1\22\1\23\1\24\1\25\1\uffff\1\76\1\uffff"+
        "\1\75\1\36\1\uffff\1\37\22\uffff\1\46\1\47\1\50\12\uffff\1\66\1"+
        "\77\1\101\1\111\1\102\1\103\4\110\1\31\1\107\1\26\1\105\1\27\1\106"+
        "\1\uffff\1\100\31\uffff\1\57\3\uffff\1\62\21\uffff\1\63\22\uffff"+
        "\1\65\2\uffff\1\60\7\uffff\1\45\1\70\1\52\1\53\6\uffff\1\35\4\uffff"+
        "\1\41\5\uffff\1\51\1\44\1\71\1\55\2\uffff\1\61\5\uffff\1\72\2\uffff"+
        "\1\43\1\64\1\uffff\1\56\1\uffff\1\40\1\74\2\uffff\1\42\1\67\1\uffff"+
        "\1\54\1\73";
    static final String DFA22_specialS =
        "\u0101\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\51\1\47\1\50\1\51\2\47\22\51\1\47\1\11\1\44\2\51\1\5\1\13"+
            "\1\46\1\27\1\31\1\3\1\1\1\30\1\2\1\17\1\4\12\43\1\41\1\20\1"+
            "\10\1\6\1\7\1\51\1\45\32\42\1\51\1\52\2\51\1\42\1\51\1\42\1"+
            "\34\1\22\1\40\1\23\1\25\2\42\1\36\4\42\1\33\1\42\1\21\1\42\1"+
            "\35\1\24\1\26\1\16\1\32\1\37\3\42\1\14\1\12\1\15\uff81\51",
            "\1\54\3\uffff\1\53\15\uffff\1\55",
            "\1\57\1\63\1\uffff\12\62\3\uffff\1\60",
            "\1\64\15\uffff\1\65",
            "\1\71\1\67\3\uffff\1\70\15\uffff\1\72",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\104",
            "\1\106",
            "\1\107",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\112\7\114",
            "\12\117",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\121\20\114\1\122\2\114\1\123\5\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\125\6\114\1\127\3\114\1\124\2\114\1\126\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\131\13\114\1\130\2\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\132\1\134\1\114\1\133\3\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\140\7\114\1\135\2\114\1\137\2\114\1\136\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\7"+
            "\114\1\141\11\114\1\142\10\114",
            "",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\16"+
            "\114\1\146\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\147\5\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\16"+
            "\114\1\151\2\114\1\150\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\152\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\5"+
            "\114\1\153\7\114\1\154\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\7"+
            "\114\1\155\22\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\157\11\114\1\156\13\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\1\63\1\uffff\12\62\14\uffff\1\162\37\uffff\1\162",
            "\12\164\1\uffff\ufff4\164",
            "\1\164",
            "\12\165\1\uffff\ufff4\165",
            "",
            "",
            "",
            "\1\167\71\uffff\1\171\21\uffff\1\170\5\uffff\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\1\uffff\12\62\14\uffff\1\162\37\uffff\1\162",
            "\12\117",
            "",
            "",
            "",
            "\uffff\173",
            "\12\175\1\uffff\2\175\1\uffff\ufff1\175",
            "\uffff\177",
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
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u0080\21\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "\12\117\14\uffff\1\162\37\uffff\1\162",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\21"+
            "\114\1\u0082\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u0083\5\114\1\u0084\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\114\1\u0085\30\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u0086\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u0087\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u0088\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u0089\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u008a\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u008b\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u008c\20\114\1\u008d\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u008e\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\17"+
            "\114\1\u008f\12\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u0090\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\21"+
            "\114\1\u0091\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\16"+
            "\114\1\u0092\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u0093\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u0094\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\u0095\5\114",
            "",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u0096\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u0097\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u0098\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\16"+
            "\114\1\u0099\13\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u009a\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u009c\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u009d\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\u009e\5\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\5"+
            "\114\1\u00a0\24\114",
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
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00a1\14\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00a2\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\25"+
            "\114\1\u00a3\4\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00a4\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00a5\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u00a6\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00a7\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00a8\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\21"+
            "\114\1\u00a9\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00aa\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00ab\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00ac\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u00ad\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00ae\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00af\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00b0\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00b2\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u00b3\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u00b4\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00b5\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\3"+
            "\114\1\u00b6\26\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00b7\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00b8\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00b9\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\u00ba\5\114",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00bb\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\114\1\u00bc\30\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00bd\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\6"+
            "\114\1\u00be\23\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u00bf\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00c0\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00c1\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u00c2\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u00c3\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u00c5\21\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00c6\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\10"+
            "\114\1\u00c8\21\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00c9\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\2"+
            "\114\1\u00ca\27\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\21"+
            "\114\1\u00cb\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00cc\16\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00cd\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00ce\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\12"+
            "\114\1\u00d3\17\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00d4\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\21"+
            "\114\1\u00d5\10\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00d6\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00d7\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\u00d8\5\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00da\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00db\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\2"+
            "\114\1\u00dc\27\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\2"+
            "\114\1\u00dd\27\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00df\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\3"+
            "\114\1\u00e0\26\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\2"+
            "\114\1\u00e1\27\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\6"+
            "\114\1\u00e2\23\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\7"+
            "\114\1\u00e3\22\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\1"+
            "\u00e8\31\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00e9\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00eb\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00ec\16\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\13"+
            "\114\1\u00ed\16\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00ee\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00ef\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\24"+
            "\114\1\u00f1\5\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\22"+
            "\114\1\u00f2\7\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\15"+
            "\114\1\u00f5\14\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\23"+
            "\114\1\u00f7\6\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00fa\25\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\4"+
            "\114\1\u00fb\25\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\3"+
            "\114\1\u00fe\26\114",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            "",
            "\12\114\2\uffff\1\115\4\uffff\32\114\4\uffff\1\114\1\uffff\32"+
            "\114",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | TYPE | WORD | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT );";
        }
    }
 

}