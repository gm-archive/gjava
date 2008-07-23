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
T66 : 'switch' ;
T67 : 'case' ;
T68 : ':' ;
T69 : 'default' ;
T70 : 'int' ;
T71 : 'float' ;
T72 : 'double' ;
T73 : 'boolean' ;
T74 : 'char' ;
T75 : 'string' ;
T76 : 'true' ;
T77 : 'false' ;
T78 : 'public' ;
T79 : 'protected' ;
T80 : 'private' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 98
WORD	:	ALPHA (ALPHA|DIGIT)*;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 100
INTEGER	:	'-'? (DIGIT)+ ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 101
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 102
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 103
STRING	:	'"' STRCONTENT* '"';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 104
CHAR	:	'\'' CHRCONTENT* '\'';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 106
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 108
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 110
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 112
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 117
fragment LINE :	'\r' | '\n';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 118
STRCONTENT
	:	(~('"'|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 120
CHRCONTENT
	:	(~('\''|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 123
fragment DIGIT
	:	'0'..'9' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 126
fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
