grammar parsegmlfunctionlist;

options {
k = 3;
backtrack = true;
memoize=true;
}

start	:	(variable|function)*
	;
variable : WORD ('#')? ('*')*
	;
	
function 
	:	w=WORD {System.out.print("public static Object "+$w.text+"(");}'('(ww=WORD {System.out.print("Object "+$ww.text);} (',' (www=WORD{System.out.print(", Object "+$www.text);}|'...'))*)?')'{System.out.println(")\n{\nreturn new Object();\n}\n");}
	;
	
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */


WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
;

LETTER : ('a'..'z'|'A'..'Z')
;


COMMENT
  : '//' (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
