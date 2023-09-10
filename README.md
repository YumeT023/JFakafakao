# JFakafakao

Java (mini) interpreter for [lita](https://github.com/fmaurica/lita) programming lang. built with [Antlr4](https://www.antlr.org)

# Example code

### factorial
```
ISA AMPIDIRINA: 5

BAIKO:  ``
    Forony mpanisa ho 1.
    Forony avoaka ho 1.
    Ataovy ``
        Raiso avoaka ka soloy avoaka * mpanisa.
        Raiso mpanisa ka soloy mpanisa + 1.
    '' raha mbola mpanisa <= LITA_ISA_NAMPIDIRINA.
''


ISA AVOAKA: avoaka
```

_output_: 120

### square
```
ISA AMPIDIRINA: 2

BAIKO:  ``
    Forony avy_roa_eny ho LITA_ISA_NAMPIDIRINA * LITA_ISA_NAMPIDIRINA.
''


ISA AVOAKA: avy_roa_eny

```

_output_: 4

# Grammar (BNF)

```
<programa> ::= 'ISA AMPIDIRINA:' <isa> <nl>+ 'BAIKO:' <baiko> <nl>+ 'ISA AVOAKA:' <rafitrisa>

# Statements

<baiko> ::= 'Raiso' <voambolana> 'ka soloy' <rafitrisa> '.'
          | 'Raha' <vina> 'dia' <baiko>. # TODO: ratszay <baiko> '.'
          | 'Ataovy' <baiko> 'raha mbola' <vina> '.'
          | '``' <baiko> (<nl>+ <baiko>)* <nl> '\'\''
          # TODO: 'tapaho'.

# Expressions

<rafitrisa> ::= <isa>
              | <voambolana>
              | (<rafitrisa>)
              | <rafitrisa> ('+' | '-') <rafitrisa>
              | <rafitrisa> ('*' | '/') <rafitrisa>
              ;

<vina> ::=  'marina'
          | 'diso'
          | <rafitrisa> ('>' | '>=' | '<' | '<=' | '=') <rafitrisa>
          | <vina> ('na' | 'sy') <vina>
          | '(' <vina> ')'
          ;

# Tokens

<isa> ::= '-'? \d+ ;
<voambolana> ::= [a-zA-Z][a-zA-Z\d_]* ;
<nl> ::= '\r'? '\n';
```
