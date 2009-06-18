lexer grammar gscript;
@header {
package org.dolphin.parser;
}

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRAC : '{' ;
RBRAC : '}' ;
EQUALS : '=' ;
EQUALS2 : '==' ;
NOT_EQUALS : '!=' ;
GT : '>' ;
GTE : '>=' ;
LT : '<' ;
LTE : '<=' ;
COMMENT1 : '//' ;
T34 : ';' ;
T35 : 'public' ;
T36 : 'private' ;
T37 : 'var' ;
T38 : 'final' ;
T39 : 'static' ;
T40 : ',' ;
T41 : 'begin' ;
T42 : 'end' ;
T43 : 'globalvar' ;
T44 : 'return' ;
T45 : 'exit' ;
T46 : 'if' ;
T47 : 'then' ;
T48 : 'else' ;
T49 : 'elsif' ;
T50 : 'not' ;
T51 : '!' ;
T52 : 'div' ;
T53 : '%' ;
T54 : 'mod' ;
T55 : '|' ;
T56 : '&' ;
T57 : '^' ;
T58 : '<<' ;
T59 : '>>' ;
T60 : '~' ;
T61 : '.' ;
T62 : '&&' ;
T63 : 'and' ;
T64 : '||' ;
T65 : 'or' ;
T66 : '^^' ;
T67 : 'xor' ;
T68 : ':=' ;
T69 : '<>' ;
T70 : 'repeat' ;
T71 : 'break' ;
T72 : 'continue' ;
T73 : 'do' ;
T74 : 'until' ;
T75 : 'while' ;
T76 : 'for' ;
T77 : 'switch' ;
T78 : 'case' ;
T79 : 'default' ;
T80 : ':' ;
T81 : 'with' ;
T82 : '+=' ;
T83 : '-=' ;
T84 : '*=' ;
T85 : '/=' ;
T86 : '|=' ;
T87 : '&=' ;
T88 : '^=' ;
T89 : '[' ;
T90 : ']' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 218
NUMBER : (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 220
HEXNUMBER
: '$' (DIGIT|'a'..'z'|'A'..'Z')*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 224
GLOBALVAR
: 'global' '.' WORD;

//OIVAR : (WORD) ('.' WORD) ; /* Other instance variable */

//INSVAR	:	'(' NUMBER ').'
//	;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 232
DECIMAL : NUMBER '.' NUMBER;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 234
STUPIDDECIMAL 
	:	'.' NUMBER
	;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 238
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 240
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 242
WORD
: ('_'|'a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

//LETTER : 
//;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 250
COMMENT
  : '//' (options {greedy=false;} : .)*    ('\n'|'\r') { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 255
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 259
STRING : (STRING_DOUBLE|STRING_SINGLE)
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 262
JAVACODE 
	:  '#javaBegin' (options {greedy=false;} : .)* '#javaEnd'	
	;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 266
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 274
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
