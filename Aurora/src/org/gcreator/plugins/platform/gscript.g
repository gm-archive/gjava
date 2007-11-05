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
@members {
public PlatformCore pc;

public void setPlatform(PlatformCore p)
{
pc = p;
}

}

@header {
package org.gcreator.plugins.platform;
import org.gcreator.plugins.*;
}

@lexer::header {
package org.gcreator.plugins.platform;
}


/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/

program returns [String value]
: ((field|method|innerclass) (';'{System.out.println(";");})*)* {
//write("hi");
}
;

code // never put: returns after this!
: {System.out.println("Start parsing value ");} ((statement)*)	{System.out.println("Parsed code in antlr!");} 
	;

statement returns [String value]
: {System.out.print("statement: ");} (bstatement|varstatement|returnstatement|exitstatement|ifstatement|repeatstatement|dostatement|whilestatement|continuestatement|breakstatement|forstatement|switchstatement|withstatement|function2|assignment|function) (';'{System.out.println(";");})* {System.out.print("statement ");}
;

field returns [String value]
: ('public'|'private')? ('static')? type=WORD name=WORD '=' (WORD|NUMBER) 
;

method returns [String value]
:  ('public'|'private')? ('static')? arg=WORD name=WORD '()' bstatement
;

innerclass returns [String value]
	:	'class' WORD (LBRAC|'begin') (field|method)* (RBRAC|'end')
	;

bstatement returns [String value]
: {System.out.println("bstatement ");} (LBRAC|'begin') (statement)* (RBRAC|'end') {System.out.print("bstatement ");}
;

varstatement returns [String value] @init {String s = "";}
: {System.out.println("var statement ");} type=WORD (vari=variable{s = ""+$vari.value;}| ass=assignment{s = ""+$ass.value;})  (',' (varii=variable{s += ", "+$varii.value;}| ass=assignment{s += ","+ $ass.value;}) )* {System.out.println(" endvar statement ");} {pc.varstatement($type.text,s);} 
;

returnstatement returns [String value]
: 'return' {System.out.print("return ");} (expression) {$value ="";}
;

exitstatement returns [String value]
:'exit' {System.out.println("exit statement");} {$value ="";}
;

ifstatement returns [String value]
: {System.out.println("if statement ");} 'if' expression ('then')? (statement) (elsestatement)*  {$value ="";}
;

elsestatement returns [String value]
: ('else'|('elsif' expression)) (statement) {$value ="";}
;

expression returns [String value] @init {String a = "";}
:  e=(pexpression|relationalExpression|notexpression) (aa=aexpression {a+= $aa.text;})* ((andexpression|orexpression|xorexpression) (expression))* {$value ="";}
;

notexpression returns [String value]
: n=('not'|'!') e=expression {$value=$n.text+" "+$e.text;}
;

aexpression returns [String value]
: a=('+'|'-'|NEGINTEGER|'*'|'/'|'|'|'&'|'^'|'<<'|'>>'|'div'|'mod') (expression)? {$value=$a.text;}
; //(NUMBER|HEXNUMBER|STRING|variable)

value returns [String value] : a=(NUMBER|HEXNUMBER|STRING|variable) {$value=$a.text;}
;

pexpression returns [String value]
: LPAREN e=expression RPAREN {$value=$e.text;}
;

andexpression returns [String value]
: a=('&&'|'and') {$value=$a.text;}
;

orexpression returns [String value]
: o=('||'|'or') {$value =$o.text;}
;

xorexpression returns [String value]
: x=('^^'|'xor') {$value =$x.text;}
;

relationalExpression returns [String value]
  :
  (function|HEXNUMBER|STRING|NUMBER|variable|DECIMAL|WORD) ( ('!'|EQUALS|EQUALS2|':='|NOT_EQUALS|GT|GTE|LT|LTE) (function|HEXNUMBER|STRING|NUMBER|variable|WORD))* {$value ="";}
  ;
 
repeatstatement returns [String value]
: 'repeat' expression (statement) {$value ="";}
;

breakstatement returns [String value]
: 'break'  {System.out.println("break;");} {$value ="";}
;
continuestatement returns [String value]
: 'continue' {System.out.println("continue;");} {$value ="";}
;

dostatement returns [String value]
: 'do' statement 'until' expression {$value ="";}
;

whilestatement returns [String value]
: 'while' expression (statement) {$value ="";}
;

forstatement returns [String value]
: 'for' '(' statement expression ';' statement ')' statement {$value ="";}
;

switchstatement returns [String value]
: 'switch' (expression) '{' (('case'|'default') expression ':' (statement)*)* '}' {$value ="";} //BETA 
;

withstatement returns [String value]
: 'with'  expression  statement {$value ="";}
;

assignment returns [String value]
: {System.out.println("assignment ");} valuee=variable op=('='|':='|'+='|'-='|'*='|'/='|'|='|'&\\'| '^=') e=expression {$value = $valuee.text+$op.text+$e.text;}
;

variable returns [String value]
: {System.out.println("variable ");} (a=array{$value = $a.value;}|valuee=(WORD|OIVAR|GLOBALVAR){$value = $valuee.text;}) 
;

function returns [String value]
: WORD '(' (expression ((',') (expression)?)*)? ')' {$value ="";}
;

function2 returns [String value]
	:	OIVAR '(' (expression ((',') (expression)?)*)? ')' {$value ="";}
	;

array returns [String value]
  : {System.out.println("array ");} valuee=(WORD|OIVAR|GLOBALVAR) '[' expression ']' {$value = $valuee.text;}
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
