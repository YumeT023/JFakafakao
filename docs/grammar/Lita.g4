grammar Lita;
import common;

programa:   'ISA AMPIDIRINA:' NOMERIKA NL+
            'BAIKO:' NL* baiko+ NL+
            'ISA AVOAKA:' NL* rafitrisa
        ;

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
    |   rafitrisa ('<' '='? | '='? '>' ) rafitrisa
    |   rafitrisa '=' rafitrisa
    |   '(' vina ')'
    |   vina 'na' vina
    |   vina 'sy' vina
    ;
