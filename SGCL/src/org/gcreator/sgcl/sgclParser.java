// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 21:06:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "CLSNAME", "TYPE", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'using'", "'.'", "';'", "'partial'", "'class'", "'extends'", "','", "'static'", "'final'", "'this'", "'('", "')'", "'super'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'true'", "'false'", "'public'", "'protected'", "'private'"
    };
    public static final int DEC=31;
    public static final int LT=14;
    public static final int MOEQUAL=20;
    public static final int DCOMMENT=48;
    public static final int MOD=8;
    public static final int BLKEND=24;
    public static final int DCMTB=28;
    public static final int STRCONTENT=42;
    public static final int GTE=11;
    public static final int DCMTE=29;
    public static final int CHAR=39;
    public static final int SLCOMMENT=46;
    public static final int PLEQUAL=16;
    public static final int FLOAT=37;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int TYPE=34;
    public static final int WORD=32;
    public static final int INC=30;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=36;
    public static final int PLUS=4;
    public static final int DIGIT=41;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=47;
    public static final int INTEGER=35;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=43;
    public static final int CLSNAME=33;
    public static final int WHITESPACE=44;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int LINE=45;
    public static final int ALPHA=40;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int OR=21;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int STRING=38;

        public sgclParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[157+1];
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

                if ( (LA1_0==49) ) {
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
            match(input,49,FOLLOW_49_in_extension289); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_extension291); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:17: ( '.' WORD )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==50) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:18: '.' WORD
            	    {
            	    match(input,50,FOLLOW_50_in_extension294); if (failed) return ;
            	    match(input,WORD,FOLLOW_WORD_in_extension296); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,51,FOLLOW_51_in_extension300); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: classdef : ( 'partial' )? 'class' CLSNAME ( 'extends' TYPE ( ',' TYPE )* )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:9: ( ( 'partial' )? 'class' CLSNAME ( 'extends' TYPE ( ',' TYPE )* )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( 'partial' )? 'class' CLSNAME ( 'extends' TYPE ( ',' TYPE )* )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( 'partial' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:12: 'partial'
                    {
                    match(input,52,FOLLOW_52_in_classdef308); if (failed) return ;

                    }
                    break;

            }

            match(input,53,FOLLOW_53_in_classdef312); if (failed) return ;
            match(input,CLSNAME,FOLLOW_CLSNAME_in_classdef314); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:40: ( 'extends' TYPE ( ',' TYPE )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:41: 'extends' TYPE ( ',' TYPE )*
                    {
                    match(input,54,FOLLOW_54_in_classdef317); if (failed) return ;
                    match(input,TYPE,FOLLOW_TYPE_in_classdef319); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:56: ( ',' TYPE )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==55) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:57: ',' TYPE
                    	    {
                    	    match(input,55,FOLLOW_55_in_classdef322); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_classdef324); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef332); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:3: ( clsext )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=77 && LA6_0<=79)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef336);
            	    clsext();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef341); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:8: ( fieldas | funct | constructor )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=77 && LA7_0<=79)) ) {
                switch ( input.LA(2) ) {
                case 58:
                    {
                    alt7=3;
                    }
                    break;
                case 56:
                    {
                    switch ( input.LA(3) ) {
                    case 57:
                        {
                        alt7=1;
                        }
                        break;
                    case TYPE:
                        {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==WORD) ) {
                            int LA7_7 = input.LA(5);

                            if ( (LA7_7==59) ) {
                                alt7=2;
                            }
                            else if ( (LA7_7==EQUAL||LA7_7==51) ) {
                                alt7=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case TYPE:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==WORD) ) {
                        int LA7_7 = input.LA(4);

                        if ( (LA7_7==59) ) {
                            alt7=2;
                        }
                        else if ( (LA7_7==EQUAL||LA7_7==51) ) {
                            alt7=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                    {
                    alt7=2;
                    }
                    break;
                case 57:
                    {
                    alt7=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("86:1: clsext : ( fieldas | funct | constructor );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext366);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext370);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext374);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:1: fieldas : privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:9: ( privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:11: privacy ( 'static' )? ( 'final' )? TYPE WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas381);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:19: ( 'static' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==56) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,56,FOLLOW_56_in_fieldas383); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:29: ( 'final' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==57) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'final'
                    {
                    match(input,57,FOLLOW_57_in_fieldas386); if (failed) return ;

                    }
                    break;

            }

            match(input,TYPE,FOLLOW_TYPE_in_fieldas389); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas391); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:48: ( EQUAL value )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQUAL) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas394); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas396);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_fieldas400); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:1: constructor : privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:2: ( privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:4: privacy 'this' '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )? ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor408);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,58,FOLLOW_58_in_constructor410); if (failed) return ;
            match(input,59,FOLLOW_59_in_constructor412); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:23: ( TYPE WORD ( ',' TYPE WORD )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==TYPE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:24: TYPE WORD ( ',' TYPE WORD )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_constructor415); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor417); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:34: ( ',' TYPE WORD )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==55) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:35: ',' TYPE WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_constructor420); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_constructor422); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor424); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,60,FOLLOW_60_in_constructor430); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor434); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:3: ( ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==58) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==59) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==61) ) {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==59) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:4: ( 'super' | 'this' ) '(' ( value ( ',' value )* )? ')' ';'
                    {
                    if ( input.LA(1)==58||input.LA(1)==61 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructor439);    throw mse;
                    }

                    match(input,59,FOLLOW_59_in_constructor445); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:25: ( value ( ',' value )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==WORD||(LA14_0>=INTEGER && LA14_0<=CHAR)||(LA14_0>=58 && LA14_0<=59)||(LA14_0>=61 && LA14_0<=62)||(LA14_0>=75 && LA14_0<=76)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:26: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_constructor448);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:32: ( ',' value )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==55) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:33: ',' value
                            	    {
                            	    match(input,55,FOLLOW_55_in_constructor451); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_constructor453);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,60,FOLLOW_60_in_constructor459); if (failed) return ;
                    match(input,51,FOLLOW_51_in_constructor461); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:3: ( statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==WORD||LA16_0==TYPE||(LA16_0>=57 && LA16_0<=59)||LA16_0==61||(LA16_0>=63 && LA16_0<=66)||(LA16_0>=68 && LA16_0<=71)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor467);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor472); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:1: funct : privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:7: ( privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:9: privacy ( 'static' )? ( TYPE )? WORD '(' ( TYPE WORD ( ',' TYPE WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct479);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:17: ( 'static' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,56,FOLLOW_56_in_funct481); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:27: ( TYPE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==TYPE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_funct484); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct487); if (failed) return ;
            match(input,59,FOLLOW_59_in_funct489); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:42: ( TYPE WORD ( ',' TYPE WORD )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TYPE) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:43: TYPE WORD ( ',' TYPE WORD )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_funct492); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct494); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:53: ( ',' TYPE WORD )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==55) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:54: ',' TYPE WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_funct497); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_funct499); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct501); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,60,FOLLOW_60_in_funct507); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct511); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:3: ( statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==WORD||LA21_0==TYPE||(LA21_0>=57 && LA21_0<=59)||LA21_0==61||(LA21_0>=63 && LA21_0<=66)||(LA21_0>=68 && LA21_0<=71)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct515);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct520); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:1: declare : ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:9: ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==TYPE||LA24_0==57) ) {
                alt24=1;
            }
            else if ( (LA24_0==WORD) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("98:1: declare : ( ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:11: ( 'final' )? TYPE WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:11: ( 'final' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==57) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:12: 'final'
                            {
                            match(input,57,FOLLOW_57_in_declare528); if (failed) return ;

                            }
                            break;

                    }

                    match(input,TYPE,FOLLOW_TYPE_in_declare532); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare534); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==EQUAL||(LA23_0>=PLEQUAL && LA23_0<=MOEQUAL)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare537);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare551);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare559); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare561);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare575);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:7: ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt34=2;
            switch ( input.LA(1) ) {
            case 59:
                {
                int LA34_1 = input.LA(2);

                if ( (synpred63()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("102:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 34, 1, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred63()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("102:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt34=1;
                }
                break;
            case WORD:
                {
                int LA34_4 = input.LA(2);

                if ( (synpred63()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("102:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 34, 4, input);

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
                alt34=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("102:1: value : ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( '(' TYPE ')' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==59) ) {
                            int LA25_2 = input.LA(2);

                            if ( (LA25_2==TYPE) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:10: '(' TYPE ')'
                    	    {
                    	    match(input,59,FOLLOW_59_in_value585); if (failed) return ;
                    	    match(input,TYPE,FOLLOW_TYPE_in_value587); if (failed) return ;
                    	    match(input,60,FOLLOW_60_in_value589); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=58 && LA27_0<=59)||LA27_0==61) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==WORD) ) {
                        int LA27_2 = input.LA(2);

                        if ( (LA27_2==50) ) {
                            alt27=1;
                        }
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                            int alt26=4;
                            switch ( input.LA(1) ) {
                            case 58:
                                {
                                alt26=1;
                                }
                                break;
                            case 61:
                                {
                                alt26=2;
                                }
                                break;
                            case 59:
                                {
                                alt26=3;
                                }
                                break;
                            case WORD:
                                {
                                alt26=4;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 26, 0, input);

                                throw nvae;
                            }

                            switch (alt26) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: 'this'
                                    {
                                    match(input,58,FOLLOW_58_in_value598); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:13: 'super'
                                    {
                                    match(input,61,FOLLOW_61_in_value600); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:22: '(' value ')'
                                    {
                                    match(input,59,FOLLOW_59_in_value603); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value604);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,60,FOLLOW_60_in_value605); if (failed) return ;

                                    }


                                    }
                                    break;
                                case 4 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:35: WORD
                                    {
                                    match(input,WORD,FOLLOW_WORD_in_value608); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,50,FOLLOW_50_in_value611); if (failed) return ;

                            }
                            break;

                    }

                    match(input,WORD,FOLLOW_WORD_in_value615); if (failed) return ;
                    match(input,59,FOLLOW_59_in_value617); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:56: ( value ( ',' value )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==WORD||(LA29_0>=INTEGER && LA29_0<=CHAR)||(LA29_0>=58 && LA29_0<=59)||(LA29_0>=61 && LA29_0<=62)||(LA29_0>=75 && LA29_0<=76)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:57: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value620);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:63: ( ',' value )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==55) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:64: ',' value
                            	    {
                            	    match(input,55,FOLLOW_55_in_value623); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value625);
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

                    match(input,60,FOLLOW_60_in_value631); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=PLUS && LA30_0<=AND)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value636);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value676);
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:8: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:8: ( 'this' | '(' value ')' | constant | WORD )
                    int alt31=4;
                    switch ( input.LA(1) ) {
                    case 58:
                        {
                        alt31=1;
                        }
                        break;
                    case 59:
                        {
                        alt31=2;
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
                        alt31=3;
                        }
                        break;
                    case WORD:
                        {
                        alt31=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("105:8: ( 'this' | '(' value ')' | constant | WORD )", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:9: 'this'
                            {
                            match(input,58,FOLLOW_58_in_value689); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:16: '(' value ')'
                            {
                            match(input,59,FOLLOW_59_in_value691); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value692);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,60,FOLLOW_60_in_value693); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value695);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:37: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value697); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:43: ( '.' WORD )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==50) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:44: '.' WORD
                    	    {
                    	    match(input,50,FOLLOW_50_in_value701); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_value703); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt33=4;
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
                            alt33=1;
                            }
                            break;
                        case INC:
                            {
                            alt33=2;
                            }
                            break;
                        case DEC:
                            {
                            alt33=3;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value712);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value752);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value755); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:106:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value757); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:107:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt35=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt35=1;
                }
                break;
            case DOUBLE:
                {
                alt35=2;
                }
                break;
            case FLOAT:
                {
                alt35=3;
                }
                break;
            case STRING:
                {
                alt35=4;
                }
                break;
            case CHAR:
                {
                alt35=5;
                }
                break;
            case 75:
            case 76:
                {
                alt35=6;
                }
                break;
            case 62:
                {
                alt35=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("107:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant770); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant774); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant778); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant782); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant786); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant790);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:108:57: 'null'
                    {
                    match(input,62,FOLLOW_62_in_constant794); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:1: fnccall : ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ;
    public final void fnccall() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:9: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=58 && LA37_0<=59)||LA37_0==61) ) {
                alt37=1;
            }
            else if ( (LA37_0==WORD) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==50) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt36=4;
                    switch ( input.LA(1) ) {
                    case 58:
                        {
                        alt36=1;
                        }
                        break;
                    case 61:
                        {
                        alt36=2;
                        }
                        break;
                    case 59:
                        {
                        alt36=3;
                        }
                        break;
                    case WORD:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("109:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:13: 'this'
                            {
                            match(input,58,FOLLOW_58_in_fnccall803); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:20: 'super'
                            {
                            match(input,61,FOLLOW_61_in_fnccall805); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:29: '(' value ')'
                            {
                            match(input,59,FOLLOW_59_in_fnccall808); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall810);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,60,FOLLOW_60_in_fnccall812); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall815); if (failed) return ;

                            }
                            break;

                    }

                    match(input,50,FOLLOW_50_in_fnccall818); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall822); if (failed) return ;
            match(input,59,FOLLOW_59_in_fnccall824); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:65: ( value ( ',' value )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==WORD||(LA39_0>=INTEGER && LA39_0<=CHAR)||(LA39_0>=58 && LA39_0<=59)||(LA39_0>=61 && LA39_0<=62)||(LA39_0>=75 && LA39_0<=76)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall827);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:72: ( ',' value )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==55) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:109:73: ',' value
                    	    {
                    	    match(input,55,FOLLOW_55_in_fnccall830); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall832);
                    	    value();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,60,FOLLOW_60_in_fnccall838); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:110:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:2: ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt41=5;
            switch ( input.LA(1) ) {
            case WORD:
            case TYPE:
            case 57:
            case 58:
            case 59:
            case 61:
            case 63:
            case 64:
            case 65:
            case 69:
                {
                alt41=1;
                }
                break;
            case 66:
                {
                alt41=2;
                }
                break;
            case 68:
                {
                alt41=3;
                }
                break;
            case 70:
                {
                alt41=4;
                }
                break;
            case 71:
                {
                alt41=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("110:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt40=7;
                    switch ( input.LA(1) ) {
                    case TYPE:
                    case 57:
                        {
                        alt40=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case 59:
                            {
                            alt40=5;
                            }
                            break;
                        case 50:
                            {
                            int LA40_9 = input.LA(3);

                            if ( (LA40_9==WORD) ) {
                                int LA40_11 = input.LA(4);

                                if ( ((LA40_11>=INC && LA40_11<=DEC)) ) {
                                    alt40=3;
                                }
                                else if ( (LA40_11==59) ) {
                                    alt40=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 9, input);

                                throw nvae;
                            }
                            }
                            break;
                        case INC:
                        case DEC:
                            {
                            alt40=3;
                            }
                            break;
                        case EQUAL:
                        case PLEQUAL:
                        case MIEQUAL:
                        case MUEQUAL:
                        case DIEQUAL:
                        case MOEQUAL:
                            {
                            alt40=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 65:
                        {
                        alt40=2;
                        }
                        break;
                    case 58:
                        {
                        int LA40_4 = input.LA(2);

                        if ( (LA40_4==50) ) {
                            int LA40_9 = input.LA(3);

                            if ( (LA40_9==WORD) ) {
                                int LA40_11 = input.LA(4);

                                if ( ((LA40_11>=INC && LA40_11<=DEC)) ) {
                                    alt40=3;
                                }
                                else if ( (LA40_11==59) ) {
                                    alt40=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 9, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 69:
                        {
                        alt40=4;
                        }
                        break;
                    case 59:
                    case 61:
                        {
                        alt40=5;
                        }
                        break;
                    case 63:
                        {
                        alt40=6;
                        }
                        break;
                    case 64:
                        {
                        alt40=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("111:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 40, 0, input);

                        throw nvae;
                    }

                    switch (alt40) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement848);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement852);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement856);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement860);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement864);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:60: 'continue'
                            {
                            match(input,63,FOLLOW_63_in_statement868); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:111:73: 'break'
                            {
                            match(input,64,FOLLOW_64_in_statement872); if (failed) return ;

                            }
                            break;

                    }

                    match(input,51,FOLLOW_51_in_statement875); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement881);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement885);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement889);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:112:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement893);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:11: ( ( 'this' | WORD ) '.' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==WORD) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==50) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==58) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:113:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==58 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt900);    throw mse;
                    }

                    match(input,50,FOLLOW_50_in_incrstmt906); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt910); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt912);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:114:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:115:4: 'return' value
            {
            match(input,65,FOLLOW_65_in_returnstmt924); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt926);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,66,FOLLOW_66_in_ifstmt933); if (failed) return ;
            match(input,59,FOLLOW_59_in_ifstmt935); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt937);
            value();
            _fsp--;
            if (failed) return ;
            match(input,60,FOLLOW_60_in_ifstmt939); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==WORD||LA44_0==TYPE||(LA44_0>=57 && LA44_0<=59)||LA44_0==61||(LA44_0>=63 && LA44_0<=66)||(LA44_0>=68 && LA44_0<=71)) ) {
                alt44=1;
            }
            else if ( (LA44_0==BLKBEG) ) {
                alt44=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("116:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt942);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt945); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:116:48: ( statement )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==WORD||LA43_0==TYPE||(LA43_0>=57 && LA43_0<=59)||LA43_0==61||(LA43_0>=63 && LA43_0<=66)||(LA43_0>=68 && LA43_0<=71)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt947);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt950); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==67) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred118()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,67,FOLLOW_67_in_ifstmt957); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==WORD||LA46_0==TYPE||(LA46_0>=57 && LA46_0<=59)||LA46_0==61||(LA46_0>=63 && LA46_0<=66)||(LA46_0>=68 && LA46_0<=71)) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==BLKBEG) ) {
                        alt46=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("117:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt960);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt963); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:30: ( statement )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==WORD||LA45_0==TYPE||(LA45_0>=57 && LA45_0<=59)||LA45_0==61||(LA45_0>=63 && LA45_0<=66)||(LA45_0>=68 && LA45_0<=71)) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt965);
                            	    statement();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt968); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:118:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,68,FOLLOW_68_in_whilestmt980); if (failed) return ;
            match(input,59,FOLLOW_59_in_whilestmt982); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt984);
            value();
            _fsp--;
            if (failed) return ;
            match(input,60,FOLLOW_60_in_whilestmt986); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==TYPE||(LA49_0>=57 && LA49_0<=59)||LA49_0==61||(LA49_0>=63 && LA49_0<=66)||(LA49_0>=68 && LA49_0<=71)) ) {
                alt49=1;
            }
            else if ( (LA49_0==BLKBEG) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("119:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt989);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt992); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:119:45: ( statement )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==WORD||LA48_0==TYPE||(LA48_0>=57 && LA48_0<=59)||LA48_0==61||(LA48_0>=63 && LA48_0<=66)||(LA48_0>=68 && LA48_0<=71)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt994);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt997); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,69,FOLLOW_69_in_dowhile1006); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==WORD||LA51_0==TYPE||(LA51_0>=57 && LA51_0<=59)||LA51_0==61||(LA51_0>=63 && LA51_0<=66)||(LA51_0>=68 && LA51_0<=71)) ) {
                alt51=1;
            }
            else if ( (LA51_0==BLKBEG) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("120:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile1009);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile1012); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:120:35: ( statement )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==WORD||LA50_0==TYPE||(LA50_0>=57 && LA50_0<=59)||LA50_0==61||(LA50_0>=63 && LA50_0<=66)||(LA50_0>=68 && LA50_0<=71)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile1014);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile1017); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,68,FOLLOW_68_in_dowhile1021); if (failed) return ;
            match(input,59,FOLLOW_59_in_dowhile1023); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile1025);
            value();
            _fsp--;
            if (failed) return ;
            match(input,60,FOLLOW_60_in_dowhile1027); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,70,FOLLOW_70_in_forstmt1034); if (failed) return ;
            match(input,59,FOLLOW_59_in_forstmt1036); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:21: ( declare )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==WORD||LA52_0==TYPE||LA52_0==57) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1038);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_forstmt1041); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt1043);
            value();
            _fsp--;
            if (failed) return ;
            match(input,51,FOLLOW_51_in_forstmt1045); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:44: ( declare | incrstmt )?
            int alt53=3;
            switch ( input.LA(1) ) {
                case TYPE:
                case 57:
                    {
                    alt53=1;
                    }
                    break;
                case WORD:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (LA53_2==EQUAL||(LA53_2>=PLEQUAL && LA53_2<=MOEQUAL)) ) {
                        alt53=1;
                    }
                    else if ( ((LA53_2>=INC && LA53_2<=DEC)||LA53_2==50) ) {
                        alt53=2;
                    }
                    }
                    break;
                case 58:
                    {
                    alt53=2;
                    }
                    break;
            }

            switch (alt53) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt1048);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt1050);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,60,FOLLOW_60_in_forstmt1054); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==WORD||LA55_0==TYPE||(LA55_0>=57 && LA55_0<=59)||LA55_0==61||(LA55_0>=63 && LA55_0<=66)||(LA55_0>=68 && LA55_0<=71)) ) {
                alt55=1;
            }
            else if ( (LA55_0==BLKBEG) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("121:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt1057);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt1060); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:121:87: ( statement )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==WORD||LA54_0==TYPE||(LA54_0>=57 && LA54_0<=59)||LA54_0==61||(LA54_0>=63 && LA54_0<=66)||(LA54_0>=68 && LA54_0<=71)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt1062);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt1065); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:122:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:123:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:123:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,71,FOLLOW_71_in_switchstmt1075); if (failed) return ;
            match(input,59,FOLLOW_59_in_switchstmt1077); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt1079); if (failed) return ;
            match(input,60,FOLLOW_60_in_switchstmt1081); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1085); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:125:3: ( casestmt )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==72) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1089);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:126:3: ( defaultstmt )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==74) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1094);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1099); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:11: 'case' constant ':' ( statement )*
            {
            match(input,72,FOLLOW_72_in_casestmt1105); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1107);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,73,FOLLOW_73_in_casestmt1109); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:128:31: ( statement )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==WORD||LA58_0==TYPE||(LA58_0>=57 && LA58_0<=59)||LA58_0==61||(LA58_0>=63 && LA58_0<=66)||(LA58_0>=68 && LA58_0<=71)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1111);
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
    // $ANTLR end casestmt


    // $ANTLR start defaultstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:129:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:130:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:130:4: 'default' ':' ( statement )*
            {
            match(input,74,FOLLOW_74_in_defaultstmt1120); if (failed) return ;
            match(input,73,FOLLOW_73_in_defaultstmt1122); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:130:18: ( statement )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==WORD||LA59_0==TYPE||(LA59_0>=57 && LA59_0<=59)||LA59_0==61||(LA59_0>=63 && LA59_0<=66)||(LA59_0>=68 && LA59_0<=71)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1124);
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
    // $ANTLR end defaultstmt


    // $ANTLR start boolval
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:135:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:135:9: ( 'true' | 'false' )
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:9: ( 'public' | 'protected' | 'private' )
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

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( '(' TYPE ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:9: ( '(' TYPE ')' )*
        loop70:
        do {
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==TYPE) ) {
                    alt70=1;
                }


            }


            switch (alt70) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:102:10: '(' TYPE ')'
        	    {
        	    match(input,59,FOLLOW_59_in_synpred63585); if (failed) return ;
        	    match(input,TYPE,FOLLOW_TYPE_in_synpred63587); if (failed) return ;
        	    match(input,60,FOLLOW_60_in_synpred63589); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop70;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
        int alt72=2;
        int LA72_0 = input.LA(1);

        if ( ((LA72_0>=58 && LA72_0<=59)||LA72_0==61) ) {
            alt72=1;
        }
        else if ( (LA72_0==WORD) ) {
            int LA72_2 = input.LA(2);

            if ( (LA72_2==50) ) {
                alt72=1;
            }
        }
        switch (alt72) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                int alt71=4;
                switch ( input.LA(1) ) {
                case 58:
                    {
                    alt71=1;
                    }
                    break;
                case 61:
                    {
                    alt71=2;
                    }
                    break;
                case 59:
                    {
                    alt71=3;
                    }
                    break;
                case WORD:
                    {
                    alt71=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("103:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 71, 0, input);

                    throw nvae;
                }

                switch (alt71) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:6: 'this'
                        {
                        match(input,58,FOLLOW_58_in_synpred63598); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:13: 'super'
                        {
                        match(input,61,FOLLOW_61_in_synpred63600); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:22: '(' value ')'
                        {
                        match(input,59,FOLLOW_59_in_synpred63603); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred63604);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,60,FOLLOW_60_in_synpred63605); if (failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:35: WORD
                        {
                        match(input,WORD,FOLLOW_WORD_in_synpred63608); if (failed) return ;

                        }
                        break;

                }

                match(input,50,FOLLOW_50_in_synpred63611); if (failed) return ;

                }
                break;

        }

        match(input,WORD,FOLLOW_WORD_in_synpred63615); if (failed) return ;
        match(input,59,FOLLOW_59_in_synpred63617); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:56: ( value ( ',' value )* )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==WORD||(LA74_0>=INTEGER && LA74_0<=CHAR)||(LA74_0>=58 && LA74_0<=59)||(LA74_0>=61 && LA74_0<=62)||(LA74_0>=75 && LA74_0<=76)) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:57: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred63620);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:63: ( ',' value )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==55) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:64: ',' value
                	    {
                	    match(input,55,FOLLOW_55_in_synpred63623); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred63625);
                	    value();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                }
                break;

        }

        match(input,60,FOLLOW_60_in_synpred63631); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( ((LA75_0>=PLUS && LA75_0<=AND)) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:104:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred63636);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred63676);
                value();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred118
    public final void synpred118_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,67,FOLLOW_67_in_synpred118957); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==WORD||LA80_0==TYPE||(LA80_0>=57 && LA80_0<=59)||LA80_0==61||(LA80_0>=63 && LA80_0<=66)||(LA80_0>=68 && LA80_0<=71)) ) {
            alt80=1;
        }
        else if ( (LA80_0==BLKBEG) ) {
            alt80=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("117:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 80, 0, input);

            throw nvae;
        }
        switch (alt80) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred118960);
                statement();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:22: ( BLKBEG ( statement )* BLKEND )
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:22: ( BLKBEG ( statement )* BLKEND )
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:23: BLKBEG ( statement )* BLKEND
                {
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred118963); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:117:30: ( statement )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==WORD||LA79_0==TYPE||(LA79_0>=57 && LA79_0<=59)||LA79_0==61||(LA79_0>=63 && LA79_0<=66)||(LA79_0>=68 && LA79_0<=71)) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred118965);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop79;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred118968); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred118

    public final boolean synpred118() {
        backtracking++;
        int start = input.mark();
        try {
            synpred118_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred63() {
        backtracking++;
        int start = input.mark();
        try {
            synpred63_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_extension_in_doc273 = new BitSet(new long[]{0x0032000000000000L});
    public static final BitSet FOLLOW_classdef_in_doc278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_extension289 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension291 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_extension294 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_extension296 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_extension300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_classdef308 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_classdef312 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_CLSNAME_in_classdef314 = new BitSet(new long[]{0x0040000000800000L});
    public static final BitSet FOLLOW_54_in_classdef317 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_classdef319 = new BitSet(new long[]{0x0080000000800000L});
    public static final BitSet FOLLOW_55_in_classdef322 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_classdef324 = new BitSet(new long[]{0x0080000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef332 = new BitSet(new long[]{0x0000000001000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_clsext_in_classdef336 = new BitSet(new long[]{0x0000000001000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas381 = new BitSet(new long[]{0x0300000400000000L});
    public static final BitSet FOLLOW_56_in_fieldas383 = new BitSet(new long[]{0x0200000400000000L});
    public static final BitSet FOLLOW_57_in_fieldas386 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_fieldas389 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas391 = new BitSet(new long[]{0x0008000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas394 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fieldas396 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fieldas400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor408 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_constructor410 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_constructor412 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_constructor415 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor417 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_constructor420 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_constructor422 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor424 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_constructor430 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor434 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_set_in_constructor439 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_constructor445 = new BitSet(new long[]{0x7C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_constructor448 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_constructor451 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_constructor453 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_constructor459 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constructor461 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_constructor467 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_constructor472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct479 = new BitSet(new long[]{0x0100000500000000L});
    public static final BitSet FOLLOW_56_in_funct481 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_TYPE_in_funct484 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct487 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funct489 = new BitSet(new long[]{0x1000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_funct492 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct494 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_funct497 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_funct499 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct501 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_funct507 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct511 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_funct515 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_funct520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_declare528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_declare532 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare534 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare537 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_declare551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare559 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare561 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_declare575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_value585 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_value587 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_value589 = new BitSet(new long[]{0x2C00000100000000L});
    public static final BitSet FOLLOW_58_in_value598 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61_in_value600 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59_in_value603 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value604 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_value605 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WORD_in_value608 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_value611 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value615 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value617 = new BitSet(new long[]{0x7C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value620 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_value623 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value625 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_value631 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_value636 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_value689 = new BitSet(new long[]{0x00040000C07FFFF2L});
    public static final BitSet FOLLOW_59_in_value691 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value692 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_value693 = new BitSet(new long[]{0x00040000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value695 = new BitSet(new long[]{0x00040000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value697 = new BitSet(new long[]{0x00040000C07FFFF2L});
    public static final BitSet FOLLOW_50_in_value701 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value703 = new BitSet(new long[]{0x00040000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value712 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_value752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_constant794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_fnccall803 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61_in_fnccall805 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall808 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall810 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_fnccall812 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall815 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fnccall818 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall822 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall824 = new BitSet(new long[]{0x7C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall827 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_fnccall830 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_fnccall832 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_fnccall838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement848 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement852 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement856 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement860 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement864 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_63_in_statement868 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_64_in_statement872 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_statement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt900 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_incrstmt906 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt910 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_returnstmt924 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_returnstmt926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ifstmt933 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ifstmt935 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_ifstmt937 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ifstmt939 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt945 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt947 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifstmt957 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt963 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_ifstmt965 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_whilestmt980 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_whilestmt982 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_whilestmt984 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_whilestmt986 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_whilestmt989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt992 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_whilestmt994 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_dowhile1006 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_dowhile1009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile1012 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_dowhile1014 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_dowhile1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dowhile1021 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_dowhile1023 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_dowhile1025 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_dowhile1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_forstmt1034 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_forstmt1036 = new BitSet(new long[]{0x0208000500000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1038 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_forstmt1041 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_forstmt1043 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_forstmt1045 = new BitSet(new long[]{0x1600000500000000L});
    public static final BitSet FOLLOW_declare_in_forstmt1048 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt1050 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_forstmt1054 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_forstmt1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt1060 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_forstmt1062 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_forstmt1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_switchstmt1075 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_switchstmt1077 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt1079 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_switchstmt1081 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1085 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1089 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1094 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_casestmt1105 = new BitSet(new long[]{0x400000F800000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_constant_in_casestmt1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_casestmt1109 = new BitSet(new long[]{0xAE00000500000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_casestmt1111 = new BitSet(new long[]{0xAE00000500000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_74_in_defaultstmt1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_defaultstmt1122 = new BitSet(new long[]{0xAE00000500000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_defaultstmt1124 = new BitSet(new long[]{0xAE00000500000002L,0x00000000000000F7L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_synpred63585 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_TYPE_in_synpred63587 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred63589 = new BitSet(new long[]{0x2C00000100000000L});
    public static final BitSet FOLLOW_58_in_synpred63598 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61_in_synpred63600 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59_in_synpred63603 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred63604 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred63605 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WORD_in_synpred63608 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred63611 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred63615 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred63617 = new BitSet(new long[]{0x7C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred63620 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred63623 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred63625 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_synpred63631 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_synpred63636 = new BitSet(new long[]{0x6C0000F900000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_value_in_synpred63676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_synpred118957 = new BitSet(new long[]{0xAE00000500800000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_synpred118960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred118963 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_statement_in_synpred118965 = new BitSet(new long[]{0xAE00000501000000L,0x00000000000000F7L});
    public static final BitSet FOLLOW_BLKEND_in_synpred118968 = new BitSet(new long[]{0x0000000000000002L});

}