// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 14:11:44

package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class sgclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "DCMTB", "DCMTE", "INC", "DEC", "WORD", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "DCOMMENT", "'partial'", "'class'", "'extends'", "'static'", "'final'", "';'", "'this'", "'('", "','", "')'", "'.'", "'null'", "'continue'", "'break'", "'return'", "'if'", "'else'", "'while'", "'for'", "'int'", "'float'", "'double'", "'boolean'", "'char'", "'string'", "'true'", "'false'", "'public'", "'protected'", "'private'"
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:9: ( ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:11: ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:11: ( 'partial' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:12: 'partial'
                    {
                    match(input,47,FOLLOW_47_in_classdef273); 

                    }
                    break;

            }

            match(input,48,FOLLOW_48_in_classdef277); 
            match(input,WORD,FOLLOW_WORD_in_classdef279); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:37: ( 'extends' WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:38: 'extends' WORD
                    {
                    match(input,49,FOLLOW_49_in_classdef282); 
                    match(input,WORD,FOLLOW_WORD_in_classdef284); 

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef290); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:3: ( clsext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=74 && LA3_0<=76)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:3: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef294);
            	    clsext();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef299); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=74 && LA4_0<=76)) ) {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==51) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==WORD||(LA4_2>=66 && LA4_2<=71)) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==WORD) ) {
                            int LA4_6 = input.LA(5);

                            if ( (LA4_6==54) ) {
                                alt4=2;
                            }
                            else if ( (LA4_6==EQUAL||LA4_6==52) ) {
                                alt4=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==WORD) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==54) ) {
                            alt4=2;
                        }
                        else if ( (LA4_6==EQUAL||LA4_6==52) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 53:
                    {
                    alt4=3;
                    }
                    break;
                case 51:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("50:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext307);
                    fieldas();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext311);
                    funct();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext315);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:1: fieldas : privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:9: ( privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:11: privacy ( 'static' )? ( 'final' )? type WORD ( EQUAL value )? ';'
            {
            pushFollow(FOLLOW_privacy_in_fieldas322);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==50) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:19: 'static'
                    {
                    match(input,50,FOLLOW_50_in_fieldas324); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:29: ( 'final' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==51) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:29: 'final'
                    {
                    match(input,51,FOLLOW_51_in_fieldas327); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_fieldas330);
            type();
            _fsp--;

            match(input,WORD,FOLLOW_WORD_in_fieldas332); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:48: ( EQUAL value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:49: EQUAL value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_fieldas335); 
                    pushFollow(FOLLOW_value_in_fieldas337);
                    value();
                    _fsp--;


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_fieldas341); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor349);
            privacy();
            _fsp--;

            match(input,53,FOLLOW_53_in_constructor351); 
            match(input,54,FOLLOW_54_in_constructor353); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:23: ( type WORD ( ',' type WORD )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD||(LA9_0>=66 && LA9_0<=71)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor356);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_constructor358); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:34: ( ',' type WORD )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==55) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:35: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_constructor361); 
                    	    pushFollow(FOLLOW_type_in_constructor363);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_constructor365); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_constructor371); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor375); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:3: ( statement )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WORD||LA10_0==51||LA10_0==53||(LA10_0>=59 && LA10_0<=62)||(LA10_0>=64 && LA10_0<=71)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor379);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor384); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:1: funct : privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:7: ( privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:9: privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct391);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:17: ( 'static' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:17: 'static'
                    {
                    match(input,50,FOLLOW_50_in_funct393); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_funct396);
            type();
            _fsp--;

            match(input,WORD,FOLLOW_WORD_in_funct398); 
            match(input,54,FOLLOW_54_in_funct400); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:41: ( type WORD ( ',' type WORD )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==WORD||(LA13_0>=66 && LA13_0<=71)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:42: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct403);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_funct405); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:52: ( ',' type WORD )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==55) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:53: ',' type WORD
                    	    {
                    	    match(input,55,FOLLOW_55_in_funct408); 
                    	    pushFollow(FOLLOW_type_in_funct410);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_funct412); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_funct418); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct422); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:3: ( statement )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WORD||LA14_0==51||LA14_0==53||(LA14_0>=59 && LA14_0<=62)||(LA14_0>=64 && LA14_0<=71)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct426);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct431); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:9: ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51||(LA17_0>=66 && LA17_0<=71)) ) {
                alt17=1;
            }
            else if ( (LA17_0==WORD) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==EQUAL||(LA17_2>=PLEQUAL && LA17_2<=MOEQUAL)) ) {
                    alt17=2;
                }
                else if ( (LA17_2==WORD) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("61:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("61:1: declare : ( ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? | WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:11: ( 'final' )? type WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:11: ( 'final' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==51) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:12: 'final'
                            {
                            match(input,51,FOLLOW_51_in_declare439); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare443);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_declare445); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:32: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==EQUAL||(LA16_0>=PLEQUAL && LA16_0<=MOEQUAL)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:33: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                            {
                            if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                                input.consume();
                                errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare448);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_declare462);
                            value();
                            _fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:5: WORD ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    match(input,WORD,FOLLOW_WORD_in_declare470); 
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare472);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare486);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:1: value : ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ;
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:7: ( ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:9: ( '(' type ')' )* ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:9: ( '(' type ')' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==WORD) ) {
                        int LA18_3 = input.LA(3);

                        if ( (LA18_3==56) ) {
                            int LA18_5 = input.LA(4);

                            if ( ((LA18_5>=WORD && LA18_5<=CHAR)||(LA18_5>=53 && LA18_5<=54)||LA18_5==58||(LA18_5>=72 && LA18_5<=73)) ) {
                                alt18=1;
                            }


                        }


                    }
                    else if ( ((LA18_2>=66 && LA18_2<=71)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:10: '(' type ')'
            	    {
            	    match(input,54,FOLLOW_54_in_value496); 
            	    pushFollow(FOLLOW_type_in_value498);
            	    type();
            	    _fsp--;

            	    match(input,56,FOLLOW_56_in_value500); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:3: ( ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:4: ( 'this' | '(' value ')' | constant | WORD ) ( '.' WORD )* ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:4: ( 'this' | '(' value ')' | constant | WORD )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt19=1;
                }
                break;
            case 54:
                {
                alt19=2;
                }
                break;
            case INTEGER:
            case DOUBLE:
            case FLOAT:
            case STRING:
            case CHAR:
            case 58:
            case 72:
            case 73:
                {
                alt19=3;
                }
                break;
            case WORD:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("66:4: ( 'this' | '(' value ')' | constant | WORD )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:5: 'this'
                    {
                    match(input,53,FOLLOW_53_in_value508); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:12: '(' value ')'
                    {
                    match(input,54,FOLLOW_54_in_value510); 
                    pushFollow(FOLLOW_value_in_value511);
                    value();
                    _fsp--;

                    match(input,56,FOLLOW_56_in_value512); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:24: constant
                    {
                    pushFollow(FOLLOW_constant_in_value514);
                    constant();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:33: WORD
                    {
                    match(input,WORD,FOLLOW_WORD_in_value516); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:39: ( '.' WORD )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:40: '.' WORD
            	    {
            	    match(input,57,FOLLOW_57_in_value520); 
            	    match(input,WORD,FOLLOW_WORD_in_value522); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:4: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
            int alt21=4;
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
                    alt21=1;
                    }
                    break;
                case INC:
                    {
                    alt21=2;
                    }
                    break;
                case DEC:
                    {
                    alt21=3;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:6: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                    {
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value531);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_value571);
                    value();
                    _fsp--;


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:120: INC
                    {
                    match(input,INC,FOLLOW_INC_in_value574); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:124: DEC
                    {
                    match(input,DEC,FOLLOW_DEC_in_value576); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' )
            int alt22=7;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt22=1;
                }
                break;
            case DOUBLE:
                {
                alt22=2;
                }
                break;
            case FLOAT:
                {
                alt22=3;
                }
                break;
            case STRING:
                {
                alt22=4;
                }
                break;
            case CHAR:
                {
                alt22=5;
                }
                break;
            case 72:
            case 73:
                {
                alt22=6;
                }
                break;
            case 58:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("68:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null' );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant587); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant591); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant595); 

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant599); 

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant603); 

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant607);
                    boolval();
                    _fsp--;


                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:57: 'null'
                    {
                    match(input,58,FOLLOW_58_in_constant611); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:1: statement : ( ( ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:2: ( ( ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt )
            int alt24=4;
            switch ( input.LA(1) ) {
            case WORD:
            case 51:
            case 53:
            case 59:
            case 60:
            case 61:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt24=1;
                }
                break;
            case 62:
                {
                alt24=2;
                }
                break;
            case 64:
                {
                alt24=3;
                }
                break;
            case 65:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("70:1: statement : ( ( ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';' ) | ifstmt | whilestmt | forstmt );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:4: ( ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( declare | returnstmt | incrstmt | 'continue' | 'break' ) ';'
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( declare | returnstmt | incrstmt | 'continue' | 'break' )
                    int alt23=5;
                    switch ( input.LA(1) ) {
                    case 51:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                        {
                        alt23=1;
                        }
                        break;
                    case WORD:
                        {
                        int LA23_2 = input.LA(2);

                        if ( ((LA23_2>=INC && LA23_2<=DEC)||LA23_2==57) ) {
                            alt23=3;
                        }
                        else if ( (LA23_2==EQUAL||(LA23_2>=PLEQUAL && LA23_2<=MOEQUAL)||LA23_2==WORD) ) {
                            alt23=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("71:5: ( declare | returnstmt | incrstmt | 'continue' | 'break' )", 23, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        alt23=2;
                        }
                        break;
                    case 53:
                        {
                        alt23=3;
                        }
                        break;
                    case 59:
                        {
                        alt23=4;
                        }
                        break;
                    case 60:
                        {
                        alt23=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("71:5: ( declare | returnstmt | incrstmt | 'continue' | 'break' )", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:6: declare
                            {
                            pushFollow(FOLLOW_declare_in_statement621);
                            declare();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:16: returnstmt
                            {
                            pushFollow(FOLLOW_returnstmt_in_statement625);
                            returnstmt();
                            _fsp--;


                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:29: incrstmt
                            {
                            pushFollow(FOLLOW_incrstmt_in_statement629);
                            incrstmt();
                            _fsp--;


                            }
                            break;
                        case 4 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:40: 'continue'
                            {
                            match(input,59,FOLLOW_59_in_statement633); 

                            }
                            break;
                        case 5 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:53: 'break'
                            {
                            match(input,60,FOLLOW_60_in_statement637); 

                            }
                            break;

                    }

                    match(input,52,FOLLOW_52_in_statement640); 

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:69: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_statement645);
                    ifstmt();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:78: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_statement649);
                    whilestmt();
                    _fsp--;


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:90: forstmt
                    {
                    pushFollow(FOLLOW_forstmt_in_statement653);
                    forstmt();
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:1: incrstmt : ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) ;
    public final void incrstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:9: ( ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:11: ( ( 'this' | WORD ) '.' )? WORD ( INC | DEC )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:11: ( ( 'this' | WORD ) '.' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WORD) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==57) ) {
                    alt25=1;
                }
            }
            else if ( (LA25_0==53) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:12: ( 'this' | WORD ) '.'
                    {
                    if ( input.LA(1)==WORD||input.LA(1)==53 ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt660);    throw mse;
                    }

                    match(input,57,FOLLOW_57_in_incrstmt666); 

                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_incrstmt670); 
            if ( (input.LA(1)>=INC && input.LA(1)<=DEC) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_incrstmt672);    throw mse;
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:1: returnstmt : 'return' value ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:2: ( 'return' value )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:74:4: 'return' value
            {
            match(input,61,FOLLOW_61_in_returnstmt684); 
            pushFollow(FOLLOW_value_in_returnstmt686);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:1: ifstmt : 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? ;
    public final void ifstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:8: ( 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )? )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:10: 'if' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            {
            match(input,62,FOLLOW_62_in_ifstmt693); 
            match(input,54,FOLLOW_54_in_ifstmt695); 
            pushFollow(FOLLOW_value_in_ifstmt697);
            value();
            _fsp--;

            match(input,56,FOLLOW_56_in_ifstmt699); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==WORD||LA27_0==51||LA27_0==53||(LA27_0>=59 && LA27_0<=62)||(LA27_0>=64 && LA27_0<=71)) ) {
                alt27=1;
            }
            else if ( (LA27_0==BLKBEG) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("75:29: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:30: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifstmt702);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:40: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:40: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:41: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt705); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:48: ( statement )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==WORD||LA26_0==51||LA26_0==53||(LA26_0>=59 && LA26_0<=62)||(LA26_0>=64 && LA26_0<=71)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:75:48: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifstmt707);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt710); 

                    }


                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:3: ( 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:4: 'else' ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    {
                    match(input,63,FOLLOW_63_in_ifstmt717); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==WORD||LA29_0==51||LA29_0==53||(LA29_0>=59 && LA29_0<=62)||(LA29_0>=64 && LA29_0<=71)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==BLKBEG) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("76:11: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:12: statement
                            {
                            pushFollow(FOLLOW_statement_in_ifstmt720);
                            statement();
                            _fsp--;


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:22: ( BLKBEG ( statement )* BLKEND )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:22: ( BLKBEG ( statement )* BLKEND )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:23: BLKBEG ( statement )* BLKEND
                            {
                            match(input,BLKBEG,FOLLOW_BLKBEG_in_ifstmt723); 
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:30: ( statement )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==WORD||LA28_0==51||LA28_0==53||(LA28_0>=59 && LA28_0<=62)||(LA28_0>=64 && LA28_0<=71)) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:76:30: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_ifstmt725);
                            	    statement();
                            	    _fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);

                            match(input,BLKEND,FOLLOW_BLKEND_in_ifstmt728); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:77:1: whilestmt : 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void whilestmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:2: ( 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:4: 'while' '(' value ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,64,FOLLOW_64_in_whilestmt740); 
            match(input,54,FOLLOW_54_in_whilestmt742); 
            pushFollow(FOLLOW_value_in_whilestmt744);
            value();
            _fsp--;

            match(input,56,FOLLOW_56_in_whilestmt746); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==WORD||LA32_0==51||LA32_0==53||(LA32_0>=59 && LA32_0<=62)||(LA32_0>=64 && LA32_0<=71)) ) {
                alt32=1;
            }
            else if ( (LA32_0==BLKBEG) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("78:26: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:27: statement
                    {
                    pushFollow(FOLLOW_statement_in_whilestmt749);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:37: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:37: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:38: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_whilestmt752); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:45: ( statement )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==WORD||LA31_0==51||LA31_0==53||(LA31_0>=59 && LA31_0<=62)||(LA31_0>=64 && LA31_0<=71)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:78:45: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_whilestmt754);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_whilestmt757); 

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


    // $ANTLR start forstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:1: forstmt : 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) ;
    public final void forstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:9: ( 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:11: 'for' '(' ( declare )? ';' value ';' ( declare | incrstmt )? ')' ( statement | ( BLKBEG ( statement )* BLKEND ) )
            {
            match(input,65,FOLLOW_65_in_forstmt766); 
            match(input,54,FOLLOW_54_in_forstmt768); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:21: ( declare )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==WORD||LA33_0==51||(LA33_0>=66 && LA33_0<=71)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:21: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt770);
                    declare();
                    _fsp--;


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_forstmt773); 
            pushFollow(FOLLOW_value_in_forstmt775);
            value();
            _fsp--;

            match(input,52,FOLLOW_52_in_forstmt777); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:44: ( declare | incrstmt )?
            int alt34=3;
            switch ( input.LA(1) ) {
                case 51:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                    {
                    alt34=1;
                    }
                    break;
                case WORD:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==EQUAL||(LA34_2>=PLEQUAL && LA34_2<=MOEQUAL)||LA34_2==WORD) ) {
                        alt34=1;
                    }
                    else if ( ((LA34_2>=INC && LA34_2<=DEC)||LA34_2==57) ) {
                        alt34=2;
                    }
                    }
                    break;
                case 53:
                    {
                    alt34=2;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:45: declare
                    {
                    pushFollow(FOLLOW_declare_in_forstmt780);
                    declare();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:53: incrstmt
                    {
                    pushFollow(FOLLOW_incrstmt_in_forstmt782);
                    incrstmt();
                    _fsp--;


                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_forstmt786); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==WORD||LA36_0==51||LA36_0==53||(LA36_0>=59 && LA36_0<=62)||(LA36_0>=64 && LA36_0<=71)) ) {
                alt36=1;
            }
            else if ( (LA36_0==BLKBEG) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("79:68: ( statement | ( BLKBEG ( statement )* BLKEND ) )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:69: statement
                    {
                    pushFollow(FOLLOW_statement_in_forstmt789);
                    statement();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:79: ( BLKBEG ( statement )* BLKEND )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:79: ( BLKBEG ( statement )* BLKEND )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:80: BLKBEG ( statement )* BLKEND
                    {
                    match(input,BLKBEG,FOLLOW_BLKBEG_in_forstmt792); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:87: ( statement )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==WORD||LA35_0==51||LA35_0==53||(LA35_0>=59 && LA35_0<=62)||(LA35_0>=64 && LA35_0<=71)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:79:87: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_forstmt794);
                    	    statement();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,BLKEND,FOLLOW_BLKEND_in_forstmt797); 

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


    // $ANTLR start type
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:80:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=66 && input.LA(1)<=71) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:84:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=72 && input.LA(1)<=73) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:86:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=74 && input.LA(1)<=76) ) {
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
    public static final BitSet FOLLOW_47_in_classdef273 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_classdef277 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef279 = new BitSet(new long[]{0x0002000000800000L});
    public static final BitSet FOLLOW_49_in_classdef282 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_classdef284 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef290 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_clsext_in_classdef294 = new BitSet(new long[]{0x0000000001000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_BLKEND_in_classdef299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas322 = new BitSet(new long[]{0x000C000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_50_in_fieldas324 = new BitSet(new long[]{0x0008000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_51_in_fieldas327 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_fieldas330 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_fieldas332 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_EQUAL_in_fieldas335 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_fieldas337 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldas341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor349 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_constructor351 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_constructor353 = new BitSet(new long[]{0x0100000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_constructor356 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor358 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_constructor361 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_constructor363 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_constructor365 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_constructor371 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor375 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_constructor379 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_constructor384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct391 = new BitSet(new long[]{0x0004000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_50_in_funct393 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_funct396 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct398 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funct400 = new BitSet(new long[]{0x0100000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_funct403 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct405 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55_in_funct408 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_funct410 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_funct412 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_funct418 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct422 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_funct426 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_funct431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_declare439 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_declare443 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_declare445 = new BitSet(new long[]{0x00000000001F0202L});
    public static final BitSet FOLLOW_set_in_declare448 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_declare462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_declare470 = new BitSet(new long[]{0x00000000001F0200L});
    public static final BitSet FOLLOW_set_in_declare472 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_declare486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_value496 = new BitSet(new long[]{0x0000000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_type_in_value498 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value500 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_53_in_value508 = new BitSet(new long[]{0x02000000C07FFFF2L});
    public static final BitSet FOLLOW_54_in_value510 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_value511 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_value512 = new BitSet(new long[]{0x02000000C07FFFF2L});
    public static final BitSet FOLLOW_constant_in_value514 = new BitSet(new long[]{0x02000000C07FFFF2L});
    public static final BitSet FOLLOW_WORD_in_value516 = new BitSet(new long[]{0x02000000C07FFFF2L});
    public static final BitSet FOLLOW_57_in_value520 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_value522 = new BitSet(new long[]{0x02000000C07FFFF2L});
    public static final BitSet FOLLOW_set_in_value531 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_value571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_constant611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement621 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_returnstmt_in_statement625 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_statement629 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_59_in_statement633 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_60_in_statement637 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_incrstmt660 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_incrstmt666 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_WORD_in_incrstmt670 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_incrstmt672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_returnstmt684 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_returnstmt686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ifstmt693 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifstmt695 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_ifstmt697 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ifstmt699 = new BitSet(new long[]{0x7828000100800000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_ifstmt702 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt705 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_ifstmt707 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt710 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ifstmt717 = new BitSet(new long[]{0x7828000100800000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_ifstmt720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_ifstmt723 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_ifstmt725 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_ifstmt728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_whilestmt740 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whilestmt742 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_whilestmt744 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_whilestmt746 = new BitSet(new long[]{0x7828000100800000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_whilestmt749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_whilestmt752 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_whilestmt754 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_whilestmt757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_forstmt766 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_forstmt768 = new BitSet(new long[]{0x0018000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_declare_in_forstmt770 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt773 = new BitSet(new long[]{0x0460003F00000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_value_in_forstmt775 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forstmt777 = new BitSet(new long[]{0x0128000100000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_declare_in_forstmt780 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_incrstmt_in_forstmt782 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_forstmt786 = new BitSet(new long[]{0x7828000100800000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_forstmt789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLKBEG_in_forstmt792 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_statement_in_forstmt794 = new BitSet(new long[]{0x7828000101000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_BLKEND_in_forstmt797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});

}