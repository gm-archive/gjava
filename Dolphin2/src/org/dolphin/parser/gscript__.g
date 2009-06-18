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
T35 : ';' ;
T36 : 'public' ;
T37 : 'private' ;
T38 : 'var' ;
T39 : 'final' ;
T40 : 'static' ;
T41 : ',' ;
T42 : 'begin' ;
T43 : 'end' ;
T44 : 'globalvar' ;
T45 : 'return' ;
T46 : 'exit' ;
T47 : 'if' ;
T48 : 'then' ;
T49 : 'else' ;
T50 : 'elsif' ;
T51 : 'not' ;
T52 : '!' ;
T53 : 'div' ;
T54 : '%' ;
T55 : 'mod' ;
T56 : '|' ;
T57 : '&' ;
T58 : '^' ;
T59 : '<<' ;
T60 : '>>' ;
T61 : '~' ;
T62 : '.' ;
T63 : '&&' ;
T64 : 'and' ;
T65 : '||' ;
T66 : 'or' ;
T67 : '^^' ;
T68 : 'xor' ;
T69 : ':=' ;
T70 : '<>' ;
T71 : 'repeat' ;
T72 : 'break' ;
T73 : 'continue' ;
T74 : 'do' ;
T75 : 'until' ;
T76 : 'while' ;
T77 : 'for' ;
T78 : 'switch' ;
T79 : 'case' ;
T80 : 'default' ;
T81 : ':' ;
T82 : 'with' ;
T83 : '+=' ;
T84 : '-=' ;
T85 : '*=' ;
T86 : '/=' ;
T87 : '|=' ;
T88 : '&=' ;
T89 : '^=' ;
T90 : '[' ;
T91 : ']' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 218
NUMBER : (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 220
HEXNUMBER
: '$' (DIGIT|'a'..'z'|'A'..'Z')*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 224
GLOBALVAR
: 'global' '.' WORD;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 227
OIVAR : (WORD) ('.' WORD) ; /* Other instance variable */

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
