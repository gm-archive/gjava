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
T54 : 'static' ;
T55 : 'final' ;
T56 : 'this' ;
T57 : '(' ;
T58 : ',' ;
T59 : ')' ;
T60 : 'super' ;
T61 : 'void' ;
T62 : 'null' ;
T63 : 'continue' ;
T64 : 'break' ;
T65 : 'return' ;
T66 : 'if' ;
T67 : 'else' ;
T68 : 'while' ;
T69 : 'do' ;
T70 : 'for' ;
T71 : 'switch' ;
T72 : 'case' ;
T73 : ':' ;
T74 : 'default' ;
T75 : 'true' ;
T76 : 'false' ;
T77 : 'public' ;
T78 : 'protected' ;
T79 : 'private' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 137
TYPE	:	'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | (WORD '<' WORD (',' WORD)* '>'); //No ? to prevent unacessible WORDs
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 138
WORD	:	ALPHA (ALPHA|DIGIT)*;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 140
INTEGER	:	'-'? (DIGIT)+ ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 141
DOUBLE 	:	'-'? (DIGIT)* '.' (DIGIT)+;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 142
FLOAT	:	(INTEGER|DOUBLE) ('f'|'F');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 143
STRING	:	('"' STRCONTENT* '"') | ('@' '"' (options{greedy=false;}: .*) '"');
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 144
CHAR	:	'\'' CHRCONTENT* '\'';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 146
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 148
SLCOMMENT
	:	CMTSL (~LINE)* { $channel = HIDDEN; };
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 150
MLCOMMENT
	:	CMTBEG (options{greedy=false;}: .*) CMTEND { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 152
DCOMMENT:	DCMTB
		(options{greedy=false;}: .*)
		(DCOMMENT
		(options{greedy=false;}: .*))*
		DCMTE { $channel = HIDDEN; } ;
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 157
fragment LINE :	'\r' | '\n';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 158
STRCONTENT
	:	(~('"'|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';
// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 160
CHRCONTENT
	:	(~('\''|'\\'|'\n'))|'\\\\'|'\\"'|'\\n'|'\\t';

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 163
fragment DIGIT
	:	'0'..'9' ;

// $ANTLR src "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g" 166
fragment ALPHA
	:	'a'..'z'|'A'..'Z'|'_';
