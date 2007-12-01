grammar parsefunctions;

options {
k = 3;
backtrack = true;
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


//OIVAR : WORD '.' WORD ; /* Other instance variable */

//DECIMAL : NUMBER '.' NUMBER;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+  { $channel = HIDDEN; } ; /* Ignore all spaces and newline characters */

fragment DIGIT : '0'..'9' ;

WORD
: LETTER ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;

LETTER : ('a'..'z'|'A'..'Z')
;

DOT
: '.' { $channel=HIDDEN; }
	;


IGNORE	:	';'|','|'?'|':'|'['|']' { $channel=HIDDEN; }
	;
	
COMMENT
  : COMMENT1 (~('\n'|'\r'))*
    { $channel=HIDDEN; } /* '//' comment ending with a newline */
  ;

// multiple-line comments
//ML_COMMENT
 //   :   '/*' (options {greedy=false;} : .)* '*/' 
 //   ;
    
    ARGS
    :   '(' (options {greedy=false;} : .)* ')' 
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
    
    
    /*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/

program	

: (mm=mlcomment)? 'public' 'class' p=WORD {String catname = ""+$p.text;} {System.out.println("clas = new ApiClass(\""+$p.text+"\");");} '{' (m=method{System.out.println("clas.add(new ApiFunction(\""+$m.result+","+($mm.result).replaceAll("\\*","")+");");}|field)* '}' {System.out.println("classes.add(clas);");}
;

block	:	'{' (~('{'|'}')|block)* '}'
	;
	
	mlcomment   returns [String result] @init{String pp="";}: '/*' (p=~('@'){pp= pp+" "+ $p.text;})* (~('*/'))* '*/' {$result=pp;}
	;
	
	field returns [String result]: (mm=mlcomment)* ('public'|'private') ('static')* arg=WORD name=WORD ('=' (WORD)* {$result=$name.text+"\");\n keyworddoc.add(\"<b>"+$arg.text+"</b> "+$name.text+" <br><br>"+($mm.result).replaceAll("\\*","")+"\"";})*(';')*
	;

method returns [String result]
: (mm=mlcomment)* 'public' ('static')* arg=WORD name=WORD args=ARGS {$result=$name.text+" "+$args.text+"\",\"<b>"+$arg.text+"</b> "+$name.text+" <i>"+$args.text+"</i><br><br>"+($mm.result).replaceAll("\\*","")+"\"));";} block 
	;
