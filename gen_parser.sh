# ensure antlr4 is in your __ENV__
antlr docs/grammar/Lita.g4  -o src/main/java/org/example/parser -no-listener -visitor -package org.example.parser
