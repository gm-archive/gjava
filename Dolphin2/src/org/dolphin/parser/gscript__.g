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
T89 : '.' ;
T90 : '[' ;
T91 : ']' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 215
NUMBER : (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 217
HEXNUMBER
: '$' (DIGIT|'a'..'z'|'A'..'Z')*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 221
GLOBALVAR
: 'global' '.' WORD;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 224
OIVAR : WORD '.' WORD ; /* Other instance variable */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 226
DECIMAL : NUMBER '.' NUMBER;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 228
STUPIDDECIMAL 
	:	'.' NUMBER
	;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 232
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 234
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 236
WORD
: ('_'|'a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

//LETTER : 
//;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 244
COMMENT
  : '//' (options {greedy=false;} : .)*    ('\n'|'\r') { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 249
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 253
STRING : (STRING_DOUBLE|STRING_SINGLE)
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 256
JAVACODE 
	:  '#javaBegin' (options {greedy=false;} : .)* '#javaEnd'	
	;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 260
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 268
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
