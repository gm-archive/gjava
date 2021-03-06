/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
grammar sgcl;

options {
backtrack = true;
}

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
	DCMTB	= '/+';
	DCMTE	= '+/';
	INC	= '++';
	DEC	= '--';
}

@header{
/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.sgcl;
}

@lexer::header{
/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.sgcl;
}

doc	:	extension*
		classdef;
		
extension
	:	'using' WORD ('.' WORD)* ';';

classdef:	('partial')? 'class' WORD ('extends' type)?
		BLKBEG
		clsext*
		BLKEND;

clsext	:	fieldas | funct | constructor;
fieldas	:	privacy 'static'? 'final'? type WORD (EQUAL value)? ';';
constructor
	:	privacy 'this' '(' (type WORD (',' type WORD)*)? ')'
		BLKBEG
		(('super'|'this') '(' (value (',' value)*)? ')' ';')?
		statement*
		BLKEND;
funct	:	privacy 'static'? (type|'void')? WORD '(' (type WORD (',' type WORD)*)? ')'
		BLKBEG
		statement*
		BLKEND;
declare	:	('final')? type WORD ((EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL) value)?
		| WORD (EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL) value;
//value	:	'this' | (((('(' type ')')? (('(' value ')')|constant|((('this'|WORD) '.')? WORD))
//		(((EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL|EQUAL2|GTE|GT|LTE|LT|NEQUAL|PLUS|MINUS|MULT|DIV|MOD|AND|OR) value)|INC|DEC)?)));
value	:	('(' type ')')*
		((('this'|'super'|('('value')')) '.')? (WORD '.')* WORD '(' (value (',' value)*)? ')'
		((EQUAL2|GTE|GT|LTE|LT|NEQUAL|PLUS|MINUS|MULT|DIV|MOD|AND|OR) value)?)
		| (((('this'|'('value')'|constant|WORD '.')? ( WORD '.')* (constant|WORD)
			(((EQUAL|PLEQUAL|MIEQUAL|MUEQUAL|DIEQUAL|MOEQUAL|EQUAL2|GTE|GT|LTE|LT|NEQUAL|PLUS|MINUS|MULT|DIV|MOD|AND|OR) value)|INC|DEC)?)));
constant
	:	INTEGER | DOUBLE | FLOAT | STRING | CHAR | boolval | 'null';
fnccall	:	(('this'|'super'|('(' value ')')|WORD) '.')? WORD '(' (value (',' value)*)? ')';
statement
	:	((declare | returnstmt | incrstmt | dowhile | fnccall | 'continue' | 'break') ';')
	| ifstmt | whilestmt | forstmt | switchstmt;
incrstmt:	(('this'|WORD) '.')? WORD (INC|DEC);
returnstmt
	:	'return' value;
ifstmt	:	'if' '(' value ')' (statement|(BLKBEG statement* BLKEND))
		('else' (statement|(BLKBEG statement* BLKEND)))?;
whilestmt
	:	'while' '(' value ')' (statement|(BLKBEG statement* BLKEND));
dowhile	:	'do' (statement|(BLKBEG statement* BLKEND)) 'while' '(' value ')';
forstmt	:	'for' '(' declare? ';' value ';' (declare|incrstmt)? ')' (statement|(BLKBEG statement* BLKEND));
switchstmt
	:	'switch' '(' WORD ')'
		BLKBEG
		casestmt*
		defaultstmt?
		BLKEND;
casestmt:	'case' constant ':' statement*;
defaultstmt
	:	'default' ':' statement*;
//May seem redundant. But it is actually useful
//type	:	WORD;

boolval	:	'true' | 'false';

privacy	:	'public' | 'protected' | 'private';

type	:	TYPE | WORD;
TYPE	:	'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | (WORD '<' WORD (',' WORD)* '>'); //No ? to prevent unacessible WORDs
WORD	:	ALPHA (ALPHA|DIGIT)*;

INTEGER	:	'-'? (DIGIT)+ ;
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
STRING	:	('"' STRCONTENT* '"') | ('@' '"' (options{greedy=false;}: .*) '"');
CHAR	:	'\'' CHRCONTENT* '\'';

WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
fragment LINE :	'\r' | '\n';
STRCONTENT
	:	(~('"'|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';
CHRCONTENT
	:	(~('\''|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';

fragment DIGIT
	:	'0'..'9' ;

fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
