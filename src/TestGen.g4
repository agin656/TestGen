grammar TestGen;

s : t EOF;


t : t t | comment func;

comment : '/*' lines '*/' ;

lines : line lines | ;
line : '*'? '^' in '|' out '$';

in : 'in:' params | ;
out : 'out:' params;

params : param ',' params | param;
param : Word | String;

func : Scope? Word Funcname '(' funcParams ')';
funcParams :  funcParam ',' funcParams | funcParam | ;
funcParam : Word Word;

Funcname : Word;
Scope : 'public' | 'private';
Word : [a-zA-Z0-9]+ ;
String : '"' [a-zA-Z0-9 ]+ '"';

WS : [' ','\n','    ', '\r'] -> skip;
