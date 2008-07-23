// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 16:51:07

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
            ruleMemo = new HashMap[156+1];
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

                if ( ((LA3_0>=80 && LA3_0<=82)) ) {
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


    // $ANTLR start clsext
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=80 && LA4_0<=82)) ) {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt4=3;
                    }
                    break;
                case 50:
                    {
                    switch ( input.LA(3) ) {
                    case 51:
                        {
                        alt4=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==54) ) {
                            alt4=2;
                        }
                        else if ( (LA4_5==WORD) ) {
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
                                    new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

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
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==WORD) ) {
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
                                    new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

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
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==54) ) {
                        alt4=2;
                    }
                    else if ( (LA4_5==WORD) ) {
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
                                new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

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
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==WORD) ) {
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
                                new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("53:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext313);
                    fieldas();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext317);
                    funct();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext321);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas328);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==50) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,50,FOLLOW_50_in_fieldas330); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:29: ( 'final' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'final'
                    {
                    match(input,51,FOLLOW_51_in_fieldas333); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas336);
            type();
            _fsp--;
            if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_fieldas338); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:48: ( EQUAL value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas341); if (failed) return ;
                    pushFollow(FOLLOW_value_in_fieldas343);
                    value();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_fieldas347); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor355);
            privacy();
            _fsp--;
            if (failed) return ;
            match(input,53,FOLLOW_53_in_constructor357); if (failed) return ;
            match(input,54,FOLLOW_54_in_constructor359); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:23: ( type WORD ( ',' type WORD )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD||(LA9_0>=72 && LA9_0<=77)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor362);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_constructor364); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:34: ( ',' type WORD )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==55) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:35: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_constructor367); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_constructor369);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_constructor371); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_constructor377); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor381); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:3: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WORD||LA10_0==51||(LA10_0>=53 && LA10_0<=54)||LA10_0==57||(LA10_0>=60 && LA10_0<=63)||(LA10_0>=65 && LA10_0<=68)||(LA10_0>=72 && LA10_0<=77)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor385);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor390); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:1: funct : privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:7: ( privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:9: privacy ( 'static' )? ( type )? WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct397);
            privacy();
            _fsp--;
            if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:17: ( 'static' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: 'static'
                    {
                    match(input,50,FOLLOW_50_in_funct399); if (failed) return ;

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:27: ( type )?
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: type
                    {
                    pushFollow(FOLLOW_type_in_funct402);
                    type();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_funct405); if (failed) return ;
            match(input,54,FOLLOW_54_in_funct407); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:42: ( type WORD ( ',' type WORD )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==WORD||(LA14_0>=72 && LA14_0<=77)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:43: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct410);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_funct412); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:53: ( ',' type WORD )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==55) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:54: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_funct415); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_funct417);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_funct419); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_funct425); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct429); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:3: ( statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WORD||LA15_0==51||(LA15_0>=53 && LA15_0<=54)||LA15_0==57||(LA15_0>=60 && LA15_0<=63)||(LA15_0>=65 && LA15_0<=68)||(LA15_0>=72 && LA15_0<=77)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct433);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct438); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51||(LA18_0>=72 && LA18_0<=77)) ) {
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
                        new NoViableAltException("64:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("64:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:11: ( 'final' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==51) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:12: 'final'
                            {
                            match(input,51,FOLLOW_51_in_declare446); if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare450);
                    type();
                    _fsp--;
                    if (failed) return ;
                    match(input,WORD,FOLLOW_WORD_in_declare452); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==EQUAL||(LA17_0>=PLEQUAL && LA17_0<=MOEQUAL)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare455);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare469);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare477); if (failed) return ;
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare479);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare493);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:7: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt28=2;
            switch ( input.LA(1) ) {
            case 54:
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
                        new NoViableAltException("68:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
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
                        new NoViableAltException("68:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case 57:
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
                        new NoViableAltException("68:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 4, input);

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
                alt28=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("68:1: value : ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) | ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:9: ( '(' type ')' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==54) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==WORD) ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3==56) ) {
                                    int LA19_5 = input.LA(4);

                                    if ( (LA19_5==WORD||(LA19_5>=53 && LA19_5<=54)||LA19_5==57) ) {
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
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:10: '(' type ')'
                    	    {
                    	    match(input,54,FOLLOW_54_in_value503); if (failed) return ;
                    	    pushFollow(FOLLOW_type_in_value505);
                    	    type();
                    	    _fsp--;
                    	    if (failed) return ;
                    	    match(input,56,FOLLOW_56_in_value507); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=53 && LA21_0<=54)||LA21_0==57) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==WORD) ) {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==58) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                            int alt20=4;
                            switch ( input.LA(1) ) {
                            case 53:
                                {
                                alt20=1;
                                }
                                break;
                            case 57:
                                {
                                alt20=2;
                                }
                                break;
                            case 54:
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
                                    new NoViableAltException("69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 20, 0, input);

                                throw nvae;
                            }

                            switch (alt20) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:6: 'this'
                                    {
                                    match(input,53,FOLLOW_53_in_value516); if (failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:13: 'super'
                                    {
                                    match(input,57,FOLLOW_57_in_value518); if (failed) return ;

                                    }
                                    break;
                                case 3 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:21: ( '(' value ')' )
                                    {
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:21: ( '(' value ')' )
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:22: '(' value ')'
                                    {
                                    match(input,54,FOLLOW_54_in_value521); if (failed) return ;
                                    pushFollow(FOLLOW_value_in_value522);
                                    value();
                                    _fsp--;
                                    if (failed) return ;
                                    match(input,56,FOLLOW_56_in_value523); if (failed) return ;

                                    }


                                    }
                                    break;
                                case 4 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:35: WORD
                                    {
                                    match(input,WORD,FOLLOW_WORD_in_value526); if (failed) return ;

                                    }
                                    break;

                            }

                            match(input,58,FOLLOW_58_in_value529); if (failed) return ;

                            }
                            break;

                    }

                    match(input,WORD,FOLLOW_WORD_in_value533); if (failed) return ;
                    match(input,54,FOLLOW_54_in_value535); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:56: ( value ( ',' value )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=WORD && LA23_0<=CHAR)||(LA23_0>=53 && LA23_0<=54)||LA23_0==57||LA23_0==59||(LA23_0>=78 && LA23_0<=79)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:57: value ( ',' value )*
                            {
                            pushFollow(FOLLOW_value_in_value538);
                            value();
                            _fsp--;
                            if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:63: ( ',' value )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==55) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:64: ',' value
                            	    {
                            	    match(input,55,FOLLOW_55_in_value541); if (failed) return ;
                            	    pushFollow(FOLLOW_value_in_value543);
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

                    match(input,56,FOLLOW_56_in_value549); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=PLUS && LA24_0<=AND)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value554);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value594);
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
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:6: ( ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:7: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:8: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:8: ( 'this' | '(' value ')' | constant | WORD )
                    int alt25=4;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt25=1;
                        }
                        break;
                    case 54:
                        {
                        alt25=2;
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
                            new NoViableAltException("71:8: ( 'this' | '(' value ')' | constant | WORD )", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:9: 'this'
                            {
                            match(input,53,FOLLOW_53_in_value607); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:16: '(' value ')'
                            {
                            match(input,54,FOLLOW_54_in_value609); if (failed) return ;
                            pushFollow(FOLLOW_value_in_value610);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,56,FOLLOW_56_in_value611); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:28: constant
                            {
                            pushFollow(FOLLOW_constant_in_value613);
                            constant();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:37: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_value615); if (failed) return ;

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:43: ( '.' WORD )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==58) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:44: '.' WORD
                    	    {
                    	    match(input,58,FOLLOW_58_in_value619); if (failed) return ;
                    	    match(input,WORD,FOLLOW_WORD_in_value621); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
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
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value630);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value670);
                            value();
                            _fsp--;
                            if (failed) return ;

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:120: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value673); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:124: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value675); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
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
            case 78:
            case 79:
                {
                alt29=6;
                }
                break;
            case 59:
                {
                alt29=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("73:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant688); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant692); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant696); if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant700); if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant704); if (failed) return ;

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant708);
                    boolval();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:57: 'null'
                    {
                    match(input,59,FOLLOW_59_in_constant712); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:1: fnccall : ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ;
    public final void fnccall() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:9: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:11: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=53 && LA31_0<=54)||LA31_0==57) ) {
                alt31=1;
            }
            else if ( (LA31_0==WORD) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==58) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                    int alt30=4;
                    switch ( input.LA(1) ) {
                    case 53:
                        {
                        alt30=1;
                        }
                        break;
                    case 57:
                        {
                        alt30=2;
                        }
                        break;
                    case 54:
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
                            new NoViableAltException("75:12: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:13: 'this'
                            {
                            match(input,53,FOLLOW_53_in_fnccall721); if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:20: 'super'
                            {
                            match(input,57,FOLLOW_57_in_fnccall723); if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:28: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:28: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:29: '(' value ')'
                            {
                            match(input,54,FOLLOW_54_in_fnccall726); if (failed) return ;
                            pushFollow(FOLLOW_value_in_fnccall728);
                            value();
                            _fsp--;
                            if (failed) return ;
                            match(input,56,FOLLOW_56_in_fnccall730); if (failed) return ;

                            }


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:44: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_fnccall733); if (failed) return ;

                            }
                            break;

                    }

                    match(input,58,FOLLOW_58_in_fnccall736); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_fnccall740); if (failed) return ;
            match(input,54,FOLLOW_54_in_fnccall742); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:65: ( value ( ',' value )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=WORD && LA33_0<=CHAR)||(LA33_0>=53 && LA33_0<=54)||LA33_0==57||LA33_0==59||(LA33_0>=78 && LA33_0<=79)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:66: value ( ',' value )*
                    {
                    pushFollow(FOLLOW_value_in_fnccall745);
                    value();
                    _fsp--;
                    if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:72: ( ',' value )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==55) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:73: ',' value
                    	    {
                    	    match(input,55,FOLLOW_55_in_fnccall748); if (failed) return ;
                    	    pushFollow(FOLLOW_value_in_fnccall750);
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

            match(input,56,FOLLOW_56_in_fnccall756); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:2: ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt )
            int alt35=5;
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
                alt35=1;
                }
                break;
            case 63:
                {
                alt35=2;
                }
                break;
            case 65:
                {
                alt35=3;
                }
                break;
            case 67:
                {
                alt35=4;
                }
                break;
            case 68:
                {
                alt35=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("76:1: statement : ( ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt | switchstmt );", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:4: ( ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )
                    int alt34=7;
                    switch ( input.LA(1) ) {
                    case 51:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        {
                        alt34=1;
                        }
                        break;
                    case WORD:
                        {
                        switch ( input.LA(2) ) {
                        case 58:
                            {
                            int LA34_9 = input.LA(3);

                            if ( (LA34_9==WORD) ) {
                                int LA34_11 = input.LA(4);

                                if ( ((LA34_11>=INC && LA34_11<=DEC)) ) {
                                    alt34=3;
                                }
                                else if ( (LA34_11==54) ) {
                                    alt34=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 9, input);

                                throw nvae;
                            }
                            }
                            break;
                        case INC:
                        case DEC:
                            {
                            alt34=3;
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
                        case 54:
                            {
                            alt34=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 62:
                        {
                        alt34=2;
                        }
                        break;
                    case 53:
                        {
                        int LA34_4 = input.LA(2);

                        if ( (LA34_4==58) ) {
                            int LA34_9 = input.LA(3);

                            if ( (LA34_9==WORD) ) {
                                int LA34_11 = input.LA(4);

                                if ( ((LA34_11>=INC && LA34_11<=DEC)) ) {
                                    alt34=3;
                                }
                                else if ( (LA34_11==54) ) {
                                    alt34=5;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 11, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 9, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                        {
                        alt34=4;
                        }
                        break;
                    case 54:
                    case 57:
                        {
                        alt34=5;
                        }
                        break;
                    case 60:
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
                            new NoViableAltException("77:5: ( declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break' )", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement766);
                            declare();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement770);
                            returnstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement774);
                            incrstmt();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:40: dowhile
                            {
                            pushFollow(FOLLOW_dowhile_in_statement778);
                            dowhile();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:50: fnccall
                            {
                            pushFollow(FOLLOW_fnccall_in_statement782);
                            fnccall();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 6 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:60: 'continue'
                            {
                            match(input,60,FOLLOW_60_in_statement786); if (failed) return ;

                            }
                            break;
                        case 7 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:73: 'break'
                            {
                            match(input,61,FOLLOW_61_in_statement790); if (failed) return ;

                            }
                            break;

                    }

                    match(input,52,FOLLOW_52_in_statement793); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:4: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement799);
                    ifstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:13: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement803);
                    whilestmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:25: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement807);
                    forstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:35: switchstmt
                    {
                    pushFollow(FOLLOW_switchstmt_in_statement811);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: ( ( 'this' | WORD ) '.' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==WORD) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==58) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==53 ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt818);    throw mse;
                    }

                    match(input,58,FOLLOW_58_in_incrstmt824); if (failed) return ;

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt828); if (failed) return ;
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt830);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:81:4: 'return' value
            {
            match(input,62,FOLLOW_62_in_returnstmt842); if (failed) return ;
            pushFollow(FOLLOW_value_in_returnstmt844);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,63,FOLLOW_63_in_ifstmt851); if (failed) return ;
            match(input,54,FOLLOW_54_in_ifstmt853); if (failed) return ;
            pushFollow(FOLLOW_value_in_ifstmt855);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_ifstmt857); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WORD||LA38_0==51||(LA38_0>=53 && LA38_0<=54)||LA38_0==57||(LA38_0>=60 && LA38_0<=63)||(LA38_0>=65 && LA38_0<=68)||(LA38_0>=72 && LA38_0<=77)) ) {
                alt38=1;
            }
            else if ( (LA38_0==BLKBEG) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("82:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt860);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt863); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:82:48: ( statement )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==WORD||LA37_0==51||(LA37_0>=53 && LA37_0<=54)||LA37_0==57||(LA37_0>=60 && LA37_0<=63)||(LA37_0>=65 && LA37_0<=68)||(LA37_0>=72 && LA37_0<=77)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt865);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt868); if (failed) return ;

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==64) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred111()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,64,FOLLOW_64_in_ifstmt875); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==WORD||LA40_0==51||(LA40_0>=53 && LA40_0<=54)||LA40_0==57||(LA40_0>=60 && LA40_0<=63)||(LA40_0>=65 && LA40_0<=68)||(LA40_0>=72 && LA40_0<=77)) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==BLKBEG) ) {
                        alt40=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("83:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt878);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt881); if (failed) return ;
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:30: ( statement )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==WORD||LA39_0==51||(LA39_0>=53 && LA39_0<=54)||LA39_0==57||(LA39_0>=60 && LA39_0<=63)||(LA39_0>=65 && LA39_0<=68)||(LA39_0>=72 && LA39_0<=77)) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt883);
                            	    statement();
                            	    _fsp--;
                            	    if (failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt886); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,65,FOLLOW_65_in_whilestmt898); if (failed) return ;
            match(input,54,FOLLOW_54_in_whilestmt900); if (failed) return ;
            pushFollow(FOLLOW_value_in_whilestmt902);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_whilestmt904); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
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
                    new NoViableAltException("85:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt907);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt910); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:85:45: ( statement )*
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
                    	    pushFollow(FOLLOW_statement_in_whilestmt912);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt915); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: dowhile : 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' ;
    public final void dowhile() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:9: ( 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:11: 'do' ( statement | ( BLKBEG ( statement )* BLKEND ) ) 'while' '(' value ')'
            {
            match(input,66,FOLLOW_66_in_dowhile924); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==WORD||LA45_0==51||(LA45_0>=53 && LA45_0<=54)||LA45_0==57||(LA45_0>=60 && LA45_0<=63)||(LA45_0>=65 && LA45_0<=68)||(LA45_0>=72 && LA45_0<=77)) ) {
                alt45=1;
            }
            else if ( (LA45_0==BLKBEG) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("86:16: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:17: statement
                    {
                    pushFollow(FOLLOW_statement_in_dowhile927);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:27: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:27: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:28: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_dowhile930); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:35: ( statement )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==WORD||LA44_0==51||(LA44_0>=53 && LA44_0<=54)||LA44_0==57||(LA44_0>=60 && LA44_0<=63)||(LA44_0>=65 && LA44_0<=68)||(LA44_0>=72 && LA44_0<=77)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_dowhile932);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_dowhile935); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,65,FOLLOW_65_in_dowhile939); if (failed) return ;
            match(input,54,FOLLOW_54_in_dowhile941); if (failed) return ;
            pushFollow(FOLLOW_value_in_dowhile943);
            value();
            _fsp--;
            if (failed) return ;
            match(input,56,FOLLOW_56_in_dowhile945); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,67,FOLLOW_67_in_forstmt952); if (failed) return ;
            match(input,54,FOLLOW_54_in_forstmt954); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:21: ( declare )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==WORD||LA46_0==51||(LA46_0>=72 && LA46_0<=77)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt956);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_forstmt959); if (failed) return ;
            pushFollow(FOLLOW_value_in_forstmt961);
            value();
            _fsp--;
            if (failed) return ;
            match(input,52,FOLLOW_52_in_forstmt963); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:44: ( declare | incrstmt )?
            int alt47=3;
            switch ( input.LA(1) ) {
                case 51:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                    {
                    alt47=1;
                    }
                    break;
                case WORD:
                    {
                    int LA47_2 = input.LA(2);

                    if ( ((LA47_2>=INC && LA47_2<=DEC)||LA47_2==58) ) {
                        alt47=2;
                    }
                    else if ( (LA47_2==EQUAL||(LA47_2>=PLEQUAL && LA47_2<=MOEQUAL)||LA47_2==WORD) ) {
                        alt47=1;
                    }
                    }
                    break;
                case 53:
                    {
                    alt47=2;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt966);
                    declare();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt968);
                    incrstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_forstmt972); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD||LA49_0==51||(LA49_0>=53 && LA49_0<=54)||LA49_0==57||(LA49_0>=60 && LA49_0<=63)||(LA49_0>=65 && LA49_0<=68)||(LA49_0>=72 && LA49_0<=77)) ) {
                alt49=1;
            }
            else if ( (LA49_0==BLKBEG) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("87:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt975);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt978); if (failed) return ;
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:87:87: ( statement )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==WORD||LA48_0==51||(LA48_0>=53 && LA48_0<=54)||LA48_0==57||(LA48_0>=60 && LA48_0<=63)||(LA48_0>=65 && LA48_0<=68)||(LA48_0>=72 && LA48_0<=77)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt980);
                    	    statement();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt983); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:88:1: switchstmt : 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND ;
    public final void switchstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:2: ( 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:89:4: 'switch' '(' WORD ')' BLKBEG ( casestmt )* ( defaultstmt )? BLKEND
            {
            match(input,68,FOLLOW_68_in_switchstmt993); if (failed) return ;
            match(input,54,FOLLOW_54_in_switchstmt995); if (failed) return ;
            match(input,WORD,FOLLOW_WORD_in_switchstmt997); if (failed) return ;
            match(input,56,FOLLOW_56_in_switchstmt999); if (failed) return ;
            match(input,BLKBEG,FOLLOW_BLKBEG_in_switchstmt1003); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:91:3: ( casestmt )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==69) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: casestmt
            	    {
            	    pushFollow(FOLLOW_casestmt_in_switchstmt1007);
            	    casestmt();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:92:3: ( defaultstmt )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==71) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: defaultstmt
                    {
                    pushFollow(FOLLOW_defaultstmt_in_switchstmt1012);
                    defaultstmt();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,BLKEND,FOLLOW_BLKEND_in_switchstmt1017); if (failed) return ;

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:1: casestmt : 'case' constant ':' ( statement )* ;
    public final void casestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:9: ( 'case' constant ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:11: 'case' constant ':' ( statement )*
            {
            match(input,69,FOLLOW_69_in_casestmt1023); if (failed) return ;
            pushFollow(FOLLOW_constant_in_casestmt1025);
            constant();
            _fsp--;
            if (failed) return ;
            match(input,70,FOLLOW_70_in_casestmt1027); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:94:31: ( statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==WORD||LA52_0==51||(LA52_0>=53 && LA52_0<=54)||LA52_0==57||(LA52_0>=60 && LA52_0<=63)||(LA52_0>=65 && LA52_0<=68)||(LA52_0>=72 && LA52_0<=77)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casestmt1029);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:95:1: defaultstmt : 'default' ':' ( statement )* ;
    public final void defaultstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:2: ( 'default' ':' ( statement )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:4: 'default' ':' ( statement )*
            {
            match(input,71,FOLLOW_71_in_defaultstmt1038); if (failed) return ;
            match(input,70,FOLLOW_70_in_defaultstmt1040); if (failed) return ;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:96:18: ( statement )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==WORD||LA53_0==51||(LA53_0>=53 && LA53_0<=54)||LA53_0==57||(LA53_0>=60 && LA53_0<=63)||(LA53_0>=65 && LA53_0<=68)||(LA53_0>=72 && LA53_0<=77)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultstmt1042);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:97:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:101:9: ( 'true' | 'false' )
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:103:9: ( 'public' | 'protected' | 'private' )
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

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:9: ( ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:9: ( '(' type ')' )* ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:9: ( '(' type ')' )*
        loop60:
        do {
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==WORD) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==56) ) {
                        int LA60_5 = input.LA(4);

                        if ( (LA60_5==WORD||(LA60_5>=53 && LA60_5<=54)||LA60_5==57) ) {
                            alt60=1;
                        }


                    }


                }
                else if ( ((LA60_2>=72 && LA60_2<=77)) ) {
                    alt60=1;
                }


            }


            switch (alt60) {
        	case 1 :
        	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:10: '(' type ')'
        	    {
        	    match(input,54,FOLLOW_54_in_synpred56503); if (failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred56505);
        	    type();
        	    _fsp--;
        	    if (failed) return ;
        	    match(input,56,FOLLOW_56_in_synpred56507); if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop60;
            }
        } while (true);

        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:3: ( ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )? )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )? WORD '(' ( value ( ',' value )* )? ')' ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:4: ( ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.' )?
        int alt62=2;
        int LA62_0 = input.LA(1);

        if ( ((LA62_0>=53 && LA62_0<=54)||LA62_0==57) ) {
            alt62=1;
        }
        else if ( (LA62_0==WORD) ) {
            int LA62_2 = input.LA(2);

            if ( (LA62_2==58) ) {
                alt62=1;
            }
        }
        switch (alt62) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD ) '.'
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )
                int alt61=4;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    alt61=1;
                    }
                    break;
                case 57:
                    {
                    alt61=2;
                    }
                    break;
                case 54:
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
                        new NoViableAltException("69:5: ( 'this' | 'super' | ( '(' value ')' ) | WORD )", 61, 0, input);

                    throw nvae;
                }

                switch (alt61) {
                    case 1 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:6: 'this'
                        {
                        match(input,53,FOLLOW_53_in_synpred56516); if (failed) return ;

                        }
                        break;
                    case 2 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:13: 'super'
                        {
                        match(input,57,FOLLOW_57_in_synpred56518); if (failed) return ;

                        }
                        break;
                    case 3 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:21: ( '(' value ')' )
                        {
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:21: ( '(' value ')' )
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:22: '(' value ')'
                        {
                        match(input,54,FOLLOW_54_in_synpred56521); if (failed) return ;
                        pushFollow(FOLLOW_value_in_synpred56522);
                        value();
                        _fsp--;
                        if (failed) return ;
                        match(input,56,FOLLOW_56_in_synpred56523); if (failed) return ;

                        }


                        }
                        break;
                    case 4 :
                        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:35: WORD
                        {
                        match(input,WORD,FOLLOW_WORD_in_synpred56526); if (failed) return ;

                        }
                        break;

                }

                match(input,58,FOLLOW_58_in_synpred56529); if (failed) return ;

                }
                break;

        }

        match(input,WORD,FOLLOW_WORD_in_synpred56533); if (failed) return ;
        match(input,54,FOLLOW_54_in_synpred56535); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:56: ( value ( ',' value )* )?
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( ((LA64_0>=WORD && LA64_0<=CHAR)||(LA64_0>=53 && LA64_0<=54)||LA64_0==57||LA64_0==59||(LA64_0>=78 && LA64_0<=79)) ) {
            alt64=1;
        }
        switch (alt64) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:57: value ( ',' value )*
                {
                pushFollow(FOLLOW_value_in_synpred56538);
                value();
                _fsp--;
                if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:63: ( ',' value )*
                loop63:
                do {
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==55) ) {
                        alt63=1;
                    }


                    switch (alt63) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:64: ',' value
                	    {
                	    match(input,55,FOLLOW_55_in_synpred56541); if (failed) return ;
                	    pushFollow(FOLLOW_value_in_synpred56543);
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

        match(input,56,FOLLOW_56_in_synpred56549); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:3: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )?
        int alt65=2;
        int LA65_0 = input.LA(1);

        if ( ((LA65_0>=PLUS && LA65_0<=AND)) ) {
            alt65=1;
        }
        switch (alt65) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:4: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                {
                if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred56554);    throw mse;
                }

                pushFollow(FOLLOW_value_in_synpred56594);
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
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:4: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
        {
        match(input,64,FOLLOW_64_in_synpred111875); if (failed) return ;
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==WORD||LA70_0==51||(LA70_0>=53 && LA70_0<=54)||LA70_0==57||(LA70_0>=60 && LA70_0<=63)||(LA70_0>=65 && LA70_0<=68)||(LA70_0>=72 && LA70_0<=77)) ) {
            alt70=1;
        }
        else if ( (LA70_0==BLKBEG) ) {
            alt70=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("83:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 70, 0, input);

            throw nvae;
        }
        switch (alt70) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:12: statement
                {
                pushFollow(FOLLOW_statement_in_synpred111878);
                statement();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:22: ( BLKBEG ( statement )* BLKEND )
                {
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:22: ( BLKBEG ( statement )* BLKEND )
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:23: BLKBEG ( statement )* BLKEND
                {
                match(input,BLKBEG,FOLLOW_BLKBEG_in_synpred111881); if (failed) return ;
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:83:30: ( statement )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==WORD||LA69_0==51||(LA69_0>=53 && LA69_0<=54)||LA69_0==57||(LA69_0>=60 && LA69_0<=63)||(LA69_0>=65 && LA69_0<=68)||(LA69_0>=72 && LA69_0<=77)) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:0:0: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_synpred111883);
                	    statement();
                	    _fsp--;
                	    if (failed) return ;

                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);

                match(input,BLKEND,FOLLOW_BLKEND_in_synpred111886); if (failed) return ;

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
    public static final BitSet FOLLOW_BLKBEG_in_classdef296 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_clsext_in_classdef300 = new BitSet(new long[]{0x0000000001000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_BLKEND_in_classdef305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas328 = new BitSet(new long[]{0x000C000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_50_in_fieldas330 = new BitSet(new long[]{0x0008000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_51_in_fieldas333 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_fieldas336 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas338 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas341 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fieldas343 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldas347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor355 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_constructor357 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_constructor359 = new BitSet(new long[]{0x0100000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor362 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor364 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_constructor367 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_constructor369 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor371 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_constructor377 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor381 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_constructor385 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_constructor390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct397 = new BitSet(new long[]{0x0004000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_50_in_funct399 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct402 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct405 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funct407 = new BitSet(new long[]{0x0100000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct410 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct412 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_funct415 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_funct417 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct419 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_funct425 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct429 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_funct433 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_funct438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declare446 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_declare450 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare452 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare455 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare477 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare479 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_declare493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_value503 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_value505 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value507 = new BitSet(new long[]{0x0260000100000000L});
    public static final BitSet FOLLOW_53_in_value516 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_value518 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_value521 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value522 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value523 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_value526 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_value529 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value533 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_value535 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value538 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_value541 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value543 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_value549 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_value554 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_value607 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_54_in_value609 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value610 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value611 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value613 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value615 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_58_in_value619 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value621 = new BitSet(new long[]{0x04000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value630 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_value670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_constant712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fnccall721 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_fnccall723 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_fnccall726 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall728 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fnccall730 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall733 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_fnccall736 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fnccall740 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_fnccall742 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall745 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_fnccall748 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_fnccall750 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_fnccall756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement766 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement770 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement774 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_dowhile_in_statement778 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fnccall_in_statement782 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60_in_statement786 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_61_in_statement790 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchstmt_in_statement811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt818 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_incrstmt824 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt828 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_returnstmt842 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_returnstmt844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ifstmt851 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifstmt853 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_ifstmt855 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt857 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt863 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt865 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ifstmt875 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt881 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_ifstmt883 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_whilestmt898 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whilestmt900 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_whilestmt902 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_whilestmt904 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt910 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_whilestmt912 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_dowhile924 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_dowhile930 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_dowhile932 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_dowhile935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_dowhile939 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_dowhile941 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_dowhile943 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_dowhile945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_forstmt952 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_forstmt954 = new BitSet(new long[]{0x0018000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt956 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt959 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_forstmt961 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt963 = new BitSet(new long[]{0x0128000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_declare_in_forstmt966 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt968 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_forstmt972 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt978 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_forstmt980 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_switchstmt993 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_switchstmt995 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_switchstmt997 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_switchstmt999 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_switchstmt1003 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_casestmt_in_switchstmt1007 = new BitSet(new long[]{0x0000000001000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_defaultstmt_in_switchstmt1012 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_BLKEND_in_switchstmt1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_casestmt1023 = new BitSet(new long[]{0x0800003E00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_constant_in_casestmt1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_casestmt1027 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_casestmt1029 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_71_in_defaultstmt1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_defaultstmt1040 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_defaultstmt1042 = new BitSet(new long[]{0xF268000100000002L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred56503 = new BitSet(new long[]{0x0000000100000000L,0x0000000000003F00L});
    public static final BitSet FOLLOW_type_in_synpred56505 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred56507 = new BitSet(new long[]{0x0260000100000000L});
    public static final BitSet FOLLOW_53_in_synpred56516 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_57_in_synpred56518 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54_in_synpred56521 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred56522 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred56523 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WORD_in_synpred56526 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred56529 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_synpred56533 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred56535 = new BitSet(new long[]{0x0B60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred56538 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_synpred56541 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred56543 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_synpred56549 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_set_in_synpred56554 = new BitSet(new long[]{0x0A60003F00000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_value_in_synpred56594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred111875 = new BitSet(new long[]{0xF268000100800000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_synpred111878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_synpred111881 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_statement_in_synpred111883 = new BitSet(new long[]{0xF268000101000000L,0x0000000000003F1EL});
    public static final BitSet FOLLOW_BLKEND_in_synpred111886 = new BitSet(new long[]{0x0000000000000002L});

}