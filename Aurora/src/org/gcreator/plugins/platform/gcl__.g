lexer grammar gcl;
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
T36 : ';' ;
T37 : 'public' ;
T38 : 'private' ;
T39 : 'static' ;
T40 : ',' ;
T41 : 'class' ;
T42 : 'begin' ;
T43 : 'end' ;
T44 : 'return' ;
T45 : 'exit' ;
T46 : 'if' ;
T47 : 'then' ;
T48 : 'else' ;
T49 : 'elsif' ;
T50 : 'not' ;
T51 : '!' ;
T52 : '|' ;
T53 : '&' ;
T54 : '^' ;
T55 : '<<' ;
T56 : '>>' ;
T57 : 'div' ;
T58 : 'mod' ;
T59 : '&&' ;
T60 : 'and' ;
T61 : '||' ;
T62 : 'or' ;
T63 : '^^' ;
T64 : 'xor' ;
T65 : ':=' ;
T66 : 'repeat' ;
T67 : 'break' ;
T68 : 'continue' ;
T69 : 'do' ;
T70 : 'until' ;
T71 : 'while' ;
T72 : 'for' ;
T73 : 'switch' ;
T74 : 'case' ;
T75 : 'default' ;
T76 : ':' ;
T77 : 'with' ;
T78 : '+=' ;
T79 : '-=' ;
T80 : '*=' ;
T81 : '/=' ;
T82 : '|=' ;
T83 : '&\\' ;
T84 : '^=' ;
T85 : '[' ;
T86 : ']' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 198
NEGINTEGER
: ('-') NUMBER
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 202
NUMBER : ('-')? (DIGIT)+ ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 204
HEXNUMBER
: '$' (DIGIT|LETTER)*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 208
GLOBALVAR
: 'global' '.' WORD;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 211
OIVAR : WORD '.' WORD ; /* Other instance variable */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 213
DECIMAL : NUMBER '.' NUMBER;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 215
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 217
fragment DIGIT : '0'..'9' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 219
WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 223
LETTER : ('a'..'z'|'A'..'Z')
;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 227
COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 233
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 237
STRING : STRING_DOUBLE|STRING_SINGLE
;
  
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 240
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 

   // $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\gcl.g" 249
STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
