grammar TestGen;

s : a t EOF;


a : 'class' className '{';

className : Word;

t : t comment func | comment func;

comment : '/*' lines '*/' ;

lines : line lines | ;
line : '*'? '^' in '|' out '$';

in : 'in:' inparams | ;
out : 'out:' outparams;

inparams : params;

outparams : params;

params : Word param ',' params | Word param;
param : Word | String;

func : Scope? Word funcname '(' funcParams ')' '{' AnyC '}';
funcParams :  funcParam ',' funcParams | funcParam | ;
funcParam : Word Word;

funcname : Word;
Scope : 'public' | 'private';
Word : [a-zA-Z0-9,'.']+ ;
String : '"' [a-zA-Z0-9,'#','<','>',';','.']+ '"';
AnyC : [a-zA-Z0-9,'#','<','>',';','+','-','_','.']+;
WS : [' ','\n','    ', '\r','/b'] -> skip;
