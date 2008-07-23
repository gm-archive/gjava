grammar sgcl;

tokens {
	PLUS 	= '+' ;
	MINUS	= '-' ;
	MULT	= '*' ;
	DIV	= '/' ;
	MOD	= '%' ;
	EQUAL	= '=' ;
	EQUAL2	= '==';
	GTE	= '>=';
	GT	= '>';
	LTE	= '<=';
	LT	= '<';
	NEQUAL	= '!=';
	PLEQUAL	= '+=';
	MIEQUAL	= '-=';
	MUEQUAL	= '*=';
	DIEQUAL	= '/=';
	MOEQUAL	= '%=';
	OR	= '||';
	AND	= '&&';
	BLKBEG	= '{';
	BLKEND	= '}';
	CMTSL	= '//';
	CMTBEG	= '/*';
	CMTEND	= '*/';
	INC	= '++';
	DEC	= '--';
}

@header{
package org.gcreator.sgcl;
}

@lexer::header{
package org.gcreator.sgcl;
}

classdef:	('partial')? 'class' WORD ('extends' WORD)?
		BLKBEG
		clsext*
		BLKEND;

clsext	:	fieldas | funct | constructor;
fieldas	:	privacy 'static'? declare;
constructor
	:	privacy 'this' '(' (type WORD (',' type WORD)*)? ')'
		BLKBEG
		statement*
		BLKEND;
funct	:	privacy 'static'? type WORD '(' (type WORD (',' type WORD)*)? ')'
		BLKBEG
		statement*
		BLKEND;
declare	:	(('final')? type)? WORD ((EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL) value)? ';';
value	:	'this' | (((('(' type ')')? (('(' value ')')|constant|((('this'|WORD) '.')? WORD))
		(((EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL|EQUAL2|GTE|GT|LTE|LT|NEQUAL|PLUS|MINUS|MULT|DIV|MOD|AND|OR) value)|INC|DEC)?)));
constant
	:	INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval;
statement
	:	declare | returnstmt;
returnstmt
	:	'return' value ';';
type	:	'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | WORD;
//May seem redundant. But it is actually useful
//type	:	WORD;

boolval	:	'true' | 'false';

privacy	:	'public' | 'protected' | 'private';

WORD	:	ALPHA (ALPHA|DIGIT)*;

INTEGER	:	'-'? (DIGIT)+ ;
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
STRING	:	'"' STRCONTENT* '"';
CHAR	:	'\'' CHRCONTENT* '\'';

WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
fragment LINE :	'\r' | '\n';
STRCONTENT
	:	(~('"'|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';
CHRCONTENT
	:	(~('\''|'\\'))|'\\\\'|'\\"'|'\\n'|'\\t';

fragment DIGIT
	:	'0'..'9' ;

fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
