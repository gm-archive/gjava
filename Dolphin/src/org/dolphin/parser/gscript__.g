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
T36 : ';' ;
T37 : 'public' ;
T38 : 'private' ;
T39 : 'var' ;
T40 : 'final' ;
T41 : 'static' ;
T42 : ',' ;
T43 : 'begin' ;
T44 : 'end' ;
T45 : 'globalvar' ;
T46 : 'return' ;
T47 : 'exit' ;
T48 : 'if' ;
T49 : 'then' ;
T50 : 'else' ;
T51 : 'elsif' ;
T52 : 'not' ;
T53 : '!' ;
T54 : '|' ;
T55 : '&' ;
T56 : '^' ;
T57 : '<<' ;
T58 : '>>' ;
T59 : 'div' ;
T60 : 'mod' ;
T61 : '~' ;
T62 : '&&' ;
T63 : 'and' ;
T64 : '||' ;
T65 : 'or' ;
T66 : '^^' ;
T67 : 'xor' ;
T68 : ':=' ;
T69 : 'repeat' ;
T70 : 'break' ;
T71 : 'continue' ;
T72 : 'do' ;
T73 : 'until' ;
T74 : 'while' ;
T75 : 'for' ;
T76 : 'switch' ;
T77 : 'case' ;
T78 : 'default' ;
T79 : ':' ;
T80 : 'with' ;
T81 : '+=' ;
T82 : '-=' ;
T83 : '*=' ;
T84 : '/=' ;
T85 : '|=' ;
T86 : '&=' ;
T87 : '^=' ;
T88 : '.' ;
T89 : '[' ;
T90 : ']' ;

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
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 227
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 229
WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 233
LETTER : ('a'..'z'|'A'..'Z')
;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 237
COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 243
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 247
STRING : STRING_DOUBLE|STRING_SINGLE
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 250
JAVACODE 
	:  '@@java_Begin' (options {greedy=false;} : .)* '@@java_End'	
	;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 254
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 

   // $ANTLR src "C:\Users\Ali.Ali-Laptop\workspace\LGJ\src\org\dolphin\parser\gscript.g" 263
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
