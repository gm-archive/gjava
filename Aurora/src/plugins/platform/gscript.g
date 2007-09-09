grammar gscript;

options {
k = 3;
backtrack = true;
memoize=true;
}

tokens {
PLUS  = '+' ;
MINUS = '-' ;
MULT = '*' ;
DIV = '/' ;
LPAREN  = '(' ;
RPAREN  = ')' ;
LBRAC = '{' ;
RBRAC = '}';
EQUALS  = '=' ;
EQUALS2  = '==' ;
NOT_EQUALS = '!=' ;
GT = '>';
GTE = '>=';
LT = '<';
LTE = '<=';
COMMENT1 = '//';
DOC_COMMENT;
}



/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/

program

: ((field|method|innerclass) (';'{System.out.println(";");})*)* {//write("hi");
}
;

statement
: (bstatement|varstatement|returnstatement|exitstatement|ifstatement|repeatstatement|dostatement|whilestatement|continuestatement|breakstatement|forstatement|switchstatement|withstatement|function2|assignment|function) (';'{System.out.println(";");})*
;

field 
: ('public'|'private')? ('static')? type=WORD name=WORD '=' (WORD|NUMBER) 
;

method 
:  ('public'|'private')? ('static')? arg=WORD name=WORD '()' bstatement
;

innerclass
	:	'class' WORD (LBRAC|'begin') (field|method)* (RBRAC|'end')
	;

bstatement
: (LBRAC|'begin') (statement)* (RBRAC|'end')
;

varstatement
: type=WORD variable (',' variable)*
;

returnstatement
: 'return' {System.out.print("return ");} (expression)
;

exitstatement
:'exit' {System.out.println("return ;");}
;

ifstatement
: 'if' expression ('then')? (statement) (elsestatement)*
;

elsestatement
: ('else'|('elsif' expression)) (statement)
;

expression
:  (pexpression|relationalExpression|notexpression) (aexpression)* ((andexpression|orexpression|xorexpression) (expression))*
;

notexpression
: ('not'|'!') expression
;

aexpression
: ('+'|'-'|NEGINTEGER|'*'|'/'|'|'|'&'|'^'|'<<'|'>>'|'div'|'mod') (expression)?
; //(NUMBER|HEXNUMBER|STRING|variable)

value : (NUMBER|HEXNUMBER|STRING|variable)
;

pexpression
: LPAREN expression RPAREN
;

andexpression
: ('&&'|'and')
;

orexpression
: ('||'|'or')
;

xorexpression
: ('^^'|'xor')
;

relationalExpression
  :
  (function|HEXNUMBER|STRING|NUMBER|variable|DECIMAL|WORD) ( ('!'|EQUALS|EQUALS2|':='|NOT_EQUALS|GT|GTE|LT|LTE) (function|HEXNUMBER|STRING|NUMBER|variable|WORD))*
  ;
 
repeatstatement
: 'repeat' expression (statement)
;

breakstatement
: 'break'  {System.out.println("break;");}
;
continuestatement
: 'continue' {System.out.println("continue;");}
;

dostatement
: 'do' statement 'until' expression
;

whilestatement
: 'while' expression (statement)
;

forstatement
: 'for' '(' statement expression ';' statement ')' statement
;

switchstatement
: 'switch' (expression) '{' (('case'|'default') expression ':' (statement)*)* '}'//BETA
;

withstatement
: 'with'  expression  statement
;

assignment
: variable ('='|':='|'+='|'-='|'*='|'/='|'|='|'&\\'| '^=') expression
;

variable
: array|WORD|OIVAR|GLOBALVAR
;

function: WORD '(' (expression ((',') (expression)?)*)? ')'
;

function2
	:	OIVAR '(' (expression ((',') (expression)?)*)? ')'
	;

array  : (WORD|OIVAR|GLOBALVAR) '[' expression ']'
;

//definestatement: '#define' WORD //used for testing scripts
//;



/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/


NEGINTEGER
: ('-') NUMBER
;

NUMBER : ('-')? (DIGIT)+ ;

HEXNUMBER
: '$' (DIGIT|LETTER)*
;

GLOBALVAR
: 'global' '.' WORD;

OIVAR : WORD '.' WORD ; /* Other instance variable */

DECIMAL : NUMBER '.' NUMBER;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

fragment DIGIT : '0'..'9' ;

WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;

LETTER : ('a'..'z'|'A'..'Z')
;


COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
ML_COMMENT
    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;
   
STRING : STRING_DOUBLE|STRING_SINGLE
;
  
STRING_DOUBLE
  : '"'
    ( '"' '"'
    | ~('"')
    )*
    ( '"')
   ;
 

   STRING_SINGLE
    : '\''
    ( '\'' '\''
    | ~('\'')
    )*
    ( '\'')
    ;
