lexer grammar common;

NOMERIKA: '-'? ISA+ ;

VOAMBOLANA: [a-zA-Z0-9_][a-zA-Z0-9_]* ;
ISA: [0-9] ;

TEBOKA: '.' ;
NL: '\r'? '\n';

ADD: '+' ;
SUB: '-' ;
MULT: '*' ;
DIV: '/' ;

WS: [ \t]+ -> skip ;
