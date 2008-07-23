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
T57 : 'super' ;
T58 : '.' ;
T59 : 'null' ;
T60 : 'continue' ;
T61 : 'break' ;
T62 : 'return' ;
T63 : 'if' ;
T64 : 'else' ;
T65 : 'while' ;
T66 : 'do' ;
T67 : 'for' ;
T68 : 'switch' ;
T69 : 'case' ;
T70 : ':' ;
T71 : 'default' ;
T72 : 'int' ;
T73 : 'float' ;
T74 : 'double' ;
T75 : 'boolean' ;
T76 : 'char' ;
T77 : 'string' ;
T78 : 'true' ;
T79 : 'false' ;
T80 : 'public' ;
T81 : 'protected' ;
T82 : 'private' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 105
WORD	:	ALPHA (ALPHA|DIGIT)*;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 107
INTEGER	:	'-'? (DIGIT)+ ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 108
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 109
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 110
STRING	:	'"' STRCONTENT* '"';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 111
CHAR	:	'\'' CHRCONTENT* '\'';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 113
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 115
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 117
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 119
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 124
fragment LINE :	'\r' | '\n';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 125
STRCONTENT
	:	(~('"'|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 127
CHRCONTENT
	:	(~('\''|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 130
fragment DIGIT
	:	'0'..'9' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 133
fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
