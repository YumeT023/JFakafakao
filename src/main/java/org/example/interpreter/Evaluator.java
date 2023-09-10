package org.example.interpreter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.parser.LitaLexer;
import org.example.parser.LitaParser;

public class Evaluator {
  private static final LitaInterpreterVisitor visitor = new LitaInterpreterVisitor();

  private static LitaParser createParser(String code) {
    var lexer = new LitaLexer(CharStreams.fromString(code));
    var tokenStream = new CommonTokenStream(lexer);
    return new LitaParser(tokenStream);
  }

  public EvaluatorResult eval(String code) {
    var parser = createParser(code);
    var output = visitor.visit(parser.programa());
    return new EvaluatorResult(output, visitor.env);
  }
}
