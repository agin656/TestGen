grammar TestGen;

s : a ts '}' EOF;


a : 'class' className '{';

className : Word;

ts : t ts | func1 ts |  ;
t : comment func;

comment : '/*' lines '*/' ;
comment1 : '/*' .*? '*/';
func1 : Scope? Word .*? ;
lines : line lines | ;
line : '*'? '^' in '|' out '$';

in : 'in:' inparams ;
out : 'out:' outparams;

inparams : params;

outparams : params;

params : param ',' params | param;
param : Num  |  String | Word ;

func : Scope? Word funcname '(' funcParams body;
funcParams :  funcParam ',' funcParams | funcParam | ;
funcParam : Word funcParam | Num funcParam |  String funcParam | ;
body : '){' .*? '}';
//anyc : 'return' AnyC | AnyC ;
funcname : Word;
WS : [ \n\r\t;] -> skip;
//stringa : String'"';
Num : [0-9];
Scope : 'public' | 'private';
Word : [a-zA-Z0-9,.]+ ;
String :'"' Word '"' ;
//any : AnyC any | ;


A : '|';
