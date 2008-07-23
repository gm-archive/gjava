lexer grammar sgcl;
@header {
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
T48 : 'using' ;
T49 : '.' ;
T50 : ';' ;
T51 : 'partial' ;
T52 : 'class' ;
T53 : 'extends' ;
T54 : ',' ;
T55 : 'static' ;
T56 : 'final' ;
T57 : 'this' ;
T58 : '(' ;
T59 : ')' ;
T60 : 'super' ;
T61 : 'null' ;
T62 : 'continue' ;
T63 : 'break' ;
T64 : 'return' ;
T65 : 'if' ;
T66 : 'else' ;
T67 : 'while' ;
T68 : 'do' ;
T69 : 'for' ;
T70 : 'switch' ;
T71 : 'case' ;
T72 : ':' ;
T73 : 'default' ;
T74 : 'true' ;
T75 : 'false' ;
T76 : 'public' ;
T77 : 'protected' ;
T78 : 'private' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 136
WORD	:	ALPHA (ALPHA|DIGIT)*;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 137
TYPE	:	'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | (WORD ('<' TYPE  (',' TYPE)* '>')?);

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 139
INTEGER	:	'-'? (DIGIT)+ ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 140
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 141
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 142
STRING	:	('"' STRCONTENT* '"') | ('@' '"' (options{greedy=false;}: .*) '"');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 143
CHAR	:	'\'' CHRCONTENT* '\'';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 145
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 147
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 149
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 151
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 156
fragment LINE :	'\r' | '\n';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 157
STRCONTENT
	:	(~('"'|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 159
CHRCONTENT
	:	(~('\''|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 162
fragment DIGIT
	:	'0'..'9' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 165
fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
