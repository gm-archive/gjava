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
: { pc.returncode ="";} ((s=statement{pc.returncode += "\n " + $s.value;})*)	
;

statement returns [String value]
: {$value = "";} (b=bstatement{$value += $b.value;}|v=varstatement{$value += $v.value+";";}|r=returnstatement{$value += $r.value+";";}|e=exitstatement{$value += $e.value+";";}|ifs=ifstatement{$value += $ifs.value;}|rep=repeatstatement{$value += $rep.value;}|dos=dostatement{$value += $dos.value;}|wh=whilestatement{$value += $wh.value;}|con=continuestatement{$value += $con.value+";";}|br=breakstatement{$value += $br.value+";";}|fors=forstatement{$value += $fors.value;}|sw=switchstatement{$value += $sw.value;}|wit=withstatement{$value += $wit.value;}|fun2=function2{$value += $fun2.value+";";}|ass=assignment{$value += $ass.value+";";}|fun=function{$value += $fun.value+";";}) (';'{System.out.println(";");})* 
;


field returns [String value] //their are 2 finals in this for a reason ;)
: ('public' {$value = "public";}|('private'|'var') {$value = "private";})? ('final'{$value += " final";})? ('static'{$value += " static";})? ('final'{$value += " final";})? (v=varstatement) {$value = pc.fieldstatement($value,$v.text);}
;

method returns [String value] @init {String s = "";}
: ('public'{$value = "public";}|'private'{$value = "private";})? ('final'{$value += " final";})? ('static'{$value += " static";})? ('final'{$value += " final";})? name=WORD '(' (e=WORD {s = $e.text;} ((',') (e=WORD{s += ", "+$e.text;})?)*)? ')' b=bstatement {$value = pc.methodstatement($value,"",$name.text,$b.value,s);}
;

//statement surrounded by brackets
bstatement returns [String value]
: {$value = "";} (LBRAC|'begin') (s=statement{$value +=$s.value;})* (RBRAC|'end') {$value=pc.bstatement($value);}
;

varstatement returns [String value] @init {String s = "";}
: 'var' (vari=variable{s = ""+$vari.value;}| ass=assignment{s = ""+$ass.value;})  (',' (varii=variable{s += ", "+$varii.value;}| ass=assignment{s += ","+ $ass.value;}) )*   {$value=pc.varstatement("var",s);} 
;

returnstatement returns [String value]
: 'return' (e=expression{$value=$e.text;}) {$value =pc.returnstatement($value);}
;

exitstatement returns [String value]
:'exit'  {$value ="";}
;

ifstatement returns [String value]
:  'if' e=expression ('then')? (s=statement) (el=elsestatement{$value +=$el.value;})*  {$value =pc.ifstatement($e.value,$s.value,$value);}
;

elsestatement returns [String value]
: ('else'|('elsif' e=expression {$value ="if "+$e.text;})) (s=statement {$value +=" "+$s.text;}) {$value =pc.elsestatement($value);}
;

//todo
expression returns [String value] @init {String a = "";}
:  (p=pexpression{$value =$p.value;}|r=relationalExpression{$value =$r.value;}|n=notexpression{$value =$n.value;}) (aa=aexpression {$value+= " "+ $aa.value;})* ((an=andexpression{$value +=" "+$an.value;}|orr=orexpression{$value +=" "+$orr.value;}|x=xorexpression{$value +=" "+$x.value;}) (e=expression{$value =" "+$e.value;}))* {$value =pc.expression($value);}
;

notexpression returns [String value]
: ('not'|'!') e=expression {$value =pc.notexpression($e.value);}
;

aexpression returns [String value]
: a=('+'|'-'|NEGINTEGER|'*'|'/'|'|'|'&'|'^'|'<<'|'>>'|'div'|'mod') (expression)? {$value=$a.text;}
; //(NUMBER|HEXNUMBER|STRING|variable)

value returns [String value] : a=(NUMBER|HEXNUMBER|STRING|variable) {$value=$a.text;}
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

relationalExpression returns [String value]
  :
  (f=function{$value = $f.value;}|h=HEXNUMBER{$value = $h.text;}|s=STRING{$value = $s.text;}|n=NUMBER{$value = $n.text;}|v=variable{$value = $v.value;}|d=DECIMAL{$value = $d.text;}|w=WORD{$value = $w.text;}) ( op=('!'|EQUALS|EQUALS2|':='|NOT_EQUALS|GT|GTE|LT|LTE) (function|HEXNUMBER|STRING|NUMBER|variable|WORD))* {}
  ;
 
repeatstatement returns [String value]
: 'repeat' e=expression (s=statement) {$value =pc.repeatstatement($e.value,$s.value);}
;

breakstatement returns [String value]
: 'break'  {System.out.println("break;");} {$value =pc.breakstatement();}
;
continuestatement returns [String value]
: 'continue' {System.out.println("continue;");} {$value =pc.continuestatement();}
;

dostatement returns [String value]
: 'do' s=statement 'until' e=expression {$value =pc.dostatement($s.value,$e.value);}
;

whilestatement returns [String value]
: 'while' e=expression (s=statement) {$value =pc.whilestatement($e.value,$s.value);}
;

forstatement returns [String value]
: 'for' '(' s1=statement e=expression ';' s2=statement ')' s=statement {$value =pc.forstatement($s1.value,$e.value,$s2.value,$s.value);}
;

switchstatement returns [String value]
: 'switch' (expression) '{' (('case'|'default') expression ':' (statement)*)* '}' {$value ="";} //BETA 
;

withstatement returns [String value]
: 'with'  e=expression  s=statement {$value =pc.withstatement($e.value,$s.value);}
;

assignment returns [String value]
: {System.out.println("assignment ");} valuee=variable op=('='|':='|'+='|'-='|'*='|'/='|'|='|'&\\'| '^=') e=expression {$value = pc.assignmentstatement($valuee.text,$op.text,$e.text);}
;

variable returns [String value]
: {System.out.println("variable ");} (a=array{$value = $a.value;}|valuee=(WORD|OIVAR|GLOBALVAR){$value = $valuee.text;}) 
;

function returns [String value]
: n=WORD '(' (e=expression {$value = $e.text;} ((',') (e=expression{$value += ", "+$e.text;})?)*)? ')' {$value =pc.functionstatement($n.text, $value);}
;

function2 returns [String value]
	:	n=OIVAR '(' (e=expression {$value = $e.text;}((',') (e=expression{$value += ", "+$e.text;})?)*)? ')' {$value =pc.otherclassfunctionstatement($n.text, $value);}
	;

array returns [String value]
  : {System.out.println("array");} valuee=(WORD|OIVAR|GLOBALVAR) '[' e=expression ']' {$value = pc.array($valuee.text,$e.text);}
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
