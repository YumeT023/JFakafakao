lexer grammar common;

NOMERIKA: '-'? ISA+ ;
ISA: [0-9] ;

TEBOKA: '.' ;
NL: '\r'? '\n';

ADD: '+' ;
SUB: '-' ;
MULT: '*' ;
DIV: '/' ;
GT: '>' ;
GTE: '>=' ;
LT: '<' ;
LTE: '<=' ;
EQ: '=' ;
NA: 'na' ;
SY: 'sy' ;

VOAMBOLANA: [a-zA-Z0-9_][a-zA-Z0-9_]* ;

WS: [ \t]+ -> skip ;
