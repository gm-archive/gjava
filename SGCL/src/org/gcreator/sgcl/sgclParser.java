// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 00:57:40

package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class sgclParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUAL", "EQUAL2", "GTE", "GT", "LTE", "LT", "NEQUAL", "PLEQUAL", "MIEQUAL", "MUEQUAL", "DIEQUAL", "MOEQUAL", "OR", "AND", "BLKBEG", "BLKEND", "CMTSL", "CMTBEG", "CMTEND", "INC", "DEC", "WORD", "INTEGER", "DOUBLE", "FLOAT", "STRING", "CHAR", "ALPHA", "DIGIT", "STRCONTENT", "CHRCONTENT", "WHITESPACE", "LINE", "SLCOMMENT", "MLCOMMENT", "'partial'", "'class'", "'extends'", "'static'", "'this'", "'('", "','", "')'", "'final'", "';'", "'.'", "'return'", "'int'", "'float'", "'double'", "'boolean'", "'char'", "'string'", "'true'", "'false'", "'public'", "'protected'", "'private'"
    };
    public static final int DEC=29;
    public static final int LT=14;
    public static final int MOEQUAL=20;
    public static final int MOD=8;
    public static final int BLKEND=24;
    public static final int STRCONTENT=38;
    public static final int GTE=11;
    public static final int CHAR=35;
    public static final int PLEQUAL=16;
    public static final int SLCOMMENT=42;
    public static final int FLOAT=33;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int WORD=30;
    public static final int INC=28;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=32;
    public static final int PLUS=4;
    public static final int DIGIT=37;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=43;
    public static final int INTEGER=31;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=39;
    public static final int WHITESPACE=40;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int LINE=41;
    public static final int ALPHA=36;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int OR=21;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int STRING=34;

        public sgclParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }



    // $ANTLR start classdef
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:1: classdef : ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND ;
    public final void classdef() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:9: ( ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:11: ( 'partial' )? 'class' WORD ( 'extends' WORD )? BLKBEG ( clsext )* BLKEND
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:11: ( 'partial' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:12: 'partial'
                    {
                    match(input,44,FOLLOW_44_in_classdef243); 

                    }
                    break;

            }

            match(input,45,FOLLOW_45_in_classdef247); 
            match(input,WORD,FOLLOW_WORD_in_classdef249); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:37: ( 'extends' WORD )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:38: 'extends' WORD
                    {
                    match(input,46,FOLLOW_46_in_classdef252); 
                    match(input,WORD,FOLLOW_WORD_in_classdef254); 

                    }
                    break;

            }

            match(input,BLKBEG,FOLLOW_BLKBEG_in_classdef260); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:3: ( clsext )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=64 && LA3_0<=66)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:3: clsext
            	    {
            	    pushFollow(FOLLOW_clsext_in_classdef264);
            	    clsext();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_classdef269); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:1: clsext : ( fieldas | funct | constructor );
    public final void clsext() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:8: ( fieldas | funct | constructor )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=64 && LA4_0<=66)) ) {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    alt4=3;
                    }
                    break;
                case 47:
                    {
                    switch ( input.LA(3) ) {
                    case WORD:
                        {
                        int LA4_5 = input.LA(4);

                        if ( (LA4_5==WORD) ) {
                            int LA4_7 = input.LA(5);

                            if ( (LA4_7==49) ) {
                                alt4=2;
                            }
                            else if ( (LA4_7==EQUAL||(LA4_7>=PLEQUAL && LA4_7<=MOEQUAL)||LA4_7==53) ) {
                                alt4=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 7, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_5==EQUAL||(LA4_5>=PLEQUAL && LA4_5<=MOEQUAL)||LA4_5==53) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                        {
                        alt4=1;
                        }
                        break;
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                        {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==WORD) ) {
                            int LA4_7 = input.LA(5);

                            if ( (LA4_7==49) ) {
                                alt4=2;
                            }
                            else if ( (LA4_7==EQUAL||(LA4_7>=PLEQUAL && LA4_7<=MOEQUAL)||LA4_7==53) ) {
                                alt4=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 7, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 52:
                    {
                    alt4=1;
                    }
                    break;
                case WORD:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==WORD) ) {
                        int LA4_7 = input.LA(4);

                        if ( (LA4_7==49) ) {
                            alt4=2;
                        }
                        else if ( (LA4_7==EQUAL||(LA4_7>=PLEQUAL && LA4_7<=MOEQUAL)||LA4_7==53) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_5==EQUAL||(LA4_5>=PLEQUAL && LA4_5<=MOEQUAL)||LA4_5==53) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                    {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==WORD) ) {
                        int LA4_7 = input.LA(4);

                        if ( (LA4_7==49) ) {
                            alt4=2;
                        }
                        else if ( (LA4_7==EQUAL||(LA4_7>=PLEQUAL && LA4_7<=MOEQUAL)||LA4_7==53) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("45:1: clsext : ( fieldas | funct | constructor );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:10: fieldas
                    {
                    pushFollow(FOLLOW_fieldas_in_clsext277);
                    fieldas();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:20: funct
                    {
                    pushFollow(FOLLOW_funct_in_clsext281);
                    funct();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:28: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_clsext285);
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:1: fieldas : privacy ( 'static' )? declare ;
    public final void fieldas() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:9: ( privacy ( 'static' )? declare )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:11: privacy ( 'static' )? declare
            {
            pushFollow(FOLLOW_privacy_in_fieldas292);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:19: ( 'static' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:19: 'static'
                    {
                    match(input,47,FOLLOW_47_in_fieldas294); 

                    }
                    break;

            }

            pushFollow(FOLLOW_declare_in_fieldas297);
            declare();
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
    // $ANTLR end fieldas


    // $ANTLR start constructor
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:1: constructor : privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void constructor() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:2: ( privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:4: privacy 'this' '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_constructor305);
            privacy();
            _fsp--;

            match(input,48,FOLLOW_48_in_constructor307); 
            match(input,49,FOLLOW_49_in_constructor309); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:23: ( type WORD ( ',' type WORD )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WORD||(LA7_0>=56 && LA7_0<=61)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:24: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_constructor312);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_constructor314); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:34: ( ',' type WORD )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==50) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:35: ',' type WORD
                    	    {
                    	    match(input,50,FOLLOW_50_in_constructor317); 
                    	    pushFollow(FOLLOW_type_in_constructor319);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_constructor321); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_constructor327); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_constructor331); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:3: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WORD||LA8_0==52||(LA8_0>=55 && LA8_0<=61)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_constructor335);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_constructor340); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:1: funct : privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND ;
    public final void funct() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:7: ( privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:9: privacy ( 'static' )? type WORD '(' ( type WORD ( ',' type WORD )* )? ')' BLKBEG ( statement )* BLKEND
            {
            pushFollow(FOLLOW_privacy_in_funct347);
            privacy();
            _fsp--;

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:17: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:17: 'static'
                    {
                    match(input,47,FOLLOW_47_in_funct349); 

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_funct352);
            type();
            _fsp--;

            match(input,WORD,FOLLOW_WORD_in_funct354); 
            match(input,49,FOLLOW_49_in_funct356); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:41: ( type WORD ( ',' type WORD )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==WORD||(LA11_0>=56 && LA11_0<=61)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:42: type WORD ( ',' type WORD )*
                    {
                    pushFollow(FOLLOW_type_in_funct359);
                    type();
                    _fsp--;

                    match(input,WORD,FOLLOW_WORD_in_funct361); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:52: ( ',' type WORD )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==50) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:53: ',' type WORD
                    	    {
                    	    match(input,50,FOLLOW_50_in_funct364); 
                    	    pushFollow(FOLLOW_type_in_funct366);
                    	    type();
                    	    _fsp--;

                    	    match(input,WORD,FOLLOW_WORD_in_funct368); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,51,FOLLOW_51_in_funct374); 
            match(input,BLKBEG,FOLLOW_BLKBEG_in_funct378); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:3: ( statement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WORD||LA12_0==52||(LA12_0>=55 && LA12_0<=61)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:3: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_funct382);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,BLKEND,FOLLOW_BLKEND_in_funct387); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:1: declare : ( ( 'final' )? type )? WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? ';' ;
    public final void declare() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:9: ( ( ( 'final' )? type )? WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:11: ( ( 'final' )? type )? WORD ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )? ';'
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:11: ( ( 'final' )? type )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52||(LA14_0>=56 && LA14_0<=61)) ) {
                alt14=1;
            }
            else if ( (LA14_0==WORD) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==WORD) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:12: ( 'final' )? type
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:12: ( 'final' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==52) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:13: 'final'
                            {
                            match(input,52,FOLLOW_52_in_declare396); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_declare400);
                    type();
                    _fsp--;


                    }
                    break;

            }

            match(input,WORD,FOLLOW_WORD_in_declare404); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:35: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL||(LA15_0>=PLEQUAL && LA15_0<=MOEQUAL)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:36: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL ) value
                    {
                    if ( input.LA(1)==EQUAL||(input.LA(1)>=PLEQUAL && input.LA(1)<=MOEQUAL) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_declare407);    throw mse;
                    }

                    pushFollow(FOLLOW_value_in_declare421);
                    value();
                    _fsp--;


                    }
                    break;

            }

            match(input,53,FOLLOW_53_in_declare425); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:1: value : ( 'this' | ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );
    public final void value() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:7: ( 'this' | ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==54) ) {
                    alt20=2;
                }
                else if ( (LA20_1==51||LA20_1==53) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("57:1: value : ( 'this' | ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA20_0>=WORD && LA20_0<=CHAR)||LA20_0==49||(LA20_0>=62 && LA20_0<=63)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("57:1: value : ( 'this' | ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) ) );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:9: 'this'
                    {
                    match(input,48,FOLLOW_48_in_value432); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:18: ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:18: ( ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:19: ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:19: ( ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:20: ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:20: ( ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:21: ( '(' type ')' )? ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) ) ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:21: ( '(' type ')' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==49) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==WORD) ) {
                            int LA16_3 = input.LA(3);

                            if ( (LA16_3==51) ) {
                                int LA16_5 = input.LA(4);

                                if ( ((LA16_5>=WORD && LA16_5<=CHAR)||(LA16_5>=48 && LA16_5<=49)||(LA16_5>=62 && LA16_5<=63)) ) {
                                    alt16=1;
                                }
                            }
                        }
                        else if ( ((LA16_1>=56 && LA16_1<=61)) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:22: '(' type ')'
                            {
                            match(input,49,FOLLOW_49_in_value440); 
                            pushFollow(FOLLOW_type_in_value442);
                            type();
                            _fsp--;

                            match(input,51,FOLLOW_51_in_value444); 

                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:37: ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt18=1;
                        }
                        break;
                    case INTEGER:
                    case DOUBLE:
                    case FLOAT:
                    case STRING:
                    case CHAR:
                    case 62:
                    case 63:
                        {
                        alt18=2;
                        }
                        break;
                    case WORD:
                    case 48:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("57:37: ( ( '(' value ')' ) | constant | ( ( ( 'this' | WORD ) '.' )? WORD ) )", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:38: ( '(' value ')' )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:38: ( '(' value ')' )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:39: '(' value ')'
                            {
                            match(input,49,FOLLOW_49_in_value450); 
                            pushFollow(FOLLOW_value_in_value452);
                            value();
                            _fsp--;

                            match(input,51,FOLLOW_51_in_value454); 

                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:54: constant
                            {
                            pushFollow(FOLLOW_constant_in_value457);
                            constant();
                            _fsp--;


                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:63: ( ( ( 'this' | WORD ) '.' )? WORD )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:63: ( ( ( 'this' | WORD ) '.' )? WORD )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:64: ( ( 'this' | WORD ) '.' )? WORD
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:64: ( ( 'this' | WORD ) '.' )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==WORD) ) {
                                int LA17_1 = input.LA(2);

                                if ( (LA17_1==54) ) {
                                    alt17=1;
                                }
                            }
                            else if ( (LA17_0==48) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:65: ( 'this' | WORD ) '.'
                                    {
                                    if ( input.LA(1)==WORD||input.LA(1)==48 ) {
                                        input.consume();
                                        errorRecovery=false;
                                    }
                                    else {
                                        MismatchedSetException mse =
                                            new MismatchedSetException(null,input);
                                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value461);    throw mse;
                                    }

                                    match(input,54,FOLLOW_54_in_value467); 

                                    }
                                    break;

                            }

                            match(input,WORD,FOLLOW_WORD_in_value471); 

                            }


                            }
                            break;

                    }

                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:3: ( ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value ) | INC | DEC )?
                    int alt19=4;
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
                            alt19=1;
                            }
                            break;
                        case INC:
                            {
                            alt19=2;
                            }
                            break;
                        case DEC:
                            {
                            alt19=3;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:4: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            {
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:4: ( ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value )
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:5: ( EQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLUS | MINUS | MULT | DIV | MOD | AND | OR ) value
                            {
                            if ( (input.LA(1)>=PLUS && input.LA(1)<=AND) ) {
                                input.consume();
                                errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_value479);    throw mse;
                            }

                            pushFollow(FOLLOW_value_in_value519);
                            value();
                            _fsp--;


                            }


                            }
                            break;
                        case 2 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:119: INC
                            {
                            match(input,INC,FOLLOW_INC_in_value522); 

                            }
                            break;
                        case 3 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:123: DEC
                            {
                            match(input,DEC,FOLLOW_DEC_in_value524); 

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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval );
    public final void constant() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:2: ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval )
            int alt21=6;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt21=1;
                }
                break;
            case DOUBLE:
                {
                alt21=2;
                }
                break;
            case FLOAT:
                {
                alt21=3;
                }
                break;
            case STRING:
                {
                alt21=4;
                }
                break;
            case CHAR:
                {
                alt21=5;
                }
                break;
            case 62:
            case 63:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("59:1: constant : ( INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_constant537); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:14: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_constant541); 

                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:23: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_constant545); 

                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:31: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_constant549); 

                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:40: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_constant553); 

                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:47: boolval
                    {
                    pushFollow(FOLLOW_boolval_in_constant557);
                    boolval();
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
    // $ANTLR end constant


    // $ANTLR start statement
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:1: statement : ( declare | returnstmt );
    public final void statement() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:2: ( declare | returnstmt )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==WORD||LA22_0==52||(LA22_0>=56 && LA22_0<=61)) ) {
                alt22=1;
            }
            else if ( (LA22_0==55) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("61:1: statement : ( declare | returnstmt );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:4: declare
                    {
                    pushFollow(FOLLOW_declare_in_statement565);
                    declare();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:14: returnstmt
                    {
                    pushFollow(FOLLOW_returnstmt_in_statement569);
                    returnstmt();
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


    // $ANTLR start returnstmt
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:1: returnstmt : 'return' value ';' ;
    public final void returnstmt() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:2: ( 'return' value ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:4: 'return' value ';'
            {
            match(input,55,FOLLOW_55_in_returnstmt577); 
            pushFollow(FOLLOW_value_in_returnstmt579);
            value();
            _fsp--;

            match(input,53,FOLLOW_53_in_returnstmt581); 

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


    // $ANTLR start type
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:1: type : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD );
    public final void type() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)==WORD||(input.LA(1)>=56 && input.LA(1)<=61) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:1: boolval : ( 'true' | 'false' );
    public final void boolval() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:9: ( 'true' | 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
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
    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:1: privacy : ( 'public' | 'protected' | 'private' );
    public final void privacy() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:9: ( 'public' | 'protected' | 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>=64 && input.LA(1)<=66) ) {
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


 

    public static final BitSet FOLLOW_44_in_classdef243 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_classdef247 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_classdef249 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_46_in_classdef252 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_classdef254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_classdef260 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_clsext_in_classdef264 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_BLKEND_in_classdef269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldas_in_clsext277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_in_clsext281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_clsext285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_fieldas292 = new BitSet(new long[]{0x3F10800040000000L});
    public static final BitSet FOLLOW_47_in_fieldas294 = new BitSet(new long[]{0x3F10000040000000L});
    public static final BitSet FOLLOW_declare_in_fieldas297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_constructor305 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_constructor307 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constructor309 = new BitSet(new long[]{0x3F08000040000000L});
    public static final BitSet FOLLOW_type_in_constructor312 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_constructor314 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_constructor317 = new BitSet(new long[]{0x3F00000040000000L});
    public static final BitSet FOLLOW_type_in_constructor319 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_constructor321 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_constructor327 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_constructor331 = new BitSet(new long[]{0x3F90000041000000L});
    public static final BitSet FOLLOW_statement_in_constructor335 = new BitSet(new long[]{0x3F90000041000000L});
    public static final BitSet FOLLOW_BLKEND_in_constructor340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_privacy_in_funct347 = new BitSet(new long[]{0x3F00800040000000L});
    public static final BitSet FOLLOW_47_in_funct349 = new BitSet(new long[]{0x3F00000040000000L});
    public static final BitSet FOLLOW_type_in_funct352 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_funct354 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funct356 = new BitSet(new long[]{0x3F08000040000000L});
    public static final BitSet FOLLOW_type_in_funct359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_funct361 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_funct364 = new BitSet(new long[]{0x3F00000040000000L});
    public static final BitSet FOLLOW_type_in_funct366 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_funct368 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_funct374 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_BLKBEG_in_funct378 = new BitSet(new long[]{0x3F90000041000000L});
    public static final BitSet FOLLOW_statement_in_funct382 = new BitSet(new long[]{0x3F90000041000000L});
    public static final BitSet FOLLOW_BLKEND_in_funct387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_declare396 = new BitSet(new long[]{0x3F00000040000000L});
    public static final BitSet FOLLOW_type_in_declare400 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_declare404 = new BitSet(new long[]{0x00200000001F0200L});
    public static final BitSet FOLLOW_set_in_declare407 = new BitSet(new long[]{0xC003000FC0000000L});
    public static final BitSet FOLLOW_value_in_declare421 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_declare425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_value432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_value440 = new BitSet(new long[]{0x3F00000040000000L});
    public static final BitSet FOLLOW_type_in_value442 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_value444 = new BitSet(new long[]{0xC003000FC0000000L});
    public static final BitSet FOLLOW_49_in_value450 = new BitSet(new long[]{0xC003000FC0000000L});
    public static final BitSet FOLLOW_value_in_value452 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_value454 = new BitSet(new long[]{0x00000000307FFFF2L});
    public static final BitSet FOLLOW_constant_in_value457 = new BitSet(new long[]{0x00000000307FFFF2L});
    public static final BitSet FOLLOW_set_in_value461 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_value467 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WORD_in_value471 = new BitSet(new long[]{0x00000000307FFFF2L});
    public static final BitSet FOLLOW_set_in_value479 = new BitSet(new long[]{0xC003000FC0000000L});
    public static final BitSet FOLLOW_value_in_value519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_value522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_value524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_constant541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constant549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constant553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolval_in_constant557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declare_in_statement565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstmt_in_statement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_returnstmt577 = new BitSet(new long[]{0xC003000FC0000000L});
    public static final BitSet FOLLOW_value_in_returnstmt579 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_returnstmt581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_boolval0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_privacy0 = new BitSet(new long[]{0x0000000000000002L});

}