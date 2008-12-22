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
T37 : ';' ;
T38 : 'public' ;
T39 : 'private' ;
T40 : 'var' ;
T41 : 'final' ;
T42 : 'static' ;
T43 : ',' ;
T44 : 'begin' ;
T45 : 'end' ;
T46 : 'globalvar' ;
T47 : 'return' ;
T48 : 'exit' ;
T49 : 'if' ;
T50 : 'then' ;
T51 : 'else' ;
T52 : 'elsif' ;
T53 : 'not' ;
T54 : '!' ;
T55 : '|' ;
T56 : '&' ;
T57 : '^' ;
T58 : '<<' ;
T59 : '>>' ;
T60 : 'div' ;
T61 : 'mod' ;
T62 : '~' ;
T63 : '&&' ;
T64 : 'and' ;
T65 : '||' ;
T66 : 'or' ;
T67 : '^^' ;
T68 : 'xor' ;
T69 : ':=' ;
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

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 212
NUMBER : (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 214
HEXNUMBER
: '$' (DIGIT|LETTER)*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 218
GLOBALVAR
: 'global' '.' WORD;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 221
OIVAR : WORD '.' WORD ; /* Other instance variable */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 223
DECIMAL : NUMBER '.' NUMBER;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 225
STUPIDDECIMAL 
	:	'.' NUMBER
	;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 229
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 231
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 233
WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 237
LETTER : ('a'..'z'|'A'..'Z')
;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 241
COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 247
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 251
STRING : STRING_DOUBLE|STRING_SINGLE
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 254
JAVACODE 
	:  '@@java_Begin' (options {greedy=false;} : .)* '@@java_End'	
	;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 258
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 

   // $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 267
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
