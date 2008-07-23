// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 20:49:38

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
import java.util.Map;
import java.util.HashMap;
public class sgclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "TYPE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'using'", "'.'", "';'", "'partial'", "'class'", "'extends'", "'static'", "'final'", "'this'", "'('", "','", "')'", "'super'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'true'", "'false'", "'public'", "'protected'", "'private'"
    };
    public static final int DEC=31;
    public static final int LT=14;
    public static final int MOEQUAL=20;
    public static final int DCOMMENT=47;
    public static final int MOD=8;
    public static final int BLKEND=24;
    public static final int DCMTB=28;
    public static final int STRCONTENT=41;
    public static final int GTE=11;
    public static final int DCMTE=29;
    public static final int CHAR=38;
    public static final int SLCOMMENT=45;
    public static final int PLEQUAL=16;
    public static final int FLOAT=36;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int TYPE=33;
    public static final int WORD=32;
    public static final int INC=30;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=35;
    public static final int PLUS=4;
    public static final int DIGIT=40;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=46;
    public static final int INTEGER=34;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=42;
    public static final int WHITESPACE=43;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int LINE=44;
    public static final int ALPHA=39;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int OR=21;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int STRING=37;

        public sgclParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[156+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }



    // $ANTLR start doc
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:1: doc : ( extension )* classdef ;
    public final void doc() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( ( extension )* classdef )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: ( extension )* classdef
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: ( extension )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: extension
            	    {
            	    pushFollow(FOLLOW_extension_in_doc274);
            	    extension();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_classdef_in_doc279);
            classdef();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end doc


    // $ANTLR start extension
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:1: extension : 'using' WORD ( '.' WORD )* ';' ;
    public final void extension() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:2: ( 'using' WORD ( '.' WORD )* ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:4: 'using' WORD ( '.' WORD )* ';'
            {
            match(input,48,FOLLOW_48_in_extension290); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_extension292); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:17: ( '.' WORD )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==49) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:18: '.' WORD
            	    {
            	    match(input,49,FOLLOW_49_in_extension295); if (failed) return ;
            	    match(input,WORD,FOLLOW_WORD_in_extension297); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,50,FOLLOW_50_in_extension301); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end extension


    // $ANTLR start classdef
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' TYPE )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:9: ( ( 'partial' )? 'class' WORD ( 'extends' TYPE )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( 'partial' )? 'class' WORD ( 'extends' TYPE )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( 'partial' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==51) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:12: 'partial'
                    {
                    match(input,51,FOLLOW_51_in_classdef309); if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_classdef313); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_classdef315); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:37: ( 'extends' TYPE )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:38: 'extends' TYPE
                    {
                    match(input,53,FOLLOW_53_in_classdef318); if (failed) return ;
                    match(input,TYPE,FOLLOW_TYPE_in_classdef320); if (failed) return ;

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef326); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:3: ( clsext )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=76 && LA5_0<=78)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef330);
            	    clsext();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef335); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end classdef


    // $ANTLR start clsext
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:8: ( fieldas | funct | constructor )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=76 && LA6_0<=78)) ) {
                switch ( input.LA(2) ) {
                case 54:
                    {
                    switch ( input.LA(3) ) {
                    case TYPE:
                        {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==WORD) ) {
                            int LA6_7 = input.LA(5);

                            if ( (LA6_7==57) ) {
                                alt6=2;
                            }
                            else if ( (LA6_7==EQUAL||LA6_7==50) ) {
                                alt6=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        alt6=2;
                        }
                        break;
                    case 55:
                        {
                        alt6=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case TYPE:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==WORD) ) {
                        int LA6_7 = input.LA(4);

                        if ( (LA6_7==57) ) {
                            alt6=2;
                        }
                        else if ( (LA6_7==EQUAL||LA6_7==50) ) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                    {
                    alt6=2;
                    }
                    break;
                case 56:
                    {
                    alt6=3;
                    }
                    break;
                case 55:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext343);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext347);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext351);
                    constructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end clsext


    // $ANTLR start fieldas
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:1: fieldas : privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:9: ( privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:11: privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas358);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:19: ( 'static' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,54,FOLLOW_54_in_fieldas360); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:29: ( 'final' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'final'
                    {
                    match(input,55,FOLLOW_55_in_fieldas363); if (failed) return ;

                    }
                    break;

            }

            match(input,TYPE,FOLLOW_TYPE_in_fieldas366); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas368); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:48: ( EQUAL value )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EQUAL) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas371); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas373);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,50,FOLLOW_50_in_fieldas377); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end fieldas


    // $ANTLR start constructor
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: constructor : privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:2: ( privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:4: privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor385);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_constructor387); if (failed) return ;
            match(input,57,FOLLOW_57_in_constructor389); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:23: ( TYPE WORD ( ',' TYPE WORD )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TYPE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:24: TYPE WORD ( ',' TYPE WORD )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_constructor392); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor394); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:34: ( ',' TYPE WORD )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==58) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:35: ',' TYPE WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_constructor397); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_constructor399); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor401); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_constructor407); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor411); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:3: ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==56) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==57) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==60) ) {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==57) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:4: ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';'
                    {
                    if ( input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructor416);    throw mse;
                    }

                    match(input,57,FOLLOW_57_in_constructor422); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:25: ( value ( ',' value )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==WORD||(LA13_0>=INTEGER && LA13_0<=CHAR)||(LA13_0>=56 && LA13_0<=57)||(LA13_0>=60 && LA13_0<=61)||(LA13_0>=74 && LA13_0<=75)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:26: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_constructor425);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:32: ( ',' value )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==58) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:33: ',' value
                            	    {
                            	    match(input,58,FOLLOW_58_in_constructor428); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_constructor430);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,59,FOLLOW_59_in_constructor436); if (failed) return ;
                    match(input,50,FOLLOW_50_in_constructor438); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:90:3: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=WORD && LA15_0<=TYPE)||(LA15_0>=55 && LA15_0<=57)||LA15_0==60||(LA15_0>=62 && LA15_0<=65)||(LA15_0>=67 && LA15_0<=70)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor444);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor449); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constructor


    // $ANTLR start funct
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:1: funct : privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:7: ( privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:9: privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct456);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:17: ( 'static' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,54,FOLLOW_54_in_funct458); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:27: ( TYPE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==TYPE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_funct461); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct464); if (failed) return ;
            match(input,57,FOLLOW_57_in_funct466); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:42: ( TYPE WORD ( ',' TYPE WORD )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TYPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:43: TYPE WORD ( ',' TYPE WORD )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_funct469); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct471); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:53: ( ',' TYPE WORD )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==58) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:54: ',' TYPE WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_funct474); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_funct476); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct478); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_funct484); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct488); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:3: ( statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=WORD && LA20_0<=TYPE)||(LA20_0>=55 && LA20_0<=57)||LA20_0==60||(LA20_0>=62 && LA20_0<=65)||(LA20_0>=67 && LA20_0<=70)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct492);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct497); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end funct


    // $ANTLR start declare
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:1: declare : ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TYPE||LA23_0==55) ) {
                alt23=1;
            }
            else if ( (LA23_0==WORD) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("96:1: declare : ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:11: ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:11: ( 'final' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==55) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:12: 'final'
                            {
                            match(input,55,FOLLOW_55_in_declare505); if (failed) return ;

                            }
                            break;

                    }

                    match(input,TYPE,FOLLOW_TYPE_in_declare509); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare511); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==EQUAL||(LA22_0>=PLEQUAL && LA22_0<=MOEQUAL)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare514);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare528);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare536); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare538);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare552);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end declare


    // $ANTLR start value
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:7: ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred62()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred62()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt33=1;
                }
                break;
            case WORD:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred62()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case STRING:
            case CHAR:
            case 61:
            case 74:
            case 75:
                {
                alt33=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("100:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' TYPE ')' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==57) ) {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==TYPE) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:10: '(' TYPE ')'
                    	    {
                    	    match(input,57,FOLLOW_57_in_value562); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_value564); if (failed) return ;
                    	    match(input,59,FOLLOW_59_in_value566); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=56 && LA26_0<=57)||LA26_0==60) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==WORD) ) {
                        int LA26_2 = input.LA(2);

                        if ( (LA26_2==49) ) {
                            alt26=1;
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                            int alt25=4;
                            switch ( input.LA(1) ) {
                            case 56:
                                {
                                alt25=1;
                                }
                                break;
                            case 60:
                                {
                                alt25=2;
                                }
                                break;
                            case 57:
                                {
                                alt25=3;
                                }
                                break;
                            case WORD:
                                {
                                alt25=4;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 25, 0, input);

                                throw nvae;
                            }

                            switch (alt25) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:6: 'this'
                                    {
                                    match(input,56,FOLLOW_56_in_value575); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:13: 'super'
                                    {
                                    match(input,60,FOLLOW_60_in_value577); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:22: '(' value ')'
                                    {
                                    match(input,57,FOLLOW_57_in_value580); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value581);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,59,FOLLOW_59_in_value582); if (failed) return ;

                                    }


                                    }
                                    break;
                                case 4 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:35: WORD
                                    {
                                    match(input,WORD,FOLLOW_WORD_in_value585); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,49,FOLLOW_49_in_value588); if (failed) return ;

                            }
                            break;

                    }

                    match(input,WORD,FOLLOW_WORD_in_value592); if (failed) return ;
                    match(input,57,FOLLOW_57_in_value594); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:56: ( value ( ',' value )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==WORD||(LA28_0>=INTEGER && LA28_0<=CHAR)||(LA28_0>=56 && LA28_0<=57)||(LA28_0>=60 && LA28_0<=61)||(LA28_0>=74 && LA28_0<=75)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:57: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value597);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:63: ( ',' value )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==58) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:64: ',' value
                            	    {
                            	    match(input,58,FOLLOW_58_in_value600); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value602);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,59,FOLLOW_59_in_value608); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=PLUS && LA29_0<=AND)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value613);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value653);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:8: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:8: ( 'this' | '(' value ')' | constant | WORD )
                    int alt30=4;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt30=1;
                        }
                        break;
                    case 57:
                        {
                        alt30=2;
                        }
                        break;
                    case INTEGER:
                    case DOUBLE:
                    case FLOAT:
                    case STRING:
                    case CHAR:
                    case 61:
                    case 74:
                    case 75:
                        {
                        alt30=3;
                        }
                        break;
                    case WORD:
                        {
                        alt30=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("103:8: ( 'this' | '(' value ')' | constant | WORD )", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:9: 'this'
                            {
                            match(input,56,FOLLOW_56_in_value666); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:16: '(' value ')'
                            {
                            match(input,57,FOLLOW_57_in_value668); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value669);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,59,FOLLOW_59_in_value670); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value672);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:37: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value674); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:43: ( '.' WORD )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==49) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:44: '.' WORD
                    	    {
                    	    match(input,49,FOLLOW_49_in_value678); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_value680); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt32=4;
                    switch ( input.LA(1) ) {
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case MOD:
                        case EQUAL:
                        case EQUAL2:
                        case GTE:
                        case GT:
                        case LTE:
                        case LT:
                        case NEQUAL:
                        case PLEQUAL:
                        case MIEQUAL:
                        case MUEQUAL:
                        case DIEQUAL:
                        case MOEQUAL:
                        case OR:
                        case AND:
                            {
                            alt32=1;
                            }
                            break;
                        case INC:
                            {
                            alt32=2;
                            }
                            break;
                        case DEC:
                            {
                            alt32=3;
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value689);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value729);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value732); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value734); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end value


    // $ANTLR start constant
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt34=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt34=1;
                }
                break;
            case DOUBLE:
                {
                alt34=2;
                }
                break;
            case FLOAT:
                {
                alt34=3;
                }
                break;
            case STRING:
                {
                alt34=4;
                }
                break;
            case CHAR:
                {
                alt34=5;
                }
                break;
            case 74:
            case 75:
                {
                alt34=6;
                }
                break;
            case 61:
                {
                alt34=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("105:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant747); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant751); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant755); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant759); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant763); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant767);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:57: 'null'
                    {
                    match(input,61,FOLLOW_61_in_constant771); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constant


    // $ANTLR start fnccall
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:1: fnccall : ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ;
    public final void fnccall() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:9: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=56 && LA36_0<=57)||LA36_0==60) ) {
                alt36=1;
            }
            else if ( (LA36_0==WORD) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==49) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt35=4;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt35=1;
                        }
                        break;
                    case 60:
                        {
                        alt35=2;
                        }
                        break;
                    case 57:
                        {
                        alt35=3;
                        }
                        break;
                    case WORD:
                        {
                        alt35=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 35, 0, input);

                        throw nvae;
                    }

                    switch (alt35) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:13: 'this'
                            {
                            match(input,56,FOLLOW_56_in_fnccall780); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:20: 'super'
                            {
                            match(input,60,FOLLOW_60_in_fnccall782); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:29: '(' value ')'
                            {
                            match(input,57,FOLLOW_57_in_fnccall785); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall787);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,59,FOLLOW_59_in_fnccall789); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall792); if (failed) return ;

                            }
                            break;

                    }

                    match(input,49,FOLLOW_49_in_fnccall795); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall799); if (failed) return ;
            match(input,57,FOLLOW_57_in_fnccall801); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:65: ( value ( ',' value )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WORD||(LA38_0>=INTEGER && LA38_0<=CHAR)||(LA38_0>=56 && LA38_0<=57)||(LA38_0>=60 && LA38_0<=61)||(LA38_0>=74 && LA38_0<=75)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall804);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:72: ( ',' value )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==58) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:73: ',' value
                    	    {
                    	    match(input,58,FOLLOW_58_in_fnccall807); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall809);
                    	    value();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_fnccall815); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end fnccall


    // $ANTLR start statement
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:2: ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt40=5;
            switch ( input.LA(1) ) {
            case WORD:
            case TYPE:
            case 55:
            case 56:
            case 57:
            case 60:
            case 62:
            case 63:
            case 64:
            case 68:
                {
                alt40=1;
                }
                break;
            case 65:
                {
                alt40=2;
                }
                break;
            case 67:
                {
                alt40=3;
                }
                break;
            case 69:
                {
                alt40=4;
                }
                break;
            case 70:
                {
                alt40=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("108:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt39=7;
                    switch ( input.LA(1) ) {
                    case TYPE:
                    case 55:
                        {
                        alt39=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case 57:
                            {
                            alt39=5;
                            }
                            break;
                        case EQUAL:
                        case PLEQUAL:
                        case MIEQUAL:
                        case MUEQUAL:
                        case DIEQUAL:
                        case MOEQUAL:
                            {
                            alt39=1;
                            }
                            break;
                        case 49:
                            {
                            int LA39_9 = input.LA(3);

                            if ( (LA39_9==WORD) ) {
                                int LA39_11 = input.LA(4);

                                if ( (LA39_11==57) ) {
                                    alt39=5;
                                }
                                else if ( ((LA39_11>=INC && LA39_11<=DEC)) ) {
                                    alt39=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 9, input);

                                throw nvae;
                            }
                            }
                            break;
                        case INC:
                        case DEC:
                            {
                            alt39=3;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 64:
                        {
                        alt39=2;
                        }
                        break;
                    case 56:
                        {
                        int LA39_4 = input.LA(2);

                        if ( (LA39_4==49) ) {
                            int LA39_9 = input.LA(3);

                            if ( (LA39_9==WORD) ) {
                                int LA39_11 = input.LA(4);

                                if ( (LA39_11==57) ) {
                                    alt39=5;
                                }
                                else if ( ((LA39_11>=INC && LA39_11<=DEC)) ) {
                                    alt39=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 9, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        alt39=4;
                        }
                        break;
                    case 57:
                    case 60:
                        {
                        alt39=5;
                        }
                        break;
                    case 62:
                        {
                        alt39=6;
                        }
                        break;
                    case 63:
                        {
                        alt39=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 39, 0, input);

                        throw nvae;
                    }

                    switch (alt39) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement825);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement829);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement833);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement837);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement841);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:60: 'continue'
                            {
                            match(input,62,FOLLOW_62_in_statement845); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:73: 'break'
                            {
                            match(input,63,FOLLOW_63_in_statement849); if (failed) return ;

                            }
                            break;

                    }

                    match(input,50,FOLLOW_50_in_statement852); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement858);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement862);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement866);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement870);
                    switchstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start incrstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:11: ( ( 'this' | WORD ) '.' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WORD) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==49) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==56) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==56 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt877);    throw mse;
                    }

                    match(input,49,FOLLOW_49_in_incrstmt883); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt887); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt889);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end incrstmt


    // $ANTLR start returnstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:4: 'return' value
            {
            match(input,64,FOLLOW_64_in_returnstmt901); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt903);
            value();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end returnstmt


    // $ANTLR start ifstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,65,FOLLOW_65_in_ifstmt910); if (failed) return ;
            match(input,57,FOLLOW_57_in_ifstmt912); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt914);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_ifstmt916); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=WORD && LA43_0<=TYPE)||(LA43_0>=55 && LA43_0<=57)||LA43_0==60||(LA43_0>=62 && LA43_0<=65)||(LA43_0>=67 && LA43_0<=70)) ) {
                alt43=1;
            }
            else if ( (LA43_0==BLKBEG) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt919);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt922); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:48: ( statement )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=WORD && LA42_0<=TYPE)||(LA42_0>=55 && LA42_0<=57)||LA42_0==60||(LA42_0>=62 && LA42_0<=65)||(LA42_0>=67 && LA42_0<=70)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt924);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt927); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred117()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,66,FOLLOW_66_in_ifstmt934); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=WORD && LA45_0<=TYPE)||(LA45_0>=55 && LA45_0<=57)||LA45_0==60||(LA45_0>=62 && LA45_0<=65)||(LA45_0>=67 && LA45_0<=70)) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==BLKBEG) ) {
                        alt45=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt937);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt940); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:30: ( statement )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( ((LA44_0>=WORD && LA44_0<=TYPE)||(LA44_0>=55 && LA44_0<=57)||LA44_0==60||(LA44_0>=62 && LA44_0<=65)||(LA44_0>=67 && LA44_0<=70)) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt942);
                            	    statement();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt945); if (failed) return ;

                            }


                            }
                            break;

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
        }
        return ;
    }
    // $ANTLR end ifstmt


    // $ANTLR start whilestmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,67,FOLLOW_67_in_whilestmt957); if (failed) return ;
            match(input,57,FOLLOW_57_in_whilestmt959); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt961);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_whilestmt963); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=WORD && LA48_0<=TYPE)||(LA48_0>=55 && LA48_0<=57)||LA48_0==60||(LA48_0>=62 && LA48_0<=65)||(LA48_0>=67 && LA48_0<=70)) ) {
                alt48=1;
            }
            else if ( (LA48_0==BLKBEG) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("117:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt966);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt969); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:45: ( statement )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=WORD && LA47_0<=TYPE)||(LA47_0>=55 && LA47_0<=57)||LA47_0==60||(LA47_0>=62 && LA47_0<=65)||(LA47_0>=67 && LA47_0<=70)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt971);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt974); if (failed) return ;

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
        }
        return ;
    }
    // $ANTLR end whilestmt


    // $ANTLR start dowhile
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,68,FOLLOW_68_in_dowhile983); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=WORD && LA50_0<=TYPE)||(LA50_0>=55 && LA50_0<=57)||LA50_0==60||(LA50_0>=62 && LA50_0<=65)||(LA50_0>=67 && LA50_0<=70)) ) {
                alt50=1;
            }
            else if ( (LA50_0==BLKBEG) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("118:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile986);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile989); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:35: ( statement )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=WORD && LA49_0<=TYPE)||(LA49_0>=55 && LA49_0<=57)||LA49_0==60||(LA49_0>=62 && LA49_0<=65)||(LA49_0>=67 && LA49_0<=70)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile991);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile994); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,67,FOLLOW_67_in_dowhile998); if (failed) return ;
            match(input,57,FOLLOW_57_in_dowhile1000); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile1002);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_dowhile1004); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dowhile


    // $ANTLR start forstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,69,FOLLOW_69_in_forstmt1011); if (failed) return ;
            match(input,57,FOLLOW_57_in_forstmt1013); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:21: ( declare )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=WORD && LA51_0<=TYPE)||LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1015);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,50,FOLLOW_50_in_forstmt1018); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt1020);
            value();
            _fsp--;
            if (failed) return ;
            match(input,50,FOLLOW_50_in_forstmt1022); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:44: ( declare | incrstmt )?
            int alt52=3;
            switch ( input.LA(1) ) {
                case TYPE:
                case 55:
                    {
                    alt52=1;
                    }
                    break;
                case WORD:
                    {
                    int LA52_2 = input.LA(2);

                    if ( ((LA52_2>=INC && LA52_2<=DEC)||LA52_2==49) ) {
                        alt52=2;
                    }
                    else if ( (LA52_2==EQUAL||(LA52_2>=PLEQUAL && LA52_2<=MOEQUAL)) ) {
                        alt52=1;
                    }
                    }
                    break;
                case 56:
                    {
                    alt52=2;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1025);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt1027);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_forstmt1031); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=WORD && LA54_0<=TYPE)||(LA54_0>=55 && LA54_0<=57)||LA54_0==60||(LA54_0>=62 && LA54_0<=65)||(LA54_0>=67 && LA54_0<=70)) ) {
                alt54=1;
            }
            else if ( (LA54_0==BLKBEG) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("119:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt1034);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt1037); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:87: ( statement )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=WORD && LA53_0<=TYPE)||(LA53_0>=55 && LA53_0<=57)||LA53_0==60||(LA53_0>=62 && LA53_0<=65)||(LA53_0>=67 && LA53_0<=70)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt1039);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt1042); if (failed) return ;

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
        }
        return ;
    }
    // $ANTLR end forstmt


    // $ANTLR start switchstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,70,FOLLOW_70_in_switchstmt1052); if (failed) return ;
            match(input,57,FOLLOW_57_in_switchstmt1054); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt1056); if (failed) return ;
            match(input,59,FOLLOW_59_in_switchstmt1058); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1062); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:123:3: ( casestmt )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==71) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1066);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:3: ( defaultstmt )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==73) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1071);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1076); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end switchstmt


    // $ANTLR start casestmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:11: 'case' constant ':' ( statement )*
            {
            match(input,71,FOLLOW_71_in_casestmt1082); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1084);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,72,FOLLOW_72_in_casestmt1086); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:31: ( statement )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=WORD && LA57_0<=TYPE)||(LA57_0>=55 && LA57_0<=57)||LA57_0==60||(LA57_0>=62 && LA57_0<=65)||(LA57_0>=67 && LA57_0<=70)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1088);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end casestmt


    // $ANTLR start defaultstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:127:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:4: 'default' ':' ( statement )*
            {
            match(input,73,FOLLOW_73_in_defaultstmt1097); if (failed) return ;
            match(input,72,FOLLOW_72_in_defaultstmt1099); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:18: ( statement )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=WORD && LA58_0<=TYPE)||(LA58_0>=55 && LA58_0<=57)||LA58_0==60||(LA58_0>=62 && LA58_0<=65)||(LA58_0>=67 && LA58_0<=70)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1101);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultstmt


    // $ANTLR start boolval
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:133:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:133:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=74 && input.LA(1)<=75) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boolval0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end boolval


    // $ANTLR start privacy
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:135:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:135:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=76 && input.LA(1)<=78) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_privacy0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end privacy

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' TYPE ')' )*
        loop68:
        do {
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==57) ) {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==TYPE) ) {
                    alt68=1;
                }


            }


            switch (alt68) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:10: '(' TYPE ')'
        	    {
        	    match(input,57,FOLLOW_57_in_synpred62562); if (failed) return ;
        	    match(input,TYPE,FOLLOW_TYPE_in_synpred62564); if (failed) return ;
        	    match(input,59,FOLLOW_59_in_synpred62566); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop68;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( ((LA70_0>=56 && LA70_0<=57)||LA70_0==60) ) {
            alt70=1;
        }
        else if ( (LA70_0==WORD) ) {
            int LA70_2 = input.LA(2);

            if ( (LA70_2==49) ) {
                alt70=1;
            }
        }
        switch (alt70) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                int alt69=4;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    alt69=1;
                    }
                    break;
                case 60:
                    {
                    alt69=2;
                    }
                    break;
                case 57:
                    {
                    alt69=3;
                    }
                    break;
                case WORD:
                    {
                    alt69=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("101:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 69, 0, input);

                    throw nvae;
                }

                switch (alt69) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:6: 'this'
                        {
                        match(input,56,FOLLOW_56_in_synpred62575); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:13: 'super'
                        {
                        match(input,60,FOLLOW_60_in_synpred62577); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:22: '(' value ')'
                        {
                        match(input,57,FOLLOW_57_in_synpred62580); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred62581);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,59,FOLLOW_59_in_synpred62582); if (failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:35: WORD
                        {
                        match(input,WORD,FOLLOW_WORD_in_synpred62585); if (failed) return ;

                        }
                        break;

                }

                match(input,49,FOLLOW_49_in_synpred62588); if (failed) return ;

                }
                break;

        }

        match(input,WORD,FOLLOW_WORD_in_synpred62592); if (failed) return ;
        match(input,57,FOLLOW_57_in_synpred62594); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:56: ( value ( ',' value )* )?
        int alt72=2;
        int LA72_0 = input.LA(1);

        if ( (LA72_0==WORD||(LA72_0>=INTEGER && LA72_0<=CHAR)||(LA72_0>=56 && LA72_0<=57)||(LA72_0>=60 && LA72_0<=61)||(LA72_0>=74 && LA72_0<=75)) ) {
            alt72=1;
        }
        switch (alt72) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:57: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred62597);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:63: ( ',' value )*
                loop71:
                do {
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==58) ) {
                        alt71=1;
                    }


                    switch (alt71) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:64: ',' value
                	    {
                	    match(input,58,FOLLOW_58_in_synpred62600); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred62602);
                	    value();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop71;
                    }
                } while (true);


                }
                break;

        }

        match(input,59,FOLLOW_59_in_synpred62608); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt73=2;
        int LA73_0 = input.LA(1);

        if ( ((LA73_0>=PLUS && LA73_0<=AND)) ) {
            alt73=1;
        }
        switch (alt73) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred62613);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred62653);
                value();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred117
    public final void synpred117_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,66,FOLLOW_66_in_synpred117934); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( ((LA78_0>=WORD && LA78_0<=TYPE)||(LA78_0>=55 && LA78_0<=57)||LA78_0==60||(LA78_0>=62 && LA78_0<=65)||(LA78_0>=67 && LA78_0<=70)) ) {
            alt78=1;
        }
        else if ( (LA78_0==BLKBEG) ) {
            alt78=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 78, 0, input);

            throw nvae;
        }
        switch (alt78) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred117937);
                statement();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:22: ( BLKBEG ( statement )* BLKEND )
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:22: ( BLKBEG ( statement )* BLKEND )
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:23: BLKBEG ( statement )* BLKEND
                {
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred117940); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:30: ( statement )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( ((LA77_0>=WORD && LA77_0<=TYPE)||(LA77_0>=55 && LA77_0<=57)||LA77_0==60||(LA77_0>=62 && LA77_0<=65)||(LA77_0>=67 && LA77_0<=70)) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred117942);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop77;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred117945); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred117

    public final boolean synpred117() {
        backtracking++;
        int start = input.mark();
        try {
            synpred117_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_extension_in_doc274 = new BitSet(new long[]{0x0019000000000000L});
    public static final BitSet FOLLOW_classdef_in_doc279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_extension290 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension292 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_extension295 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension297 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_extension301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_classdef309 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_classdef313 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef315 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_classdef318 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_classdef320 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef326 = new BitSet(new long[]{0x0000000001000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_clsext_in_classdef330 = new BitSet(new long[]{0x0000000001000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas358 = new BitSet(new long[]{0x00C0000200000000L});
    public static final BitSet FOLLOW_54_in_fieldas360 = new BitSet(new long[]{0x0080000200000000L});
    public static final BitSet FOLLOW_55_in_fieldas363 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_fieldas366 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas368 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas371 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_fieldas373 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fieldas377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor385 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_constructor387 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constructor389 = new BitSet(new long[]{0x0800000200000000L});
    public static final BitSet FOLLOW_TYPE_in_constructor392 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor394 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_constructor397 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_constructor399 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor401 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_constructor407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor411 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_set_in_constructor416 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constructor422 = new BitSet(new long[]{0x3B00007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_constructor425 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_constructor428 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_constructor430 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_constructor436 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constructor438 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_constructor444 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_constructor449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct456 = new BitSet(new long[]{0x0040000300000000L});
    public static final BitSet FOLLOW_54_in_funct458 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_TYPE_in_funct461 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct464 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_funct466 = new BitSet(new long[]{0x0800000200000000L});
    public static final BitSet FOLLOW_TYPE_in_funct469 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct471 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_funct474 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_funct476 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct478 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_funct484 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct488 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_funct492 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_funct497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_declare505 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_declare509 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare511 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare514 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_declare528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare536 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare538 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_declare552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_value562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_value564 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value566 = new BitSet(new long[]{0x1300000100000000L});
    public static final BitSet FOLLOW_56_in_value575 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_value577 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_value580 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value581 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value582 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WORD_in_value585 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_value588 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value592 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_value594 = new BitSet(new long[]{0x3B00007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value597 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_value600 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value602 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_value608 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_value613 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_value666 = new BitSet(new long[]{0x00020000C07FFFF2L});
    public static final BitSet FOLLOW_57_in_value668 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value669 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value670 = new BitSet(new long[]{0x00020000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value672 = new BitSet(new long[]{0x00020000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value674 = new BitSet(new long[]{0x00020000C07FFFF2L});
    public static final BitSet FOLLOW_49_in_value678 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value680 = new BitSet(new long[]{0x00020000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value689 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_value729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_constant771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_fnccall780 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_fnccall782 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall785 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_fnccall787 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall789 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall792 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fnccall795 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall799 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall801 = new BitSet(new long[]{0x3B00007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_fnccall804 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_fnccall807 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_fnccall809 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement825 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement829 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement833 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement837 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement841 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_62_in_statement845 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_63_in_statement849 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_statement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt877 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_incrstmt883 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt887 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_returnstmt901 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_returnstmt903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifstmt910 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt912 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_ifstmt914 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifstmt916 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_ifstmt919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt922 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_ifstmt924 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ifstmt934 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_ifstmt937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt940 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_ifstmt942 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_whilestmt957 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whilestmt959 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_whilestmt961 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whilestmt963 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_whilestmt966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt969 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_whilestmt971 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_dowhile983 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_dowhile986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile989 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_dowhile991 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_dowhile994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_dowhile998 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_dowhile1000 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_dowhile1002 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_dowhile1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_forstmt1011 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_forstmt1013 = new BitSet(new long[]{0x0084000300000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1015 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forstmt1018 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_forstmt1020 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forstmt1022 = new BitSet(new long[]{0x0980000300000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1025 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt1027 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_forstmt1031 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_forstmt1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt1037 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_forstmt1039 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_switchstmt1052 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_switchstmt1054 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt1056 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_switchstmt1058 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1062 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1066 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1071 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_casestmt1082 = new BitSet(new long[]{0x2000007C00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_constant_in_casestmt1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_casestmt1086 = new BitSet(new long[]{0xD380000300000002L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_casestmt1088 = new BitSet(new long[]{0xD380000300000002L,0x000000000000007BL});
    public static final BitSet FOLLOW_73_in_defaultstmt1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_defaultstmt1099 = new BitSet(new long[]{0xD380000300000002L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_defaultstmt1101 = new BitSet(new long[]{0xD380000300000002L,0x000000000000007BL});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred62562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_TYPE_in_synpred62564 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred62566 = new BitSet(new long[]{0x1300000100000000L});
    public static final BitSet FOLLOW_56_in_synpred62575 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_synpred62577 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_synpred62580 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_synpred62581 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred62582 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WORD_in_synpred62585 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred62588 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred62592 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred62594 = new BitSet(new long[]{0x3B00007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_synpred62597 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_synpred62600 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_synpred62602 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_synpred62608 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_synpred62613 = new BitSet(new long[]{0x3300007D00000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_value_in_synpred62653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_synpred117934 = new BitSet(new long[]{0xD380000300800000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_synpred117937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred117940 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_statement_in_synpred117942 = new BitSet(new long[]{0xD380000301000000L,0x000000000000007BL});
    public static final BitSet FOLLOW_BLKEND_in_synpred117945 = new BitSet(new long[]{0x0000000000000002L});

}