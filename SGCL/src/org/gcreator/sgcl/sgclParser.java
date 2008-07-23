// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 16:38:04

package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class sgclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "STRING", "INTEGER", "DOUBLE", "FLOAT", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'partial'", "'class'", "'extends'", "'fail'", "'('", "')'", "'static'", "'final'", "';'", "'this'", "','", "'super'", "'.'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'int'", "'float'", "'double'", "'boolean'", "'char'", "'string'", "'true'", "'false'", "'public'", "'protected'", "'private'"
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
    public static final int FLOAT=36;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int WORD=32;
    public static final int INC=30;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=35;
    public static final int PLUS=4;
    public static final int DIGIT=39;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=45;
    public static final int INTEGER=34;
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
    public static final int STRING=33;

        public sgclParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[157+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }



    // $ANTLR start doc
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:1: doc : classdef ;
    public final void doc() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:5: ( classdef )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:7: classdef
            {
            pushFollow(FOLLOW_classdef_in_doc271);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:9: ( ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:11: ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:11: ( 'partial' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:12: 'partial'
                    {
                    match(input,47,FOLLOW_47_in_classdef279); if (failed) return ;

                    }
                    break;

            }

            match(input,48,FOLLOW_48_in_classdef283); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_classdef285); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:37: ( 'extends' WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:38: 'extends' WORD
                    {
                    match(input,49,FOLLOW_49_in_classdef288); if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_classdef290); if (failed) return ;

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef296); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:3: ( clsext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=81 && LA3_0<=83)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef300);
            	    clsext();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef305); if (failed) return ;

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


    // $ANTLR start fail
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:1: fail : 'fail' '(' STRING ')' ;
    public final void fail() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:6: ( 'fail' '(' STRING ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:8: 'fail' '(' STRING ')'
            {
            match(input,50,FOLLOW_50_in_fail313); if (failed) return ;
            match(input,51,FOLLOW_51_in_fail315); if (failed) return ;
            match(input,STRING,FOLLOW_STRING_in_fail317); if (failed) return ;
            match(input,52,FOLLOW_52_in_fail319); if (failed) return ;

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
    // $ANTLR end fail


    // $ANTLR start clsext
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=81 && LA4_0<=83)) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    switch ( input.LA(3) ) {
                    case WORD:
                        {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==51) ) {
                            alt4=2;
                        }
                        else if ( (LA4_3==WORD) ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8==51) ) {
                                alt4=2;
                            }
                            else if ( (LA4_8==EQUAL||LA4_8==55) ) {
                                alt4=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==WORD) ) {
                            int LA4_8 = input.LA(5);

                            if ( (LA4_8==51) ) {
                                alt4=2;
                            }
                            else if ( (LA4_8==EQUAL||LA4_8==55) ) {
                                alt4=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        alt4=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==51) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==WORD) ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8==51) ) {
                            alt4=2;
                        }
                        else if ( (LA4_8==EQUAL||LA4_8==55) ) {
                            alt4=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==WORD) ) {
                        int LA4_8 = input.LA(4);

                        if ( (LA4_8==51) ) {
                            alt4=2;
                        }
                        else if ( (LA4_8==EQUAL||LA4_8==55) ) {
                            alt4=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 56:
                    {
                    alt4=3;
                    }
                    break;
                case 54:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("55:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext327);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext331);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext335);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas342);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,53,FOLLOW_53_in_fieldas344); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:29: ( 'final' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==54) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'final'
                    {
                    match(input,54,FOLLOW_54_in_fieldas347); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas350);
            type();
            _fsp--;
            if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas352); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:48: ( EQUAL value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas355); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas357);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_fieldas361); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor369);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_constructor371); if (failed) return ;
            match(input,51,FOLLOW_51_in_constructor373); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:23: ( type WORD ( ',' type WORD )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD||(LA9_0>=73 && LA9_0<=78)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor376);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor378); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:34: ( ',' type WORD )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==57) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:35: ',' type WORD
                    	    {
                    	    match(input,57,FOLLOW_57_in_constructor381); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_constructor383);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor385); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_constructor391); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor395); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:3: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WORD||LA10_0==51||LA10_0==54||LA10_0==56||LA10_0==58||(LA10_0>=61 && LA10_0<=64)||(LA10_0>=66 && LA10_0<=69)||(LA10_0>=73 && LA10_0<=78)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor399);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor404); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:1: funct : privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:7: ( privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:9: privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct411);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:17: ( 'static' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,53,FOLLOW_53_in_funct413); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:27: ( type )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WORD) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==WORD) ) {
                    alt12=1;
                }
            }
            else if ( ((LA12_0>=73 && LA12_0<=78)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_funct416);
                    type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct419); if (failed) return ;
            match(input,51,FOLLOW_51_in_funct421); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:42: ( type WORD ( ',' type WORD )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WORD||(LA14_0>=73 && LA14_0<=78)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:43: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct424);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct426); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:53: ( ',' type WORD )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==57) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:54: ',' type WORD
                    	    {
                    	    match(input,57,FOLLOW_57_in_funct429); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_funct431);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct433); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_funct439); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct443); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:3: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WORD||LA15_0==51||LA15_0==54||LA15_0==56||LA15_0==58||(LA15_0>=61 && LA15_0<=64)||(LA15_0>=66 && LA15_0<=69)||(LA15_0>=73 && LA15_0<=78)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct447);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct452); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54||(LA18_0>=73 && LA18_0<=78)) ) {
                alt18=1;
            }
            else if ( (LA18_0==WORD) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EQUAL||(LA18_2>=PLEQUAL && LA18_2<=MOEQUAL)) ) {
                    alt18=2;
                }
                else if ( (LA18_2==WORD) ) {
                    alt18=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("66:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("66:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:11: ( 'final' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==54) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:12: 'final'
                            {
                            match(input,54,FOLLOW_54_in_declare460); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare464);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare466); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQUAL||(LA17_0>=PLEQUAL && LA17_0<=MOEQUAL)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare469);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare483);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare491); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare493);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare507);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:7: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 51:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred56()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("70:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA28_2 = input.LA(2);

                if ( (synpred56()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("70:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
                {
                alt28=1;
                }
                break;
            case WORD:
                {
                int LA28_4 = input.LA(2);

                if ( (synpred56()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("70:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case CHAR:
            case 60:
            case 79:
            case 80:
                {
                alt28=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("70:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:9: ( '(' type ')' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==51) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==WORD) ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3==52) ) {
                                    int LA19_5 = input.LA(4);

                                    if ( (LA19_5==WORD||LA19_5==51||LA19_5==56||LA19_5==58) ) {
                                        alt19=1;
                                    }


                                }


                            }
                            else if ( ((LA19_2>=73 && LA19_2<=78)) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:10: '(' type ')'
                    	    {
                    	    match(input,51,FOLLOW_51_in_value517); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_value519);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,52,FOLLOW_52_in_value521); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==51||LA21_0==56||LA21_0==58) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==WORD) ) {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==59) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                            int alt20=4;
                            switch ( input.LA(1) ) {
                            case 56:
                                {
                                alt20=1;
                                }
                                break;
                            case 58:
                                {
                                alt20=2;
                                }
                                break;
                            case 51:
                                {
                                alt20=3;
                                }
                                break;
                            case WORD:
                                {
                                alt20=4;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 20, 0, input);

                                throw nvae;
                            }

                            switch (alt20) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:6: 'this'
                                    {
                                    match(input,56,FOLLOW_56_in_value530); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:13: 'super'
                                    {
                                    match(input,58,FOLLOW_58_in_value532); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:22: '(' value ')'
                                    {
                                    match(input,51,FOLLOW_51_in_value535); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value536);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,52,FOLLOW_52_in_value537); if (failed) return ;

                                    }


                                    }
                                    break;
                                case 4 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:35: WORD
                                    {
                                    match(input,WORD,FOLLOW_WORD_in_value540); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,59,FOLLOW_59_in_value543); if (failed) return ;

                            }
                            break;

                    }

                    match(input,WORD,FOLLOW_WORD_in_value547); if (failed) return ;
                    match(input,51,FOLLOW_51_in_value549); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:56: ( value ( ',' value )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=WORD && LA23_0<=CHAR)||LA23_0==51||LA23_0==56||LA23_0==58||LA23_0==60||(LA23_0>=79 && LA23_0<=80)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:57: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value552);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:63: ( ',' value )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==57) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:64: ',' value
                            	    {
                            	    match(input,57,FOLLOW_57_in_value555); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value557);
                            	    value();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,52,FOLLOW_52_in_value563); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=PLUS && LA24_0<=AND)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value568);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value608);
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:8: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:8: ( 'this' | '(' value ')' | constant | WORD )
                    int alt25=4;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt25=1;
                        }
                        break;
                    case 51:
                        {
                        alt25=2;
                        }
                        break;
                    case STRING:
                    case INTEGER:
                    case DOUBLE:
                    case FLOAT:
                    case CHAR:
                    case 60:
                    case 79:
                    case 80:
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
                            new NoViableAltException("73:8: ( 'this' | '(' value ')' | constant | WORD )", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:9: 'this'
                            {
                            match(input,56,FOLLOW_56_in_value621); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:16: '(' value ')'
                            {
                            match(input,51,FOLLOW_51_in_value623); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value624);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,52,FOLLOW_52_in_value625); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value627);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:37: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value629); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:43: ( '.' WORD )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==59) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:44: '.' WORD
                    	    {
                    	    match(input,59,FOLLOW_59_in_value633); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_value635); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt27=4;
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
                            alt27=1;
                            }
                            break;
                        case INC:
                            {
                            alt27=2;
                            }
                            break;
                        case DEC:
                            {
                            alt27=3;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value644);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value684);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value687); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value689); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt29=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt29=1;
                }
                break;
            case DOUBLE:
                {
                alt29=2;
                }
                break;
            case FLOAT:
                {
                alt29=3;
                }
                break;
            case STRING:
                {
                alt29=4;
                }
                break;
            case CHAR:
                {
                alt29=5;
                }
                break;
            case 79:
            case 80:
                {
                alt29=6;
                }
                break;
            case 60:
                {
                alt29=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("75:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant702); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant706); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant710); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant714); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant718); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant722);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:57: 'null'
                    {
                    match(input,60,FOLLOW_60_in_constant726); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:1: fnccall : ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ;
    public final void fnccall() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:9: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51||LA31_0==56||LA31_0==58) ) {
                alt31=1;
            }
            else if ( (LA31_0==WORD) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==59) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt30=4;
                    switch ( input.LA(1) ) {
                    case 56:
                        {
                        alt30=1;
                        }
                        break;
                    case 58:
                        {
                        alt30=2;
                        }
                        break;
                    case 51:
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
                            new NoViableAltException("77:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:13: 'this'
                            {
                            match(input,56,FOLLOW_56_in_fnccall735); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:20: 'super'
                            {
                            match(input,58,FOLLOW_58_in_fnccall737); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:29: '(' value ')'
                            {
                            match(input,51,FOLLOW_51_in_fnccall740); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall742);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,52,FOLLOW_52_in_fnccall744); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall747); if (failed) return ;

                            }
                            break;

                    }

                    match(input,59,FOLLOW_59_in_fnccall750); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall754); if (failed) return ;
            match(input,51,FOLLOW_51_in_fnccall756); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:65: ( value ( ',' value )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=WORD && LA33_0<=CHAR)||LA33_0==51||LA33_0==56||LA33_0==58||LA33_0==60||(LA33_0>=79 && LA33_0<=80)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall759);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:72: ( ',' value )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==57) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:73: ',' value
                    	    {
                    	    match(input,57,FOLLOW_57_in_fnccall762); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall764);
                    	    value();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_fnccall770); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:2: ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt35=5;
            switch ( input.LA(1) ) {
            case WORD:
            case 51:
            case 54:
            case 56:
            case 58:
            case 61:
            case 62:
            case 63:
            case 67:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt35=1;
                }
                break;
            case 64:
                {
                alt35=2;
                }
                break;
            case 66:
                {
                alt35=3;
                }
                break;
            case 68:
                {
                alt35=4;
                }
                break;
            case 69:
                {
                alt35=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("78:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt34=7;
                    switch ( input.LA(1) ) {
                    case 54:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                        {
                        alt34=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case INC:
                        case DEC:
                            {
                            alt34=3;
                            }
                            break;
                        case 59:
                            {
                            int LA34_10 = input.LA(3);

                            if ( (LA34_10==WORD) ) {
                                int LA34_11 = input.LA(4);

                                if ( ((LA34_11>=INC && LA34_11<=DEC)) ) {
                                    alt34=3;
                                }
                                else if ( (LA34_11==51) ) {
                                    alt34=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 10, input);

                                throw nvae;
                            }
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
                            alt34=1;
                            }
                            break;
                        case 51:
                            {
                            alt34=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 63:
                        {
                        alt34=2;
                        }
                        break;
                    case 56:
                        {
                        int LA34_4 = input.LA(2);

                        if ( (LA34_4==59) ) {
                            int LA34_10 = input.LA(3);

                            if ( (LA34_10==WORD) ) {
                                int LA34_11 = input.LA(4);

                                if ( ((LA34_11>=INC && LA34_11<=DEC)) ) {
                                    alt34=3;
                                }
                                else if ( (LA34_11==51) ) {
                                    alt34=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 10, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 67:
                        {
                        alt34=4;
                        }
                        break;
                    case 51:
                    case 58:
                        {
                        alt34=5;
                        }
                        break;
                    case 61:
                        {
                        alt34=6;
                        }
                        break;
                    case 62:
                        {
                        alt34=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("79:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement780);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement784);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement788);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement792);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement796);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:60: 'continue'
                            {
                            match(input,61,FOLLOW_61_in_statement800); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:73: 'break'
                            {
                            match(input,62,FOLLOW_62_in_statement804); if (failed) return ;

                            }
                            break;

                    }

                    match(input,55,FOLLOW_55_in_statement807); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement813);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement817);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement821);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement825);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:11: ( ( 'this' | WORD ) '.' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==WORD) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==59) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==56 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt832);    throw mse;
                    }

                    match(input,59,FOLLOW_59_in_incrstmt838); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt842); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt844);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:4: 'return' value
            {
            match(input,63,FOLLOW_63_in_returnstmt856); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt858);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,64,FOLLOW_64_in_ifstmt865); if (failed) return ;
            match(input,51,FOLLOW_51_in_ifstmt867); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt869);
            value();
            _fsp--;
            if (failed) return ;
            match(input,52,FOLLOW_52_in_ifstmt871); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WORD||LA38_0==51||LA38_0==54||LA38_0==56||LA38_0==58||(LA38_0>=61 && LA38_0<=64)||(LA38_0>=66 && LA38_0<=69)||(LA38_0>=73 && LA38_0<=78)) ) {
                alt38=1;
            }
            else if ( (LA38_0==BLKBEG) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("84:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt874);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt877); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:48: ( statement )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==WORD||LA37_0==51||LA37_0==54||LA37_0==56||LA37_0==58||(LA37_0>=61 && LA37_0<=64)||(LA37_0>=66 && LA37_0<=69)||(LA37_0>=73 && LA37_0<=78)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt879);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt882); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred111()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,65,FOLLOW_65_in_ifstmt889); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==WORD||LA40_0==51||LA40_0==54||LA40_0==56||LA40_0==58||(LA40_0>=61 && LA40_0<=64)||(LA40_0>=66 && LA40_0<=69)||(LA40_0>=73 && LA40_0<=78)) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==BLKBEG) ) {
                        alt40=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("85:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt892);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt895); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:30: ( statement )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==WORD||LA39_0==51||LA39_0==54||LA39_0==56||LA39_0==58||(LA39_0>=61 && LA39_0<=64)||(LA39_0>=66 && LA39_0<=69)||(LA39_0>=73 && LA39_0<=78)) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
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
                            	    break loop39;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt900); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,66,FOLLOW_66_in_whilestmt912); if (failed) return ;
            match(input,51,FOLLOW_51_in_whilestmt914); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt916);
            value();
            _fsp--;
            if (failed) return ;
            match(input,52,FOLLOW_52_in_whilestmt918); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==WORD||LA43_0==51||LA43_0==54||LA43_0==56||LA43_0==58||(LA43_0>=61 && LA43_0<=64)||(LA43_0>=66 && LA43_0<=69)||(LA43_0>=73 && LA43_0<=78)) ) {
                alt43=1;
            }
            else if ( (LA43_0==BLKBEG) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("87:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt921);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt924); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:45: ( statement )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==WORD||LA42_0==51||LA42_0==54||LA42_0==56||LA42_0==58||(LA42_0>=61 && LA42_0<=64)||(LA42_0>=66 && LA42_0<=69)||(LA42_0>=73 && LA42_0<=78)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt926);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt929); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,67,FOLLOW_67_in_dowhile938); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==51||LA45_0==54||LA45_0==56||LA45_0==58||(LA45_0>=61 && LA45_0<=64)||(LA45_0>=66 && LA45_0<=69)||(LA45_0>=73 && LA45_0<=78)) ) {
                alt45=1;
            }
            else if ( (LA45_0==BLKBEG) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("88:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile941);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile944); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:35: ( statement )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==WORD||LA44_0==51||LA44_0==54||LA44_0==56||LA44_0==58||(LA44_0>=61 && LA44_0<=64)||(LA44_0>=66 && LA44_0<=69)||(LA44_0>=73 && LA44_0<=78)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile946);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile949); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,66,FOLLOW_66_in_dowhile953); if (failed) return ;
            match(input,51,FOLLOW_51_in_dowhile955); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile957);
            value();
            _fsp--;
            if (failed) return ;
            match(input,52,FOLLOW_52_in_dowhile959); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,68,FOLLOW_68_in_forstmt966); if (failed) return ;
            match(input,51,FOLLOW_51_in_forstmt968); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:21: ( declare )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==WORD||LA46_0==54||(LA46_0>=73 && LA46_0<=78)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt970);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_forstmt973); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt975);
            value();
            _fsp--;
            if (failed) return ;
            match(input,55,FOLLOW_55_in_forstmt977); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:44: ( declare | incrstmt )?
            int alt47=3;
            switch ( input.LA(1) ) {
                case 54:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt47=1;
                    }
                    break;
                case WORD:
                    {
                    int LA47_2 = input.LA(2);

                    if ( ((LA47_2>=INC && LA47_2<=DEC)||LA47_2==59) ) {
                        alt47=2;
                    }
                    else if ( (LA47_2==EQUAL||(LA47_2>=PLEQUAL && LA47_2<=MOEQUAL)||LA47_2==WORD) ) {
                        alt47=1;
                    }
                    }
                    break;
                case 56:
                    {
                    alt47=2;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt980);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt982);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_forstmt986); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==51||LA49_0==54||LA49_0==56||LA49_0==58||(LA49_0>=61 && LA49_0<=64)||(LA49_0>=66 && LA49_0<=69)||(LA49_0>=73 && LA49_0<=78)) ) {
                alt49=1;
            }
            else if ( (LA49_0==BLKBEG) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("89:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt989);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt992); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:87: ( statement )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==WORD||LA48_0==51||LA48_0==54||LA48_0==56||LA48_0==58||(LA48_0>=61 && LA48_0<=64)||(LA48_0>=66 && LA48_0<=69)||(LA48_0>=73 && LA48_0<=78)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt994);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt997); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:90:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,69,FOLLOW_69_in_switchstmt1007); if (failed) return ;
            match(input,51,FOLLOW_51_in_switchstmt1009); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt1011); if (failed) return ;
            match(input,52,FOLLOW_52_in_switchstmt1013); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1017); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:93:3: ( casestmt )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==70) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1021);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:3: ( defaultstmt )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1026);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1031); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:11: 'case' constant ':' ( statement )*
            {
            match(input,70,FOLLOW_70_in_casestmt1037); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1039);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,71,FOLLOW_71_in_casestmt1041); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:31: ( statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==WORD||LA52_0==51||LA52_0==54||LA52_0==56||LA52_0==58||(LA52_0>=61 && LA52_0<=64)||(LA52_0>=66 && LA52_0<=69)||(LA52_0>=73 && LA52_0<=78)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1043);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:4: 'default' ':' ( statement )*
            {
            match(input,72,FOLLOW_72_in_defaultstmt1052); if (failed) return ;
            match(input,71,FOLLOW_71_in_defaultstmt1054); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:18: ( statement )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==WORD||LA53_0==51||LA53_0==54||LA53_0==56||LA53_0==58||(LA53_0>=61 && LA53_0<=64)||(LA53_0>=66 && LA53_0<=69)||(LA53_0>=73 && LA53_0<=78)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1056);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:99:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=73 && input.LA(1)<=78) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=79 && input.LA(1)<=80) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:105:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=81 && input.LA(1)<=83) ) {
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

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:9: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:9: ( '(' type ')' )*
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==51) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==WORD) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==52) ) {
                        int LA60_5 = input.LA(4);

                        if ( (LA60_5==WORD||LA60_5==51||LA60_5==56||LA60_5==58) ) {
                            alt60=1;
                        }


                    }


                }
                else if ( ((LA60_2>=73 && LA60_2<=78)) ) {
                    alt60=1;
                }


            }


            switch (alt60) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:10: '(' type ')'
        	    {
        	    match(input,51,FOLLOW_51_in_synpred56517); if (failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred56519);
        	    type();
        	    _fsp--;
        	    if (failed) return ;
        	    match(input,52,FOLLOW_52_in_synpred56521); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop60;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
        int alt62=2;
        int LA62_0 = input.LA(1);

        if ( (LA62_0==51||LA62_0==56||LA62_0==58) ) {
            alt62=1;
        }
        else if ( (LA62_0==WORD) ) {
            int LA62_2 = input.LA(2);

            if ( (LA62_2==59) ) {
                alt62=1;
            }
        }
        switch (alt62) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                int alt61=4;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    alt61=1;
                    }
                    break;
                case 58:
                    {
                    alt61=2;
                    }
                    break;
                case 51:
                    {
                    alt61=3;
                    }
                    break;
                case WORD:
                    {
                    alt61=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("71:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 61, 0, input);

                    throw nvae;
                }

                switch (alt61) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:6: 'this'
                        {
                        match(input,56,FOLLOW_56_in_synpred56530); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:13: 'super'
                        {
                        match(input,58,FOLLOW_58_in_synpred56532); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:22: '(' value ')'
                        {
                        match(input,51,FOLLOW_51_in_synpred56535); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred56536);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,52,FOLLOW_52_in_synpred56537); if (failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:35: WORD
                        {
                        match(input,WORD,FOLLOW_WORD_in_synpred56540); if (failed) return ;

                        }
                        break;

                }

                match(input,59,FOLLOW_59_in_synpred56543); if (failed) return ;

                }
                break;

        }

        match(input,WORD,FOLLOW_WORD_in_synpred56547); if (failed) return ;
        match(input,51,FOLLOW_51_in_synpred56549); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:56: ( value ( ',' value )* )?
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( ((LA64_0>=WORD && LA64_0<=CHAR)||LA64_0==51||LA64_0==56||LA64_0==58||LA64_0==60||(LA64_0>=79 && LA64_0<=80)) ) {
            alt64=1;
        }
        switch (alt64) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:57: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred56552);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:63: ( ',' value )*
                loop63:
                do {
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==57) ) {
                        alt63=1;
                    }


                    switch (alt63) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:64: ',' value
                	    {
                	    match(input,57,FOLLOW_57_in_synpred56555); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred56557);
                	    value();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop63;
                    }
                } while (true);


                }
                break;

        }

        match(input,52,FOLLOW_52_in_synpred56563); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt65=2;
        int LA65_0 = input.LA(1);

        if ( ((LA65_0>=PLUS && LA65_0<=AND)) ) {
            alt65=1;
        }
        switch (alt65) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred56568);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred56608);
                value();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred111
    public final void synpred111_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,65,FOLLOW_65_in_synpred111889); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==WORD||LA70_0==51||LA70_0==54||LA70_0==56||LA70_0==58||(LA70_0>=61 && LA70_0<=64)||(LA70_0>=66 && LA70_0<=69)||(LA70_0>=73 && LA70_0<=78)) ) {
            alt70=1;
        }
        else if ( (LA70_0==BLKBEG) ) {
            alt70=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("85:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 70, 0, input);

            throw nvae;
        }
        switch (alt70) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred111892);
                statement();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:22: ( BLKBEG ( statement )* BLKEND )
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:22: ( BLKBEG ( statement )* BLKEND )
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:23: BLKBEG ( statement )* BLKEND
                {
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred111895); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:30: ( statement )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==WORD||LA69_0==51||LA69_0==54||LA69_0==56||LA69_0==58||(LA69_0>=61 && LA69_0<=64)||(LA69_0>=66 && LA69_0<=69)||(LA69_0>=73 && LA69_0<=78)) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred111897);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred111900); if (failed) return ;

                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred111

    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred111() {
        backtracking++;
        int start = input.mark();
        try {
            synpred111_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_classdef_in_doc271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_classdef279 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_classdef283 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef285 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_49_in_classdef288 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef290 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef296 = new BitSet(new long[]{0x0000000001000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_clsext_in_classdef300 = new BitSet(new long[]{0x0000000001000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_fail313 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fail315 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_STRING_in_fail317 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fail319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas342 = new BitSet(new long[]{0x0060000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_53_in_fieldas344 = new BitSet(new long[]{0x0040000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_54_in_fieldas347 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_fieldas350 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas352 = new BitSet(new long[]{0x0080000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas355 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_fieldas357 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fieldas361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor369 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_constructor371 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constructor373 = new BitSet(new long[]{0x0010000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_constructor376 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor378 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_constructor381 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_constructor383 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor385 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_constructor391 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor395 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_constructor399 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_constructor404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct411 = new BitSet(new long[]{0x0020000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_53_in_funct413 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_funct416 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct419 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funct421 = new BitSet(new long[]{0x0010000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_funct424 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct426 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_funct429 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_funct431 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct433 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_funct439 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct443 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_funct447 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_funct452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_declare460 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_declare464 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare466 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare469 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_declare483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare491 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare493 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_declare507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_value517 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_value519 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_value521 = new BitSet(new long[]{0x0508000100000000L});
    public static final BitSet FOLLOW_56_in_value530 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58_in_value532 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51_in_value535 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value536 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_value537 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_value540 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_value543 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value547 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_value549 = new BitSet(new long[]{0x1518003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value552 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_value555 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value557 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_value563 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_value568 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_value621 = new BitSet(new long[]{0x08000000C07FFFF2L});
    public static final BitSet FOLLOW_51_in_value623 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value624 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_value625 = new BitSet(new long[]{0x08000000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value627 = new BitSet(new long[]{0x08000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value629 = new BitSet(new long[]{0x08000000C07FFFF2L});
    public static final BitSet FOLLOW_59_in_value633 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value635 = new BitSet(new long[]{0x08000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value644 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_value684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_constant726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_fnccall735 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58_in_fnccall737 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51_in_fnccall740 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_fnccall742 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fnccall744 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall747 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_fnccall750 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall754 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fnccall756 = new BitSet(new long[]{0x1518003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_fnccall759 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall762 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_fnccall764 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_fnccall770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement780 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement784 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement788 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement792 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement796 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61_in_statement800 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_62_in_statement804 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_statement807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt832 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_incrstmt838 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt842 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_returnstmt856 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_returnstmt858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ifstmt865 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifstmt867 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_ifstmt869 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ifstmt871 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_ifstmt874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt877 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_ifstmt879 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ifstmt889 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_ifstmt892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt895 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_ifstmt897 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_whilestmt912 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_whilestmt914 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_whilestmt916 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_whilestmt918 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_whilestmt921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt924 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_whilestmt926 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_dowhile938 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_dowhile941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile944 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_dowhile946 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_dowhile949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_dowhile953 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_dowhile955 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_dowhile957 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_dowhile959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_forstmt966 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_forstmt968 = new BitSet(new long[]{0x00C0000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_declare_in_forstmt970 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_forstmt973 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_forstmt975 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_forstmt977 = new BitSet(new long[]{0x0150000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_declare_in_forstmt980 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt982 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt986 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_forstmt989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt992 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_forstmt994 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_switchstmt1007 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_switchstmt1009 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt1011 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_switchstmt1013 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1017 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1021 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1026 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_casestmt1037 = new BitSet(new long[]{0x1000003E00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_constant_in_casestmt1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_casestmt1041 = new BitSet(new long[]{0xE548000100000002L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_casestmt1043 = new BitSet(new long[]{0xE548000100000002L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_72_in_defaultstmt1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_defaultstmt1054 = new BitSet(new long[]{0xE548000100000002L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_defaultstmt1056 = new BitSet(new long[]{0xE548000100000002L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred56517 = new BitSet(new long[]{0x0000000100000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_type_in_synpred56519 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred56521 = new BitSet(new long[]{0x0508000100000000L});
    public static final BitSet FOLLOW_56_in_synpred56530 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58_in_synpred56532 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51_in_synpred56535 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_synpred56536 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred56537 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_WORD_in_synpred56540 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred56543 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred56547 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred56549 = new BitSet(new long[]{0x1518003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_synpred56552 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_synpred56555 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_synpred56557 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_synpred56563 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_synpred56568 = new BitSet(new long[]{0x1508003F00000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_value_in_synpred56608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_synpred111889 = new BitSet(new long[]{0xE548000100800000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_synpred111892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred111895 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_statement_in_synpred111897 = new BitSet(new long[]{0xE548000101000000L,0x0000000000007E3DL});
    public static final BitSet FOLLOW_BLKEND_in_synpred111900 = new BitSet(new long[]{0x0000000000000002L});

}