lexer grammar parsegmlfunctionlist;

T9 : '#' ;
T10 : '*' ;
T11 : '(' ;
T12 : ',' ;
T13 : '...' ;
T14 : ')' ;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\parsegmlfunctionlist.g" 18
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */


// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\parsegmlfunctionlist.g" 21
WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\parsegmlfunctionlist.g" 25
LETTER : ('a'..'z'|'A'..'Z')
;


// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\parsegmlfunctionlist.g" 29
COMMENT
  : '//' (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
// $ANTLR src "C:\Users\Ali.Ali-Laptop\Documents\NetBeansProjects\G-Creator\Aurora\src\org\gcreator\plugins\platform\parsegmlfunctionlist.g" 35
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
