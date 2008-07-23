// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 18:08:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'partial'", "'class'", "'extends'", "'static'", "'final'", "';'", "'this'", "'('", "','", "')'", "'super'", "'.'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'int'", "'float'", "'double'", "'boolean'", "'char'", "'string'", "'true'", "'false'", "'public'", "'protected'", "'private'"
    };
    public static final int DEC=31;
    public static final int LT=14;
    public static final int MOEQUAL=20;
    public static final int DCOMMENT=46;
    public static final int MOD=8;
    public static final int BLKEND=24;
    public static final int DCMTB=28;
    public static final int STRCONTENT=40;
    public static final int GTE=11;
    public static final int DCMTE=29;
    public static final int CHAR=37;
    public static final int SLCOMMENT=44;
    public static final int PLEQUAL=16;
    public static final int FLOAT=35;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int WORD=32;
    public static final int INC=30;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=34;
    public static final int PLUS=4;
    public static final int DIGIT=39;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=45;
    public static final int INTEGER=33;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=41;
    public static final int WHITESPACE=42;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int LINE=43;
    public static final int ALPHA=38;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int OR=21;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int STRING=36;

        public sgclParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[160+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }



    // $ANTLR start doc
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:1: doc : classdef ;
    public final void doc() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( classdef )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: classdef
            {
            pushFollow(FOLLOW_classdef_in_doc274);
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


    // $ANTLR start classdef
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:9: ( ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:11: ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:11: ( 'partial' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:12: 'partial'
                    {
                    match(input,47,FOLLOW_47_in_classdef282); if (failed) return ;

                    }
                    break;

            }

            match(input,48,FOLLOW_48_in_classdef286); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_classdef288); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:37: ( 'extends' WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:38: 'extends' WORD
                    {
                    match(input,49,FOLLOW_49_in_classdef291); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_classdef293); if (failed) return ;

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef299); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:3: ( clsext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=80 && LA3_0<=82)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef303);
            	    clsext();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef308); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=80 && LA4_0<=82)) ) {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    switch ( input.LA(3) ) {
                    case WORD:
                        {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==54) ) {
                            alt4=2;
                        }
                        else if ( (LA4_4==WORD) ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8==54) ) {
                                alt4=2;
                            }
                            else if ( (LA4_8==EQUAL||LA4_8==52) ) {
                                alt4=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==WORD) ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8==54) ) {
                                alt4=2;
                            }
                            else if ( (LA4_8==EQUAL||LA4_8==52) ) {
                                alt4=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                        {
                        alt4=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 51:
                    {
                    alt4=1;
                    }
                    break;
                case WORD:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==54) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==WORD) ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8==54) ) {
                            alt4=2;
                        }
                        else if ( (LA4_8==EQUAL||LA4_8==52) ) {
                            alt4=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==WORD) ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8==54) ) {
                            alt4=2;
                        }
                        else if ( (LA4_8==EQUAL||LA4_8==52) ) {
                            alt4=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 53:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("80:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext316);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext320);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext324);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas331);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==50) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,50,FOLLOW_50_in_fieldas333); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:29: ( 'final' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'final'
                    {
                    match(input,51,FOLLOW_51_in_fieldas336); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas339);
            type();
            _fsp--;
            if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas341); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:48: ( EQUAL value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas344); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas346);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_fieldas350); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor358);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,53,FOLLOW_53_in_constructor360); if (failed) return ;
            match(input,54,FOLLOW_54_in_constructor362); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:23: ( type WORD ( ',' type WORD )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD||(LA9_0>=72 && LA9_0<=77)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor365);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor367); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:34: ( ',' type WORD )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==55) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:35: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_constructor370); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_constructor372);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor374); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_constructor380); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor384); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:3: ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==53) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==54) ) {
                    alt12=1;
                }
            }
            else if ( (LA12_0==57) ) {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==54) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:4: ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';'
                    {
                    if ( input.LA(1)==53||input.LA(1)==57 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructor389);    throw mse;
                    }

                    match(input,54,FOLLOW_54_in_constructor395); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:25: ( value ( ',' value )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=WORD && LA11_0<=CHAR)||(LA11_0>=53 && LA11_0<=54)||LA11_0==57||LA11_0==59||(LA11_0>=78 && LA11_0<=79)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:26: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_constructor398);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:32: ( ',' value )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==55) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:33: ',' value
                            	    {
                            	    match(input,55,FOLLOW_55_in_constructor401); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_constructor403);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,56,FOLLOW_56_in_constructor409); if (failed) return ;
                    match(input,52,FOLLOW_52_in_constructor411); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:3: ( statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WORD||LA13_0==51||(LA13_0>=53 && LA13_0<=54)||LA13_0==57||(LA13_0>=60 && LA13_0<=63)||(LA13_0>=65 && LA13_0<=68)||(LA13_0>=72 && LA13_0<=77)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor417);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor422); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:1: funct : privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:7: ( privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:9: privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct429);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:17: ( 'static' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,50,FOLLOW_50_in_funct431); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:27: ( type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WORD) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==WORD) ) {
                    alt15=1;
                }
            }
            else if ( ((LA15_0>=72 && LA15_0<=77)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_funct434);
                    type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct437); if (failed) return ;
            match(input,54,FOLLOW_54_in_funct439); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:42: ( type WORD ( ',' type WORD )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD||(LA17_0>=72 && LA17_0<=77)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:43: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct442);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct444); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:53: ( ',' type WORD )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==55) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:54: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_funct447); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_funct449);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct451); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_funct457); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct461); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:90:3: ( statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WORD||LA18_0==51||(LA18_0>=53 && LA18_0<=54)||LA18_0==57||(LA18_0>=60 && LA18_0<=63)||(LA18_0>=65 && LA18_0<=68)||(LA18_0>=72 && LA18_0<=77)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct465);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct470); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51||(LA21_0>=72 && LA21_0<=77)) ) {
                alt21=1;
            }
            else if ( (LA21_0==WORD) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==EQUAL||(LA21_2>=PLEQUAL && LA21_2<=MOEQUAL)) ) {
                    alt21=2;
                }
                else if ( (LA21_2==WORD) ) {
                    alt21=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("92:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("92:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:11: ( 'final' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==51) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:12: 'final'
                            {
                            match(input,51,FOLLOW_51_in_declare478); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare482);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare484); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==EQUAL||(LA20_0>=PLEQUAL && LA20_0<=MOEQUAL)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare487);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare501);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:93:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare509); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare511);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare525);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:7: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred60()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("96:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA31_2 = input.LA(2);

                if ( (synpred60()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("96:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case 57:
                {
                alt31=1;
                }
                break;
            case WORD:
                {
                int LA31_4 = input.LA(2);

                if ( (synpred60()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("96:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 31, 4, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case STRING:
            case CHAR:
            case 59:
            case 78:
            case 79:
                {
                alt31=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("96:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( '(' type ')' )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==54) ) {
                            int LA22_2 = input.LA(2);

                            if ( (LA22_2==WORD) ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3==56) ) {
                                    int LA22_5 = input.LA(4);

                                    if ( (LA22_5==WORD||(LA22_5>=53 && LA22_5<=54)||LA22_5==57) ) {
                                        alt22=1;
                                    }


                                }


                            }
                            else if ( ((LA22_2>=72 && LA22_2<=77)) ) {
                                alt22=1;
                            }


                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:10: '(' type ')'
                    	    {
                    	    match(input,54,FOLLOW_54_in_value535); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_value537);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,56,FOLLOW_56_in_value539); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=53 && LA24_0<=54)||LA24_0==57) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==WORD) ) {
                        int LA24_2 = input.LA(2);

                        if ( (LA24_2==58) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                            int alt23=4;
                            switch ( input.LA(1) ) {
                            case 53:
                                {
                                alt23=1;
                                }
                                break;
                            case 57:
                                {
                                alt23=2;
                                }
                                break;
                            case 54:
                                {
                                alt23=3;
                                }
                                break;
                            case WORD:
                                {
                                alt23=4;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 23, 0, input);

                                throw nvae;
                            }

                            switch (alt23) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:6: 'this'
                                    {
                                    match(input,53,FOLLOW_53_in_value548); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:13: 'super'
                                    {
                                    match(input,57,FOLLOW_57_in_value550); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:22: '(' value ')'
                                    {
                                    match(input,54,FOLLOW_54_in_value553); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value554);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,56,FOLLOW_56_in_value555); if (failed) return ;

                                    }


                                    }
                                    break;
                                case 4 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:35: WORD
                                    {
                                    match(input,WORD,FOLLOW_WORD_in_value558); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,58,FOLLOW_58_in_value561); if (failed) return ;

                            }
                            break;

                    }

                    match(input,WORD,FOLLOW_WORD_in_value565); if (failed) return ;
                    match(input,54,FOLLOW_54_in_value567); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:56: ( value ( ',' value )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=WORD && LA26_0<=CHAR)||(LA26_0>=53 && LA26_0<=54)||LA26_0==57||LA26_0==59||(LA26_0>=78 && LA26_0<=79)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:57: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value570);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:63: ( ',' value )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==55) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:64: ',' value
                            	    {
                            	    match(input,55,FOLLOW_55_in_value573); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value575);
                            	    value();
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

                    }

                    match(input,56,FOLLOW_56_in_value581); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=PLUS && LA27_0<=AND)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value586);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value626);
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:8: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:8: ( 'this' | '(' value ')' | constant | WORD )
                    int alt28=4;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt28=1;
                        }
                        break;
                    case 54:
                        {
                        alt28=2;
                        }
                        break;
                    case INTEGER:
                    case DOUBLE:
                    case FLOAT:
                    case STRING:
                    case CHAR:
                    case 59:
                    case 78:
                    case 79:
                        {
                        alt28=3;
                        }
                        break;
                    case WORD:
                        {
                        alt28=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("99:8: ( 'this' | '(' value ')' | constant | WORD )", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:9: 'this'
                            {
                            match(input,53,FOLLOW_53_in_value639); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:16: '(' value ')'
                            {
                            match(input,54,FOLLOW_54_in_value641); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value642);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,56,FOLLOW_56_in_value643); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value645);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:37: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value647); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:43: ( '.' WORD )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==58) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:44: '.' WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_value651); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_value653); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt30=4;
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
                            alt30=1;
                            }
                            break;
                        case INC:
                            {
                            alt30=2;
                            }
                            break;
                        case DEC:
                            {
                            alt30=3;
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value662);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value702);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value705); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value707); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt32=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt32=1;
                }
                break;
            case DOUBLE:
                {
                alt32=2;
                }
                break;
            case FLOAT:
                {
                alt32=3;
                }
                break;
            case STRING:
                {
                alt32=4;
                }
                break;
            case CHAR:
                {
                alt32=5;
                }
                break;
            case 78:
            case 79:
                {
                alt32=6;
                }
                break;
            case 59:
                {
                alt32=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("101:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant720); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant724); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant728); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant732); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant736); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant740);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:57: 'null'
                    {
                    match(input,59,FOLLOW_59_in_constant744); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:1: fnccall : ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ;
    public final void fnccall() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:9: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=53 && LA34_0<=54)||LA34_0==57) ) {
                alt34=1;
            }
            else if ( (LA34_0==WORD) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==58) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt33=4;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt33=1;
                        }
                        break;
                    case 57:
                        {
                        alt33=2;
                        }
                        break;
                    case 54:
                        {
                        alt33=3;
                        }
                        break;
                    case WORD:
                        {
                        alt33=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("103:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:13: 'this'
                            {
                            match(input,53,FOLLOW_53_in_fnccall753); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:20: 'super'
                            {
                            match(input,57,FOLLOW_57_in_fnccall755); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:29: '(' value ')'
                            {
                            match(input,54,FOLLOW_54_in_fnccall758); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall760);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,56,FOLLOW_56_in_fnccall762); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall765); if (failed) return ;

                            }
                            break;

                    }

                    match(input,58,FOLLOW_58_in_fnccall768); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall772); if (failed) return ;
            match(input,54,FOLLOW_54_in_fnccall774); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:65: ( value ( ',' value )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=WORD && LA36_0<=CHAR)||(LA36_0>=53 && LA36_0<=54)||LA36_0==57||LA36_0==59||(LA36_0>=78 && LA36_0<=79)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall777);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:72: ( ',' value )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==55) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:73: ',' value
                    	    {
                    	    match(input,55,FOLLOW_55_in_fnccall780); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall782);
                    	    value();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_fnccall788); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:2: ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt38=5;
            switch ( input.LA(1) ) {
            case WORD:
            case 51:
            case 53:
            case 54:
            case 57:
            case 60:
            case 61:
            case 62:
            case 66:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt38=1;
                }
                break;
            case 63:
                {
                alt38=2;
                }
                break;
            case 65:
                {
                alt38=3;
                }
                break;
            case 67:
                {
                alt38=4;
                }
                break;
            case 68:
                {
                alt38=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("104:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt37=7;
                    switch ( input.LA(1) ) {
                    case 51:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        {
                        alt37=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case 54:
                            {
                            alt37=5;
                            }
                            break;
                        case EQUAL:
                        case PLEQUAL:
                        case MIEQUAL:
                        case MUEQUAL:
                        case DIEQUAL:
                        case MOEQUAL:
                        case WORD:
                            {
                            alt37=1;
                            }
                            break;
                        case INC:
                        case DEC:
                            {
                            alt37=3;
                            }
                            break;
                        case 58:
                            {
                            int LA37_10 = input.LA(3);

                            if ( (LA37_10==WORD) ) {
                                int LA37_11 = input.LA(4);

                                if ( ((LA37_11>=INC && LA37_11<=DEC)) ) {
                                    alt37=3;
                                }
                                else if ( (LA37_11==54) ) {
                                    alt37=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 10, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 62:
                        {
                        alt37=2;
                        }
                        break;
                    case 53:
                        {
                        int LA37_4 = input.LA(2);

                        if ( (LA37_4==58) ) {
                            int LA37_10 = input.LA(3);

                            if ( (LA37_10==WORD) ) {
                                int LA37_11 = input.LA(4);

                                if ( ((LA37_11>=INC && LA37_11<=DEC)) ) {
                                    alt37=3;
                                }
                                else if ( (LA37_11==54) ) {
                                    alt37=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 10, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                        {
                        alt37=4;
                        }
                        break;
                    case 54:
                    case 57:
                        {
                        alt37=5;
                        }
                        break;
                    case 60:
                        {
                        alt37=6;
                        }
                        break;
                    case 61:
                        {
                        alt37=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement798);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement802);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement806);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement810);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement814);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:60: 'continue'
                            {
                            match(input,60,FOLLOW_60_in_statement818); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:73: 'break'
                            {
                            match(input,61,FOLLOW_61_in_statement822); if (failed) return ;

                            }
                            break;

                    }

                    match(input,52,FOLLOW_52_in_statement825); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement831);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement835);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement839);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement843);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:11: ( ( 'this' | WORD ) '.' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==WORD) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==58) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==53 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt850);    throw mse;
                    }

                    match(input,58,FOLLOW_58_in_incrstmt856); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt860); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt862);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: 'return' value
            {
            match(input,62,FOLLOW_62_in_returnstmt874); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt876);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,63,FOLLOW_63_in_ifstmt883); if (failed) return ;
            match(input,54,FOLLOW_54_in_ifstmt885); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt887);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_ifstmt889); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WORD||LA41_0==51||(LA41_0>=53 && LA41_0<=54)||LA41_0==57||(LA41_0>=60 && LA41_0<=63)||(LA41_0>=65 && LA41_0<=68)||(LA41_0>=72 && LA41_0<=77)) ) {
                alt41=1;
            }
            else if ( (LA41_0==BLKBEG) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("110:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt892);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt895); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:48: ( statement )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==WORD||LA40_0==51||(LA40_0>=53 && LA40_0<=54)||LA40_0==57||(LA40_0>=60 && LA40_0<=63)||(LA40_0>=65 && LA40_0<=68)||(LA40_0>=72 && LA40_0<=77)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt897);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt900); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==64) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred115()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,64,FOLLOW_64_in_ifstmt907); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==WORD||LA43_0==51||(LA43_0>=53 && LA43_0<=54)||LA43_0==57||(LA43_0>=60 && LA43_0<=63)||(LA43_0>=65 && LA43_0<=68)||(LA43_0>=72 && LA43_0<=77)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==BLKBEG) ) {
                        alt43=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("111:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt910);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt913); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:30: ( statement )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==WORD||LA42_0==51||(LA42_0>=53 && LA42_0<=54)||LA42_0==57||(LA42_0>=60 && LA42_0<=63)||(LA42_0>=65 && LA42_0<=68)||(LA42_0>=72 && LA42_0<=77)) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt915);
                            	    statement();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt918); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,65,FOLLOW_65_in_whilestmt930); if (failed) return ;
            match(input,54,FOLLOW_54_in_whilestmt932); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt934);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_whilestmt936); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==WORD||LA46_0==51||(LA46_0>=53 && LA46_0<=54)||LA46_0==57||(LA46_0>=60 && LA46_0<=63)||(LA46_0>=65 && LA46_0<=68)||(LA46_0>=72 && LA46_0<=77)) ) {
                alt46=1;
            }
            else if ( (LA46_0==BLKBEG) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("113:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt939);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt942); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:45: ( statement )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==WORD||LA45_0==51||(LA45_0>=53 && LA45_0<=54)||LA45_0==57||(LA45_0>=60 && LA45_0<=63)||(LA45_0>=65 && LA45_0<=68)||(LA45_0>=72 && LA45_0<=77)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt944);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt947); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,66,FOLLOW_66_in_dowhile956); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==WORD||LA48_0==51||(LA48_0>=53 && LA48_0<=54)||LA48_0==57||(LA48_0>=60 && LA48_0<=63)||(LA48_0>=65 && LA48_0<=68)||(LA48_0>=72 && LA48_0<=77)) ) {
                alt48=1;
            }
            else if ( (LA48_0==BLKBEG) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile959);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile962); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:35: ( statement )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==WORD||LA47_0==51||(LA47_0>=53 && LA47_0<=54)||LA47_0==57||(LA47_0>=60 && LA47_0<=63)||(LA47_0>=65 && LA47_0<=68)||(LA47_0>=72 && LA47_0<=77)) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile964);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile967); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,65,FOLLOW_65_in_dowhile971); if (failed) return ;
            match(input,54,FOLLOW_54_in_dowhile973); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile975);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_dowhile977); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,67,FOLLOW_67_in_forstmt984); if (failed) return ;
            match(input,54,FOLLOW_54_in_forstmt986); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:21: ( declare )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==51||(LA49_0>=72 && LA49_0<=77)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt988);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_forstmt991); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt993);
            value();
            _fsp--;
            if (failed) return ;
            match(input,52,FOLLOW_52_in_forstmt995); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:44: ( declare | incrstmt )?
            int alt50=3;
            switch ( input.LA(1) ) {
                case 51:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                    {
                    alt50=1;
                    }
                    break;
                case WORD:
                    {
                    int LA50_2 = input.LA(2);

                    if ( ((LA50_2>=INC && LA50_2<=DEC)||LA50_2==58) ) {
                        alt50=2;
                    }
                    else if ( (LA50_2==EQUAL||(LA50_2>=PLEQUAL && LA50_2<=MOEQUAL)||LA50_2==WORD) ) {
                        alt50=1;
                    }
                    }
                    break;
                case 53:
                    {
                    alt50=2;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt998);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt1000);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_forstmt1004); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WORD||LA52_0==51||(LA52_0>=53 && LA52_0<=54)||LA52_0==57||(LA52_0>=60 && LA52_0<=63)||(LA52_0>=65 && LA52_0<=68)||(LA52_0>=72 && LA52_0<=77)) ) {
                alt52=1;
            }
            else if ( (LA52_0==BLKBEG) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("115:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt1007);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt1010); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:87: ( statement )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==WORD||LA51_0==51||(LA51_0>=53 && LA51_0<=54)||LA51_0==57||(LA51_0>=60 && LA51_0<=63)||(LA51_0>=65 && LA51_0<=68)||(LA51_0>=72 && LA51_0<=77)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt1012);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt1015); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,68,FOLLOW_68_in_switchstmt1025); if (failed) return ;
            match(input,54,FOLLOW_54_in_switchstmt1027); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt1029); if (failed) return ;
            match(input,56,FOLLOW_56_in_switchstmt1031); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1035); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:3: ( casestmt )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==69) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1039);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:3: ( defaultstmt )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==71) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1044);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1049); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:122:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:122:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:122:11: 'case' constant ':' ( statement )*
            {
            match(input,69,FOLLOW_69_in_casestmt1055); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1057);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,70,FOLLOW_70_in_casestmt1059); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:122:31: ( statement )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==WORD||LA55_0==51||(LA55_0>=53 && LA55_0<=54)||LA55_0==57||(LA55_0>=60 && LA55_0<=63)||(LA55_0>=65 && LA55_0<=68)||(LA55_0>=72 && LA55_0<=77)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1061);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:123:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:4: 'default' ':' ( statement )*
            {
            match(input,71,FOLLOW_71_in_defaultstmt1070); if (failed) return ;
            match(input,70,FOLLOW_70_in_defaultstmt1072); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:18: ( statement )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==WORD||LA56_0==51||(LA56_0>=53 && LA56_0<=54)||LA56_0==57||(LA56_0>=60 && LA56_0<=63)||(LA56_0>=65 && LA56_0<=68)||(LA56_0>=72 && LA56_0<=77)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1074);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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


    // $ANTLR start type
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:125:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:125:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=72 && input.LA(1)<=77) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_type0);    throw mse;
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
    // $ANTLR end type


    // $ANTLR start boolval
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:129:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:129:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=78 && input.LA(1)<=79) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:131:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:131:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=80 && input.LA(1)<=82) ) {
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

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( '(' type ')' )*
        loop66:
        do {
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==54) ) {
                int LA66_2 = input.LA(2);

                if ( (LA66_2==WORD) ) {
                    int LA66_3 = input.LA(3);

                    if ( (LA66_3==56) ) {
                        int LA66_5 = input.LA(4);

                        if ( (LA66_5==WORD||(LA66_5>=53 && LA66_5<=54)||LA66_5==57) ) {
                            alt66=1;
                        }


                    }


                }
                else if ( ((LA66_2>=72 && LA66_2<=77)) ) {
                    alt66=1;
                }


            }


            switch (alt66) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:10: '(' type ')'
        	    {
        	    match(input,54,FOLLOW_54_in_synpred60535); if (failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred60537);
        	    type();
        	    _fsp--;
        	    if (failed) return ;
        	    match(input,56,FOLLOW_56_in_synpred60539); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop66;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( ((LA68_0>=53 && LA68_0<=54)||LA68_0==57) ) {
            alt68=1;
        }
        else if ( (LA68_0==WORD) ) {
            int LA68_2 = input.LA(2);

            if ( (LA68_2==58) ) {
                alt68=1;
            }
        }
        switch (alt68) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                int alt67=4;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    alt67=1;
                    }
                    break;
                case 57:
                    {
                    alt67=2;
                    }
                    break;
                case 54:
                    {
                    alt67=3;
                    }
                    break;
                case WORD:
                    {
                    alt67=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("97:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 67, 0, input);

                    throw nvae;
                }

                switch (alt67) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:6: 'this'
                        {
                        match(input,53,FOLLOW_53_in_synpred60548); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:13: 'super'
                        {
                        match(input,57,FOLLOW_57_in_synpred60550); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:22: '(' value ')'
                        {
                        match(input,54,FOLLOW_54_in_synpred60553); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred60554);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,56,FOLLOW_56_in_synpred60555); if (failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:35: WORD
                        {
                        match(input,WORD,FOLLOW_WORD_in_synpred60558); if (failed) return ;

                        }
                        break;

                }

                match(input,58,FOLLOW_58_in_synpred60561); if (failed) return ;

                }
                break;

        }

        match(input,WORD,FOLLOW_WORD_in_synpred60565); if (failed) return ;
        match(input,54,FOLLOW_54_in_synpred60567); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:56: ( value ( ',' value )* )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( ((LA70_0>=WORD && LA70_0<=CHAR)||(LA70_0>=53 && LA70_0<=54)||LA70_0==57||LA70_0==59||(LA70_0>=78 && LA70_0<=79)) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:57: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred60570);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:63: ( ',' value )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==55) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:64: ',' value
                	    {
                	    match(input,55,FOLLOW_55_in_synpred60573); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred60575);
                	    value();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                }
                break;

        }

        match(input,56,FOLLOW_56_in_synpred60581); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( ((LA71_0>=PLUS && LA71_0<=AND)) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred60586);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred60626);
                value();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred115
    public final void synpred115_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,64,FOLLOW_64_in_synpred115907); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==WORD||LA76_0==51||(LA76_0>=53 && LA76_0<=54)||LA76_0==57||(LA76_0>=60 && LA76_0<=63)||(LA76_0>=65 && LA76_0<=68)||(LA76_0>=72 && LA76_0<=77)) ) {
            alt76=1;
        }
        else if ( (LA76_0==BLKBEG) ) {
            alt76=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("111:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 76, 0, input);

            throw nvae;
        }
        switch (alt76) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred115910);
                statement();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:22: ( BLKBEG ( statement )* BLKEND )
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:22: ( BLKBEG ( statement )* BLKEND )
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:23: BLKBEG ( statement )* BLKEND
                {
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred115913); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:30: ( statement )*
                loop75:
                do {
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==WORD||LA75_0==51||(LA75_0>=53 && LA75_0<=54)||LA75_0==57||(LA75_0>=60 && LA75_0<=63)||(LA75_0>=65 && LA75_0<=68)||(LA75_0>=72 && LA75_0<=77)) ) {
                        alt75=1;
                    }


                    switch (alt75) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred115915);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop75;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred115918); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred115

    public final boolean synpred115() {
        backtracking++;
        int start = input.mark();
        try {
            synpred115_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_classdef_in_doc274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_classdef282 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_classdef286 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef288 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_49_in_classdef291 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef293 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef299 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_clsext_in_classdef303 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas331 = new BitSet(new long[]{0x000C000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_50_in_fieldas333 = new BitSet(new long[]{0x0008000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_51_in_fieldas336 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_fieldas339 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas341 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas344 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fieldas346 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldas350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor358 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_constructor360 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_constructor362 = new BitSet(new long[]{0x0100000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor365 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor367 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_constructor370 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor372 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor374 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_constructor380 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor384 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_set_in_constructor389 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_constructor395 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_constructor398 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_constructor401 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_constructor403 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_constructor409 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_constructor411 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_constructor417 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_constructor422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct429 = new BitSet(new long[]{0x0004000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_50_in_funct431 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct434 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct437 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funct439 = new BitSet(new long[]{0x0100000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct442 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct444 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_funct447 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct449 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct451 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_funct457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct461 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_funct465 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_funct470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declare478 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_declare482 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare484 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare487 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare509 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare511 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_value535 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_value537 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value539 = new BitSet(new long[]{0x0260000100000000L});
    public static final BitSet FOLLOW_53_in_value548 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_value550 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_value553 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value554 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value555 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_value558 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_value561 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value565 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_value567 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value570 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_value573 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value575 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_value581 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_value586 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_value639 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_54_in_value641 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value642 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value643 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value645 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value647 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_58_in_value651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value653 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value662 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_constant744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fnccall753 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall755 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_fnccall758 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall760 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fnccall762 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall765 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_fnccall768 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall772 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_fnccall774 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall777 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_fnccall780 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall782 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_fnccall788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement798 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement802 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement806 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement810 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement814 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60_in_statement818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61_in_statement822 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt850 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_incrstmt856 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt860 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_returnstmt874 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_returnstmt876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifstmt883 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifstmt885 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_ifstmt887 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt889 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt895 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt897 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifstmt907 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt913 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt915 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_whilestmt930 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whilestmt932 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_whilestmt934 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_whilestmt936 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt942 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt944 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_dowhile956 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile962 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile964 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_dowhile967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_dowhile971 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_dowhile973 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_dowhile975 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_dowhile977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_forstmt984 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_forstmt986 = new BitSet(new long[]{0x0018000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt988 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt991 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_forstmt993 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt995 = new BitSet(new long[]{0x0128000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt998 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt1000 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_forstmt1004 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt1010 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt1012 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_switchstmt1025 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_switchstmt1027 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt1029 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_switchstmt1031 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1035 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1039 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_casestmt1055 = new BitSet(new long[]{0x0800003E00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_constant_in_casestmt1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_casestmt1059 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_casestmt1061 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_71_in_defaultstmt1070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_defaultstmt1072 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_defaultstmt1074 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred60535 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_synpred60537 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred60539 = new BitSet(new long[]{0x0260000100000000L});
    public static final BitSet FOLLOW_53_in_synpred60548 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_synpred60550 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_synpred60553 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred60554 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred60555 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_synpred60558 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred60561 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred60565 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred60567 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred60570 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_synpred60573 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred60575 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_synpred60581 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_synpred60586 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred60626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred115907 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_synpred115910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred115913 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_synpred115915 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_synpred115918 = new BitSet(new long[]{0x0000000000000002L});

}