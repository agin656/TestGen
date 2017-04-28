grammar TestGen;

s : t EOF;


t : t comment func | comment func;

comment : '/*' lines '*/' ;

lines : line lines | ;
line : '*'? '^' in '|' out '$';

in : 'in:' inparams | ;
out : 'out:' outparams;

inparams : params;

outparams : params;

params : param ',' params | param;
param : Word | String;

func : Scope? Word funcname '(' funcParams ')';
funcParams :  funcParam ',' funcParams | funcParam | ;
funcParam : Word Word;

funcname : Word;
Scope : 'public' | 'private';
Word : [a-zA-Z0-9]+ ;
String : '"' [a-zA-Z0-9 ]+ '"';

WS : [' ','\n','    ', '\r'] -> skip;
