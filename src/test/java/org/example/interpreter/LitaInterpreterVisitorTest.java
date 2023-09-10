package org.example.interpreter;

import java.io.IOException;
import java.util.Map;
import org.junit.Test;

import static org.example.TestUtils.FACTORIAL_TEMPLATE;
import static org.example.TestUtils.SQUARE_TEMPLATE;
import static org.example.TestUtils.injectCtx;
import static org.example.TestUtils.read;
import static org.junit.Assert.assertEquals;

public class LitaInterpreterVisitorTest {
  private final static Evaluator interpreter = new Evaluator();

  @Test
  public void square() throws IOException {
    var template = read(SQUARE_TEMPLATE);
    var case1 = injectCtx(template, Map.of("INPUT", 2));
    var case2 = injectCtx(template, Map.of("INPUT", 6));
    assertEquals(4, interpreter.eval(case1).output());
    assertEquals(36, interpreter.eval(case2).output());
  }

  @Test
  public void factorial() throws IOException {
    var template = read(FACTORIAL_TEMPLATE);
    var case1 = injectCtx(template, Map.of("INPUT", 5));
    var case2 = injectCtx(template, Map.of("INPUT", 10));
    assertEquals(120, interpreter.eval(case1).output());
    assertEquals(3_628_800, interpreter.eval(case2).output());
  }
}
