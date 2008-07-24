// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-24 16:42:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "TYPE", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'using'", "'.'", "';'", "'partial'", "'class'", "'extends'", "'static'", "'final'", "'this'", "'('", "','", "')'", "'super'", "'void'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'true'", "'false'", "'public'", "'protected'", "'private'"
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
    public static final int CHAR=37;
    public static final int SLCOMMENT=45;
    public static final int PLEQUAL=16;
    public static final int FLOAT=35;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int TYPE=38;
    public static final int WORD=32;
    public static final int INC=30;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=34;
    public static final int PLUS=4;
    public static final int DIGIT=40;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=46;
    public static final int INTEGER=33;
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
    public static final int STRING=36;

        public sgclParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[155+1];
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
            	    pushFollow(FOLLOW_extension_in_doc273);
            	    extension();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_classdef_in_doc278);
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
            match(input,48,FOLLOW_48_in_extension289); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_extension291); if (failed) return ;
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
            	    match(input,49,FOLLOW_49_in_extension294); if (failed) return ;
            	    match(input,WORD,FOLLOW_WORD_in_extension296); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,50,FOLLOW_50_in_extension300); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' type )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:9: ( ( 'partial' )? 'class' WORD ( 'extends' type )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( 'partial' )? 'class' WORD ( 'extends' type )? BLKBEG ( clsext )* BLKEND
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
                    match(input,51,FOLLOW_51_in_classdef308); if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_classdef312); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_classdef314); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:37: ( 'extends' type )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:38: 'extends' type
                    {
                    match(input,53,FOLLOW_53_in_classdef317); if (failed) return ;
                    pushFollow(FOLLOW_type_in_classdef319);
                    type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef325); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:3: ( clsext )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=77 && LA5_0<=79)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef329);
            	    clsext();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef334); if (failed) return ;

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

            if ( ((LA6_0>=77 && LA6_0<=79)) ) {
                switch ( input.LA(2) ) {
                case 54:
                    {
                    switch ( input.LA(3) ) {
                    case 55:
                        {
                        alt6=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==57) ) {
                            alt6=2;
                        }
                        else if ( (LA6_3==WORD) ) {
                            int LA6_8 = input.LA(5);

                            if ( (LA6_8==57) ) {
                                alt6=2;
                            }
                            else if ( (LA6_8==EQUAL||LA6_8==50) ) {
                                alt6=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 8, input);

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
                    case 61:
                        {
                        alt6=2;
                        }
                        break;
                    case TYPE:
                        {
                        int LA6_5 = input.LA(4);

                        if ( (LA6_5==WORD) ) {
                            int LA6_8 = input.LA(5);

                            if ( (LA6_8==57) ) {
                                alt6=2;
                            }
                            else if ( (LA6_8==EQUAL||LA6_8==50) ) {
                                alt6=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 5, input);

                            throw nvae;
                        }
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
                case WORD:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==57) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==WORD) ) {
                        int LA6_8 = input.LA(4);

                        if ( (LA6_8==57) ) {
                            alt6=2;
                        }
                        else if ( (LA6_8==EQUAL||LA6_8==50) ) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 8, input);

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
                case 61:
                    {
                    alt6=2;
                    }
                    break;
                case TYPE:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==WORD) ) {
                        int LA6_8 = input.LA(4);

                        if ( (LA6_8==57) ) {
                            alt6=2;
                        }
                        else if ( (LA6_8==EQUAL||LA6_8==50) ) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("84:1: clsext : ( fieldas | funct | constructor );", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 55:
                    {
                    alt6=1;
                    }
                    break;
                case 56:
                    {
                    alt6=3;
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
                    pushFollow(FOLLOW_fieldas_in_clsext342);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext346);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext350);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas357);
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
                    match(input,54,FOLLOW_54_in_fieldas359); if (failed) return ;

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
                    match(input,55,FOLLOW_55_in_fieldas362); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas365);
            type();
            _fsp--;
            if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas367); if (failed) return ;
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
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas370); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas372);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,50,FOLLOW_50_in_fieldas376); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor384);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_constructor386); if (failed) return ;
            match(input,57,FOLLOW_57_in_constructor388); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:23: ( type WORD ( ',' type WORD )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==WORD||LA11_0==TYPE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor391);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor393); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:34: ( ',' type WORD )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==58) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:35: ',' type WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_constructor396); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_constructor398);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor400); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_constructor406); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor410); if (failed) return ;
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructor415);    throw mse;
                    }

                    match(input,57,FOLLOW_57_in_constructor421); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:25: ( value ( ',' value )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=WORD && LA13_0<=CHAR)||(LA13_0>=56 && LA13_0<=57)||LA13_0==60||LA13_0==62||(LA13_0>=75 && LA13_0<=76)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:26: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_constructor424);
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
                            	    match(input,58,FOLLOW_58_in_constructor427); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_constructor429);
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

                    match(input,59,FOLLOW_59_in_constructor435); if (failed) return ;
                    match(input,50,FOLLOW_50_in_constructor437); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:90:3: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WORD||LA15_0==TYPE||(LA15_0>=55 && LA15_0<=57)||LA15_0==60||(LA15_0>=63 && LA15_0<=66)||(LA15_0>=68 && LA15_0<=71)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor443);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor448); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:1: funct : privacy ( 'static' )? ( type | 'void' )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:7: ( privacy ( 'static' )? ( type | 'void' )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:9: privacy ( 'static' )? ( type | 'void' )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct455);
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
                    match(input,54,FOLLOW_54_in_funct457); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:27: ( type | 'void' )?
            int alt17=3;
            switch ( input.LA(1) ) {
                case WORD:
                    {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==WORD) ) {
                        alt17=1;
                    }
                    }
                    break;
                case 61:
                    {
                    alt17=2;
                    }
                    break;
                case TYPE:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:28: type
                    {
                    pushFollow(FOLLOW_type_in_funct461);
                    type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:33: 'void'
                    {
                    match(input,61,FOLLOW_61_in_funct463); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct467); if (failed) return ;
            match(input,57,FOLLOW_57_in_funct469); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:51: ( type WORD ( ',' type WORD )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==WORD||LA19_0==TYPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:52: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct472);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct474); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:62: ( ',' type WORD )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==58) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:63: ',' type WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_funct477); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_funct479);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct481); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_funct487); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct491); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:3: ( statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==WORD||LA20_0==TYPE||(LA20_0>=55 && LA20_0<=57)||LA20_0==60||(LA20_0>=63 && LA20_0<=66)||(LA20_0>=68 && LA20_0<=71)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct495);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct500); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TYPE||LA23_0==55) ) {
                alt23=1;
            }
            else if ( (LA23_0==WORD) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==EQUAL||(LA23_2>=PLEQUAL && LA23_2<=MOEQUAL)) ) {
                    alt23=2;
                }
                else if ( (LA23_2==WORD) ) {
                    alt23=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("96:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("96:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
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
                            match(input,55,FOLLOW_55_in_declare508); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare512);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare514); if (failed) return ;
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
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare517);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare531);
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
                    match(input,WORD,FOLLOW_WORD_in_declare539); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare541);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare555);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:7: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt35=2;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA35_1 = input.LA(2);

                if ( (synpred57()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA35_2 = input.LA(2);

                if ( (synpred57()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                alt35=1;
                }
                break;
            case WORD:
                {
                int LA35_4 = input.LA(2);

                if ( (synpred57()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 35, 4, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case STRING:
            case CHAR:
            case 62:
            case 75:
            case 76:
                {
                alt35=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("100:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' type ')' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==57) ) {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==WORD) ) {
                                int LA24_3 = input.LA(3);

                                if ( (LA24_3==59) ) {
                                    int LA24_5 = input.LA(4);

                                    if ( (LA24_5==WORD||(LA24_5>=56 && LA24_5<=57)||LA24_5==60) ) {
                                        alt24=1;
                                    }


                                }


                            }
                            else if ( (LA24_2==TYPE) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:10: '(' type ')'
                    	    {
                    	    match(input,57,FOLLOW_57_in_value565); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_value567);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,59,FOLLOW_59_in_value569); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=56 && LA26_0<=57)||LA26_0==60) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) )
                            int alt25=3;
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
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("101:5: ( 'this' | 'super' | ( '(' value ')' ) )", 25, 0, input);

                                throw nvae;
                            }

                            switch (alt25) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:6: 'this'
                                    {
                                    match(input,56,FOLLOW_56_in_value578); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:13: 'super'
                                    {
                                    match(input,60,FOLLOW_60_in_value580); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:22: '(' value ')'
                                    {
                                    match(input,57,FOLLOW_57_in_value583); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value584);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,59,FOLLOW_59_in_value585); if (failed) return ;

                                    }


                                    }
                                    break;

                            }

                            match(input,49,FOLLOW_49_in_value589); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:42: ( WORD '.' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==WORD) ) {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==49) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:43: WORD '.'
                    	    {
                    	    match(input,WORD,FOLLOW_WORD_in_value594); if (failed) return ;
                    	    match(input,49,FOLLOW_49_in_value596); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match(input,WORD,FOLLOW_WORD_in_value600); if (failed) return ;
                    match(input,57,FOLLOW_57_in_value602); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:63: ( value ( ',' value )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=WORD && LA29_0<=CHAR)||(LA29_0>=56 && LA29_0<=57)||LA29_0==60||LA29_0==62||(LA29_0>=75 && LA29_0<=76)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:64: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value605);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:70: ( ',' value )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==58) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:71: ',' value
                            	    {
                            	    match(input,58,FOLLOW_58_in_value608); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value610);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,59,FOLLOW_59_in_value616); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:3: ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=PLUS && LA30_0<=MOD)||(LA30_0>=EQUAL2 && LA30_0<=NEQUAL)||(LA30_0>=OR && LA30_0<=AND)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:4: ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=MOD)||(input.LA(1)>=EQUAL2 && input.LA(1)<=NEQUAL)||(input.LA(1)>=OR && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value621);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value649);
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: ( ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:7: ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:7: ( ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:8: ( 'this' | '(' value ')' | constant | WORD '.' )? ( WORD '.' )* ( constant | WORD ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:8: ( 'this' | '(' value ')' | constant | WORD '.' )?
                    int alt31=5;
                    switch ( input.LA(1) ) {
                        case 56:
                            {
                            alt31=1;
                            }
                            break;
                        case 57:
                            {
                            alt31=2;
                            }
                            break;
                        case INTEGER:
                            {
                            int LA31_3 = input.LA(2);

                            if ( ((LA31_3>=WORD && LA31_3<=CHAR)||LA31_3==62||(LA31_3>=75 && LA31_3<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case DOUBLE:
                            {
                            int LA31_4 = input.LA(2);

                            if ( ((LA31_4>=WORD && LA31_4<=CHAR)||LA31_4==62||(LA31_4>=75 && LA31_4<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case FLOAT:
                            {
                            int LA31_5 = input.LA(2);

                            if ( ((LA31_5>=WORD && LA31_5<=CHAR)||LA31_5==62||(LA31_5>=75 && LA31_5<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case STRING:
                            {
                            int LA31_6 = input.LA(2);

                            if ( ((LA31_6>=WORD && LA31_6<=CHAR)||LA31_6==62||(LA31_6>=75 && LA31_6<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case CHAR:
                            {
                            int LA31_7 = input.LA(2);

                            if ( ((LA31_7>=WORD && LA31_7<=CHAR)||LA31_7==62||(LA31_7>=75 && LA31_7<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case 75:
                        case 76:
                            {
                            int LA31_8 = input.LA(2);

                            if ( ((LA31_8>=WORD && LA31_8<=CHAR)||LA31_8==62||(LA31_8>=75 && LA31_8<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case 62:
                            {
                            int LA31_9 = input.LA(2);

                            if ( ((LA31_9>=WORD && LA31_9<=CHAR)||LA31_9==62||(LA31_9>=75 && LA31_9<=76)) ) {
                                alt31=3;
                            }
                            }
                            break;
                        case WORD:
                            {
                            int LA31_10 = input.LA(2);

                            if ( (LA31_10==49) ) {
                                int LA31_13 = input.LA(3);

                                if ( (synpred61()) ) {
                                    alt31=4;
                                }
                            }
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:9: 'this'
                            {
                            match(input,56,FOLLOW_56_in_value662); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:16: '(' value ')'
                            {
                            match(input,57,FOLLOW_57_in_value664); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value665);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,59,FOLLOW_59_in_value666); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value668);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:37: WORD '.'
                            {
                            match(input,WORD,FOLLOW_WORD_in_value670); if (failed) return ;
                            match(input,49,FOLLOW_49_in_value672); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:48: ( WORD '.' )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==WORD) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==49) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:50: WORD '.'
                    	    {
                    	    match(input,WORD,FOLLOW_WORD_in_value678); if (failed) return ;
                    	    match(input,49,FOLLOW_49_in_value680); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:61: ( constant | WORD )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=INTEGER && LA33_0<=CHAR)||LA33_0==62||(LA33_0>=75 && LA33_0<=76)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==WORD) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("103:61: ( constant | WORD )", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:62: constant
                            {
                            pushFollow(FOLLOW_constant_in_value685);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:71: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value687); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt34=4;
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
                            alt34=1;
                            }
                            break;
                        case INC:
                            {
                            alt34=2;
                            }
                            break;
                        case DEC:
                            {
                            alt34=3;
                            }
                            break;
                    }

                    switch (alt34) {
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
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value695);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value735);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value738); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value740); if (failed) return ;

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
            int alt36=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt36=1;
                }
                break;
            case DOUBLE:
                {
                alt36=2;
                }
                break;
            case FLOAT:
                {
                alt36=3;
                }
                break;
            case STRING:
                {
                alt36=4;
                }
                break;
            case CHAR:
                {
                alt36=5;
                }
                break;
            case 75:
            case 76:
                {
                alt36=6;
                }
                break;
            case 62:
                {
                alt36=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("105:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant753); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant757); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant761); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant765); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant769); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant773);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:57: 'null'
                    {
                    match(input,62,FOLLOW_62_in_constant777); if (failed) return ;

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
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=56 && LA38_0<=57)||LA38_0==60) ) {
                alt38=1;
            }
            else if ( (LA38_0==WORD) ) {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==49) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt37=4;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt37=1;
                        }
                        break;
                    case 60:
                        {
                        alt37=2;
                        }
                        break;
                    case 57:
                        {
                        alt37=3;
                        }
                        break;
                    case WORD:
                        {
                        alt37=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("107:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:13: 'this'
                            {
                            match(input,56,FOLLOW_56_in_fnccall786); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:20: 'super'
                            {
                            match(input,60,FOLLOW_60_in_fnccall788); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:29: '(' value ')'
                            {
                            match(input,57,FOLLOW_57_in_fnccall791); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall793);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,59,FOLLOW_59_in_fnccall795); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall798); if (failed) return ;

                            }
                            break;

                    }

                    match(input,49,FOLLOW_49_in_fnccall801); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall805); if (failed) return ;
            match(input,57,FOLLOW_57_in_fnccall807); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:65: ( value ( ',' value )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=WORD && LA40_0<=CHAR)||(LA40_0>=56 && LA40_0<=57)||LA40_0==60||LA40_0==62||(LA40_0>=75 && LA40_0<=76)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall810);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:72: ( ',' value )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==58) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:73: ',' value
                    	    {
                    	    match(input,58,FOLLOW_58_in_fnccall813); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall815);
                    	    value();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_fnccall821); if (failed) return ;

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
            int alt42=5;
            switch ( input.LA(1) ) {
            case WORD:
            case TYPE:
            case 55:
            case 56:
            case 57:
            case 60:
            case 63:
            case 64:
            case 65:
            case 69:
                {
                alt42=1;
                }
                break;
            case 66:
                {
                alt42=2;
                }
                break;
            case 68:
                {
                alt42=3;
                }
                break;
            case 70:
                {
                alt42=4;
                }
                break;
            case 71:
                {
                alt42=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("108:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt41=7;
                    switch ( input.LA(1) ) {
                    case TYPE:
                    case 55:
                        {
                        alt41=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case 49:
                            {
                            int LA41_9 = input.LA(3);

                            if ( (LA41_9==WORD) ) {
                                int LA41_11 = input.LA(4);

                                if ( (LA41_11==57) ) {
                                    alt41=5;
                                }
                                else if ( ((LA41_11>=INC && LA41_11<=DEC)) ) {
                                    alt41=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 9, input);

                                throw nvae;
                            }
                            }
                            break;
                        case INC:
                        case DEC:
                            {
                            alt41=3;
                            }
                            break;
                        case 57:
                            {
                            alt41=5;
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
                            alt41=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 65:
                        {
                        alt41=2;
                        }
                        break;
                    case 56:
                        {
                        int LA41_4 = input.LA(2);

                        if ( (LA41_4==49) ) {
                            int LA41_9 = input.LA(3);

                            if ( (LA41_9==WORD) ) {
                                int LA41_11 = input.LA(4);

                                if ( (LA41_11==57) ) {
                                    alt41=5;
                                }
                                else if ( ((LA41_11>=INC && LA41_11<=DEC)) ) {
                                    alt41=3;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 9, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 69:
                        {
                        alt41=4;
                        }
                        break;
                    case 57:
                    case 60:
                        {
                        alt41=5;
                        }
                        break;
                    case 63:
                        {
                        alt41=6;
                        }
                        break;
                    case 64:
                        {
                        alt41=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("109:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 41, 0, input);

                        throw nvae;
                    }

                    switch (alt41) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement831);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement835);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement839);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement843);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement847);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:60: 'continue'
                            {
                            match(input,63,FOLLOW_63_in_statement851); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:73: 'break'
                            {
                            match(input,64,FOLLOW_64_in_statement855); if (failed) return ;

                            }
                            break;

                    }

                    match(input,50,FOLLOW_50_in_statement858); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement864);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement868);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement872);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement876);
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
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==WORD) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==49) ) {
                    alt43=1;
                }
            }
            else if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt883);    throw mse;
                    }

                    match(input,49,FOLLOW_49_in_incrstmt889); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt893); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt895);    throw mse;
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
            match(input,65,FOLLOW_65_in_returnstmt907); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt909);
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
            match(input,66,FOLLOW_66_in_ifstmt916); if (failed) return ;
            match(input,57,FOLLOW_57_in_ifstmt918); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt920);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_ifstmt922); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==TYPE||(LA45_0>=55 && LA45_0<=57)||LA45_0==60||(LA45_0>=63 && LA45_0<=66)||(LA45_0>=68 && LA45_0<=71)) ) {
                alt45=1;
            }
            else if ( (LA45_0==BLKBEG) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("114:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt925);
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
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt928); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:48: ( statement )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==WORD||LA44_0==TYPE||(LA44_0>=55 && LA44_0<=57)||LA44_0==60||(LA44_0>=63 && LA44_0<=66)||(LA44_0>=68 && LA44_0<=71)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt930);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt933); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==67) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred114()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,67,FOLLOW_67_in_ifstmt940); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==WORD||LA47_0==TYPE||(LA47_0>=55 && LA47_0<=57)||LA47_0==60||(LA47_0>=63 && LA47_0<=66)||(LA47_0>=68 && LA47_0<=71)) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==BLKBEG) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt943);
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
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt946); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:30: ( statement )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==WORD||LA46_0==TYPE||(LA46_0>=55 && LA46_0<=57)||LA46_0==60||(LA46_0>=63 && LA46_0<=66)||(LA46_0>=68 && LA46_0<=71)) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt948);
                            	    statement();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt951); if (failed) return ;

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
            match(input,68,FOLLOW_68_in_whilestmt963); if (failed) return ;
            match(input,57,FOLLOW_57_in_whilestmt965); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt967);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_whilestmt969); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==WORD||LA50_0==TYPE||(LA50_0>=55 && LA50_0<=57)||LA50_0==60||(LA50_0>=63 && LA50_0<=66)||(LA50_0>=68 && LA50_0<=71)) ) {
                alt50=1;
            }
            else if ( (LA50_0==BLKBEG) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("117:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt972);
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
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt975); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:45: ( statement )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==WORD||LA49_0==TYPE||(LA49_0>=55 && LA49_0<=57)||LA49_0==60||(LA49_0>=63 && LA49_0<=66)||(LA49_0>=68 && LA49_0<=71)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt977);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt980); if (failed) return ;

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
            match(input,69,FOLLOW_69_in_dowhile989); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WORD||LA52_0==TYPE||(LA52_0>=55 && LA52_0<=57)||LA52_0==60||(LA52_0>=63 && LA52_0<=66)||(LA52_0>=68 && LA52_0<=71)) ) {
                alt52=1;
            }
            else if ( (LA52_0==BLKBEG) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("118:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile992);
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
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile995); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:35: ( statement )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==WORD||LA51_0==TYPE||(LA51_0>=55 && LA51_0<=57)||LA51_0==60||(LA51_0>=63 && LA51_0<=66)||(LA51_0>=68 && LA51_0<=71)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile997);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile1000); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,68,FOLLOW_68_in_dowhile1004); if (failed) return ;
            match(input,57,FOLLOW_57_in_dowhile1006); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile1008);
            value();
            _fsp--;
            if (failed) return ;
            match(input,59,FOLLOW_59_in_dowhile1010); if (failed) return ;

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
            match(input,70,FOLLOW_70_in_forstmt1017); if (failed) return ;
            match(input,57,FOLLOW_57_in_forstmt1019); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:21: ( declare )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==WORD||LA53_0==TYPE||LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1021);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,50,FOLLOW_50_in_forstmt1024); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt1026);
            value();
            _fsp--;
            if (failed) return ;
            match(input,50,FOLLOW_50_in_forstmt1028); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:44: ( declare | incrstmt )?
            int alt54=3;
            switch ( input.LA(1) ) {
                case TYPE:
                case 55:
                    {
                    alt54=1;
                    }
                    break;
                case WORD:
                    {
                    int LA54_2 = input.LA(2);

                    if ( (LA54_2==EQUAL||(LA54_2>=PLEQUAL && LA54_2<=MOEQUAL)||LA54_2==WORD) ) {
                        alt54=1;
                    }
                    else if ( ((LA54_2>=INC && LA54_2<=DEC)||LA54_2==49) ) {
                        alt54=2;
                    }
                    }
                    break;
                case 56:
                    {
                    alt54=2;
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1031);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt1033);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,59,FOLLOW_59_in_forstmt1037); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==WORD||LA56_0==TYPE||(LA56_0>=55 && LA56_0<=57)||LA56_0==60||(LA56_0>=63 && LA56_0<=66)||(LA56_0>=68 && LA56_0<=71)) ) {
                alt56=1;
            }
            else if ( (LA56_0==BLKBEG) ) {
                alt56=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("119:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt1040);
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
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt1043); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:87: ( statement )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==WORD||LA55_0==TYPE||(LA55_0>=55 && LA55_0<=57)||LA55_0==60||(LA55_0>=63 && LA55_0<=66)||(LA55_0>=68 && LA55_0<=71)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt1045);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt1048); if (failed) return ;

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
            match(input,71,FOLLOW_71_in_switchstmt1058); if (failed) return ;
            match(input,57,FOLLOW_57_in_switchstmt1060); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt1062); if (failed) return ;
            match(input,59,FOLLOW_59_in_switchstmt1064); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1068); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:123:3: ( casestmt )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==72) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1072);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:124:3: ( defaultstmt )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==74) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1077);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1082); if (failed) return ;

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
            match(input,72,FOLLOW_72_in_casestmt1088); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1090);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,73,FOLLOW_73_in_casestmt1092); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:31: ( statement )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==WORD||LA59_0==TYPE||(LA59_0>=55 && LA59_0<=57)||LA59_0==60||(LA59_0>=63 && LA59_0<=66)||(LA59_0>=68 && LA59_0<=71)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1094);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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
            match(input,74,FOLLOW_74_in_defaultstmt1103); if (failed) return ;
            match(input,73,FOLLOW_73_in_defaultstmt1105); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:18: ( statement )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==WORD||LA60_0==TYPE||(LA60_0>=55 && LA60_0<=57)||LA60_0==60||(LA60_0>=63 && LA60_0<=66)||(LA60_0>=68 && LA60_0<=71)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1107);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:132:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:132:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=75 && input.LA(1)<=76) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:134:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:134:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=77 && input.LA(1)<=79) ) {
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


    // $ANTLR start type
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:136:1: type : ( TYPE | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:136:6: ( TYPE | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||input.LA(1)==TYPE ) {
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

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:9: ( '(' type ')' )*
        loop70:
        do {
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==57) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==WORD) ) {
                    int LA70_3 = input.LA(3);

                    if ( (LA70_3==59) ) {
                        int LA70_5 = input.LA(4);

                        if ( (LA70_5==WORD||(LA70_5>=56 && LA70_5<=57)||LA70_5==60) ) {
                            alt70=1;
                        }


                    }


                }
                else if ( (LA70_2==TYPE) ) {
                    alt70=1;
                }


            }


            switch (alt70) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:100:10: '(' type ')'
        	    {
        	    match(input,57,FOLLOW_57_in_synpred57565); if (failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred57567);
        	    type();
        	    _fsp--;
        	    if (failed) return ;
        	    match(input,59,FOLLOW_59_in_synpred57569); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop70;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )? ( WORD '.' )* WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:4: ( ( 'this' | 'super' | ( '(' value ')' ) ) '.' )?
        int alt72=2;
        int LA72_0 = input.LA(1);

        if ( ((LA72_0>=56 && LA72_0<=57)||LA72_0==60) ) {
            alt72=1;
        }
        switch (alt72) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:5: ( 'this' | 'super' | ( '(' value ')' ) )
                int alt71=3;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    alt71=1;
                    }
                    break;
                case 60:
                    {
                    alt71=2;
                    }
                    break;
                case 57:
                    {
                    alt71=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("101:5: ( 'this' | 'super' | ( '(' value ')' ) )", 71, 0, input);

                    throw nvae;
                }

                switch (alt71) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:6: 'this'
                        {
                        match(input,56,FOLLOW_56_in_synpred57578); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:13: 'super'
                        {
                        match(input,60,FOLLOW_60_in_synpred57580); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:22: '(' value ')'
                        {
                        match(input,57,FOLLOW_57_in_synpred57583); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred57584);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,59,FOLLOW_59_in_synpred57585); if (failed) return ;

                        }


                        }
                        break;

                }

                match(input,49,FOLLOW_49_in_synpred57589); if (failed) return ;

                }
                break;

        }

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:42: ( WORD '.' )*
        loop73:
        do {
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==WORD) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==49) ) {
                    alt73=1;
                }


            }


            switch (alt73) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:43: WORD '.'
        	    {
        	    match(input,WORD,FOLLOW_WORD_in_synpred57594); if (failed) return ;
        	    match(input,49,FOLLOW_49_in_synpred57596); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop73;
            }
        } while (true);

        match(input,WORD,FOLLOW_WORD_in_synpred57600); if (failed) return ;
        match(input,57,FOLLOW_57_in_synpred57602); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:63: ( value ( ',' value )* )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( ((LA75_0>=WORD && LA75_0<=CHAR)||(LA75_0>=56 && LA75_0<=57)||LA75_0==60||LA75_0==62||(LA75_0>=75 && LA75_0<=76)) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:64: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred57605);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:70: ( ',' value )*
                loop74:
                do {
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==58) ) {
                        alt74=1;
                    }


                    switch (alt74) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:71: ',' value
                	    {
                	    match(input,58,FOLLOW_58_in_synpred57608); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred57610);
                	    value();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop74;
                    }
                } while (true);


                }
                break;

        }

        match(input,59,FOLLOW_59_in_synpred57616); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:3: ( ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( ((LA76_0>=PLUS && LA76_0<=MOD)||(LA76_0>=EQUAL2 && LA76_0<=NEQUAL)||(LA76_0>=OR && LA76_0<=AND)) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:4: ( EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=MOD)||(input.LA(1)>=EQUAL2 && input.LA(1)<=NEQUAL)||(input.LA(1)>=OR && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred57621);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred57649);
                value();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:37: ( WORD '.' )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:37: WORD '.'
        {
        match(input,WORD,FOLLOW_WORD_in_synpred61670); if (failed) return ;
        match(input,49,FOLLOW_49_in_synpred61672); if (failed) return ;

        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred114
    public final void synpred114_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,67,FOLLOW_67_in_synpred114940); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==WORD||LA81_0==TYPE||(LA81_0>=55 && LA81_0<=57)||LA81_0==60||(LA81_0>=63 && LA81_0<=66)||(LA81_0>=68 && LA81_0<=71)) ) {
            alt81=1;
        }
        else if ( (LA81_0==BLKBEG) ) {
            alt81=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("115:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 81, 0, input);

            throw nvae;
        }
        switch (alt81) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred114943);
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
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred114946); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:30: ( statement )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==WORD||LA80_0==TYPE||(LA80_0>=55 && LA80_0<=57)||LA80_0==60||(LA80_0>=63 && LA80_0<=66)||(LA80_0>=68 && LA80_0<=71)) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred114948);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop80;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred114951); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred114

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
    public final boolean synpred114() {
        backtracking++;
        int start = input.mark();
        try {
            synpred114_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_extension_in_doc273 = new BitSet(new long[]{0x0019000000000000L});
    public static final BitSet FOLLOW_classdef_in_doc278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_extension289 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension291 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_extension294 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension296 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_extension300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_classdef308 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_classdef312 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef314 = new BitSet(new long[]{0x0020000000800000L});
    public static final BitSet FOLLOW_53_in_classdef317 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_classdef319 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef325 = new BitSet(new long[]{0x0000000001000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_clsext_in_classdef329 = new BitSet(new long[]{0x0000000001000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas357 = new BitSet(new long[]{0x00C0004100000000L});
    public static final BitSet FOLLOW_54_in_fieldas359 = new BitSet(new long[]{0x0080004100000000L});
    public static final BitSet FOLLOW_55_in_fieldas362 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_fieldas365 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas367 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas370 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fieldas372 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fieldas376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor384 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_constructor386 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constructor388 = new BitSet(new long[]{0x0800004100000000L});
    public static final BitSet FOLLOW_type_in_constructor391 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor393 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_constructor396 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_constructor398 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor400 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_constructor406 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor410 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_set_in_constructor415 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constructor421 = new BitSet(new long[]{0x5B00003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_constructor424 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_constructor427 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_constructor429 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_constructor435 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constructor437 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_constructor443 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_constructor448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct455 = new BitSet(new long[]{0x2040004100000000L});
    public static final BitSet FOLLOW_54_in_funct457 = new BitSet(new long[]{0x2000004100000000L});
    public static final BitSet FOLLOW_type_in_funct461 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_61_in_funct463 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct467 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_funct469 = new BitSet(new long[]{0x0800004100000000L});
    public static final BitSet FOLLOW_type_in_funct472 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct474 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_funct477 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_funct479 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct481 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_funct487 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct491 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_funct495 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_funct500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_declare508 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_declare512 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare514 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare517 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_declare531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare539 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare541 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_declare555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_value565 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_value567 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value569 = new BitSet(new long[]{0x1300000100000000L});
    public static final BitSet FOLLOW_56_in_value578 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_value580 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_value583 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value584 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value585 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_value589 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value594 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_value596 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value600 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_value602 = new BitSet(new long[]{0x5B00003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value605 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_value608 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value610 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_value616 = new BitSet(new long[]{0x000000000060FDF2L});
    public static final BitSet FOLLOW_set_in_value621 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_value662 = new BitSet(new long[]{0x4000003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_57_in_value664 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value665 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value666 = new BitSet(new long[]{0x4000003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_constant_in_value668 = new BitSet(new long[]{0x4000003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_WORD_in_value670 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_value672 = new BitSet(new long[]{0x4000003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_WORD_in_value678 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_value680 = new BitSet(new long[]{0x4000003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_constant_in_value685 = new BitSet(new long[]{0x00000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value687 = new BitSet(new long[]{0x00000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value695 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_constant777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_fnccall786 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_fnccall788 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall791 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall793 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall795 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall798 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fnccall801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall805 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall807 = new BitSet(new long[]{0x5B00003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall810 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_fnccall813 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall815 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement831 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement835 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement839 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement843 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement847 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_63_in_statement851 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_64_in_statement855 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_statement858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt883 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_incrstmt889 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt893 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_returnstmt907 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_returnstmt909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifstmt916 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifstmt918 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_ifstmt920 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifstmt922 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt928 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt930 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifstmt940 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt946 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt948 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_whilestmt963 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_whilestmt965 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_whilestmt967 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whilestmt969 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_whilestmt972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt975 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_whilestmt977 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_dowhile989 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_dowhile992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile995 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_dowhile997 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_dowhile1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dowhile1004 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_dowhile1006 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_dowhile1008 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_dowhile1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_forstmt1017 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_forstmt1019 = new BitSet(new long[]{0x0084004100000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1021 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forstmt1024 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_forstmt1026 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forstmt1028 = new BitSet(new long[]{0x0980004100000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1031 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt1033 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_forstmt1037 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_forstmt1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt1043 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_forstmt1045 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_forstmt1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_switchstmt1058 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_switchstmt1060 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt1062 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_switchstmt1064 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1068 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1072 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1077 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_casestmt1088 = new BitSet(new long[]{0x4000003E00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_constant_in_casestmt1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_casestmt1092 = new BitSet(new long[]{0x9380004100000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_casestmt1094 = new BitSet(new long[]{0x9380004100000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_74_in_defaultstmt1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_defaultstmt1105 = new BitSet(new long[]{0x9380004100000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_defaultstmt1107 = new BitSet(new long[]{0x9380004100000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred57565 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_type_in_synpred57567 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred57569 = new BitSet(new long[]{0x1300000100000000L});
    public static final BitSet FOLLOW_56_in_synpred57578 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_60_in_synpred57580 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57_in_synpred57583 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred57584 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred57585 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred57589 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred57594 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred57596 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred57600 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred57602 = new BitSet(new long[]{0x5B00003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred57605 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_58_in_synpred57608 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred57610 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_synpred57616 = new BitSet(new long[]{0x000000000060FDF2L});
    public static final BitSet FOLLOW_set_in_synpred57621 = new BitSet(new long[]{0x5300003F00000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred57649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred61670 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred61672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred114940 = new BitSet(new long[]{0x9380004100800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_synpred114943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred114946 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_synpred114948 = new BitSet(new long[]{0x9380004101000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_synpred114951 = new BitSet(new long[]{0x0000000000000002L});

}