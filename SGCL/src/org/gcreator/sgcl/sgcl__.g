lexer grammar sgcl;
@header {
package org.gcreator.sgcl;
}

PLUS : '+' ;
MINUS : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
EQUAL : '=' ;
EQUAL2 : '==' ;
GTE : '>=' ;
GT : '>' ;
LTE : '<=' ;
LT : '<' ;
NEQUAL : '!=' ;
PLEQUAL : '+=' ;
MIEQUAL : '-=' ;
MUEQUAL : '*=' ;
DIEQUAL : '/=' ;
MOEQUAL : '%=' ;
OR : '||' ;
AND : '&&' ;
BLKBEG : '{' ;
BLKEND : '}' ;
CMTSL : '//' ;
CMTBEG : '/*' ;
CMTEND : '*/' ;
DCMTB : '/+' ;
DCMTE : '+/' ;
INC : '++' ;
DEC : '--' ;
T47 : 'partial' ;
T48 : 'class' ;
T49 : 'extends' ;
T50 : 'static' ;
T51 : 'final' ;
T52 : ';' ;
T53 : 'this' ;
T54 : '(' ;
T55 : ',' ;
T56 : ')' ;
T57 : '.' ;
T58 : 'null' ;
T59 : 'continue' ;
T60 : 'break' ;
T61 : 'return' ;
T62 : 'if' ;
T63 : 'else' ;
T64 : 'while' ;
T65 : 'for' ;
T66 : 'int' ;
T67 : 'float' ;
T68 : 'double' ;
T69 : 'boolean' ;
T70 : 'char' ;
T71 : 'string' ;
T72 : 'true' ;
T73 : 'false' ;
T74 : 'public' ;
T75 : 'protected' ;
T76 : 'private' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 88
WORD	:	ALPHA (ALPHA|DIGIT)*;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 90
INTEGER	:	'-'? (DIGIT)+ ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 91
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 92
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 93
STRING	:	'"' STRCONTENT* '"';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 94
CHAR	:	'\'' CHRCONTENT* '\'';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 96
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 98
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 100
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 102
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 107
fragment LINE :	'\r' | '\n';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 108
STRCONTENT
	:	(~('"'|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 110
CHRCONTENT
	:	(~('\''|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 113
fragment DIGIT
	:	'0'..'9' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 116
fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
