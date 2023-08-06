grammar Lita;
import common;

programa:   isa_ampidirina NL+ marika_baiko NL+ isa_avoaka
        ;

marika_baiko: 'BAIKO:' baiko+;
isa_ampidirina: 'ISA AMPIDIRINA:' NOMERIKA ;
isa_avoaka: 'ISA AVOAKA:' rafitrisa ;

baiko:  'Raiso' VOAMBOLANA 'ka soloy' rafitrisa TEBOKA # Assign
     |  'Forony' VOAMBOLANA 'ho' rafitrisa TEBOKA # Declare
     |  'Ataovy' baiko 'raha mbola' vina TEBOKA # DoWhileStmt
     |  'tapaho' TEBOKA # Break
     |  '``' NL baiko (NL+ baiko)* NL '\'\'' # Placeholder
     ;

rafitrisa:  NOMERIKA # Numeric
         |  VOAMBOLANA # Ident
         | '(' rafitrisa ')' # Parens
         | rafitrisa op=( '+' | '-' ) rafitrisa # AddSub
         | rafitrisa op=( '*' | '/' ) rafitrisa # MultDiv
         ;

vina:   'marina'
    |   'diso'
    |   rafitrisa ('<' '='? | '>' '='? ) rafitrisa
    |   rafitrisa '=' rafitrisa
    |   '(' vina ')'
    |   vina 'na' vina
    |   vina 'sy' vina
    ;
