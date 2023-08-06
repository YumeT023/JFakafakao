grammar Lita;
import common;

programa:   isa_ampidirina NL+ marika_baiko NL+ isa_avoaka
        ;

marika_baiko: 'BAIKO:' baiko+;
isa_ampidirina: 'ISA AMPIDIRINA:' NOMERIKA ;
isa_avoaka: 'ISA AVOAKA:' rafitrisa ;

baiko:  'Raiso' VOAMBOLANA 'ka soloy' rafitrisa TEBOKA
     |  'Forony' VOAMBOLANA 'ho' rafitrisa TEBOKA
     |  'Ataovy' baiko 'raha mbola' vina TEBOKA
     |  'tapaho' TEBOKA
     |  '``' baiko (TEBOKA baiko)* '\'\''
     ;

rafitrisa:  NOMERIKA
         |  VOAMBOLANA
         | '(' rafitrisa ')'
         | rafitrisa ( '+' | '-' ) rafitrisa
         | rafitrisa ( '*' | '/' ) rafitrisa
         ;

vina:   'marina'
    |   'diso'
    |   rafitrisa ('<' '='? | '>' '='? ) rafitrisa
    |   rafitrisa '=' rafitrisa
    |   '(' vina ')'
    |   vina 'na' vina
    |   vina 'sy' vina
    ;
