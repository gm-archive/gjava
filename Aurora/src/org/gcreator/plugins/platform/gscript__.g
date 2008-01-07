lexer grammar gscript;
@header {
package org.gcreator.plugins.platform;
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
T53 : '|' ;
T54 : '&' ;
T55 : '^' ;
T56 : '<<' ;
T57 : '>>' ;
T58 : 'div' ;
T59 : 'mod' ;
T60 : '~' ;
T61 : '&&' ;
T62 : 'and' ;
T63 : '||' ;
T64 : 'or' ;
T65 : '^^' ;
T66 : 'xor' ;
T67 : ':=' ;
T68 : 'repeat' ;
T69 : 'break' ;
T70 : 'continue' ;
T71 : 'do' ;
T72 : 'until' ;
T73 : 'while' ;
T74 : 'for' ;
T75 : 'switch' ;
T76 : 'case' ;
T77 : 'default' ;
T78 : ':' ;
T79 : 'with' ;
T80 : '+=' ;
T81 : '-=' ;
T82 : '*=' ;
T83 : '/=' ;
T84 : '|=' ;
T85 : '&=' ;
T86 : '^=' ;
T87 : '.' ;
T88 : '[' ;
T89 : ']' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 204
NUMBER : (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 206
HEXNUMBER
: '$' (DIGIT|LETTER)*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 210
GLOBALVAR
: 'global' '.' WORD;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 213
OIVAR : WORD '.' WORD ; /* Other instance variable */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 215
DECIMAL : NUMBER '.' NUMBER;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 217
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 219
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 221
WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 225
LETTER : ('a'..'z'|'A'..'Z')
;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 229
COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 235
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 239
STRING : STRING_DOUBLE|STRING_SINGLE
;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 242
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 

   // $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gscript.g" 251
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
