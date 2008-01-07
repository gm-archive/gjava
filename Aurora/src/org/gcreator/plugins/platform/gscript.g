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
public PlatformCore pc = new PlatformCore();

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

classes
: {pc.returncode ="";} ((f=method{pc.returncode += "\n " + $f.value;}|m=field{pc.returncode += "\n " + $m.value;}) (';'{System.out.println(";");})*)*
;

code // never put: returns after this! This is for script and parameter code
: { pc.returncode ="";} ((s=statement{pc.returncode += "\n " + $s.value;})*)	{System.out.println(""+pc.returncode);}
;

statement returns [String value]
: {$value = "";}  (b=bstatement{$value += $b.value;}|v=varstatement{$value += $v.value+";";}|r=returnstatement{$value += $r.value;}|e=exitstatement{$value += $e.value;}|ifs=ifstatement{$value += $ifs.value;}|rep=repeatstatement{$value += $rep.value;}|dos=dostatement{$value += $dos.value;}|wh=whilestatement{$value += $wh.value;}|con=continuestatement{$value += $con.value+";";}|br=breakstatement{$value += $br.value+";";}|fors=forstatement{$value += $fors.value;}|sw=switchstatement{$value += $sw.value;}|wit=withstatement{$value += $wit.value;}|fun2=function2{$value += $fun2.value+";";}|ass=assignment{$value += $ass.value+";";}|fun=function{$value += $fun.value+";";}|';') (';')* 	
;

field returns [String value] //their are 2 finals in this for a reason ;)
: ('public' {$value = "public";}|('private'|'var') {$value = "private";})? ('final'{$value += " final";})? ('static'{$value += " static";})? ('final'{$value += " final";})? (v=varstatement) {$value = pc.fieldstatement($value,$v.text);}
;

method returns [String value] @init {String s = "";}
: ('public'{$value = "public";}|'private'{$value = "private";})? ('final'{$value += " final";})? ('static'{$value += " static";})? ('final'{$value += " final";})? name=WORD '(' (e=WORD {s = $e.text;} ((',') (e=WORD{s += ", "+$e.text;})?)*)? ')' b=bstatement {$value = pc.methodstatement($value,"",$name.text,$b.value,s);}
;

//statement surrounded by brackets
bstatement returns [String value]
: {$value = "";} (LBRAC|'begin') (s=statement{$value +=$s.value+"\n";})* (RBRAC|'end') {$value=pc.bstatement($value);}
;

varstatement returns [String value] @init {String s = "";}
: (w='var'|w=WORD|w='globalvar') (vari=variable{s = ""+$vari.value;}| ass=assignment{s = ""+$ass.value;})  (',' (varii=variable{s += ", "+$varii.value;}| ass=assignment{s += ","+ $ass.value;}) )*   {$value=pc.varstatement($w.text,s);} 
;

returnstatement returns [String value]
: 'return' (e=expression{$value=$e.text;}) {$value =pc.returnstatement($value);}
;

exitstatement returns [String value]
:'exit'  {$value =pc.exitstatement();}
;

ifstatement returns [String value]
:  {$value = "";}'if' e=expression ('then')? (s=statement) (el=elsestatement{$value +=$el.value;})*  {$value =pc.ifstatement($e.value,$s.value,$value);}
;

elsestatement returns [String value]
: {$value ="";} ('else'|('elsif' e=expression {$value ="if "+$e.value;})) (s=statement {$value +=" "+$s.value;}) {$value =pc.elsestatement($value);}
;

//todo
expression returns [String value] @init {String a = "";}
:  (neg=negate{$value = $neg.value;}|p=pexpression{$value =$p.value;}|r=relationalExpression{$value =$r.value;}|n=notexpression{$value =$n.value;}) (aa=aexpression {$value+= " "+ $aa.value;})* ((an=andexpression{$value +=" "+$an.value;}|orr=orexpression{$value +=" "+$orr.value;}|x=xorexpression{$value +=" "+$x.value;}) (e=expression{$value +=" ("+$e.value+")";}))* {$value =pc.expression($value);}
;

notexpression returns [String value]
: ('not'|'!') e=expression {$value =pc.notexpression($e.value);}
;

// this ia an experssion that deals with operators such as +
aexpression returns [String value]
: a=('+'|'-'|'*'|'/'|'|'|'&'|'^'|'<<'|'>>'|'div'|'mod') (e=expression) {$value =pc.aexpression($a.text,$e.value);}
; //(NUMBER|HEXNUMBER|STRING|variable)

value returns [String value] : a=(NUMBER|HEXNUMBER|STRING|variable) {$value=$a.text;}
;

negate returns [String value]	:	('-'{$value="negate(";}|'~'{$value="bnegate(";}) e=expression {$value += $e.value+")";}
	;

//expression surrounded with parenthesis
pexpression returns [String value]
: LPAREN e=expression RPAREN {$value =pc.pexpression($e.value);}
;

andexpression returns [String value]
: a=('&&'|'and') {$value =pc.andexpression();}
;

orexpression returns [String value]
: o=('||'|'or') {$value =pc.orexpression();}
;

xorexpression returns [String value]
: x=('^^'|'xor') {$value =pc.xorexpression();}
;

relationalExpression returns [String value] @init {String a = "";}
  :
  (f=function{$value = $f.value;}|h=HEXNUMBER{$value = "(new String(\""+$h.text+"\"))";}|s=STRING{$value = "(new String(\""+$s.text.substring(1, $s.text.length()-1)+"\"))";}|'-' n=NUMBER{$value = "(new Integer("+$n.text+"))";} |n=NUMBER{$value = "(new Integer("+$n.text+"))";}|v=variable{$value = $v.value;}|d=DECIMAL{$value = "(new Double("+$d.text+"))";}|w=WORD{$value = $w.text;}) ( op=('!'|EQUALS|EQUALS2|':='|NOT_EQUALS|GT|GTE|LT|LTE) (f=function{a = $f.value;}|h=HEXNUMBER{a = $h.text;}|s=STRING{a = "(new String("+$s.text+"))";}|n=NUMBER{a = "(new Integer("+$n.text+"))";}|v=variable{a = $v.value;}|d=DECIMAL{a = "(new Double("+$d.text+"))";}|w=WORD{a = $w.text;}) {$value =pc.relationalExpression($value,$op.text,a);})? 
  ;
 
repeatstatement returns [String value]
: 'repeat' (e=expression)? (s=statement) (';')*  {$value =pc.repeatstatement($e.value,$s.value);}
;

breakstatement returns [String value]
: 'break'  {$value =pc.breakstatement();}
;
continuestatement returns [String value]
: 'continue' {$value =pc.continuestatement();}
;

dostatement returns [String value]
: 'do' s=statement 'until' e=expression {$value =pc.dostatement($s.value,$e.value);}
;

whilestatement returns [String value]
: 'while' e=expression (s=statement) {$value =pc.whilestatement($e.value,$s.value);}
;

forstatement returns [String value]
: 'for' '(' s1=statement e=expression (';')? s2=statement ')' s=statement {$value =pc.forstatement($s1.value,$e.value,$s2.value,$s.value);}
;

switchstatement returns [String value]
: 'switch' (expression) '{' (('case' expression|'default')  ':' (statement)*)* '}' {$value ="";} //BETA 
;

withstatement returns [String value]
: 'with'  e=expression  s=statement {$value =pc.withstatement($e.value,$s.value);}
;

assignment returns [String value]
:  valuee=variable op=('='|':='|'+='|'-='|'*='|'/='|'|='|'&='| '^=') e=expression {$value = pc.assignmentstatement($valuee.text,$op.text,$e.value);}
;

variable returns [String value]
:  (a=array{$value = $a.value;}|valuee=(WORD|OIVAR|GLOBALVAR) {$value = pc.variable($valuee.text);}|'(' (NUMBER|variable|function) ')' '.' WORD) ('.' (array|(WORD|OIVAR|GLOBALVAR)) )*
;

function returns [String value]
: n=WORD '(' (e=expression {$value = $e.text;} ((',') (e=expression{$value += ", "+$e.text;})?)*)? ')' {$value =pc.functionstatement($n.text, $value);}
;

function2 returns [String value]
	:	n=OIVAR '(' (e=expression {$value = $e.text;}((',') (e=expression{$value += ", "+$e.text;})?)*)? ')' {$value =pc.otherclassfunctionstatement($n.text, $value);}
	;

array returns [String value]
  : valuee=(WORD|OIVAR|GLOBALVAR) '[' e=expression (',' e1=expression{$value = $e.value + ","+$e1.value;})? ']' {$value = pc.array($valuee.text,$e.text);}
;

//definestatement: '#define' WORD //used for testing scripts
//;



/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/


/*NEGINTEGER
: ('-') NUMBER
;*/

NUMBER : (DIGIT)+ ;

HEXNUMBER
: '$' (DIGIT|LETTER)*
;

GLOBALVAR
: 'global' '.' WORD;

OIVAR : WORD '.' WORD ; /* Other instance variable */

DECIMAL : NUMBER '.' NUMBER;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' |'#define' WORD )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

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
