lexer grammar common;

NOMERIKA: '-'? ISA+ ;

VOAMBOLANA: [a-zA-Z0-9_][a-zA-Z0-9_]* ;
ISA: [0-9] ;

TEBOKA: '.' ;
NL: '\r'? '\n';

WS: [ \t]+ -> skip ;
