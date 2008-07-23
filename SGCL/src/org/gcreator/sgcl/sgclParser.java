// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 15:47:23

package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class sgclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "STRING", "INTEGER", "DOUBLE", "FLOAT", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'partial'", "'class'", "'extends'", "'fail'", "'('", "')'", "'static'", "'final'", "';'", "'this'", "','", "'.'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "':'", "'default'", "'int'", "'float'", "'double'", "'boolean'", "'char'", "'string'", "'true'", "'false'", "'public'", "'protected'", "'private'"
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
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }



    // $ANTLR start doc
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:1: doc : classdef ;
    public final void doc() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:5: ( classdef )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:7: classdef
            {
            pushFollow(FOLLOW_classdef_in_doc259);
            classdef();
            _fsp--;


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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:9: ( ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:11: ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:11: ( 'partial' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:12: 'partial'
                    {
                    match(input,47,FOLLOW_47_in_classdef267); 

                    }
                    break;

            }

            match(input,48,FOLLOW_48_in_classdef271); 
            match(input,WORD,FOLLOW_WORD_in_classdef273); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:37: ( 'extends' WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:38: 'extends' WORD
                    {
                    match(input,49,FOLLOW_49_in_classdef276); 
                    match(input,WORD,FOLLOW_WORD_in_classdef278); 

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef284); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:3: ( clsext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=80 && LA3_0<=82)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:3: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef288);
            	    clsext();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef293); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:1: fail : 'fail' '(' STRING ')' ;
    public final void fail() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:6: ( 'fail' '(' STRING ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:8: 'fail' '(' STRING ')'
            {
            match(input,50,FOLLOW_50_in_fail301); 
            match(input,51,FOLLOW_51_in_fail303); 
            match(input,STRING,FOLLOW_STRING_in_fail305); 
            match(input,52,FOLLOW_52_in_fail307); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=80 && LA4_0<=82)) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        alt4=1;
                        }
                        break;
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
                                NoViableAltException nvae =
                                    new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

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
                                NoViableAltException nvae =
                                    new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 2, input);

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
                            NoViableAltException nvae =
                                new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

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
                            NoViableAltException nvae =
                                new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 54:
                    {
                    alt4=1;
                    }
                    break;
                case 56:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("51:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext315);
                    fieldas();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext319);
                    funct();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext323);
                    constructor();
                    _fsp--;


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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas330);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:19: 'static'
                    {
                    match(input,53,FOLLOW_53_in_fieldas332); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:29: ( 'final' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==54) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:29: 'final'
                    {
                    match(input,54,FOLLOW_54_in_fieldas335); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas338);
            type();
            _fsp--;

            match(input,WORD,FOLLOW_WORD_in_fieldas340); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:48: ( EQUAL value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas343); 
                    pushFollow(FOLLOW_value_in_fieldas345);
                    value();
                    _fsp--;


                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_fieldas349); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor357);
            privacy();
            _fsp--;

            match(input,56,FOLLOW_56_in_constructor359); 
            match(input,51,FOLLOW_51_in_constructor361); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:23: ( type WORD ( ',' type WORD )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD||(LA9_0>=72 && LA9_0<=77)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor364);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_constructor366); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:34: ( ',' type WORD )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==57) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:35: ',' type WORD
                    	    {
                    	    match(input,57,FOLLOW_57_in_constructor369); 
                    	    pushFollow(FOLLOW_type_in_constructor371);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_constructor373); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_constructor379); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor383); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:3: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WORD||LA10_0==54||LA10_0==56||(LA10_0>=60 && LA10_0<=63)||(LA10_0>=65 && LA10_0<=68)||(LA10_0>=72 && LA10_0<=77)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor387);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor392); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:1: funct : privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:7: ( privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:9: privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct399);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:17: ( 'static' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==53) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:17: 'static'
                    {
                    match(input,53,FOLLOW_53_in_funct401); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:27: ( type )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==WORD) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==WORD) ) {
                    alt12=1;
                }
            }
            else if ( ((LA12_0>=72 && LA12_0<=77)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:27: type
                    {
                    pushFollow(FOLLOW_type_in_funct404);
                    type();
                    _fsp--;


                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct407); 
            match(input,51,FOLLOW_51_in_funct409); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:42: ( type WORD ( ',' type WORD )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WORD||(LA14_0>=72 && LA14_0<=77)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:43: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct412);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_funct414); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:53: ( ',' type WORD )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==57) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:54: ',' type WORD
                    	    {
                    	    match(input,57,FOLLOW_57_in_funct417); 
                    	    pushFollow(FOLLOW_type_in_funct419);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_funct421); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_funct427); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct431); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:3: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WORD||LA15_0==54||LA15_0==56||(LA15_0>=60 && LA15_0<=63)||(LA15_0>=65 && LA15_0<=68)||(LA15_0>=72 && LA15_0<=77)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct435);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct440); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54||(LA18_0>=72 && LA18_0<=77)) ) {
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
                    NoViableAltException nvae =
                        new NoViableAltException("62:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("62:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:11: ( 'final' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==54) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:12: 'final'
                            {
                            match(input,54,FOLLOW_54_in_declare448); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare452);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_declare454); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQUAL||(LA17_0>=PLEQUAL && LA17_0<=MOEQUAL)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare457);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare471);
                            value();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare479); 
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare481);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare495);
                    value();
                    _fsp--;


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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:1: value : ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ;
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:7: ( ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:9: ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:9: ( '(' type ')' )*
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

                            if ( ((LA19_5>=WORD && LA19_5<=CHAR)||LA19_5==51||LA19_5==56||LA19_5==59||(LA19_5>=78 && LA19_5<=79)) ) {
                                alt19=1;
                            }


                        }


                    }
                    else if ( ((LA19_2>=72 && LA19_2<=77)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:10: '(' type ')'
            	    {
            	    match(input,51,FOLLOW_51_in_value505); 
            	    pushFollow(FOLLOW_type_in_value507);
            	    type();
            	    _fsp--;

            	    match(input,52,FOLLOW_52_in_value509); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:3: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:4: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:4: ( 'this' | '(' value ')' | constant | WORD )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt20=1;
                }
                break;
            case 51:
                {
                alt20=2;
                }
                break;
            case STRING:
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case CHAR:
            case 59:
            case 78:
            case 79:
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
                NoViableAltException nvae =
                    new NoViableAltException("67:4: ( 'this' | '(' value ')' | constant | WORD )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: 'this'
                    {
                    match(input,56,FOLLOW_56_in_value517); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:12: '(' value ')'
                    {
                    match(input,51,FOLLOW_51_in_value519); 
                    pushFollow(FOLLOW_value_in_value520);
                    value();
                    _fsp--;

                    match(input,52,FOLLOW_52_in_value521); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:24: constant
                    {
                    pushFollow(FOLLOW_constant_in_value523);
                    constant();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:33: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_value525); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:39: ( '.' WORD )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:40: '.' WORD
            	    {
            	    match(input,58,FOLLOW_58_in_value529); 
            	    match(input,WORD,FOLLOW_WORD_in_value531); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
            int alt22=4;
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
                    alt22=1;
                    }
                    break;
                case INC:
                    {
                    alt22=2;
                    }
                    break;
                case DEC:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                    {
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value540);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_value580);
                    value();
                    _fsp--;


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:120: INC
                    {
                    match(input,INC,FOLLOW_INC_in_value583); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:124: DEC
                    {
                    match(input,DEC,FOLLOW_DEC_in_value585); 

                    }
                    break;

            }


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
    // $ANTLR end value


    // $ANTLR start constant
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt23=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt23=1;
                }
                break;
            case DOUBLE:
                {
                alt23=2;
                }
                break;
            case FLOAT:
                {
                alt23=3;
                }
                break;
            case STRING:
                {
                alt23=4;
                }
                break;
            case CHAR:
                {
                alt23=5;
                }
                break;
            case 78:
            case 79:
                {
                alt23=6;
                }
                break;
            case 59:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("69:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant596); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant600); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant604); 

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant608); 

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant612); 

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant616);
                    boolval();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:57: 'null'
                    {
                    match(input,59,FOLLOW_59_in_constant620); 

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


    // $ANTLR start statement
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:2: ( ( ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt25=5;
            switch ( input.LA(1) ) {
            case WORD:
            case 54:
            case 56:
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
                alt25=1;
                }
                break;
            case 63:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 67:
                {
                alt25=4;
                }
                break;
            case 68:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("71:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:4: ( ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:4: ( ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' )
                    int alt24=6;
                    switch ( input.LA(1) ) {
                    case 54:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        {
                        alt24=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA24_2 = input.LA(2);

                        if ( (LA24_2==EQUAL||(LA24_2>=PLEQUAL && LA24_2<=MOEQUAL)||LA24_2==WORD) ) {
                            alt24=1;
                        }
                        else if ( ((LA24_2>=INC && LA24_2<=DEC)||LA24_2==58) ) {
                            alt24=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("72:5: ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' )", 24, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                        {
                        alt24=2;
                        }
                        break;
                    case 56:
                        {
                        alt24=3;
                        }
                        break;
                    case 66:
                        {
                        alt24=4;
                        }
                        break;
                    case 60:
                        {
                        alt24=5;
                        }
                        break;
                    case 61:
                        {
                        alt24=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("72:5: ( declare | returnstmt | incrstmt | dowhile | 'continue' | 'break' )", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement630);
                            declare();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement634);
                            returnstmt();
                            _fsp--;


                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement638);
                            incrstmt();
                            _fsp--;


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement642);
                            dowhile();
                            _fsp--;


                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:50: 'continue'
                            {
                            match(input,60,FOLLOW_60_in_statement646); 

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:63: 'break'
                            {
                            match(input,61,FOLLOW_61_in_statement650); 

                            }
                            break;

                    }

                    match(input,55,FOLLOW_55_in_statement653); 

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement659);
                    ifstmt();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement663);
                    whilestmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement667);
                    forstmt();
                    _fsp--;


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement671);
                    switchstmt();
                    _fsp--;


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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:11: ( ( 'this' | WORD ) '.' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==WORD) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==58) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==56) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==56 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt678);    throw mse;
                    }

                    match(input,58,FOLLOW_58_in_incrstmt684); 

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt688); 
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt690);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:4: 'return' value
            {
            match(input,62,FOLLOW_62_in_returnstmt702); 
            pushFollow(FOLLOW_value_in_returnstmt704);
            value();
            _fsp--;


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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,63,FOLLOW_63_in_ifstmt711); 
            match(input,51,FOLLOW_51_in_ifstmt713); 
            pushFollow(FOLLOW_value_in_ifstmt715);
            value();
            _fsp--;

            match(input,52,FOLLOW_52_in_ifstmt717); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==WORD||LA28_0==54||LA28_0==56||(LA28_0>=60 && LA28_0<=63)||(LA28_0>=65 && LA28_0<=68)||(LA28_0>=72 && LA28_0<=77)) ) {
                alt28=1;
            }
            else if ( (LA28_0==BLKBEG) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("77:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt720);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt723); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:48: ( statement )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==WORD||LA27_0==54||LA27_0==56||(LA27_0>=60 && LA27_0<=63)||(LA27_0>=65 && LA27_0<=68)||(LA27_0>=72 && LA27_0<=77)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:48: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt725);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt728); 

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,64,FOLLOW_64_in_ifstmt735); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==WORD||LA30_0==54||LA30_0==56||(LA30_0>=60 && LA30_0<=63)||(LA30_0>=65 && LA30_0<=68)||(LA30_0>=72 && LA30_0<=77)) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==BLKBEG) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("78:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt738);
                            statement();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt741); 
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:30: ( statement )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==WORD||LA29_0==54||LA29_0==56||(LA29_0>=60 && LA29_0<=63)||(LA29_0>=65 && LA29_0<=68)||(LA29_0>=72 && LA29_0<=77)) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:30: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt743);
                            	    statement();
                            	    _fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt746); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,65,FOLLOW_65_in_whilestmt758); 
            match(input,51,FOLLOW_51_in_whilestmt760); 
            pushFollow(FOLLOW_value_in_whilestmt762);
            value();
            _fsp--;

            match(input,52,FOLLOW_52_in_whilestmt764); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==WORD||LA33_0==54||LA33_0==56||(LA33_0>=60 && LA33_0<=63)||(LA33_0>=65 && LA33_0<=68)||(LA33_0>=72 && LA33_0<=77)) ) {
                alt33=1;
            }
            else if ( (LA33_0==BLKBEG) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("80:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt767);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt770); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:45: ( statement )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==WORD||LA32_0==54||LA32_0==56||(LA32_0>=60 && LA32_0<=63)||(LA32_0>=65 && LA32_0<=68)||(LA32_0>=72 && LA32_0<=77)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:45: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt772);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt775); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,66,FOLLOW_66_in_dowhile784); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==WORD||LA35_0==54||LA35_0==56||(LA35_0>=60 && LA35_0<=63)||(LA35_0>=65 && LA35_0<=68)||(LA35_0>=72 && LA35_0<=77)) ) {
                alt35=1;
            }
            else if ( (LA35_0==BLKBEG) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("81:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile787);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile790); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:35: ( statement )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==WORD||LA34_0==54||LA34_0==56||(LA34_0>=60 && LA34_0<=63)||(LA34_0>=65 && LA34_0<=68)||(LA34_0>=72 && LA34_0<=77)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:35: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile792);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile795); 

                    }


                    }
                    break;

            }

            match(input,65,FOLLOW_65_in_dowhile799); 
            match(input,51,FOLLOW_51_in_dowhile801); 
            pushFollow(FOLLOW_value_in_dowhile803);
            value();
            _fsp--;

            match(input,52,FOLLOW_52_in_dowhile805); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,67,FOLLOW_67_in_forstmt812); 
            match(input,51,FOLLOW_51_in_forstmt814); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:21: ( declare )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==WORD||LA36_0==54||(LA36_0>=72 && LA36_0<=77)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:21: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt816);
                    declare();
                    _fsp--;


                    }
                    break;

            }

            match(input,55,FOLLOW_55_in_forstmt819); 
            pushFollow(FOLLOW_value_in_forstmt821);
            value();
            _fsp--;

            match(input,55,FOLLOW_55_in_forstmt823); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:44: ( declare | incrstmt )?
            int alt37=3;
            switch ( input.LA(1) ) {
                case 54:
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
                    int LA37_2 = input.LA(2);

                    if ( ((LA37_2>=INC && LA37_2<=DEC)||LA37_2==58) ) {
                        alt37=2;
                    }
                    else if ( (LA37_2==EQUAL||(LA37_2>=PLEQUAL && LA37_2<=MOEQUAL)||LA37_2==WORD) ) {
                        alt37=1;
                    }
                    }
                    break;
                case 56:
                    {
                    alt37=2;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt826);
                    declare();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt828);
                    incrstmt();
                    _fsp--;


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_forstmt832); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==WORD||LA39_0==54||LA39_0==56||(LA39_0>=60 && LA39_0<=63)||(LA39_0>=65 && LA39_0<=68)||(LA39_0>=72 && LA39_0<=77)) ) {
                alt39=1;
            }
            else if ( (LA39_0==BLKBEG) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("82:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt835);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt838); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:87: ( statement )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==WORD||LA38_0==54||LA38_0==56||(LA38_0>=60 && LA38_0<=63)||(LA38_0>=65 && LA38_0<=68)||(LA38_0>=72 && LA38_0<=77)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:87: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt840);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt843); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,68,FOLLOW_68_in_switchstmt853); 
            match(input,51,FOLLOW_51_in_switchstmt855); 
            match(input,WORD,FOLLOW_WORD_in_switchstmt857); 
            match(input,52,FOLLOW_52_in_switchstmt859); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt863); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:3: ( casestmt )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==69) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:3: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt867);
            	    casestmt();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:3: ( defaultstmt )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==71) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:3: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt872);
                    defaultstmt();
                    _fsp--;


                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt877); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:11: 'case' constant ':' ( statement )*
            {
            match(input,69,FOLLOW_69_in_casestmt883); 
            pushFollow(FOLLOW_constant_in_casestmt885);
            constant();
            _fsp--;

            match(input,70,FOLLOW_70_in_casestmt887); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:31: ( statement )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==WORD||LA42_0==54||LA42_0==56||(LA42_0>=60 && LA42_0<=63)||(LA42_0>=65 && LA42_0<=68)||(LA42_0>=72 && LA42_0<=77)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:31: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt889);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:90:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:4: 'default' ':' ( statement )*
            {
            match(input,71,FOLLOW_71_in_defaultstmt898); 
            match(input,70,FOLLOW_70_in_defaultstmt900); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:18: ( statement )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==WORD||LA43_0==54||LA43_0==56||(LA43_0>=60 && LA43_0<=63)||(LA43_0>=65 && LA43_0<=68)||(LA43_0>=72 && LA43_0<=77)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt902);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=72 && input.LA(1)<=77) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=78 && input.LA(1)<=79) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:98:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=80 && input.LA(1)<=82) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
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


 

    public static final BitSet FOLLOW_classdef_in_doc259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_classdef267 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_classdef271 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef273 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_49_in_classdef276 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef278 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef284 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_clsext_in_classdef288 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_fail301 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fail303 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_STRING_in_fail305 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fail307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas330 = new BitSet(new long[]{0x0060000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_53_in_fieldas332 = new BitSet(new long[]{0x0040000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_54_in_fieldas335 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_fieldas338 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas340 = new BitSet(new long[]{0x0080000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas343 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fieldas345 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fieldas349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor357 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_constructor359 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constructor361 = new BitSet(new long[]{0x0010000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor364 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor366 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_constructor369 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor371 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor373 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_constructor379 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor383 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_constructor387 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_constructor392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct399 = new BitSet(new long[]{0x0020000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_53_in_funct401 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct404 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct407 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funct409 = new BitSet(new long[]{0x0010000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct412 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct414 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_57_in_funct417 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct419 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct421 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_52_in_funct427 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct431 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_funct435 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_funct440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_declare448 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_declare452 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare454 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare457 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare479 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare481 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_value505 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_value507 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_value509 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_56_in_value517 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_51_in_value519 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value520 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_value521 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value523 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value525 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_58_in_value529 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value531 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value540 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_constant620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement630 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement634 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement638 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement642 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_60_in_statement646 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61_in_statement650 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_statement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt678 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_incrstmt684 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt688 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_returnstmt702 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_returnstmt704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifstmt711 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ifstmt713 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_ifstmt715 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ifstmt717 = new BitSet(new long[]{0xF140000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt723 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt725 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifstmt735 = new BitSet(new long[]{0xF140000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt741 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt743 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_whilestmt758 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_whilestmt760 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_whilestmt762 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_whilestmt764 = new BitSet(new long[]{0xF140000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt770 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt772 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_dowhile784 = new BitSet(new long[]{0xF140000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile790 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile792 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_dowhile795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_dowhile799 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_dowhile801 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_dowhile803 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_dowhile805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_forstmt812 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_forstmt814 = new BitSet(new long[]{0x00C0000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt816 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_forstmt819 = new BitSet(new long[]{0x0908003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_forstmt821 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_forstmt823 = new BitSet(new long[]{0x0150000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt826 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt828 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt832 = new BitSet(new long[]{0xF140000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt838 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt840 = new BitSet(new long[]{0xF140000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_switchstmt853 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_switchstmt855 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt857 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_switchstmt859 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt863 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt867 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt872 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_casestmt883 = new BitSet(new long[]{0x0800003E00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_constant_in_casestmt885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_casestmt887 = new BitSet(new long[]{0xF140000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_casestmt889 = new BitSet(new long[]{0xF140000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_71_in_defaultstmt898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_defaultstmt900 = new BitSet(new long[]{0xF140000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_defaultstmt902 = new BitSet(new long[]{0xF140000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});

}